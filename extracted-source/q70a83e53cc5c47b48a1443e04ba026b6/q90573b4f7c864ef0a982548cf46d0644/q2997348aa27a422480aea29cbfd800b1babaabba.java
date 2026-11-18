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
record q2997348aa27a422480aea29cbfd800b1babaabba(Matrix3x2fc hk, float[] hl, int[] hm, int hn, @Nullable class_8030 b, @Nullable class_8030 c) implements class_11244 {
   private final @Nullable class_8030 a;
   private final Matrix3x2fc b;
   private final @Nullable class_8030 aa;
   private final int ab;
   private final float[] ba;
   private final int[] bb;

   public class_11231 comp_4056() {
      return q2997348aa27a422480aea29cbfd800b1aabab.baab;
   }

   public void method_70917(class_4588 var1) {
      int var2 = q2997348aa27a422480aea29cbfd800b1bbabab.b;
      int var4 = 0;
      int var3 = q2997348aa27a422480aea29cbfd800b1bbabab.aaab;

      label24:
      while(true) {
         if (var4 < this.ab) {
            var1.method_70815(this.b, this.ba[var4 * 2], this.ba[var4 * 2 + 1]).method_39415(this.bb[var4]);
         } else if (var2 == 0) {
            return;
         }

         do {
            ++var4;
            if (var3 == 0) {
               continue label24;
            }
         } while(var2 != 0);

         return;
      }
   }

   private q2997348aa27a422480aea29cbfd800b1babaabba(Matrix3x2fc var1, float[] var2, int[] var3, int var4, @Nullable class_8030 var5, @Nullable class_8030 var6) {
      this.b = var1;
      this.ba = var2;
      this.bb = var3;
      this.ab = var4;
      this.a = var5;
      this.aa = var6;
   }

   public @Nullable class_8030 comp_4069() {
      return this.a;
   }

   public float[] a() {
      return this.ba;
   }

   public int b() {
      return this.ab;
   }

   public @Nullable class_8030 comp_4274() {
      return this.aa;
   }

   public int[] aa() {
      return this.bb;
   }

   public Matrix3x2fc ab() {
      return this.b;
   }

   public RenderPipeline comp_4055() {
      return q2997348aa27a422480aea29cbfd800b1aabab.aaba;
   }
}
