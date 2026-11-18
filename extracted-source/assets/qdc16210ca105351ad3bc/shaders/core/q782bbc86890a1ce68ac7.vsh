#version 330

layout(std140) uniform DynamicTransforms {
    mat4 ModelViewMat;
    vec4 ColorModulator;
    vec3 ModelOffset;
    mat4 TextureMat;
};
layout(std140) uniform Projection {
    mat4 ProjMat;
};

in vec3 Position;
in vec4 Color;
in vec2 UV0;
in ivec2 UV2;
in vec3 Normal;

out vec2 texCoord0;
out vec2 shapeSize;
out vec3 shapeData;
out vec4 vertexColor;
out vec2 screenCoord;

const float SIZE_PACK_SCALE = 8.0;

void main() {
    vec4 clip = ProjMat * ModelViewMat * vec4(Position, 1.0);
    gl_Position = clip;
    // Where the vertex lands on the screen, 0..1 from the bottom left like the frame's own
    // texture: the blurred frame is read there, so the panel shows what is right behind it.
    screenCoord = clip.xy / clip.w * 0.5 + 0.5;
    texCoord0 = UV0;
    shapeSize = max(vec2(UV2) / SIZE_PACK_SCALE, vec2(0.125));
    shapeData = Normal;
    vertexColor = Color;
}
