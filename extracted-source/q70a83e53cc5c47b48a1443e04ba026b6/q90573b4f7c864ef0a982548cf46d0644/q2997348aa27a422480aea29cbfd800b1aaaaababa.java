package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum q2997348aa27a422480aea29cbfd800b1aaaaababa {
   private static final q2997348aa27a422480aea29cbfd800b1aaaaababa[] a;
   public static final q2997348aa27a422480aea29cbfd800b1aaaaababa aa;
   private static final int[] aaa;
   private static final Object[] aba;
   private final q2997348aa27a422480aea29cbfd800b1babba ab;
   public static final q2997348aa27a422480aea29cbfd800b1aaaaababa b;
   private static final String[] aab;
   public static final q2997348aa27a422480aea29cbfd800b1aaaaababa ba;
   public static final q2997348aa27a422480aea29cbfd800b1aaaaababa bb;

   public String toString() {
      return this.ab.bba();
   }

   private static String ab(int var0, int var1) {
      int var3 = var0 ^ -1481474411;
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
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ 868660586;
      int var8 = 0;

      do {
         short var9;
         switch (var8 & 31) {
            case 0:
            default:
               var9 = 72;
               break;
            case 1:
               var9 = 82;
               break;
            case 2:
               var9 = 14;
               break;
            case 3:
               var9 = 104;
               break;
            case 4:
               var9 = 103;
               break;
            case 5:
               var9 = 116;
               break;
            case 6:
               var9 = 254;
               break;
            case 7:
               var9 = 252;
               break;
            case 8:
               var9 = 66;
               break;
            case 9:
               var9 = 24;
               break;
            case 10:
               var9 = 124;
               break;
            case 11:
               var9 = 190;
               break;
            case 12:
               var9 = 126;
               break;
            case 13:
               var9 = 120;
               break;
            case 14:
               var9 = 102;
               break;
            case 15:
               var9 = 107;
               break;
            case 16:
               var9 = 126;
               break;
            case 17:
               var9 = 205;
               break;
            case 18:
               var9 = 205;
               break;
            case 19:
               var9 = 149;
               break;
            case 20:
               var9 = 228;
               break;
            case 21:
               var9 = 212;
               break;
            case 22:
               var9 = 216;
               break;
            case 23:
               var9 = 122;
               break;
            case 24:
               var9 = 82;
               break;
            case 25:
               var9 = 55;
               break;
            case 26:
               var9 = 201;
               break;
            case 27:
               var9 = 50;
               break;
            case 28:
               var9 = 44;
               break;
            case 29:
               var9 = 143;
               break;
            case 30:
               var9 = 234;
               break;
            case 31:
               var9 = 183;
         }

         var4[var8] = (char)(var4[var8] ^ var9 ^ var1 >> 16 ^ var7);
         ++var8;
      } while(var8 < var4.length);

      return (new String(var4)).intern();
   }

   public static q2997348aa27a422480aea29cbfd800b1aaaaababa a(String var0) {
      return (q2997348aa27a422480aea29cbfd800b1aaaaababa)Enum.valueOf(q2997348aa27a422480aea29cbfd800b1aaaaababa.class, var0);
   }

   static {
      // $FF: Couldn't be decompiled
   }

   private static q2997348aa27a422480aea29cbfd800b1aaaaababa[] aa() {
      return new q2997348aa27a422480aea29cbfd800b1aaaaababa[]{ba, bb, aa, b};
   }

   private static int b(int var0, int var1) {
      int var2 = aaa[var0 ^ -1021164718] ^ var1 ^ var0;
      var2 -= 2481;
      var2 ^= 14805;
      var2 -= 39085;
      var2 ^= 43799;
      var2 ^= 26761;
      var2 -= 22355;
      var2 += 14117;
      return var2;
   }

   private q2997348aa27a422480aea29cbfd800b1aaaaababa(q2997348aa27a422480aea29cbfd800b1babba var3) {
      this.ab = var3;
   }
}
