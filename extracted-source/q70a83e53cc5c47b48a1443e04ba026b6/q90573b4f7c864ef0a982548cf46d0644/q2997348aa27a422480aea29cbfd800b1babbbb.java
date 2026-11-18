package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum q2997348aa27a422480aea29cbfd800b1babbbb {
   public final double a;
   private static final int[] aab;
   public final int aa;
   public static final q2997348aa27a422480aea29cbfd800b1babbbb ab;
   public static final q2997348aa27a422480aea29cbfd800b1babbbb ba;
   private static final String[] aba;
   public static final q2997348aa27a422480aea29cbfd800b1babbbb bb;
   private static final q2997348aa27a422480aea29cbfd800b1babbbb[] aaa;
   private static final Object[] abb;
   public static final q2997348aa27a422480aea29cbfd800b1babbbb b;

   private static String ab(int var0, int var1) {
      int var3 = var0 ^ -953076250;
      char[] var4 = aba[var3].toCharArray();
      StackTraceElement[] var2 = (StackTraceElement[])abb[var3];
      StackTraceElement[] var5;
      if (var2 != null) {
         var5 = var2;
      } else {
         var5 = (new Throwable()).getStackTrace();
         abb[var3] = var5;
      }

      StackTraceElement var6 = var5[1];
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ -1772574124;
      int var8 = 0;

      do {
         short var9;
         switch (var8 & 31) {
            case 0:
            default:
               var9 = 97;
               break;
            case 1:
               var9 = 177;
               break;
            case 2:
               var9 = 99;
               break;
            case 3:
               var9 = 112;
               break;
            case 4:
               var9 = 214;
               break;
            case 5:
               var9 = 226;
               break;
            case 6:
               var9 = 183;
               break;
            case 7:
               var9 = 164;
               break;
            case 8:
               var9 = 164;
               break;
            case 9:
               var9 = 67;
               break;
            case 10:
               var9 = 0;
               break;
            case 11:
               var9 = 150;
               break;
            case 12:
               var9 = 122;
               break;
            case 13:
               var9 = 43;
               break;
            case 14:
               var9 = 214;
               break;
            case 15:
               var9 = 198;
               break;
            case 16:
               var9 = 151;
               break;
            case 17:
               var9 = 115;
               break;
            case 18:
               var9 = 247;
               break;
            case 19:
               var9 = 186;
               break;
            case 20:
               var9 = 23;
               break;
            case 21:
               var9 = 53;
               break;
            case 22:
               var9 = 234;
               break;
            case 23:
               var9 = 120;
               break;
            case 24:
               var9 = 171;
               break;
            case 25:
               var9 = 12;
               break;
            case 26:
               var9 = 68;
               break;
            case 27:
               var9 = 220;
               break;
            case 28:
               var9 = 223;
               break;
            case 29:
               var9 = 137;
               break;
            case 30:
               var9 = 133;
               break;
            case 31:
               var9 = 80;
         }

         var4[var8] = (char)(var4[var8] ^ var9 ^ var1 >> 16 ^ var7);
         ++var8;
      } while(var8 < var4.length);

      return (new String(var4)).intern();
   }

   private static q2997348aa27a422480aea29cbfd800b1babbbb[] a() {
      return new q2997348aa27a422480aea29cbfd800b1babbbb[]{b, bb, ab, ba};
   }

   public static q2997348aa27a422480aea29cbfd800b1babbbb aa(String var0) {
      return (q2997348aa27a422480aea29cbfd800b1babbbb)Enum.valueOf(q2997348aa27a422480aea29cbfd800b1babbbb.class, var0);
   }

   static {
      // $FF: Couldn't be decompiled
   }

   private static int b(int var0, int var1) {
      int var2 = aab[var0 ^ 252557699] ^ var1 ^ var0;
      var2 += 3549;
      var2 ^= 26313;
      var2 += 27117;
      var2 ^= 3878;
      var2 ^= 7718;
      var2 ^= 22489;
      var2 ^= 45434;
      var2 ^= 331;
      var2 -= 53740;
      return var2;
   }

   private q2997348aa27a422480aea29cbfd800b1babbbb(double var3, int var5) {
      this.a = var3;
      this.aa = var5;
   }
}
