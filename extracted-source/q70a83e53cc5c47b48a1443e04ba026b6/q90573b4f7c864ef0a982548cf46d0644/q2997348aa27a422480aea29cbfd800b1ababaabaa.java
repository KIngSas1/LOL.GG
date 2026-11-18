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
record q2997348aa27a422480aea29cbfd800b1ababaabaa(Matrix3x2fc fT, float fU, float fV, float fW, float fX, float fY, int fZ, int f0, @Nullable class_8030 a, @Nullable class_8030 b) implements class_11244 {
   private final float aa;
   private final int ab;
   private final @Nullable class_8030 ba;
   private final int b;
   private final float bb;
   private final Matrix3x2fc aaa;
   private final @Nullable class_8030 aab;
   private final float a;
   private final float aba;
   private final float abb;

   public RenderPipeline comp_4055() {
      return q2997348aa27a422480aea29cbfd800b1aabab.abb;
   }

   public float a() {
      return this.aa;
   }

   public Matrix3x2fc b() {
      return this.aaa;
   }

   public float aa() {
      return this.abb;
   }

   public int ab() {
      return this.ab;
   }

   private q2997348aa27a422480aea29cbfd800b1ababaabaa(Matrix3x2fc var1, float var2, float var3, float var4, float var5, float var6, int var7, int var8, @Nullable class_8030 var9, @Nullable class_8030 var10) {
      this.aaa = var1;
      this.aa = var2;
      this.a = var3;
      this.bb = var4;
      this.aba = var5;
      this.abb = var6;
      this.ab = var7;
      this.b = var8;
      this.aab = var9;
      this.ba = var10;
   }

   public float ba() {
      return this.bb;
   }

   public @Nullable class_8030 comp_4274() {
      return this.ba;
   }

   private q2997348aa27a422480aea29cbfd800b1ababaabaa(Matrix3x2fc var1, float var2, float var3, float var4, float var5, float var6, int var7, int var8, @Nullable class_8030 var9) {
      this(var1, var2, var3, var4, var5, var6, var7, var8, var9, q2997348aa27a422480aea29cbfd800b1aabab.aaabb(var2 - var4, var3 - var4, var4 * 2.0F, var4 * 2.0F, var1, var9));
   }

   public class_11231 comp_4056() {
      return q2997348aa27a422480aea29cbfd800b1aabab.baab;
   }

   public float bb() {
      return this.aba;
   }

   public @Nullable class_8030 comp_4069() {
      return this.aab;
   }

   public float aaa() {
      return this.a;
   }

   public int aab() {
      return this.b;
   }

   public void method_70917(class_4588 var1) {
      float var2 = this.bb * 2.0F;
      q2997348aa27a422480aea29cbfd800b1aabab.bbab(var1, this.aaa, this.aa - this.bb, this.a - this.bb, var2, var2, this.aba, this.abb, this.ab, this.b, this.b, this.b, this.b);
   }
}
