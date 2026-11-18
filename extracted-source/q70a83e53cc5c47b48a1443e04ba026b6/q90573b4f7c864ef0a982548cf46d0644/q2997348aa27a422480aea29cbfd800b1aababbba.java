package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
enum q2997348aa27a422480aea29cbfd800b1aababbba {
   public static final q2997348aa27a422480aea29cbfd800b1aababbba a;
   private static final q2997348aa27a422480aea29cbfd800b1aababbba[] aa;
   private static final String[] aab;
   public static final q2997348aa27a422480aea29cbfd800b1aababbba b;
   private static final int[] aaa;
   public static final q2997348aa27a422480aea29cbfd800b1aababbba ab;
   private static final Object[] aba;
   public static final q2997348aa27a422480aea29cbfd800b1aababbba ba;
   public static final q2997348aa27a422480aea29cbfd800b1aababbba bb;

   private static String ab(int var0, int var1) {
      int var3 = var0 ^ 344909848;
      char[] var4 = aab[var3].toCharArray();
      StackTraceElement[] var2 = (StackTraceElement[])aba[var3];
      StackTraceElement[] var5;
      if (var2 != null) {
         var5 = var2;
      } else {
         var5 = (new Throwable()).getStackTrace();
         aba[var3] = var5;
      }

      StackTraceElement var6 = var5[1];
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ -715442082;
      int var8 = 0;

      do {
         short var9;
         switch (var8 & 31) {
            case 0:
            default:
               var9 = 119;
               break;
            case 1:
               var9 = 149;
               break;
            case 2:
               var9 = 240;
               break;
            case 3:
               var9 = 157;
               break;
            case 4:
               var9 = 86;
               break;
            case 5:
               var9 = 218;
               break;
            case 6:
               var9 = 157;
               break;
            case 7:
               var9 = 98;
               break;
            case 8:
               var9 = 52;
               break;
            case 9:
               var9 = 152;
               break;
            case 10:
               var9 = 125;
               break;
            case 11:
               var9 = 37;
               break;
            case 12:
               var9 = 46;
               break;
            case 13:
               var9 = 177;
               break;
            case 14:
               var9 = 219;
               break;
            case 15:
               var9 = 3;
               break;
            case 16:
               var9 = 173;
               break;
            case 17:
               var9 = 117;
               break;
            case 18:
               var9 = 203;
               break;
            case 19:
               var9 = 54;
               break;
            case 20:
               var9 = 244;
               break;
            case 21:
               var9 = 113;
               break;
            case 22:
               var9 = 48;
               break;
            case 23:
               var9 = 204;
               break;
            case 24:
               var9 = 32;
               break;
            case 25:
               var9 = 73;
               break;
            case 26:
               var9 = 203;
               break;
            case 27:
               var9 = 125;
               break;
            case 28:
               var9 = 227;
               break;
            case 29:
               var9 = 155;
               break;
            case 30:
               var9 = 196;
               break;
            case 31:
               var9 = 240;
         }

         var4[var8] = (char)(var4[var8] ^ var9 ^ var1 >> 16 ^ var7);
         ++var8;
      } while(var8 < var4.length);

      return (new String(var4)).intern();
   }

   private static int b(int var0, int var1) {
      int var2 = aaa[var0 ^ -1093963250] ^ var1 ^ var0;
      var2 ^= 10889;
      var2 ^= 56336;
      var2 += 31688;
      var2 -= 32697;
      var2 ^= 18090;
      var2 -= 6319;
      var2 ^= 31299;
      var2 ^= 56719;
      return var2;
   }

   static {
      // $FF: Couldn't be decompiled
   }

   public static q2997348aa27a422480aea29cbfd800b1aababbba a(String var0) {
      return (q2997348aa27a422480aea29cbfd800b1aababbba)Enum.valueOf(q2997348aa27a422480aea29cbfd800b1aababbba.class, var0);
   }

   private static q2997348aa27a422480aea29cbfd800b1aababbba[] aa() {
      return new q2997348aa27a422480aea29cbfd800b1aababbba[]{bb, ab, ba, a, b};
   }
}
