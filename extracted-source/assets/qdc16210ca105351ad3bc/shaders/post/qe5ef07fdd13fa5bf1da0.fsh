#version 330

#moj_import <minecraft:globals.glsl>

uniform sampler2D MaskSampler;
uniform sampler2D LineSampler;
uniform sampler2D HaloSampler;

layout(std140) uniform SamplerInfo {
    vec2 OutSize;
    vec2 MaskSize;
    vec2 LineSize;
    vec2 HaloSize;
};

// x: style (0 neon, 1 aurora, 2 prism, 3 hologram, 4 liquid, 5 galaxy, 7 frost;
// 6 was Glitch, deleted 2026-11-16), y: fill opacity, z: halo gain, w: rim opacity
layout(std140) uniform LookParams {
    vec4 Look;
};

in vec2 texCoord;

out vec4 fragColor;

const float TAU = 6.28318530718;

vec3 rgbToHsv(vec3 c) {
    vec4 k = vec4(0.0, -1.0 / 3.0, 2.0 / 3.0, -1.0);
    vec4 p = mix(vec4(c.bg, k.wz), vec4(c.gb, k.xy), step(c.b, c.g));
    vec4 q = mix(vec4(p.xyw, c.r), vec4(c.r, p.yzx), step(p.x, c.r));
    float d = q.x - min(q.w, q.y);
    float e = 1.0e-10;
    return vec3(abs(q.z + (q.w - q.y) / (6.0 * d + e)), d / (q.x + e), q.x);
}

vec3 hsvToRgb(vec3 c) {
    vec3 p = abs(fract(c.xxx + vec3(1.0, 2.0 / 3.0, 1.0 / 3.0)) * 6.0 - 3.0);
    return c.z * mix(vec3(1.0), clamp(p - 1.0, 0.0, 1.0), c.y);
}

float hash21(vec2 p) {
    p = fract(p * vec2(123.34, 456.21));
    p += dot(p, p + 45.32);
    return fract(p.x * p.y);
}

vec2 hash22(vec2 p) {
    vec3 q = fract(vec3(p.xyx) * vec3(0.1031, 0.1030, 0.0973));
    q += dot(q, q.yzx + 33.33);
    return fract((q.xx + q.yz) * q.zy);
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
    vec4 mask = texture(MaskSampler, texCoord);
    vec4 line = texture(LineSampler, texCoord);
    vec4 halo = texture(HaloSampler, texCoord);

    float inside = step(0.5, mask.a);
    float lineA = clamp(line.a, 0.0, 1.0);
    float haloA = clamp(halo.a, 0.0, 1.0);
    if (inside + lineA + haloA < 0.002) {
        fragColor = vec4(0.0);
        return;
    }

    vec3 base;
    if (inside > 0.5) {
        base = mask.rgb;
    } else if (lineA > 0.001) {
        base = line.rgb / lineA;
    } else {
        base = halo.rgb / max(haloA, 0.001);
    }
    base = clamp(base, 0.0, 1.0);

    int style = int(Look.x + 0.5);
    float fill = Look.y;
    // GameTime advances 1/24000 per tick and wraps every 24000 ticks; integer
    // multipliers keep every phase below continuous across that wrap.
    float t = fract(GameTime * 300.0);
    float slow = fract(GameTime * 150.0);
    vec2 px = texCoord * OutSize;
    float diag = (px.x + px.y) / max(OutSize.y, 1.0);
    // The theme accent arrives in the mask color; styles only wobble it
    // slightly so the selected theme keeps driving the look.
    vec3 hsv = rgbToHsv(base);
    float sat = clamp(hsv.y, 0.25, 1.0);

    vec3 rimColor;
    vec3 fillColor;
    if (style == 1) {
        float wave = sin(TAU * (texCoord.y * 2.0 + 0.25 * sin(TAU * (texCoord.x * 1.5 + slow)) - t));
        float hue = hsv.x + 0.05 * wave + 0.02 * sin(TAU * (diag - slow));
        rimColor = hsvToRgb(vec3(fract(hue + 0.03), sat, 1.0));
        fillColor = hsvToRgb(vec3(fract(hue), sat * 0.9, 1.0));
        fill *= 0.55 + 0.45 * (0.5 + 0.5 * wave);
    } else if (style == 2) {
        float hue = fract(hsv.x + 0.05 * sin(TAU * (diag * 0.9 - t)));
        rimColor = hsvToRgb(vec3(hue, sat, 1.0));
        fillColor = hsvToRgb(vec3(fract(hue + 0.05), sat * 0.9, 1.0));
    } else if (style == 3) {
        float scan = 0.5 + 0.5 * cos(TAU * (px.y * 0.25 - t * 6.0));
        float sweep = fract(texCoord.y + t) - 0.5;
        float band = exp(-sweep * sweep * 64.0);
        rimColor = hsvToRgb(vec3(fract(hsv.x - 0.03), sat * 0.9, 1.0));
        fillColor = mix(rimColor, vec3(1.0), 0.2 * band);
        fill *= 0.35 + 0.45 * scan + 0.9 * band;
    } else if (style == 4) {
        // Liquid: a deep body of the theme colour with caustic light flowing
        // through it and a bright, rippling surface along the rim.
        vec2 uv = px / max(OutSize.y, 1.0);
        float w1 = sin(TAU * (uv.x * 3.0 + uv.y * 1.2 - t));
        float w2 = sin(TAU * (uv.y * 4.0 - uv.x * 0.8 + slow * 2.0) + w1 * 1.4);
        float w3 = sin(TAU * ((uv.x + uv.y) * 6.0 + t * 2.0) + w2);
        float caustic = pow(clamp(1.0 - abs(w2 + w3) * 0.5, 0.0, 1.0), 6.0);
        vec3 deep = hsvToRgb(vec3(hsv.x, sat, 0.55));
        vec3 surface = hsvToRgb(vec3(fract(hsv.x + 0.02), sat * 0.6, 1.0));
        fillColor = clamp(mix(deep, surface, 0.25 + 0.35 * (0.5 + 0.5 * w1)) + vec3(caustic * 0.55), 0.0, 1.0);
        rimColor = mix(surface, vec3(1.0), 0.35 + 0.25 * (0.5 + 0.5 * w3));
        fill *= 0.75 + 0.25 * (0.5 + 0.5 * w2);
    } else if (style == 5) {
        // Galaxy: the body is a window into deep space in the theme colour.
        // Two nebula clouds drift on circles (a 40 s loop), stars twinkle in
        // front of them, and the rim is a bright edge of the same colour.
        vec2 uv = px / max(OutSize.y, 1.0);
        float drift = fract(GameTime * 30.0);
        vec2 orbit = vec2(cos(TAU * drift), sin(TAU * drift));
        vec3 tint = hsvToRgb(vec3(hsv.x, sat, 1.0));
        vec3 second = hsvToRgb(vec3(fract(hsv.x + 0.12), sat * 0.8, 1.0));
        float nebA = smoothstep(0.28, 0.72, fbm2(uv * 3.2 + orbit * 0.9));
        float nebB = smoothstep(0.36, 0.78, fbm2(uv * 5.1 - orbit.yx * 1.3 + 4.7));
        // One layer of stars, as in the hand shader (2026-11-16): the finer one showed as small crosshairs.
        float stars = starLayer(uv, 34.0, t);
        fillColor = clamp(tint * 0.14 + tint * nebA * 0.80 + second * nebB * 0.60
                + vec3(stars) * (1.0 - 0.5 * nebA), 0.0, 1.0);
        rimColor = mix(tint, vec3(1.0), 0.30);
    } else if (style == 7) {
        // Frost: the body is cut from ice. Crystal facets take slightly
        // different shades, their seams and a few single crystals catch the
        // light, and the rim is rime: nearly white with a breath of the theme.
        vec2 g = px / max(OutSize.y, 1.0) * 17.0;
        vec2 cell = floor(g);
        vec2 f = fract(g);
        float nearest = 8.0;
        float next = 8.0;
        vec2 nearestId = vec2(0.0);
        for (int y = -1; y <= 1; y++) {
            for (int x = -1; x <= 1; x++) {
                vec2 o = vec2(float(x), float(y));
                float d = length(o + hash22(cell + o) - f);
                if (d < nearest) {
                    next = nearest;
                    nearest = d;
                    nearestId = cell + o;
                } else if (d < next) {
                    next = d;
                }
            }
        }
        vec2 rnd = hash22(nearestId + 19.19);
        float seam = 1.0 - smoothstep(0.0, 0.09, next - nearest);
        float sparkle = step(0.86, rnd.y) * smoothstep(0.22, 0.0, nearest)
                * pow(0.5 + 0.5 * sin(TAU * (t * 2.0 + rnd.x * 9.0)), 6.0);
        vec3 ice = hsvToRgb(vec3(hsv.x, sat * 0.45, 1.0));
        fillColor = clamp(ice * (0.78 + 0.22 * rnd.x) + vec3(seam * 0.30 + sparkle), 0.0, 1.0);
        rimColor = mix(ice, vec3(1.0), 0.65);
        fill *= 0.70 + 0.30 * rnd.x + 0.6 * seam + sparkle;
    } else {
        float hue = hsv.x + 0.05 * sin(TAU * (diag * 1.2 - t));
        rimColor = hsvToRgb(vec3(fract(hue), sat, 1.0));
        fillColor = rimColor;
        rimColor = mix(rimColor, vec3(1.0), 0.35 * lineA * lineA);
    }

    float rimMask = clamp(lineA * Look.w, 0.0, 1.0);
    // The halo is the blurred silhouette itself, not blurred rim lines, so it
    // depends only on how near the body is. Blurred lines added up wherever
    // two edges sat close (neck, armpits, between the legs) and showed as
    // brighter overlapping patches. Coverage just outside the body runs from
    // 0.25 at an outward corner to 0.75 in a notch; saturating at 0.25 gives
    // every stretch of the outline the same brightness before it fades.
    float reach = clamp(haloA * 4.0, 0.0, 1.0);
    // The halo lives strictly outside every silhouette: overlapping players
    // read as one clean outlined glow instead of glow washing over bodies.
    // 0.1 keeps each style's glow about as strong at the body as it was when
    // the gain applied to the much fainter blurred lines.
    float haloMask = (1.0 - exp(-reach * sqrt(reach) * Look.z * 0.1)) * (1.0 - inside);
    float fillMask = clamp(inside * fill, 0.0, 1.0) * (1.0 - lineA);
    float weight = rimMask + haloMask + fillMask;
    if (weight < 0.0005) {
        fragColor = vec4(0.0);
        return;
    }
    vec3 color = (rimColor * (rimMask + haloMask) + fillColor * fillMask) / weight;
    float alpha = 1.0 - (1.0 - rimMask) * (1.0 - haloMask) * (1.0 - fillMask);
    fragColor = vec4(clamp(color, 0.0, 1.0), clamp(alpha, 0.0, 1.0));
}
