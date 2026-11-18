package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum q2997348aa27a422480aea29cbfd800b1aaaabaaba {
   public static final q2997348aa27a422480aea29cbfd800b1aaaabaaba a;
   public static final q2997348aa27a422480aea29cbfd800b1aaaabaaba aa;
   private static final Object[] aab;
   private static final int[] bb;
   private final q2997348aa27a422480aea29cbfd800b1babba ab;
   private static final String[] aaa;
   private static final q2997348aa27a422480aea29cbfd800b1aaaabaaba[] b;
   public static final q2997348aa27a422480aea29cbfd800b1aaaabaaba ba;

   public static q2997348aa27a422480aea29cbfd800b1aaaabaaba a(String var0) {
      return (q2997348aa27a422480aea29cbfd800b1aaaabaaba)Enum.valueOf(q2997348aa27a422480aea29cbfd800b1aaaabaaba.class, var0);
   }

   private q2997348aa27a422480aea29cbfd800b1aaaabaaba(q2997348aa27a422480aea29cbfd800b1babba var3) {
      this.ab = var3;
   }

   public q2997348aa27a422480aea29cbfd800b1babba aa() {
      return this.ab;
   }

   private static q2997348aa27a422480aea29cbfd800b1aaaabaaba[] b() {
      return new q2997348aa27a422480aea29cbfd800b1aaaabaaba[]{aa, ba, a};
   }

   private static String ba(int var0, int var1) {
      int var3 = var0 ^ -1853404512;
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
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ 1560254705;
      int var8 = 0;

      do {
         short var9;
         switch (var8 & 31) {
            case 0:
            default:
               var9 = 59;
               break;
            case 1:
               var9 = 82;
               break;
            case 2:
               var9 = 249;
               break;
            case 3:
               var9 = 136;
               break;
            case 4:
               var9 = 242;
               break;
            case 5:
               var9 = 95;
               break;
            case 6:
               var9 = 73;
               break;
            case 7:
               var9 = 82;
               break;
            case 8:
               var9 = 191;
               break;
            case 9:
               var9 = 219;
               break;
            case 10:
               var9 = 137;
               break;
            case 11:
               var9 = 113;
               break;
            case 12:
               var9 = 149;
               break;
            case 13:
               var9 = 172;
               break;
            case 14:
               var9 = 127;
               break;
            case 15:
               var9 = 98;
               break;
            case 16:
               var9 = 191;
               break;
            case 17:
               var9 = 106;
               break;
            case 18:
               var9 = 191;
               break;
            case 19:
               var9 = 231;
               break;
            case 20:
               var9 = 155;
               break;
            case 21:
               var9 = 137;
               break;
            case 22:
               var9 = 43;
               break;
            case 23:
               var9 = 211;
               break;
            case 24:
               var9 = 61;
               break;
            case 25:
               var9 = 58;
               break;
            case 26:
               var9 = 12;
               break;
            case 27:
               var9 = 56;
               break;
            case 28:
               var9 = 4;
               break;
            case 29:
               var9 = 253;
               break;
            case 30:
               var9 = 74;
               break;
            case 31:
               var9 = 176;
         }

         var4[var8] = (char)(var4[var8] ^ var9 ^ var1 >> 16 ^ var7);
         ++var8;
      } while(var8 < var4.length);

      return (new String(var4)).intern();
   }

   static {
      // $FF: Couldn't be decompiled
   }

   private static int ab(int var0, int var1) {
      int var2 = bb[var0 ^ -1541566718] ^ var1 ^ var0;
      var2 += 18189;
      var2 -= 32752;
      var2 ^= 64265;
      var2 += 57434;
      var2 += 10506;
      var2 -= 23901;
      var2 -= 31875;
      var2 ^= 20073;
      var2 -= 25104;
      return var2;
   }

   public String toString() {
      return this.ab.bba();
   }
}
