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
record q2997348aa27a422480aea29cbfd800b1abbbbb(Matrix3x2fc gT, float gU, float gV, float gW, float gX, float gY, float gZ, int g0, @Nullable class_8030 a, @Nullable class_8030 b) implements class_11244 {
   private final int aa;
   private final float ab;
   private final Matrix3x2fc ba;
   private final @Nullable class_8030 bb;
   private final float a;
   private final float aaa;
   private final float aab;
   private final float aba;
   private final float abb;

   public float a() {
      return this.a;
   }

   private q2997348aa27a422480aea29cbfd800b1abbbbb(Matrix3x2fc var1, float var2, float var3, float var4, float var5, float var6, float var7, int var8, @Nullable class_8030 var9, @Nullable class_8030 var10) {
      this.ba = var1;
      this.aab = var2;
      this.aaa = var3;
      this.ab = var4;
      this.a = var5;
      this.abb = var6;
      this.aba = var7;
      this.aa = var8;
      this.b = var9;
      this.bb = var10;
   }

   public void method_70917(class_4588 var1) {
      float var2 = this.ab * 2.0F;
      q2997348aa27a422480aea29cbfd800b1aabab.baabb(var1, this.ba, this.aab - this.ab, this.aaa - this.ab, var2, var2, this.a, this.abb, this.aba, this.aa);
   }

   public RenderPipeline comp_4055() {
      return q2997348aa27a422480aea29cbfd800b1aabab.bbaa;
   }

   public @Nullable class_8030 comp_4274() {
      return this.bb;
   }

   public int b() {
      return this.aa;
   }

   public float aa() {
      return this.abb;
   }

   private q2997348aa27a422480aea29cbfd800b1abbbbb(Matrix3x2fc var1, float var2, float var3, float var4, float var5, float var6, float var7, int var8, @Nullable class_8030 var9) {
      this(var1, var2, var3, var4, var5, var6, var7, var8, var9, q2997348aa27a422480aea29cbfd800b1aabab.aaabb(var2 - var4, var3 - var4, var4 * 2.0F, var4 * 2.0F, var1, var9));
   }

   public @Nullable class_8030 comp_4069() {
      return this.b;
   }

   public Matrix3x2fc ab() {
      return this.ba;
   }

   public float ba() {
      return this.aaa;
   }

   public float bb() {
      return this.ab;
   }

   public class_11231 comp_4056() {
      return q2997348aa27a422480aea29cbfd800b1aabab.baab;
   }

   public float aaa() {
      return this.aab;
   }

   public float aab() {
      return this.aba;
   }
}
