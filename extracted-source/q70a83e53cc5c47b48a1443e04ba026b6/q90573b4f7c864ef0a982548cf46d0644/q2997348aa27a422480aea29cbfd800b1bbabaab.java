package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
enum q2997348aa27a422480aea29cbfd800b1bbabaab {
   private static final q2997348aa27a422480aea29cbfd800b1bbabaab[] a;
   public static final q2997348aa27a422480aea29cbfd800b1bbabaab aa;
   private final q2997348aa27a422480aea29cbfd800b1babba ab;
   private static final String[] aaa;
   private static final Object[] aab;
   public static final q2997348aa27a422480aea29cbfd800b1bbabaab b;
   private static final int[] bb;
   public static final q2997348aa27a422480aea29cbfd800b1bbabaab ba;

   public String toString() {
      return this.ab.bba();
   }

   static {
      // $FF: Couldn't be decompiled
   }

   private static String aa(byte var0, byte var1, int var2, int var3, char var4, int var5, byte var6) {
      int var11 = var5 ^ -910775028;
      char[] var10 = aaa[var11].toCharArray();
      StackTraceElement[] var12 = (StackTraceElement[])aab[var11];
      StackTraceElement[] var13;
      if (var12 != null) {
         var13 = var12;
      } else {
         var13 = (new Throwable()).getStackTrace();
         aab[var11] = var13;
      }

      StackTraceElement var14 = var13[1];
      int var8 = (var14.getClassName().hashCode() ^ var14.getMethodName().hashCode()) >> 16 ^ 2775;
      int var9 = 0;

      do {
         int var10002 = var10[var9] ^ var9;
         short var10003;
         switch (var9 % 12) {
            case 0:
            default:
               var10003 = 162;
               break;
            case 1:
               var10003 = 22;
               break;
            case 2:
               var10003 = 203;
               break;
            case 3:
               var10003 = 232;
               break;
            case 4:
               var10003 = 18;
               break;
            case 5:
               var10003 = 52;
               break;
            case 6:
               var10003 = 235;
               break;
            case 7:
               var10003 = 6;
               break;
            case 8:
               var10003 = 55;
               break;
            case 9:
               var10003 = 161;
               break;
            case 10:
               var10003 = 209;
               break;
            case 11:
               var10003 = 119;
         }

         var10[var9] = (char)(var10002 ^ var10003 ^ var0 ^ var3 ^ var2 ^ var4 ^ var5 ^ var1 ^ var6 ^ var8);
         ++var9;
      } while(var9 < var10.length);

      return (new String(var10)).intern();
   }

   private q2997348aa27a422480aea29cbfd800b1bbabaab(q2997348aa27a422480aea29cbfd800b1babba var3) {
      this.ab = var3;
   }

   private static int b(int var0, int var1) {
      int var2 = bb[var0 ^ -968957779] ^ var1 ^ var0;
      var2 += 47874;
      var2 += 4408;
      var2 += 58074;
      var2 += 9805;
      var2 ^= 22449;
      var2 -= 23439;
      var2 += 38041;
      var2 += 14447;
      var2 ^= 10408;
      var2 ^= 59869;
      return var2;
   }

   private static q2997348aa27a422480aea29cbfd800b1bbabaab[] a() {
      return new q2997348aa27a422480aea29cbfd800b1bbabaab[]{b, aa, ba};
   }
}
