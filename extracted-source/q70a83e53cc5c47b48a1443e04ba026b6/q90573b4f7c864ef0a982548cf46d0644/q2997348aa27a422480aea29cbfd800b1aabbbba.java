package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum q2997348aa27a422480aea29cbfd800b1aabbbba {
   private static final int[] bb;
   public static final q2997348aa27a422480aea29cbfd800b1aabbbba a;
   public static final q2997348aa27a422480aea29cbfd800b1aabbbba aa;
   private static final Object[] aab;
   private final q2997348aa27a422480aea29cbfd800b1babba ab;
   private static final q2997348aa27a422480aea29cbfd800b1aabbbba[] b;
   private static final String[] aaa;
   public static final q2997348aa27a422480aea29cbfd800b1aabbbba ba;

   static {
      // $FF: Couldn't be decompiled
   }

   public String toString() {
      return this.ab.bba();
   }

   private q2997348aa27a422480aea29cbfd800b1aabbbba(q2997348aa27a422480aea29cbfd800b1babba var3) {
      this.ab = var3;
   }

   private static q2997348aa27a422480aea29cbfd800b1aabbbba[] a() {
      return new q2997348aa27a422480aea29cbfd800b1aabbbba[]{ba, a, aa};
   }

   private static String ab(int var0, int var1) {
      int var3 = var0 ^ 579098910;
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
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ -1432136923;
      int var8 = 0;

      do {
         short var9;
         switch (var8 & 31) {
            case 0:
            default:
               var9 = 212;
               break;
            case 1:
               var9 = 48;
               break;
            case 2:
               var9 = 169;
               break;
            case 3:
               var9 = 213;
               break;
            case 4:
               var9 = 56;
               break;
            case 5:
               var9 = 189;
               break;
            case 6:
               var9 = 239;
               break;
            case 7:
               var9 = 1;
               break;
            case 8:
               var9 = 178;
               break;
            case 9:
               var9 = 123;
               break;
            case 10:
               var9 = 122;
               break;
            case 11:
               var9 = 140;
               break;
            case 12:
               var9 = 83;
               break;
            case 13:
               var9 = 195;
               break;
            case 14:
               var9 = 237;
               break;
            case 15:
               var9 = 5;
               break;
            case 16:
               var9 = 14;
               break;
            case 17:
               var9 = 250;
               break;
            case 18:
               var9 = 5;
               break;
            case 19:
               var9 = 233;
               break;
            case 20:
               var9 = 90;
               break;
            case 21:
               var9 = 129;
               break;
            case 22:
               var9 = 159;
               break;
            case 23:
               var9 = 3;
               break;
            case 24:
               var9 = 213;
               break;
            case 25:
               var9 = 119;
               break;
            case 26:
               var9 = 161;
               break;
            case 27:
               var9 = 190;
               break;
            case 28:
               var9 = 188;
               break;
            case 29:
               var9 = 16;
               break;
            case 30:
               var9 = 196;
               break;
            case 31:
               var9 = 61;
         }

         var4[var8] = (char)(var4[var8] ^ var9 ^ var1 >> 16 ^ var7);
         ++var8;
      } while(var8 < var4.length);

      return (new String(var4)).intern();
   }

   private static int b(int var0, int var1) {
      int var2 = bb[var0 ^ 340287710] ^ var1 ^ var0;
      var2 += 10106;
      var2 += 56668;
      var2 += 5085;
      var2 -= 39965;
      var2 ^= 65118;
      var2 ^= 43845;
      var2 ^= 61253;
      var2 ^= 6654;
      var2 -= 38878;
      var2 -= 37139;
      return var2;
   }

   public static q2997348aa27a422480aea29cbfd800b1aabbbba aa(String var0) {
      return (q2997348aa27a422480aea29cbfd800b1aabbbba)Enum.valueOf(q2997348aa27a422480aea29cbfd800b1aabbbba.class, var0);
   }
}
