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
record q2997348aa27a422480aea29cbfd800b1bababaa(class_11231 ho, Matrix3x2fc hp, float hq, float hr, float hs, float ht, float hu, int hv, @Nullable class_8030 b, @Nullable class_8030 c) implements class_11244 {
   private final float a;
   private final int aa;
   private final Matrix3x2fc ab;
   private final class_11231 ba;
   private final float bb;
   private final @Nullable class_8030 aaa;
   private final float aab;
   private final float aba;
   private final float abb;
   private final @Nullable class_8030 baa;

   public float a() {
      return this.aba;
   }

   public @Nullable class_8030 comp_4069() {
      return this.baa;
   }

   public class_11231 b() {
      return this.ba;
   }

   public float aa() {
      return this.aab;
   }

   public RenderPipeline comp_4055() {
      return q2997348aa27a422480aea29cbfd800b1aabab.aaaba;
   }

   public float ab() {
      return this.a;
   }

   private q2997348aa27a422480aea29cbfd800b1bababaa(class_11231 var1, Matrix3x2fc var2, float var3, float var4, float var5, float var6, float var7, int var8, @Nullable class_8030 var9) {
      this(var1, var2, var3, var4, var5, var6, var7, var8, var9, q2997348aa27a422480aea29cbfd800b1aabab.aaabb(var3, var4, var5, var6, var2, var9));
   }

   public float ba() {
      return this.abb;
   }

   public float bb() {
      return this.bb;
   }

   private q2997348aa27a422480aea29cbfd800b1bababaa(class_11231 var1, Matrix3x2fc var2, float var3, float var4, float var5, float var6, float var7, int var8, @Nullable class_8030 var9, @Nullable class_8030 var10) {
      this.ba = var1;
      this.ab = var2;
      this.bb = var3;
      this.a = var4;
      this.aba = var5;
      this.aab = var6;
      this.abb = var7;
      this.aa = var8;
      this.baa = var9;
      this.aaa = var10;
   }

   public @Nullable class_8030 comp_4274() {
      return this.aaa;
   }

   public int aaa() {
      return this.aa;
   }

   public Matrix3x2fc aab() {
      return this.ab;
   }

   public void method_70917(class_4588 var1) {
      q2997348aa27a422480aea29cbfd800b1aabab.ababa(var1, this.ab, this.bb, this.a, this.aba, this.aab, this.abb, this.aa);
   }

   public class_11231 comp_4056() {
      return this.ba;
   }
}
