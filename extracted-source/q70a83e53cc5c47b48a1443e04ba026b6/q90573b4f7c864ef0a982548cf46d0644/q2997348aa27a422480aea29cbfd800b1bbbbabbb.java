package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum q2997348aa27a422480aea29cbfd800b1bbbbabbb {
   private final q2997348aa27a422480aea29cbfd800b1babba a;
   private static final q2997348aa27a422480aea29cbfd800b1bbbbabbb[] b;
   public static final q2997348aa27a422480aea29cbfd800b1bbbbabbb aa;
   private static final int[] bb;
   public static final q2997348aa27a422480aea29cbfd800b1bbbbabbb ab;
   private static final String[] aaa;
   private static final Object[] aab;
   public static final q2997348aa27a422480aea29cbfd800b1bbbbabbb ba;

   private static String aa(int var0, int var1) {
      int var3 = var0 ^ -1587352822;
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
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ 1741435207;
      int var8 = 0;

      do {
         short var9;
         switch (var8 & 31) {
            case 0:
            default:
               var9 = 218;
               break;
            case 1:
               var9 = 86;
               break;
            case 2:
               var9 = 5;
               break;
            case 3:
               var9 = 66;
               break;
            case 4:
               var9 = 100;
               break;
            case 5:
               var9 = 114;
               break;
            case 6:
               var9 = 133;
               break;
            case 7:
               var9 = 111;
               break;
            case 8:
               var9 = 15;
               break;
            case 9:
               var9 = 52;
               break;
            case 10:
               var9 = 126;
               break;
            case 11:
               var9 = 251;
               break;
            case 12:
               var9 = 254;
               break;
            case 13:
               var9 = 144;
               break;
            case 14:
               var9 = 162;
               break;
            case 15:
               var9 = 236;
               break;
            case 16:
               var9 = 229;
               break;
            case 17:
               var9 = 168;
               break;
            case 18:
               var9 = 129;
               break;
            case 19:
               var9 = 199;
               break;
            case 20:
               var9 = 106;
               break;
            case 21:
               var9 = 38;
               break;
            case 22:
               var9 = 242;
               break;
            case 23:
               var9 = 87;
               break;
            case 24:
               var9 = 240;
               break;
            case 25:
               var9 = 145;
               break;
            case 26:
               var9 = 120;
               break;
            case 27:
               var9 = 101;
               break;
            case 28:
               var9 = 210;
               break;
            case 29:
               var9 = 79;
               break;
            case 30:
               var9 = 116;
               break;
            case 31:
               var9 = 173;
         }

         var4[var8] = (char)(var4[var8] ^ var9 ^ var1 >> 16 ^ var7);
         ++var8;
      } while(var8 < var4.length);

      return (new String(var4)).intern();
   }

   private static q2997348aa27a422480aea29cbfd800b1bbbbabbb[] a() {
      return new q2997348aa27a422480aea29cbfd800b1bbbbabbb[]{ba, ab, aa};
   }

   static {
      // $FF: Couldn't be decompiled
   }

   private q2997348aa27a422480aea29cbfd800b1bbbbabbb(q2997348aa27a422480aea29cbfd800b1babba var3) {
      this.a = var3;
   }

   private static int b(int var0, int var1) {
      int var2 = bb[var0 ^ 1132721049] ^ var1 ^ var0;
      var2 ^= 61246;
      var2 += 60169;
      var2 -= 17276;
      var2 += 27977;
      var2 += 46811;
      var2 ^= 4394;
      var2 += 55241;
      return var2;
   }

   public String toString() {
      return this.a.bba();
   }
}
