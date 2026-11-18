package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
class q2997348aa27a422480aea29cbfd800b1babbaab implements q2997348aa27a422480aea29cbfd800b1baaababa {
   final q2997348aa27a422480aea29cbfd800b1abbbaaba a;
   private static final int[] aa;
   private static final Object[] ba;
   private static final String[] ab;
   private static final long b;

   static {
      int var26 = 2144791734;
      int var20 = 0;
      int var10001 = "\u0010ꜧ媻ꃇ嫾ꃆᨦꁏ騶꜃媙ꀛ\u1ad5ꁫ᫆ꀊ\uda3d\nᲡ\uf118\u1ccd煯ᷔ높ᱭ燸ᰱ煗".length();
      int var19 = 0;
      String[] var18 = new String[2];
      int var17 = var10001;
      String var16 = "\u0010ꜧ媻ꃇ嫾ꃆᨦꁏ騶꜃媙ꀛ\u1ad5ꁫ᫆ꀊ\uda3d\nᲡ\uf118\u1ccd煯ᷔ높ᱭ燸ᰱ煗";
      short var21 = 5403;

      do {
         char var22 = var16.charAt(var20);
         int var24 = 0;
         char[] var23 = var16.substring(var20 + 1, var20 + 1 + var22).toCharArray();

         do {
            int var25 = var23[var24];
            short var10000;
            switch (var24 % 5) {
               case 0:
               default:
                  var10000 = 70;
                  break;
               case 1:
                  var10000 = 218;
                  break;
               case 2:
                  var10000 = 50;
                  break;
               case 3:
                  var10000 = 166;
                  break;
               case 4:
                  var10000 = 159;
            }

            var25 = (char)var10000 ^ var25;
            if (var24 % 2 == 0) {
               var23[var24] = (char)((var25 >>> 2 | var25 << 14) & '\uffff' ^ var21);
            } else {
               var23[var24] = (char)((var25 << 2 | var25 >>> 14) & '\uffff' ^ var21);
            }

            ++var24;
         } while(var24 < var23.length);

         var18[var19] = new String(var23);
         ++var19;
         var20 = var20 + var22 + 1;
      } while(var20 < var17);

      ab = var18;
      ba = new Object[var18.length];
      int var12 = 259141853;
      byte[] var10 = "nA|_+orë)/À©\u0093\u0087êeuèµ¥7¼\u0012F4\u0016ø,Ó[×¦ÞE\u007f}".getBytes("ISO-8859-1");
      int var11 = var10.length / 4;
      aa = new int[var11];
      int var13 = 0;
      int var14 = 0;

      do {
         int var15 = (var10[var13] & 255) << 24 | (var10[var13 + 1] & 255) << 16 | (var10[var13 + 2] & 255) << 8 | var10[var13 + 3] & 255;
         var15 ^= var12;
         aa[var14] = var15;
         var13 += 4;
         ++var14;
      } while(var14 < var11);

      long var1 = 5749116359165981835L;
      long[] var0 = new long[2];
      int var4 = 0;
      String var5;
      int var6 = (var5 = aab(var26 ^ -1649158764, '똭', (short)7363)).length();
      int var3 = 0;

      do {
         var10001 = var3;
         var3 += 8;
         byte[] var7 = var5.substring(var10001, var3).getBytes(aab(var26 ^ -877491897, '똬', (short)'鶵'));
         var10001 = var4++;
         long var10004 = (((long)var7[0] & 255L) << aaa(-1256375129, var26 ^ 1409778720) | ((long)var7[1] & 255L) << aaa(-1256375130, var26 ^ 287935117) | ((long)var7[2] & 255L) << aaa(-1256375131, var26 ^ 325661156) | ((long)var7[3] & 255L) << aaa(-1256375132, var26 ^ -1446962351) | ((long)var7[4] & 255L) << aaa(-1256375133, var26 ^ 1336820990) | ((long)var7[5] & 255L) << aaa(-1256375134, var26 ^ 234545924) | ((long)var7[aaa(-1256375135, var26 ^ 240124087)] & 255L) << aaa(-1256375136, var26 ^ -383965554) | (long)var7[aaa(-1256375121, var26 ^ -469530645)] & 255L) ^ var1;
         boolean var10003 = true;
         var0[var10001] = var10004;
      } while(var3 < var6);

      long var8 = var0[1];
      long var10002 = var0[0] ^ var8;
      var10001 = -1;
      b = var10002;
   }

   public int aa() {
      return this.a.aaaaaa;
   }

   private static String aab(int var0, char var1, short var2) {
      int var3 = var1 ^ '똭';
      char[] var4 = ab[var3].toCharArray();
      StackTraceElement[] var5 = (StackTraceElement[])ba[var3];
      StackTraceElement[] var6;
      if (var5 != null) {
         var6 = var5;
      } else {
         var6 = (new Throwable()).getStackTrace();
         ba[var3] = var6;
      }

      StackTraceElement var7 = var6[1];
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 20673;
      int var9 = 0;

      do {
         int var10 = var4[var9] + '鲲';
         var10 ^= 17908;
         var10 -= 49306;
         var10 += 20000;
         var10 -= 62282;
         var10 += 5607;
         var4[var9] = (char)(var10 ^ var8 ^ var2 ^ var0 >> 16);
         ++var9;
      } while(var9 < var4.length);

      return (new String(var4)).intern();
   }

   private static int aaa(int var0, int var1) {
      int var2 = aa[var0 ^ -1256375129] ^ var1 ^ var0;
      var2 ^= 31492;
      var2 ^= 18778;
      var2 ^= 31105;
      var2 -= 52960;
      var2 ^= 856;
      var2 += 58416;
      var2 += 29339;
      var2 ^= 2533;
      var2 ^= 34994;
      var2 += 41072;
      return var2;
   }

   public void ab(int var1) {
      this.a.aaaaaa = var1;
      this.a.bbbbbaa();
   }

   q2997348aa27a422480aea29cbfd800b1babbaab(q2997348aa27a422480aea29cbfd800b1abbbaaba var1) {
      this.a = var1;
   }

   public int ba() {
      return (int)b;
   }

   public String a(int var1) {
      return q2997348aa27a422480aea29cbfd800b1abbbaaba.abaabab(q2997348aa27a422480aea29cbfd800b1abbbaaba.bbababb(var1));
   }
}
