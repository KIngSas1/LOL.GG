package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
enum q2997348aa27a422480aea29cbfd800b1babababa {
   public static final q2997348aa27a422480aea29cbfd800b1babababa a;
   private static final String[] aba;
   public static final q2997348aa27a422480aea29cbfd800b1babababa aa;
   private static final q2997348aa27a422480aea29cbfd800b1babababa[] ab;
   public static final q2997348aa27a422480aea29cbfd800b1babababa ba;
   public static final q2997348aa27a422480aea29cbfd800b1babababa bb;
   private static final int[] aab;
   private static final Object[] abb;
   private final q2997348aa27a422480aea29cbfd800b1babba aaa;
   public static final q2997348aa27a422480aea29cbfd800b1babababa b;

   public static q2997348aa27a422480aea29cbfd800b1babababa a(String var0) {
      return (q2997348aa27a422480aea29cbfd800b1babababa)Enum.valueOf(q2997348aa27a422480aea29cbfd800b1babababa.class, var0);
   }

   private q2997348aa27a422480aea29cbfd800b1babababa(q2997348aa27a422480aea29cbfd800b1babba var3) {
      this.aaa = var3;
   }

   private static int b(int var0, int var1) {
      int var2 = aab[var0 ^ 559051808] ^ var1 ^ var0;
      var2 -= 30427;
      var2 -= 62285;
      var2 ^= 45827;
      var2 -= 18517;
      var2 ^= 5326;
      var2 -= 10953;
      return var2;
   }

   static {
      // $FF: Couldn't be decompiled
   }

   private static q2997348aa27a422480aea29cbfd800b1babababa[] aa() {
      return new q2997348aa27a422480aea29cbfd800b1babababa[]{aa, b, bb, ba, a};
   }

   private static String ab(int var0, int var1) {
      int var3 = var0 ^ -1760558065;
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
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ 1281991212;
      int var8 = 0;

      do {
         short var9;
         switch (var8 & 31) {
            case 0:
            default:
               var9 = 55;
               break;
            case 1:
               var9 = 195;
               break;
            case 2:
               var9 = 148;
               break;
            case 3:
               var9 = 235;
               break;
            case 4:
               var9 = 230;
               break;
            case 5:
               var9 = 109;
               break;
            case 6:
               var9 = 124;
               break;
            case 7:
               var9 = 187;
               break;
            case 8:
               var9 = 8;
               break;
            case 9:
               var9 = 152;
               break;
            case 10:
               var9 = 230;
               break;
            case 11:
               var9 = 38;
               break;
            case 12:
               var9 = 224;
               break;
            case 13:
               var9 = 161;
               break;
            case 14:
               var9 = 107;
               break;
            case 15:
               var9 = 88;
               break;
            case 16:
               var9 = 28;
               break;
            case 17:
               var9 = 20;
               break;
            case 18:
               var9 = 224;
               break;
            case 19:
               var9 = 76;
               break;
            case 20:
               var9 = 4;
               break;
            case 21:
               var9 = 13;
               break;
            case 22:
               var9 = 197;
               break;
            case 23:
               var9 = 152;
               break;
            case 24:
               var9 = 201;
               break;
            case 25:
               var9 = 118;
               break;
            case 26:
               var9 = 235;
               break;
            case 27:
               var9 = 189;
               break;
            case 28:
               var9 = 174;
               break;
            case 29:
               var9 = 122;
               break;
            case 30:
               var9 = 226;
               break;
            case 31:
               var9 = 161;
         }

         var4[var8] = (char)(var4[var8] ^ var9 ^ var1 >> 16 ^ var7);
         ++var8;
      } while(var8 < var4.length);

      return (new String(var4)).intern();
   }

   public String toString() {
      return this.aaa.bba();
   }
}
