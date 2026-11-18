package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1937;
import net.minecraft.class_238;
import net.minecraft.class_310;
import net.minecraft.class_746;

@Environment(EnvType.CLIENT)
final class q2997348aa27a422480aea29cbfd800b1aaabaaa {
   private static final double aa = 0.74;
   private static final int ab;
   private static final Integer[] ba;
   private static final double bb = 0.035;
   private static final double aaa = 1.15;
   private static final double aab = 0.05;
   private static final String[] abab;
   private static final Integer[] aba;
   private static final int[] a;
   private static final Long[] abb;
   private static final double baa = 0.025;
   private static final long[] bab;
   private static final Object[] abba;
   private static final double bba = 0.42;
   static final double bbb = 0.1;
   private static final double b = 0.02;
   private static final long[] aaaa;
   private static final double aaab = 0.05;
   private static final double aaba = 0.65;
   private static final double aabb = 0.15;
   private static final long[] abaa;

   static q2997348aa27a422480aea29cbfd800b1aaabba aa(class_310 var0, class_746 var1) {
      return ba(var0, var1, 0.1);
   }

   private static long ab(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ aaaa(1215323526, 1964190216 ^ -1508845584)) & aaaa(1215323527, 1964190216 ^ 1643994662);
      if (abb[var3] == null) {
         abb[var3] = bab[var3] ^ var1;
      }

      return abb[var3];
   }

   private static q2997348aa27a422480aea29cbfd800b1babbabbb a(class_1937 param0, class_746 param1, double param2, double param4, double param6) {
      // $FF: Couldn't be decompiled
   }

   static q2997348aa27a422480aea29cbfd800b1aaabba ba(class_310 param0, class_746 param1, double param2) {
      // $FF: Couldn't be decompiled
   }

   private static boolean bb(class_1937 param0, double param1, double param3, double param5, double param7) {
      // $FF: Couldn't be decompiled
   }

   private q2997348aa27a422480aea29cbfd800b1aaabaaa() {
   }

   private static int aaa(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & ab(aaaa(1215323598, 798580173 ^ 1652486989), 8896859358327783573L)) ^ b(aaaa(1215323599, 798580173 ^ 1723890200), 6625201140038743317L);

      try {
         if (ba[var3] == null) {
            ba[var3] = (int)(aaaa[var3] ^ var1);
         }
      } catch (MatchException var4) {
         throw var4;
      }

      return ba[var3];
   }

   static double aab(double var0, double var2, double var4, double var6, double var8) {
      double var10 = Math.max((double)0.0F, var0 * var4 + var2 * var6);
      double var12 = var10 * 1.15 + 0.035;
      return Math.min(0.42, Math.max(Math.max(0.025, var8), var12));
   }

   private static int aaaa(int var0, int var1) {
      int var2 = a[var0 ^ 1215323526] ^ var1 ^ var0;
      var2 += 30444;
      var2 -= 62387;
      var2 ^= 49793;
      var2 -= 29178;
      var2 += 47004;
      var2 ^= 19965;
      var2 -= 3175;
      var2 -= 52951;
      var2 ^= 6081;
      var2 -= 32707;
      return var2;
   }

   private static String aaab(int var0, int var1, char var2, int var3, char var4, byte var5, int var6) {
      int var11 = var1 ^ -1761198048;
      char[] var10 = abab[var11].toCharArray();
      StackTraceElement[] var12 = (StackTraceElement[])abba[var11];
      StackTraceElement[] var13;
      if (var12 != null) {
         var13 = var12;
      } else {
         var13 = (new Throwable()).getStackTrace();
         abba[var11] = var13;
      }

      StackTraceElement var14 = var13[1];
      int var8 = (var14.getClassName().hashCode() ^ var14.getMethodName().hashCode()) >> 16 ^ '鳛';
      int var9 = 0;

      do {
         char var10002 = var10[var9];
         short var10003;
         switch (var9 % 15) {
            case 0:
            default:
               var10003 = 147;
               break;
            case 1:
               var10003 = 193;
               break;
            case 2:
               var10003 = 34;
               break;
            case 3:
               var10003 = 206;
               break;
            case 4:
               var10003 = 128;
               break;
            case 5:
               var10003 = 51;
               break;
            case 6:
               var10003 = 18;
               break;
            case 7:
               var10003 = 204;
               break;
            case 8:
               var10003 = 160;
               break;
            case 9:
               var10003 = 70;
               break;
            case 10:
               var10003 = 133;
               break;
            case 11:
               var10003 = 215;
               break;
            case 12:
               var10003 = 15;
               break;
            case 13:
               var10003 = 159;
               break;
            case 14:
               var10003 = 217;
         }

         var10[var9] = (char)(var10002 ^ var10003 ^ var9 ^ '픶' ^ var3 ^ var0 ^ var1 ^ var5 ^ var8 ^ var6 ^ var2 ^ var4);
         ++var9;
      } while(var9 < var10.length);

      return (new String(var10)).intern();
   }

   static boolean aba(class_1937 param0, class_746 param1, double param2, double param4) {
      // $FF: Couldn't be decompiled
   }

   private static double abb(double var0, double var2, int var4, int var5) {
      try {
         try {
            if (var5 <= 1) {
               return (var0 + var2) * (double)0.5F;
            }
         } catch (IllegalStateException var6) {
            throw var6;
         }
      } catch (MatchException var7) {
         throw var7;
      }

      return var0 + (var2 - var0) * ((double)var4 / (double)(var5 - 1));
   }

   static double baa(class_1937 param0, class_746 param1) {
      // $FF: Couldn't be decompiled
   }

   static {
      int var41 = -1251832390;
      int var35 = 0;
      int var34 = 0;
      short var36 = 21934;
      int var32 = "#\ue5f7៦\uec07柤\ue6d7\u17ea\ued17矧\ue777\u17ed\ue627\ua7e1\ue347ߦ\ue2c7߮\uef87쟥\ue697\uf7ed\ue127ퟠ\uec57៨\ue2b7\uf7e5\ue487柣\ue557\uf7ef\uedf7\ue7eb\ue7b7㟥\ue387Xོ䰃ຜ鰊ּఀ\u0eec찃ྜ및ܜ밀\u07bc氉Ь\uec0cࡼ谈Ì각ࢌ尋Ό\udc00જ\udc00ļ\uec03ௌ찄\u0efc밆ۜ\udc01ࢌ㰎༜導Ӭ䰈ǌᰈټ\udc07ߌ簎ඌ䰅ਜ\udc01\u07bcఌ\u061cⰍҼ갍ż밂ཌ鰁ඌ찄࿌鰋ܜ尃ড়ﰆڼ\uec08ެ氉ь谏Ӝ\uec0dǌᰆ˼㰏౬ఀజ찌बᰄ͌谆\n쁗쟄쬇\uf7c3옷៍쿧ퟂ얧៊\u0010炍嵵糭ﵵ缝ﵰ翽絳羍굷爽嵶熽ﵾ甽絸\n\uf5fa櫱ﺪ嫶\uf39a뫸琢竷\uf00a뫿(ꈇ\uf7a8ꀗ\ue7abꎧ螬갗䞠ꜧ㞫꿷ާ귇ꞣ꺷鞥ꖷ鞡ꉇ➦ꅇ枥ꈷ\ue7a9갧ឣꨇ랥굷鞪ꜗ\ue7a1꼧➣\ua637枤ꙧ잭ꅗު\n䌭뵇䡽赀䕍济䲝굁䛝浉\u0010\uea78磦\ue058\ud8ee\ue5a8飤\ue978磠\ueeb8棣\ue8f8裥\ue318죥\ue448飫\nᮟ༟\u10cf㼘᷿\udf16ᐯἙṯ\udf11".length();
      String[] var33 = new String[9];
      String var31 = "#\ue5f7៦\uec07柤\ue6d7\u17ea\ued17矧\ue777\u17ed\ue627\ua7e1\ue347ߦ\ue2c7߮\uef87쟥\ue697\uf7ed\ue127ퟠ\uec57៨\ue2b7\uf7e5\ue487柣\ue557\uf7ef\uedf7\ue7eb\ue7b7㟥\ue387Xོ䰃ຜ鰊ּఀ\u0eec찃ྜ및ܜ밀\u07bc氉Ь\uec0cࡼ谈Ì각ࢌ尋Ό\udc00જ\udc00ļ\uec03ௌ찄\u0efc밆ۜ\udc01ࢌ㰎༜導Ӭ䰈ǌᰈټ\udc07ߌ簎ඌ䰅ਜ\udc01\u07bcఌ\u061cⰍҼ갍ż밂ཌ鰁ඌ찄࿌鰋ܜ尃ড়ﰆڼ\uec08ެ氉ь谏Ӝ\uec0dǌᰆ˼㰏౬ఀజ찌बᰄ͌谆\n쁗쟄쬇\uf7c3옷៍쿧ퟂ얧៊\u0010炍嵵糭ﵵ缝ﵰ翽絳羍굷爽嵶熽ﵾ甽絸\n\uf5fa櫱ﺪ嫶\uf39a뫸琢竷\uf00a뫿(ꈇ\uf7a8ꀗ\ue7abꎧ螬갗䞠ꜧ㞫꿷ާ귇ꞣ꺷鞥ꖷ鞡ꉇ➦ꅇ枥ꈷ\ue7a9갧ឣꨇ랥굷鞪ꜗ\ue7a1꼧➣\ua637枤ꙧ잭ꅗު\n䌭뵇䡽赀䕍济䲝굁䛝浉\u0010\uea78磦\ue058\ud8ee\ue5a8飤\ue978磠\ueeb8棣\ue8f8裥\ue318죥\ue448飫\nᮟ༟\u10cf㼘᷿\udf16ᐯἙṯ\udf11";

      do {
         char var37 = var31.charAt(var35);
         int var10001 = var35 + 1;
         int var10002 = var35 + 1 + var37;
         int var39 = 0;
         char[] var38 = var31.substring(var10001, var10002).toCharArray();

         do {
            char var40 = var38[var39];
            if (var39 % 2 == 0) {
               var38[var39] = (char)((var40 >>> 4 | var40 << 12) & '\uffff' ^ var36);
            } else {
               var38[var39] = (char)((var40 << 4 | var40 >>> 12) & '\uffff' ^ var36);
            }

            ++var39;
         } while(var39 < var38.length);

         var33[var34] = new String(var38);
         ++var34;
         var35 = var35 + var37 + 1;
      } while(var35 < var32);

      abab = var33;
      abba = new Object[var33.length];
      int var10000 = 0;
      int var48 = 0;
      byte[] var67 = "\u008e4ÂLIÚ\u009d\u0017\u008f\u0013,£ÜvLÆß¤\u0099\tÊ°\u0011»{\u0010Lê,^³`ý\rØ§\u0092>\u0015\u0099\r>\u0082¦\fÈÙ9ö\u0086TP@fu~\u008c\"«\u00179Æüå#èICL\u0017\u0012¼²·\u0099\u000fÑÎ\u008d\u0084ÕUÆ»\u0013~ZJ³¼\u0012tîE?À1F=\u0010«v\fJ#\u0098=&\u009d¡\u009fÄ\u0096<Ê0\u0004\u0089d\u0011\u00923\u0086ÄÌdX\u009a\u001cÕh®2\u001e\u0096Ó\u0010e\u009c1\u0011G§\u0005+¬î\u0083\u0092\u0015\u0016®\u001d \u0097R\u0082Êäi\u0088h«%\rñ2¥)Vóf÷\u009aÛ\bAû1<\u001e\u0002sÂ?\u0018mÜ\b!¯î^[ºv¾¸sÖ\u0085 \u001cPÍBØ¢:3â\u0088\u0085¦RDJàæªÿ7Ë\u00998ðM\"o¢Ó¼\u0000Çrÿi¼+§9\u0088\u008dÎÀmÔ%\u0000 \u001c#þ¡y_ÛB\u0094ó\tÕ¢\u009c\u0006\u0090é·og\u0084ôoâÞ\u0005\u0002Ú\u0090´ÈÃ\u007f\u0095\u0005E#¼\u0010ÑÔí\u0014n\"Óè¬<jS©\\p\u0086á\u0014³".getBytes("ISO-8859-1");
      a = new int[77];

      int var91;
      do {
         a[var10000] = ((var67[var48] & 255) << 24 | (var67[var48 + 1] & 255) << 16 | (var67[var48 + 2] & 255) << 8 | var67[var48 + 3] & 255) ^ 356957404;
         ++var10000;
         var91 = var48 + 4;
         var48 += 4;
      } while(var91 < var67.length);

      String[] var16 = new String[2];
      int var20 = 0;
      String var19;
      int var21 = (var19 = aaab(737323915, -1761198048, (char)'肱', -1962614038, (char)'跄', (byte)-95, -1300239326)).length();
      int var18 = aaaa(1215323524, var41 ^ 1732757530);
      int var17 = -1;

      while(true) {
         label132: {
            ++var17;
            char[] var51 = var19.substring(var17, var17 + var18).toCharArray();
            var91 = var51.length;
            int var22 = 0;
            var75 = var51;
            int var54 = var91;
            char[] var95;
            int var114;
            if (var91 <= 1) {
               var95 = var51;
               var114 = var22;
            } else {
               var75 = var51;
               var54 = var91;
               if (var91 <= var22) {
                  break label132;
               }

               var95 = var51;
               var114 = var22;
            }

            while(true) {
               char var124 = var95[var114];
               int var128;
               switch (var22 % aaaa(1215323525, var41 ^ 874686591)) {
                  case 0 -> var128 = aaaa(1215323522, var41 ^ 938495388);
                  case 1 -> var128 = aaaa(1215323523, var41 ^ 585430276);
                  case 2 -> var128 = aaaa(1215323520, var41 ^ -1824221049);
                  case 3 -> var128 = aaaa(1215323521, var41 ^ -1005951223);
                  case 4 -> var128 = aaaa(1215323534, var41 ^ 358167410);
                  case 5 -> var128 = aaaa(1215323535, var41 ^ 2053816827);
                  default -> var128 = 5;
               }

               var95[var114] = (char)(var124 ^ var128);
               ++var22;
               if (var54 == 0) {
                  var114 = var54;
                  var95 = var75;
               } else {
                  if (var54 <= var22) {
                     break;
                  }

                  var95 = var75;
                  var114 = var22;
               }
            }
         }

         String var102 = (new String(var75)).intern();
         var48 = -1;
         var16[var20++] = var102;
         if ((var17 += var18) >= var21) {
            long var8 = 7394228305119380493L;
            long[] var14 = new long[aaaa(1215323532, var41 ^ -446011884)];
            int var11 = 0;
            String var12;
            int var13 = (var12 = aaab(1371252010, -1761198047, '歲', -1904772300, (char)'숉', (byte)-13, -1196465915)).length();
            int var10 = 0;

            label113:
            while(true) {
               var48 = var10;
               var10 += 8;
               byte[] var15 = var12.substring(var48, var10).getBytes(aaab(1720920736, -1761198046, (char)32678, -1178988725, (char)728, (byte)86, 297078140));
               long[] var45 = var14;
               var48 = var11++;
               long var80 = ((long)var15[0] & 255L) << aaaa(1215323533, var41 ^ -459525381) | ((long)var15[1] & 255L) << aaaa(1215323530, var41 ^ 517128077) | ((long)var15[2] & 255L) << aaaa(1215323531, var41 ^ -1473077590) | ((long)var15[3] & 255L) << aaaa(1215323528, var41 ^ 1685471416) | ((long)var15[4] & 255L) << aaaa(1215323529, var41 ^ -778954685) | ((long)var15[5] & 255L) << aaaa(1215323542, var41 ^ -876827166) | ((long)var15[aaaa(1215323543, var41 ^ -1539049966)] & 255L) << aaaa(1215323540, var41 ^ 1524858276) | (long)var15[aaaa(1215323541, var41 ^ 966420781)] & 255L;
               byte var103 = -1;

               while(true) {
                  long var116 = var80 ^ var8;
                  switch (var103) {
                     case 0:
                        var45[var48] = var116;
                        if (var10 >= var13) {
                           abaa = var14;
                           aba = new Integer[aaaa(1215323547, var41 ^ -321027916)];
                           long var0 = 5023011724254504744L;
                           long[] var6 = new long[aaaa(1215323544, var41 ^ 2053595744)];
                           int var3 = 0;
                           String var4;
                           int var5 = (var4 = aaab(598278879, -1761198043, (char)7151, -1118292919, (char)'\udf89', (byte)-77, 1233215145)).length();
                           int var2 = 0;

                           label103:
                           while(true) {
                              var48 = var2;
                              var2 += 8;
                              byte[] var7 = var4.substring(var48, var2).getBytes(aaab(548855394, -1761198042, '쎝', -1782134288, (char)'\ue636', (byte)97, 1526779860));
                              var45 = var6;
                              var48 = var3++;
                              var80 = ((long)var7[0] & 255L) << aaaa(1215323545, var41 ^ 607171404) | ((long)var7[1] & 255L) << aaaa(1215323558, var41 ^ -192838817) | ((long)var7[2] & 255L) << aaaa(1215323559, var41 ^ -632652501) | ((long)var7[3] & 255L) << aaaa(1215323556, var41 ^ -130975822) | ((long)var7[4] & 255L) << aaaa(1215323557, var41 ^ -116178033) | ((long)var7[5] & 255L) << aaaa(1215323554, var41 ^ -1007154666) | ((long)var7[aaaa(1215323555, var41 ^ 2051142196)] & 255L) << aaaa(1215323552, var41 ^ -168528947) | (long)var7[aaaa(1215323553, var41 ^ 1788739828)] & 255L;
                              var103 = -1;

                              while(true) {
                                 var116 = var80 ^ var0;
                                 switch (var103) {
                                    case 0:
                                       var45[var48] = var116;
                                       if (var2 >= var5) {
                                          bab = var6;
                                          abb = new Long[aaaa(1215323575, var41 ^ 1458345821)];
                                          long var23 = ab(aaaa(1215323572, var41 ^ 1836375949), 3719256722838974496L);
                                          long[] var29 = new long[3];
                                          int var26 = 0;
                                          String var27;
                                          int var28 = (var27 = var16[1]).length();
                                          int var25 = 0;

                                          do {
                                             var48 = var25;
                                             var25 += 8;
                                             byte[] var30 = var27.substring(var48, var25).getBytes(var16[0]);
                                             var48 = var26++;
                                             var116 = (((long)var30[0] & ab(aaaa(1215323573, var41 ^ 622266884), 4099716394994104731L)) << b(aaaa(1215323570, var41 ^ -765097499), 6801311693700798064L) | ((long)var30[1] & ab(aaaa(1215323571, var41 ^ 1844698090), 6094973719047804570L)) << b(aaaa(1215323568, var41 ^ -1565176170), 5871270440281553960L) | ((long)var30[2] & ab(aaaa(1215323569, var41 ^ 392315445), 6094973719047804570L)) << b(aaaa(1215323582, var41 ^ -794435818), 808403673817386530L) | ((long)var30[3] & ab(aaaa(1215323583, var41 ^ -2013832674), 6094973719047804570L)) << b(aaaa(1215323580, var41 ^ -393043712), 437666126406009325L) | ((long)var30[4] & ab(aaaa(1215323581, var41 ^ -2115395065), 6094973719047804570L)) << b(aaaa(1215323578, var41 ^ -774044700), 514728236836991548L) | ((long)var30[5] & ab(aaaa(1215323579, var41 ^ 674782595), 6094973719047804570L)) << b(aaaa(1215323576, var41 ^ -386502255), 3217840711848662181L) | ((long)var30[b(aaaa(1215323577, var41 ^ 385295127), 7285841443932884883L)] & ab(aaaa(1215323590, var41 ^ 857152808), 6094973719047804570L)) << b(aaaa(1215323591, var41 ^ -511614507), 1200961538751717799L) | (long)var30[b(aaaa(1215323588, var41 ^ -288965081), 3106993257179696636L)] & ab(aaaa(1215323589, var41 ^ -2026762964), 6094973719047804570L)) ^ var23;
                                             var103 = -1;
                                             var29[var48] = var116;
                                          } while(var25 < var28);

                                          aaaa = var29;
                                          int var47 = aaaa(1215323586, var41 ^ -2018028193);
                                          ba = new Integer[3];
                                          ab = aaa(b(var47, 564710318208203059L), ab(aaaa(1215323587, var41 ^ -359863930), 9111871618245240507L));
                                          return;
                                       }
                                       break;
                                    default:
                                       var45[var48] = var116;
                                       if (var2 < var5) {
                                          continue label103;
                                       }

                                       var5 = (var4 = aaab(748735458, -1761198041, (char)'ꬭ', 1643840337, '㺜', (byte)-79, 2044986819)).length();
                                       var2 = 0;
                                 }

                                 var48 = var2;
                                 var2 += 8;
                                 var7 = var4.substring(var48, var2).getBytes(aaab(648069735, -1761198040, '\ue0fa', -866206034, (char)10038, (byte)7, -1873124597));
                                 var45 = var6;
                                 var48 = var3++;
                                 var80 = ((long)var7[0] & 255L) << aaaa(1215323566, var41 ^ 1614561476) | ((long)var7[1] & 255L) << aaaa(1215323567, var41 ^ -442115747) | ((long)var7[2] & 255L) << aaaa(1215323564, var41 ^ -1056827243) | ((long)var7[3] & 255L) << aaaa(1215323565, var41 ^ 533606530) | ((long)var7[4] & 255L) << aaaa(1215323562, var41 ^ -1448094279) | ((long)var7[5] & 255L) << aaaa(1215323563, var41 ^ -162097314) | ((long)var7[aaaa(1215323560, var41 ^ -682849971)] & 255L) << aaaa(1215323561, var41 ^ -529183880) | (long)var7[aaaa(1215323574, var41 ^ -1240506628)] & 255L;
                                 var103 = 0;
                              }
                           }
                        }
                        break;
                     default:
                        var45[var48] = var116;
                        if (var10 < var13) {
                           continue label113;
                        }

                        var13 = (var12 = aaab(-2011964905, -1761198045, '▸', 1682112358, '헆', (byte)-86, 748410102)).length();
                        var10 = 0;
                  }

                  var48 = var10;
                  var10 += 8;
                  var15 = var12.substring(var48, var10).getBytes(aaab(-1740022388, -1761198044, (char)8448, 2079209738, 'ᇄ', (byte)77, 1265750764));
                  var45 = var14;
                  var48 = var11++;
                  var80 = ((long)var15[0] & 255L) << aaaa(1215323538, var41 ^ 1023487334) | ((long)var15[1] & 255L) << aaaa(1215323539, var41 ^ -81088114) | ((long)var15[2] & 255L) << aaaa(1215323536, var41 ^ 1541994939) | ((long)var15[3] & 255L) << aaaa(1215323537, var41 ^ 101831798) | ((long)var15[4] & 255L) << aaaa(1215323550, var41 ^ -653076063) | ((long)var15[5] & 255L) << aaaa(1215323551, var41 ^ 1126361314) | ((long)var15[aaaa(1215323548, var41 ^ -875767421)] & 255L) << aaaa(1215323549, var41 ^ 1979022182) | (long)var15[aaaa(1215323546, var41 ^ 2120756886)] & 255L;
                  var103 = 0;
               }
            }
         }

         var18 = var19.charAt(var17);
      }
   }

   static q2997348aa27a422480aea29cbfd800b1bbbaaa bab(class_746 var0, float var1, float var2) {
      int var3 = q2997348aa27a422480aea29cbfd800b1bbabab.aaab;

      try {
         try {
            if (var0 == null) {
               return null;
            }
         } catch (IllegalStateException var25) {
            throw var25;
         }
      } catch (MatchException var26) {
         throw var26;
      }

      double var4 = Math.sqrt((double)(var1 * var1 + var2 * var2));

      label91: {
         double var10000;
         label92: {
            double var10001;
            label77: {
               try {
                  try {
                     var10000 = var4;
                     var10001 = 0.001;
                     if (var3 != 0) {
                        break label77;
                     }

                     if (var4 < 0.001) {
                        break label91;
                     }
                  } catch (IllegalStateException var23) {
                     throw var23;
                  }
               } catch (MatchException var24) {
                  throw var24;
               }

               try {
                  var10000 = var4;
                  if (var3 != 0) {
                     break label92;
                  }

                  var10001 = (double)1.0F;
               } catch (MatchException var21) {
                  throw var21;
               } catch (IllegalStateException var22) {
                  throw var22;
               }
            }

            if (var10000 > var10001) {
               var1 /= (float)var4;
               var2 /= (float)var4;
            }

            var10000 = Math.toRadians((double)var0.method_36454());
         }

         float var27 = (float)var10000;
         double var28 = Math.sin((double)var27);
         double var29 = Math.cos((double)var27);
         double var30 = -var28 * (double)var1 - var29 * (double)var2;
         double var13 = var29 * (double)var1 - var28 * (double)var2;
         double var15 = Math.sqrt(var30 * var30 + var13 * var13);

         try {
            try {
               if (var15 < 0.001) {
                  return null;
               }
            } catch (IllegalStateException var19) {
               throw var19;
            }
         } catch (MatchException var20) {
            throw var20;
         }

         return new q2997348aa27a422480aea29cbfd800b1bbbaaa(var30 / var15, var13 / var15);
      }

      float var6 = (float)Math.toRadians((double)var0.method_36454());
      double var7 = -Math.sin((double)var6);
      double var9 = Math.cos((double)var6);
      double var11 = Math.sqrt(var7 * var7 + var9 * var9);

      try {
         try {
            if (var11 < 0.001) {
               return null;
            }
         } catch (IllegalStateException var17) {
            throw var17;
         }
      } catch (MatchException var18) {
         throw var18;
      }

      return new q2997348aa27a422480aea29cbfd800b1bbbaaa(var7 / var11, var9 / var11);
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ aaaa(1215323594, 290424755 ^ -895845616);
      if (aba[var3] == null) {
         aba[var3] = (int)(abaa[var3] ^ var1);
      }

      return aba[var3];
   }

   static q2997348aa27a422480aea29cbfd800b1bbbaaa bba(class_310 param0, class_746 param1) {
      // $FF: Couldn't be decompiled
   }

   private static boolean bbb(class_1937 var0, class_746 var1, double var2, double var4) {
      class_238 var6 = var1.method_5829().method_989(var2, var1.field_6017 - (double)var1.method_49476(), var4).method_35580(0.05, (double)0.0F, 0.05);
      return var0.method_8587(var1, var6);
   }
}
