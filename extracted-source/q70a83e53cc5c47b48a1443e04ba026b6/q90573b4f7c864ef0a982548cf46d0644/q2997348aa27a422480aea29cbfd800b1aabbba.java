package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum q2997348aa27a422480aea29cbfd800b1aabbba {
   public static final q2997348aa27a422480aea29cbfd800b1aabbba a;
   private static final Object[] bb;
   private static final q2997348aa27a422480aea29cbfd800b1aabbba[] aa;
   private static final int[] ab;
   private static final String[] ba;
   public static final q2997348aa27a422480aea29cbfd800b1aabbba b;

   private static q2997348aa27a422480aea29cbfd800b1aabbba[] a() {
      return new q2997348aa27a422480aea29cbfd800b1aabbba[]{b, a};
   }

   public static q2997348aa27a422480aea29cbfd800b1aabbba aa(String var0) {
      return (q2997348aa27a422480aea29cbfd800b1aabbba)Enum.valueOf(q2997348aa27a422480aea29cbfd800b1aabbba.class, var0);
   }

   private static int b(int var0, int var1) {
      int var2 = ab[var0 ^ -348084004] ^ var1 ^ var0;
      var2 -= 28738;
      var2 -= 28264;
      var2 ^= 8010;
      var2 -= 28891;
      var2 += 32074;
      var2 ^= 20832;
      var2 += 18591;
      var2 -= 4812;
      var2 -= 58199;
      var2 ^= 64196;
      return var2;
   }

   static {
      // $FF: Couldn't be decompiled
   }

   private static String ab(int var0, int var1) {
      int var3 = var0 ^ 756399075;
      char[] var4 = ba[var3].toCharArray();
      StackTraceElement[] var2 = (StackTraceElement[])bb[var3];
      StackTraceElement[] var5;
      if (var2 != null) {
         var5 = var2;
      } else {
         var5 = (new Throwable()).getStackTrace();
         bb[var3] = var5;
      }

      StackTraceElement var6 = var5[1];
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ -934125072;
      int var8 = 0;

      do {
         short var9;
         switch (var8 & 31) {
            case 0:
            default:
               var9 = 252;
               break;
            case 1:
               var9 = 137;
               break;
            case 2:
               var9 = 37;
               break;
            case 3:
               var9 = 17;
               break;
            case 4:
               var9 = 16;
               break;
            case 5:
               var9 = 204;
               break;
            case 6:
               var9 = 177;
               break;
            case 7:
               var9 = 235;
               break;
            case 8:
               var9 = 124;
               break;
            case 9:
               var9 = 129;
               break;
            case 10:
               var9 = 204;
               break;
            case 11:
               var9 = 6;
               break;
            case 12:
               var9 = 57;
               break;
            case 13:
               var9 = 64;
               break;
            case 14:
               var9 = 102;
               break;
            case 15:
               var9 = 124;
               break;
            case 16:
               var9 = 119;
               break;
            case 17:
               var9 = 97;
               break;
            case 18:
               var9 = 212;
               break;
            case 19:
               var9 = 158;
               break;
            case 20:
               var9 = 2;
               break;
            case 21:
               var9 = 222;
               break;
            case 22:
               var9 = 236;
               break;
            case 23:
               var9 = 124;
               break;
            case 24:
               var9 = 53;
               break;
            case 25:
               var9 = 145;
               break;
            case 26:
               var9 = 87;
               break;
            case 27:
               var9 = 106;
               break;
            case 28:
               var9 = 32;
               break;
            case 29:
               var9 = 161;
               break;
            case 30:
               var9 = 140;
               break;
            case 31:
               var9 = 183;
         }

         var4[var8] = (char)(var4[var8] ^ var9 ^ var1 >> 16 ^ var7);
         ++var8;
      } while(var8 < var4.length);

      return (new String(var4)).intern();
   }
}
