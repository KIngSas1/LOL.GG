package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

// $FF: synthetic class
@Environment(EnvType.CLIENT)
class q2997348aa27a422480aea29cbfd800b1baaabb {
   private static final Object[] ab;
   private static final String[] aa;
   private static final int[] b;
   static final int[] a;

   static {
      int var48 = -2005094522;
      int var39 = "\u001b伮\ude4a䜎幀䜮김䱮\ude4e䈞繀仮湉䛮﹃䇞蹎䉞义䝞빂䴞깊䡞㹋䘮湉䏮8\udd78꣖\uddf8棒\ud7a8\uf8d2팸㣔핈ࣖ편棒홸꣑\udcf8壕폨죘\uda18\ud8dbힸ\uf8de흘룙힘磑휈㣗털裓퐈\ue8d0탈ᣔ폸룐\ud7a8\uf8d2팸㣕\udb88⣑\ud898\ue8d8홸꣑\udcf8壗\ud908磗\udc28룛ힸ\uf8de흘㣚\nܟ伅د㼀ྟ\uef04\u0ebf⼇گ⼌\u0010⠈砨⯈堥Ⰸ堩⢘栭⠨堫↸ࠪⷘࠪ❘頯\n佱⅍乁先䟱腌䛑䅏仁䅄\u0018峤ђ咴\u2454嫴ᑝ嘄摘堔\u2451喤鑓剔푛娔䑟奄葟嚄瑐嫤ᑑ剤\ue456\n\u0fdb謍\u0eeb\ufb08ݛ⬌ٻ\ueb0f\u0e6b\ueb04".length();
      int var42 = 0;
      int var41 = 0;
      String[] var40 = new String[7];
      String var38 = "\u001b伮\ude4a䜎幀䜮김䱮\ude4e䈞繀仮湉䛮﹃䇞蹎䉞义䝞빂䴞깊䡞㹋䘮湉䏮8\udd78꣖\uddf8棒\ud7a8\uf8d2팸㣔핈ࣖ편棒홸꣑\udcf8壕폨죘\uda18\ud8dbힸ\uf8de흘룙힘磑휈㣗털裓퐈\ue8d0탈ᣔ폸룐\ud7a8\uf8d2팸㣕\udb88⣑\ud898\ue8d8홸꣑\udcf8壗\ud908磗\udc28룛ힸ\uf8de흘㣚\nܟ伅د㼀ྟ\uef04\u0ebf⼇گ⼌\u0010⠈砨⯈堥Ⰸ堩⢘栭⠨堫↸ࠪⷘࠪ❘頯\n佱⅍乁先䟱腌䛑䅏仁䅄\u0018峤ђ咴\u2454嫴ᑝ嘄摘堔\u2451喤鑓剔푛娔䑟奄葟嚄瑐嫤ᑑ剤\ue456\n\u0fdb謍\u0eeb\ufb08ݛ⬌ٻ\ueb0f\u0e6b\ueb04";
      short var43 = 29656;

      do {
         char var10000 = var38.charAt(var42);
         int var46 = 0;
         char var44 = var10000;
         char[] var45 = var38.substring(var42 + 1, var42 + 1 + var44).toCharArray();

         do {
            char var47 = var45[var46];
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

      aa = var40;
      ab = new Object[var40.length];
      int var34 = 133321571;
      byte[] var32 = "'q_\u0016¨\u008b;ä\t\u0018í=\u0081\u009e=v_6\u007fï\u0096\u0087\u009e*0ÝÎ\u0089`Åiæ¿¸´\u0010eí~~×f4¬O*cFÖÚÊsÕêL\u0097áYÐ\u0016ä\u0015N\u0086c]\u001f[9æ\u0085¬\u0081èìTú\u009cv>ÚÓÅ\u001bpä\u0093\u0014\re¢oW\u0006ì\u0086\u0000\u0005Ùà³Åh73µ\u000b\u008c\u0086ç¨ð+\u000f]é,ãW¾ \u0080$¼þåõXv\u0087\u0082RâC\u001côU\u001blðÖ\u0083Þ+\u0094oäo\u0088ð\u0007cP\u001c\u0016ª\u000fùÒ\u0099".getBytes("ISO-8859-1");
      int var33 = var32.length / 4;
      b = new int[var33];
      int var35 = 0;
      int var36 = 0;

      do {
         int var37 = (var32[var35] & 255) << 24 | (var32[var35 + 1] & 255) << 16 | (var32[var35 + 2] & 255) << 8 | var32[var35 + 3] & 255;
         var37 ^= var34;
         b[var36] = var37;
         var35 += 4;
         ++var36;
      } while(var36 < var33);

      String[] var16 = new String[2];
      int var20 = 0;
      String var19;
      int var21 = (var19 = b(433068779, var48 ^ 204339382)).length();
      int var18 = a(-265596817, var48 ^ 1490467465);
      int var17 = -1;

      while(true) {
         char[] var75;
         label135: {
            ++var17;
            char[] var10001 = var19.substring(var17, var17 + var18).toCharArray();
            int var10003 = var10001.length;
            int var22 = 0;
            var75 = var10001;
            int var62 = var10003;
            char[] var84;
            int var10004;
            if (var10003 <= 1) {
               var84 = var10001;
               var10004 = var22;
            } else {
               var75 = var10001;
               var62 = var10003;
               if (var10003 <= var22) {
                  break label135;
               }

               var84 = var10001;
               var10004 = var22;
            }

            while(true) {
               char var10005 = var84[var10004];
               int var10006;
               switch (var22 % a(-265596818, var48 ^ -684925361)) {
                  case 0 -> var10006 = a(-265596819, var48 ^ 1992231133);
                  case 1 -> var10006 = a(-265596820, var48 ^ -29763403);
                  case 2 -> var10006 = a(-265596821, var48 ^ 546413066);
                  case 3 -> var10006 = a(-265596822, var48 ^ -383747181);
                  case 4 -> var10006 = a(-265596823, var48 ^ 1333406539);
                  case 5 -> var10006 = a(-265596824, var48 ^ 526552102);
                  default -> var10006 = a(-265596825, var48 ^ -1071689249);
               }

               var84[var10004] = (char)(var10005 ^ var10006);
               ++var22;
               if (var62 == 0) {
                  var10004 = var62;
                  var84 = var75;
               } else {
                  if (var62 <= var22) {
                     break;
                  }

                  var84 = var75;
                  var10004 = var22;
               }
            }
         }

         String var91 = (new String(var75)).intern();
         int var66 = -1;
         var16[var20++] = var91;
         if ((var17 += var18) >= var21) {
            long var9 = 2953726417235718524L;
            long[] var8 = new long[a(-265596826, var48 ^ 441097171)];
            int var12 = 0;
            String var13;
            int var14 = (var13 = b(433068778, var48 ^ 1698470768)).length();
            int var11 = 0;

            label116:
            while(true) {
               var66 = var11;
               var11 += 8;
               byte[] var15 = var13.substring(var66, var11).getBytes(b(433068777, var48 ^ 409004126));
               long[] var59 = var8;
               var66 = var12++;
               long var80 = ((long)var15[0] & 255L) << a(-265596827, var48 ^ -1463693103) | ((long)var15[1] & 255L) << a(-265596828, var48 ^ 814581554) | ((long)var15[2] & 255L) << a(-265596829, var48 ^ -1451413512) | ((long)var15[3] & 255L) << a(-265596830, var48 ^ -1437751019) | ((long)var15[4] & 255L) << a(-265596831, var48 ^ -1627507313) | ((long)var15[5] & 255L) << a(-265596832, var48 ^ -1682789610) | ((long)var15[a(-265596801, var48 ^ 486210270)] & 255L) << a(-265596802, var48 ^ 1178689562) | (long)var15[a(-265596803, var48 ^ -28374548)] & 255L;
               byte var92 = -1;

               while(true) {
                  long var97 = var80 ^ var9;
                  switch (var92) {
                     case 0:
                        var59[var66] = var97;
                        if (var11 >= var14) {
                           long var1 = 1713205750324944851L;
                           long[] var0 = new long[3];
                           int var4 = 0;
                           String var5;
                           int var6 = (var5 = b(433068782, var48 ^ -1384011516)).length();
                           int var3 = 0;

                           do {
                              var66 = var3;
                              var3 += 8;
                              byte[] var7 = var5.substring(var66, var3).getBytes(b(433068781, var48 ^ 1491900735));
                              var66 = var4++;
                              var97 = (((long)var7[0] & 255L) << a(-265596813, var48 ^ 1420343682) | ((long)var7[1] & 255L) << a(-265596814, var48 ^ 1397011420) | ((long)var7[2] & 255L) << a(-265596815, var48 ^ 1596440869) | ((long)var7[3] & 255L) << a(-265596816, var48 ^ -2126376760) | ((long)var7[4] & 255L) << a(-265596849, var48 ^ 153118693) | ((long)var7[5] & 255L) << a(-265596850, var48 ^ -1645938358) | ((long)var7[a(-265596851, var48 ^ 716998983)] & 255L) << a(-265596852, var48 ^ -1457243217) | (long)var7[a(-265596853, var48 ^ -339213855)] & 255L) ^ var1;
                              var92 = -1;
                              var0[var66] = var97;
                           } while(var3 < var6);

                           long var24 = var0[1];
                           long[] var23 = new long[2];
                           int var27 = 0;
                           String var28;
                           int var29 = (var28 = var16[0]).length();
                           int var26 = 0;

                           do {
                              var66 = var26;
                              var26 += 8;
                              byte[] var30 = var28.substring(var66, var26).getBytes(var16[1]);
                              var66 = var27++;
                              var97 = (((long)var30[0] & var0[2]) << (int)var8[4] | ((long)var30[1] & var0[0]) << (int)var8[5] | ((long)var30[2] & var0[0]) << (int)var8[0] | ((long)var30[3] & var0[0]) << (int)var8[a(-265596854, var48 ^ -145235245)] | ((long)var30[4] & var0[0]) << (int)var8[2] | ((long)var30[5] & var0[0]) << (int)var8[1] | ((long)var30[(int)var8[a(-265596855, var48 ^ 800846635)]] & var0[0]) << (int)var8[3] | (long)var30[(int)var8[a(-265596856, var48 ^ 1885222676)]] & var0[0]) ^ var24;
                              var92 = -1;
                              var23[var66] = var97;
                           } while(var26 < var29);

                           a = new int[q2997348aa27a422480aea29cbfd800b1aabbaaaaa.values().length];

                           try {
                              a[q2997348aa27a422480aea29cbfd800b1aabbaaaaa.abb.ordinal()] = 1;
                           } catch (NoSuchFieldError var55) {
                           }

                           try {
                              a[q2997348aa27a422480aea29cbfd800b1aabbaaaaa.bba.ordinal()] = 2;
                           } catch (NoSuchFieldError var54) {
                           }

                           try {
                              a[q2997348aa27a422480aea29cbfd800b1aabbaaaaa.aba.ordinal()] = 3;
                           } catch (NoSuchFieldError var53) {
                           }

                           try {
                              a[q2997348aa27a422480aea29cbfd800b1aabbaaaaa.bab.ordinal()] = 4;
                           } catch (NoSuchFieldError var52) {
                           }

                           try {
                              a[q2997348aa27a422480aea29cbfd800b1aabbaaaaa.aaa.ordinal()] = 5;
                           } catch (NoSuchFieldError var51) {
                           }

                           try {
                              a[q2997348aa27a422480aea29cbfd800b1aabbaaaaa.bbb.ordinal()] = (int)var23[1];
                           } catch (NoSuchFieldError var50) {
                           }

                           try {
                              a[q2997348aa27a422480aea29cbfd800b1aabbaaaaa.aab.ordinal()] = (int)var23[0];
                           } catch (NoSuchFieldError var49) {
                           }

                           return;
                        }
                        break;
                     default:
                        var59[var66] = var97;
                        if (var11 < var14) {
                           continue label116;
                        }

                        var14 = (var13 = b(433068776, var48 ^ 1787222876)).length();
                        var11 = 0;
                  }

                  var66 = var11;
                  var11 += 8;
                  var15 = var13.substring(var66, var11).getBytes(b(433068783, var48 ^ -52002333));
                  var59 = var8;
                  var66 = var12++;
                  var80 = ((long)var15[0] & 255L) << a(-265596804, var48 ^ -2059693478) | ((long)var15[1] & 255L) << a(-265596805, var48 ^ -1519115920) | ((long)var15[2] & 255L) << a(-265596806, var48 ^ 256079494) | ((long)var15[3] & 255L) << a(-265596807, var48 ^ 1925335030) | ((long)var15[4] & 255L) << a(-265596808, var48 ^ 681642246) | ((long)var15[5] & 255L) << a(-265596809, var48 ^ 2141338727) | ((long)var15[a(-265596810, var48 ^ -865956421)] & 255L) << a(-265596811, var48 ^ 1276309041) | (long)var15[a(-265596812, var48 ^ -113226431)] & 255L;
                  var92 = 0;
               }
            }
         }

         var18 = var19.charAt(var17);
      }
   }

   private static String b(int var0, int var1) {
      int var3 = var0 ^ 433068779;
      char[] var4 = aa[var3].toCharArray();
      StackTraceElement[] var2 = (StackTraceElement[])ab[var3];
      StackTraceElement[] var5;
      if (var2 != null) {
         var5 = var2;
      } else {
         var5 = (new Throwable()).getStackTrace();
         ab[var3] = var5;
      }

      StackTraceElement var6 = var5[1];
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ 1629350558;
      int var8 = 0;

      do {
         short var9;
         switch (var8 & 31) {
            case 0:
            default:
               var9 = 108;
               break;
            case 1:
               var9 = 83;
               break;
            case 2:
               var9 = 121;
               break;
            case 3:
               var9 = 122;
               break;
            case 4:
               var9 = 149;
               break;
            case 5:
               var9 = 34;
               break;
            case 6:
               var9 = 138;
               break;
            case 7:
               var9 = 31;
               break;
            case 8:
               var9 = 19;
               break;
            case 9:
               var9 = 167;
               break;
            case 10:
               var9 = 12;
               break;
            case 11:
               var9 = 103;
               break;
            case 12:
               var9 = 136;
               break;
            case 13:
               var9 = 23;
               break;
            case 14:
               var9 = 118;
               break;
            case 15:
               var9 = 49;
               break;
            case 16:
               var9 = 54;
               break;
            case 17:
               var9 = 139;
               break;
            case 18:
               var9 = 90;
               break;
            case 19:
               var9 = 63;
               break;
            case 20:
               var9 = 148;
               break;
            case 21:
               var9 = 226;
               break;
            case 22:
               var9 = 204;
               break;
            case 23:
               var9 = 247;
               break;
            case 24:
               var9 = 13;
               break;
            case 25:
               var9 = 199;
               break;
            case 26:
               var9 = 84;
               break;
            case 27:
               var9 = 22;
               break;
            case 28:
               var9 = 252;
               break;
            case 29:
               var9 = 53;
               break;
            case 30:
               var9 = 249;
               break;
            case 31:
               var9 = 114;
         }

         var4[var8] = (char)(var4[var8] ^ var9 ^ var1 >> 16 ^ var7);
         ++var8;
      } while(var8 < var4.length);

      return (new String(var4)).intern();
   }

   private static int a(int var0, int var1) {
      int var2 = b[var0 ^ -265596817] ^ var1 ^ var0;
      var2 -= 6626;
      var2 -= 12459;
      var2 ^= 6907;
      var2 -= 23633;
      var2 -= 39186;
      var2 -= 48695;
      var2 ^= 6635;
      var2 ^= 11634;
      var2 ^= 1104;
      return var2;
   }
}
