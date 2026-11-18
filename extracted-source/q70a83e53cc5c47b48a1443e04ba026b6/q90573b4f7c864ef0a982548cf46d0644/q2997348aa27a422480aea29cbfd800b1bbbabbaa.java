package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import com.mojang.blaze3d.pipeline.RenderPipeline;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_11231;
import net.minecraft.class_11244;
import net.minecraft.class_4588;
import net.minecraft.class_8030;
import org.joml.Matrix3x2fc;
import org.jspecify.annotations.Nullable;

@Environment(EnvType.CLIENT)
record q2997348aa27a422480aea29cbfd800b1bbbabbaa(Matrix3x2fc jK, float jL, float jM, float jN, float jO, float jP, float jQ, int jR, class_11231 b, @Nullable class_8030 c, @Nullable class_8030 d) implements class_11244 {
   private final float a;
   private final @Nullable class_8030 aa;
   private final float ab;
   private final float ba;
   private final class_11231 bb;
   private final int b;
   private final Matrix3x2fc aaa;
   private final float aab;
   private final float aba;
   private final @Nullable class_8030 abb;
   private final float baa;

   public float a() {
      return this.ba;
   }

   public void method_70917(class_4588 var1) {
      int var2 = q2997348aa27a422480aea29cbfd800b1babbbba.aaaa(this.ba);
      int var3 = q2997348aa27a422480aea29cbfd800b1babbbba.aaaa(this.a);
      this.aa(var1, this.ab, this.baa, 0.0F, 0.0F, var2, var3);
      this.aa(var1, this.ab, this.baa + this.a, 0.0F, 1.0F, var2, var3);
      this.aa(var1, this.ab + this.ba, this.baa + this.a, 1.0F, 1.0F, var2, var3);
      this.aa(var1, this.ab + this.ba, this.baa, 1.0F, 0.0F, var2, var3);
   }

   private void aa(class_4588 var1, float var2, float var3, float var4, float var5, int var6, int var7) {
      var1.method_70815(this.aaa, var2, var3).method_39415(this.b).method_22913(var4, var5).method_22921(var6, var7).method_22914(this.aba, this.aab, 0.0F);
   }

   public Matrix3x2fc b() {
      return this.aaa;
   }

   public float ab() {
      return this.aab;
   }

   public @Nullable class_8030 comp_4069() {
      return this.aa;
   }

   public float ba() {
      return this.a;
   }

   public float bb() {
      return this.ab;
   }

   public class_11231 comp_4056() {
      return this.bb;
   }

   public float aaa() {
      return this.aba;
   }

   private q2997348aa27a422480aea29cbfd800b1bbbabbaa(Matrix3x2fc var1, float var2, float var3, float var4, float var5, float var6, float var7, int var8, class_11231 var9, @Nullable class_8030 var10, @Nullable class_8030 var11) {
      this.aaa = var1;
      this.ab = var2;
      this.baa = var3;
      this.ba = var4;
      this.a = var5;
      this.aba = var6;
      this.aab = var7;
      this.b = var8;
      this.bb = var9;
      this.aa = var10;
      this.abb = var11;
   }

   public int aab() {
      return this.b;
   }

   public float aba() {
      return this.baa;
   }

   public RenderPipeline comp_4055() {
      return q2997348aa27a422480aea29cbfd800b1baa.a;
   }

   public @Nullable class_8030 comp_4274() {
      return this.abb;
   }
}
