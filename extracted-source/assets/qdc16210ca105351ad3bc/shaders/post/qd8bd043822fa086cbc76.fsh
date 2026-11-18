#version 330

// GaussianBlur's passes over the frame (2026-10-30). Pass.z picks the pass.
//
// 0, the Gaussian: one direction of a separable Gaussian, Pass.xy one texel along it (uv), sigma
// Kernel.x texels, cut at Kernel.y texels (3 sigma). Each pair of neighbouring taps is read as one
// linear fetch placed at their weighted centre with their summed weight, so a kernel of r texels
// costs about r + 1 fetches and is still exactly the Gaussian.
//
// 1, the shrink: the frame made Kernel.z times smaller each way, every texel the plain average of
// its Kernel.z x Kernel.z block (one bilinear fetch at the centre of each 2 x 2 in it). Skipping
// texels instead would let thin bright things flicker in and out of the blur as the view moves.

uniform sampler2D InSampler;

layout(std140) uniform G6Blur {
    vec4 Pass;
    vec4 Kernel;
};

in vec2 texCoord;
out vec4 fragColor;

const int MAX_REACH = 48;

void main() {
    if (Pass.z > 0.5) {
        int factor = int(Kernel.z + 0.5);
        if (factor <= 1) {
            fragColor = vec4(texture(InSampler, texCoord).rgb, 1.0);
            return;
        }
        vec2 texel = 1.0 / vec2(textureSize(InSampler, 0));
        int pairs = factor / 2;
        vec3 sum = vec3(0.0);
        for (int y = 0; y < 4; y++) {
            if (y >= pairs) {
                break;
            }
            for (int x = 0; x < 4; x++) {
                if (x >= pairs) {
                    break;
                }
                vec2 offset = vec2(float(2 * x + 1 - pairs), float(2 * y + 1 - pairs));
                sum += texture(InSampler, texCoord + offset * texel).rgb;
            }
        }
        fragColor = vec4(sum / float(pairs * pairs), 1.0);
        return;
    }

    float sigma = max(Kernel.x, 0.001);
    int reach = int(Kernel.y + 0.5);
    float falloff = -0.5 / (sigma * sigma);
    vec3 sum = texture(InSampler, texCoord).rgb;
    float total = 1.0;
    for (int i = 1; i <= MAX_REACH; i += 2) {
        if (i > reach) {
            break;
        }
        float near = exp(falloff * float(i * i));
        float far = i + 1 <= reach ? exp(falloff * float((i + 1) * (i + 1))) : 0.0;
        float weight = near + far;
        vec2 offset = Pass.xy * ((float(i) * near + float(i + 1) * far) / weight);
        sum += (texture(InSampler, texCoord + offset).rgb + texture(InSampler, texCoord - offset).rgb) * weight;
        total += 2.0 * weight;
    }
    fragColor = vec4(sum / total, 1.0);
}
