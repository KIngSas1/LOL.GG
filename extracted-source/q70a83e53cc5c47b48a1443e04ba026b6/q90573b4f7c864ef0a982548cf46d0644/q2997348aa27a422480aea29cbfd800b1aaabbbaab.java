package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public final class q2997348aa27a422480aea29cbfd800b1aaabbbaab extends q2997348aa27a422480aea29cbfd800b1bbabab {
   private static final long aa;
   private static final Object[] bba;
   private static final Integer[] ab;
   private static final String[] bab;
   private final Runnable ba;
   private static final Long[] a;
   private static final long[] bb;
   private static final long[] aaa;
   private static final int[] baa;
   private static String[] aab;
   private static final Integer[] aba;
   private static final long[] abb;

   private static int aa(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & baa(b(824036923, 358547790 ^ 2091597249), 8682544476738259850L)) ^ abb(b(824036922, 358547790 ^ -1756326125), 2456998936282117874L);

      try {
         if (ab[var3] == null) {
            ab[var3] = (int)(abb[var3] ^ var1);
         }
      } catch (MatchException var4) {
         throw var4;
      }

      return ab[var3];
   }

   public void ab(Object var1) {
      this.aaa((String)var1);
   }

   private static String ba(char[] var0, long var1, int var3) {
      int var4 = aa(abb(b(824036921, 1757534290 ^ 1423506106), 1115807982470146964L), baa(b(824036920, 1757534290 ^ 820717102), 3015573866686287199L)) ^ var3;

      for(int var5 = 0; var5 < var0.length; ++var5) {
         int var7 = var4 ^ (int)var1 ^ ~var5;
         int var8 = var7 ^ var3 - var5 * var0.length;
         var4 = -var8 * var3 | var5;
         var0[var5] = (char)(var0[var5] ^ var4);
         int var6 = var5 & aa(abb(b(824036927, 1757534290 ^ -72730901), 3431903539749252282L), baa(b(824036926, 1757534290 ^ -1327136638), 8372751694081335578L));
         var3 = var3 << var6 | var3 >>> -var6;
         var1 ^= (long)var6;
      }

      return new String(var0);
   }

   public q2997348aa27a422480aea29cbfd800b1aaabbbaab(Object var1, String var2) {
      this(var1, var2, (Runnable)null);
   }

   public JsonElement bb() {
      return JsonNull.INSTANCE;
   }

   public void aaa(String param1) {
      // $FF: Couldn't be decompiled
   }

   public void aab() {
      // $FF: Couldn't be decompiled
   }

   public q2997348aa27a422480aea29cbfd800b1aaabbbaab(Object var1, String var2, Runnable var3) {
      super((Object)var1, var2 == null ? aab[0] : var2);
      this.ba = var3;
   }

   public q2997348aa27a422480aea29cbfd800b1aaabbbaab(Object var1) {
      this(var1, aab[0], (Runnable)null);
   }

   private static String bba(short var0, byte var1, short var2, char var3, int var4, char var5) {
      int var10 = var4 ^ 1000182174;
      char[] var9 = bab[var10].toCharArray();
      StackTraceElement[] var11 = (StackTraceElement[])bba[var10];
      StackTraceElement[] var12;
      if (var11 != null) {
         var12 = var11;
      } else {
         var12 = (new Throwable()).getStackTrace();
         bba[var10] = var12;
      }

      StackTraceElement var13 = var12[1];
      int var7 = (var13.getClassName().hashCode() ^ var13.getMethodName().hashCode()) >> 16 ^ 30708;

      for(int var8 = 0; var8 < var9.length; ++var8) {
         int var10002 = var9[var8] ^ var8;
         short var10003;
         switch (var8 % 29) {
            case 0:
            default:
               var10003 = 36;
               break;
            case 1:
               var10003 = 166;
               break;
            case 2:
               var10003 = 236;
               break;
            case 3:
               var10003 = 91;
               break;
            case 4:
               var10003 = 10;
               break;
            case 5:
               var10003 = 10;
               break;
            case 6:
               var10003 = 168;
               break;
            case 7:
               var10003 = 130;
               break;
            case 8:
               var10003 = 126;
               break;
            case 9:
               var10003 = 117;
               break;
            case 10:
               var10003 = 245;
               break;
            case 11:
               var10003 = 222;
               break;
            case 12:
               var10003 = 75;
               break;
            case 13:
               var10003 = 171;
               break;
            case 14:
               var10003 = 240;
               break;
            case 15:
               var10003 = 95;
               break;
            case 16:
               var10003 = 35;
               break;
            case 17:
               var10003 = 13;
               break;
            case 18:
               var10003 = 135;
               break;
            case 19:
               var10003 = 176;
               break;
            case 20:
               var10003 = 172;
               break;
            case 21:
               var10003 = 112;
               break;
            case 22:
               var10003 = 144;
               break;
            case 23:
               var10003 = 92;
               break;
            case 24:
               var10003 = 224;
               break;
            case 25:
               var10003 = 128;
               break;
            case 26:
               var10003 = 184;
               break;
            case 27:
               var10003 = 247;
               break;
            case 28:
               var10003 = 155;
         }

         var9[var8] = (char)(var10002 ^ var10003 ^ 'ꎁ' ^ var2 ^ var0 ^ var5 ^ var1 ^ var4 ^ var7 ^ var3);
      }

      return (new String(var9)).intern();
   }

   static {
      int var43 = -1272421774;
      short var38 = 30538;
      int var36 = 0;
      int var10001 = "#镛ᮟ鹋ﮒ阻ꮗ頫䮘闫讐颻\u0b98镋䮖鞋ᮚ錻ꮔ釫\udb90魋䮗鱻쮞鞻뮒铻䮙鬛\ueb9e齻ᮙ顛ꮟ鏋X窘硿翨顶纘桵爘롰籸\u187f瞸ᡵ痘衸瀘䡷粨桼珘桶癈硸繈\ue87d癸ꡳ玘\uf87b狨\ud875熸㡴绸졽牸顱羘䡵睈硱粨ࡹ繸ࡽ秨\uf873煸衶窨⡰翘ࡴ疈硳甸\ud876籈\uf87f疘\ud87e熈롴秘䡱炘桱糨\ud87f畘\ua87c糘䡲碘䡲纨须笈\ue87d熘ࡿ焨硼癸롳羸\uf875籘塱\n䐎鹍䣎蹅䆾깁䭮ṉ䝮ๆ\u0010ﳹ麟﹉짽\uf589맰\uf089槴\uf6a9槹\uf879맷\uf3b9䧳\uf0b9㧴\n쌴\ua4ca쿴듂욄铆챔Ⓨ쁔㓁8ḃ쌕ᴓ茔ៃ䌒Ꮃ茚Დ\ue31dᵳ㌖έ⌖Ⴣꌐᰃጜᕳ댒ᰃ茜᷃⌟ႃ\uf31aᝣ錜ᝳ⌖ᲃ猔ΰ猐ᙃ쌛᠓⌝\u1af3\uf310ᝃ匓᭣̑ᰣ猞ᴃ⌕ᎃꌝᱳ팙ၣ댘ὃጜ\n룸梱됸碹뵈墽래\ue8b5뮘\uf8ba\u0010턂㋑\ud892鋕\udc62닞퇢䋛폒ዒ\ude32苙틒務\udc82닕\n艴\ue48b躴\uf483蟄풇贔撏脔璀".length();
      int var37 = 0;
      int var34 = var10001;
      String[] var35 = new String[9];
      String var33 = "#镛ᮟ鹋ﮒ阻ꮗ頫䮘闫讐颻\u0b98镋䮖鞋ᮚ錻ꮔ釫\udb90魋䮗鱻쮞鞻뮒铻䮙鬛\ueb9e齻ᮙ顛ꮟ鏋X窘硿翨顶纘桵爘롰籸\u187f瞸ᡵ痘衸瀘䡷粨桼珘桶癈硸繈\ue87d癸ꡳ玘\uf87b狨\ud875熸㡴绸졽牸顱羘䡵睈硱粨ࡹ繸ࡽ秨\uf873煸衶窨⡰翘ࡴ疈硳甸\ud876籈\uf87f疘\ud87e熈롴秘䡱炘桱糨\ud87f畘\ua87c糘䡲碘䡲纨须笈\ue87d熘ࡿ焨硼癸롳羸\uf875籘塱\n䐎鹍䣎蹅䆾깁䭮ṉ䝮ๆ\u0010ﳹ麟﹉짽\uf589맰\uf089槴\uf6a9槹\uf879맷\uf3b9䧳\uf0b9㧴\n쌴\ua4ca쿴듂욄铆챔Ⓨ쁔㓁8ḃ쌕ᴓ茔ៃ䌒Ꮃ茚Დ\ue31dᵳ㌖έ⌖Ⴣꌐᰃጜᕳ댒ᰃ茜᷃⌟ႃ\uf31aᝣ錜ᝳ⌖ᲃ猔ΰ猐ᙃ쌛᠓⌝\u1af3\uf310ᝃ匓᭣̑ᰣ猞ᴃ⌕ᎃꌝᱳ팙ၣ댘ὃጜ\n룸梱됸碹뵈墽래\ue8b5뮘\uf8ba\u0010턂㋑\ud892鋕\udc62닞퇢䋛폒ዒ\ude32苙틒務\udc82닕\n艴\ue48b躴\uf483蟄풇贔撏脔璀";

      do {
         char var39 = var33.charAt(var37);
         String var10000 = var33.substring(var37 + 1, var37 + 1 + var39);
         int var41 = 0;
         char[] var40 = var10000.toCharArray();

         do {
            char var42 = var40[var41];
            if (var41 % 2 == 0) {
               var40[var41] = (char)((var42 >>> 4 | var42 << 12) & '\uffff' ^ var38);
            } else {
               var40[var41] = (char)((var42 << 4 | var42 >>> 12) & '\uffff' ^ var38);
            }

            ++var41;
         } while(var41 < var40.length);

         var35[var36] = new String(var40);
         ++var36;
         var37 = var37 + var39 + 1;
      } while(var37 < var34);

      bab = var35;
      bba = new Object[var35.length];
      baa = new int[80];
      int var47 = 0;
      var10001 = 0;
      byte[] var10002 = "\u0084¼ÕÁoGr¶.®;$µb\u0015á~#5ÝÊ\u0093gô\u0093s³\u0089\u0000*=Þ\u008a<YïÓó?-\u0081^h'È-\u0010.\u001e\f¢vÕ¤\u0083\u0099SÜ¥\nÁÐìÍþÖÓ¤Q¤ùroH\u0003WY®\u0095íCèV\u001ar÷t¬yÅñ{\u001a:=Y\u001f\u0000ú\u0087\u0003å\u000b´\u009fÁüm\u0097\u0083;L¦¿¯2\u009dSROp²dé¥ê\u008dÖ=\u0081\u0012,\u0096ûè4P>\u0010§s\u009b\u00ad´w\u001bì÷Û:)\u0083e«³\u001b¥ÜS=þ\u0003Ï³\u0019\u0004\u009ew\u0091\u0007t¨9\u0003Ù\u001c\u0007t\u009eÔfJôn¢*?¹Â\u0086ênR\u0080æ\u009eõn¯Hr\u008b¿Ê\u009bÅZ\r\u008f¸ÊÛ<\\ù2Ï\u0092\u0089Þn\u008fB¾ð»\u001cw\u008e<zOûô`IÕy´[\u0088*RÆoÒ\u008cî\u007fú¤r\u0098ÄWFà8¾\u0006¥¹¿7\u001cÿé\u0017:äpI\u008aø\t~M4\u0099N\u0010\bØk@6b\u0091\u0087üt¸\u00146\u0098\u0087c\u0097øÌÅ7¡\u001fÊ\u008cÖÊ\u000b@à\"\u0013Eñ~\u008529ø".getBytes("ISO-8859-1");

      int var94;
      do {
         baa[var47] = ((var10002[var10001] & 255) << 24 | (var10002[var10001 + 1] & 255) << 16 | (var10002[var10001 + 2] & 255) << 8 | var10002[var10001 + 3] & 255) ^ -598396774;
         ++var47;
         var94 = var10001 + 4;
         var10001 += 4;
      } while(var94 < var10002.length);

      String[] var16 = new String[2];
      int var20 = 0;
      String var19;
      int var21 = (var19 = bba((short)-4557, (byte)-63, (short)22237, '喝', 1000182174, (char)1644)).length();
      int var18 = b(824036925, var43 ^ -904715771);
      int var17 = -1;

      while(true) {
         label133: {
            ++var17;
            char[] var53 = var19.substring(var17, var17 + var18).toCharArray();
            var94 = var53.length;
            int var22 = 0;
            var77 = var53;
            int var56 = var94;
            char[] var98;
            int var117;
            if (var94 <= 1) {
               var98 = var53;
               var117 = var22;
            } else {
               var77 = var53;
               var56 = var94;
               if (var94 <= var22) {
                  break label133;
               }

               var98 = var53;
               var117 = var22;
            }

            while(true) {
               char var127 = var98[var117];
               int var131;
               switch (var22 % b(824036924, var43 ^ 1498066012)) {
                  case 0 -> var131 = b(824036915, var43 ^ -748894017);
                  case 1 -> var131 = b(824036914, var43 ^ -1970033033);
                  case 2 -> var131 = b(824036913, var43 ^ -666961474);
                  case 3 -> var131 = b(824036912, var43 ^ -1857191533);
                  case 4 -> var131 = b(824036919, var43 ^ 1198273433);
                  case 5 -> var131 = b(824036918, var43 ^ -1933307265);
                  default -> var131 = b(824036917, var43 ^ 180106427);
               }

               var98[var117] = (char)(var127 ^ var131);
               ++var22;
               if (var56 == 0) {
                  var117 = var56;
                  var98 = var77;
               } else {
                  if (var56 <= var22) {
                     break;
                  }

                  var98 = var77;
                  var117 = var22;
               }
            }
         }

         String var105 = (new String(var77)).intern();
         var10001 = -1;
         var16[var20++] = var105;
         if ((var17 += var18) >= var21) {
            long var8 = 8245654720541976576L;
            long[] var14 = new long[b(824036916, var43 ^ -1733264011)];
            int var11 = 0;
            String var12;
            int var13 = (var12 = bba((short)-23061, (byte)57, (short)5127, '\ue542', 1000182175, (char)32304)).length();
            int var10 = 0;

            label114:
            while(true) {
               var10001 = var10;
               var10 += 8;
               byte[] var15 = var12.substring(var10001, var10).getBytes(bba((short)-5958, (byte)41, (short)-3092, (char)14020, 1000182172, (char)25638));
               long[] var48 = var14;
               var10001 = var11++;
               long var82 = ((long)var15[0] & 255L) << b(824036907, var43 ^ -1481227704) | ((long)var15[1] & 255L) << b(824036906, var43 ^ 147089623) | ((long)var15[2] & 255L) << b(824036905, var43 ^ 908628649) | ((long)var15[3] & 255L) << b(824036904, var43 ^ 13501466) | ((long)var15[4] & 255L) << b(824036911, var43 ^ 445171602) | ((long)var15[5] & 255L) << b(824036910, var43 ^ 731375085) | ((long)var15[b(824036909, var43 ^ 547709163)] & 255L) << b(824036908, var43 ^ 1130015938) | (long)var15[b(824036899, var43 ^ 1180723994)] & 255L;
               byte var106 = -1;

               while(true) {
                  long var119 = var82 ^ var8;
                  switch (var106) {
                     case 0:
                        var48[var10001] = var119;
                        if (var10 >= var13) {
                           aaa = var14;
                           aba = new Integer[b(824036889, var43 ^ 157188402)];
                           long var0 = 6166995566875466012L;
                           long[] var6 = new long[b(824036888, var43 ^ 721108004)];
                           int var3 = 0;
                           String var4;
                           int var5 = (var4 = bba((short)6597, (byte)78, (short)9283, '㉏', 1000182171, '鏭')).length();
                           int var2 = 0;

                           label104:
                           while(true) {
                              var10001 = var2;
                              var2 += 8;
                              byte[] var7 = var4.substring(var10001, var2).getBytes(bba((short)-16980, (byte)-81, (short)-18658, '鰤', 1000182168, '佯'));
                              var48 = var6;
                              var10001 = var3++;
                              var82 = ((long)var7[0] & 255L) << b(824036895, var43 ^ 779844911) | ((long)var7[1] & 255L) << b(824036894, var43 ^ -2107983854) | ((long)var7[2] & 255L) << b(824036893, var43 ^ 1019945681) | ((long)var7[3] & 255L) << b(824036892, var43 ^ -54738178) | ((long)var7[4] & 255L) << b(824036883, var43 ^ -1486660089) | ((long)var7[5] & 255L) << b(824036882, var43 ^ 1080299274) | ((long)var7[b(824036881, var43 ^ -932715260)] & 255L) << b(824036880, var43 ^ 1617119419) | (long)var7[b(824036887, var43 ^ 1578372989)] & 255L;
                              var106 = -1;

                              while(true) {
                                 var119 = var82 ^ var0;
                                 switch (var106) {
                                    case 0:
                                       var48[var10001] = var119;
                                       if (var2 >= var5) {
                                          bb = var6;
                                          a = new Long[b(824036877, var43 ^ -1762518949)];
                                          long var25 = baa(b(824036876, var43 ^ 938472128), 5240352293471212594L);
                                          long[] var31 = new long[3];
                                          int var28 = 0;
                                          String var29;
                                          int var30 = (var29 = var16[1]).length();
                                          int var27 = 0;

                                          do {
                                             var10001 = var27;
                                             var27 += 8;
                                             byte[] var32 = var29.substring(var10001, var27).getBytes(var16[0]);
                                             var10001 = var28++;
                                             var119 = (((long)var32[0] & baa(b(824036867, var43 ^ -1445229865), 4029143456371471972L)) << abb(b(824036866, var43 ^ -681781813), 7011293838759026588L) | ((long)var32[1] & baa(b(824036865, var43 ^ 1567296977), 5526887639752577299L)) << abb(b(824036864, var43 ^ -1944510481), 3465088787220421601L) | ((long)var32[2] & baa(b(824036871, var43 ^ 783630168), 5526887639752577299L)) << abb(b(824036870, var43 ^ -917643280), 5021932446377542424L) | ((long)var32[3] & baa(b(824036869, var43 ^ -647640594), 5526887639752577299L)) << abb(b(824036868, var43 ^ -1046153845), 5185599374932366613L) | ((long)var32[4] & baa(b(824036987, var43 ^ 1185403876), 5526887639752577299L)) << abb(b(824036986, var43 ^ 52877268), 7350536931295075465L) | ((long)var32[5] & baa(b(824036985, var43 ^ -1168079625), 5526887639752577299L)) << abb(b(824036984, var43 ^ 1669657504), 5453256092876338058L) | ((long)var32[abb(b(824036991, var43 ^ 744971970), 1437787639340763101L)] & baa(b(824036990, var43 ^ -341052247), 5526887639752577299L)) << abb(b(824036989, var43 ^ -1231611399), 5163104993666167930L) | (long)var32[abb(b(824036988, var43 ^ 425129568), 935931652600252627L)] & baa(b(824036979, var43 ^ 560142674), 5526887639752577299L)) ^ var25;
                                             var106 = -1;
                                             var31[var10001] = var119;
                                          } while(var27 < var30);

                                          abb = var31;
                                          ab = new Integer[3];
                                          long var23 = baa(b(824036978, var43 ^ -1297483964), 5493649150982729596L);
                                          var82 = baa(b(824036977, var43 ^ -989293265), 3173026556501594399L) ^ var23;
                                          var10001 = -1;
                                          aa = var82;
                                          aab = new String[1];
                                          a();
                                          return;
                                       }
                                       break;
                                    default:
                                       var48[var10001] = var119;
                                       if (var2 < var5) {
                                          continue label104;
                                       }

                                       var5 = (var4 = bba((short)27069, (byte)-35, (short)-32155, (char)'躯', 1000182169, 'ᨔ')).length();
                                       var2 = 0;
                                 }

                                 var10001 = var2;
                                 var2 += 8;
                                 var7 = var4.substring(var10001, var2).getBytes(bba((short)-1149, (byte)-91, (short)16892, '㑌', 1000182166, (char)'鑦'));
                                 var48 = var6;
                                 var10001 = var3++;
                                 var82 = ((long)var7[0] & 255L) << b(824036886, var43 ^ 1059743167) | ((long)var7[1] & 255L) << b(824036885, var43 ^ -78991837) | ((long)var7[2] & 255L) << b(824036884, var43 ^ -1679393875) | ((long)var7[3] & 255L) << b(824036875, var43 ^ 199259978) | ((long)var7[4] & 255L) << b(824036874, var43 ^ -1408352539) | ((long)var7[5] & 255L) << b(824036873, var43 ^ 736833196) | ((long)var7[b(824036872, var43 ^ -1029321800)] & 255L) << b(824036879, var43 ^ -690463901) | (long)var7[b(824036878, var43 ^ 1698457730)] & 255L;
                                 var106 = 0;
                              }
                           }
                        }
                        break;
                     default:
                        var48[var10001] = var119;
                        if (var10 < var13) {
                           continue label114;
                        }

                        var13 = (var12 = bba((short)-16701, (byte)52, (short)-19645, '鵕', 1000182173, 'ꈂ')).length();
                        var10 = 0;
                  }

                  var10001 = var10;
                  var10 += 8;
                  var15 = var12.substring(var10001, var10).getBytes(bba((short)-30822, (byte)-36, (short)-30795, '߲', 1000182170, (char)6633));
                  var48 = var14;
                  var10001 = var11++;
                  var82 = ((long)var15[0] & 255L) << b(824036898, var43 ^ 1518705233) | ((long)var15[1] & 255L) << b(824036897, var43 ^ -962499133) | ((long)var15[2] & 255L) << b(824036896, var43 ^ -823940421) | ((long)var15[3] & 255L) << b(824036903, var43 ^ -2146614) | ((long)var15[4] & 255L) << b(824036902, var43 ^ -1003240498) | ((long)var15[5] & 255L) << b(824036901, var43 ^ 701691299) | ((long)var15[b(824036900, var43 ^ -58057649)] & 255L) << b(824036891, var43 ^ 1692500864) | (long)var15[b(824036890, var43 ^ -811894384)] & 255L;
                  var106 = 0;
               }
            }
         }

         var18 = var19.charAt(var17);
      }
   }

   public String aba() {
      return (String)this.abbb();
   }

   private static int b(int var0, int var1) {
      int var2 = baa[var0 ^ 824036923] ^ var1 ^ var0;
      var2 -= 16278;
      var2 += 19986;
      var2 -= 6584;
      var2 -= 45805;
      var2 ^= 25245;
      var2 -= 50811;
      var2 += 63177;
      var2 += 42876;
      var2 += 46128;
      var2 ^= 47533;
      return var2;
   }

   private static int abb(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ b(824036976, 1509083399 ^ -1905113595);
      if (aba[var3] == null) {
         aba[var3] = (int)(aaa[var3] ^ var1);
      }

      return aba[var3];
   }

   private static long baa(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ b(824036983, 35295100 ^ -635353101)) & b(824036982, 35295100 ^ -468547748);
      if (a[var3] == null) {
         a[var3] = bb[var3] ^ var1;
      }

      return a[var3];
   }

   public void bab(JsonElement var1) {
   }

   private static void a() {
      aab[0] = ba("".toCharArray(), aa, aa(abb(b(824036981, -658888948 ^ -649561169), 8464859625955229633L), baa(b(824036980, -658888948 ^ 1329539620), 8371797155266442842L)));
   }
}
