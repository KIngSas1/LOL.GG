package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

// $FF: synthetic class
@Environment(EnvType.CLIENT)
class q2997348aa27a422480aea29cbfd800b1bbaba {
   private static final int[] aa;
   private static final Object[] ba;
   private static final String[] ab;
   static final int[] a;
   static final int[] b;

   private static String b(char var0, char var1, int var2, int var3, int var4, short var5, int var6) {
      int var11 = var3 ^ 876004040;
      char[] var10 = ab[var11].toCharArray();
      StackTraceElement[] var12 = (StackTraceElement[])ba[var11];
      StackTraceElement[] var13;
      if (var12 != null) {
         var13 = var12;
      } else {
         var13 = (new Throwable()).getStackTrace();
         ba[var11] = var13;
      }

      StackTraceElement var14 = var13[1];
      int var8 = (var14.getClassName().hashCode() ^ var14.getMethodName().hashCode()) >> 16 ^ '针';

      for(int var9 = 0; var9 < var10.length; ++var9) {
         int var10002 = var10[var9] ^ var9;
         short var10003;
         switch (var9 % 18) {
            case 0:
            default:
               var10003 = 192;
               break;
            case 1:
               var10003 = 203;
               break;
            case 2:
               var10003 = 83;
               break;
            case 3:
               var10003 = 8;
               break;
            case 4:
               var10003 = 6;
               break;
            case 5:
               var10003 = 221;
               break;
            case 6:
               var10003 = 225;
               break;
            case 7:
               var10003 = 94;
               break;
            case 8:
               var10003 = 223;
               break;
            case 9:
               var10003 = 124;
               break;
            case 10:
               var10003 = 240;
               break;
            case 11:
               var10003 = 253;
               break;
            case 12:
               var10003 = 52;
               break;
            case 13:
               var10003 = 116;
               break;
            case 14:
               var10003 = 80;
               break;
            case 15:
               var10003 = 48;
               break;
            case 16:
               var10003 = 175;
               break;
            case 17:
               var10003 = 168;
         }

         var10[var9] = (char)(var10002 ^ var10003 ^ var0 ^ var1 ^ var8 ^ var6 ^ var2 ^ var3 ^ var5 ^ var4);
      }

      return (new String(var10)).intern();
   }

   static {
      int var42 = 1910442730;
      int var10001 = "\u001b叾檿䵭舢䌔≚儰ꈄ夣評员눫匥檯啾䊿哭﨧哴\uaa5a䫐訇厣쉖単䨮剅8\uda91ᥛ쬂療쨛寮퇟䇤\ud96c\ue9b5\ud8d7燌촪\uf14c왑ㅛ\uda42ᧅ헛妻숿퇡켬憲읗ꇊ\ud9ea⥍ퟱ㥛좂ᇃ퓛ƹ샟\ue1e4홌䦵쌗䇌삊ꅎ쉑祙푂뇅홻ᦺ즿\u31e4핌ল\ud937퇏팊ꥎ\n찈霙\udebb澇\uda42忼쟆徣싕翱\u0010佬츸姟횡䐦盟忢亇冱曕儊䚭䌗縯䡬븹\n큯軞시癀옥䘻\udba1䙤\udeb2昶\u0018셀锜엳䶁\udb2a旺욎薦쨝\uf5f2쨦越쫛贋홀洜컳\u0d84헪헺팎䶧\ud87dᷱ\n簘錵溫殫橒寐矖宏狅篝".length();
      int var35 = 0;
      int var36 = 0;
      String[] var34 = new String[7];
      short var37 = 20159;
      int var33 = var10001;
      String var32 = "\u001b叾檿䵭舢䌔≚儰ꈄ夣評员눫匥檯啾䊿哭﨧哴\uaa5a䫐訇厣쉖単䨮剅8\uda91ᥛ쬂療쨛寮퇟䇤\ud96c\ue9b5\ud8d7燌촪\uf14c왑ㅛ\uda42ᧅ헛妻숿퇡켬憲읗ꇊ\ud9ea⥍ퟱ㥛좂ᇃ퓛ƹ샟\ue1e4홌䦵쌗䇌삊ꅎ쉑祙푂뇅홻ᦺ즿\u31e4핌ল\ud937퇏팊ꥎ\n찈霙\udebb澇\uda42忼쟆徣싕翱\u0010佬츸姟횡䐦盟忢亇冱曕儊䚭䌗縯䡬븹\n큯軞시癀옥䘻\udba1䙤\udeb2昶\u0018셀锜엳䶁\udb2a旺욎薦쨝\uf5f2쨦越쫛贋홀洜컳\u0d84헪헺팎䶧\ud87dᷱ\n簘錵溫殫橒寐矖宏狅篝";

      do {
         char var38 = var32.charAt(var36);
         var10001 = var36 + 1;
         int var40 = 0;
         char[] var39 = var32.substring(var10001, var10001 + var38).toCharArray();

         do {
            int var41 = var39[var40];
            short var10000;
            switch (var40 % 7) {
               case 0:
               default:
                  var10000 = 87;
                  break;
               case 1:
                  var10000 = 234;
                  break;
               case 2:
                  var10000 = 4;
                  break;
               case 3:
                  var10000 = 113;
                  break;
               case 4:
                  var10000 = 125;
                  break;
               case 5:
                  var10000 = 12;
                  break;
               case 6:
                  var10000 = 249;
            }

            var41 = (char)var10000 ^ var41;
            if (var40 % 2 == 0) {
               var39[var40] = (char)((var41 >>> 5 | var41 << 11) & '\uffff' ^ var37);
            } else {
               var39[var40] = (char)((var41 << 5 | var41 >>> 11) & '\uffff' ^ var37);
            }

            ++var40;
         } while(var40 < var39.length);

         var34[var35] = new String(var39);
         ++var35;
         var36 = var36 + var38 + 1;
      } while(var36 < var33);

      ab = var34;
      ba = new Object[var34.length];
      int var56 = 0;
      var10001 = 0;
      byte[] var10002 = "ÞÞ\u0097Ï\u007fÛrä+©\fÖ¯vÌð9\n\u0099P\u0099ÿ\u0081^BxrG2sD77/³ÈCÄfì6&-ûUÜî\f\u001d@\u00076g¢3¾\u0096yLäz\u007f\u0012Q\u0003\u008eÌ$ÌédÁ©îÓl\u000b\u0084lÊÎ\u001aÏG¨?¯±÷ôÑÓ\u0012gnÆN0\"\u0085A\u009b\u000bh\u0092ÑÕ³³\u00adæÿlX\u0097.ÖL×ã\u0095U¯LÇôµ\u0005]ïÌ_Ním\u009d¿\u0090\u0089x§þÚrÎº^m\u008a}9\u0014¯`GãD®ï\u0016".getBytes("ISO-8859-1");
      aa = new int[40];

      int var98;
      do {
         aa[var56] = ((var10002[var10001] & 255) << 24 | (var10002[var10001 + 1] & 255) << 16 | (var10002[var10001 + 2] & 255) << 8 | var10002[var10001 + 3] & 255) ^ 842976488;
         ++var56;
         var98 = var10001 + 4;
         var10001 += 4;
      } while(var98 < var10002.length);

      String[] var16 = new String[2];
      int var20 = 0;
      String var19;
      int var21 = (var19 = b('쮧', '缟', -1002894241, 876004040, 1831198560, (short)28617, -1806860772)).length();
      int var18 = a(238350548, var42 ^ -1828033931);
      int var17 = -1;

      while(true) {
         label165: {
            ++var17;
            char[] var62 = var19.substring(var17, var17 + var18).toCharArray();
            var98 = var62.length;
            int var22 = 0;
            var84 = var62;
            int var65 = var98;
            char[] var102;
            int var120;
            if (var98 <= 1) {
               var102 = var62;
               var120 = var22;
            } else {
               var84 = var62;
               var65 = var98;
               if (var98 <= var22) {
                  break label165;
               }

               var102 = var62;
               var120 = var22;
            }

            while(true) {
               char var129 = var102[var120];
               int var133;
               switch (var22 % a(238350549, var42 ^ 839880528)) {
                  case 0 -> var133 = a(238350550, var42 ^ 1719529657);
                  case 1 -> var133 = a(238350551, var42 ^ -492687106);
                  case 2 -> var133 = a(238350544, var42 ^ 1960731802);
                  case 3 -> var133 = a(238350545, var42 ^ -735347352);
                  case 4 -> var133 = a(238350546, var42 ^ 262966875);
                  case 5 -> var133 = a(238350547, var42 ^ 2141698093);
                  default -> var133 = a(238350556, var42 ^ 2063290341);
               }

               var102[var120] = (char)(var129 ^ var133);
               ++var22;
               if (var65 == 0) {
                  var120 = var65;
                  var102 = var84;
               } else {
                  if (var65 <= var22) {
                     break;
                  }

                  var102 = var84;
                  var120 = var22;
               }
            }
         }

         String var109 = (new String(var84)).intern();
         var10001 = -1;
         var16[var20++] = var109;
         if ((var17 += var18) >= var21) {
            long var9 = 8271988708309630736L;
            long[] var8 = new long[a(238350557, var42 ^ 235969370)];
            int var12 = 0;
            String var13;
            int var14 = (var13 = b('ᯖ', (char)'ꩾ', 439130847, 876004041, 1309864382, (short)20622, -463699890)).length();
            int var11 = 0;

            label146:
            while(true) {
               var10001 = var11;
               var11 += 8;
               byte[] var15 = var13.substring(var10001, var11).getBytes(b((char)8603, (char)'鼶', 1001194364, 876004042, 2066780932, (short)15707, -1923165826));
               long[] var57 = var8;
               var10001 = var12++;
               long var89 = ((long)var15[0] & 255L) << a(238350558, var42 ^ 2079510585) | ((long)var15[1] & 255L) << a(238350559, var42 ^ 403182535) | ((long)var15[2] & 255L) << a(238350552, var42 ^ 1351940834) | ((long)var15[3] & 255L) << a(238350553, var42 ^ 712429155) | ((long)var15[4] & 255L) << a(238350554, var42 ^ -609374014) | ((long)var15[5] & 255L) << a(238350555, var42 ^ 934014590) | ((long)var15[a(238350532, var42 ^ 1314533762)] & 255L) << a(238350533, var42 ^ -2126669464) | (long)var15[a(238350534, var42 ^ -465948981)] & 255L;
               byte var110 = -1;

               while(true) {
                  long var122 = var89 ^ var9;
                  switch (var110) {
                     case 0:
                        var57[var10001] = var122;
                        if (var11 >= var14) {
                           long var1 = 565115772684933977L;
                           long[] var0 = new long[3];
                           int var4 = 0;
                           String var5;
                           int var6 = (var5 = b((char)'蔡', (char)13951, 320815618, 876004045, 1121634155, (short)-10362, 1721983842)).length();
                           int var3 = 0;

                           do {
                              var10001 = var3;
                              var3 += 8;
                              byte[] var7 = var5.substring(var10001, var3).getBytes(b((char)'ꕉ', '\u137d', 599831335, 876004046, 1580492276, (short)24815, -1116649604));
                              var10001 = var4++;
                              var122 = (((long)var7[0] & 255L) << a(238350536, var42 ^ 562850554) | ((long)var7[1] & 255L) << a(238350537, var42 ^ -1684526530) | ((long)var7[2] & 255L) << a(238350538, var42 ^ -662613366) | ((long)var7[3] & 255L) << a(238350539, var42 ^ -1977595702) | ((long)var7[4] & 255L) << a(238350580, var42 ^ 272314455) | ((long)var7[5] & 255L) << a(238350581, var42 ^ 54104476) | ((long)var7[a(238350582, var42 ^ -230394644)] & 255L) << a(238350583, var42 ^ -366336023) | (long)var7[a(238350576, var42 ^ -2089901060)] & 255L) ^ var1;
                              var110 = -1;
                              var0[var10001] = var122;
                           } while(var3 < var6);

                           long var24 = var0[1];
                           long[] var23 = new long[2];
                           int var27 = 0;
                           String var28;
                           int var29 = (var28 = var16[1]).length();
                           int var26 = 0;

                           do {
                              var10001 = var26;
                              var26 += 8;
                              byte[] var30 = var28.substring(var10001, var26).getBytes(var16[0]);
                              var10001 = var27++;
                              var122 = (((long)var30[0] & var0[0]) << (int)var8[a(238350577, var42 ^ -945175415)] | ((long)var30[1] & var0[2]) << (int)var8[0] | ((long)var30[2] & var0[2]) << (int)var8[3] | ((long)var30[3] & var0[2]) << (int)var8[a(238350578, var42 ^ -491472272)] | ((long)var30[4] & var0[2]) << (int)var8[1] | ((long)var30[5] & var0[2]) << (int)var8[5] | ((long)var30[(int)var8[4]] & var0[2]) << (int)var8[a(238350579, var42 ^ 158995079)] | (long)var30[(int)var8[2]] & var0[2]) ^ var24;
                              var110 = -1;
                              var23[var10001] = var122;
                           } while(var26 < var29);

                           b = new int[q2997348aa27a422480aea29cbfd800b1baabba.values().length];

                           try {
                              b[q2997348aa27a422480aea29cbfd800b1baabba.aba.ordinal()] = 1;
                           } catch (NoSuchFieldError var52) {
                           }

                           try {
                              b[q2997348aa27a422480aea29cbfd800b1baabba.aa.ordinal()] = 2;
                           } catch (NoSuchFieldError var51) {
                           }

                           try {
                              b[q2997348aa27a422480aea29cbfd800b1baabba.a.ordinal()] = 3;
                           } catch (NoSuchFieldError var50) {
                           }

                           try {
                              b[q2997348aa27a422480aea29cbfd800b1baabba.abb.ordinal()] = 4;
                           } catch (NoSuchFieldError var49) {
                           }

                           try {
                              b[q2997348aa27a422480aea29cbfd800b1baabba.aaa.ordinal()] = 5;
                           } catch (NoSuchFieldError var48) {
                           }

                           try {
                              b[q2997348aa27a422480aea29cbfd800b1baabba.bba.ordinal()] = (int)var23[0];
                           } catch (NoSuchFieldError var47) {
                           }

                           try {
                              b[q2997348aa27a422480aea29cbfd800b1baabba.b.ordinal()] = (int)var23[1];
                           } catch (NoSuchFieldError var46) {
                           }

                           a = new int[q2997348aa27a422480aea29cbfd800b1abbbb.values().length];

                           try {
                              a[q2997348aa27a422480aea29cbfd800b1abbbb.a.ordinal()] = 1;
                           } catch (NoSuchFieldError var45) {
                           }

                           try {
                              a[q2997348aa27a422480aea29cbfd800b1abbbb.aa.ordinal()] = 2;
                           } catch (NoSuchFieldError var44) {
                           }

                           try {
                              a[q2997348aa27a422480aea29cbfd800b1abbbb.ba.ordinal()] = 3;
                           } catch (NoSuchFieldError var43) {
                           }

                           return;
                        }
                        break;
                     default:
                        var57[var10001] = var122;
                        if (var11 < var14) {
                           continue label146;
                        }

                        var14 = (var13 = b((char)14120, '郂', 214449155, 876004043, -495395163, (short)-28176, 1108292294)).length();
                        var11 = 0;
                  }

                  var10001 = var11;
                  var11 += 8;
                  var15 = var13.substring(var10001, var11).getBytes(b('愰', (char)25714, 1332255267, 876004044, -1285590304, (short)-16456, -788355028));
                  var57 = var8;
                  var10001 = var12++;
                  var89 = ((long)var15[0] & 255L) << a(238350535, var42 ^ 1179685137) | ((long)var15[1] & 255L) << a(238350528, var42 ^ -2083638637) | ((long)var15[2] & 255L) << a(238350529, var42 ^ -437562756) | ((long)var15[3] & 255L) << a(238350530, var42 ^ -1172296683) | ((long)var15[4] & 255L) << a(238350531, var42 ^ 1605604089) | ((long)var15[5] & 255L) << a(238350540, var42 ^ 65330877) | ((long)var15[a(238350541, var42 ^ 206567111)] & 255L) << a(238350542, var42 ^ -553310191) | (long)var15[a(238350543, var42 ^ -25617583)] & 255L;
                  var110 = 0;
               }
            }
         }

         var18 = var19.charAt(var17);
      }
   }

   private static int a(int var0, int var1) {
      int var2 = aa[var0 ^ 238350548] ^ var1 ^ var0;
      var2 ^= 43435;
      var2 -= 58403;
      var2 -= 49131;
      var2 ^= 16817;
      var2 -= 45892;
      var2 += 53651;
      var2 ^= 7517;
      return var2;
   }
}
