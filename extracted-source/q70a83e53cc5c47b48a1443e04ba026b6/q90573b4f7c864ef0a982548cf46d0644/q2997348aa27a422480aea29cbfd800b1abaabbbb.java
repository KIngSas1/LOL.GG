package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum q2997348aa27a422480aea29cbfd800b1abaabbbb {
   private static final int[] ab;
   private static final String[] ba;
   private static final Object[] bb;
   public static final q2997348aa27a422480aea29cbfd800b1abaabbbb a;
   private static final q2997348aa27a422480aea29cbfd800b1abaabbbb[] aa;
   public static final q2997348aa27a422480aea29cbfd800b1abaabbbb b;

   private static String ab(int var0, int var1) {
      int var3 = var0 ^ -1344377297;
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
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ 1148587385;
      int var8 = 0;

      do {
         short var9;
         switch (var8 & 31) {
            case 0:
            default:
               var9 = 220;
               break;
            case 1:
               var9 = 80;
               break;
            case 2:
               var9 = 128;
               break;
            case 3:
               var9 = 211;
               break;
            case 4:
               var9 = 211;
               break;
            case 5:
               var9 = 115;
               break;
            case 6:
               var9 = 30;
               break;
            case 7:
               var9 = 179;
               break;
            case 8:
               var9 = 234;
               break;
            case 9:
               var9 = 27;
               break;
            case 10:
               var9 = 188;
               break;
            case 11:
               var9 = 29;
               break;
            case 12:
               var9 = 116;
               break;
            case 13:
               var9 = 207;
               break;
            case 14:
               var9 = 23;
               break;
            case 15:
               var9 = 87;
               break;
            case 16:
               var9 = 22;
               break;
            case 17:
               var9 = 159;
               break;
            case 18:
               var9 = 236;
               break;
            case 19:
               var9 = 82;
               break;
            case 20:
               var9 = 56;
               break;
            case 21:
               var9 = 254;
               break;
            case 22:
               var9 = 1;
               break;
            case 23:
               var9 = 155;
               break;
            case 24:
               var9 = 178;
               break;
            case 25:
               var9 = 160;
               break;
            case 26:
               var9 = 105;
               break;
            case 27:
               var9 = 16;
               break;
            case 28:
               var9 = 208;
               break;
            case 29:
               var9 = 255;
               break;
            case 30:
               var9 = 89;
               break;
            case 31:
               var9 = 109;
         }

         var4[var8] = (char)(var4[var8] ^ var9 ^ var1 >> 16 ^ var7);
         ++var8;
      } while(var8 < var4.length);

      return (new String(var4)).intern();
   }

   static {
      // $FF: Couldn't be decompiled
   }

   private static int b(int var0, int var1) {
      int var2 = ab[var0 ^ 1559438137] ^ var1 ^ var0;
      var2 -= 62175;
      var2 ^= 58141;
      var2 += 38019;
      var2 += 64295;
      var2 += 54456;
      var2 -= 38406;
      var2 -= 45980;
      var2 -= 21976;
      var2 -= 38508;
      var2 -= 62267;
      return var2;
   }

   public static q2997348aa27a422480aea29cbfd800b1abaabbbb a(String var0) {
      return (q2997348aa27a422480aea29cbfd800b1abaabbbb)Enum.valueOf(q2997348aa27a422480aea29cbfd800b1abaabbbb.class, var0);
   }

   private static q2997348aa27a422480aea29cbfd800b1abaabbbb[] aa() {
      return new q2997348aa27a422480aea29cbfd800b1abaabbbb[]{a, b};
   }
}
