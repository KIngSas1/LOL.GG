package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
enum q2997348aa27a422480aea29cbfd800b1aabbaabaa {
   private static final String[] aab;
   public static final q2997348aa27a422480aea29cbfd800b1aabbaabaa a;
   public static final q2997348aa27a422480aea29cbfd800b1aabbaabaa aa;
   private static final q2997348aa27a422480aea29cbfd800b1aabbaabaa[] ab;
   public static final q2997348aa27a422480aea29cbfd800b1aabbaabaa b;
   public static final q2997348aa27a422480aea29cbfd800b1aabbaabaa ba;
   private static final int[] aaa;
   private static final Object[] aba;
   public static final q2997348aa27a422480aea29cbfd800b1aabbaabaa bb;

   private static String ab(char var0, int var1, char var2) {
      int var3 = var2 ^ 752;
      char[] var4 = aab[var3].toCharArray();
      StackTraceElement[] var5 = (StackTraceElement[])aba[var3];
      StackTraceElement[] var6;
      if (var5 != null) {
         var6 = var5;
      } else {
         var6 = (new Throwable()).getStackTrace();
         aba[var3] = var6;
      }

      StackTraceElement var7 = var6[1];
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 26647;
      int var9 = 0;

      do {
         int var10 = var4[var9] ^ 23565;
         var10 -= 26146;
         var10 ^= 49104;
         var10 += 20073;
         var10 += 25251;
         var10 += 9005;
         var10 -= 46721;
         var10 -= 8261;
         var4[var9] = (char)(var10 ^ var8 ^ var0 ^ var1 >> 16);
         ++var9;
      } while(var9 < var4.length);

      return (new String(var4)).intern();
   }

   private static q2997348aa27a422480aea29cbfd800b1aabbaabaa[] a() {
      return new q2997348aa27a422480aea29cbfd800b1aabbaabaa[]{b, a, bb, ba, aa};
   }

   public static q2997348aa27a422480aea29cbfd800b1aabbaabaa aa(String var0) {
      return (q2997348aa27a422480aea29cbfd800b1aabbaabaa)Enum.valueOf(q2997348aa27a422480aea29cbfd800b1aabbaabaa.class, var0);
   }

   private static int b(int var0, int var1) {
      int var2 = aaa[var0 ^ -1580853457] ^ var1 ^ var0;
      var2 ^= 48268;
      var2 -= 41737;
      var2 ^= 4818;
      var2 -= 12102;
      var2 += 62774;
      var2 -= 47981;
      var2 += 27179;
      return var2;
   }

   static {
      // $FF: Couldn't be decompiled
   }
}
