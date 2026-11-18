package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum q2997348aa27a422480aea29cbfd800b1ababaa {
   private static final int[] ba;
   private static final q2997348aa27a422480aea29cbfd800b1ababaa[] a;
   private static final Object[] aaa;
   public static final q2997348aa27a422480aea29cbfd800b1ababaa b;
   private static final String[] bb;
   public static final q2997348aa27a422480aea29cbfd800b1ababaa aa;
   public static final q2997348aa27a422480aea29cbfd800b1ababaa ab;

   private static String ab(int var0, int var1) {
      int var3 = var0 ^ 330319756;
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
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ 1069566686;
      int var8 = 0;

      do {
         short var9;
         switch (var8 & 31) {
            case 0:
            default:
               var9 = 109;
               break;
            case 1:
               var9 = 246;
               break;
            case 2:
               var9 = 51;
               break;
            case 3:
               var9 = 109;
               break;
            case 4:
               var9 = 184;
               break;
            case 5:
               var9 = 222;
               break;
            case 6:
               var9 = 157;
               break;
            case 7:
               var9 = 22;
               break;
            case 8:
               var9 = 241;
               break;
            case 9:
               var9 = 25;
               break;
            case 10:
               var9 = 40;
               break;
            case 11:
               var9 = 49;
               break;
            case 12:
               var9 = 145;
               break;
            case 13:
               var9 = 89;
               break;
            case 14:
               var9 = 189;
               break;
            case 15:
               var9 = 184;
               break;
            case 16:
               var9 = 218;
               break;
            case 17:
               var9 = 51;
               break;
            case 18:
               var9 = 251;
               break;
            case 19:
               var9 = 25;
               break;
            case 20:
               var9 = 58;
               break;
            case 21:
               var9 = 109;
               break;
            case 22:
               var9 = 101;
               break;
            case 23:
               var9 = 135;
               break;
            case 24:
               var9 = 36;
               break;
            case 25:
               var9 = 144;
               break;
            case 26:
               var9 = 246;
               break;
            case 27:
               var9 = 14;
               break;
            case 28:
               var9 = 238;
               break;
            case 29:
               var9 = 167;
               break;
            case 30:
               var9 = 148;
               break;
            case 31:
               var9 = 156;
         }

         var4[var8] = (char)(var4[var8] ^ var9 ^ var1 >> 16 ^ var7);
         ++var8;
      } while(var8 < var4.length);

      return (new String(var4)).intern();
   }

   public static q2997348aa27a422480aea29cbfd800b1ababaa a(String var0) {
      return (q2997348aa27a422480aea29cbfd800b1ababaa)Enum.valueOf(q2997348aa27a422480aea29cbfd800b1ababaa.class, var0);
   }

   private static q2997348aa27a422480aea29cbfd800b1ababaa[] aa() {
      return new q2997348aa27a422480aea29cbfd800b1ababaa[]{aa, b, ab};
   }

   static {
      // $FF: Couldn't be decompiled
   }

   private static int b(int var0, int var1) {
      int var2 = ba[var0 ^ 296331518] ^ var1 ^ var0;
      var2 ^= 14237;
      var2 += 32653;
      var2 ^= 54780;
      var2 += 62758;
      var2 -= 62088;
      var2 ^= 16163;
      var2 -= 38231;
      return var2;
   }
}
