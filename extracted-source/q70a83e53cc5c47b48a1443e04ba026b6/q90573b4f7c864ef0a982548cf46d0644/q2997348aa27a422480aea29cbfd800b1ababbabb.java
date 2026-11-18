package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
enum q2997348aa27a422480aea29cbfd800b1ababbabb {
   public static final q2997348aa27a422480aea29cbfd800b1ababbabb a;
   public static final q2997348aa27a422480aea29cbfd800b1ababbabb aa;
   private static final q2997348aa27a422480aea29cbfd800b1ababbabb[] ab;
   public static final q2997348aa27a422480aea29cbfd800b1ababbabb ba;
   private static final Object[] aba;
   private static final String[] aab;
   private final q2997348aa27a422480aea29cbfd800b1babba bb;
   private static final int[] aaa;
   public static final q2997348aa27a422480aea29cbfd800b1ababbabb b;

   private static String ab(int var0, int var1) {
      int var3 = var0 ^ -1375559086;
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
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ 572295966;
      int var8 = 0;

      do {
         short var9;
         switch (var8 & 31) {
            case 0:
            default:
               var9 = 230;
               break;
            case 1:
               var9 = 250;
               break;
            case 2:
               var9 = 12;
               break;
            case 3:
               var9 = 198;
               break;
            case 4:
               var9 = 214;
               break;
            case 5:
               var9 = 84;
               break;
            case 6:
               var9 = 41;
               break;
            case 7:
               var9 = 174;
               break;
            case 8:
               var9 = 62;
               break;
            case 9:
               var9 = 121;
               break;
            case 10:
               var9 = 16;
               break;
            case 11:
               var9 = 65;
               break;
            case 12:
               var9 = 99;
               break;
            case 13:
               var9 = 173;
               break;
            case 14:
               var9 = 20;
               break;
            case 15:
               var9 = 244;
               break;
            case 16:
               var9 = 179;
               break;
            case 17:
               var9 = 245;
               break;
            case 18:
               var9 = 125;
               break;
            case 19:
               var9 = 168;
               break;
            case 20:
               var9 = 228;
               break;
            case 21:
               var9 = 193;
               break;
            case 22:
               var9 = 74;
               break;
            case 23:
               var9 = 20;
               break;
            case 24:
               var9 = 115;
               break;
            case 25:
               var9 = 126;
               break;
            case 26:
               var9 = 190;
               break;
            case 27:
               var9 = 11;
               break;
            case 28:
               var9 = 115;
               break;
            case 29:
               var9 = 4;
               break;
            case 30:
               var9 = 5;
               break;
            case 31:
               var9 = 92;
         }

         var4[var8] = (char)(var4[var8] ^ var9 ^ var1 >> 16 ^ var7);
         ++var8;
      } while(var8 < var4.length);

      return (new String(var4)).intern();
   }

   static {
      // $FF: Couldn't be decompiled
   }

   public static q2997348aa27a422480aea29cbfd800b1ababbabb a(String var0) {
      return (q2997348aa27a422480aea29cbfd800b1ababbabb)Enum.valueOf(q2997348aa27a422480aea29cbfd800b1ababbabb.class, var0);
   }

   private static int b(int var0, int var1) {
      int var2 = aaa[var0 ^ 339272412] ^ var1 ^ var0;
      var2 += 34874;
      var2 ^= 58390;
      var2 ^= 21334;
      var2 += 55500;
      var2 += 2755;
      var2 += 39789;
      var2 += 63906;
      return var2;
   }

   private q2997348aa27a422480aea29cbfd800b1ababbabb(q2997348aa27a422480aea29cbfd800b1babba var3) {
      this.bb = var3;
   }

   public String toString() {
      return this.bb.bba();
   }

   private static q2997348aa27a422480aea29cbfd800b1ababbabb[] aa() {
      return new q2997348aa27a422480aea29cbfd800b1ababbabb[]{a, ba, b, aa};
   }
}
