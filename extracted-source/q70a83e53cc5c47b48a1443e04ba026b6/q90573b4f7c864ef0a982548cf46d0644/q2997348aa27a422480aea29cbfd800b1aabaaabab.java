package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum q2997348aa27a422480aea29cbfd800b1aabaaabab {
   private static final int[] ab;
   private static final q2997348aa27a422480aea29cbfd800b1aabaaabab[] a;
   private static final String[] ba;
   private static final Object[] bb;
   public static final q2997348aa27a422480aea29cbfd800b1aabaaabab b;
   public static final q2997348aa27a422480aea29cbfd800b1aabaaabab aa;

   private static int b(int var0, int var1) {
      int var2 = ab[var0 ^ -85563247] ^ var1 ^ var0;
      var2 += 12229;
      var2 ^= 41287;
      var2 ^= 33642;
      var2 ^= 27144;
      var2 += 11387;
      var2 -= 743;
      var2 ^= 2012;
      var2 -= 24806;
      var2 -= 42444;
      return var2;
   }

   public static q2997348aa27a422480aea29cbfd800b1aabaaabab a(String var0) {
      return (q2997348aa27a422480aea29cbfd800b1aabaaabab)Enum.valueOf(q2997348aa27a422480aea29cbfd800b1aabaaabab.class, var0);
   }

   private static String ab(short var0, char var1, int var2) {
      int var3 = var1 ^ '邜';
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
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 8609;
      int var9 = 0;

      do {
         int var10 = var4[var9] ^ 30815;
         var10 += 5858;
         var10 -= 25634;
         var10 ^= 28840;
         var10 += 40818;
         var10 -= 39284;
         var10 ^= 32390;
         var10 -= 8831;
         var10 += 13810;
         var4[var9] = (char)(var10 ^ var8 ^ var0 ^ var2 >> 16);
         ++var9;
      } while(var9 < var4.length);

      return (new String(var4)).intern();
   }

   static {
      // $FF: Couldn't be decompiled
   }

   private static q2997348aa27a422480aea29cbfd800b1aabaaabab[] aa() {
      return new q2997348aa27a422480aea29cbfd800b1aabaaabab[]{b, aa};
   }
}
