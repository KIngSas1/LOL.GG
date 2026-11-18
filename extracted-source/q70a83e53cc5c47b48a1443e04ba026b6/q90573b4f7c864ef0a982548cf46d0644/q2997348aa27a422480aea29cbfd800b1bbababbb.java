package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum q2997348aa27a422480aea29cbfd800b1bbababbb {
   public static final q2997348aa27a422480aea29cbfd800b1bbababbb a;
   private static final q2997348aa27a422480aea29cbfd800b1bbababbb[] aa;
   private static final Object[] aaa;
   private static final int[] ba;
   private final q2997348aa27a422480aea29cbfd800b1babba ab;
   private static final String[] bb;
   public static final q2997348aa27a422480aea29cbfd800b1bbababbb b;

   private static int b(int var0, int var1) {
      int var2 = ba[var0 ^ 1778352275] ^ var1 ^ var0;
      var2 -= 3114;
      var2 -= 45973;
      var2 -= 42734;
      var2 += 34604;
      var2 += 26257;
      var2 ^= 31312;
      var2 -= 32286;
      return var2;
   }

   private q2997348aa27a422480aea29cbfd800b1bbababbb(q2997348aa27a422480aea29cbfd800b1babba var3) {
      this.ab = var3;
   }

   public String toString() {
      return this.ab.bba();
   }

   private static String aa(int var0, int var1) {
      int var3 = var0 ^ 498741754;
      char[] var4 = bb[var3].toCharArray();
      StackTraceElement[] var2 = (StackTraceElement[])aaa[var3];
      StackTraceElement[] var5;
      if (var2 != null) {
         var5 = var2;
      } else {
         var5 = (new Throwable()).getStackTrace();
         aaa[var3] = var5;
      }

      StackTraceElement var6 = var5[1];
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ 155416695;
      int var8 = 0;

      do {
         short var9;
         switch (var8 & 31) {
            case 0:
            default:
               var9 = 48;
               break;
            case 1:
               var9 = 219;
               break;
            case 2:
               var9 = 155;
               break;
            case 3:
               var9 = 86;
               break;
            case 4:
               var9 = 163;
               break;
            case 5:
               var9 = 130;
               break;
            case 6:
               var9 = 247;
               break;
            case 7:
               var9 = 66;
               break;
            case 8:
               var9 = 224;
               break;
            case 9:
               var9 = 185;
               break;
            case 10:
               var9 = 161;
               break;
            case 11:
               var9 = 142;
               break;
            case 12:
               var9 = 218;
               break;
            case 13:
               var9 = 239;
               break;
            case 14:
               var9 = 98;
               break;
            case 15:
               var9 = 244;
               break;
            case 16:
               var9 = 6;
               break;
            case 17:
               var9 = 87;
               break;
            case 18:
               var9 = 18;
               break;
            case 19:
               var9 = 184;
               break;
            case 20:
               var9 = 6;
               break;
            case 21:
               var9 = 136;
               break;
            case 22:
               var9 = 201;
               break;
            case 23:
               var9 = 49;
               break;
            case 24:
               var9 = 196;
               break;
            case 25:
               var9 = 174;
               break;
            case 26:
               var9 = 16;
               break;
            case 27:
               var9 = 45;
               break;
            case 28:
               var9 = 47;
               break;
            case 29:
               var9 = 21;
               break;
            case 30:
               var9 = 161;
               break;
            case 31:
               var9 = 197;
         }

         var4[var8] = (char)(var4[var8] ^ var9 ^ var1 >> 16 ^ var7);
         ++var8;
      } while(var8 < var4.length);

      return (new String(var4)).intern();
   }

   private static q2997348aa27a422480aea29cbfd800b1bbababbb[] a() {
      return new q2997348aa27a422480aea29cbfd800b1bbababbb[]{a, b};
   }

   static {
      // $FF: Couldn't be decompiled
   }
}
