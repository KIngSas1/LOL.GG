package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum q2997348aa27a422480aea29cbfd800b1bbbbaab {
   private static final Object[] aaa;
   public static final q2997348aa27a422480aea29cbfd800b1bbbbaab a;
   private final q2997348aa27a422480aea29cbfd800b1babba aa;
   public static final q2997348aa27a422480aea29cbfd800b1bbbbaab b;
   private static final int[] ba;
   private static final q2997348aa27a422480aea29cbfd800b1bbbbaab[] ab;
   private static final String[] bb;

   public String toString() {
      return this.aa.bba();
   }

   static {
      // $FF: Couldn't be decompiled
   }

   public q2997348aa27a422480aea29cbfd800b1babba a() {
      return this.aa;
   }

   private static String ba(int var0, int var1) {
      int var3 = var0 ^ 464108191;
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
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ -451178838;
      int var8 = 0;

      do {
         short var9;
         switch (var8 & 31) {
            case 0:
            default:
               var9 = 233;
               break;
            case 1:
               var9 = 17;
               break;
            case 2:
               var9 = 50;
               break;
            case 3:
               var9 = 126;
               break;
            case 4:
               var9 = 169;
               break;
            case 5:
               var9 = 44;
               break;
            case 6:
               var9 = 208;
               break;
            case 7:
               var9 = 106;
               break;
            case 8:
               var9 = 66;
               break;
            case 9:
               var9 = 211;
               break;
            case 10:
               var9 = 225;
               break;
            case 11:
               var9 = 28;
               break;
            case 12:
               var9 = 62;
               break;
            case 13:
               var9 = 142;
               break;
            case 14:
               var9 = 32;
               break;
            case 15:
               var9 = 206;
               break;
            case 16:
               var9 = 162;
               break;
            case 17:
               var9 = 123;
               break;
            case 18:
               var9 = 148;
               break;
            case 19:
               var9 = 63;
               break;
            case 20:
               var9 = 0;
               break;
            case 21:
               var9 = 1;
               break;
            case 22:
               var9 = 203;
               break;
            case 23:
               var9 = 81;
               break;
            case 24:
               var9 = 21;
               break;
            case 25:
               var9 = 181;
               break;
            case 26:
               var9 = 149;
               break;
            case 27:
               var9 = 39;
               break;
            case 28:
               var9 = 213;
               break;
            case 29:
               var9 = 191;
               break;
            case 30:
               var9 = 59;
               break;
            case 31:
               var9 = 154;
         }

         var4[var8] = (char)(var4[var8] ^ var9 ^ var1 >> 16 ^ var7);
         ++var8;
      } while(var8 < var4.length);

      return (new String(var4)).intern();
   }

   public static q2997348aa27a422480aea29cbfd800b1bbbbaab aa(String var0) {
      return (q2997348aa27a422480aea29cbfd800b1bbbbaab)Enum.valueOf(q2997348aa27a422480aea29cbfd800b1bbbbaab.class, var0);
   }

   private static int ab(int var0, int var1) {
      int var2 = ba[var0 ^ -1100464703] ^ var1 ^ var0;
      var2 -= 9198;
      var2 -= 21407;
      var2 += 22889;
      var2 -= 5448;
      var2 ^= 966;
      var2 ^= 8987;
      var2 -= 64916;
      var2 += 55938;
      var2 += 41856;
      return var2;
   }

   private static q2997348aa27a422480aea29cbfd800b1bbbbaab[] b() {
      return new q2997348aa27a422480aea29cbfd800b1bbbbaab[]{b, a};
   }

   private q2997348aa27a422480aea29cbfd800b1bbbbaab(q2997348aa27a422480aea29cbfd800b1babba var3) {
      this.aa = var3;
   }
}
