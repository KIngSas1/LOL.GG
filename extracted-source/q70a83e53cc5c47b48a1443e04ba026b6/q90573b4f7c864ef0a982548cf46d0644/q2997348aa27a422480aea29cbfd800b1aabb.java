package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum q2997348aa27a422480aea29cbfd800b1aabb {
   public static final q2997348aa27a422480aea29cbfd800b1aabb a;
   private final q2997348aa27a422480aea29cbfd800b1babba aa;
   private static final String[] bb;
   private static final Object[] aaa;
   public static final q2997348aa27a422480aea29cbfd800b1aabb b;
   private static final int[] ba;
   private static final q2997348aa27a422480aea29cbfd800b1aabb[] ab;

   private static String ab(int var0, int var1) {
      int var3 = var0 ^ -427307766;
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
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ -135018529;
      int var8 = 0;

      do {
         short var9;
         switch (var8 & 31) {
            case 0:
            default:
               var9 = 93;
               break;
            case 1:
               var9 = 172;
               break;
            case 2:
               var9 = 210;
               break;
            case 3:
               var9 = 66;
               break;
            case 4:
               var9 = 155;
               break;
            case 5:
               var9 = 97;
               break;
            case 6:
               var9 = 83;
               break;
            case 7:
               var9 = 236;
               break;
            case 8:
               var9 = 172;
               break;
            case 9:
               var9 = 181;
               break;
            case 10:
               var9 = 154;
               break;
            case 11:
               var9 = 13;
               break;
            case 12:
               var9 = 112;
               break;
            case 13:
               var9 = 36;
               break;
            case 14:
               var9 = 241;
               break;
            case 15:
               var9 = 166;
               break;
            case 16:
               var9 = 7;
               break;
            case 17:
               var9 = 105;
               break;
            case 18:
               var9 = 248;
               break;
            case 19:
               var9 = 232;
               break;
            case 20:
               var9 = 183;
               break;
            case 21:
               var9 = 93;
               break;
            case 22:
               var9 = 41;
               break;
            case 23:
               var9 = 120;
               break;
            case 24:
               var9 = 254;
               break;
            case 25:
               var9 = 189;
               break;
            case 26:
               var9 = 28;
               break;
            case 27:
               var9 = 23;
               break;
            case 28:
               var9 = 24;
               break;
            case 29:
               var9 = 128;
               break;
            case 30:
               var9 = 90;
               break;
            case 31:
               var9 = 60;
         }

         var4[var8] = (char)(var4[var8] ^ var9 ^ var1 >> 16 ^ var7);
         ++var8;
      } while(var8 < var4.length);

      return (new String(var4)).intern();
   }

   public static q2997348aa27a422480aea29cbfd800b1aabb a(String var0) {
      return (q2997348aa27a422480aea29cbfd800b1aabb)Enum.valueOf(q2997348aa27a422480aea29cbfd800b1aabb.class, var0);
   }

   static {
      // $FF: Couldn't be decompiled
   }

   private static q2997348aa27a422480aea29cbfd800b1aabb[] aa() {
      return new q2997348aa27a422480aea29cbfd800b1aabb[]{b, a};
   }

   public String toString() {
      return this.aa.bba();
   }

   private static int b(int var0, int var1) {
      int var2 = ba[var0 ^ 2065240520] ^ var1 ^ var0;
      var2 -= 11266;
      var2 -= 8220;
      var2 -= 23125;
      var2 += 24609;
      var2 += 30265;
      var2 -= 25784;
      var2 -= 64857;
      var2 ^= 63712;
      return var2;
   }

   private q2997348aa27a422480aea29cbfd800b1aabb(q2997348aa27a422480aea29cbfd800b1babba var3) {
      this.aa = var3;
   }
}
