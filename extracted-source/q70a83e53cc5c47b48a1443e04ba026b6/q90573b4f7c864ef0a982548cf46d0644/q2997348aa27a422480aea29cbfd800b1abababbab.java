package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import java.util.LinkedHashMap;
import java.util.Map;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
class q2997348aa27a422480aea29cbfd800b1abababbab extends LinkedHashMap {
   private static final Object[] ba;
   private static final int[] b;
   private static final long a;
   final q2997348aa27a422480aea29cbfd800b1aaaababa aa;
   private static final String[] ab;

   q2997348aa27a422480aea29cbfd800b1abababbab(q2997348aa27a422480aea29cbfd800b1aaaababa var1, int var2, float var3, boolean var4) {
      super(var2, var3, var4);
      this.aa = var1;
   }

   private static String b(int var0, short var1, char var2) {
      int var3 = var2 ^ 23867;
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
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 5173;
      int var9 = 0;

      do {
         int var10 = var4[var9] ^ 2968;
         var10 -= 50201;
         var10 += 43622;
         var10 += 50939;
         var10 -= 40835;
         var10 ^= 31912;
         var4[var9] = (char)(var10 ^ var8 ^ var1 ^ var0 >> 16);
         ++var9;
      } while(var9 < var4.length);

      return (new String(var4)).intern();
   }

   static {
      int var26 = -1761056280;
      int var19 = 0;
      String[] var10002 = new String[2];
      int var20 = 0;
      String[] var18 = var10002;
      int var10001 = "\u0010➞\ue8dc⡲棣⬦蠬⡨제⩻⣱⡞ᢵ⮹袽⣮죙\n拢璑拮ᒚ嵺\ue45c崄푫峧咆".length();
      short var21 = 30643;
      int var17 = var10001;
      String var16 = "\u0010➞\ue8dc⡲棣⬦蠬⡨제⩻⣱⡞ᢵ⮹袽⣮죙\n拢璑拮ᒚ嵺\ue45c崄푫峧咆";

      do {
         char var22 = var16.charAt(var20);
         var10001 = var20 + 1;
         int var33 = var20 + 1;
         int var24 = 0;
         char[] var23 = var16.substring(var10001, var33 + var22).toCharArray();

         do {
            int var25 = var23[var24];
            short var10000;
            switch (var24 % 7) {
               case 0:
               default:
                  var10000 = 54;
                  break;
               case 1:
                  var10000 = 243;
                  break;
               case 2:
                  var10000 = 218;
                  break;
               case 3:
                  var10000 = 198;
                  break;
               case 4:
                  var10000 = 158;
                  break;
               case 5:
                  var10000 = 1;
                  break;
               case 6:
                  var10000 = 144;
            }

            var25 = (char)var10000 ^ var25;
            if (var24 % 2 == 0) {
               var23[var24] = (char)((var25 >>> 4 | var25 << 12) & '\uffff' ^ var21);
            } else {
               var23[var24] = (char)((var25 << 4 | var25 >>> 12) & '\uffff' ^ var21);
            }

            ++var24;
         } while(var24 < var23.length);

         var18[var19] = new String(var23);
         ++var19;
         var20 = var20 + var22 + 1;
      } while(var20 < var17);

      ab = var18;
      ba = new Object[var18.length];
      int var12 = -1799832978;
      byte[] var10 = "4:\r\u0097äÅÉ¹JðÏ\u0004Þ´©fñ\u0081x\u0094ë9ð\u0002KÈã7\u000f\u009a×ÀyQ«º".getBytes("ISO-8859-1");
      int var11 = var10.length / 4;
      b = new int[var11];
      int var13 = 0;
      int var14 = 0;

      do {
         int var15 = (var10[var13] & 255) << 24 | (var10[var13 + 1] & 255) << 16 | (var10[var13 + 2] & 255) << 8 | var10[var13 + 3] & 255;
         var15 ^= var12;
         b[var14] = var15;
         var13 += 4;
         ++var14;
      } while(var14 < var11);

      long var1 = 768181573351741815L;
      long[] var0 = new long[2];
      int var4 = 0;
      String var5;
      int var6 = (var5 = b(var26 ^ -181442764, (short)'\uf059', '崻')).length();
      int var3 = 0;

      do {
         var10001 = var3;
         var3 += 8;
         byte[] var7 = var5.substring(var10001, var3).getBytes(b(var26 ^ -1422901904, (short)'\ue5e9', '崺'));
         var10001 = var4++;
         long var10004 = (((long)var7[0] & 255L) << a(626269663, var26 ^ 316665066) | ((long)var7[1] & 255L) << a(626269662, var26 ^ -1038077987) | ((long)var7[2] & 255L) << a(626269661, var26 ^ 1813326091) | ((long)var7[3] & 255L) << a(626269660, var26 ^ -128892720) | ((long)var7[4] & 255L) << a(626269659, var26 ^ -681271667) | ((long)var7[5] & 255L) << a(626269658, var26 ^ -841213566) | ((long)var7[a(626269657, var26 ^ 1831668378)] & 255L) << a(626269656, var26 ^ 696204906) | (long)var7[a(626269655, var26 ^ 1605648900)] & 255L) ^ var1;
         boolean var10003 = true;
         var0[var10001] = var10004;
      } while(var3 < var6);

      long var8 = var0[0];
      long var34 = var0[1] ^ var8;
      var10001 = -1;
      a = var34;
   }

   private static int a(int var0, int var1) {
      int var2 = b[var0 ^ 626269663] ^ var1 ^ var0;
      var2 -= 44930;
      var2 += 30662;
      var2 += 55271;
      var2 ^= 11433;
      var2 -= 33886;
      var2 -= 58332;
      var2 += 30049;
      var2 ^= 47753;
      var2 -= 19276;
      return var2;
   }

   protected boolean removeEldestEntry(Map.Entry param1) {
      // $FF: Couldn't be decompiled
   }
}
