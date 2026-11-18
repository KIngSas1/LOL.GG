package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import java.awt.image.BufferedImage;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_310;
import net.minecraft.class_437;

@Environment(EnvType.CLIENT)
public final class q2997348aa27a422480aea29cbfd800b1abbabbab {
   private static int aa;
   private static final int[] bba;
   private static BufferedImage ab;
   private static final String[] bbb;
   private static final long ba;
   private static final long[] b;
   private static final Long[] bb;
   private static class_437 aaa;
   private static final Long[] aab;
   private static int aba;
   private static final Integer[] abb;
   private static final Object[] aaaa;
   private static long baa;
   private static final long[] bab;
   private static final long[] a;

   private static long aa(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ bb(b(-16711681, 976560265 ^ -200354666), 5711352022660558186L)) & bb(b(-16711682, 976560265 ^ 2070940396), 8325258103915266701L);

      try {
         if (aab[var3] == null) {
            aab[var3] = a[var3] ^ var1;
         }
      } catch (MatchException var4) {
         throw var4;
      }

      return aab[var3];
   }

   private static String aba(short var0, char var1, int var2) {
      int var3 = var1 ^ 5750;
      char[] var4 = bbb[var3].toCharArray();
      StackTraceElement[] var5 = (StackTraceElement[])aaaa[var3];
      StackTraceElement[] var6;
      if (var5 != null) {
         var6 = var5;
      } else {
         var6 = (new Throwable()).getStackTrace();
         aaaa[var3] = var6;
      }

      StackTraceElement var7 = var6[1];
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 9824;
      int var9 = 0;

      do {
         int var10 = var4[var9] - '쁿';
         var10 -= 17027;
         var10 -= 27072;
         var10 ^= 16651;
         var10 -= 29596;
         var10 ^= 1288;
         var10 ^= 8393;
         var10 ^= 30838;
         var4[var9] = (char)(var10 ^ var8 ^ var0 ^ var2 >> 16);
         ++var9;
      } while(var9 < var4.length);

      return (new String(var4)).intern();
   }

   public static void ab(class_310 var0) {
      ba(var0, aa(bb(b(-16711683, 1856855895 ^ -1680166869), 1386102000611814910L), aaa(b(-16711684, 1856855895 ^ -814371173), 8447376422150679892L)));
   }

   public static void ba(class_310 param0, long param1) {
      // $FF: Couldn't be decompiled
   }

   private static int b(int var0, int var1) {
      int var2 = bba[var0 ^ -16711681] ^ var1 ^ var0;
      var2 += 29826;
      var2 -= 53880;
      var2 += 46357;
      var2 -= 19992;
      var2 += 15486;
      var2 += 357;
      var2 ^= 40286;
      var2 -= 21253;
      return var2;
   }

   static {
      int var41 = 1853071364;
      short var36 = 18693;
      int var32 = "\u001b폶汴\udce4Ⱨ폤괘쫞洆퍸ⴔ\udd1cⷫ쩪\uec71\udcf4汪\udc20괝폒괕팈淺\udc28귯\udc3a괏\udcd0X섔谆컆첹쀲\u0cd4잰첫쀮첻잒쳁췐쳉쀾쳗츲\u0c3a섨䲩솆䰠쵞ఽ췔貣읦ಶ잎఼칼貢칢䰟쟦찿쀼貧쟎\u0cd1칺ೆ췬쳊쀺貿쀞谸윤\u0c3b잊ఞ캚ೆ잼䰮삾쳀츆ಪ치䳚윪첳섞䲭칄ా샆䰨삊䳇촤䲩잚찠컂찃컼ః컲ప촂䳙위쳘쟂䳏\n䞾撨䝴\ue4d4䆤꓅䅮\ue4cd䇬\ue4cd\u0010믂梕薼\ue885늨⢕뉊ꢝ눈歽뭈⢎蓺毳믠\ueb72\nᨃ녿᪩ㅩᮙ煦᪳ㅮᨱㅪ\u0018て揓㵜ꎲが挌㷦\ue3dbㆀ⌬㆔\ue3a3㺪揗ぐꏁえ\ue3a9㞚\ue3d9㆐\ue3b5ㄜꏟ\n୨kɂ胕Ų새Ƹ胀Ǻ胜\u0010⅞\ue237₰ꈭ⟼\ue2d4Ⅎ⋙✈⋎‼ꈃ⺒⊧⁴ꋗ\n턶\uedce톼涺휬ⶭ힆涥휄涹".length();
      int var35 = 0;
      int var34 = 0;
      String var31 = "\u001b폶汴\udce4Ⱨ폤괘쫞洆퍸ⴔ\udd1cⷫ쩪\uec71\udcf4汪\udc20괝폒괕팈淺\udc28귯\udc3a괏\udcd0X섔谆컆첹쀲\u0cd4잰첫쀮첻잒쳁췐쳉쀾쳗츲\u0c3a섨䲩솆䰠쵞ఽ췔貣읦ಶ잎఼칼貢칢䰟쟦찿쀼貧쟎\u0cd1칺ೆ췬쳊쀺貿쀞谸윤\u0c3b잊ఞ캚ೆ잼䰮삾쳀츆ಪ치䳚윪첳섞䲭칄ా샆䰨삊䳇촤䲩잚찠컂찃컼ః컲ప촂䳙위쳘쟂䳏\n䞾撨䝴\ue4d4䆤꓅䅮\ue4cd䇬\ue4cd\u0010믂梕薼\ue885늨⢕뉊ꢝ눈歽뭈⢎蓺毳믠\ueb72\nᨃ녿᪩ㅩᮙ煦᪳ㅮᨱㅪ\u0018て揓㵜ꎲが挌㷦\ue3dbㆀ⌬㆔\ue3a3㺪揗ぐꏁえ\ue3a9㞚\ue3d9㆐\ue3b5ㄜꏟ\n୨kɂ胕Ų새Ƹ胀Ǻ胜\u0010⅞\ue237₰ꈭ⟼\ue2d4Ⅎ⋙✈⋎‼ꈃ⺒⊧⁴ꋗ\n턶\uedce톼涺휬ⶭ힆涥휄涹";
      String[] var33 = new String[9];

      do {
         char var37 = var31.charAt(var35);
         int var10001 = var35 + 1;
         int var10002 = var35 + 1;
         int var39 = 0;
         char[] var38 = var31.substring(var10001, var10002 + var37).toCharArray();

         do {
            int var40 = var38[var39];
            short var10000;
            switch (var39 % 6) {
               case 0:
               default:
                  var10000 = 80;
                  break;
               case 1:
                  var10000 = 223;
                  break;
               case 2:
                  var10000 = 178;
                  break;
               case 3:
                  var10000 = 193;
                  break;
               case 4:
                  var10000 = 142;
                  break;
               case 5:
                  var10000 = 215;
            }

            var40 = (char)var10000 ^ var40;
            if (var39 % 2 == 0) {
               var38[var39] = (char)((var40 >>> 2 | var40 << 14) & '\uffff' ^ var36);
            } else {
               var38[var39] = (char)((var40 << 2 | var40 >>> 14) & '\uffff' ^ var36);
            }

            ++var39;
         } while(var39 < var38.length);

         var33[var34] = new String(var38);
         ++var34;
         var35 = var35 + var37 + 1;
      } while(var35 < var32);

      bbb = var33;
      aaaa = new Object[var33.length];
      int var46 = 0;
      bba = new int[74];
      int var50 = 0;
      byte[] var69 = "\u008b«,T\u0004ÕH\u0002O\u0018w\u0082äH\u0096\u00adí\u0086eT\u0011Ma\u0011pu\u0002(\u0014byx\u0083£\u0006Þ3,ë`ë\u0019ü\u008dÜú[k\u001dÛ\u0016É©q\u009aQl\u001eú6ÅtrVð÷°ý\u0011*\u0007Èªðûi\n4\u0016\u009c|\u0089¸¿®\"A· r®ðEw¥í+l.îJ3o\u001a\u00832g\u0099VºÏ@µ¹\u008fê\u0084R*¤\u0001úæ\u0003ÕóQ«\u008eM«Oß\u00adrc Y\u0099@\u0088÷E\u0081¿\u0080\u00180\u009bj\u0096¿\u00143\u0000[9S¹\u007fÉ\u0084n\"û>Ò\b@k)/çý¢¸\u0097ãJ0½\u0010ÅRXa\u001cÞ\u0014¶m\u000b)_,\u0014r\u0017Å4E\u001e\u0099ö\u0006¹\u0004\u0007\u001fß\u007f½=/õ\u0083ÚT!hÈy'Æ\u009dï.öç0è.ût©\u0097£&¬=«e\u008d4H\u00941²9[\u0093°Yps\\o\b»\u0095\u008aù\u000f#¼zN¯½\u0018 \u0081Onõ^Î%ïüÇ\u0014o\u0007©·I0?[YI*ù)Ä".getBytes("ISO-8859-1");

      int var93;
      do {
         bba[var46] = ((var69[var50] & 255) << 24 | (var69[var50 + 1] & 255) << 16 | (var69[var50 + 2] & 255) << 8 | var69[var50 + 3] & 255) ^ -1164929044;
         ++var46;
         var93 = var50 + 4;
         var50 += 4;
      } while(var93 < var69.length);

      String[] var16 = new String[2];
      int var20 = 0;
      String var19;
      int var21 = (var19 = aba((short)'췵', 'ᙶ', var41 ^ 1760741052)).length();
      int var18 = b(-16711688, var41 ^ 1065432585);
      int var17 = -1;

      while(true) {
         label141: {
            ++var17;
            char[] var53 = var19.substring(var17, var17 + var18).toCharArray();
            var93 = var53.length;
            int var22 = 0;
            var77 = var53;
            int var56 = var93;
            char[] var97;
            int var116;
            if (var93 <= 1) {
               var97 = var53;
               var116 = var22;
            } else {
               var77 = var53;
               var56 = var93;
               if (var93 <= var22) {
                  break label141;
               }

               var97 = var53;
               var116 = var22;
            }

            while(true) {
               char var126 = var97[var116];
               int var130;
               switch (var22 % b(-16711689, var41 ^ -1472181847)) {
                  case 0 -> var130 = b(-16711690, var41 ^ 416261201);
                  case 1 -> var130 = b(-16711691, var41 ^ -1057311997);
                  case 2 -> var130 = b(-16711692, var41 ^ -149351334);
                  case 3 -> var130 = b(-16711693, var41 ^ 909662613);
                  case 4 -> var130 = b(-16711694, var41 ^ -2104306430);
                  case 5 -> var130 = b(-16711695, var41 ^ 1207809306);
                  default -> var130 = b(-16711696, var41 ^ -292078331);
               }

               var97[var116] = (char)(var126 ^ var130);
               ++var22;
               if (var56 == 0) {
                  var116 = var56;
                  var97 = var77;
               } else {
                  if (var56 <= var22) {
                     break;
                  }

                  var97 = var77;
                  var116 = var22;
               }
            }
         }

         String var104 = (new String(var77)).intern();
         var50 = -1;
         var16[var20++] = var104;
         if ((var17 += var18) >= var21) {
            long var8 = 7042014862733485737L;
            long[] var14 = new long[b(-16711697, var41 ^ -619380840)];
            int var11 = 0;
            String var12;
            int var13 = (var12 = aba((short)'\uf169', 'ᙷ', var41 ^ -778443681)).length();
            int var10 = 0;

            label122:
            while(true) {
               var50 = var10;
               var10 += 8;
               byte[] var15 = var12.substring(var50, var10).getBytes(aba((short)'黠', 'ᙴ', var41 ^ -554383669));
               long[] var47 = var14;
               var50 = var11++;
               long var82 = ((long)var15[0] & 255L) << b(-16711698, var41 ^ 986269879) | ((long)var15[1] & 255L) << b(-16711699, var41 ^ -2129414931) | ((long)var15[2] & 255L) << b(-16711700, var41 ^ 567761169) | ((long)var15[3] & 255L) << b(-16711701, var41 ^ 1466627885) | ((long)var15[4] & 255L) << b(-16711702, var41 ^ -2050945300) | ((long)var15[5] & 255L) << b(-16711703, var41 ^ -1953373808) | ((long)var15[b(-16711704, var41 ^ 1855253126)] & 255L) << b(-16711705, var41 ^ 9396616) | (long)var15[b(-16711706, var41 ^ 1641029756)] & 255L;
               byte var105 = -1;

               while(true) {
                  long var118 = var82 ^ var8;
                  switch (var105) {
                     case 0:
                        var47[var50] = var118;
                        if (var10 >= var13) {
                           bab = var14;
                           abb = new Integer[b(-16711716, var41 ^ -1558967593)];
                           long var0 = 5608238477411607918L;
                           long[] var6 = new long[5];
                           int var3 = 0;
                           String var4;
                           int var5 = (var4 = aba((short)2952, 'ᙳ', var41 ^ 1469622813)).length();
                           int var2 = 0;

                           label112:
                           while(true) {
                              var50 = var2;
                              var2 += 8;
                              byte[] var7 = var4.substring(var50, var2).getBytes(aba((short)'켈', 'ᙰ', var41 ^ 484563743));
                              var47 = var6;
                              var50 = var3++;
                              var82 = ((long)var7[0] & 255L) << b(-16711717, var41 ^ -1805428870) | ((long)var7[1] & 255L) << b(-16711718, var41 ^ -1333143284) | ((long)var7[2] & 255L) << b(-16711719, var41 ^ 1070616547) | ((long)var7[3] & 255L) << b(-16711720, var41 ^ 313587422) | ((long)var7[4] & 255L) << b(-16711721, var41 ^ -496557756) | ((long)var7[5] & 255L) << b(-16711722, var41 ^ -790782633) | ((long)var7[b(-16711723, var41 ^ 1804101241)] & 255L) << b(-16711724, var41 ^ -870388243) | (long)var7[b(-16711725, var41 ^ -1140849309)] & 255L;
                              var105 = -1;

                              while(true) {
                                 var118 = var82 ^ var0;
                                 switch (var105) {
                                    case 0:
                                       var47[var50] = var118;
                                       if (var2 >= var5) {
                                          b = var6;
                                          bb = new Long[5];
                                          long var23 = aaa(b(-16711735, var41 ^ -239637012), 5315297361427027609L);
                                          long[] var29 = new long[2];
                                          int var26 = 0;
                                          String var27;
                                          int var28 = (var27 = var16[0]).length();
                                          int var25 = 0;

                                          do {
                                             var50 = var25;
                                             var25 += 8;
                                             byte[] var30 = var27.substring(var50, var25).getBytes(var16[1]);
                                             var50 = var26++;
                                             var118 = (((long)var30[0] & aaa(b(-16711736, var41 ^ -476423886), 3158228183575681163L)) << bb(b(-16711737, var41 ^ -1240694857), 286330966656520306L) | ((long)var30[1] & aaa(b(-16711738, var41 ^ -858552916), 5087100841590967189L)) << bb(b(-16711739, var41 ^ 795378454), 8178267390106491827L) | ((long)var30[2] & aaa(b(-16711740, var41 ^ -2000305731), 5087100841590967189L)) << bb(b(-16711741, var41 ^ 2138675137), 6118755494743935982L) | ((long)var30[3] & aaa(b(-16711742, var41 ^ 1668766772), 5087100841590967189L)) << bb(b(-16711743, var41 ^ -314073421), 3998745819355710524L) | ((long)var30[4] & aaa(b(-16711744, var41 ^ 1922244312), 5087100841590967189L)) << bb(b(-16711745, var41 ^ 1156282799), 6935671210664379260L) | ((long)var30[5] & aaa(b(-16711746, var41 ^ -1592106279), 5087100841590967189L)) << bb(b(-16711747, var41 ^ 1751536171), 2251718736386296210L) | ((long)var30[bb(b(-16711748, var41 ^ -1761908185), 2556675826395790087L)] & aaa(b(-16711749, var41 ^ 1687001249), 5087100841590967189L)) << bb(b(-16711750, var41 ^ -439974489), 4906604272225818835L) | (long)var30[bb(b(-16711751, var41 ^ -319355724), 4109440501824855795L)] & aaa(b(-16711752, var41 ^ -2108414772), 5087100841590967189L)) ^ var23;
                                             var105 = -1;
                                             var29[var50] = var118;
                                          } while(var25 < var28);

                                          a = var29;
                                          int var49 = b(-16711753, var41 ^ 347642031);
                                          aab = new Long[2];
                                          ba = aa(bb(var49, 278055239320125581L), aaa(b(-16711754, var41 ^ -18545823), 8818297118031230177L));
                                          aa = -1;
                                          aba = -1;
                                          return;
                                       }
                                       break;
                                    default:
                                       var47[var50] = var118;
                                       if (var2 < var5) {
                                          continue label112;
                                       }

                                       var5 = (var4 = aba((short)26616, 'ᙱ', var41 ^ 1071577282)).length();
                                       var2 = 0;
                                 }

                                 var50 = var2;
                                 var2 += 8;
                                 var7 = var4.substring(var50, var2).getBytes(aba((short)31040, 'ᙾ', var41 ^ -583356661));
                                 var47 = var6;
                                 var50 = var3++;
                                 var82 = ((long)var7[0] & 255L) << b(-16711726, var41 ^ -1762424303) | ((long)var7[1] & 255L) << b(-16711727, var41 ^ 1937920870) | ((long)var7[2] & 255L) << b(-16711728, var41 ^ 1062544058) | ((long)var7[3] & 255L) << b(-16711729, var41 ^ 45900706) | ((long)var7[4] & 255L) << b(-16711730, var41 ^ 1509198411) | ((long)var7[5] & 255L) << b(-16711731, var41 ^ 1862129330) | ((long)var7[b(-16711732, var41 ^ 760892232)] & 255L) << b(-16711733, var41 ^ 876359927) | (long)var7[b(-16711734, var41 ^ 382515913)] & 255L;
                                 var105 = 0;
                              }
                           }
                        }
                        break;
                     default:
                        var47[var50] = var118;
                        if (var10 < var13) {
                           continue label122;
                        }

                        var13 = (var12 = aba((short)'두', 'ᙵ', var41 ^ -1961370925)).length();
                        var10 = 0;
                  }

                  var50 = var10;
                  var10 += 8;
                  var15 = var12.substring(var50, var10).getBytes(aba((short)28559, 'ᙲ', var41 ^ 1713938788));
                  var47 = var14;
                  var50 = var11++;
                  var82 = ((long)var15[0] & 255L) << b(-16711707, var41 ^ -1462687507) | ((long)var15[1] & 255L) << b(-16711708, var41 ^ 2103017677) | ((long)var15[2] & 255L) << b(-16711709, var41 ^ -1638219672) | ((long)var15[3] & 255L) << b(-16711710, var41 ^ -1347328705) | ((long)var15[4] & 255L) << b(-16711711, var41 ^ 706324819) | ((long)var15[5] & 255L) << b(-16711712, var41 ^ -32497982) | ((long)var15[b(-16711713, var41 ^ -1515265005)] & 255L) << b(-16711714, var41 ^ -196199108) | (long)var15[b(-16711715, var41 ^ -1950689763)] & 255L;
                  var105 = 0;
               }
            }
         }

         var18 = var19.charAt(var17);
      }
   }

   private static int bb(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ b(-16711685, 2067947902 ^ 749446411);
      if (abb[var3] == null) {
         abb[var3] = (int)(bab[var3] ^ var1);
      }

      return abb[var3];
   }

   public static void a() {
      ab = null;
      aaa = null;
      aa = -1;
      aba = -1;
      baa = 0L;
   }

   private static long aaa(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ b(-16711686, 478123329 ^ -1218612645)) & b(-16711687, 478123329 ^ 698021900);
      if (bb[var3] == null) {
         bb[var3] = b[var3] ^ var1;
      }

      return bb[var3];
   }

   public static q2997348aa27a422480aea29cbfd800b1aabbaaabb aab() {
      q2997348aa27a422480aea29cbfd800b1aabbaaabb var10000;
      try {
         try {
            if (ab == null) {
               var10000 = null;
               return var10000;
            }
         } catch (IllegalStateException var0) {
            throw var0;
         }
      } catch (MatchException var1) {
         throw var1;
      }

      var10000 = new q2997348aa27a422480aea29cbfd800b1aabbaaabb(ab, aa, aba, baa);
      return var10000;
   }

   private q2997348aa27a422480aea29cbfd800b1abbabbab() {
   }
}
