package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
enum q2997348aa27a422480aea29cbfd800b1baaabbaa {
   private static final int[] b;
   public static final q2997348aa27a422480aea29cbfd800b1baaabbaa a;
   public static final q2997348aa27a422480aea29cbfd800b1baaabbaa aa;
   private static final Object[] bb;
   private static final q2997348aa27a422480aea29cbfd800b1baaabbaa[] ab;
   private static final String[] ba;

   static {
      // $FF: Couldn't be decompiled
   }

   private static String ab(char var0, short var1, int var2, int var3, int var4, char var5) {
      int var10 = var3 ^ 1466137507;
      char[] var9 = ba[var10].toCharArray();
      StackTraceElement[] var11 = (StackTraceElement[])bb[var10];
      StackTraceElement[] var12;
      if (var11 != null) {
         var12 = var11;
      } else {
         var12 = (new Throwable()).getStackTrace();
         bb[var10] = var12;
      }

      StackTraceElement var13 = var12[1];
      int var7 = (var13.getClassName().hashCode() ^ var13.getMethodName().hashCode()) >> 16 ^ 27601;

      for(int var8 = 0; var8 < var9.length; ++var8) {
         var9[var8] = (char)(var9[var8] ^ var8 ^ 11878 ^ var0 ^ var5 ^ var3 ^ var2 ^ var7 ^ var4 ^ var1);
      }

      return (new String(var9)).intern();
   }

   private static int b(int var0, int var1) {
      int var2 = b[var0 ^ 745745890] ^ var1 ^ var0;
      var2 ^= 33240;
      var2 += 59081;
      var2 ^= 34097;
      var2 -= 31612;
      var2 ^= 63352;
      var2 -= 25869;
      var2 += 5649;
      var2 ^= 48779;
      var2 += 18762;
      var2 ^= 40147;
      return var2;
   }

   private static q2997348aa27a422480aea29cbfd800b1baaabbaa[] a() {
      return new q2997348aa27a422480aea29cbfd800b1baaabbaa[]{a, aa};
   }

   public static q2997348aa27a422480aea29cbfd800b1baaabbaa aa(String var0) {
      return (q2997348aa27a422480aea29cbfd800b1baaabbaa)Enum.valueOf(q2997348aa27a422480aea29cbfd800b1baaabbaa.class, var0);
   }
}
