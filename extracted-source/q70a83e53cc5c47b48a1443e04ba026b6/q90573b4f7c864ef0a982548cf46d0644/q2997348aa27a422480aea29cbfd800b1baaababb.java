package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
enum q2997348aa27a422480aea29cbfd800b1baaababb {
   private static final String[] bb;
   public static final q2997348aa27a422480aea29cbfd800b1baaababb a;
   private static final Object[] aaa;
   public static final q2997348aa27a422480aea29cbfd800b1baaababb aa;
   private static final int[] ba;
   private static final q2997348aa27a422480aea29cbfd800b1baaababb[] ab;
   public static final q2997348aa27a422480aea29cbfd800b1baaababb b;

   static {
      // $FF: Couldn't be decompiled
   }

   private static int b(int var0, int var1) {
      int var2 = ba[var0 ^ -1365202619] ^ var1 ^ var0;
      var2 += 22725;
      var2 ^= 35330;
      var2 -= 10635;
      var2 += 31811;
      var2 += 31002;
      var2 += 17004;
      return var2;
   }

   private static q2997348aa27a422480aea29cbfd800b1baaababb[] a() {
      return new q2997348aa27a422480aea29cbfd800b1baaababb[]{b, a, aa};
   }

   private static String aa(int var0, int var1) {
      int var3 = var0 ^ -1619183731;
      char[] var4 = bb[var3].toCharArray();
      StackTraceElement[] var2 = (StackTraceElement[])aaa[var3];
      StackTraceElement[] var5;
      if (var2 != null) {
         var5 = var2;
      } else {
         var5 = (new Throwable()).getStackTrace();
         aaa[var3] = var5;
      }

      StackTraceElement var6 = var5[1];
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ -986219303;
      int var8 = 0;

      do {
         short var9;
         switch (var8 & 31) {
            case 0:
            default:
               var9 = 149;
               break;
            case 1:
               var9 = 114;
               break;
            case 2:
               var9 = 102;
               break;
            case 3:
               var9 = 49;
               break;
            case 4:
               var9 = 104;
               break;
            case 5:
               var9 = 187;
               break;
            case 6:
               var9 = 178;
               break;
            case 7:
               var9 = 218;
               break;
            case 8:
               var9 = 98;
               break;
            case 9:
               var9 = 211;
               break;
            case 10:
               var9 = 199;
               break;
            case 11:
               var9 = 104;
               break;
            case 12:
               var9 = 231;
               break;
            case 13:
               var9 = 221;
               break;
            case 14:
               var9 = 156;
               break;
            case 15:
               var9 = 134;
               break;
            case 16:
               var9 = 48;
               break;
            case 17:
               var9 = 7;
               break;
            case 18:
               var9 = 204;
               break;
            case 19:
               var9 = 110;
               break;
            case 20:
               var9 = 56;
               break;
            case 21:
               var9 = 247;
               break;
            case 22:
               var9 = 68;
               break;
            case 23:
               var9 = 230;
               break;
            case 24:
               var9 = 121;
               break;
            case 25:
               var9 = 67;
               break;
            case 26:
               var9 = 246;
               break;
            case 27:
               var9 = 33;
               break;
            case 28:
               var9 = 100;
               break;
            case 29:
               var9 = 134;
               break;
            case 30:
               var9 = 74;
               break;
            case 31:
               var9 = 78;
         }

         var4[var8] = (char)(var4[var8] ^ var9 ^ var1 >> 16 ^ var7);
         ++var8;
      } while(var8 < var4.length);

      return (new String(var4)).intern();
   }
}
