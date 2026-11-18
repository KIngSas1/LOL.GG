package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
enum q2997348aa27a422480aea29cbfd800b1babaaba {
   public static final q2997348aa27a422480aea29cbfd800b1babaaba a;
   public static final q2997348aa27a422480aea29cbfd800b1babaaba aa;
   private static final int[] b;
   public static final q2997348aa27a422480aea29cbfd800b1babaaba ab;
   private static final String[] aaa;
   public static final q2997348aa27a422480aea29cbfd800b1babaaba ba;
   private static final Object[] aab;
   private static final q2997348aa27a422480aea29cbfd800b1babaaba[] bb;

   private static String aa(int var0, int var1, char var2) {
      int var3 = var2 ^ 1625;
      char[] var4 = aaa[var3].toCharArray();
      StackTraceElement[] var5 = (StackTraceElement[])aab[var3];
      StackTraceElement[] var6;
      if (var5 != null) {
         var6 = var5;
      } else {
         var6 = (new Throwable()).getStackTrace();
         aab[var3] = var6;
      }

      StackTraceElement var7 = var6[1];
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 4832;
      int var9 = 0;

      do {
         int var10 = var4[var9] - '뽝';
         var10 += 61578;
         var10 += 62830;
         var10 += 15500;
         var10 ^= 63762;
         var10 -= 28376;
         var10 += 17866;
         var10 -= 47150;
         var4[var9] = (char)(var10 ^ var8 ^ var1 ^ var0 >> 16);
         ++var9;
      } while(var9 < var4.length);

      return (new String(var4)).intern();
   }

   private static q2997348aa27a422480aea29cbfd800b1babaaba[] a() {
      return new q2997348aa27a422480aea29cbfd800b1babaaba[]{ab, a, ba, aa};
   }

   private static int b(int var0, int var1) {
      int var2 = b[var0 ^ 128174030] ^ var1 ^ var0;
      var2 ^= 22842;
      var2 -= 44051;
      var2 += 65087;
      var2 -= 35005;
      var2 += 31896;
      var2 += 5689;
      return var2;
   }

   static {
      // $FF: Couldn't be decompiled
   }
}
