package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum q2997348aa27a422480aea29cbfd800b1aaaaababb {
   private static final String[] bb;
   public static final q2997348aa27a422480aea29cbfd800b1aaaaababb a;
   private static final Object[] aaa;
   public static final q2997348aa27a422480aea29cbfd800b1aaaaababb aa;
   private static final int[] ba;
   private final q2997348aa27a422480aea29cbfd800b1babba ab;
   private static final q2997348aa27a422480aea29cbfd800b1aaaaababb[] b;

   private q2997348aa27a422480aea29cbfd800b1aaaaababb(q2997348aa27a422480aea29cbfd800b1babba var3) {
      this.ab = var3;
   }

   static {
      // $FF: Couldn't be decompiled
   }

   private static q2997348aa27a422480aea29cbfd800b1aaaaababb[] a() {
      return new q2997348aa27a422480aea29cbfd800b1aaaaababb[]{a, aa};
   }

   private static String aa(int var0, int var1) {
      int var3 = var0 ^ 2136994124;
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
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ 693080637;
      int var8 = 0;

      do {
         short var9;
         switch (var8 & 31) {
            case 0:
            default:
               var9 = 75;
               break;
            case 1:
               var9 = 254;
               break;
            case 2:
               var9 = 148;
               break;
            case 3:
               var9 = 217;
               break;
            case 4:
               var9 = 138;
               break;
            case 5:
               var9 = 198;
               break;
            case 6:
               var9 = 61;
               break;
            case 7:
               var9 = 129;
               break;
            case 8:
               var9 = 160;
               break;
            case 9:
               var9 = 199;
               break;
            case 10:
               var9 = 205;
               break;
            case 11:
               var9 = 19;
               break;
            case 12:
               var9 = 209;
               break;
            case 13:
               var9 = 90;
               break;
            case 14:
               var9 = 152;
               break;
            case 15:
               var9 = 77;
               break;
            case 16:
               var9 = 103;
               break;
            case 17:
               var9 = 139;
               break;
            case 18:
               var9 = 84;
               break;
            case 19:
               var9 = 187;
               break;
            case 20:
               var9 = 187;
               break;
            case 21:
               var9 = 45;
               break;
            case 22:
               var9 = 2;
               break;
            case 23:
               var9 = 222;
               break;
            case 24:
               var9 = 145;
               break;
            case 25:
               var9 = 129;
               break;
            case 26:
               var9 = 191;
               break;
            case 27:
               var9 = 45;
               break;
            case 28:
               var9 = 57;
               break;
            case 29:
               var9 = 228;
               break;
            case 30:
               var9 = 113;
               break;
            case 31:
               var9 = 69;
         }

         var4[var8] = (char)(var4[var8] ^ var9 ^ var1 >> 16 ^ var7);
         ++var8;
      } while(var8 < var4.length);

      return (new String(var4)).intern();
   }

   private static int b(int var0, int var1) {
      int var2 = ba[var0 ^ -2139433478] ^ var1 ^ var0;
      var2 ^= 16454;
      var2 ^= 65258;
      var2 ^= 7529;
      var2 -= 25421;
      var2 ^= 34116;
      var2 ^= 28392;
      var2 -= 40173;
      return var2;
   }

   public String toString() {
      return this.ab.bba();
   }
}
