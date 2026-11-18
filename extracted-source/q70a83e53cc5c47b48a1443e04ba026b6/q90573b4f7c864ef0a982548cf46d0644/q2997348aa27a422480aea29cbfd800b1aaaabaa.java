package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
final class q2997348aa27a422480aea29cbfd800b1aaaabaa {
   private static final Object[] aaaa;
   private q2997348aa27a422480aea29cbfd800b1aabaaabab a;
   private static final int[] bba;
   private final q2997348aa27a422480aea29cbfd800b1aabbbbb aa;
   private static final String[] bbb;
   private long b;
   private Runnable ab;
   private final int ba;
   private final int bb;
   private final q2997348aa27a422480aea29cbfd800b1aabbabaa aaa;
   private int aab;
   private boolean aba;
   private final q2997348aa27a422480aea29cbfd800b1aabbabaa abb;
   private q2997348aa27a422480aea29cbfd800b1aabbabaa baa;
   private static final long bab;

   static {
      int var20 = 486305288;
      int var10001 = "\u0010躳㊖趓劷诚爏躶\uf210輼ሜ躽ዌ謈銡觛犕\n㺳ၘ㦛灹㪚탕㩆僛㿤郁".length();
      short var15 = 21458;
      int var14 = 0;
      int var11 = var10001;
      int var13 = 0;
      String var10 = "\u0010躳㊖趓劷诚爏躶\uf210輼ሜ躽ዌ謈銡觛犕\n㺳ၘ㦛灹㪚탕㩆僛㿤郁";
      String[] var12 = new String[2];

      do {
         char var16 = var10.charAt(var14);
         var10001 = var14 + 1;
         int var10002 = var14 + 1;
         int var18 = 0;
         char[] var17 = var10.substring(var10001, var10002 + var16).toCharArray();

         do {
            int var19 = var17[var18];
            short var10000;
            switch (var18 % 7) {
               case 0:
               default:
                  var10000 = 39;
                  break;
               case 1:
                  var10000 = 176;
                  break;
               case 2:
                  var10000 = 39;
                  break;
               case 3:
                  var10000 = 145;
                  break;
               case 4:
                  var10000 = 238;
                  break;
               case 5:
                  var10000 = 60;
                  break;
               case 6:
                  var10000 = 146;
            }

            var19 = (char)var10000 ^ var19;
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

      bbb = var12;
      aaaa = new Object[var12.length];
      int var22 = 0;
      var10001 = 0;
      bba = new int[9];
      byte[] var30 = ":¸úÀr2Zº:\u0001>mõå\u0019VXÌm\u000b\u0089À?\u0087Ð\u0083_7qË\u001f§O¤vE".getBytes("ISO-8859-1");

      int var44;
      do {
         bba[var22] = ((var30[var10001] & 255) << 24 | (var30[var10001 + 1] & 255) << 16 | (var30[var10001 + 2] & 255) << 8 | var30[var10001 + 3] & 255) ^ 869674081;
         ++var22;
         var44 = var10001 + 4;
         var10001 += 4;
      } while(var44 < var30.length);

      long var1 = 636432065935519976L;
      long[] var0 = new long[2];
      int var4 = 0;
      String var5;
      int var6 = (var5 = aa(-815409078, var20 ^ 771425882)).length();
      int var3 = 0;

      do {
         var10001 = var3;
         var3 += 8;
         byte[] var7 = var5.substring(var10001, var3).getBytes(aa(-815409077, var20 ^ 1004276339));
         var10001 = var4++;
         long var52 = (((long)var7[0] & 255L) << b(554924893, var20 ^ 880834708) | ((long)var7[1] & 255L) << b(554924892, var20 ^ 2081085447) | ((long)var7[2] & 255L) << b(554924895, var20 ^ 876199115) | ((long)var7[3] & 255L) << b(554924894, var20 ^ -69362919) | ((long)var7[4] & 255L) << b(554924889, var20 ^ 1458892667) | ((long)var7[5] & 255L) << b(554924888, var20 ^ -2013741602) | ((long)var7[b(554924891, var20 ^ -558113433)] & 255L) << b(554924890, var20 ^ 2146672100) | (long)var7[b(554924885, var20 ^ 1100805144)] & 255L) ^ var1;
         var44 = -1;
         var0[var10001] = var52;
      } while(var3 < var6);

      long var8 = var0[1];
      long var36 = var0[0] ^ var8;
      var10001 = -1;
      bab = var36;
   }

   private static String aa(int var0, int var1) {
      int var3 = var0 ^ -815409078;
      char[] var4 = bbb[var3].toCharArray();
      StackTraceElement[] var2 = (StackTraceElement[])aaaa[var3];
      StackTraceElement[] var5;
      if (var2 != null) {
         var5 = var2;
      } else {
         var5 = (new Throwable()).getStackTrace();
         aaaa[var3] = var5;
      }

      StackTraceElement var6 = var5[1];
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ -915306816;
      int var8 = 0;

      do {
         short var9;
         switch (var8 & 31) {
            case 0:
            default:
               var9 = 168;
               break;
            case 1:
               var9 = 32;
               break;
            case 2:
               var9 = 75;
               break;
            case 3:
               var9 = 93;
               break;
            case 4:
               var9 = 69;
               break;
            case 5:
               var9 = 69;
               break;
            case 6:
               var9 = 92;
               break;
            case 7:
               var9 = 232;
               break;
            case 8:
               var9 = 244;
               break;
            case 9:
               var9 = 54;
               break;
            case 10:
               var9 = 199;
               break;
            case 11:
               var9 = 128;
               break;
            case 12:
               var9 = 186;
               break;
            case 13:
               var9 = 189;
               break;
            case 14:
               var9 = 88;
               break;
            case 15:
               var9 = 131;
               break;
            case 16:
               var9 = 114;
               break;
            case 17:
               var9 = 4;
               break;
            case 18:
               var9 = 201;
               break;
            case 19:
               var9 = 91;
               break;
            case 20:
               var9 = 204;
               break;
            case 21:
               var9 = 219;
               break;
            case 22:
               var9 = 133;
               break;
            case 23:
               var9 = 76;
               break;
            case 24:
               var9 = 182;
               break;
            case 25:
               var9 = 207;
               break;
            case 26:
               var9 = 155;
               break;
            case 27:
               var9 = 69;
               break;
            case 28:
               var9 = 121;
               break;
            case 29:
               var9 = 84;
               break;
            case 30:
               var9 = 107;
               break;
            case 31:
               var9 = 175;
         }

         var4[var8] = (char)(var4[var8] ^ var9 ^ var1 >> 16 ^ var7);
         ++var8;
      } while(var8 < var4.length);

      return (new String(var4)).intern();
   }

   private static int b(int var0, int var1) {
      int var2 = bba[var0 ^ 554924893] ^ var1 ^ var0;
      var2 -= 46034;
      var2 += 60191;
      var2 ^= 14701;
      var2 -= 56905;
      var2 -= 14809;
      var2 ^= 45990;
      return var2;
   }

   private q2997348aa27a422480aea29cbfd800b1aaaabaa(q2997348aa27a422480aea29cbfd800b1aabbbbb var1, int var2, q2997348aa27a422480aea29cbfd800b1aabbabaa var3, int var4, q2997348aa27a422480aea29cbfd800b1aabbabaa var5, int var6, q2997348aa27a422480aea29cbfd800b1aabbabaa var7, boolean var8, Runnable var9) {
      this.aa = var1;
      this.bb = var2;
      this.abb = var3;
      this.ba = var4;
      this.aaa = var5;
      this.aab = var6;
      this.baa = var7;
      this.aba = var8;
      this.ab = var9;
   }

   private boolean a(int param1, q2997348aa27a422480aea29cbfd800b1aabaaabab param2) {
      // $FF: Couldn't be decompiled
   }
}
