package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public final class q2997348aa27a422480aea29cbfd800b1aaaabbabb {
   private q2997348aa27a422480aea29cbfd800b1aaaabbabb() {
   }

   public static double a(double var0) {
      double var2 = (double)1.0F - ba(var0);
      return (double)1.0F - var2 * var2 * var2;
   }

   public static double aa(double var0) {
      double var2 = ba(var0);
      return var2 * var2 * var2 * (var2 * (var2 * (double)6.0F - (double)15.0F) + (double)10.0F);
   }

   public static double ab(double var0, double var2, double var4, double var6) {
      return var0 + (var2 - var0) * aab(var4, var6);
   }

   public static double ba(double var0) {
      return Math.max((double)0.0F, Math.min((double)1.0F, var0));
   }

   public static double bb(double param0) {
      // $FF: Couldn't be decompiled
   }

   public static double aaa(double var0) {
      double var2 = ba(var0) - (double)1.0F;
      return (double)1.0F + var2 * var2 * (2.70158 * var2 + 1.70158);
   }

   public static double aab(double var0, double var2) {
      double var4 = ba(var0);
      double var6 = Math.max((double)0.0F, Math.min((double)8.0F, var2 * (double)60.0F));
      return (double)1.0F - Math.pow((double)1.0F - var4, var6);
   }

   public static double b(double param0) {
      // $FF: Couldn't be decompiled
   }
}
