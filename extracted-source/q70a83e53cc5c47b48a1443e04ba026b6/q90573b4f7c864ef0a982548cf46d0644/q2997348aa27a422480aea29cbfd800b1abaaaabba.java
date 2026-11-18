package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
enum q2997348aa27a422480aea29cbfd800b1abaaaabba {
   private static final Object[] aba;
   public static final q2997348aa27a422480aea29cbfd800b1abaaaabba a;
   private static final q2997348aa27a422480aea29cbfd800b1abaaaabba[] aa;
   public static final q2997348aa27a422480aea29cbfd800b1abaaaabba b;
   private static final String[] aab;
   public static final q2997348aa27a422480aea29cbfd800b1abaaaabba ab;
   private static final int[] aaa;
   public static final q2997348aa27a422480aea29cbfd800b1abaaaabba ba;
   public static final q2997348aa27a422480aea29cbfd800b1abaaaabba bb;

   private static q2997348aa27a422480aea29cbfd800b1abaaaabba[] a() {
      return new q2997348aa27a422480aea29cbfd800b1abaaaabba[]{ba, bb, b, a, ab};
   }

   public static q2997348aa27a422480aea29cbfd800b1abaaaabba aa(String var0) {
      return (q2997348aa27a422480aea29cbfd800b1abaaaabba)Enum.valueOf(q2997348aa27a422480aea29cbfd800b1abaaaabba.class, var0);
   }

   private static int b(int var0, int var1) {
      int var2 = aaa[var0 ^ -1105739126] ^ var1 ^ var0;
      var2 -= 23932;
      var2 -= 12686;
      var2 ^= 52604;
      var2 ^= 961;
      var2 ^= 56346;
      var2 ^= 11695;
      var2 += 47626;
      var2 += 41469;
      var2 += 36810;
      var2 += 48845;
      return var2;
   }

   private static String ab(short var0, char var1, byte var2, int var3) {
      int var8 = var3 ^ 2024254901;
      char[] var7 = aab[var8].toCharArray();
      StackTraceElement[] var9 = (StackTraceElement[])aba[var8];
      StackTraceElement[] var10;
      if (var9 != null) {
         var10 = var9;
      } else {
         var10 = (new Throwable()).getStackTrace();
         aba[var8] = var10;
      }

      StackTraceElement var11 = var10[1];
      int var5 = (var11.getClassName().hashCode() ^ var11.getMethodName().hashCode()) >> 16 ^ 8264;

      for(int var6 = 0; var6 < var7.length; ++var6) {
         var7[var6] = (char)(var7[var6] ^ '蕪' ^ var6 ^ var1 ^ var2 ^ var0 ^ var5 ^ var3);
      }

      return (new String(var7)).intern();
   }

   static {
      // $FF: Couldn't be decompiled
   }
}
