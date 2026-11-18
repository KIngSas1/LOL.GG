package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
enum q2997348aa27a422480aea29cbfd800b1baababa {
   private static final int[] b;
   private static final Object[] aba;
   private static final String[] aab;
   public static final q2997348aa27a422480aea29cbfd800b1baababa a;
   public static final q2997348aa27a422480aea29cbfd800b1baababa aa;
   public static final q2997348aa27a422480aea29cbfd800b1baababa ab;
   public static final q2997348aa27a422480aea29cbfd800b1baababa ba;
   public static final q2997348aa27a422480aea29cbfd800b1baababa bb;
   private static final q2997348aa27a422480aea29cbfd800b1baababa[] aaa;

   private static int b(int var0, int var1) {
      int var2 = b[var0 ^ 494521654] ^ var1 ^ var0;
      var2 ^= 35072;
      var2 -= 64160;
      var2 -= 12151;
      var2 += 31380;
      var2 += 39552;
      var2 -= 34825;
      var2 += 20174;
      var2 ^= 33577;
      return var2;
   }

   private static String ab(short var0, int var1, char var2, char var3, char var4, int var5) {
      int var10 = var5 ^ -295583597;
      char[] var9 = aab[var10].toCharArray();
      StackTraceElement[] var11 = (StackTraceElement[])aba[var10];
      StackTraceElement[] var12;
      if (var11 != null) {
         var12 = var11;
      } else {
         var12 = (new Throwable()).getStackTrace();
         aba[var10] = var12;
      }

      StackTraceElement var13 = var12[1];
      int var7 = (var13.getClassName().hashCode() ^ var13.getMethodName().hashCode()) >> 16 ^ 25608;

      for(int var8 = 0; var8 < var9.length; ++var8) {
         char var10002 = var9[var8];
         short var10003;
         switch (var8 % 11) {
            case 0:
            default:
               var10003 = 108;
               break;
            case 1:
               var10003 = 206;
               break;
            case 2:
               var10003 = 167;
               break;
            case 3:
               var10003 = 53;
               break;
            case 4:
               var10003 = 1;
               break;
            case 5:
               var10003 = 66;
               break;
            case 6:
               var10003 = 133;
               break;
            case 7:
               var10003 = 118;
               break;
            case 8:
               var10003 = 33;
               break;
            case 9:
               var10003 = 149;
               break;
            case 10:
               var10003 = 241;
         }

         var9[var8] = (char)(var10002 ^ var10003 ^ var8 ^ var1 ^ var7 ^ var2 ^ var3 ^ var0 ^ var5 ^ var4);
      }

      return (new String(var9)).intern();
   }

   private static q2997348aa27a422480aea29cbfd800b1baababa[] a() {
      return new q2997348aa27a422480aea29cbfd800b1baababa[]{a, ba, aa, ab, bb};
   }

   static {
      // $FF: Couldn't be decompiled
   }

   public static q2997348aa27a422480aea29cbfd800b1baababa aa(String var0) {
      return (q2997348aa27a422480aea29cbfd800b1baababa)Enum.valueOf(q2997348aa27a422480aea29cbfd800b1baababa.class, var0);
   }
}
