package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
enum q2997348aa27a422480aea29cbfd800b1bbaabaa {
   private static final String[] ba;
   private static final q2997348aa27a422480aea29cbfd800b1bbaabaa[] a;
   private static final int[] ab;
   public static final q2997348aa27a422480aea29cbfd800b1bbaabaa b;
   private static final Object[] bb;
   public static final q2997348aa27a422480aea29cbfd800b1bbaabaa aa;

   private static int b(int var0, int var1) {
      int var2 = ab[var0 ^ -929651677] ^ var1 ^ var0;
      var2 ^= 36651;
      var2 -= 26412;
      var2 += 44783;
      var2 += 23942;
      var2 += 51853;
      var2 += 64080;
      var2 += 23228;
      var2 -= 37959;
      var2 += 11398;
      return var2;
   }

   private static String aa(int var0, short var1, char var2) {
      int var3 = var2 ^ 14412;
      char[] var4 = ba[var3].toCharArray();
      StackTraceElement[] var5 = (StackTraceElement[])bb[var3];
      StackTraceElement[] var6;
      if (var5 != null) {
         var6 = var5;
      } else {
         var6 = (new Throwable()).getStackTrace();
         bb[var3] = var6;
      }

      StackTraceElement var7 = var6[1];
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 7252;
      int var9 = 0;

      do {
         int var10 = var4[var9] ^ 29957;
         var10 -= 6627;
         var10 ^= 59865;
         var10 += 25303;
         var10 -= 34472;
         var10 -= 25872;
         var10 -= 54202;
         var10 -= 56558;
         var4[var9] = (char)(var10 ^ var8 ^ var1 ^ var0 >> 16);
         ++var9;
      } while(var9 < var4.length);

      return (new String(var4)).intern();
   }

   static {
      // $FF: Couldn't be decompiled
   }

   private static q2997348aa27a422480aea29cbfd800b1bbaabaa[] a() {
      return new q2997348aa27a422480aea29cbfd800b1bbaabaa[]{b, aa};
   }
}
