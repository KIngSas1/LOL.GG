package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum q2997348aa27a422480aea29cbfd800b1aabbbabb {
   public static final q2997348aa27a422480aea29cbfd800b1aabbbabb a;
   private static final q2997348aa27a422480aea29cbfd800b1aabbbabb[] aa;
   private static final int[] ab;
   private static final Object[] bb;
   public static final q2997348aa27a422480aea29cbfd800b1aabbbabb b;
   private static final String[] ba;

   public static q2997348aa27a422480aea29cbfd800b1aabbbabb a(String var0) {
      return (q2997348aa27a422480aea29cbfd800b1aabbbabb)Enum.valueOf(q2997348aa27a422480aea29cbfd800b1aabbbabb.class, var0);
   }

   private static int b(int var0, int var1) {
      int var2 = ab[var0 ^ 2102584406] ^ var1 ^ var0;
      var2 ^= 18186;
      var2 -= 49022;
      var2 += 32204;
      var2 += 51840;
      var2 ^= 49181;
      var2 ^= 12552;
      var2 -= 60619;
      return var2;
   }

   private static String ab(byte var0, int var1, int var2) {
      int var7 = var1 ^ -1103638925;
      char[] var6 = ba[var7].toCharArray();
      StackTraceElement[] var8 = (StackTraceElement[])bb[var7];
      StackTraceElement[] var9;
      if (var8 != null) {
         var9 = var8;
      } else {
         var9 = (new Throwable()).getStackTrace();
         bb[var7] = var9;
      }

      StackTraceElement var10 = var9[1];
      int var4 = (var10.getClassName().hashCode() ^ var10.getMethodName().hashCode()) >> 16 ^ 7616;
      int var5 = 0;

      do {
         int var10002 = var6[var5] ^ '胲';
         short var10003;
         switch (var5 % 8) {
            case 0:
            default:
               var10003 = 78;
               break;
            case 1:
               var10003 = 163;
               break;
            case 2:
               var10003 = 130;
               break;
            case 3:
               var10003 = 35;
               break;
            case 4:
               var10003 = 194;
               break;
            case 5:
               var10003 = 197;
               break;
            case 6:
               var10003 = 28;
               break;
            case 7:
               var10003 = 133;
         }

         var6[var5] = (char)(var10002 ^ var10003 ^ var5 ^ var4 ^ var1 ^ var0 ^ var2);
         ++var5;
      } while(var5 < var6.length);

      return (new String(var6)).intern();
   }

   private static q2997348aa27a422480aea29cbfd800b1aabbbabb[] aa() {
      return new q2997348aa27a422480aea29cbfd800b1aabbbabb[]{a, b};
   }

   static {
      // $FF: Couldn't be decompiled
   }
}
