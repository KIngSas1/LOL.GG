package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
enum q2997348aa27a422480aea29cbfd800b1baaaaa implements q2997348aa27a422480aea29cbfd800b1aabbbabab {
   public static final q2997348aa27a422480aea29cbfd800b1baaaaa a;
   private final q2997348aa27a422480aea29cbfd800b1babba aa;
   public static final q2997348aa27a422480aea29cbfd800b1baaaaa b;
   private static final int[] bb;
   private static final q2997348aa27a422480aea29cbfd800b1baaaaa[] ab;
   public static final q2997348aa27a422480aea29cbfd800b1baaaaa ba;
   private static final Object[] aab;
   private static final String[] aaa;

   private static q2997348aa27a422480aea29cbfd800b1baaaaa[] b() {
      return new q2997348aa27a422480aea29cbfd800b1baaaaa[]{b, ba, a};
   }

   private static String aa(int var0, int var1) {
      int var3 = var0 ^ -632046576;
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
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ 151282768;
      int var8 = 0;

      do {
         short var9;
         switch (var8 & 31) {
            case 0:
            default:
               var9 = 36;
               break;
            case 1:
               var9 = 203;
               break;
            case 2:
               var9 = 254;
               break;
            case 3:
               var9 = 225;
               break;
            case 4:
               var9 = 247;
               break;
            case 5:
               var9 = 125;
               break;
            case 6:
               var9 = 200;
               break;
            case 7:
               var9 = 104;
               break;
            case 8:
               var9 = 34;
               break;
            case 9:
               var9 = 17;
               break;
            case 10:
               var9 = 14;
               break;
            case 11:
               var9 = 132;
               break;
            case 12:
               var9 = 181;
               break;
            case 13:
               var9 = 187;
               break;
            case 14:
               var9 = 163;
               break;
            case 15:
               var9 = 223;
               break;
            case 16:
               var9 = 0;
               break;
            case 17:
               var9 = 187;
               break;
            case 18:
               var9 = 116;
               break;
            case 19:
               var9 = 50;
               break;
            case 20:
               var9 = 77;
               break;
            case 21:
               var9 = 168;
               break;
            case 22:
               var9 = 243;
               break;
            case 23:
               var9 = 59;
               break;
            case 24:
               var9 = 237;
               break;
            case 25:
               var9 = 242;
               break;
            case 26:
               var9 = 192;
               break;
            case 27:
               var9 = 218;
               break;
            case 28:
               var9 = 151;
               break;
            case 29:
               var9 = 210;
               break;
            case 30:
               var9 = 63;
               break;
            case 31:
               var9 = 86;
         }

         var4[var8] = (char)(var4[var8] ^ var9 ^ var1 >> 16 ^ var7);
         ++var8;
      } while(var8 < var4.length);

      return (new String(var4)).intern();
   }

   static {
      // $FF: Couldn't be decompiled
   }

   private static int a(int var0, int var1) {
      int var2 = bb[var0 ^ -1058901695] ^ var1 ^ var0;
      var2 -= 28379;
      var2 += 37745;
      var2 -= 21752;
      var2 += 40504;
      var2 -= 26876;
      var2 -= 33933;
      var2 ^= 50380;
      var2 += 60365;
      var2 ^= 6813;
      return var2;
   }

   public String toString() {
      return this.aa.bba();
   }

   private q2997348aa27a422480aea29cbfd800b1baaaaa(q2997348aa27a422480aea29cbfd800b1babba var3) {
      this.aa = var3;
   }
}
