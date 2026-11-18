package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
enum q2997348aa27a422480aea29cbfd800b1abbbaabb {
   public static final q2997348aa27a422480aea29cbfd800b1abbbaabb a;
   private static final q2997348aa27a422480aea29cbfd800b1abbbaabb[] aa;
   private static final int[] ba;
   private static final Object[] aaa;
   public static final q2997348aa27a422480aea29cbfd800b1abbbaabb b;
   private static final String[] bb;
   public static final q2997348aa27a422480aea29cbfd800b1abbbaabb ab;

   private static int b(int var0, int var1) {
      int var2 = ba[var0 ^ 274705748] ^ var1 ^ var0;
      var2 -= 44416;
      var2 -= 24123;
      var2 ^= 47100;
      var2 += 48349;
      var2 ^= 51363;
      var2 -= 46584;
      var2 ^= 11474;
      var2 += 51683;
      return var2;
   }

   static {
      // $FF: Couldn't be decompiled
   }

   private static String aa(int var0, short var1, short var2, int var3) {
      int var8 = var3 ^ -100183285;
      char[] var7 = bb[var8].toCharArray();
      StackTraceElement[] var9 = (StackTraceElement[])aaa[var8];
      StackTraceElement[] var10;
      if (var9 != null) {
         var10 = var9;
      } else {
         var10 = (new Throwable()).getStackTrace();
         aaa[var8] = var10;
      }

      StackTraceElement var11 = var10[1];
      int var5 = (var11.getClassName().hashCode() ^ var11.getMethodName().hashCode()) >> 16 ^ 22522;

      for(int var6 = 0; var6 < var7.length; ++var6) {
         char var10002 = var7[var6];
         short var10003;
         switch (var6 % 18) {
            case 0:
            default:
               var10003 = 215;
               break;
            case 1:
               var10003 = 125;
               break;
            case 2:
               var10003 = 56;
               break;
            case 3:
               var10003 = 55;
               break;
            case 4:
               var10003 = 54;
               break;
            case 5:
               var10003 = 156;
               break;
            case 6:
               var10003 = 95;
               break;
            case 7:
               var10003 = 217;
               break;
            case 8:
               var10003 = 82;
               break;
            case 9:
               var10003 = 59;
               break;
            case 10:
               var10003 = 17;
               break;
            case 11:
               var10003 = 53;
               break;
            case 12:
               var10003 = 204;
               break;
            case 13:
               var10003 = 185;
               break;
            case 14:
               var10003 = 153;
               break;
            case 15:
               var10003 = 188;
               break;
            case 16:
               var10003 = 111;
               break;
            case 17:
               var10003 = 0;
         }

         var7[var6] = (char)(var10002 ^ var10003 ^ var6 ^ var3 ^ var5 ^ var0 ^ var2 ^ var1);
      }

      return (new String(var7)).intern();
   }

   private static q2997348aa27a422480aea29cbfd800b1abbbaabb[] a() {
      return new q2997348aa27a422480aea29cbfd800b1abbbaabb[]{b, ab, a};
   }
}
