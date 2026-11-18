package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1657;

@Environment(EnvType.CLIENT)
final class q2997348aa27a422480aea29cbfd800b1aabbaaba {
   private final class_1657 a;
   private static final String[] aab;
   private static final Object[] aba;
   private static final long b;
   private final q2997348aa27a422480aea29cbfd800b1baababaa aa = new q2997348aa27a422480aea29cbfd800b1baababaa();
   private static final int[] aaa;
   private final long ab;
   private long ba;
   private long bb;

   static {
      int var20 = -908263341;
      short var15 = 19572;
      String[] var10000 = new String[2];
      int var13 = 0;
      String[] var12 = var10000;
      int var14 = 0;
      int var11 = "\u0010\uf741ߚᮩ\ue46f\uf7a9ꟗ\uf011䑯ᭁߚᮩ\ue46f\uf7a9ꟗ\uf011䑯\n\uda27\udf68\uda97\u1f7f\udeaf뽺\udf07齺\udfc7齽".length();
      String var10 = "\u0010\uf741ߚᮩ\ue46f\uf7a9ꟗ\uf011䑯ᭁߚᮩ\ue46f\uf7a9ꟗ\uf011䑯\n\uda27\udf68\uda97\u1f7f\udeaf뽺\udf07齺\udfc7齽";

      do {
         char var16 = var10.charAt(var14);
         int var10001 = var14 + 1;
         int var18 = 0;
         char[] var17 = var10.substring(var10001, var10001 + var16).toCharArray();

         do {
            char var19 = var17[var18];
            if (var18 % 2 == 0) {
               var17[var18] = (char)((var19 >>> 3 | var19 << 13) & '\uffff' ^ var15);
            } else {
               var17[var18] = (char)((var19 << 3 | var19 >>> 13) & '\uffff' ^ var15);
            }

            ++var18;
         } while(var18 < var17.length);

         var12[var13] = new String(var17);
         ++var13;
         var14 = var14 + var16 + 1;
      } while(var14 < var11);

      aab = var12;
      aba = new Object[var12.length];
      int var21 = 0;
      int var22 = 0;
      aaa = new int[9];
      byte[] var10002 = "³a\u008c\u0090ã\u007f®\u001ap\u00890î\u0014f:Îi\u0016hÃÌ\u0000:g;áâ¹MAÞ{K´\u001e\r".getBytes("ISO-8859-1");

      int var41;
      do {
         aaa[var21] = ((var10002[var22] & 255) << 24 | (var10002[var22 + 1] & 255) << 16 | (var10002[var22 + 2] & 255) << 8 | var10002[var22 + 3] & 255) ^ 979807826;
         ++var21;
         var41 = var22 + 4;
         var22 += 4;
      } while(var41 < var10002.length);

      long var1 = 1494990617439445105L;
      long[] var0 = new long[2];
      int var4 = 0;
      String var5;
      int var6 = (var5 = b('\udeb6', 30699, var20 ^ 2032481147)).length();
      int var3 = 0;

      do {
         var22 = var3;
         var3 += 8;
         byte[] var7 = var5.substring(var22, var3).getBytes(b('泊', 30698, var20 ^ 742544216));
         var22 = var4++;
         long var49 = (((long)var7[0] & 255L) << a(2068936408, var20 ^ 998940477) | ((long)var7[1] & 255L) << a(2068936409, var20 ^ 1804909998) | ((long)var7[2] & 255L) << a(2068936410, var20 ^ -127786159) | ((long)var7[3] & 255L) << a(2068936411, var20 ^ -1668470456) | ((long)var7[4] & 255L) << a(2068936412, var20 ^ -503481526) | ((long)var7[5] & 255L) << a(2068936413, var20 ^ 1156262391) | ((long)var7[a(2068936414, var20 ^ -1291128540)] & 255L) << a(2068936415, var20 ^ -978661919) | (long)var7[a(2068936400, var20 ^ -1017180775)] & 255L) ^ var1;
         var41 = -1;
         var0[var22] = var49;
      } while(var3 < var6);

      long var8 = var0[0];
      long var33 = var0[1] ^ var8;
      var22 = -1;
      b = var33;
   }

   private q2997348aa27a422480aea29cbfd800b1aabbaaba(class_1657 var1, long var2) {
      this.bb = b;
      this.a = var1;
      this.ab = var2;
      this.ba = var2;
   }

   private static String b(char var0, int var1, int var2) {
      int var3 = var1 ^ 30699;
      char[] var4 = aab[var3].toCharArray();
      StackTraceElement[] var5 = (StackTraceElement[])aba[var3];
      StackTraceElement[] var6;
      if (var5 != null) {
         var6 = var5;
      } else {
         var6 = (new Throwable()).getStackTrace();
         aba[var3] = var6;
      }

      StackTraceElement var7 = var6[1];
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 14207;
      int var9 = 0;

      do {
         int var10 = var4[var9] + '\uf2de';
         var10 ^= 62978;
         var10 += 26175;
         var10 ^= 28128;
         var10 -= 38333;
         var4[var9] = (char)(var10 ^ var8 ^ var0 ^ var2 >> 16);
         ++var9;
      } while(var9 < var4.length);

      return (new String(var4)).intern();
   }

   private static int a(int var0, int var1) {
      int var2 = aaa[var0 ^ 2068936408] ^ var1 ^ var0;
      var2 -= 58128;
      var2 -= 38392;
      var2 ^= 23024;
      var2 += 8242;
      var2 ^= 48728;
      var2 ^= 38616;
      var2 ^= 44405;
      var2 -= 44547;
      return var2;
   }
}
