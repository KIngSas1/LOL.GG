package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_243;

@Environment(EnvType.CLIENT)
public record q2997348aa27a422480aea29cbfd800b1babbbab(int a8, class_243 a9, float a_, double ba, float bb, boolean bc, float bd, float be, boolean bf) {
   private final float a;
   private final boolean b;
   private final float aa;
   private final int ab;
   private final double bb;
   private final boolean ba;
   private final class_243 aaa;
   private final float aab;
   private final float aba;

   public int a() {
      return this.ab;
   }

   public float aa() {
      return this.a;
   }

   public float ab() {
      return this.aba;
   }

   public q2997348aa27a422480aea29cbfd800b1babbbab(int var1, class_243 var2, float var3, double var4, float var6, boolean var7, float var8, float var9, boolean var10) {
      this.ab = var1;
      this.aaa = var2;
      this.a = var3;
      this.bb = var4;
      this.aa = var6;
      this.ba = var7;
      this.aab = var8;
      this.aba = var9;
      this.b = var10;
   }

   public float aaa() {
      return this.aa;
   }

   public class_243 bb() {
      return this.aaa;
   }

   q2997348aa27a422480aea29cbfd800b1babbbab(int var1, class_243 var2, float var3, double var4, float var6, boolean var7) {
      this(var1, var2, var3, var4, var6, var7, 0.0F, 0.0F, false);
   }

   public boolean aab() {
      return this.b;
   }

   public float aba() {
      return this.aab;
   }

   public boolean abb() {
      return this.ba;
   }

   q2997348aa27a422480aea29cbfd800b1babbbab(int var1, class_243 var2, float var3, double var4, float var6) {
      this(var1, var2, var3, var4, var6, false, 0.0F, 0.0F, false);
   }

   static q2997348aa27a422480aea29cbfd800b1babbbab baa(int var0, class_243 var1) {
      try {
         try {
            if (var1 == null) {
               return null;
            }
         } catch (IllegalStateException var2) {
            throw var2;
         }
      } catch (MatchException var3) {
         throw var3;
      }

      return new q2997348aa27a422480aea29cbfd800b1babbbab(var0, var1, 0.0F, (double)0.0F, 360.0F, false, 0.0F, 0.0F, true);
   }

   public double b() {
      return this.bb;
   }
}
