package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
enum q2997348aa27a422480aea29cbfd800b1abbabba {
   public static final q2997348aa27a422480aea29cbfd800b1abbabba a;
   private static final int[] bb;
   public static final q2997348aa27a422480aea29cbfd800b1abbabba aa;
   private static final Object[] aab;
   public static final q2997348aa27a422480aea29cbfd800b1abbabba ab;
   private static final q2997348aa27a422480aea29cbfd800b1abbabba[] ba;
   private static final String[] aaa;
   public static final q2997348aa27a422480aea29cbfd800b1abbabba b;

   private static int b(int var0, int var1) {
      int var2 = bb[var0 ^ 534011842] ^ var1 ^ var0;
      var2 += 5008;
      var2 += 18583;
      var2 -= 56166;
      var2 -= 64721;
      var2 += 53433;
      var2 += 51724;
      return var2;
   }

   private static String aa(int var0, int var1) {
      int var3 = var0 ^ -826471792;
      char[] var4 = aaa[var3].toCharArray();
      StackTraceElement[] var2 = (StackTraceElement[])aab[var3];
      StackTraceElement[] var5;
      if (var2 != null) {
         var5 = var2;
      } else {
         var5 = (new Throwable()).getStackTrace();
         aab[var3] = var5;
      }

      StackTraceElement var6 = var5[1];
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ -2047113517;
      int var8 = 0;

      do {
         short var9;
         switch (var8 & 31) {
            case 0:
            default:
               var9 = 194;
               break;
            case 1:
               var9 = 189;
               break;
            case 2:
               var9 = 102;
               break;
            case 3:
               var9 = 145;
               break;
            case 4:
               var9 = 160;
               break;
            case 5:
               var9 = 131;
               break;
            case 6:
               var9 = 86;
               break;
            case 7:
               var9 = 249;
               break;
            case 8:
               var9 = 78;
               break;
            case 9:
               var9 = 8;
               break;
            case 10:
               var9 = 140;
               break;
            case 11:
               var9 = 9;
               break;
            case 12:
               var9 = 230;
               break;
            case 13:
               var9 = 44;
               break;
            case 14:
               var9 = 28;
               break;
            case 15:
               var9 = 108;
               break;
            case 16:
               var9 = 91;
               break;
            case 17:
               var9 = 77;
               break;
            case 18:
               var9 = 213;
               break;
            case 19:
               var9 = 251;
               break;
            case 20:
               var9 = 207;
               break;
            case 21:
               var9 = 252;
               break;
            case 22:
               var9 = 28;
               break;
            case 23:
               var9 = 110;
               break;
            case 24:
               var9 = 50;
               break;
            case 25:
               var9 = 2;
               break;
            case 26:
               var9 = 38;
               break;
            case 27:
               var9 = 215;
               break;
            case 28:
               var9 = 242;
               break;
            case 29:
               var9 = 50;
               break;
            case 30:
               var9 = 229;
               break;
            case 31:
               var9 = 18;
         }

         var4[var8] = (char)(var4[var8] ^ var9 ^ var1 >> 16 ^ var7);
         ++var8;
      } while(var8 < var4.length);

      return (new String(var4)).intern();
   }

   private static q2997348aa27a422480aea29cbfd800b1abbabba[] a() {
      return new q2997348aa27a422480aea29cbfd800b1abbabba[]{a, aa, ab, b};
   }

   static {
      // $FF: Couldn't be decompiled
   }
}
