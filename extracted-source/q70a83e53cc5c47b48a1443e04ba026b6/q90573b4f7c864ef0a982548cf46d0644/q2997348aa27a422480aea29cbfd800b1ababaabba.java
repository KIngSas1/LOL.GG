package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
enum q2997348aa27a422480aea29cbfd800b1ababaabba {
   private static final Object[] aba;
   private final q2997348aa27a422480aea29cbfd800b1babba a;
   private static final String[] aab;
   private static final q2997348aa27a422480aea29cbfd800b1ababaabba[] b;
   private static final int[] aaa;
   public static final q2997348aa27a422480aea29cbfd800b1ababaabba aa;
   public static final q2997348aa27a422480aea29cbfd800b1ababaabba ab;
   public static final q2997348aa27a422480aea29cbfd800b1ababaabba ba;
   public static final q2997348aa27a422480aea29cbfd800b1ababaabba bb;

   private static String ab(int var0, int var1) {
      int var3 = var0 ^ 1877967962;
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
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ 1020200834;
      int var8 = 0;

      do {
         short var9;
         switch (var8 & 31) {
            case 0:
            default:
               var9 = 207;
               break;
            case 1:
               var9 = 226;
               break;
            case 2:
               var9 = 12;
               break;
            case 3:
               var9 = 158;
               break;
            case 4:
               var9 = 87;
               break;
            case 5:
               var9 = 149;
               break;
            case 6:
               var9 = 34;
               break;
            case 7:
               var9 = 188;
               break;
            case 8:
               var9 = 5;
               break;
            case 9:
               var9 = 159;
               break;
            case 10:
               var9 = 188;
               break;
            case 11:
               var9 = 164;
               break;
            case 12:
               var9 = 50;
               break;
            case 13:
               var9 = 160;
               break;
            case 14:
               var9 = 228;
               break;
            case 15:
               var9 = 61;
               break;
            case 16:
               var9 = 54;
               break;
            case 17:
               var9 = 124;
               break;
            case 18:
               var9 = 7;
               break;
            case 19:
               var9 = 44;
               break;
            case 20:
               var9 = 6;
               break;
            case 21:
               var9 = 173;
               break;
            case 22:
               var9 = 222;
               break;
            case 23:
               var9 = 37;
               break;
            case 24:
               var9 = 176;
               break;
            case 25:
               var9 = 1;
               break;
            case 26:
               var9 = 20;
               break;
            case 27:
               var9 = 25;
               break;
            case 28:
               var9 = 47;
               break;
            case 29:
               var9 = 195;
               break;
            case 30:
               var9 = 247;
               break;
            case 31:
               var9 = 244;
         }

         var4[var8] = (char)(var4[var8] ^ var9 ^ var1 >> 16 ^ var7);
         ++var8;
      } while(var8 < var4.length);

      return (new String(var4)).intern();
   }

   public String toString() {
      return this.a.bba();
   }

   static {
      // $FF: Couldn't be decompiled
   }

   public static q2997348aa27a422480aea29cbfd800b1ababaabba a(String var0) {
      return (q2997348aa27a422480aea29cbfd800b1ababaabba)Enum.valueOf(q2997348aa27a422480aea29cbfd800b1ababaabba.class, var0);
   }

   private static q2997348aa27a422480aea29cbfd800b1ababaabba[] aa() {
      return new q2997348aa27a422480aea29cbfd800b1ababaabba[]{bb, aa, ab, ba};
   }

   private q2997348aa27a422480aea29cbfd800b1ababaabba(q2997348aa27a422480aea29cbfd800b1babba var3) {
      this.a = var3;
   }

   private static int b(int var0, int var1) {
      int var2 = aaa[var0 ^ -1076810932] ^ var1 ^ var0;
      var2 ^= 52073;
      var2 += 12939;
      var2 ^= 38131;
      var2 -= 52122;
      var2 += 18418;
      var2 ^= 4941;
      var2 ^= 43147;
      var2 += 29902;
      var2 += 59388;
      var2 -= 47030;
      return var2;
   }
}
