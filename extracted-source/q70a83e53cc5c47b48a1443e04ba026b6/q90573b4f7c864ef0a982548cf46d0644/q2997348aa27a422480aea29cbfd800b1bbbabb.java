package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
enum q2997348aa27a422480aea29cbfd800b1bbbabb {
   private static final q2997348aa27a422480aea29cbfd800b1bbbabb[] a;
   public static final q2997348aa27a422480aea29cbfd800b1bbbabb b;
   private static final Object[] bb;
   private static final int[] ab;
   private static final String[] ba;
   public static final q2997348aa27a422480aea29cbfd800b1bbbabb aa;

   private static int b(int var0, int var1) {
      int var2 = ab[var0 ^ -474458611] ^ var1 ^ var0;
      var2 += 43103;
      var2 -= 4322;
      var2 -= 39245;
      var2 -= 52244;
      var2 -= 57311;
      var2 ^= 65197;
      var2 ^= 55774;
      var2 -= 29183;
      var2 -= 62952;
      return var2;
   }

   private static String ab(int var0, int var1, int var2, int var3, char var4, int var5) {
      int var10 = var0 ^ 1436545410;
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
      int var7 = (var13.getClassName().hashCode() ^ var13.getMethodName().hashCode()) >> 16 ^ '颥';

      for(int var8 = 0; var8 < var9.length; ++var8) {
         char var10002 = var9[var8];
         short var10003;
         switch (var8 % 10) {
            case 0:
            default:
               var10003 = 115;
               break;
            case 1:
               var10003 = 145;
               break;
            case 2:
               var10003 = 200;
               break;
            case 3:
               var10003 = 198;
               break;
            case 4:
               var10003 = 172;
               break;
            case 5:
               var10003 = 26;
               break;
            case 6:
               var10003 = 96;
               break;
            case 7:
               var10003 = 191;
               break;
            case 8:
               var10003 = 141;
               break;
            case 9:
               var10003 = 162;
         }

         var9[var8] = (char)(var10002 ^ var10003 ^ var2 ^ var4 ^ var7 ^ var3 ^ var0 ^ var5 ^ var1);
      }

      return (new String(var9)).intern();
   }

   private static q2997348aa27a422480aea29cbfd800b1bbbabb[] a() {
      return new q2997348aa27a422480aea29cbfd800b1bbbabb[]{aa, b};
   }

   static {
      // $FF: Couldn't be decompiled
   }

   public static q2997348aa27a422480aea29cbfd800b1bbbabb aa(String var0) {
      return (q2997348aa27a422480aea29cbfd800b1bbbabb)Enum.valueOf(q2997348aa27a422480aea29cbfd800b1bbbabb.class, var0);
   }
}
