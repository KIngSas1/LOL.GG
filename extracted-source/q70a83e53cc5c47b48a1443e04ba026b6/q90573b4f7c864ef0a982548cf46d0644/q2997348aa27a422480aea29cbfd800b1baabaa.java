package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import java.awt.Color;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public final class q2997348aa27a422480aea29cbfd800b1baabaa {
   private static final long[] aa;
   private static final double a = 0.0027;
   private static final Integer[] ab;
   private static final Object[] bab;
   private static final String[] baa;
   private static final int[] abb;
   private static final double ba = 1.6E-4;
   private static final long[] b;
   private static final long[] bb;
   private static final Long[] aaa;
   private static final Integer[] aab;
   private static final double aba = 0.0042;

   public static Color aa(Color var0, q2997348aa27a422480aea29cbfd800b1abaaaab var1, double var2) {
      return ba(var0, var1, var2 + 0.19);
   }

   private static int b(int var0, int var1) {
      int var2 = abb[var0 ^ -370917259] ^ var1 ^ var0;
      var2 ^= 17234;
      var2 += 30163;
      var2 -= 3159;
      var2 += 22847;
      var2 ^= 51933;
      var2 -= 13075;
      var2 += 3200;
      var2 += 57072;
      return var2;
   }

   public static Color ab(Color var0, double var1) {
      int var3 = q2997348aa27a422480aea29cbfd800b1bbabab.aaab;

      Color var10000;
      label26: {
         label25: {
            try {
               try {
                  var10000 = var0;
                  if (var3 != 0) {
                     break label26;
                  }

                  if (var0 == null) {
                     break label25;
                  }
               } catch (IllegalStateException var5) {
                  throw var5;
               }
            } catch (MatchException var6) {
               throw var6;
            }

            var10000 = var0;
            break label26;
         }

         var10000 = Color.WHITE;
      }

      Color var4 = var10000;
      return aaa(var4, (int)Math.round((double)var4.getAlpha() * Math.max((double)0.0F, var1)));
   }

   private static String aabb(char var0, char var1, int var2) {
      int var3 = var0 ^ '鋷';
      char[] var4 = baa[var3].toCharArray();
      StackTraceElement[] var5 = (StackTraceElement[])bab[var3];
      StackTraceElement[] var6;
      if (var5 != null) {
         var6 = var5;
      } else {
         var6 = (new Throwable()).getStackTrace();
         bab[var3] = var6;
      }

      StackTraceElement var7 = var6[1];
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 23179;
      int var9 = 0;

      do {
         int var10 = var4[var9] - 1336;
         var10 -= 64390;
         var10 += 6861;
         var10 -= 16860;
         var10 ^= 46639;
         var10 ^= 6112;
         var10 -= 65432;
         var10 ^= 17428;
         var10 -= 26060;
         var10 += 55433;
         var4[var9] = (char)(var10 ^ var8 ^ var1 ^ var2 >> 16);
         ++var9;
      } while(var9 < var4.length);

      return (new String(var4)).intern();
   }

   private q2997348aa27a422480aea29cbfd800b1baabaa() {
   }

   public static Color ba(Color param0, q2997348aa27a422480aea29cbfd800b1abaaaab param1, double param2) {
      // $FF: Couldn't be decompiled
   }

   public static Color bb(Color var0, double var1) {
      int var3 = q2997348aa27a422480aea29cbfd800b1bbabab.aaab;

      Color var10000;
      label26: {
         label25: {
            try {
               try {
                  var10000 = var0;
                  if (var3 != 0) {
                     break label26;
                  }

                  if (var0 == null) {
                     break label25;
                  }
               } catch (IllegalStateException var5) {
                  throw var5;
               }
            } catch (MatchException var6) {
               throw var6;
            }

            var10000 = var0;
            break label26;
         }

         var10000 = Color.WHITE;
      }

      Color var4 = var10000;
      return new Color(baa((int)Math.round((double)var4.getRed() * var1)), baa((int)Math.round((double)var4.getGreen() * var1)), baa((int)Math.round((double)var4.getBlue() * var1)), var4.getAlpha());
   }

   public static Color aaa(Color var0, int var1) {
      int var2 = q2997348aa27a422480aea29cbfd800b1bbabab.aaab;

      Color var10000;
      label26: {
         label25: {
            try {
               try {
                  var10000 = var0;
                  if (var2 != 0) {
                     break label26;
                  }

                  if (var0 == null) {
                     break label25;
                  }
               } catch (IllegalStateException var4) {
                  throw var4;
               }
            } catch (MatchException var5) {
               throw var5;
            }

            var10000 = var0;
            break label26;
         }

         var10000 = Color.WHITE;
      }

      Color var3 = var10000;
      return new Color(var3.getRed(), var3.getGreen(), var3.getBlue(), baa(var1));
   }

   private static Color aab(Color var0, double var1, int var3) {
      int var10 = 995020920;
      double var4 = (double)System.currentTimeMillis() * 0.0027 + var1 * 2.2;
      Color var6 = aaa(new Color(bba(aaaa(b(-370917332, var10 ^ -1045819008), 4315006440185016539L), bbb(b(-370917329, var10 ^ 1349812007), 8722318615217911804L)), bba(aaaa(b(-370917330, var10 ^ -2028616493), 2553704924552406392L), bbb(b(-370917335, var10 ^ 1289861701), 149745620289899586L)), bba(aaaa(b(-370917336, var10 ^ -233757915), 6708836099116004858L), bbb(b(-370917333, var10 ^ -1602826090), 1404408523913822067L))), var3);
      Color var7 = aaa(new Color(bba(aaaa(b(-370917334, var10 ^ -453055377), 2595310745996117258L), bbb(b(-370917355, var10 ^ 53778055), 488890450715763351L)), bba(aaaa(b(-370917356, var10 ^ -1587821567), 4718080304093523628L), bbb(b(-370917353, var10 ^ 1600742331), 2563251690598414368L)), bba(aaaa(b(-370917354, var10 ^ -1753368727), 6708836099116004858L), bbb(b(-370917359, var10 ^ 2038221444), 1404408523913822067L))), var3);
      Color var8 = aaa(bb(var0, 1.18), var3);
      Color var9 = a(var6, var7, (double)0.5F + (double)0.5F * Math.sin(var4));
      return aaa(a(var8, var9, 0.42 + 0.28 * Math.cos(var4 * 0.7)), var3);
   }

   private static Color aba(Color var0, double var1, int var3) {
      double var4 = bab(var1);
      Color var6 = bb(var0, 0.72);
      Color var7 = bb(var0, 1.28);
      return aaa(a(var6, var7, var4), var3);
   }

   private static Color abb(double var0, int var2) {
      float var3 = (float)(((double)System.currentTimeMillis() * 1.6E-4 + var0 * 0.173) % (double)1.0F);
      return aaba(var3, 0.78F, 1.0F, var2);
   }

   static {
      int var41 = 106322510;
      short var36 = 19816;
      String[] var10000 = new String[10];
      int var34 = 0;
      String[] var33 = var10000;
      int var35 = 0;
      int var32 = ";\ud8d6潞㙣辌쎐绐इｘ쀂⾎쟐鼙\ud896齘쀂\udf83쇰㼚쿖轔ॳ뾏쨠＂धຯ잒ﾇ썰\udf15\ud966\uef42윂\uef8e㘁\uef14윖潛챲侂쁠뼕쩆\ueeaf쟲侎쀀⼘\udb16ཛ쒂辔연Ἔ\ud896㽝쟢쾈섰\u001b鍸\uf172邜燘餮ņ\ue818\uf106騼ᇚ鸾慎駘\ue10d镜㇔鵮ŉ麈脊龌ᇞ鋮ㅟ駨섊齌Ð―貹⍱뱨\u20f3糵⫵ﲢ⒑Ⱡ⟃곽⑅Ჷ∡ﱣᘳೳ␅粼➱\uec6d⾃볽ⓕ費∱鱬\u2433㳻㢥岼⼑汩ᘣ\u0ccf⨕Ჸ➱鱡⾃Ჰᘅ벴␡籯ⓣ沰⇵岶殁챩↓峺\u2ef5䲢⋡\udc69⇓\u2cf6≵Ⲹᙑ鱩⋃곹ⱅ䲻㯁\udc6c⒳쳴㣅겵⒑뱭⇃\udcf8㭕겹ᘡ汵⹓곸⇅峱␡尤Ⱃ\udcfdⲵﲹⱁ豶\u20f3㳵⎕油ⱱ\uec6a⩓泾\u2065겴❱\udc68≃\uece1ⲵﲴ⏡簤 ﳻ\u2ef5벷⏱ﱢₓ\uecf7⺵貴ⓡ찤ⱃ峺㪅\udca2⟡\u0c5b⨳ﳡ栥ﳰ椑谥ⵃ糾ↅ岣⾑뱬槃첰⎅Ⲹ⼁\udc63‣볏▅첾㪑\uec6c⋓泽✵벺ⷱ\uec6fᘓೢⳅⲹ₡㱬ⶃ鳵▕첾㭡ﱬ❓峵Ⱅ겹⊱豩ᙳ峣┥岶\u20c1谥椃ﳢ⽕貏┱ﱨ⾃㳳⊵沿⅁ⱬ㫃\udcf8⽅벾楁ﱩ⊳糹⫕費ⲁ㱭\n䞳㫛䔗騃䝕쪞䓳嫟乷\uda09\u0010뜼ҫ㕉䑸믪啠발㔿됈痲댺敢끜꒬늸둆\n㬒ᮡ▶뭭\u2e74\uebf7⻒﮷⁖筮X\uf183廓\uf167\udabdﱥ먪痗仒\uf387㸸䢁稥Ｓꩿﴧ窽䮡纮\uf063\uea68\ufe67ꪫ\uf0b5ᨠ䬧\udeec\uf3d7⪽甁訣片ᩦ\uf157ꪽ﵅먤䀘⩦\uf057\ueab0䤑娥牗穤䢓媰ﵥﺑ痗멠\uf7d7몲畑\uda24症㻫\uf147몷﹥\uda27ﲃ੭ｗ\udabc\uf6f5ﺑ男橯瑣쪽\uf1a5꺬\uf413쩩ﱇ縹\uf185ẫ﵃婯産踸䣡Ẓ\uf383褐\uf047⪫\n䡴緒䡐嵀\u0092ෙ4鶚ධᵍ\u0010橄뷾篐鴩惢䶢擄淾氐洫嚂\uedbc攄淴汀ᴭ\n㣡梡㭅졬 飹↡ࢸ℥衪".length();
      String var31 = ";\ud8d6潞㙣辌쎐绐इｘ쀂⾎쟐鼙\ud896齘쀂\udf83쇰㼚쿖轔ॳ뾏쨠＂धຯ잒ﾇ썰\udf15\ud966\uef42윂\uef8e㘁\uef14윖潛챲侂쁠뼕쩆\ueeaf쟲侎쀀⼘\udb16ཛ쒂辔연Ἔ\ud896㽝쟢쾈섰\u001b鍸\uf172邜燘餮ņ\ue818\uf106騼ᇚ鸾慎駘\ue10d镜㇔鵮ŉ麈脊龌ᇞ鋮ㅟ駨섊齌Ð―貹⍱뱨\u20f3糵⫵ﲢ⒑Ⱡ⟃곽⑅Ჷ∡ﱣᘳೳ␅粼➱\uec6d⾃볽ⓕ費∱鱬\u2433㳻㢥岼⼑汩ᘣ\u0ccf⨕Ჸ➱鱡⾃Ჰᘅ벴␡籯ⓣ沰⇵岶殁챩↓峺\u2ef5䲢⋡\udc69⇓\u2cf6≵Ⲹᙑ鱩⋃곹ⱅ䲻㯁\udc6c⒳쳴㣅겵⒑뱭⇃\udcf8㭕겹ᘡ汵⹓곸⇅峱␡尤Ⱃ\udcfdⲵﲹⱁ豶\u20f3㳵⎕油ⱱ\uec6a⩓泾\u2065겴❱\udc68≃\uece1ⲵﲴ⏡簤 ﳻ\u2ef5벷⏱ﱢₓ\uecf7⺵貴ⓡ찤ⱃ峺㪅\udca2⟡\u0c5b⨳ﳡ栥ﳰ椑谥ⵃ糾ↅ岣⾑뱬槃첰⎅Ⲹ⼁\udc63‣볏▅첾㪑\uec6c⋓泽✵벺ⷱ\uec6fᘓೢⳅⲹ₡㱬ⶃ鳵▕첾㭡ﱬ❓峵Ⱅ겹⊱豩ᙳ峣┥岶\u20c1谥椃ﳢ⽕貏┱ﱨ⾃㳳⊵沿⅁ⱬ㫃\udcf8⽅벾楁ﱩ⊳糹⫕費ⲁ㱭\n䞳㫛䔗騃䝕쪞䓳嫟乷\uda09\u0010뜼ҫ㕉䑸믪啠발㔿됈痲댺敢끜꒬늸둆\n㬒ᮡ▶뭭\u2e74\uebf7⻒﮷⁖筮X\uf183廓\uf167\udabdﱥ먪痗仒\uf387㸸䢁稥Ｓꩿﴧ窽䮡纮\uf063\uea68\ufe67ꪫ\uf0b5ᨠ䬧\udeec\uf3d7⪽甁訣片ᩦ\uf157ꪽ﵅먤䀘⩦\uf057\ueab0䤑娥牗穤䢓媰ﵥﺑ痗멠\uf7d7몲畑\uda24症㻫\uf147몷﹥\uda27ﲃ੭ｗ\udabc\uf6f5ﺑ男橯瑣쪽\uf1a5꺬\uf413쩩ﱇ縹\uf185ẫ﵃婯産踸䣡Ẓ\uf383褐\uf047⪫\n䡴緒䡐嵀\u0092ෙ4鶚ධᵍ\u0010橄뷾篐鴩惢䶢擄淾氐洫嚂\uedbc攄淴汀ᴭ\n㣡梡㭅졬 飹↡ࢸ℥衪";

      do {
         char var37 = var31.charAt(var35);
         int var10001 = var35 + 1;
         int var10002 = var35 + 1;
         int var39 = 0;
         char[] var38 = var31.substring(var10001, var10002 + var37).toCharArray();

         do {
            int var40 = var38[var39];
            short var48;
            switch (var39 % 6) {
               case 0:
               default:
                  var48 = 233;
                  break;
               case 1:
                  var48 = 153;
                  break;
               case 2:
                  var48 = 237;
                  break;
               case 3:
                  var48 = 77;
                  break;
               case 4:
                  var48 = 159;
                  break;
               case 5:
                  var48 = 217;
            }

            var40 = (char)var48 ^ var40;
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

      baa = var33;
      bab = new Object[var33.length];
      int var49 = 0;
      int var55 = 0;
      abb = new int[124];
      byte[] var76 = "N\u0084þª\u001dr:N\u001eÍ-¾¶iç\u007f*tÃ¡ÉxÔ|\u0005æ<\u0014Ô¬\u0084uQGºÔÅPf\u0090îN\u0002æt|{FÈ\u008d\u000f\u008c\u0012q\u0011p±)Þ1Ç\u0018\u0007\u009eoK\u0095,\u0005\u009dü!'îï±\u0010*z\u0001¨\u0018\u0005tóÜ°\u0083Å*ä»þ±áî*Ç\u0096tEäÚFUS¹Ý<!õ2ß\u0011ôH\u008dÑ4\u0094R\u001dé,Ô\u001aÛÌ\u0005\u0083\u0015õ¢È\u0007\u0080\u0086¾\u0014¨«\"toñ\u0095\u0012\u0085DÝó×Iê\tÇÊ6Ò ¥\u008b¨\u008cöÃÒüßµî\u0099\u001f\"Ù\u0095gå\u001a\u0096\u009eÐ`!\u009fØ\u00ad°ã:\u00893iz¡¬Ý\u008f\u009cµ\u009e«Ã\u000bÉ\u0087 qx\u0099â\u0010#oîß¼E\u0000\u0013Ìu\u001d\u000e«s\\\u001aå=ü¾7\u008eêÐHêª«\u0095¤CÈE«¢\u0096üâ»àáÉªrQÂû?|7\u0012¶Á'\u0094A3\u009eH\u0011x\u008e/¤\u0016ï\u0082\u008e\u0012è*\u008a\u0017\u0017P¬<\u0097FØÝká\u0099åÑ#\u0005{¬c\u0093øE@\u009b[\u000b©\u0000\u0083\"Â£i\u0015\u0096\u0086\u0089\u001dk¸¶BxÃvNÞ¶è©Ã\u0012Ã¡y¦\\\u007f\u0010cß«¿INW\u0001\u0016=\u000eSlÃ<\u0093DRâî~\u0085\u0083húNwGíð\u0087þ\u0086¢à<Cæháå\u0001¢¨Ç£Í\u0010É]ÿÄ\u0088\u0095ëjô{ê&k\u000e\u0086cÆÁ\u009aòT\u0005ÊÂ\u0002iÅÊ\u001d4\u0013ö¯âÚÙ)¼´ç\u0000\u0086À\u0090w¤\u008cªó_\u0005rÃÂ[R\u0081Ê0ê·V³Ö»}¤\u000b|a\u009b\u0098ä\u0013\u0097F;<\u009f¨\u0000ä\\_.ã\b{ur\u0089\u009b]Ù\u009eo+-\u0095éæÈF#Ó".getBytes("ISO-8859-1");

      int var104;
      do {
         abb[var49] = ((var76[var55] & 255) << 24 | (var76[var55 + 1] & 255) << 16 | (var76[var55 + 2] & 255) << 8 | var76[var55 + 3] & 255) ^ 801280945;
         ++var49;
         var104 = var55 + 4;
         var55 += 4;
      } while(var104 < var76.length);

      String[] var16 = new String[4];
      int var20 = 0;
      String var19;
      int var21 = (var19 = aabb('鋷', '㲐', var41 ^ 1186954353)).length();
      int var18 = b(-370917257, var41 ^ 558050615);
      int var45 = -1;

      label166:
      while(true) {
         ++var45;
         String var50 = var19.substring(var45, var45 + var18);
         var55 = -1;

         while(true) {
            label161: {
               char[] var60 = var50.toCharArray();
               var104 = var60.length;
               int var22 = 0;
               var85 = var60;
               int var63 = var104;
               char[] var108;
               int var128;
               if (var104 <= 1) {
                  var108 = var60;
                  var128 = var22;
               } else {
                  var85 = var60;
                  var63 = var104;
                  if (var104 <= var22) {
                     break label161;
                  }

                  var108 = var60;
                  var128 = var22;
               }

               while(true) {
                  char var139 = var108[var128];
                  int var143;
                  switch (var22 % b(-370917263, var41 ^ 368755649)) {
                     case 0 -> var143 = b(-370917264, var41 ^ -151593294);
                     case 1 -> var143 = b(-370917261, var41 ^ 979909753);
                     case 2 -> var143 = b(-370917262, var41 ^ -350059301);
                     case 3 -> var143 = b(-370917251, var41 ^ 1858714245);
                     case 4 -> var143 = b(-370917252, var41 ^ -86087958);
                     case 5 -> var143 = b(-370917249, var41 ^ -775945615);
                     default -> var143 = b(-370917250, var41 ^ 1274180021);
                  }

                  var108[var128] = (char)(var139 ^ var143);
                  ++var22;
                  if (var63 == 0) {
                     var128 = var63;
                     var108 = var85;
                  } else {
                     if (var63 <= var22) {
                        break;
                     }

                     var108 = var85;
                     var128 = var22;
                  }
               }
            }

            String var115 = (new String(var85)).intern();
            switch (var55) {
               case 0:
                  var16[var20++] = var115;
                  if ((var45 += var18) >= var21) {
                     long var8 = 76177200678716614L;
                     long[] var14 = new long[b(-370917255, var41 ^ -150794241)];
                     int var11 = 0;
                     String var12;
                     int var13 = (var12 = aabb('鋵', 'ڻ', var41 ^ 1448757666)).length();
                     int var10 = 0;

                     label137:
                     while(true) {
                        var55 = var10;
                        var10 += 8;
                        byte[] var15 = var12.substring(var55, var10).getBytes(aabb('鋴', '퐳', var41 ^ -428260223));
                        long[] var52 = var14;
                        var55 = var11++;
                        long var90 = ((long)var15[0] & 255L) << b(-370917256, var41 ^ 771690990) | ((long)var15[1] & 255L) << b(-370917253, var41 ^ -1901601100) | ((long)var15[2] & 255L) << b(-370917254, var41 ^ -124385518) | ((long)var15[3] & 255L) << b(-370917275, var41 ^ 1355126151) | ((long)var15[4] & 255L) << b(-370917276, var41 ^ 974388291) | ((long)var15[5] & 255L) << b(-370917273, var41 ^ 409006024) | ((long)var15[b(-370917274, var41 ^ 799308403)] & 255L) << b(-370917279, var41 ^ -1751775997) | (long)var15[b(-370917280, var41 ^ -866995982)] & 255L;
                        byte var116 = -1;

                        while(true) {
                           long var130 = var90 ^ var8;
                           switch (var116) {
                              case 0:
                                 var52[var55] = var130;
                                 if (var10 >= var13) {
                                    aa = var14;
                                    aab = new Integer[b(-370917270, var41 ^ -342565972)];
                                    long var0 = 5147756946783739752L;
                                    long[] var6 = new long[b(-370917291, var41 ^ 973936063)];
                                    int var3 = 0;
                                    String var4;
                                    int var5 = (var4 = aabb('鋱', '\uef07', var41 ^ -1739191039)).length();
                                    int var2 = 0;

                                    label127:
                                    while(true) {
                                       var55 = var2;
                                       var2 += 8;
                                       byte[] var7 = var4.substring(var55, var2).getBytes(aabb('鋰', '阇', var41 ^ 814294634));
                                       var52 = var6;
                                       var55 = var3++;
                                       var90 = ((long)var7[0] & 255L) << b(-370917292, var41 ^ -1656355022) | ((long)var7[1] & 255L) << b(-370917289, var41 ^ -1188031487) | ((long)var7[2] & 255L) << b(-370917290, var41 ^ -1800637233) | ((long)var7[3] & 255L) << b(-370917295, var41 ^ -837086694) | ((long)var7[4] & 255L) << b(-370917296, var41 ^ 2069099393) | ((long)var7[5] & 255L) << b(-370917293, var41 ^ 1986267530) | ((long)var7[b(-370917294, var41 ^ -172436762)] & 255L) << b(-370917283, var41 ^ -1710905145) | (long)var7[b(-370917284, var41 ^ -917646671)] & 255L;
                                       var116 = -1;

                                       while(true) {
                                          var130 = var90 ^ var0;
                                          switch (var116) {
                                             case 0:
                                                var52[var55] = var130;
                                                if (var2 >= var5) {
                                                   bb = var6;
                                                   aaa = new Long[b(-370917306, var41 ^ -167174104)];
                                                   long var23 = bbb(b(-370917311, var41 ^ 1192735062), 6371956862902038072L);
                                                   long[] var29 = new long[aaaa(b(-370917312, var41 ^ 484543384), 4493073782754199958L)];
                                                   int var26 = 0;
                                                   String var27;
                                                   int var28 = (var27 = var16[0]).length();
                                                   int var25 = 0;

                                                   label117:
                                                   while(true) {
                                                      var55 = var25;
                                                      var25 += 8;
                                                      byte[] var30 = var27.substring(var55, var25).getBytes(var16[1]);
                                                      var52 = var29;
                                                      var55 = var26++;
                                                      var90 = ((long)var30[0] & bbb(b(-370917309, var41 ^ -2083824732), 4556673871375889929L)) << aaaa(b(-370917310, var41 ^ -201630449), 4541333742426163018L) | ((long)var30[1] & bbb(b(-370917299, var41 ^ -1795349742), 4085593100161567731L)) << aaaa(b(-370917300, var41 ^ -625768801), 2321936480388532878L) | ((long)var30[2] & bbb(b(-370917297, var41 ^ 134256090), 4085593100161567731L)) << aaaa(b(-370917298, var41 ^ 2003097675), 520473354885550159L) | ((long)var30[3] & bbb(b(-370917303, var41 ^ -1440072508), 4085593100161567731L)) << aaaa(b(-370917304, var41 ^ 2049309187), 7119380810546045145L) | ((long)var30[4] & bbb(b(-370917301, var41 ^ -1016281874), 4085593100161567731L)) << aaaa(b(-370917302, var41 ^ -565723135), 7148450324259002735L) | ((long)var30[5] & bbb(b(-370917323, var41 ^ 1850508367), 4085593100161567731L)) << aaaa(b(-370917324, var41 ^ 1136213301), 2269683298790940137L) | ((long)var30[aaaa(b(-370917321, var41 ^ -22420678), 1513031791588162052L)] & bbb(b(-370917322, var41 ^ 202389346), 4085593100161567731L)) << aaaa(b(-370917327, var41 ^ 1191201009), 4747730148120676910L) | (long)var30[aaaa(b(-370917328, var41 ^ 694261829), 279021781348002471L)] & bbb(b(-370917325, var41 ^ 761681404), 4085593100161567731L);
                                                      var116 = -1;

                                                      while(true) {
                                                         var130 = var90 ^ var23;
                                                         switch (var116) {
                                                            case 0:
                                                               var52[var55] = var130;
                                                               if (var25 >= var28) {
                                                                  b = var29;
                                                                  ab = new Integer[aaaa(b(-370917331, var41 ^ 41956389), 4747730148120676910L)];
                                                                  return;
                                                               }
                                                               break;
                                                            default:
                                                               var52[var55] = var130;
                                                               if (var25 < var28) {
                                                                  continue label117;
                                                               }

                                                               var28 = (var27 = var16[2]).length();
                                                               var25 = 0;
                                                         }

                                                         var55 = var25;
                                                         var25 += 8;
                                                         var30 = var27.substring(var55, var25).getBytes(var16[3]);
                                                         var52 = var29;
                                                         var55 = var26++;
                                                         var90 = ((long)var30[0] & bbb(b(-370917326, var41 ^ 681127899), 4085593100161567731L)) << aaaa(b(-370917315, var41 ^ 51997969), 3809623787453325223L) | ((long)var30[1] & bbb(b(-370917316, var41 ^ -488268064), 4085593100161567731L)) << aaaa(b(-370917313, var41 ^ -631270327), 5302658411619613245L) | ((long)var30[2] & bbb(b(-370917314, var41 ^ 1143086312), 4085593100161567731L)) << aaaa(b(-370917319, var41 ^ -942970683), 685952973322886956L) | ((long)var30[3] & bbb(b(-370917320, var41 ^ 1686492797), 4085593100161567731L)) << aaaa(b(-370917317, var41 ^ -1129514719), 6308486558062152190L) | ((long)var30[4] & bbb(b(-370917318, var41 ^ 1453058553), 4085593100161567731L)) << aaaa(b(-370917339, var41 ^ -1231820054), 3897562645466268728L) | ((long)var30[5] & bbb(b(-370917340, var41 ^ -1983117406), 4085593100161567731L)) << aaaa(b(-370917337, var41 ^ 1237366640), 4482935828420156837L) | ((long)var30[aaaa(b(-370917338, var41 ^ -685273887), 3719484090468271068L)] & bbb(b(-370917343, var41 ^ -64026942), 4085593100161567731L)) << aaaa(b(-370917344, var41 ^ 1676769063), 4747730148120676910L) | (long)var30[aaaa(b(-370917341, var41 ^ -534407902), 7359396444344719698L)] & bbb(b(-370917342, var41 ^ 1910079089), 4085593100161567731L);
                                                         var116 = 0;
                                                      }
                                                   }
                                                }
                                                break;
                                             default:
                                                var52[var55] = var130;
                                                if (var2 < var5) {
                                                   continue label127;
                                                }

                                                var5 = (var4 = aabb('鋿', '橦', var41 ^ -958640302)).length();
                                                var2 = 0;
                                          }

                                          var55 = var2;
                                          var2 += 8;
                                          var7 = var4.substring(var55, var2).getBytes(aabb('鋾', '\uedcd', var41 ^ -38651649));
                                          var52 = var6;
                                          var55 = var3++;
                                          var90 = ((long)var7[0] & 255L) << b(-370917281, var41 ^ -532943328) | ((long)var7[1] & 255L) << b(-370917282, var41 ^ 548198709) | ((long)var7[2] & 255L) << b(-370917287, var41 ^ 1483414073) | ((long)var7[3] & 255L) << b(-370917288, var41 ^ -1587650377) | ((long)var7[4] & 255L) << b(-370917285, var41 ^ -1604932115) | ((long)var7[5] & 255L) << b(-370917286, var41 ^ -592148105) | ((long)var7[b(-370917307, var41 ^ 1458872829)] & 255L) << b(-370917308, var41 ^ -503210777) | (long)var7[b(-370917305, var41 ^ -1591360675)] & 255L;
                                          var116 = 0;
                                       }
                                    }
                                 }
                                 break;
                              default:
                                 var52[var55] = var130;
                                 if (var10 < var13) {
                                    continue label137;
                                 }

                                 var13 = (var12 = aabb('鋳', 'ཡ', var41 ^ -737596236)).length();
                                 var10 = 0;
                           }

                           var55 = var10;
                           var10 += 8;
                           var15 = var12.substring(var55, var10).getBytes(aabb('鋲', '쿀', var41 ^ -810787270));
                           var52 = var14;
                           var55 = var11++;
                           var90 = ((long)var15[0] & 255L) << b(-370917277, var41 ^ -89856962) | ((long)var15[1] & 255L) << b(-370917278, var41 ^ -1052778126) | ((long)var15[2] & 255L) << b(-370917267, var41 ^ 357144303) | ((long)var15[3] & 255L) << b(-370917268, var41 ^ 2053823204) | ((long)var15[4] & 255L) << b(-370917265, var41 ^ 1792915892) | ((long)var15[5] & 255L) << b(-370917266, var41 ^ 61863234) | ((long)var15[b(-370917271, var41 ^ -526388171)] & 255L) << b(-370917272, var41 ^ -1302383382) | (long)var15[b(-370917269, var41 ^ 1838410070)] & 255L;
                           var116 = 0;
                        }
                     }
                  }

                  var18 = var19.charAt(var45);
                  break;
               default:
                  var16[var20++] = var115;
                  if ((var45 += var18) < var21) {
                     var18 = var19.charAt(var45);
                     continue label166;
                  }

                  var21 = (var19 = aabb('鋶', '拮', var41 ^ -77523335)).length();
                  var18 = b(-370917258, var41 ^ -1981290729);
                  var45 = -1;
            }

            ++var45;
            var50 = var19.substring(var45, var45 + var18);
            var55 = 0;
         }
      }
   }

   private static int baa(int var0) {
      return Math.max(0, Math.min(bba(aaaa(b(-370917360, -1721844088 ^ -1375678291), 6708836099116004858L), bbb(b(-370917357, -1721844088 ^ 1629253705), 1404408523913822067L)), var0));
   }

   public static double bab(double var0) {
      return (double)0.5F + (double)0.5F * Math.sin((double)System.currentTimeMillis() * 0.0042 + var0 * (double)5.0F);
   }

   private static int bba(int param0, long param1) {
      // $FF: Couldn't be decompiled
   }

   private static long bbb(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ b(-370917348, 1286378658 ^ 1097280928)) & b(-370917345, 1286378658 ^ -1750165581);
      if (aaa[var3] == null) {
         aaa[var3] = bb[var3] ^ var1;
      }

      return aaa[var3];
   }

   public static Color a(Color var0, Color var1, double var2) {
      int var4 = q2997348aa27a422480aea29cbfd800b1bbabab.aaab;

      Color var10000;
      label49: {
         label48: {
            try {
               try {
                  var10000 = var0;
                  if (var4 != 0) {
                     break label49;
                  }

                  if (var0 == null) {
                     break label48;
                  }
               } catch (IllegalStateException var11) {
                  throw var11;
               }
            } catch (MatchException var12) {
               throw var12;
            }

            var10000 = var0;
            break label49;
         }

         var10000 = Color.WHITE;
      }

      Color var5 = var10000;

      label38: {
         label37: {
            try {
               try {
                  var10000 = var1;
                  if (var4 != 0) {
                     break label38;
                  }

                  if (var1 == null) {
                     break label37;
                  }
               } catch (IllegalStateException var9) {
                  throw var9;
               }
            } catch (MatchException var10) {
               throw var10;
            }

            var10000 = var1;
            break label38;
         }

         var10000 = Color.WHITE;
      }

      Color var6 = var10000;
      double var7 = Math.max((double)0.0F, Math.min((double)1.0F, var2));
      return new Color(baa((int)Math.round((double)var5.getRed() + (double)(var6.getRed() - var5.getRed()) * var7)), baa((int)Math.round((double)var5.getGreen() + (double)(var6.getGreen() - var5.getGreen()) * var7)), baa((int)Math.round((double)var5.getBlue() + (double)(var6.getBlue() - var5.getBlue()) * var7)), baa((int)Math.round((double)var5.getAlpha() + (double)(var6.getAlpha() - var5.getAlpha()) * var7)));
   }

   private static int aaaa(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ b(-370917346, -1005972731 ^ 1097264349);
      if (aab[var3] == null) {
         aab[var3] = (int)(aa[var3] ^ var1);
      }

      return aab[var3];
   }

   public static Color aaab(Color param0, q2997348aa27a422480aea29cbfd800b1abaaaab param1, double param2, int param4) {
      // $FF: Couldn't be decompiled
   }

   private static Color aaba(float var0, float var1, float var2, int var3) {
      int var5 = -463140660;
      int var4 = Color.HSBtoRGB(var0, var1, var2);
      return new Color(var4 >> bba(aaaa(b(-370917369, var5 ^ -1608918055), 1551393790018896231L), bbb(b(-370917370, var5 ^ -1138302764), 5897029293862650189L)) & bba(aaaa(b(-370917375, var5 ^ -836091131), 6708836099116004858L), bbb(b(-370917376, var5 ^ -517825462), 1404408523913822067L)), var4 >> bba(aaaa(b(-370917373, var5 ^ 971054523), 4909669281204971672L), bbb(b(-370917374, var5 ^ 1052076102), 5788767548124962379L)) & bba(aaaa(b(-370917363, var5 ^ -1355506065), 6708836099116004858L), bbb(b(-370917364, var5 ^ 69426029), 1404408523913822067L)), var4 & bba(aaaa(b(-370917361, var5 ^ -265753386), 6708836099116004858L), bbb(b(-370917362, var5 ^ 368777111), 1404408523913822067L)), baa(var3));
   }
}
