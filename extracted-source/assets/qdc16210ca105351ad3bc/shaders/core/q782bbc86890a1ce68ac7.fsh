#version 330

// A rounded GUI panel showing the frame behind it through GaussianBlur's blur (Sampler0, the
// blurred frame at a fraction of the screen's size, read with a linear filter), a tint laid over
// it. Vertex colour: the tint, its alpha how much of the blur it covers. shapeData.x: the corner
// radius and shapeData.y: the panel's opacity, both packed into -1..1 as the SDF panels (qa09899153c9a261718e0) do.

layout(std140) uniform DynamicTransforms {
    mat4 ModelViewMat;
    vec4 ColorModulator;
    vec3 ModelOffset;
    mat4 TextureMat;
};

uniform sampler2D Sampler0;

in vec2 texCoord0;
in vec2 shapeSize;
in vec3 shapeData;
in vec4 vertexColor;
in vec2 screenCoord;

out vec4 fragColor;

const float RECT_AA_PAD = 1.25;

float decodeUnit(float value) {
    return clamp(value * 0.5 + 0.5, 0.0, 1.0);
}

float roundedBoxSdf(vec2 p, vec2 halfSize, float radius) {
    radius = min(radius, min(halfSize.x, halfSize.y));
    vec2 q = abs(p) - halfSize + vec2(radius);
    return min(max(q.x, q.y), 0.0) + length(max(q, 0.0)) - radius;
}

// Half a step of 8-bit noise: a blurred sky is a slow gradient, and without it the panel shows
// its bands.
float dither(vec2 pixel) {
    return fract(sin(dot(pixel, vec2(12.9898, 78.233))) * 43758.5453) - 0.5;
}

void main() {
    vec2 rasterSize = max(shapeSize, vec2(0.125));
    vec2 size = max(rasterSize - vec2(RECT_AA_PAD * 2.0), vec2(0.125));
    vec2 local = texCoord0 * rasterSize - vec2(RECT_AA_PAD);
    float radius = decodeUnit(shapeData.x) * min(rasterSize.x, rasterSize.y);
    float distanceValue = roundedBoxSdf(local - size * 0.5, size * 0.5, radius);
    float aa = max(fwidth(distanceValue) * 0.65, 0.35);
    float coverage = 1.0 - smoothstep(-aa, aa, distanceValue);
    float alpha = coverage * decodeUnit(shapeData.y);
    if (alpha <= 0.001) {
        discard;
    }

    vec4 tint = vertexColor * ColorModulator;
    vec3 behind = texture(Sampler0, clamp(screenCoord, vec2(0.0), vec2(1.0))).rgb;
    vec3 color = mix(behind, tint.rgb, clamp(tint.a, 0.0, 1.0));
    color += dither(gl_FragCoord.xy) / 255.0;
    fragColor = vec4(clamp(color, 0.0, 1.0), alpha);
}
