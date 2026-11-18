package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
enum q2997348aa27a422480aea29cbfd800b1bbabbaab {
   private static final q2997348aa27a422480aea29cbfd800b1bbabbaab[] a;
   private static final String[] aab;
   public static final q2997348aa27a422480aea29cbfd800b1bbabbaab aa;
   private static final int[] aaa;
   public static final q2997348aa27a422480aea29cbfd800b1bbabbaab ab;
   private static final Object[] aba;
   private final q2997348aa27a422480aea29cbfd800b1babba ba;
   public static final q2997348aa27a422480aea29cbfd800b1bbabbaab b;
   public static final q2997348aa27a422480aea29cbfd800b1bbabbaab bb;

   private static String aa(int var0, int var1) {
      int var3 = var0 ^ 555965447;
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
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ 78594331;
      int var8 = 0;

      do {
         short var9;
         switch (var8 & 31) {
            case 0:
            default:
               var9 = 44;
               break;
            case 1:
               var9 = 26;
               break;
            case 2:
               var9 = 23;
               break;
            case 3:
               var9 = 16;
               break;
            case 4:
               var9 = 80;
               break;
            case 5:
               var9 = 44;
               break;
            case 6:
               var9 = 64;
               break;
            case 7:
               var9 = 87;
               break;
            case 8:
               var9 = 239;
               break;
            case 9:
               var9 = 123;
               break;
            case 10:
               var9 = 196;
               break;
            case 11:
               var9 = 60;
               break;
            case 12:
               var9 = 182;
               break;
            case 13:
               var9 = 25;
               break;
            case 14:
               var9 = 152;
               break;
            case 15:
               var9 = 17;
               break;
            case 16:
               var9 = 64;
               break;
            case 17:
               var9 = 27;
               break;
            case 18:
               var9 = 79;
               break;
            case 19:
               var9 = 65;
               break;
            case 20:
               var9 = 235;
               break;
            case 21:
               var9 = 172;
               break;
            case 22:
               var9 = 49;
               break;
            case 23:
               var9 = 218;
               break;
            case 24:
               var9 = 139;
               break;
            case 25:
               var9 = 156;
               break;
            case 26:
               var9 = 188;
               break;
            case 27:
               var9 = 103;
               break;
            case 28:
               var9 = 40;
               break;
            case 29:
               var9 = 13;
               break;
            case 30:
               var9 = 44;
               break;
            case 31:
               var9 = 133;
         }

         var4[var8] = (char)(var4[var8] ^ var9 ^ var1 >> 16 ^ var7);
         ++var8;
      } while(var8 < var4.length);

      return (new String(var4)).intern();
   }

   public String toString() {
      return this.ba.bba();
   }

   private static int b(int var0, int var1) {
      int var2 = aaa[var0 ^ -349763071] ^ var1 ^ var0;
      var2 ^= 24354;
      var2 -= 52597;
      var2 -= 40408;
      var2 -= 12791;
      var2 ^= 12946;
      var2 += 52483;
      return var2;
   }

   private static q2997348aa27a422480aea29cbfd800b1bbabbaab[] a() {
      return new q2997348aa27a422480aea29cbfd800b1bbabbaab[]{aa, ab, b, bb};
   }

   static {
      // $FF: Couldn't be decompiled
   }

   private q2997348aa27a422480aea29cbfd800b1bbabbaab(q2997348aa27a422480aea29cbfd800b1babba var3) {
      this.ba = var3;
   }
}
