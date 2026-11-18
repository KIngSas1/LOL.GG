package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
enum q2997348aa27a422480aea29cbfd800b1ababbbaaa {
   public static final q2997348aa27a422480aea29cbfd800b1ababbbaaa a;
   public static final q2997348aa27a422480aea29cbfd800b1ababbbaaa aa;
   private static final String[] aaa;
   private static final Object[] aab;
   private static final q2997348aa27a422480aea29cbfd800b1ababbbaaa[] ab;
   private static final int[] bb;
   public static final q2997348aa27a422480aea29cbfd800b1ababbbaaa b;
   public static final q2997348aa27a422480aea29cbfd800b1ababbbaaa ba;

   public static q2997348aa27a422480aea29cbfd800b1ababbbaaa a(String var0) {
      return (q2997348aa27a422480aea29cbfd800b1ababbbaaa)Enum.valueOf(q2997348aa27a422480aea29cbfd800b1ababbbaaa.class, var0);
   }

   private static int b(int var0, int var1) {
      int var2 = bb[var0 ^ -2013144867] ^ var1 ^ var0;
      var2 -= 44786;
      var2 += 4681;
      var2 ^= 46338;
      var2 += 2646;
      var2 ^= 65118;
      var2 -= 56517;
      var2 ^= 10532;
      var2 ^= 52363;
      return var2;
   }

   private static String ab(int var0, int var1) {
      int var3 = var0 ^ -1982317694;
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
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ 1611353296;
      int var8 = 0;

      do {
         short var9;
         switch (var8 & 31) {
            case 0:
            default:
               var9 = 238;
               break;
            case 1:
               var9 = 204;
               break;
            case 2:
               var9 = 206;
               break;
            case 3:
               var9 = 157;
               break;
            case 4:
               var9 = 206;
               break;
            case 5:
               var9 = 43;
               break;
            case 6:
               var9 = 114;
               break;
            case 7:
               var9 = 48;
               break;
            case 8:
               var9 = 170;
               break;
            case 9:
               var9 = 124;
               break;
            case 10:
               var9 = 228;
               break;
            case 11:
               var9 = 65;
               break;
            case 12:
               var9 = 121;
               break;
            case 13:
               var9 = 94;
               break;
            case 14:
               var9 = 249;
               break;
            case 15:
               var9 = 25;
               break;
            case 16:
               var9 = 196;
               break;
            case 17:
               var9 = 100;
               break;
            case 18:
               var9 = 167;
               break;
            case 19:
               var9 = 27;
               break;
            case 20:
               var9 = 122;
               break;
            case 21:
               var9 = 128;
               break;
            case 22:
               var9 = 100;
               break;
            case 23:
               var9 = 161;
               break;
            case 24:
               var9 = 221;
               break;
            case 25:
               var9 = 203;
               break;
            case 26:
               var9 = 139;
               break;
            case 27:
               var9 = 227;
               break;
            case 28:
               var9 = 152;
               break;
            case 29:
               var9 = 66;
               break;
            case 30:
               var9 = 154;
               break;
            case 31:
               var9 = 52;
         }

         var4[var8] = (char)(var4[var8] ^ var9 ^ var1 >> 16 ^ var7);
         ++var8;
      } while(var8 < var4.length);

      return (new String(var4)).intern();
   }

   static {
      // $FF: Couldn't be decompiled
   }

   private static q2997348aa27a422480aea29cbfd800b1ababbbaaa[] aa() {
      return new q2997348aa27a422480aea29cbfd800b1ababbbaaa[]{b, ba, a, aa};
   }
}
