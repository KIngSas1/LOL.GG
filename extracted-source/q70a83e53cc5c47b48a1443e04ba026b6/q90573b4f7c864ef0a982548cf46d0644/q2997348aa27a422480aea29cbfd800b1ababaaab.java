package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum q2997348aa27a422480aea29cbfd800b1ababaaab {
   private static final q2997348aa27a422480aea29cbfd800b1ababaaab[] a;
   private static final Object[] abb;
   private static final String[] aba;
   private static final int[] aab;
   public static final q2997348aa27a422480aea29cbfd800b1ababaaab aa;
   private final q2997348aa27a422480aea29cbfd800b1babba ab;
   public static final q2997348aa27a422480aea29cbfd800b1ababaaab b;
   public static final q2997348aa27a422480aea29cbfd800b1ababaaab ba;
   public static final q2997348aa27a422480aea29cbfd800b1ababaaab bb;
   public static final q2997348aa27a422480aea29cbfd800b1ababaaab aaa;

   private static String aa(int var0, int var1) {
      int var3 = var0 ^ -8573461;
      char[] var4 = aba[var3].toCharArray();
      StackTraceElement[] var2 = (StackTraceElement[])abb[var3];
      StackTraceElement[] var5;
      if (var2 != null) {
         var5 = var2;
      } else {
         var5 = (new Throwable()).getStackTrace();
         abb[var3] = var5;
      }

      StackTraceElement var6 = var5[1];
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ -650939359;
      int var8 = 0;

      do {
         short var9;
         switch (var8 & 31) {
            case 0:
            default:
               var9 = 86;
               break;
            case 1:
               var9 = 206;
               break;
            case 2:
               var9 = 31;
               break;
            case 3:
               var9 = 73;
               break;
            case 4:
               var9 = 56;
               break;
            case 5:
               var9 = 242;
               break;
            case 6:
               var9 = 214;
               break;
            case 7:
               var9 = 152;
               break;
            case 8:
               var9 = 53;
               break;
            case 9:
               var9 = 170;
               break;
            case 10:
               var9 = 45;
               break;
            case 11:
               var9 = 208;
               break;
            case 12:
               var9 = 84;
               break;
            case 13:
               var9 = 200;
               break;
            case 14:
               var9 = 182;
               break;
            case 15:
               var9 = 40;
               break;
            case 16:
               var9 = 1;
               break;
            case 17:
               var9 = 68;
               break;
            case 18:
               var9 = 55;
               break;
            case 19:
               var9 = 46;
               break;
            case 20:
               var9 = 82;
               break;
            case 21:
               var9 = 78;
               break;
            case 22:
               var9 = 0;
               break;
            case 23:
               var9 = 6;
               break;
            case 24:
               var9 = 247;
               break;
            case 25:
               var9 = 149;
               break;
            case 26:
               var9 = 165;
               break;
            case 27:
               var9 = 64;
               break;
            case 28:
               var9 = 196;
               break;
            case 29:
               var9 = 154;
               break;
            case 30:
               var9 = 137;
               break;
            case 31:
               var9 = 171;
         }

         var4[var8] = (char)(var4[var8] ^ var9 ^ var1 >> 16 ^ var7);
         ++var8;
      } while(var8 < var4.length);

      return (new String(var4)).intern();
   }

   public String toString() {
      return this.ab.bba();
   }

   private static q2997348aa27a422480aea29cbfd800b1ababaaab[] a() {
      return new q2997348aa27a422480aea29cbfd800b1ababaaab[]{aaa, ba, aa, b, bb};
   }

   private static int b(int var0, int var1) {
      int var2 = aab[var0 ^ -1944662857] ^ var1 ^ var0;
      var2 ^= 50761;
      var2 ^= 19713;
      var2 += 36224;
      var2 += 42541;
      var2 -= 50246;
      var2 += 56093;
      var2 += 5821;
      var2 ^= 7554;
      var2 -= 8602;
      return var2;
   }

   private q2997348aa27a422480aea29cbfd800b1ababaaab(q2997348aa27a422480aea29cbfd800b1babba var3) {
      this.ab = var3;
   }

   static {
      // $FF: Couldn't be decompiled
   }
}
