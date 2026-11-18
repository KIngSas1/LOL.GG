package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum q2997348aa27a422480aea29cbfd800b1abaaaaaab {
   private static final q2997348aa27a422480aea29cbfd800b1abaaaaaab[] a;
   private static final String[] bb;
   private static final Object[] aaa;
   public static final q2997348aa27a422480aea29cbfd800b1abaaaaaab aa;
   public static final q2997348aa27a422480aea29cbfd800b1abaaaaaab ab;
   private static final int[] b;
   private final q2997348aa27a422480aea29cbfd800b1babba ba;

   private q2997348aa27a422480aea29cbfd800b1abaaaaaab(q2997348aa27a422480aea29cbfd800b1babba var3) {
      this.ba = var3;
   }

   public String toString() {
      return this.ba.bba();
   }

   static {
      // $FF: Couldn't be decompiled
   }

   private static int b(int var0, int var1) {
      int var2 = b[var0 ^ 1602082245] ^ var1 ^ var0;
      var2 ^= 31569;
      var2 -= 38873;
      var2 ^= 31875;
      var2 ^= 2739;
      var2 += 16254;
      var2 += 52920;
      var2 -= 33874;
      var2 -= 47130;
      var2 += 46263;
      return var2;
   }

   private static String aa(int var0, int var1) {
      int var3 = var0 ^ -35540117;
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
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ 2137072382;
      int var8 = 0;

      do {
         short var9;
         switch (var8 & 31) {
            case 0:
            default:
               var9 = 174;
               break;
            case 1:
               var9 = 1;
               break;
            case 2:
               var9 = 177;
               break;
            case 3:
               var9 = 163;
               break;
            case 4:
               var9 = 32;
               break;
            case 5:
               var9 = 163;
               break;
            case 6:
               var9 = 161;
               break;
            case 7:
               var9 = 172;
               break;
            case 8:
               var9 = 110;
               break;
            case 9:
               var9 = 148;
               break;
            case 10:
               var9 = 45;
               break;
            case 11:
               var9 = 199;
               break;
            case 12:
               var9 = 124;
               break;
            case 13:
               var9 = 192;
               break;
            case 14:
               var9 = 208;
               break;
            case 15:
               var9 = 46;
               break;
            case 16:
               var9 = 7;
               break;
            case 17:
               var9 = 114;
               break;
            case 18:
               var9 = 173;
               break;
            case 19:
               var9 = 211;
               break;
            case 20:
               var9 = 18;
               break;
            case 21:
               var9 = 175;
               break;
            case 22:
               var9 = 133;
               break;
            case 23:
               var9 = 133;
               break;
            case 24:
               var9 = 164;
               break;
            case 25:
               var9 = 27;
               break;
            case 26:
               var9 = 10;
               break;
            case 27:
               var9 = 95;
               break;
            case 28:
               var9 = 105;
               break;
            case 29:
               var9 = 69;
               break;
            case 30:
               var9 = 212;
               break;
            case 31:
               var9 = 81;
         }

         var4[var8] = (char)(var4[var8] ^ var9 ^ var1 >> 16 ^ var7);
         ++var8;
      } while(var8 < var4.length);

      return (new String(var4)).intern();
   }

   private static q2997348aa27a422480aea29cbfd800b1abaaaaaab[] a() {
      return new q2997348aa27a422480aea29cbfd800b1abaaaaaab[]{aa, ab};
   }
}
