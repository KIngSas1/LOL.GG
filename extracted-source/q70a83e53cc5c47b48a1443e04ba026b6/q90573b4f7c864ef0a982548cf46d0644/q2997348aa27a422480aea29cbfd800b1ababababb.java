package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_310;

@Environment(EnvType.CLIENT)
public final class q2997348aa27a422480aea29cbfd800b1ababababb {
   private static final Long[] aa;
   private static final long[] ab;
   private static boolean ba;
   private static double bb;
   private static final String[] aaab;
   private static final Object[] aaba;
   private static final long[] aaa;
   private static boolean a;
   private static final long aab;
   private static double b;
   private static final Integer[] aba;
   private static final Long[] abb;
   private static long baa;
   private static final int[] aaaa;
   private static double bab;
   private static double bba;
   private static final long[] bbb;

   static {
      int var41 = -564533422;
      short var36 = 17374;
      int var35 = 0;
      String[] var33 = new String[9];
      int var34 = 0;
      int var32 = "\u001b攢ꦄ栎\ue9e6擰駇橒릋毎槮橠\ud9c4旲䦋朞⧖愠姿盂妄媾ꧬ梠\u09c6榢\ue987榮X쉗\uec20젫豎쓥豤㽦尫왋屇샕ﱠ썧\udc25㕊챌쯵屶쑷ᰣ쮫\uedb1㨴汮㹖\ueddc쏋\uddb1㶤ﱣ섇ﰨ㳺籍쑅豩㕶淚젫ᶷ젥뱡샗簡힋鱍쁥䱤㵶鰡솫걉쎥\udc63혗氣캋ొ㰤ﱠ㽦ෙ㼚涳쏵\u2d9a쎇ﰧ㵚책쾥\uec6a슗尭쀋ూ㕔ᱤ읗尦쁫챈㽤趜혷ෙ썻屚\n뺶赒돊津깤\udd0e깶ⵌꧪ괣\u0010\ue26d䘍\udc01♨\ue50f䙿\ue81d똀\uf171٭\ue48f䙇\ueedd昂\ue901ᙣ\nꄜ❍ꁠ윒鰎뜼駜蝿鹀ܪ\u0018\uf694弒\uf5f8㽲\ueba6罕\ueae4輘\uf048⽿\uf126轐龍\u1f17\uf0f8ུ\uf056콘\uf464漊\uea18齼\uec86彞\n嶗겿峫䳢溅㳎楗ಃ滋賢\u0010ᆔ\udfedᥘ洪ံ㾱ꛦ\u2ffdૈﾁ鯤ᾱỤൺဈﾛ\n뭮ᕚ룒딾둼씔떮\uf557눲甾".length();
      String var31 = "\u001b攢ꦄ栎\ue9e6擰駇橒릋毎槮橠\ud9c4旲䦋朞⧖愠姿盂妄媾ꧬ梠\u09c6榢\ue987榮X쉗\uec20젫豎쓥豤㽦尫왋屇샕ﱠ썧\udc25㕊챌쯵屶쑷ᰣ쮫\uedb1㨴汮㹖\ueddc쏋\uddb1㶤ﱣ섇ﰨ㳺籍쑅豩㕶淚젫ᶷ젥뱡샗簡힋鱍쁥䱤㵶鰡솫걉쎥\udc63혗氣캋ొ㰤ﱠ㽦ෙ㼚涳쏵\u2d9a쎇ﰧ㵚책쾥\uec6a슗尭쀋ూ㕔ᱤ읗尦쁫챈㽤趜혷ෙ썻屚\n뺶赒돊津깤\udd0e깶ⵌꧪ괣\u0010\ue26d䘍\udc01♨\ue50f䙿\ue81d똀\uf171٭\ue48f䙇\ueedd昂\ue901ᙣ\nꄜ❍ꁠ윒鰎뜼駜蝿鹀ܪ\u0018\uf694弒\uf5f8㽲\ueba6罕\ueae4輘\uf048⽿\uf126轐龍\u1f17\uf0f8ུ\uf056콘\uf464漊\uea18齼\uec86彞\n嶗겿峫䳢溅㳎楗ಃ滋賢\u0010ᆔ\udfedᥘ洪ံ㾱ꛦ\u2ffdૈﾁ鯤ᾱỤൺဈﾛ\n뭮ᕚ룒딾둼씔떮\uf557눲甾";

      do {
         char var37 = var31.charAt(var35);
         char[] var10000 = var31.substring(var35 + 1, var35 + 1 + var37).toCharArray();
         int var39 = 0;
         char[] var38 = var10000;

         do {
            int var40 = var38[var39];
            short var46;
            switch (var39 % 6) {
               case 0:
               default:
                  var46 = 155;
                  break;
               case 1:
                  var46 = 227;
                  break;
               case 2:
                  var46 = 135;
                  break;
               case 3:
                  var46 = 140;
                  break;
               case 4:
                  var46 = 185;
                  break;
               case 5:
                  var46 = 160;
            }

            var40 = (char)var46 ^ var40;
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

      aaab = var33;
      aaba = new Object[var33.length];
      int var47 = 0;
      int var10001 = 0;
      aaaa = new int[74];
      byte[] var10002 = "äzà5`L\u008dzÓ\u0080ðÈa\u001e!\u0090\u0011\u0002ò³\u0018ÝeÄ\u007f\bn×Iâ\u0018»MÉ\u0081\u0086å·tÐ\u001f\u0002tF\u008f¨øeê½\u0098>F\u008e×\u000e1©æ[\u0013Þ W¹è\u008d(»Ê=y¬³\u0083$RN\\\u009f\r`V#\u0081\u0005[\u0018\u0001Ëvcð\u001e+I\u009c5\u0087½-ÝÞ\u0015\u001e\u000f\u0097â! ±Àõßÿ\u008a\u001fqyè\u0018¼¬½mßÇ@×.Ä\u009b\u0098\u0003³õ\u0094\u000eÛ®\u0017s0\u0087\u008626øçôØÛ\u0094\u001dt\n\u0098°JBÀ\u0086û\u0089¤©§Æð3¸[ãD\u0087p\u0011wR\r£ë¾}]¹HßrÍv\u008b\u0011ô öçæûkß\u009aFèqj7ªõ×HK\u0002ÀâÒ?Ò¯\u0013Ì½¾0AF9Òaø\u001e¦\"&VÕ1'*\u009dÈ\u0005?\u0084F:w«7/\u0088ôé#°²-øõ_Øxü0²Ñ\u001f¨\r\u008a\u0007K\u009dÎ¶{\u0000üf\u008fM>xuz>¨ýN>È\u0081\u000eÿä\u00ad".getBytes("ISO-8859-1");

      int var92;
      do {
         aaaa[var47] = ((var10002[var10001] & 255) << 24 | (var10002[var10001 + 1] & 255) << 16 | (var10002[var10001 + 2] & 255) << 8 | var10002[var10001 + 3] & 255) ^ 889110187;
         ++var47;
         var92 = var10001 + 4;
         var10001 += 4;
      } while(var92 < var10002.length);

      String[] var16 = new String[2];
      int var20 = 0;
      String var19;
      int var21 = (var19 = abb((short)'\uf70d', 66, var41 ^ -860116084)).length();
      int var18 = aba(-456625957, var41 ^ 1200568295);
      int var17 = -1;

      while(true) {
         label142: {
            ++var17;
            char[] var53 = var19.substring(var17, var17 + var18).toCharArray();
            var92 = var53.length;
            int var22 = 0;
            var76 = var53;
            int var56 = var92;
            char[] var96;
            int var115;
            if (var92 <= 1) {
               var96 = var53;
               var115 = var22;
            } else {
               var76 = var53;
               var56 = var92;
               if (var92 <= var22) {
                  break label142;
               }

               var96 = var53;
               var115 = var22;
            }

            while(true) {
               char var125 = var96[var115];
               int var129;
               switch (var22 % aba(-456625964, var41 ^ 1134866100)) {
                  case 0 -> var129 = aba(-456625963, var41 ^ -338011345);
                  case 1 -> var129 = aba(-456625962, var41 ^ 292510487);
                  case 2 -> var129 = aba(-456625961, var41 ^ -2117740645);
                  case 3 -> var129 = aba(-456625968, var41 ^ -456083597);
                  case 4 -> var129 = aba(-456625967, var41 ^ 1222899857);
                  case 5 -> var129 = aba(-456625966, var41 ^ 1069861312);
                  default -> var129 = aba(-456625965, var41 ^ 498306851);
               }

               var96[var115] = (char)(var125 ^ var129);
               ++var22;
               if (var56 == 0) {
                  var115 = var56;
                  var96 = var76;
               } else {
                  if (var56 <= var22) {
                     break;
                  }

                  var96 = var76;
                  var115 = var22;
               }
            }
         }

         String var103 = (new String(var76)).intern();
         var10001 = -1;
         var16[var20++] = var103;
         if ((var17 += var18) >= var21) {
            long var8 = 166050156660648973L;
            long[] var14 = new long[aba(-456625972, var41 ^ -1215978856)];
            int var11 = 0;
            String var12;
            int var13 = (var12 = abb((short)'\uf4ee', 67, var41 ^ 1568906567)).length();
            int var10 = 0;

            label123:
            while(true) {
               var10001 = var10;
               var10 += 8;
               byte[] var15 = var12.substring(var10001, var10).getBytes(abb((short)'ﯥ', 64, var41 ^ -2051301542));
               long[] var48 = var14;
               var10001 = var11++;
               long var81 = ((long)var15[0] & 255L) << aba(-456625971, var41 ^ -1247342063) | ((long)var15[1] & 255L) << aba(-456625970, var41 ^ -1562465161) | ((long)var15[2] & 255L) << aba(-456625969, var41 ^ 1545827269) | ((long)var15[3] & 255L) << aba(-456625976, var41 ^ 51214694) | ((long)var15[4] & 255L) << aba(-456625975, var41 ^ -1888979884) | ((long)var15[5] & 255L) << aba(-456625974, var41 ^ 262560212) | ((long)var15[aba(-456625973, var41 ^ -26016535)] & 255L) << aba(-456625980, var41 ^ -1839683572) | (long)var15[aba(-456625979, var41 ^ 598798646)] & 255L;
               byte var104 = -1;

               while(true) {
                  long var117 = var81 ^ var8;
                  switch (var104) {
                     case 0:
                        var48[var10001] = var117;
                        if (var10 >= var13) {
                           aaa = var14;
                           aba = new Integer[aba(-456625921, var41 ^ 421404420)];
                           long var0 = 4647438059034065992L;
                           long[] var6 = new long[5];
                           int var3 = 0;
                           String var4;
                           int var5 = (var4 = abb((short)6292, 71, var41 ^ -1698973895)).length();
                           int var2 = 0;

                           label113:
                           while(true) {
                              var10001 = var2;
                              var2 += 8;
                              byte[] var7 = var4.substring(var10001, var2).getBytes(abb((short)27696, 68, var41 ^ -954419824));
                              var48 = var6;
                              var10001 = var3++;
                              var81 = ((long)var7[0] & 255L) << aba(-456625928, var41 ^ -2007033435) | ((long)var7[1] & 255L) << aba(-456625927, var41 ^ -375785537) | ((long)var7[2] & 255L) << aba(-456625926, var41 ^ -1703912603) | ((long)var7[3] & 255L) << aba(-456625925, var41 ^ -1763875532) | ((long)var7[4] & 255L) << aba(-456625932, var41 ^ -823405320) | ((long)var7[5] & 255L) << aba(-456625931, var41 ^ -1429960626) | ((long)var7[aba(-456625930, var41 ^ -27355194)] & 255L) << aba(-456625929, var41 ^ -316036878) | (long)var7[aba(-456625936, var41 ^ 521829659)] & 255L;
                              var104 = -1;

                              while(true) {
                                 var117 = var81 ^ var0;
                                 switch (var104) {
                                    case 0:
                                       var48[var10001] = var117;
                                       if (var2 >= var5) {
                                          bbb = var6;
                                          abb = new Long[5];
                                          long var23 = ab(aba(-456625942, var41 ^ 834415598), 4203206750026523071L);
                                          long[] var29 = new long[2];
                                          int var26 = 0;
                                          String var27;
                                          int var28 = (var27 = var16[1]).length();
                                          int var25 = 0;

                                          do {
                                             var10001 = var25;
                                             var25 += 8;
                                             byte[] var30 = var27.substring(var10001, var25).getBytes(var16[0]);
                                             var10001 = var26++;
                                             var117 = (((long)var30[0] & ab(aba(-456625941, var41 ^ -1026346871), 3860603426057106811L)) << aa(aba(-456625948, var41 ^ 1328242569), 8033722283853347302L) | ((long)var30[1] & ab(aba(-456625947, var41 ^ 1872105019), 1900127005882733365L)) << aa(aba(-456625946, var41 ^ 743144382), 1451319789824764675L) | ((long)var30[2] & ab(aba(-456625945, var41 ^ 1061763586), 1900127005882733365L)) << aa(aba(-456625952, var41 ^ -966018220), 1891955107574848619L) | ((long)var30[3] & ab(aba(-456625951, var41 ^ 1213490994), 1900127005882733365L)) << aa(aba(-456625950, var41 ^ 960573131), 5492650074280278494L) | ((long)var30[4] & ab(aba(-456625949, var41 ^ -414343127), 1900127005882733365L)) << aa(aba(-456626020, var41 ^ 597078415), 704600225675861115L) | ((long)var30[5] & ab(aba(-456626019, var41 ^ -703140651), 1900127005882733365L)) << aa(aba(-456626018, var41 ^ -1128291911), 4048380505815072306L) | ((long)var30[aa(aba(-456626017, var41 ^ 65516708), 4903233981727394081L)] & ab(aba(-456626024, var41 ^ -1818188133), 1900127005882733365L)) << aa(aba(-456626023, var41 ^ 244494016), 1093349457102277584L) | (long)var30[aa(aba(-456626022, var41 ^ 1129519975), 7567400105051846926L)] & ab(aba(-456626021, var41 ^ 1951447070), 1900127005882733365L)) ^ var23;
                                             var104 = -1;
                                             var29[var10001] = var117;
                                          } while(var25 < var28);

                                          ab = var29;
                                          int var50 = aba(-456626028, var41 ^ 1079021851);
                                          aa = new Long[2];
                                          aab = aaa(aa(var50, 3119085897807610254L), ab(aba(-456626027, var41 ^ 9619605), 6892887507664311527L));
                                          return;
                                       }
                                       break;
                                    default:
                                       var48[var10001] = var117;
                                       if (var2 < var5) {
                                          continue label113;
                                       }

                                       var5 = (var4 = abb((short)7492, 69, var41 ^ 1634767826)).length();
                                       var2 = 0;
                                 }

                                 var10001 = var2;
                                 var2 += 8;
                                 var7 = var4.substring(var10001, var2).getBytes(abb((short)15068, 74, var41 ^ -1003622202));
                                 var48 = var6;
                                 var10001 = var3++;
                                 var81 = ((long)var7[0] & 255L) << aba(-456625935, var41 ^ -1383689943) | ((long)var7[1] & 255L) << aba(-456625934, var41 ^ 1406429104) | ((long)var7[2] & 255L) << aba(-456625933, var41 ^ 2090883565) | ((long)var7[3] & 255L) << aba(-456625940, var41 ^ 530124695) | ((long)var7[4] & 255L) << aba(-456625939, var41 ^ -376712189) | ((long)var7[5] & 255L) << aba(-456625938, var41 ^ -772314757) | ((long)var7[aba(-456625937, var41 ^ 2131171374)] & 255L) << aba(-456625944, var41 ^ -71669802) | (long)var7[aba(-456625943, var41 ^ 212717021)] & 255L;
                                 var104 = 0;
                              }
                           }
                        }
                        break;
                     default:
                        var48[var10001] = var117;
                        if (var10 < var13) {
                           continue label123;
                        }

                        var13 = (var12 = abb((short)25744, 65, var41 ^ 1471715443)).length();
                        var10 = 0;
                  }

                  var10001 = var10;
                  var10 += 8;
                  var15 = var12.substring(var10001, var10).getBytes(abb((short)16522, 70, var41 ^ 1607379391));
                  var48 = var14;
                  var10001 = var11++;
                  var81 = ((long)var15[0] & 255L) << aba(-456625978, var41 ^ 274905217) | ((long)var15[1] & 255L) << aba(-456625977, var41 ^ 802004634) | ((long)var15[2] & 255L) << aba(-456625984, var41 ^ -72167201) | ((long)var15[3] & 255L) << aba(-456625983, var41 ^ 287069860) | ((long)var15[4] & 255L) << aba(-456625982, var41 ^ 382829562) | ((long)var15[5] & 255L) << aba(-456625981, var41 ^ 1672669438) | ((long)var15[aba(-456625924, var41 ^ -649860340)] & 255L) << aba(-456625923, var41 ^ -1771135875) | (long)var15[aba(-456625922, var41 ^ -1704725322)] & 255L;
                  var104 = 0;
               }
            }
         }

         var18 = var19.charAt(var17);
      }
   }

   private static int aa(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ aba(-456625956, 2001533268 ^ 1124152934);
      if (aba[var3] == null) {
         aba[var3] = (int)(aaa[var3] ^ var1);
      }

      return aba[var3];
   }

   private static String abb(short var0, int var1, int var2) {
      int var3 = var1 ^ 66;
      char[] var4 = aaab[var3].toCharArray();
      StackTraceElement[] var5 = (StackTraceElement[])aaba[var3];
      StackTraceElement[] var6;
      if (var5 != null) {
         var6 = var5;
      } else {
         var6 = (new Throwable()).getStackTrace();
         aaba[var3] = var6;
      }

      StackTraceElement var7 = var6[1];
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 24089;
      int var9 = 0;

      do {
         int var10 = var4[var9] - '鐄';
         var10 ^= 36932;
         var10 += 45458;
         var10 ^= 28008;
         var10 ^= 18744;
         var10 -= 22981;
         var4[var9] = (char)(var10 ^ var8 ^ var0 ^ var2 >> 16);
         ++var9;
      } while(var9 < var4.length);

      return (new String(var4)).intern();
   }

   private static boolean a(class_310 param0) {
      // $FF: Couldn't be decompiled
   }

   private static long ab(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ aba(-456625953, 354723256 ^ -1542578644)) & aba(-456625960, 354723256 ^ -737071777);
      if (abb[var3] == null) {
         abb[var3] = bbb[var3] ^ var1;
      }

      return abb[var3];
   }

   private q2997348aa27a422480aea29cbfd800b1ababababb() {
   }

   public static void ba() {
      a = true;
      ba = false;
      b = Double.POSITIVE_INFINITY;
      bb = Double.POSITIVE_INFINITY;
      bba = Double.NEGATIVE_INFINITY;
      bab = Double.NEGATIVE_INFINITY;
   }

   public static void bb(int param0, int param1, int param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   private static long aaa(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ aa(aba(-456625959, 700966548 ^ -517134449), 8058767819117156681L)) & aa(aba(-456625958, 700966548 ^ -2030515871), 4988336021120526230L);

      try {
         if (aa[var3] == null) {
            aa[var3] = ab[var3] ^ var1;
         }
      } catch (MatchException var4) {
         throw var4;
      }

      return aa[var3];
   }

   private static int aba(int var0, int var1) {
      int var2 = aaaa[var0 ^ -456625956] ^ var1 ^ var0;
      var2 -= 26905;
      var2 ^= 10182;
      var2 -= 12353;
      var2 ^= 9605;
      var2 -= 17980;
      var2 ^= 31940;
      var2 -= 50055;
      var2 += 8649;
      var2 ^= 29627;
      return var2;
   }

   public static boolean aab(class_310 param0, q2997348aa27a422480aea29cbfd800b1aaabaabab param1) {
      // $FF: Couldn't be decompiled
   }

   public static void b() {
      // $FF: Couldn't be decompiled
   }
}
