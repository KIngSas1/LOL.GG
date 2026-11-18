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
record q2997348aa27a422480aea29cbfd800b1bababba(Matrix3x2fc c4, float c5, float c6, float c7, float c8, float c9, float c_, int da, int db, int dc, int dd, int de, @Nullable class_8030 a, @Nullable class_8030 b) implements class_11244 {
   private final float aa;
   private final float ab;
   private final float ba;
   private final int bb;
   private final Matrix3x2fc aaa;
   private final @Nullable class_8030 aab;
   private final int a;
   private final float aba;
   private final int abb;
   private final float baa;
   private final float bab;
   private final int bba;
   private final int bbb;
   private final @Nullable class_8030 aaaa;

   private q2997348aa27a422480aea29cbfd800b1bababba(Matrix3x2fc var1, float var2, float var3, float var4, float var5, float var6, float var7, int var8, int var9, int var10, int var11, int var12, @Nullable class_8030 var13, @Nullable class_8030 var14) {
      this.aaa = var1;
      this.bab = var2;
      this.ba = var3;
      this.aba = var4;
      this.baa = var5;
      this.aa = var6;
      this.ab = var7;
      this.bb = var8;
      this.bba = var9;
      this.a = var10;
      this.abb = var11;
      this.bbb = var12;
      this.aab = var13;
      this.aaaa = var14;
   }

   public float a() {
      return this.ab;
   }

   public int b() {
      return this.bba;
   }

   private q2997348aa27a422480aea29cbfd800b1bababba(Matrix3x2fc var1, float var2, float var3, float var4, float var5, float var6, float var7, int var8, int var9, int var10, int var11, int var12, @Nullable class_8030 var13) {
      this(var1, var2 - 1.25F, var3 - 1.25F, var4 + 2.5F, var5 + 2.5F, var6, var7, var8, var9, var10, var11, var12, var13, q2997348aa27a422480aea29cbfd800b1aabab.aaabb(var2 - 1.25F, var3 - 1.25F, var4 + 2.5F, var5 + 2.5F, var1, var13));
   }

   public float aa() {
      return this.aba;
   }

   public float ab() {
      return this.ba;
   }

   public int ba() {
      return this.a;
   }

   public int bb() {
      return this.bb;
   }

   public @Nullable class_8030 comp_4274() {
      return this.aaaa;
   }

   public int aaa() {
      return this.bbb;
   }

   public void method_70917(class_4588 var1) {
      q2997348aa27a422480aea29cbfd800b1aabab.bbab(var1, this.aaa, this.bab, this.ba, this.aba, this.baa, this.aa, this.ab, this.bb, this.bba, this.a, this.abb, this.bbb);
   }

   public float aab() {
      return this.baa;
   }

   public class_11231 comp_4056() {
      return q2997348aa27a422480aea29cbfd800b1aabab.baab;
   }

   public @Nullable class_8030 comp_4069() {
      return this.aab;
   }

   public Matrix3x2fc aba() {
      return this.aaa;
   }

   public float abb() {
      return this.bab;
   }

   public RenderPipeline comp_4055() {
      return q2997348aa27a422480aea29cbfd800b1aabab.abb;
   }

   public float baa() {
      return this.aa;
   }

   public int bab() {
      return this.abb;
   }
}
