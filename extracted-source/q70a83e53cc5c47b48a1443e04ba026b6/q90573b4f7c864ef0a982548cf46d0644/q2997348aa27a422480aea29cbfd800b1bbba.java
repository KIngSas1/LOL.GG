package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

// $FF: synthetic class
@Environment(EnvType.CLIENT)
class q2997348aa27a422480aea29cbfd800b1bbba {
   static final int[] a;
   private static final Object[] ba;
   private static final String[] ab;
   private static final int[] aa;
   static final int[] b;

   private static String b(int var0, byte var1, char var2, short var3) {
      int var8 = var0 ^ 1267738401;
      char[] var7 = ab[var8].toCharArray();
      StackTraceElement[] var9 = (StackTraceElement[])ba[var8];
      StackTraceElement[] var10;
      if (var9 != null) {
         var10 = var9;
      } else {
         var10 = (new Throwable()).getStackTrace();
         ba[var8] = var10;
      }

      StackTraceElement var11 = var10[1];
      int var5 = (var11.getClassName().hashCode() ^ var11.getMethodName().hashCode()) >> 16 ^ '年';

      for(int var6 = 0; var6 < var7.length; ++var6) {
         char var10002 = var7[var6];
         short var10003;
         switch (var6 % 22) {
            case 0:
            default:
               var10003 = 187;
               break;
            case 1:
               var10003 = 34;
               break;
            case 2:
               var10003 = 110;
               break;
            case 3:
               var10003 = 133;
               break;
            case 4:
               var10003 = 199;
               break;
            case 5:
               var10003 = 204;
               break;
            case 6:
               var10003 = 205;
               break;
            case 7:
               var10003 = 89;
               break;
            case 8:
               var10003 = 147;
               break;
            case 9:
               var10003 = 18;
               break;
            case 10:
               var10003 = 187;
               break;
            case 11:
               var10003 = 190;
               break;
            case 12:
               var10003 = 113;
               break;
            case 13:
               var10003 = 97;
               break;
            case 14:
               var10003 = 220;
               break;
            case 15:
               var10003 = 235;
               break;
            case 16:
               var10003 = 173;
               break;
            case 17:
               var10003 = 217;
               break;
            case 18:
               var10003 = 201;
               break;
            case 19:
               var10003 = 109;
               break;
            case 20:
               var10003 = 180;
               break;
            case 21:
               var10003 = 72;
         }

         var7[var6] = (char)(var10002 ^ var10003 ^ var6 ^ var0 ^ var3 ^ var5 ^ var1 ^ var2);
      }

      return (new String(var7)).intern();
   }

   static {
      int var48 = 519192460;
      int var10001 = "\u001b㉚ݥ㹁䝞㑰䝻㇞坦㈼靸㑛螩㔩래㾪ݢ㣑흞㽰\u1771㶾䝣㽼ᝳる➣㯹8膩퓙诲哢襃\ue4c2訽\ue4d5聟哇蓈됑艺됯譙䓚葢쓣譃蓅轍ꓘ貯哉輘ꐝ趚\uf425袩㓟躲㓠較퓁趭ⓐ訿铊軸搗訊䐯肩㓞賒蓬芳\ua4ca襝ᓗ茟瓎迸Е躺ᐬ\n䨂缙䜉켣䩘漄䨶༞乄\udf01\u0010\uda86쮍\ud80d鮶헬䮞횒뮈\ude70ﮜ\ud997譀\uded5᭳ퟶ殇\n翙ꐬ狒ᐖ羃됱翭퐫箟д\u0018刌\ue104儷儰左Ē嶨섏嘺ꄝ儭燊嫏䇶尌鄂剷儽媖턝寨䄈嬺焒\n\ue841㲻\ue54a貁\ue81bⲦ\ue875䲼\uec07鲣".length();
      short var43 = 20291;
      String[] var40 = new String[7];
      int var39 = var10001;
      int var41 = 0;
      String var38 = "\u001b㉚ݥ㹁䝞㑰䝻㇞坦㈼靸㑛螩㔩래㾪ݢ㣑흞㽰\u1771㶾䝣㽼ᝳる➣㯹8膩퓙诲哢襃\ue4c2訽\ue4d5聟哇蓈됑艺됯譙䓚葢쓣譃蓅轍ꓘ貯哉輘ꐝ趚\uf425袩㓟躲㓠較퓁趭ⓐ訿铊軸搗訊䐯肩㓞賒蓬芳\ua4ca襝ᓗ茟瓎迸Е躺ᐬ\n䨂缙䜉켣䩘漄䨶༞乄\udf01\u0010\uda86쮍\ud80d鮶헬䮞횒뮈\ude70ﮜ\ud997譀\uded5᭳ퟶ殇\n翙ꐬ狒ᐖ羃됱翭퐫箟д\u0018刌\ue104儷儰左Ē嶨섏嘺ꄝ儭燊嫏䇶尌鄂剷儽媖턝寨䄈嬺焒\n\ue841㲻\ue54a貁\ue81bⲦ\ue875䲼\uec07鲣";
      int var42 = 0;

      do {
         char var44 = var38.charAt(var42);
         int var46 = 0;
         char[] var45 = var38.substring(var42 + 1, var42 + 1 + var44).toCharArray();

         do {
            int var47 = var45[var46];
            short var10000;
            switch (var46 % 7) {
               case 0:
               default:
                  var10000 = 93;
                  break;
               case 1:
                  var10000 = 91;
                  break;
               case 2:
                  var10000 = 70;
                  break;
               case 3:
                  var10000 = 108;
                  break;
               case 4:
                  var10000 = 151;
                  break;
               case 5:
                  var10000 = 78;
                  break;
               case 6:
                  var10000 = 169;
            }

            var47 = (char)var10000 ^ var47;
            if (var46 % 2 == 0) {
               var45[var46] = (char)((var47 >>> 4 | var47 << 12) & '\uffff' ^ var43);
            } else {
               var45[var46] = (char)((var47 << 4 | var47 >>> 12) & '\uffff' ^ var43);
            }

            ++var46;
         } while(var46 < var45.length);

         var40[var41] = new String(var45);
         ++var41;
         var42 = var42 + var44 + 1;
      } while(var42 < var39);

      ab = var40;
      ba = new Object[var40.length];
      int var34 = -274774633;
      byte[] var32 = "·ÃWî\tk\u0011\u000e\u001e\u0014Îä å^O\u001eê\u0087ç\u00123\u0080\u001fçÅ²Ühz]\u000e(¼Ó\u009b¢\u0001æÀú\u0088Õ]\u000bs6á\u0087ÛÐvÆUå£ã\bëðY)å¯iÐNå\u00893\u008dMý\u001cÊøT·\u0085Þn\u009c×æKa¯mÒ£e¢\u009bÚ\t¥ÇU\u0087°\u0095§\u0012x\u008c|þqEP\u0084Ë-¸÷\u008c){¡úÿYïáð\u008c%9µ\u00986qÊ$1aH¾#ÈM\u0091\u001fóF¥©±]ó#C«\u009eÐ4.ÓÉ?".getBytes("ISO-8859-1");
      int var33 = var32.length / 4;
      aa = new int[var33];
      int var35 = 0;
      int var36 = 0;

      do {
         int var37 = (var32[var35] & 255) << 24 | (var32[var35 + 1] & 255) << 16 | (var32[var35 + 2] & 255) << 8 | var32[var35 + 3] & 255;
         var37 ^= var34;
         aa[var36] = var37;
         var35 += 4;
         ++var36;
      } while(var36 < var33);

      String[] var16 = new String[2];
      int var20 = 0;
      String var19;
      int var21 = (var19 = b(1267738401, (byte)120, '舥', (short)-15624)).length();
      int var18 = a(-484359415, var48 ^ -1517339055);
      int var17 = -1;

      while(true) {
         char[] var82;
         label177: {
            ++var17;
            char[] var66 = var19.substring(var17, var17 + var18).toCharArray();
            int var10003 = var66.length;
            int var22 = 0;
            var82 = var66;
            int var69 = var10003;
            char[] var91;
            int var10004;
            if (var10003 <= 1) {
               var91 = var66;
               var10004 = var22;
            } else {
               var82 = var66;
               var69 = var10003;
               if (var10003 <= var22) {
                  break label177;
               }

               var91 = var66;
               var10004 = var22;
            }

            while(true) {
               char var10005 = var91[var10004];
               int var10006;
               switch (var22 % a(-484359416, var48 ^ 455571631)) {
                  case 0 -> var10006 = a(-484359413, var48 ^ 207136615);
                  case 1 -> var10006 = a(-484359414, var48 ^ 849950059);
                  case 2 -> var10006 = a(-484359411, var48 ^ 212266549);
                  case 3 -> var10006 = a(-484359412, var48 ^ 8382672);
                  case 4 -> var10006 = a(-484359409, var48 ^ -175515190);
                  case 5 -> var10006 = a(-484359410, var48 ^ 2050373097);
                  default -> var10006 = a(-484359423, var48 ^ 988854831);
               }

               var91[var10004] = (char)(var10005 ^ var10006);
               ++var22;
               if (var69 == 0) {
                  var10004 = var69;
                  var91 = var82;
               } else {
                  if (var69 <= var22) {
                     break;
                  }

                  var91 = var82;
                  var10004 = var22;
               }
            }
         }

         String var98 = (new String(var82)).intern();
         var10001 = -1;
         var16[var20++] = var98;
         if ((var17 += var18) >= var21) {
            long var9 = 7198462193753055093L;
            long[] var8 = new long[a(-484359424, var48 ^ -1337094281)];
            int var12 = 0;
            String var13;
            int var14 = (var13 = b(1267738400, (byte)-117, (char)'\ue5af', (short)25055)).length();
            int var11 = 0;

            label158:
            while(true) {
               var10001 = var11;
               var11 += 8;
               byte[] var15 = var13.substring(var10001, var11).getBytes(b(1267738403, (byte)-75, '캣', (short)-2556));
               long[] var65 = var8;
               var10001 = var12++;
               long var87 = ((long)var15[0] & 255L) << a(-484359421, var48 ^ -389759394) | ((long)var15[1] & 255L) << a(-484359422, var48 ^ 423583595) | ((long)var15[2] & 255L) << a(-484359419, var48 ^ -1785218589) | ((long)var15[3] & 255L) << a(-484359420, var48 ^ -736523137) | ((long)var15[4] & 255L) << a(-484359417, var48 ^ -247168425) | ((long)var15[5] & 255L) << a(-484359418, var48 ^ 1264946177) | ((long)var15[a(-484359399, var48 ^ 2073831254)] & 255L) << a(-484359400, var48 ^ -1686117147) | (long)var15[a(-484359397, var48 ^ -279927990)] & 255L;
               byte var99 = -1;

               while(true) {
                  long var104 = var87 ^ var9;
                  switch (var99) {
                     case 0:
                        var65[var10001] = var104;
                        if (var11 >= var14) {
                           long var1 = 5913709614159222593L;
                           long[] var0 = new long[3];
                           int var4 = 0;
                           String var5;
                           int var6 = (var5 = b(1267738404, (byte)102, (char)4648, (short)13504)).length();
                           int var3 = 0;

                           do {
                              var10001 = var3;
                              var3 += 8;
                              byte[] var7 = var5.substring(var10001, var3).getBytes(b(1267738407, (byte)-77, '弑', (short)23952));
                              var10001 = var4++;
                              var104 = (((long)var7[0] & 255L) << a(-484359403, var48 ^ 1072995481) | ((long)var7[1] & 255L) << a(-484359404, var48 ^ 993511526) | ((long)var7[2] & 255L) << a(-484359401, var48 ^ -317356442) | ((long)var7[3] & 255L) << a(-484359402, var48 ^ -490713865) | ((long)var7[4] & 255L) << a(-484359383, var48 ^ -1479254024) | ((long)var7[5] & 255L) << a(-484359384, var48 ^ -664250143) | ((long)var7[a(-484359381, var48 ^ 1525828169)] & 255L) << a(-484359382, var48 ^ 1608349289) | (long)var7[a(-484359379, var48 ^ 1424605237)] & 255L) ^ var1;
                              var99 = -1;
                              var0[var10001] = var104;
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
                              var104 = (((long)var30[0] & var0[0]) << (int)var8[1] | ((long)var30[1] & var0[2]) << (int)var8[4] | ((long)var30[2] & var0[2]) << (int)var8[5] | ((long)var30[3] & var0[2]) << (int)var8[a(-484359380, var48 ^ 1337936607)] | ((long)var30[4] & var0[2]) << (int)var8[0] | ((long)var30[5] & var0[2]) << (int)var8[a(-484359377, var48 ^ -1177372239)] | ((long)var30[(int)var8[3]] & var0[2]) << (int)var8[2] | (long)var30[(int)var8[a(-484359378, var48 ^ 1017094328)]] & var0[2]) ^ var24;
                              var99 = -1;
                              var23[var10001] = var104;
                           } while(var26 < var29);

                           b = new int[q2997348aa27a422480aea29cbfd800b1aaaaab.values().length];

                           try {
                              b[q2997348aa27a422480aea29cbfd800b1aaaaab.aba.ordinal()] = 1;
                           } catch (NoSuchFieldError var60) {
                           }

                           try {
                              b[q2997348aa27a422480aea29cbfd800b1aaaaab.bb.ordinal()] = 2;
                           } catch (NoSuchFieldError var59) {
                           }

                           try {
                              b[q2997348aa27a422480aea29cbfd800b1aaaaab.aab.ordinal()] = 3;
                           } catch (NoSuchFieldError var58) {
                           }

                           try {
                              b[q2997348aa27a422480aea29cbfd800b1aaaaab.ab.ordinal()] = 4;
                           } catch (NoSuchFieldError var57) {
                           }

                           try {
                              b[q2997348aa27a422480aea29cbfd800b1aaaaab.ba.ordinal()] = 5;
                           } catch (NoSuchFieldError var56) {
                           }

                           a = new int[q2997348aa27a422480aea29cbfd800b1aabbaaaaa.values().length];

                           try {
                              a[q2997348aa27a422480aea29cbfd800b1aabbaaaaa.bba.ordinal()] = 1;
                           } catch (NoSuchFieldError var55) {
                           }

                           try {
                              a[q2997348aa27a422480aea29cbfd800b1aabbaaaaa.aba.ordinal()] = 2;
                           } catch (NoSuchFieldError var54) {
                           }

                           try {
                              a[q2997348aa27a422480aea29cbfd800b1aabbaaaaa.aab.ordinal()] = 3;
                           } catch (NoSuchFieldError var53) {
                           }

                           try {
                              a[q2997348aa27a422480aea29cbfd800b1aabbaaaaa.bab.ordinal()] = 4;
                           } catch (NoSuchFieldError var52) {
                           }

                           try {
                              a[q2997348aa27a422480aea29cbfd800b1aabbaaaaa.abb.ordinal()] = 5;
                           } catch (NoSuchFieldError var51) {
                           }

                           try {
                              a[q2997348aa27a422480aea29cbfd800b1aabbaaaaa.aaa.ordinal()] = (int)var23[1];
                           } catch (NoSuchFieldError var50) {
                           }

                           try {
                              a[q2997348aa27a422480aea29cbfd800b1aabbaaaaa.bbb.ordinal()] = (int)var23[0];
                           } catch (NoSuchFieldError var49) {
                           }

                           return;
                        }
                        break;
                     default:
                        var65[var10001] = var104;
                        if (var11 < var14) {
                           continue label158;
                        }

                        var14 = (var13 = b(1267738402, (byte)10, '\uedd8', (short)25569)).length();
                        var11 = 0;
                  }

                  var10001 = var11;
                  var11 += 8;
                  var15 = var13.substring(var10001, var11).getBytes(b(1267738405, (byte)-59, '朴', (short)-4936));
                  var65 = var8;
                  var10001 = var12++;
                  var87 = ((long)var15[0] & 255L) << a(-484359398, var48 ^ 1190915780) | ((long)var15[1] & 255L) << a(-484359395, var48 ^ 2094055027) | ((long)var15[2] & 255L) << a(-484359396, var48 ^ 1496172257) | ((long)var15[3] & 255L) << a(-484359393, var48 ^ -1058075547) | ((long)var15[4] & 255L) << a(-484359394, var48 ^ -1986633701) | ((long)var15[5] & 255L) << a(-484359407, var48 ^ -719720951) | ((long)var15[a(-484359408, var48 ^ -2014610494)] & 255L) << a(-484359405, var48 ^ -1640982574) | (long)var15[a(-484359406, var48 ^ 1461513584)] & 255L;
                  var99 = 0;
               }
            }
         }

         var18 = var19.charAt(var17);
      }
   }

   private static int a(int var0, int var1) {
      int var2 = aa[var0 ^ -484359415] ^ var1 ^ var0;
      var2 += 30069;
      var2 ^= 1002;
      var2 -= 18226;
      var2 ^= 15182;
      var2 -= 31939;
      var2 -= 23541;
      var2 += 62933;
      var2 -= 25323;
      return var2;
   }
}
