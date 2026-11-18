package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum q2997348aa27a422480aea29cbfd800b1abbaabb {
   private static final int[] ab;
   private static final String[] ba;
   private static final q2997348aa27a422480aea29cbfd800b1abbaabb[] a;
   public static final q2997348aa27a422480aea29cbfd800b1abbaabb b;
   private static final Object[] bb;
   public static final q2997348aa27a422480aea29cbfd800b1abbaabb aa;

   static {
      // $FF: Couldn't be decompiled
   }

   private static int b(int var0, int var1) {
      int var2 = ab[var0 ^ -1677113548] ^ var1 ^ var0;
      var2 += 56690;
      var2 ^= 4866;
      var2 ^= 13683;
      var2 -= 51433;
      var2 += 4377;
      var2 ^= 19445;
      return var2;
   }

   private static String aa(char var0, int var1, char var2) {
      int var3 = var2 ^ '\uf447';
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
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 20647;
      int var9 = 0;

      do {
         int var10 = var4[var9] + 30125;
         var10 ^= 6203;
         var10 += 48139;
         var10 ^= 53896;
         var10 -= 58642;
         var4[var9] = (char)(var10 ^ var8 ^ var0 ^ var1 >> 16);
         ++var9;
      } while(var9 < var4.length);

      return (new String(var4)).intern();
   }

   private static q2997348aa27a422480aea29cbfd800b1abbaabb[] a() {
      return new q2997348aa27a422480aea29cbfd800b1abbaabb[]{b, aa};
   }
}
