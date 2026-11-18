package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
enum q2997348aa27a422480aea29cbfd800b1baaaabb {
   private static final q2997348aa27a422480aea29cbfd800b1baaaabb[] a;
   private static final Object[] aba;
   public static final q2997348aa27a422480aea29cbfd800b1baaaabb b;
   public static final q2997348aa27a422480aea29cbfd800b1baaaabb aa;
   public static final q2997348aa27a422480aea29cbfd800b1baaaabb ab;
   public static final q2997348aa27a422480aea29cbfd800b1baaaabb ba;
   private static final int[] aaa;
   private static final String[] aab;
   public static final q2997348aa27a422480aea29cbfd800b1baaaabb bb;

   static {
      // $FF: Couldn't be decompiled
   }

   private static int b(int var0, int var1) {
      int var2 = aaa[var0 ^ 576992521] ^ var1 ^ var0;
      var2 += 60068;
      var2 ^= 9943;
      var2 ^= 9058;
      var2 -= 43267;
      var2 ^= 53456;
      var2 ^= 37502;
      var2 ^= 57092;
      var2 -= 234;
      var2 ^= 57143;
      var2 -= 2899;
      return var2;
   }

   public static q2997348aa27a422480aea29cbfd800b1baaaabb a(String var0) {
      return (q2997348aa27a422480aea29cbfd800b1baaaabb)Enum.valueOf(q2997348aa27a422480aea29cbfd800b1baaaabb.class, var0);
   }

   private static String ab(int var0, int var1, int var2) {
      int var3 = var2 ^ '\uf4e9';
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
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 19141;
      int var9 = 0;

      do {
         int var10 = var4[var9] - '\uee14';
         var10 ^= 40228;
         var10 -= 44983;
         var10 += 61902;
         var10 -= 47639;
         var10 += 61375;
         var4[var9] = (char)(var10 ^ var8 ^ var1 ^ var0 >> 16);
         ++var9;
      } while(var9 < var4.length);

      return (new String(var4)).intern();
   }

   private static q2997348aa27a422480aea29cbfd800b1baaaabb[] aa() {
      return new q2997348aa27a422480aea29cbfd800b1baaaabb[]{b, ab, aa, ba, bb};
   }
}
