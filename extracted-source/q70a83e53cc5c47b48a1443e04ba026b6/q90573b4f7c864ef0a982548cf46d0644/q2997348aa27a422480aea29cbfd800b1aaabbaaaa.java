package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum q2997348aa27a422480aea29cbfd800b1aaabbaaaa {
   private final q2997348aa27a422480aea29cbfd800b1babba a;
   private static final int[] bb;
   public static final q2997348aa27a422480aea29cbfd800b1aaabbaaaa b;
   public static final q2997348aa27a422480aea29cbfd800b1aaabbaaaa aa;
   private static final Object[] aab;
   private static final q2997348aa27a422480aea29cbfd800b1aaabbaaaa[] ab;
   private static final String[] aaa;
   public static final q2997348aa27a422480aea29cbfd800b1aaabbaaaa ba;

   private static q2997348aa27a422480aea29cbfd800b1aaabbaaaa[] a() {
      return new q2997348aa27a422480aea29cbfd800b1aaabbaaaa[]{ba, aa, b};
   }

   static {
      // $FF: Couldn't be decompiled
   }

   private q2997348aa27a422480aea29cbfd800b1aaabbaaaa(q2997348aa27a422480aea29cbfd800b1babba var3) {
      this.a = var3;
   }

   public String toString() {
      return this.a.bba();
   }

   private static int b(int var0, int var1) {
      int var2 = bb[var0 ^ 1678184971] ^ var1 ^ var0;
      var2 += 53372;
      var2 ^= 29306;
      var2 ^= 32965;
      var2 ^= 41294;
      var2 ^= 11309;
      var2 -= 53412;
      var2 -= 39233;
      return var2;
   }

   private static String aa(int var0, int var1) {
      int var3 = var0 ^ -1670981950;
      char[] var4 = aaa[var3].toCharArray();
      StackTraceElement[] var2 = (StackTraceElement[])aab[var3];
      StackTraceElement[] var5;
      if (var2 != null) {
         var5 = var2;
      } else {
         var5 = (new Throwable()).getStackTrace();
         aab[var3] = var5;
      }

      StackTraceElement var6 = var5[1];
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ -914916500;
      int var8 = 0;

      do {
         short var9;
         switch (var8 & 31) {
            case 0:
            default:
               var9 = 58;
               break;
            case 1:
               var9 = 180;
               break;
            case 2:
               var9 = 23;
               break;
            case 3:
               var9 = 32;
               break;
            case 4:
               var9 = 75;
               break;
            case 5:
               var9 = 53;
               break;
            case 6:
               var9 = 188;
               break;
            case 7:
               var9 = 213;
               break;
            case 8:
               var9 = 10;
               break;
            case 9:
               var9 = 17;
               break;
            case 10:
               var9 = 74;
               break;
            case 11:
               var9 = 100;
               break;
            case 12:
               var9 = 89;
               break;
            case 13:
               var9 = 11;
               break;
            case 14:
               var9 = 210;
               break;
            case 15:
               var9 = 233;
               break;
            case 16:
               var9 = 33;
               break;
            case 17:
               var9 = 1;
               break;
            case 18:
               var9 = 86;
               break;
            case 19:
               var9 = 79;
               break;
            case 20:
               var9 = 102;
               break;
            case 21:
               var9 = 111;
               break;
            case 22:
               var9 = 58;
               break;
            case 23:
               var9 = 134;
               break;
            case 24:
               var9 = 62;
               break;
            case 25:
               var9 = 74;
               break;
            case 26:
               var9 = 81;
               break;
            case 27:
               var9 = 225;
               break;
            case 28:
               var9 = 71;
               break;
            case 29:
               var9 = 188;
               break;
            case 30:
               var9 = 170;
               break;
            case 31:
               var9 = 132;
         }

         var4[var8] = (char)(var4[var8] ^ var9 ^ var1 >> 16 ^ var7);
         ++var8;
      } while(var8 < var4.length);

      return (new String(var4)).intern();
   }
}
