package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import com.mojang.blaze3d.pipeline.BlendFunction;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.platform.DepthTestFunction;
import com.mojang.blaze3d.vertex.VertexFormat.class_5596;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_10789;
import net.minecraft.class_10799;
import net.minecraft.class_290;
import net.minecraft.class_2960;

@Environment(EnvType.CLIENT)
final class q2997348aa27a422480aea29cbfd800b1baa {
   static final RenderPipeline a;
   static final RenderPipeline b;

   private q2997348aa27a422480aea29cbfd800b1baa() {
   }

   static {
      a = class_10799.method_67887(RenderPipeline.builder(new RenderPipeline.Snippet[]{class_10799.field_60125}).withLocation(class_2960.method_60655(q2997348aa27a422480aea29cbfd800b1babbbba.bab.bba(), q2997348aa27a422480aea29cbfd800b1babbbba.aaa.bba())).withVertexShader(class_2960.method_60655(q2997348aa27a422480aea29cbfd800b1babbbba.bab.bba(), q2997348aa27a422480aea29cbfd800b1babbbba.abaaa.bba())).withFragmentShader(class_2960.method_60655(q2997348aa27a422480aea29cbfd800b1babbbba.bab.bba(), q2997348aa27a422480aea29cbfd800b1babbbba.abaaa.bba())).withSampler(q2997348aa27a422480aea29cbfd800b1babbbba.abb.bba()).withBlend(BlendFunction.TRANSLUCENT).withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST).withDepthWrite(false).withCull(false).withVertexFormat(class_290.field_1590, class_5596.field_27382).build());
      b = class_10799.method_67887(RenderPipeline.builder(new RenderPipeline.Snippet[]{class_10799.field_56838}).withLocation(class_2960.method_60655(q2997348aa27a422480aea29cbfd800b1babbbba.bab.bba(), q2997348aa27a422480aea29cbfd800b1babbbba.aabb.bba())).withVertexShader(class_2960.method_60656(q2997348aa27a422480aea29cbfd800b1babbbba.aaabb.bba())).withFragmentShader(class_2960.method_60655(q2997348aa27a422480aea29cbfd800b1babbbba.bab.bba(), q2997348aa27a422480aea29cbfd800b1babbbba.baba.bba())).withSampler(q2997348aa27a422480aea29cbfd800b1babbbba.aaaab.bba()).withUniform(q2997348aa27a422480aea29cbfd800b1babbbba.b.bba(), class_10789.field_60031).build());
   }
}
