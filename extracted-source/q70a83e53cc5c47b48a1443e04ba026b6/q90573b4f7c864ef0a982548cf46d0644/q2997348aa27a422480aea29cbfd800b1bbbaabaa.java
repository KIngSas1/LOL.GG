package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
enum q2997348aa27a422480aea29cbfd800b1bbbaabaa {
   private static final Object[] bb;
   private static final int[] ab;
   public static final q2997348aa27a422480aea29cbfd800b1bbbaabaa a;
   private static final q2997348aa27a422480aea29cbfd800b1bbbaabaa[] aa;
   private static final String[] ba;
   public static final q2997348aa27a422480aea29cbfd800b1bbbaabaa b;

   static {
      // $FF: Couldn't be decompiled
   }

   private static int b(int var0, int var1) {
      int var2 = ab[var0 ^ -1968884657] ^ var1 ^ var0;
      var2 -= 49711;
      var2 -= 34860;
      var2 -= 15333;
      var2 += 54791;
      var2 ^= 51649;
      var2 -= 38750;
      return var2;
   }

   private static String aa(short var0, short var1, int var2, char var3, char var4) {
      int var9 = var2 ^ -1945316870;
      char[] var8 = ba[var9].toCharArray();
      StackTraceElement[] var10 = (StackTraceElement[])bb[var9];
      StackTraceElement[] var11;
      if (var10 != null) {
         var11 = var10;
      } else {
         var11 = (new Throwable()).getStackTrace();
         bb[var9] = var11;
      }

      StackTraceElement var12 = var11[1];
      int var6 = (var12.getClassName().hashCode() ^ var12.getMethodName().hashCode()) >> 16 ^ 'ꓔ';

      for(int var7 = 0; var7 < var8.length; ++var7) {
         var8[var7] = (char)(var8[var7] ^ 32645 ^ var7 ^ var6 ^ var1 ^ var2 ^ var0 ^ var4 ^ var3);
      }

      return (new String(var8)).intern();
   }

   private static q2997348aa27a422480aea29cbfd800b1bbbaabaa[] a() {
      return new q2997348aa27a422480aea29cbfd800b1bbbaabaa[]{b, a};
   }
}
