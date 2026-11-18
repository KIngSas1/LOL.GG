#version 330
#moj_import <minecraft:globals.glsl>
uniform sampler2D InSampler;
layout(std140) uniform H4Params { vec4 Tint; };
in vec2 texCoord;
out vec4 fragColor;
const float TAU = 6.2831853;
// Galaxy: the hands become a window into deep space. A dark body of the tint
// holds two drifting nebula clouds and a layer of twinkling stars, and the
// silhouette's inner edge glows. The clouds drift on circles, so every phase
// repeats exactly and integer GameTime multipliers keep it continuous across
// the day wrap.
float hash21(vec2 p) {
    p = fract(p * vec2(123.34, 456.21));
    p += dot(p, p + 45.32);
    return fract(p.x * p.y);
}
float valueNoise(vec2 p) {
    vec2 i = floor(p);
    vec2 f = fract(p);
    vec2 u = f * f * (3.0 - 2.0 * f);
    return mix(mix(hash21(i), hash21(i + vec2(1.0, 0.0)), u.x),
            mix(hash21(i + vec2(0.0, 1.0)), hash21(i + vec2(1.0, 1.0)), u.x), u.y);
}
float fbm2(vec2 p) {
    float v = 0.0;
    float a = 0.5;
    for (int i = 0; i < 4; i++) {
        v += a * valueNoise(p);
        p = mat2(1.6, 1.2, -1.2, 1.6) * p;
        a *= 0.5;
    }
    return v;
}
float starLayer(vec2 uv, float scale, float phase) {
    vec2 g = uv * scale;
    vec2 id = floor(g);
    float h = hash21(id);
    vec2 o = (vec2(hash21(id + 7.1), hash21(id + 13.7)) - 0.5) * 0.6;
    float d = length(fract(g) - 0.5 - o);
    float twinkle = 0.55 + 0.45 * sin(TAU * (phase * 3.0 + h * 17.0));
    return smoothstep(0.13, 0.0, d) * twinkle * smoothstep(0.62, 1.0, h);
}
void main() {
    vec4 base = texture(InSampler, texCoord);
    if (base.a < 0.003) {
        fragColor = vec4(0.0);
        return;
    }
    float fast = fract(GameTime * 300.0);
    float drift = fract(GameTime * 30.0);
    vec2 uv = texCoord * vec2(1.78, 1.0);
    vec2 orbit = vec2(cos(TAU * drift), sin(TAU * drift));
    vec3 tint = Tint.w > 0.5 ? Tint.rgb : vec3(0.52, 0.34, 1.0);
    vec3 second = mix(tint.brg, vec3(0.20, 0.85, 1.0), 0.45);
    float cloudA = fbm2(uv * 3.2 + orbit * 0.9);
    float cloudB = fbm2(uv * 5.1 - orbit.yx * 1.3 + 4.7);
    float nebA = smoothstep(0.28, 0.72, cloudA);
    float nebB = smoothstep(0.36, 0.78, cloudB);
    float luma = dot(base.rgb, vec3(0.299, 0.587, 0.114));
    vec3 space = tint * 0.14 + vec3(0.004, 0.006, 0.02);
    vec3 color = space + tint * nebA * 0.80 + second * nebB * 0.60;
    // The hand's own shading stays readable under the sky.
    color *= 0.70 + 0.60 * luma;
    // One layer of stars (2026-11-16, user request): the finer layer's dots were two pixels
    // across and showed as small "+" crosshairs on the pixel grid.
    float stars = starLayer(uv, 34.0, fast);
    color += vec3(stars) * (1.0 - 0.5 * nebA);
    // The edge is two pixels wide at any resolution, as thin as Neon's rim (2026-11-16, user request;
    // it was 0.0035 by 0.006 of the screen, six to nine pixels at 1080p).
    vec2 rim = 2.0 / vec2(textureSize(InSampler, 0));
    float edge = base.a
            - min(min(texture(InSampler, texCoord + vec2(rim.x, 0.0)).a, texture(InSampler, texCoord - vec2(rim.x, 0.0)).a),
                  min(texture(InSampler, texCoord + vec2(0.0, rim.y)).a, texture(InSampler, texCoord - vec2(0.0, rim.y)).a));
    color += mix(tint, vec3(1.0), 0.35) * clamp(edge, 0.0, 1.0) * 0.9;
    fragColor = vec4(clamp(color, 0.0, 1.0), base.a);
}
