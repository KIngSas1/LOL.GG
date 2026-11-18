package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
enum q2997348aa27a422480aea29cbfd800b1aabbabbb {
   private static final String[] ba;
   public static final q2997348aa27a422480aea29cbfd800b1aabbabbb a;
   private static final int[] ab;
   private static final q2997348aa27a422480aea29cbfd800b1aabbabbb[] aa;
   private static final Object[] bb;
   public static final q2997348aa27a422480aea29cbfd800b1aabbabbb b;

   private static int b(int var0, int var1) {
      int var2 = ab[var0 ^ -1937751953] ^ var1 ^ var0;
      var2 ^= 55979;
      var2 += 43492;
      var2 += 39959;
      var2 ^= 47463;
      var2 ^= 63597;
      var2 -= 42397;
      var2 ^= 17942;
      var2 ^= 57726;
      return var2;
   }

   private static q2997348aa27a422480aea29cbfd800b1aabbabbb[] a() {
      return new q2997348aa27a422480aea29cbfd800b1aabbabbb[]{a, b};
   }

   static {
      // $FF: Couldn't be decompiled
   }

   private static String ab(char var0, byte var1, int var2, short var3, short var4, char var5) {
      int var10 = var2 ^ 1703759656;
      char[] var9 = ba[var10].toCharArray();
      StackTraceElement[] var11 = (StackTraceElement[])bb[var10];
      StackTraceElement[] var12;
      if (var11 != null) {
         var12 = var11;
      } else {
         var12 = (new Throwable()).getStackTrace();
         bb[var10] = var12;
      }

      StackTraceElement var13 = var12[1];
      int var7 = (var13.getClassName().hashCode() ^ var13.getMethodName().hashCode()) >> 16 ^ 'ힳ';
      int var8 = 0;

      do {
         char var10002 = var9[var8];
         short var10003;
         switch (var8 % 27) {
            case 0:
            default:
               var10003 = 111;
               break;
            case 1:
               var10003 = 155;
               break;
            case 2:
               var10003 = 182;
               break;
            case 3:
               var10003 = 239;
               break;
            case 4:
               var10003 = 121;
               break;
            case 5:
               var10003 = 16;
               break;
            case 6:
               var10003 = 142;
               break;
            case 7:
               var10003 = 163;
               break;
            case 8:
               var10003 = 111;
               break;
            case 9:
               var10003 = 28;
               break;
            case 10:
               var10003 = 172;
               break;
            case 11:
               var10003 = 50;
               break;
            case 12:
               var10003 = 28;
               break;
            case 13:
               var10003 = 11;
               break;
            case 14:
               var10003 = 177;
               break;
            case 15:
               var10003 = 170;
               break;
            case 16:
               var10003 = 181;
               break;
            case 17:
               var10003 = 107;
               break;
            case 18:
               var10003 = 248;
               break;
            case 19:
               var10003 = 43;
               break;
            case 20:
               var10003 = 104;
               break;
            case 21:
               var10003 = 9;
               break;
            case 22:
               var10003 = 87;
               break;
            case 23:
               var10003 = 218;
               break;
            case 24:
               var10003 = 145;
               break;
            case 25:
               var10003 = 255;
               break;
            case 26:
               var10003 = 109;
         }

         var9[var8] = (char)(var10002 ^ var10003 ^ 8472 ^ var8 ^ var4 ^ var0 ^ var2 ^ var3 ^ var5 ^ var1 ^ var7);
         ++var8;
      } while(var8 < var9.length);

      return (new String(var9)).intern();
   }

   public static q2997348aa27a422480aea29cbfd800b1aabbabbb aa(String var0) {
      return (q2997348aa27a422480aea29cbfd800b1aabbabbb)Enum.valueOf(q2997348aa27a422480aea29cbfd800b1aabbabbb.class, var0);
   }
}
