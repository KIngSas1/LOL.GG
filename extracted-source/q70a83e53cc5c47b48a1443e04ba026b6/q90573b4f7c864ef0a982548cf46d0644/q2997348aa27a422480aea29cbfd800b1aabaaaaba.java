package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
final class q2997348aa27a422480aea29cbfd800b1aabaaaaba {
   final String a;
   final double b;
   final double aa;
   final String ab;
   double ba;
   private static final String[] bba;
   private static final long bb;
   final boolean aaa;
   private static final int[] bab;
   final double aab;
   final int aba;
   private static final Object[] bbb;
   final double abb;
   final int baa;

   static {
      int var26 = -542761944;
      short var21 = 24984;
      int var20 = 0;
      int var17 = "\u0010䙭ᔕ䌵딍䑽ᔕ䀵픍䇝\uf506䓝딒䌵\uf51e䒭\uf50a\nପ\ua83bലꠧ੪젦\u0eda\ua83a࢚⠡".length();
      String var16 = "\u0010䙭ᔕ䌵딍䑽ᔕ䀵픍䇝\uf506䓝딒䌵\uf51e䒭\uf50a\nପ\ua83bലꠧ੪젦\u0eda\ua83a࢚⠡";
      int var19 = 0;
      String[] var18 = new String[2];

      do {
         char var22 = var16.charAt(var20);
         int var24 = 0;
         char[] var23 = var16.substring(var20 + 1, var20 + 1 + var22).toCharArray();

         do {
            char var25 = var23[var24];
            if (var24 % 2 == 0) {
               var23[var24] = (char)((var25 >>> 3 | var25 << 13) & '\uffff' ^ var21);
            } else {
               var23[var24] = (char)((var25 << 3 | var25 >>> 13) & '\uffff' ^ var21);
            }

            ++var24;
         } while(var24 < var23.length);

         var18[var19] = new String(var23);
         ++var19;
         var20 = var20 + var22 + 1;
      } while(var20 < var17);

      bba = var18;
      bbb = new Object[var18.length];
      int var12 = -476252368;
      byte[] var10 = ")\u0015\u0086\u0006\u0006³]Ï'!\u000eÿ¸\u009c\u0093Þ\u001d]\u0003~Vüü\u009bø¥Ê¬\u00adv\u0006ßíq÷\u0091".getBytes("ISO-8859-1");
      int var11 = var10.length / 4;
      bab = new int[var11];
      int var13 = 0;
      int var14 = 0;

      do {
         int var15 = (var10[var13] & 255) << 24 | (var10[var13 + 1] & 255) << 16 | (var10[var13 + 2] & 255) << 8 | var10[var13 + 3] & 255;
         var15 ^= var12;
         bab[var14] = var15;
         var13 += 4;
         ++var14;
      } while(var14 < var11);

      long var1 = 5230733117012452431L;
      long[] var0 = new long[2];
      int var4 = 0;
      String var5;
      int var6 = (var5 = aa(1171830144, var26 ^ 1205621445)).length();
      int var3 = 0;

      do {
         int var10001 = var3;
         var3 += 8;
         byte[] var7 = var5.substring(var10001, var3).getBytes(aa(1171830145, var26 ^ -1371250220));
         var10001 = var4++;
         long var10004 = (((long)var7[0] & 255L) << b(-1746912972, var26 ^ 2100354371) | ((long)var7[1] & 255L) << b(-1746912971, var26 ^ 1385563795) | ((long)var7[2] & 255L) << b(-1746912970, var26 ^ 1929663912) | ((long)var7[3] & 255L) << b(-1746912969, var26 ^ -323368848) | ((long)var7[4] & 255L) << b(-1746912976, var26 ^ 1232623839) | ((long)var7[5] & 255L) << b(-1746912975, var26 ^ 47818531) | ((long)var7[b(-1746912974, var26 ^ -1400860387)] & 255L) << b(-1746912973, var26 ^ -111977107) | (long)var7[b(-1746912964, var26 ^ -1185633233)] & 255L) ^ var1;
         boolean var10003 = true;
         var0[var10001] = var10004;
      } while(var3 < var6);

      long var8 = var0[0];
      long var10002 = var0[1] ^ var8;
      boolean var29 = true;
      bb = var10002;
   }

   q2997348aa27a422480aea29cbfd800b1aabaaaaba(String var1, String var2, int var3, boolean var4, double var5, double var7, double var9, double var11, int var13) {
      this.a = var1;
      this.ab = var2;
      this.aba = var3;
      this.aaa = var4;
      this.aab = var5;
      this.abb = var7;
      this.b = var9;
      this.aa = var11;
      this.baa = var13;
   }

   private static String aa(int var0, int var1) {
      int var3 = var0 ^ 1171830144;
      char[] var4 = bba[var3].toCharArray();
      StackTraceElement[] var2 = (StackTraceElement[])bbb[var3];
      StackTraceElement[] var5;
      if (var2 != null) {
         var5 = var2;
      } else {
         var5 = (new Throwable()).getStackTrace();
         bbb[var3] = var5;
      }

      StackTraceElement var6 = var5[1];
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ 905026321;
      int var8 = 0;

      do {
         short var9;
         switch (var8 & 31) {
            case 0:
            default:
               var9 = 118;
               break;
            case 1:
               var9 = 212;
               break;
            case 2:
               var9 = 179;
               break;
            case 3:
               var9 = 74;
               break;
            case 4:
               var9 = 47;
               break;
            case 5:
               var9 = 84;
               break;
            case 6:
               var9 = 180;
               break;
            case 7:
               var9 = 182;
               break;
            case 8:
               var9 = 100;
               break;
            case 9:
               var9 = 98;
               break;
            case 10:
               var9 = 180;
               break;
            case 11:
               var9 = 193;
               break;
            case 12:
               var9 = 185;
               break;
            case 13:
               var9 = 244;
               break;
            case 14:
               var9 = 216;
               break;
            case 15:
               var9 = 112;
               break;
            case 16:
               var9 = 126;
               break;
            case 17:
               var9 = 234;
               break;
            case 18:
               var9 = 196;
               break;
            case 19:
               var9 = 77;
               break;
            case 20:
               var9 = 36;
               break;
            case 21:
               var9 = 47;
               break;
            case 22:
               var9 = 230;
               break;
            case 23:
               var9 = 99;
               break;
            case 24:
               var9 = 231;
               break;
            case 25:
               var9 = 207;
               break;
            case 26:
               var9 = 94;
               break;
            case 27:
               var9 = 166;
               break;
            case 28:
               var9 = 24;
               break;
            case 29:
               var9 = 27;
               break;
            case 30:
               var9 = 46;
               break;
            case 31:
               var9 = 3;
         }

         var4[var8] = (char)(var4[var8] ^ var9 ^ var1 >> 16 ^ var7);
         ++var8;
      } while(var8 < var4.length);

      return (new String(var4)).intern();
   }

   private static int b(int var0, int var1) {
      int var2 = bab[var0 ^ -1746912972] ^ var1 ^ var0;
      var2 -= 52796;
      var2 ^= 50147;
      var2 += 65438;
      var2 ^= 42520;
      var2 += 45598;
      var2 -= 55657;
      var2 += 18703;
      return var2;
   }

   boolean a() {
      // $FF: Couldn't be decompiled
   }
}
