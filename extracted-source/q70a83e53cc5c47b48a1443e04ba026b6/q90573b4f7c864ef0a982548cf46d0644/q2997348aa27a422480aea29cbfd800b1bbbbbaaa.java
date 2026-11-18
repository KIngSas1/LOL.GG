package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
enum q2997348aa27a422480aea29cbfd800b1bbbbbaaa implements q2997348aa27a422480aea29cbfd800b1aabbbabab {
   private final q2997348aa27a422480aea29cbfd800b1babba a;
   public static final q2997348aa27a422480aea29cbfd800b1bbbbbaaa b;
   private static final String[] aaa;
   private static final Object[] aab;
   public static final q2997348aa27a422480aea29cbfd800b1bbbbbaaa aa;
   private static final int[] bb;
   public static final q2997348aa27a422480aea29cbfd800b1bbbbbaaa ab;
   private static final q2997348aa27a422480aea29cbfd800b1bbbbbaaa[] ba;

   private q2997348aa27a422480aea29cbfd800b1bbbbbaaa(q2997348aa27a422480aea29cbfd800b1babba var3) {
      this.a = var3;
   }

   private static String aa(int var0, int var1) {
      int var3 = var0 ^ 1408693778;
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
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ -2112577639;
      int var8 = 0;

      do {
         short var9;
         switch (var8 & 31) {
            case 0:
            default:
               var9 = 202;
               break;
            case 1:
               var9 = 226;
               break;
            case 2:
               var9 = 233;
               break;
            case 3:
               var9 = 134;
               break;
            case 4:
               var9 = 13;
               break;
            case 5:
               var9 = 101;
               break;
            case 6:
               var9 = 239;
               break;
            case 7:
               var9 = 165;
               break;
            case 8:
               var9 = 174;
               break;
            case 9:
               var9 = 166;
               break;
            case 10:
               var9 = 96;
               break;
            case 11:
               var9 = 94;
               break;
            case 12:
               var9 = 1;
               break;
            case 13:
               var9 = 237;
               break;
            case 14:
               var9 = 83;
               break;
            case 15:
               var9 = 131;
               break;
            case 16:
               var9 = 187;
               break;
            case 17:
               var9 = 100;
               break;
            case 18:
               var9 = 202;
               break;
            case 19:
               var9 = 177;
               break;
            case 20:
               var9 = 8;
               break;
            case 21:
               var9 = 62;
               break;
            case 22:
               var9 = 163;
               break;
            case 23:
               var9 = 155;
               break;
            case 24:
               var9 = 75;
               break;
            case 25:
               var9 = 168;
               break;
            case 26:
               var9 = 181;
               break;
            case 27:
               var9 = 196;
               break;
            case 28:
               var9 = 79;
               break;
            case 29:
               var9 = 164;
               break;
            case 30:
               var9 = 1;
               break;
            case 31:
               var9 = 135;
         }

         var4[var8] = (char)(var4[var8] ^ var9 ^ var1 >> 16 ^ var7);
         ++var8;
      } while(var8 < var4.length);

      return (new String(var4)).intern();
   }

   public String toString() {
      return this.a.bba();
   }

   private static int a(int var0, int var1) {
      int var2 = bb[var0 ^ 1242651608] ^ var1 ^ var0;
      var2 += 54965;
      var2 += 58095;
      var2 -= 30386;
      var2 ^= 53941;
      var2 += 9520;
      var2 -= 25663;
      var2 -= 15758;
      var2 += 56913;
      return var2;
   }

   static {
      // $FF: Couldn't be decompiled
   }

   private static q2997348aa27a422480aea29cbfd800b1bbbbbaaa[] b() {
      return new q2997348aa27a422480aea29cbfd800b1bbbbbaaa[]{b, aa, ab};
   }
}
