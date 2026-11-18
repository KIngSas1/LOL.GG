package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
enum q2997348aa27a422480aea29cbfd800b1aabbabb {
   private static final Object[] aaa;
   private static final int[] b;
   private static final String[] bb;
   private static final q2997348aa27a422480aea29cbfd800b1aabbabb[] a;
   public static final q2997348aa27a422480aea29cbfd800b1aabbabb aa;
   public static final q2997348aa27a422480aea29cbfd800b1aabbabb ab;
   private final q2997348aa27a422480aea29cbfd800b1babba ba;

   private q2997348aa27a422480aea29cbfd800b1aabbabb(q2997348aa27a422480aea29cbfd800b1babba var3) {
      this.ba = var3;
   }

   static {
      // $FF: Couldn't be decompiled
   }

   public static q2997348aa27a422480aea29cbfd800b1aabbabb a(String var0) {
      return (q2997348aa27a422480aea29cbfd800b1aabbabb)Enum.valueOf(q2997348aa27a422480aea29cbfd800b1aabbabb.class, var0);
   }

   private static q2997348aa27a422480aea29cbfd800b1aabbabb[] aa() {
      return new q2997348aa27a422480aea29cbfd800b1aabbabb[]{ab, aa};
   }

   private static String ab(int var0, int var1) {
      int var3 = var0 ^ -1534771721;
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
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ -842553784;
      int var8 = 0;

      do {
         short var9;
         switch (var8 & 31) {
            case 0:
            default:
               var9 = 158;
               break;
            case 1:
               var9 = 36;
               break;
            case 2:
               var9 = 227;
               break;
            case 3:
               var9 = 163;
               break;
            case 4:
               var9 = 25;
               break;
            case 5:
               var9 = 246;
               break;
            case 6:
               var9 = 9;
               break;
            case 7:
               var9 = 124;
               break;
            case 8:
               var9 = 105;
               break;
            case 9:
               var9 = 6;
               break;
            case 10:
               var9 = 44;
               break;
            case 11:
               var9 = 156;
               break;
            case 12:
               var9 = 78;
               break;
            case 13:
               var9 = 151;
               break;
            case 14:
               var9 = 121;
               break;
            case 15:
               var9 = 224;
               break;
            case 16:
               var9 = 71;
               break;
            case 17:
               var9 = 68;
               break;
            case 18:
               var9 = 231;
               break;
            case 19:
               var9 = 164;
               break;
            case 20:
               var9 = 7;
               break;
            case 21:
               var9 = 9;
               break;
            case 22:
               var9 = 64;
               break;
            case 23:
               var9 = 20;
               break;
            case 24:
               var9 = 180;
               break;
            case 25:
               var9 = 244;
               break;
            case 26:
               var9 = 69;
               break;
            case 27:
               var9 = 98;
               break;
            case 28:
               var9 = 220;
               break;
            case 29:
               var9 = 195;
               break;
            case 30:
               var9 = 4;
               break;
            case 31:
               var9 = 243;
         }

         var4[var8] = (char)(var4[var8] ^ var9 ^ var1 >> 16 ^ var7);
         ++var8;
      } while(var8 < var4.length);

      return (new String(var4)).intern();
   }

   private static int b(int var0, int var1) {
      int var2 = b[var0 ^ 791240481] ^ var1 ^ var0;
      var2 ^= 54021;
      var2 += 46378;
      var2 -= 3785;
      var2 -= 48780;
      var2 ^= 21947;
      var2 -= 43133;
      var2 ^= 42105;
      var2 += 2395;
      return var2;
   }

   public String toString() {
      return this.ba.bba();
   }
}
