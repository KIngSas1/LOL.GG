package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum q2997348aa27a422480aea29cbfd800b1aabaaaaa {
   private static final int[] b;
   public static final q2997348aa27a422480aea29cbfd800b1aabaaaaa a;
   private static final String[] bb;
   private static final Object[] aaa;
   public static final q2997348aa27a422480aea29cbfd800b1aabaaaaa aa;
   public static final q2997348aa27a422480aea29cbfd800b1aabaaaaa ab;
   private static final q2997348aa27a422480aea29cbfd800b1aabaaaaa[] ba;

   private static int b(int var0, int var1) {
      int var2 = b[var0 ^ -698481120] ^ var1 ^ var0;
      var2 -= 13206;
      var2 ^= 1446;
      var2 += 6289;
      var2 ^= 60836;
      var2 ^= 3631;
      var2 -= 53780;
      var2 ^= 5793;
      var2 -= 44830;
      return var2;
   }

   private static q2997348aa27a422480aea29cbfd800b1aabaaaaa[] a() {
      return new q2997348aa27a422480aea29cbfd800b1aabaaaaa[]{ab, aa, a};
   }

   static {
      // $FF: Couldn't be decompiled
   }

   private static String aa(char var0, char var1, int var2, int var3, short var4, int var5, byte var6) {
      int var11 = var3 ^ -1248346774;
      char[] var10 = bb[var11].toCharArray();
      StackTraceElement[] var12 = (StackTraceElement[])aaa[var11];
      StackTraceElement[] var13;
      if (var12 != null) {
         var13 = var12;
      } else {
         var13 = (new Throwable()).getStackTrace();
         aaa[var11] = var13;
      }

      StackTraceElement var14 = var13[1];
      int var8 = (var14.getClassName().hashCode() ^ var14.getMethodName().hashCode()) >> 16 ^ 28381;

      for(int var9 = 0; var9 < var10.length; ++var9) {
         char var10002 = var10[var9];
         short var10003;
         switch (var9 % 17) {
            case 0:
            default:
               var10003 = 215;
               break;
            case 1:
               var10003 = 124;
               break;
            case 2:
               var10003 = 128;
               break;
            case 3:
               var10003 = 108;
               break;
            case 4:
               var10003 = 39;
               break;
            case 5:
               var10003 = 177;
               break;
            case 6:
               var10003 = 161;
               break;
            case 7:
               var10003 = 11;
               break;
            case 8:
               var10003 = 173;
               break;
            case 9:
               var10003 = 190;
               break;
            case 10:
               var10003 = 33;
               break;
            case 11:
               var10003 = 143;
               break;
            case 12:
               var10003 = 255;
               break;
            case 13:
               var10003 = 147;
               break;
            case 14:
               var10003 = 245;
               break;
            case 15:
               var10003 = 41;
               break;
            case 16:
               var10003 = 150;
         }

         var10[var9] = (char)(var10002 ^ var10003 ^ var2 ^ var6 ^ var0 ^ var4 ^ var1 ^ var3 ^ var5 ^ var8);
      }

      return (new String(var10)).intern();
   }
}
