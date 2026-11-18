package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
enum q2997348aa27a422480aea29cbfd800b1aaababbab {
   private static final int[] ba;
   private final q2997348aa27a422480aea29cbfd800b1babba a;
   private static final Object[] aaa;
   private static final q2997348aa27a422480aea29cbfd800b1aaababbab[] b;
   public static final q2997348aa27a422480aea29cbfd800b1aaababbab aa;
   public static final q2997348aa27a422480aea29cbfd800b1aaababbab ab;
   private static final String[] bb;

   public static q2997348aa27a422480aea29cbfd800b1aaababbab a(String var0) {
      return (q2997348aa27a422480aea29cbfd800b1aaababbab)Enum.valueOf(q2997348aa27a422480aea29cbfd800b1aaababbab.class, var0);
   }

   static {
      // $FF: Couldn't be decompiled
   }

   private static q2997348aa27a422480aea29cbfd800b1aaababbab[] aa() {
      return new q2997348aa27a422480aea29cbfd800b1aaababbab[]{aa, ab};
   }

   private static int b(int var0, int var1) {
      int var2 = ba[var0 ^ 2017449194] ^ var1 ^ var0;
      var2 -= 32050;
      var2 -= 41636;
      var2 += 30434;
      var2 ^= 56798;
      var2 ^= 36725;
      var2 += 39219;
      var2 -= 15898;
      var2 -= 27012;
      var2 += 50333;
      var2 ^= 22852;
      return var2;
   }

   private q2997348aa27a422480aea29cbfd800b1aaababbab(q2997348aa27a422480aea29cbfd800b1babba var3) {
      this.a = var3;
   }

   private static String ab(int var0, int var1) {
      int var3 = var0 ^ -753263358;
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
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ -1880292459;
      int var8 = 0;

      do {
         short var9;
         switch (var8 & 31) {
            case 0:
            default:
               var9 = 31;
               break;
            case 1:
               var9 = 140;
               break;
            case 2:
               var9 = 212;
               break;
            case 3:
               var9 = 199;
               break;
            case 4:
               var9 = 105;
               break;
            case 5:
               var9 = 97;
               break;
            case 6:
               var9 = 120;
               break;
            case 7:
               var9 = 152;
               break;
            case 8:
               var9 = 191;
               break;
            case 9:
               var9 = 151;
               break;
            case 10:
               var9 = 31;
               break;
            case 11:
               var9 = 8;
               break;
            case 12:
               var9 = 188;
               break;
            case 13:
               var9 = 232;
               break;
            case 14:
               var9 = 142;
               break;
            case 15:
               var9 = 24;
               break;
            case 16:
               var9 = 95;
               break;
            case 17:
               var9 = 7;
               break;
            case 18:
               var9 = 127;
               break;
            case 19:
               var9 = 47;
               break;
            case 20:
               var9 = 215;
               break;
            case 21:
               var9 = 210;
               break;
            case 22:
               var9 = 126;
               break;
            case 23:
               var9 = 68;
               break;
            case 24:
               var9 = 0;
               break;
            case 25:
               var9 = 43;
               break;
            case 26:
               var9 = 248;
               break;
            case 27:
               var9 = 136;
               break;
            case 28:
               var9 = 244;
               break;
            case 29:
               var9 = 131;
               break;
            case 30:
               var9 = 149;
               break;
            case 31:
               var9 = 40;
         }

         var4[var8] = (char)(var4[var8] ^ var9 ^ var1 >> 16 ^ var7);
         ++var8;
      } while(var8 < var4.length);

      return (new String(var4)).intern();
   }

   public String toString() {
      return this.a.bba();
   }
}
