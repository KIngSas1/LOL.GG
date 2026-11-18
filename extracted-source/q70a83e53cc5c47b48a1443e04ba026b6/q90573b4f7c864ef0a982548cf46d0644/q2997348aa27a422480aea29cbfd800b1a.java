package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum q2997348aa27a422480aea29cbfd800b1a {
   private static final q2997348aa27a422480aea29cbfd800b1a[] a;
   private static final int[] ab;
   public static final q2997348aa27a422480aea29cbfd800b1a b;
   private static final String[] ba;
   private static final Object[] bb;
   public static final q2997348aa27a422480aea29cbfd800b1a aa;

   public static q2997348aa27a422480aea29cbfd800b1a a(String var0) {
      return (q2997348aa27a422480aea29cbfd800b1a)Enum.valueOf(q2997348aa27a422480aea29cbfd800b1a.class, var0);
   }

   private static int b(int var0, int var1) {
      int var2 = ab[var0 ^ 33419717] ^ var1 ^ var0;
      var2 += 16980;
      var2 -= 27475;
      var2 ^= 44771;
      var2 -= 38291;
      var2 += 48184;
      var2 -= 61042;
      var2 -= 62339;
      var2 += 47088;
      var2 -= 6876;
      return var2;
   }

   private static q2997348aa27a422480aea29cbfd800b1a[] aa() {
      return new q2997348aa27a422480aea29cbfd800b1a[]{aa, b};
   }

   static {
      // $FF: Couldn't be decompiled
   }

   private static String ab(int var0, int var1) {
      int var3 = var0 ^ -1731078630;
      char[] var4 = ba[var3].toCharArray();
      StackTraceElement[] var2 = (StackTraceElement[])bb[var3];
      StackTraceElement[] var5;
      if (var2 != null) {
         var5 = var2;
      } else {
         var5 = (new Throwable()).getStackTrace();
         bb[var3] = var5;
      }

      StackTraceElement var6 = var5[1];
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ 1408164494;
      int var8 = 0;

      do {
         short var9;
         switch (var8 & 31) {
            case 0:
            default:
               var9 = 198;
               break;
            case 1:
               var9 = 36;
               break;
            case 2:
               var9 = 124;
               break;
            case 3:
               var9 = 4;
               break;
            case 4:
               var9 = 175;
               break;
            case 5:
               var9 = 159;
               break;
            case 6:
               var9 = 60;
               break;
            case 7:
               var9 = 133;
               break;
            case 8:
               var9 = 63;
               break;
            case 9:
               var9 = 176;
               break;
            case 10:
               var9 = 11;
               break;
            case 11:
               var9 = 223;
               break;
            case 12:
               var9 = 12;
               break;
            case 13:
               var9 = 220;
               break;
            case 14:
               var9 = 52;
               break;
            case 15:
               var9 = 210;
               break;
            case 16:
               var9 = 102;
               break;
            case 17:
               var9 = 84;
               break;
            case 18:
               var9 = 14;
               break;
            case 19:
               var9 = 142;
               break;
            case 20:
               var9 = 194;
               break;
            case 21:
               var9 = 178;
               break;
            case 22:
               var9 = 238;
               break;
            case 23:
               var9 = 25;
               break;
            case 24:
               var9 = 93;
               break;
            case 25:
               var9 = 30;
               break;
            case 26:
               var9 = 228;
               break;
            case 27:
               var9 = 252;
               break;
            case 28:
               var9 = 138;
               break;
            case 29:
               var9 = 20;
               break;
            case 30:
               var9 = 32;
               break;
            case 31:
               var9 = 220;
         }

         var4[var8] = (char)(var4[var8] ^ var9 ^ var1 >> 16 ^ var7);
         ++var8;
      } while(var8 < var4.length);

      return (new String(var4)).intern();
   }
}
