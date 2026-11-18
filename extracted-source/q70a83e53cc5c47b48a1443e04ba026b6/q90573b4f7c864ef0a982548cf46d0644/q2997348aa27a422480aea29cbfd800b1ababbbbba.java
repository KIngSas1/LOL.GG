package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum q2997348aa27a422480aea29cbfd800b1ababbbbba {
   private static final Object[] bb;
   private static final String[] ba;
   public static final q2997348aa27a422480aea29cbfd800b1ababbbbba a;
   private static final int[] b;
   public static final q2997348aa27a422480aea29cbfd800b1ababbbbba aa;
   private static final q2997348aa27a422480aea29cbfd800b1ababbbbba[] ab;

   private static int b(int var0, int var1) {
      int var2 = b[var0 ^ -1361987560] ^ var1 ^ var0;
      var2 += 23943;
      var2 ^= 2248;
      var2 ^= 37777;
      var2 -= 42565;
      var2 += 52918;
      var2 -= 21007;
      var2 -= 20401;
      var2 -= 14802;
      var2 ^= 7435;
      var2 ^= 14262;
      return var2;
   }

   private static q2997348aa27a422480aea29cbfd800b1ababbbbba[] a() {
      return new q2997348aa27a422480aea29cbfd800b1ababbbbba[]{aa, a};
   }

   static {
      // $FF: Couldn't be decompiled
   }

   private static String aa(short var0, int var1, char var2) {
      int var3 = var2 ^ '솿';
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
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 31094;
      int var9 = 0;

      do {
         int var10 = var4[var9] ^ 20279;
         var10 ^= 35526;
         var10 += 32892;
         var10 ^= 61996;
         var10 += 35196;
         var10 += 50016;
         var10 ^= 52706;
         var10 += 61361;
         var10 ^= 57219;
         var10 -= 63858;
         var4[var9] = (char)(var10 ^ var8 ^ var0 ^ var1 >> 16);
         ++var9;
      } while(var9 < var4.length);

      return (new String(var4)).intern();
   }
}
