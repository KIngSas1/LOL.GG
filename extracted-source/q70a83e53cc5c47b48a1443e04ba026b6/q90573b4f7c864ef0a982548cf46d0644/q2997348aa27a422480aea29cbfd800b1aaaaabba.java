package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_238;
import net.minecraft.class_243;

@Environment(EnvType.CLIENT)
public final class q2997348aa27a422480aea29cbfd800b1aaaaabba {
   private static final int a;
   private static final Object[] bb;
   private static final int[] b;
   private static final double aa = (double)0.25F;
   private static final double ab = 0.1;
   private static final String[] ba;

   private static double a(double var0) {
      return Math.min(0.1, var0 * (double)0.25F);
   }

   public static class_243 aa(class_243 param0, class_243 param1, class_238 param2) {
      // $FF: Couldn't be decompiled
   }

   private static String ab(int var0, short var1, byte var2, byte var3) {
      int var8 = var0 ^ -303160482;
      char[] var7 = ba[var8].toCharArray();
      StackTraceElement[] var9 = (StackTraceElement[])bb[var8];
      StackTraceElement[] var10;
      if (var9 != null) {
         var10 = var9;
      } else {
         var10 = (new Throwable()).getStackTrace();
         bb[var8] = var10;
      }

      StackTraceElement var11 = var10[1];
      int var5 = (var11.getClassName().hashCode() ^ var11.getMethodName().hashCode()) >> 16 ^ 14919;
      int var6 = 0;

      do {
         var7[var6] = (char)(var7[var6] ^ 31947 ^ var2 ^ var3 ^ var5 ^ var0 ^ var1);
         ++var6;
      } while(var6 < var7.length);

      return (new String(var7)).intern();
   }

   static {
      int var22 = 826710497;
      short var17 = 14436;
      int var10001 = "\u0010迴ᴥ馔蔠赴㴤衔ꔣ靔┣馔┧赴㴤衔딣\nࣖ\ue582ࠖᖁ۶북ݖ떁і\uf581".length();
      int var16 = 0;
      int var13 = var10001;
      String var12 = "\u0010迴ᴥ馔蔠赴㴤衔ꔣ靔┣馔┧赴㴤衔딣\nࣖ\ue582ࠖᖁ۶북ݖ떁і\uf581";
      String[] var10000 = new String[2];
      int var15 = 0;
      String[] var14 = var10000;

      do {
         char var18 = var12.charAt(var16);
         int var20 = 0;
         char[] var19 = var12.substring(var16 + 1, var16 + 1 + var18).toCharArray();

         do {
            char var21 = var19[var20];
            if (var20 % 2 == 0) {
               var19[var20] = (char)((var21 >>> 5 | var21 << 11) & '\uffff' ^ var17);
            } else {
               var19[var20] = (char)((var21 << 5 | var21 >>> 11) & '\uffff' ^ var17);
            }

            ++var20;
         } while(var20 < var19.length);

         var14[var15] = new String(var19);
         ++var15;
         var16 = var16 + var18 + 1;
      } while(var16 < var13);

      ba = var14;
      bb = new Object[var14.length];
      int var23 = 0;
      var10001 = 0;
      byte[] var10002 = "³Éê\n\u009cþ\u0080xìhì\u0000w»}»6|·ê5\u000eØ;æ\râ\u000bHËÏd\u0097\u0089\u0091ñ".getBytes("ISO-8859-1");
      b = new int[9];

      int var43;
      do {
         b[var23] = ((var10002[var10001] & 255) << 24 | (var10002[var10001 + 1] & 255) << 16 | (var10002[var10001 + 2] & 255) << 8 | var10002[var10001 + 3] & 255) ^ -702229721;
         ++var23;
         var43 = var10001 + 4;
         var10001 += 4;
      } while(var43 < var10002.length);

      long var1 = 5373965207195264250L;
      long[] var0 = new long[2];
      int var4 = 0;
      String var5;
      int var6 = (var5 = ab(-303160482, (short)-23741, (byte)65, (byte)-2)).length();
      int var3 = 0;

      do {
         var10001 = var3;
         var3 += 8;
         byte[] var7 = var5.substring(var10001, var3).getBytes(ab(-303160481, (short)18494, (byte)32, (byte)104));
         var10001 = var4++;
         long var51 = (((long)var7[0] & 255L) << b(1262101350, var22 ^ 529636451) | ((long)var7[1] & 255L) << b(1262101351, var22 ^ 816248360) | ((long)var7[2] & 255L) << b(1262101348, var22 ^ 1076927099) | ((long)var7[3] & 255L) << b(1262101349, var22 ^ -605877287) | ((long)var7[4] & 255L) << b(1262101346, var22 ^ -1708867097) | ((long)var7[5] & 255L) << b(1262101347, var22 ^ -1722372529) | ((long)var7[b(1262101344, var22 ^ 1247122458)] & 255L) << b(1262101345, var22 ^ -460080774) | (long)var7[b(1262101358, var22 ^ 1003612139)] & 255L) ^ var1;
         var43 = -1;
         var0[var10001] = var51;
      } while(var3 < var6);

      long var10 = var0[1];
      long var35 = var0[0] ^ var10;
      var10001 = -1;
      long var8 = var35;
      a = (int)var8;
   }

   private static int b(int var0, int var1) {
      int var2 = b[var0 ^ 1262101350] ^ var1 ^ var0;
      var2 ^= 13287;
      var2 ^= 19854;
      var2 += 14463;
      var2 ^= 8438;
      var2 -= 1003;
      var2 ^= 46790;
      return var2;
   }
}
