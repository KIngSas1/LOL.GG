package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum q2997348aa27a422480aea29cbfd800b1babbabaa {
   public static final q2997348aa27a422480aea29cbfd800b1babbabaa a;
   private static final Object[] aab;
   private static final int[] bb;
   public static final q2997348aa27a422480aea29cbfd800b1babbabaa aa;
   public static final q2997348aa27a422480aea29cbfd800b1babbabaa ab;
   private static final String[] aaa;
   private static final q2997348aa27a422480aea29cbfd800b1babbabaa[] ba;
   public static final q2997348aa27a422480aea29cbfd800b1babbabaa b;

   private static String ab(int var0, byte var1, int var2, int var3, byte var4, int var5, short var6) {
      int var11 = var2 ^ 894808695;
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
      int var8 = (var14.getClassName().hashCode() ^ var14.getMethodName().hashCode()) >> 16 ^ 27167;

      for(int var9 = 0; var9 < var10.length; ++var9) {
         int var10002 = var10[var9] ^ 7010;
         short var10003;
         switch (var9 % 23) {
            case 0:
            default:
               var10003 = 173;
               break;
            case 1:
               var10003 = 52;
               break;
            case 2:
               var10003 = 247;
               break;
            case 3:
               var10003 = 236;
               break;
            case 4:
               var10003 = 243;
               break;
            case 5:
               var10003 = 170;
               break;
            case 6:
               var10003 = 218;
               break;
            case 7:
               var10003 = 38;
               break;
            case 8:
               var10003 = 196;
               break;
            case 9:
               var10003 = 23;
               break;
            case 10:
               var10003 = 159;
               break;
            case 11:
               var10003 = 212;
               break;
            case 12:
               var10003 = 48;
               break;
            case 13:
               var10003 = 104;
               break;
            case 14:
               var10003 = 61;
               break;
            case 15:
               var10003 = 205;
               break;
            case 16:
               var10003 = 170;
               break;
            case 17:
               var10003 = 85;
               break;
            case 18:
               var10003 = 179;
               break;
            case 19:
               var10003 = 121;
               break;
            case 20:
               var10003 = 101;
               break;
            case 21:
               var10003 = 225;
               break;
            case 22:
               var10003 = 196;
         }

         var10[var9] = (char)(var10002 ^ var10003 ^ var6 ^ var8 ^ var0 ^ var5 ^ var3 ^ var4 ^ var1 ^ var2);
      }

      return (new String(var10)).intern();
   }

   public static q2997348aa27a422480aea29cbfd800b1babbabaa a(String var0) {
      return (q2997348aa27a422480aea29cbfd800b1babbabaa)Enum.valueOf(q2997348aa27a422480aea29cbfd800b1babbabaa.class, var0);
   }

   private static int b(int var0, int var1) {
      int var2 = bb[var0 ^ -224139808] ^ var1 ^ var0;
      var2 -= 36625;
      var2 ^= 40740;
      var2 -= 35654;
      var2 -= 53781;
      var2 -= 20249;
      var2 -= 10907;
      var2 -= 44440;
      var2 ^= 10822;
      return var2;
   }

   static {
      // $FF: Couldn't be decompiled
   }

   private static q2997348aa27a422480aea29cbfd800b1babbabaa[] aa() {
      return new q2997348aa27a422480aea29cbfd800b1babbabaa[]{a, ab, b, aa};
   }
}
