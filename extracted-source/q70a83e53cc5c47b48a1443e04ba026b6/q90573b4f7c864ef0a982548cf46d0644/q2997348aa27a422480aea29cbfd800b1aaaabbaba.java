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
record q2997348aa27a422480aea29cbfd800b1aaaabbaba(Matrix3x2fc aC, float aD, float aE, float aF, float aG, int aH, boolean aI, @Nullable class_8030 a, @Nullable class_8030 b) implements class_11244 {
   private final float aa;
   private final @Nullable class_8030 ab;
   private final float b;
   private final float ba;
   private final Matrix3x2fc bb;
   private final @Nullable class_8030 aaa;
   private final int a;
   private final float aab;
   private final boolean aba;

   public @Nullable class_8030 comp_4274() {
      return this.ab;
   }

   private q2997348aa27a422480aea29cbfd800b1aaaabbaba(Matrix3x2fc var1, float var2, float var3, float var4, float var5, int var6, boolean var7, @Nullable class_8030 var8, @Nullable class_8030 var9) {
      this.bb = var1;
      this.aab = var2;
      this.ba = var3;
      this.aa = var4;
      this.b = var5;
      this.a = var6;
      this.aba = var7;
      this.aaa = var8;
      this.ab = var9;
   }

   public void method_70917(class_4588 var1) {
      try {
         try {
            if (this.aba) {
               q2997348aa27a422480aea29cbfd800b1aabab.babba(var1, this.bb, this.aab, this.ba, this.aa, this.b, this.a);
               return;
            }
         } catch (IllegalStateException var2) {
            throw var2;
         }
      } catch (MatchException var3) {
         throw var3;
      }

      q2997348aa27a422480aea29cbfd800b1aabab.aabba(var1, this.bb, this.aab, this.ba, this.aa, this.a);
   }

   public float a() {
      return this.aab;
   }

   public boolean b() {
      return this.aba;
   }

   public Matrix3x2fc aa() {
      return this.bb;
   }

   public float ab() {
      return this.ba;
   }

   private q2997348aa27a422480aea29cbfd800b1aaaabbaba(Matrix3x2fc var1, float var2, float var3, float var4, float var5, int var6, boolean var7, @Nullable class_8030 var8, float var9) {
      this(var1, var2, var3, var4, var5, var6, var7, var8, q2997348aa27a422480aea29cbfd800b1aabab.aaabb(var2 - var9, var3 - var9, var9 * 2.0F, var9 * 2.0F, var1, var8));
   }

   public int ba() {
      return this.a;
   }

   public @Nullable class_8030 comp_4069() {
      return this.aaa;
   }

   public float bb() {
      return this.aa;
   }

   public RenderPipeline comp_4055() {
      return q2997348aa27a422480aea29cbfd800b1aabab.aaba;
   }

   public class_11231 comp_4056() {
      return q2997348aa27a422480aea29cbfd800b1aabab.baab;
   }

   public float aaa() {
      return this.b;
   }
}
