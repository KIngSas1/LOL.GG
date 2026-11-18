package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
final class q2997348aa27a422480aea29cbfd800b1aabbababb implements q2997348aa27a422480aea29cbfd800b1aabbaaab {
   final q2997348aa27a422480aea29cbfd800b1bbabbbb a;
   private static final Object[] ba;
   private static final int[] aa;
   private static final long b;
   private static final String[] ab;

   private static String ab(int var0, int var1, char var2) {
      int var3 = var1 ^ 19031;
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
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 3567;
      int var9 = 0;

      do {
         int var10 = var4[var9] ^ 20686;
         var10 -= 15006;
         var10 -= 7113;
         var10 -= 24503;
         var10 -= 8369;
         var10 ^= 47552;
         var10 ^= 34050;
         var4[var9] = (char)(var10 ^ var8 ^ var2 ^ var0 >> 16);
         ++var9;
      } while(var9 < var4.length);

      return (new String(var4)).intern();
   }

   static {
      int var20 = -1623069363;
      int var11 = "\u0010땭窦軖쩰땓\ufaf3뛁\udaf3딏竿蹮쪽떣難腝\udaa9\n심쯧싷\ueb08쎒鮺쎀ꮄ쳎⮿".length();
      String[] var10001 = new String[2];
      int var14 = 0;
      int var13 = 0;
      short var15 = 4733;
      String[] var12 = var10001;
      String var10 = "\u0010땭窦軖쩰땓\ufaf3뛁\udaf3딏竿蹮쪽떣難腝\udaa9\n심쯧싷\ueb08쎒鮺쎀ꮄ쳎⮿";

      do {
         char var16 = var10.charAt(var14);
         int var23 = var14 + 1;
         int var10002 = var14 + 1 + var16;
         int var18 = 0;
         char[] var17 = var10.substring(var23, var10002).toCharArray();

         do {
            int var19 = var17[var18];
            short var10000;
            switch (var18 % 7) {
               case 0:
               default:
                  var10000 = 71;
                  break;
               case 1:
                  var10000 = 37;
                  break;
               case 2:
                  var10000 = 124;
                  break;
               case 3:
                  var10000 = 196;
                  break;
               case 4:
                  var10000 = 9;
                  break;
               case 5:
                  var10000 = 121;
                  break;
               case 6:
                  var10000 = 235;
            }

            var19 = (char)var10000 ^ var19;
            if (var18 % 2 == 0) {
               var17[var18] = (char)((var19 >>> 4 | var19 << 12) & '\uffff' ^ var15);
            } else {
               var17[var18] = (char)((var19 << 4 | var19 >>> 12) & '\uffff' ^ var15);
            }

            ++var18;
         } while(var18 < var17.length);

         var12[var13] = new String(var17);
         ++var13;
         var14 = var14 + var16 + 1;
      } while(var14 < var11);

      ab = var12;
      ba = new Object[var12.length];
      int var22 = 0;
      int var24 = 0;
      aa = new int[9];
      byte[] var30 = "2ÑÖ]Ôo,Ml»óõOYî\u0086F\u0087q¥\u0014Ja)\u0019Vë=\n\u000eù×v\"ª0".getBytes("ISO-8859-1");

      int var44;
      do {
         aa[var22] = ((var30[var24] & 255) << 24 | (var30[var24 + 1] & 255) << 16 | (var30[var24 + 2] & 255) << 8 | var30[var24 + 3] & 255) ^ 1438036353;
         ++var22;
         var44 = var24 + 4;
         var24 += 4;
      } while(var44 < var30.length);

      long var1 = 7171768078237534966L;
      long[] var0 = new long[2];
      int var4 = 0;
      String var5;
      int var6 = (var5 = ab(var20 ^ -179312615, 19031, '菿')).length();
      int var3 = 0;

      do {
         var24 = var3;
         var3 += 8;
         byte[] var7 = var5.substring(var24, var3).getBytes(ab(var20 ^ -1982755076, 19030, '쯵'));
         var24 = var4++;
         long var52 = (((long)var7[0] & 255L) << b(975757460, var20 ^ -1039246628) | ((long)var7[1] & 255L) << b(975757461, var20 ^ 615555269) | ((long)var7[2] & 255L) << b(975757462, var20 ^ -1671135354) | ((long)var7[3] & 255L) << b(975757463, var20 ^ -1081711876) | ((long)var7[4] & 255L) << b(975757456, var20 ^ -1235681856) | ((long)var7[5] & 255L) << b(975757457, var20 ^ -459936443) | ((long)var7[b(975757458, var20 ^ -376871044)] & 255L) << b(975757459, var20 ^ -86936191) | (long)var7[b(975757468, var20 ^ -2030229896)] & 255L) ^ var1;
         var44 = -1;
         var0[var24] = var52;
      } while(var3 < var6);

      long var8 = var0[0];
      long var36 = var0[1] ^ var8;
      var24 = -1;
      b = var36;
   }

   public boolean a(int param1, boolean param2) {
      // $FF: Couldn't be decompiled
   }

   private q2997348aa27a422480aea29cbfd800b1aabbababb(q2997348aa27a422480aea29cbfd800b1bbabbbb var1) {
      this.a = var1;
   }

   public int aa(int param1) {
      // $FF: Couldn't be decompiled
   }

   private static int b(int var0, int var1) {
      int var2 = aa[var0 ^ 975757460] ^ var1 ^ var0;
      var2 ^= 39428;
      var2 += 64765;
      var2 ^= 2988;
      var2 -= 57462;
      var2 ^= 58316;
      var2 ^= 12276;
      return var2;
   }
}
