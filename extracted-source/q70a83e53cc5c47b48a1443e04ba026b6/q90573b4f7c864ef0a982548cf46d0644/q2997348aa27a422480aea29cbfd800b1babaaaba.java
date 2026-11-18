package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
enum q2997348aa27a422480aea29cbfd800b1babaaaba {
   public static final q2997348aa27a422480aea29cbfd800b1babaaaba a;
   public static final q2997348aa27a422480aea29cbfd800b1babaaaba aa;
   private static final int[] ba;
   private static final Object[] aaa;
   private static final q2997348aa27a422480aea29cbfd800b1babaaaba[] ab;
   private static final String[] bb;
   public static final q2997348aa27a422480aea29cbfd800b1babaaaba b;

   static {
      // $FF: Couldn't be decompiled
   }

   public static q2997348aa27a422480aea29cbfd800b1babaaaba a(String var0) {
      return (q2997348aa27a422480aea29cbfd800b1babaaaba)Enum.valueOf(q2997348aa27a422480aea29cbfd800b1babaaaba.class, var0);
   }

   private static q2997348aa27a422480aea29cbfd800b1babaaaba[] aa() {
      return new q2997348aa27a422480aea29cbfd800b1babaaaba[]{b, a, aa};
   }

   private static int b(int var0, int var1) {
      int var2 = ba[var0 ^ 2118393189] ^ var1 ^ var0;
      var2 -= 34400;
      var2 ^= 10045;
      var2 -= 28287;
      var2 += 47014;
      var2 -= 58034;
      var2 += 476;
      var2 ^= 13521;
      var2 += 35833;
      var2 += 2359;
      var2 ^= 23830;
      return var2;
   }

   private static String ab(int var0, short var1, short var2) {
      int var7 = var0 ^ 1435864043;
      char[] var6 = bb[var7].toCharArray();
      StackTraceElement[] var8 = (StackTraceElement[])aaa[var7];
      StackTraceElement[] var9;
      if (var8 != null) {
         var9 = var8;
      } else {
         var9 = (new Throwable()).getStackTrace();
         aaa[var7] = var9;
      }

      StackTraceElement var10 = var9[1];
      int var4 = (var10.getClassName().hashCode() ^ var10.getMethodName().hashCode()) >> 16 ^ '迠';
      int var5 = 0;

      do {
         int var10002 = var6[var5] ^ var5;
         short var10003;
         switch (var5 % 30) {
            case 0:
            default:
               var10003 = 141;
               break;
            case 1:
               var10003 = 38;
               break;
            case 2:
               var10003 = 151;
               break;
            case 3:
               var10003 = 22;
               break;
            case 4:
               var10003 = 251;
               break;
            case 5:
               var10003 = 239;
               break;
            case 6:
               var10003 = 47;
               break;
            case 7:
               var10003 = 165;
               break;
            case 8:
               var10003 = 177;
               break;
            case 9:
               var10003 = 155;
               break;
            case 10:
               var10003 = 118;
               break;
            case 11:
               var10003 = 197;
               break;
            case 12:
               var10003 = 158;
               break;
            case 13:
               var10003 = 179;
               break;
            case 14:
               var10003 = 92;
               break;
            case 15:
               var10003 = 144;
               break;
            case 16:
               var10003 = 229;
               break;
            case 17:
               var10003 = 212;
               break;
            case 18:
               var10003 = 9;
               break;
            case 19:
               var10003 = 114;
               break;
            case 20:
               var10003 = 71;
               break;
            case 21:
               var10003 = 167;
               break;
            case 22:
               var10003 = 162;
               break;
            case 23:
               var10003 = 30;
               break;
            case 24:
               var10003 = 147;
               break;
            case 25:
               var10003 = 29;
               break;
            case 26:
               var10003 = 101;
               break;
            case 27:
               var10003 = 125;
               break;
            case 28:
               var10003 = 56;
               break;
            case 29:
               var10003 = 96;
         }

         var6[var5] = (char)(var10002 ^ var10003 ^ 12222 ^ var4 ^ var2 ^ var1 ^ var0);
         ++var5;
      } while(var5 < var6.length);

      return (new String(var6)).intern();
   }
}
