package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum q2997348aa27a422480aea29cbfd800b1ababbbbbb {
   private static final Object[] aaa;
   private final q2997348aa27a422480aea29cbfd800b1babba a;
   public static final q2997348aa27a422480aea29cbfd800b1ababbbbbb b;
   private static final int[] ba;
   private static final String[] bb;
   public static final q2997348aa27a422480aea29cbfd800b1ababbbbbb aa;
   private static final q2997348aa27a422480aea29cbfd800b1ababbbbbb[] ab;

   public String toString() {
      return this.a.bba();
   }

   private static int b(int var0, int var1) {
      int var2 = ba[var0 ^ -1692865469] ^ var1 ^ var0;
      var2 += 58379;
      var2 ^= 57116;
      var2 ^= 22971;
      var2 ^= 53426;
      var2 += 33461;
      var2 -= 63125;
      var2 -= 35683;
      return var2;
   }

   private static q2997348aa27a422480aea29cbfd800b1ababbbbbb[] a() {
      return new q2997348aa27a422480aea29cbfd800b1ababbbbbb[]{b, aa};
   }

   private static String aa(int var0, int var1) {
      int var3 = var0 ^ -1616103623;
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
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ -1910261034;
      int var8 = 0;

      do {
         short var9;
         switch (var8 & 31) {
            case 0:
            default:
               var9 = 251;
               break;
            case 1:
               var9 = 15;
               break;
            case 2:
               var9 = 220;
               break;
            case 3:
               var9 = 128;
               break;
            case 4:
               var9 = 93;
               break;
            case 5:
               var9 = 105;
               break;
            case 6:
               var9 = 91;
               break;
            case 7:
               var9 = 39;
               break;
            case 8:
               var9 = 167;
               break;
            case 9:
               var9 = 238;
               break;
            case 10:
               var9 = 97;
               break;
            case 11:
               var9 = 224;
               break;
            case 12:
               var9 = 252;
               break;
            case 13:
               var9 = 48;
               break;
            case 14:
               var9 = 9;
               break;
            case 15:
               var9 = 100;
               break;
            case 16:
               var9 = 221;
               break;
            case 17:
               var9 = 41;
               break;
            case 18:
               var9 = 161;
               break;
            case 19:
               var9 = 125;
               break;
            case 20:
               var9 = 128;
               break;
            case 21:
               var9 = 81;
               break;
            case 22:
               var9 = 242;
               break;
            case 23:
               var9 = 79;
               break;
            case 24:
               var9 = 109;
               break;
            case 25:
               var9 = 138;
               break;
            case 26:
               var9 = 136;
               break;
            case 27:
               var9 = 59;
               break;
            case 28:
               var9 = 60;
               break;
            case 29:
               var9 = 119;
               break;
            case 30:
               var9 = 121;
               break;
            case 31:
               var9 = 154;
         }

         var4[var8] = (char)(var4[var8] ^ var9 ^ var1 >> 16 ^ var7);
         ++var8;
      } while(var8 < var4.length);

      return (new String(var4)).intern();
   }

   static {
      // $FF: Couldn't be decompiled
   }

   private q2997348aa27a422480aea29cbfd800b1ababbbbbb(q2997348aa27a422480aea29cbfd800b1babba var3) {
      this.a = var3;
   }
}
