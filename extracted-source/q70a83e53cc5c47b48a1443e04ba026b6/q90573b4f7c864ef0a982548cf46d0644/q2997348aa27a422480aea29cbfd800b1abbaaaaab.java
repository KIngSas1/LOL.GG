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
record q2997348aa27a422480aea29cbfd800b1abbaaaaab(Matrix3x2fc h0, float h1, float h2, float h3, float h4, float h5, float h6, float h7, float h8, int h9, float h_, float ia, class_11231 a, @Nullable class_8030 b, @Nullable class_8030 c) implements class_11244 {
   private final Matrix3x2fc aa;
   private final float ab;
   private final float ba;
   private final float bb;
   private final int aaa;
   private final float aab;
   private final float aba;
   private final float abb;
   private final float baa;
   private final @Nullable class_8030 bab;
   private final float b;
   private final class_11231 bba;
   private final float a;
   private final float bbb;
   private final @Nullable class_8030 aaaa;

   public RenderPipeline comp_4055() {
      return q2997348aa27a422480aea29cbfd800b1aabab.a;
   }

   public float a() {
      return this.baa;
   }

   private q2997348aa27a422480aea29cbfd800b1abbaaaaab(Matrix3x2fc var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, int var10, float var11, float var12, class_11231 var13, @Nullable class_8030 var14) {
      this(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, q2997348aa27a422480aea29cbfd800b1aabab.aaabb(var2, var3, var4, var5, var1, var14));
   }

   public float b() {
      return this.aba;
   }

   public float aa() {
      return this.aab;
   }

   public float ab() {
      return this.bbb;
   }

   public int ba() {
      return this.aaa;
   }

   public float bb() {
      return this.abb;
   }

   public float aaa() {
      return this.b;
   }

   public Matrix3x2fc aab() {
      return this.aa;
   }

   private q2997348aa27a422480aea29cbfd800b1abbaaaaab(Matrix3x2fc var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, int var10, float var11, float var12, class_11231 var13, @Nullable class_8030 var14, @Nullable class_8030 var15) {
      this.aa = var1;
      this.aba = var2;
      this.baa = var3;
      this.bbb = var4;
      this.aab = var5;
      this.b = var6;
      this.a = var7;
      this.ab = var8;
      this.ba = var9;
      this.aaa = var10;
      this.abb = var11;
      this.bb = var12;
      this.bba = var13;
      this.bab = var14;
      this.aaaa = var15;
   }

   public float aba() {
      return this.a;
   }

   public float abb() {
      return this.bb;
   }

   public @Nullable class_8030 comp_4274() {
      return this.aaaa;
   }

   public float baa() {
      return this.ab;
   }

   public void method_70917(class_4588 var1) {
      q2997348aa27a422480aea29cbfd800b1aabab.bbbaa(var1, this.aa, this.aba, this.baa, this.bbb, this.aab, this.b, this.a, this.ab, this.ba, this.aaa, this.abb, this.bb);
   }

   public class_11231 comp_4056() {
      return this.bba;
   }

   public float bab() {
      return this.ba;
   }

   public @Nullable class_8030 comp_4069() {
      return this.bab;
   }

   private q2997348aa27a422480aea29cbfd800b1abbaaaaab(Matrix3x2fc var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, int var10, float var11, class_11231 var12, @Nullable class_8030 var13) {
      this(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, 0.0F, var12, var13, q2997348aa27a422480aea29cbfd800b1aabab.aaabb(var2, var3, var4, var5, var1, var13));
   }

   public class_11231 bba() {
      return this.bba;
   }
}
