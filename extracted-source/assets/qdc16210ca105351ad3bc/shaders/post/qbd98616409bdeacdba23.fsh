#version 330
#moj_import <minecraft:globals.glsl>
uniform sampler2D InSampler;
layout(std140) uniform H4Params { vec4 Tint; };
in vec2 texCoord;
out vec4 fragColor;
const float TAU = 6.2831853;
// Frost: the hands are cut from ice. Crystal facets of slightly different
// shades cover them, the facet seams catch the light, single crystals sparkle,
// rime gathers along the silhouette's edge and a cold sheen passes over it
// all. Integer GameTime multipliers keep it continuous across the day wrap.
vec2 hash22(vec2 p) {
    vec3 q = fract(vec3(p.xyx) * vec3(0.1031, 0.1030, 0.0973));
    q += dot(q, q.yzx + 33.33);
    return fract((q.xx + q.yz) * q.zy);
}
void main() {
    vec4 base = texture(InSampler, texCoord);
    if (base.a < 0.003) {
        fragColor = vec4(0.0);
        return;
    }
    float slow = fract(GameTime * 150.0);
    float fast = fract(GameTime * 300.0);
    vec2 g = texCoord * vec2(1.78, 1.0) * 17.0;
    vec2 cell = floor(g);
    vec2 f = fract(g);
    float nearest = 8.0;
    float second = 8.0;
    vec2 nearestId = vec2(0.0);
    for (int y = -1; y <= 1; y++) {
        for (int x = -1; x <= 1; x++) {
            vec2 o = vec2(float(x), float(y));
            vec2 id = cell + o;
            float d = length(o + hash22(id) - f);
            if (d < nearest) {
                second = nearest;
                nearest = d;
                nearestId = id;
            } else if (d < second) {
                second = d;
            }
        }
    }
    vec2 rnd = hash22(nearestId + 19.19);
    float seam = 1.0 - smoothstep(0.0, 0.09, second - nearest);
    float facet = rnd.x;
    float sparkle = step(0.86, rnd.y) * smoothstep(0.22, 0.0, nearest)
            * pow(0.5 + 0.5 * sin(TAU * (fast * 2.0 + rnd.x * 9.0)), 6.0);
    vec3 ice = Tint.w > 0.5 ? mix(Tint.rgb, vec3(1.0), 0.35) : vec3(0.62, 0.86, 1.0);
    float luma = dot(base.rgb, vec3(0.299, 0.587, 0.114));
    vec3 body = ice * (0.42 + 0.70 * luma) * (0.82 + 0.36 * facet);
    vec3 color = mix(base.rgb, body, 0.72);
    color += mix(ice, vec3(1.0), 0.6) * seam * 0.30;
    // The edge is two pixels wide at any resolution, as thin as Neon's rim (2026-11-16, user request;
    // it was 0.0045 by 0.008 of the screen, six to nine pixels at 1080p).
    vec2 rim = 2.0 / vec2(textureSize(InSampler, 0));
    float edge = base.a
            - min(min(texture(InSampler, texCoord + vec2(rim.x, 0.0)).a, texture(InSampler, texCoord - vec2(rim.x, 0.0)).a),
                  min(texture(InSampler, texCoord + vec2(0.0, rim.y)).a, texture(InSampler, texCoord - vec2(0.0, rim.y)).a));
    color = mix(color, vec3(0.94, 0.98, 1.0), clamp(edge, 0.0, 1.0) * (0.55 + 0.35 * facet));
    float sheen = pow(clamp(0.5 + 0.5 * sin(TAU * (texCoord.x * 0.9 + texCoord.y * 1.4 - slow)), 0.0, 1.0), 14.0);
    color += vec3(sparkle * 0.9 + sheen * 0.22);
    fragColor = vec4(clamp(color, 0.0, 1.0), base.a);
}
