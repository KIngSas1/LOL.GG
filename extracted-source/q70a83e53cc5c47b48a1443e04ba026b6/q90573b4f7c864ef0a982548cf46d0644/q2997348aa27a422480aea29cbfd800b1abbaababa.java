package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import java.util.Arrays;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
final class q2997348aa27a422480aea29cbfd800b1abbaababa {
   private static final Long[] aa;
   private static final Integer[] ab;
   private static final long[] ba;
   private static final String[] bba;
   private static final int[] bab;
   private static final long[] bb;
   private static final Integer[] aaa;
   private final byte[] aab;
   private static final Long[] b;
   private static final Object[] bbb;
   private static final long[] aba;
   private final int a;
   private static final long[] abb;
   private volatile long baa;

   private static long aa(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ b(441658986, -520972877 ^ -1159911552)) & b(441658987, -520972877 ^ 1072740827);
      if (aa[var3] == null) {
         aa[var3] = ba[var3] ^ var1;
      }

      return aa[var3];
   }

   private synchronized byte[] a() {
      // $FF: Couldn't be decompiled
   }

   private static q2997348aa27a422480aea29cbfd800b1abbaababa ab(byte[] var0, int var1, int var2) {
      long var3 = q2997348aa27a422480aea29cbfd800b1bbbbbbab.aa.nextLong();
      byte[] var5 = new byte[var2];
      int var6 = 0;

      try {
         try {
            while(var6 < var2) {
               var5[var6] = (byte)(var0[var1 + var6] ^ abb(var3, var6));
               ++var6;
            }
         } catch (IllegalStateException var7) {
            throw var7;
         }
      } catch (MatchException var8) {
         throw var8;
      }

      return new q2997348aa27a422480aea29cbfd800b1abbaababa(var5, var3, q2997348aa27a422480aea29cbfd800b1bbbbbbab.abab(var0, var1, var1 + var2));
   }

   private static int b(int var0, int var1) {
      int var2 = bab[var0 ^ 441658986] ^ var1 ^ var0;
      var2 += 43218;
      var2 += 28043;
      var2 ^= 32587;
      var2 += 13336;
      var2 ^= 12413;
      var2 += 4159;
      return var2;
   }

   private int ba(int var1) {
      return (this.aab[var1] ^ abb(this.baa, var1)) & baa(bab(b(441658984, 368138183 ^ 207523462), 3377095052774973170L), aa(b(441658985, 368138183 ^ 1125607671), 17115562654787189L));
   }

   private static long bb(long var0) {
      int var2 = -494156225;
      var0 = (var0 ^ var0 >>> baa(bab(b(441659115, var2 ^ -1974627391), 9201738164031637797L), aa(b(441659112, var2 ^ -1349487438), 3160895078579335833L))) * aaa(bab(b(441659113, var2 ^ -1157532554), 2481352986455760525L), aa(b(441659118, var2 ^ 1439502315), 4887051165892576049L));
      var0 = (var0 ^ var0 >>> baa(bab(b(441659119, var2 ^ -569069433), 2156133858638729312L), aa(b(441659116, var2 ^ -1968121524), 7668220022589952376L))) * aaa(bab(b(441659117, var2 ^ -1002332561), 3853547003645092580L), aa(b(441659106, var2 ^ -1437567172), 2359718513862964310L));
      return var0 ^ var0 >>> baa(bab(b(441659107, var2 ^ -246113074), 6222031667201622492L), aa(b(441659104, var2 ^ -1751740471), 7801007252811205038L));
   }

   private static long aaa(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ bab(b(441659105, -1351754640 ^ 288161873), 7512340805922315274L)) & bab(b(441659110, -1351754640 ^ -193671624), 9025363749860461674L);

      try {
         if (b[var3] == null) {
            b[var3] = bb[var3] ^ var1;
         }
      } catch (MatchException var4) {
         throw var4;
      }

      return b[var3];
   }

   private synchronized long aab(int param1) {
      // $FF: Couldn't be decompiled
   }

   private q2997348aa27a422480aea29cbfd800b1abbaababa(byte[] var1, long var2, int var4) {
      this.aab = var1;
      this.baa = var2;
      this.a = var4;
      synchronized(q2997348aa27a422480aea29cbfd800b1bbbbbbab.ab) {
         if (q2997348aa27a422480aea29cbfd800b1bbbbbbab.ba) {
            this.bbb();
         } else {
            q2997348aa27a422480aea29cbfd800b1bbbbbbab.ab.add(this);
         }

      }
   }

   private static String aaaa(char var0, int var1, byte var2, short var3, int var4, char var5) {
      int var10 = var4 ^ 1734599614;
      char[] var9 = bba[var10].toCharArray();
      StackTraceElement[] var11 = (StackTraceElement[])bbb[var10];
      StackTraceElement[] var12;
      if (var11 != null) {
         var12 = var11;
      } else {
         var12 = (new Throwable()).getStackTrace();
         bbb[var10] = var12;
      }

      StackTraceElement var13 = var12[1];
      int var7 = (var13.getClassName().hashCode() ^ var13.getMethodName().hashCode()) >> 16 ^ '쑋';
      int var8 = 0;

      do {
         var9[var8] = (char)(var9[var8] ^ '첡' ^ var8 ^ var0 ^ var3 ^ var7 ^ var5 ^ var4 ^ var1 ^ var2);
         ++var8;
      } while(var8 < var9.length);

      return (new String(var9)).intern();
   }

   private synchronized void aba() {
      // $FF: Couldn't be decompiled
   }

   private static byte abb(long var0, int var2) {
      long var3 = var0 + aaa(bab(b(441659091, 681727381 ^ 1057544929), 6388601414501410463L), aa(b(441659088, 681727381 ^ 71061793), 5628025519753678367L)) * ((long)(var2 >>> 3) + 1L);
      long var5 = bb(var3);
      return (byte)((int)(var5 >>> ((var2 & baa(bab(b(441659089, 681727381 ^ 767657431), 1121540413366704943L), aa(b(441659094, 681727381 ^ 1881019536), 2111377767532534149L))) << 3)));
   }

   private static int baa(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & aa(b(441659095, -456054180 ^ 732736024), 4754133718872842566L)) ^ bab(b(441659092, -456054180 ^ 837986917), 6119533355861100479L);

      try {
         if (ab[var3] == null) {
            ab[var3] = (int)(abb[var3] ^ var1);
         }
      } catch (MatchException var4) {
         throw var4;
      }

      return ab[var3];
   }

   private static int bab(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ b(441659093, 1913609629 ^ 776561844);
      if (aaa[var3] == null) {
         aaa[var3] = (int)(aba[var3] ^ var1);
      }

      return aaa[var3];
   }

   static {
      int var50 = -1346533701;
      char[] var41 = "珥猛犘猊猐猊爈猊猐猊".toCharArray();
      byte var46 = -1;
      String var40 = "\uee17\ueeb2\uee62\ueea4\uee9f\ueee5\uee08\ueee3\ueedf\uee34\ueec2\uee8f\uee1e\ueeb8\uee23\uee3f\ueeb0\uee41\uee2d\uee12\ueeca\ueed1\uee42\uee6e\uee57\uee86\ueea2\uee39\uee4b\ueed8\ueea6\ueed9\uee55\uee58\ueeb0\uee08\uee76\uee8d\uee7b\ueef8\uee11\ueef9\uee00\uee1c\ueefb\uee82\uee25\ueecb\ueea2\uee17\uee19\ueedc\uee4d\uee69\uee98\uee7c\ueecd\ueecb\uee0f\ueeb1\uee77\uee0f\uee24\ueedc\ueead\uee33\uee3b\ueedd\uee83\ueeb6\uee85\uee60\uee21\uee23\uee20\uee4f\uee98\uee8c\uee6b\uee23\uee46\uee21\uee6e\ueede\uee2c\uee3c\uee3a\ueec3\uee61\uee91\ueeb0\uee0b\ueea5\ueeb9\ueefa\uee97\uee94\uee94\ueee1\ueea3\uee92\uee94\uee73\ueee0\uee3d\uee1d\uee45\uee69\ueee5\uee4f\ueeca\uee1d\ueea8\ueedd\ueedc\uee9f\uee8b\ueecc\uee3f\ueed4\ueee9\ueef1\ueee2\ueecf\uee34\uee01\ueeea\ueebc\uee8c\uee3c\uee16\ueeaf\uee0f\ueeeb\ueeef\uee09\uee56\uee72\uee9a\ueebb\ueebe\ueef5\uee96\ueeb6\ueec1\uee41\uee0f\ueefb\uee30\ueebd\ueee5\ueebc\uee4c\ueeed\ueed7\uee78\ueef8\uee5a\uee89\uee09\uee98\ueeda\uee2e\uee66\ueea9\uee51\uee3b\ueecc\uee93\ueeb2\ueef6\uee4a\uee80\uee08\ueef3\uee02\uee4f\ueedc\uee1f\uee47\uee36\uee39\uee6e\uee22\uee0e\uee0c\ueeff\uee96\uee52\ueec2\uee36\uee03\uee81\uee4c\ueec9\uee49\ueefa\uee46\ueee1\ueebb\uee64\uee79\uee83\uee07\uee71\uee22\ueea3\uee2a\uee3a\uee2f\uee5e\uee8d\ueeb0\uee3e\ueee6\uee56\uee71\ueeb8\ueec9\ueee7\ueea7\ueec0\uee6c\ueecd\uee64\uee6e\ueee4\uee26\ueedb\ue038\ue020\ue0e5\ue08a\ue08e\ue039\ue061\ue0ae\ue0c0\ue0ff\ue070\ue0bd\ue057\ue067\ue059\ue0f4\ue078\ue021\ue05d\ue037\ue024\ue059\ue072\ue003\ue0e3\ue0d5\ue070⠺⠚⢩⡮⡽⡻⡾⠌⡕⢑⠝⡫⡼⡔⢅⢺⡇⣬⣻⢺⢉⠝⡡⠼⡼⡥⢆⡫⡵⡭⣾⠢⡧⡱⠓⠴⠋⢎⢅⠧⢀⣤⢮⢗⡀⣌⠟⠍⣊⢑⠫⠺⣊⠔⣪⡽⡒⠀⣟⡬⢥⠦⠉⢪⡟⡖⣵⢕⠿⠸⣥⢴⢨⡣⠙⡪⠉⡫⠾⣄⢌⡃⡀⣓⠈⠺⣸⠈⢝⡪⡮⠦⠟⣆⡏⠟⠡⠠⡄⢌⣶⣔⡣⣗⢟⢭⡟⣸⢁⢦⣇⣁⢔⣔⣵⣷⠗⠍⢳⡼⡱⡶⠫⠭⡇⡏⡥⠸⡊⡳⡄⠫⢸⣠⠗⣆⠆⢁⠜⠀⠸⣳⣑⡉⢷⣒⡰⠭⢜⡵⣺⣒⠅⡝⣥⢁⢥⢚⠠⢌⠐⡅⠫⡕⡧⢙⡯⣰⢉⢫⠏⢲⡷⣣⢮⠝⡘⠯⢲⡅⣍⣌⠱⠅⢮⢘⣋⡎⡁⣯⢚⠝⡉⢅⣯⣵⡰⢠⢖⢼⢹⣵⠏⡥⢝⠯⡍⠷⣯⣡⠄⠖⢰⡗⢠⠁⡬⡲⢑⡨⣫⠰⡡⣔⠷⠤⣩⡁⠊⡺⣃⠚⢮⠎⡾⣍⡯⣽⢮⠕⣓⣀⡽⢀⣑⢅⢭⣌⢥⡜⡂⢲⢙⠌⣈⣂⧊⦝⥲⧻⦍⧈⧙⤧⦛⧋⦰⦷⥎⦻⤆⦖⤊⧡⤉⤐⦤⥚⦧⧌⤿⧠⤽⦦⧈⥒⤥⦜⤲⦽⧐⤦⧙⧃⧲⦐⦈⥄⧩⧋⤝⤉⧞⦱⦫⧩⧔⧡⤅⦙⦖⦮⤀⥄⥏⧁⧈⦦⧮⧔⦱⥖⥔⧚⤻⦞⤍⧩⦖⥮⦌⥎⦳⥛⥼⤝⧌⧔⤰⧕⦁⧁⥂⤄⧚⥡⥅⥽⤓⥜⧪⤅⥪⤺⥙⤦⤨⧁⥵⤵⧾⤽⥭⥑⧏⤍⦯⧦⥻⤔⧿⥝⦛⦦⧊⦌⧡⧵⥊⦎⥢⧽⦱⧛⧫⤯⦬⤱⦉⥇⥮⧈⤌⧢⤜⥪⧢⥃⥮⧐⦆⧭⤆⧄⦼⧔⥯⦌鏢鎰錇鍛錙鎖鏑鍴鍐錝园噦嘟囉噬嚥囅噟囂嘂囃嘾嚓囈嘡嚌ㄦㅴ㇃㆟㇝ㅒㄕㆰ㆔㇙繱縭纹纺繪縖纕縂绚縙绬纠纽纁织纟繮纕纖绞縨纣纽縋绖绫繝縸绺繖纥纮绤縉绺縁绔縔縨縠縧纬繑绩纓纼縄縌细纻繟纒纾縝绁縘繓绢縕纠縋纟纱纑继绀纊绘縚繍纂縉组繏纯绅繺纟績绀繘织络纳繠纘纽纨绐縚縬總纼縂繣繓縟繠繘縫繏纄纕继绸绥縢纮縛繒縲繟织绝繂纜绵縞繪繚繛繓縮縉繏縧绷繶縵繱縥縺经縡繼繴绤绵繌繰纬纍纊繄縴繥縬纥繯纳繈纾繌縺縅繚经縥绱繋绸绂纣纉繿结纲縨繽繕縔縧縶纪绶绂绶纸縺纳绤繷纝绱縧络縶绁绺绒绳综繶绣绳縲繑给纘绱纪縹縒縕级繆繢縨縤约繡縳绚纠縩縅绺縦绱繚练繬纗繎縁繐绉线績绫细绐縂縠縜结繣统纜繿纵縵縷繆纍縄縗纝繴繘縦繴纵绡縓绹缃罘習翗羐翩翓缬ൃ\u0d11ඦ\u0dfaමഷ൰\u0dd5\u0df1\u0dbc딱딹떹땧떻떎딚떛떋떣땋떦땋땰땳딏瑠琲璅瓙璛琔瑓瓶瓒璟";
      short var39 = 29440;
      String[] var42 = new String[var41.length];

      while(true) {
         int var43 = 0;
         int var44 = 0;
         int var45 = 0;
         if (var46 == 0) {
            bba = var42;
            bbb = new Object[var42.length];
            int var58 = 0;
            bab = new int[192];
            int var10001 = 0;
            byte[] var10002 = "p\u000f\u000b2õ#p\u00133\u008eß¢|Çkõ¥SëB.¨\u0096öïõLæ\u0018%¢\u0090»Z\u0006®ñ-í1Õ\u0093\u0005iÀæÃ\u0014Å¥\u0084ÁºqKl8/\u009dyÇªTºÊ\u00ad\u00ad\u008bf\u000eÛEû¥£fn\u0095\u001dÒL¤£ûÉ#\t\f³µv;§$\u0084Øs pd\u009e\u009e60;\u009f\u0003ÃÌP°N<ôÖ\\ü\u009et:z\u0010\fô\u001b\u000fÏ\u0087á¾*\u00805yG\u0094²iOU\u009b\u008f\b\tG¶ù\n\u008eº\u001cÞ8e\u001eXÇFYÎÝe\u001fÙ\u00adolÐ¯\u007fíAI\u009d\u0087\nú]¯øùiæs?MÚRy\u0082ùÖW\u0082\u008f\u001a]\u0013YI{Fc[\u009cï~\u0004-ô*ì<¹\u0084\u0002oöÁYu^\u001f/\u008c¿\"¸\u0000\u0001Áñi\u0000\u0080UËÅ\u0000©»/)à\u008a÷s\u000fI4\u0000¯îÛ¶µÇÁ\u001aËââúÏi6sX]¥\u009c!7¢\u0082x6ñ±\u0089\u009b \u0099w\u0086vb¹èß\u001e\r%\u009a±$g\u0080ÖØx\u009c\u009a\u000f\u001ez3ºÕq<_UR\u0099z\u001fÔÂúk\u0090T_þÍ0SkÆª5}\u008d\u001a\b·\u00019ÅW&\u0093tLÝ.Hý\u0097¿~½¦)0+CkË\u009d\u0099¡e eÒ(Uð\u0082ÅP0:\u000bsÙ:OGk:6°\"2§\u0014\u008b\u0089\u008fl«ÔI|ÎX\u0096W¦\u0005\u0097\u009f\u0094¢àI\u0086¾Às\u0098ã6r«K\u0098¤; \u009cvb\u008cóÔ÷öß\u007fÃ\b\u0089Æ\u0002c¤·Ú\u0099Té\u0094\rÇ¸V@ó²÷\u009dCB7¨f!>Zô\u001c1Ü::b0vº_?)\u0096PÀ\u000eßüC\u009c\u008dh\u0090¨@\u000fx\\\u0087s¨¥\u009e¾ãÚê\u0082}i»\n\u009e\u009f\u0083\u001dgö\u008b\u0014\u0082/Bæ§Ïg:\u009bks«ôü\u009dfwï\u0016¾r\u009dB\u001b\u0010¿\fë\r÷bú\u009b_9ÿ®>_=½ù\u0094a\u009f¶q9â\u0012\fE#¹u|©Ñä©´\u001b6y`\u001bA\u0090\u009eØüýWØ\u001a(\u008b«á\u001fv6ì\u008c\u00ad\u008d\b-²ã¯.\"\u001dR\u009b\u0012\u000eÈ³;\u0082\u0085\u00adNþ³j\u0084?\u0001 <8l\u0019´\n5ÙäÄÇïÞ}öO¥ýY*\u001cn\f\u0095\u008b\u0010¶ÑR,¶\u0087\u001b-|Í\u008f\u0007ã¶C®Ü\"\u0014ÓmN\u0096ú\u0091îÁ§-Ý\u008aÎ\u0084\u0004Ä@µ±X=±\bwt\u008d\u0095Ò?¦\u0001bê\u0091Ë \u0016å4\u0010eûñ\u008bÆ7\u0007Ã)r4D¥>äûN¦\u001aI\u0001\u0086\u009b\u001a\u009a\u0019[÷\u0016=\u008a\u0090Y\u0006¾èç/BÐMr\u009dF\u0091å\\ß)ÿ\u0003\u009f°vf\u008e\u0082".getBytes("ISO-8859-1");

            int var117;
            do {
               bab[var58] = ((var10002[var10001] & 255) << 24 | (var10002[var10001 + 1] & 255) << 16 | (var10002[var10001 + 2] & 255) << 8 | var10002[var10001 + 3] & 255) ^ -812823423;
               ++var58;
               var117 = var10001 + 4;
               var10001 += 4;
            } while(var117 < var10002.length);

            String[] var16 = new String[b(441658990, var50 ^ 550416794)];
            int var20 = 0;
            String var19;
            int var21 = (var19 = aaaa((char)14143, -405980566, (byte)102, (short)6821, 1734599614, '〢')).length();
            int var18 = b(441658991, var50 ^ -1422537695);
            int var54 = -1;

            label186:
            while(true) {
               ++var54;
               String var59 = var19.substring(var54, var54 + var18);
               var10001 = -1;

               while(true) {
                  label181: {
                     char[] var69 = var59.toCharArray();
                     var117 = var69.length;
                     int var22 = 0;
                     var96 = var69;
                     int var72 = var117;
                     char[] var121;
                     int var143;
                     if (var117 <= 1) {
                        var121 = var69;
                        var143 = var22;
                     } else {
                        var96 = var69;
                        var72 = var117;
                        if (var117 <= var22) {
                           break label181;
                        }

                        var121 = var69;
                        var143 = var22;
                     }

                     while(true) {
                        char var156 = var121[var143];
                        int var160;
                        switch (var22 % b(441658989, var50 ^ -1648822082)) {
                           case 0 -> var160 = b(441658978, var50 ^ 1053252755);
                           case 1 -> var160 = b(441658979, var50 ^ 1957746135);
                           case 2 -> var160 = b(441658976, var50 ^ 1343119198);
                           case 3 -> var160 = b(441658977, var50 ^ 1165728205);
                           case 4 -> var160 = b(441658982, var50 ^ 1077460001);
                           case 5 -> var160 = b(441658983, var50 ^ 1072460325);
                           default -> var160 = b(441658980, var50 ^ -1112366024);
                        }

                        var121[var143] = (char)(var156 ^ var160);
                        ++var22;
                        if (var72 == 0) {
                           var143 = var72;
                           var121 = var96;
                        } else {
                           if (var72 <= var22) {
                              break;
                           }

                           var121 = var96;
                           var143 = var22;
                        }
                     }
                  }

                  String var128 = (new String(var96)).intern();
                  switch (var10001) {
                     case 0:
                        var16[var20++] = var128;
                        if ((var54 += var18) >= var21) {
                           long var8 = 6931133517476886300L;
                           long[] var14 = new long[b(441658981, var50 ^ 1110904126)];
                           int var11 = 0;
                           String var12;
                           int var13 = (var12 = aaaa('濮', 1468446366, (byte)-101, (short)-27465, 1734599612, (char)21455)).length();
                           int var10 = 0;

                           label157:
                           while(true) {
                              var10001 = var10;
                              var10 += 8;
                              byte[] var15 = var12.substring(var10001, var10).getBytes(aaaa('㰥', -1730026104, (byte)-65, (short)14655, 1734599613, '䗒'));
                              long[] var61 = var14;
                              var10001 = var11++;
                              long var101 = ((long)var15[0] & 255L) << b(441659002, var50 ^ 1328608257) | ((long)var15[1] & 255L) << b(441659003, var50 ^ -476871962) | ((long)var15[2] & 255L) << b(441659000, var50 ^ 2117663486) | ((long)var15[3] & 255L) << b(441659001, var50 ^ -351778845) | ((long)var15[4] & 255L) << b(441659006, var50 ^ -918947371) | ((long)var15[5] & 255L) << b(441659007, var50 ^ 1287541707) | ((long)var15[b(441659004, var50 ^ 908602609)] & 255L) << b(441659005, var50 ^ 582606565) | (long)var15[b(441658994, var50 ^ -163763627)] & 255L;
                              byte var129 = -1;

                              while(true) {
                                 long var145 = var101 ^ var8;
                                 switch (var129) {
                                    case 0:
                                       var61[var10001] = var145;
                                       if (var10 >= var13) {
                                          aba = var14;
                                          aaa = new Integer[b(441658952, var50 ^ 938743548)];
                                          long var0 = 9105728878113440988L;
                                          long[] var6 = new long[b(441658953, var50 ^ 504517143)];
                                          int var3 = 0;
                                          String var4;
                                          int var5 = (var4 = aaaa('㠗', 1410990678, (byte)55, (short)-21986, 1734599608, (char)10064)).length();
                                          int var2 = 0;

                                          label147:
                                          while(true) {
                                             var10001 = var2;
                                             var2 += 8;
                                             byte[] var7 = var4.substring(var10001, var2).getBytes(aaaa((char)'픴', -10049120, (byte)-90, (short)-11804, 1734599609, '隌'));
                                             var61 = var6;
                                             var10001 = var3++;
                                             var101 = ((long)var7[0] & 255L) << b(441658958, var50 ^ -1037328204) | ((long)var7[1] & 255L) << b(441658959, var50 ^ 187123017) | ((long)var7[2] & 255L) << b(441658956, var50 ^ -1107802124) | ((long)var7[3] & 255L) << b(441658957, var50 ^ 1121649611) | ((long)var7[4] & 255L) << b(441658946, var50 ^ 1492665803) | ((long)var7[5] & 255L) << b(441658947, var50 ^ 686962219) | ((long)var7[b(441658944, var50 ^ 719501239)] & 255L) << b(441658945, var50 ^ -872358645) | (long)var7[b(441658950, var50 ^ 2143352317)] & 255L;
                                             var129 = -1;

                                             while(true) {
                                                var145 = var101 ^ var0;
                                                switch (var129) {
                                                   case 0:
                                                      var61[var10001] = var145;
                                                      if (var2 >= var5) {
                                                         ba = var6;
                                                         aa = new Long[b(441658972, var50 ^ -362046638)];
                                                         long var31 = aa(b(441658973, var50 ^ -255672059), 4329070315422147154L);
                                                         long[] var37 = new long[bab(b(441658962, var50 ^ 153348682), 7321142726125835891L)];
                                                         int var34 = 0;
                                                         String var35;
                                                         int var36 = (var35 = var16[3]).length();
                                                         int var33 = 0;

                                                         label137:
                                                         while(true) {
                                                            var10001 = var33;
                                                            var33 += 8;
                                                            byte[] var38 = var35.substring(var10001, var33).getBytes(var16[4]);
                                                            var61 = var37;
                                                            var10001 = var34++;
                                                            var101 = ((long)var38[0] & aa(b(441658963, var50 ^ -2053305059), 4553993177163945061L)) << bab(b(441658960, var50 ^ -325297938), 7818110738913257385L) | ((long)var38[1] & aa(b(441658961, var50 ^ 1314509412), 1792208130551408594L)) << bab(b(441658966, var50 ^ 1051898440), 1077077711335537026L) | ((long)var38[2] & aa(b(441658967, var50 ^ 258712004), 1792208130551408594L)) << bab(b(441658964, var50 ^ -861348576), 6579794351515952056L) | ((long)var38[3] & aa(b(441658965, var50 ^ 1799840892), 1792208130551408594L)) << bab(b(441658922, var50 ^ 1113357068), 363460780034604959L) | ((long)var38[4] & aa(b(441658923, var50 ^ 1736321144), 1792208130551408594L)) << bab(b(441658920, var50 ^ -324334134), 3133602730666017696L) | ((long)var38[5] & aa(b(441658921, var50 ^ -667332972), 1792208130551408594L)) << bab(b(441658926, var50 ^ -1304488402), 2978380607104264783L) | ((long)var38[bab(b(441658927, var50 ^ -1284731257), 9173489202053645775L)] & aa(b(441658924, var50 ^ 507268039), 1792208130551408594L)) << bab(b(441658925, var50 ^ 65728245), 6732062375641813250L) | (long)var38[bab(b(441658914, var50 ^ 1833053251), 2114020487308414732L)] & aa(b(441658915, var50 ^ -1610194021), 1792208130551408594L);
                                                            var129 = -1;

                                                            while(true) {
                                                               var145 = var101 ^ var31;
                                                               switch (var129) {
                                                                  case 0:
                                                                     var61[var10001] = var145;
                                                                     if (var33 >= var36) {
                                                                        abb = var37;
                                                                        ab = new Integer[bab(b(441658929, var50 ^ -1510383945), 8707841697489752695L)];
                                                                        long var23 = aa(b(441658934, var50 ^ -798228001), 5122543154683385854L);
                                                                        long[] var29 = new long[bab(b(441658935, var50 ^ -710080243), 7245721043317555494L)];
                                                                        int var26 = 0;
                                                                        String var27;
                                                                        int var28 = (var27 = var16[2]).length();
                                                                        int var25 = 0;

                                                                        label127:
                                                                        while(true) {
                                                                           var10001 = var25;
                                                                           var25 += 8;
                                                                           byte[] var30 = var27.substring(var10001, var25).getBytes(var16[1]);
                                                                           var61 = var29;
                                                                           var10001 = var26++;
                                                                           var101 = ((long)var30[0] & aa(b(441658932, var50 ^ -163190553), 1792208130551408594L)) << bab(b(441658933, var50 ^ -1024023440), 3247948025380053816L) | ((long)var30[1] & aa(b(441658890, var50 ^ 901701681), 1792208130551408594L)) << bab(b(441658891, var50 ^ -1860822682), 4484855502030679723L) | ((long)var30[2] & aa(b(441658888, var50 ^ -382269731), 1792208130551408594L)) << bab(b(441658889, var50 ^ -112027173), 3477970195051175591L) | ((long)var30[3] & aa(b(441658894, var50 ^ -767895803), 1792208130551408594L)) << bab(b(441658895, var50 ^ 436847587), 878123814168641352L) | ((long)var30[4] & aa(b(441658892, var50 ^ -870683568), 1792208130551408594L)) << bab(b(441658893, var50 ^ -167410782), 3409745431530422271L) | ((long)var30[5] & aa(b(441658882, var50 ^ -147351290), 1792208130551408594L)) << bab(b(441658883, var50 ^ 564537596), 7222706673739732257L) | ((long)var30[bab(b(441658880, var50 ^ -201343038), 7245721043317555494L)] & aa(b(441658881, var50 ^ 1365976130), 1792208130551408594L)) << bab(b(441658886, var50 ^ -94477388), 6904485016065624324L) | (long)var30[bab(b(441658887, var50 ^ 1134478559), 5665415811200744449L)] & aa(b(441658884, var50 ^ 843467724), 1792208130551408594L);
                                                                           var129 = -1;

                                                                           while(true) {
                                                                              var145 = var101 ^ var23;
                                                                              switch (var129) {
                                                                                 case 0:
                                                                                    var61[var10001] = var145;
                                                                                    if (var25 >= var28) {
                                                                                       bb = var29;
                                                                                       b = new Long[bab(b(441659114, var50 ^ 243905012), 7245721043317555494L)];
                                                                                       return;
                                                                                    }
                                                                                    break;
                                                                                 default:
                                                                                    var61[var10001] = var145;
                                                                                    if (var25 < var28) {
                                                                                       continue label127;
                                                                                    }

                                                                                    var28 = (var27 = var16[5]).length();
                                                                                    var25 = 0;
                                                                              }

                                                                              var10001 = var25;
                                                                              var25 += 8;
                                                                              var30 = var27.substring(var10001, var25).getBytes(var16[1]);
                                                                              var61 = var29;
                                                                              var10001 = var26++;
                                                                              var101 = ((long)var30[0] & aa(b(441658885, var50 ^ 1812520798), 1792208130551408594L)) << bab(b(441658906, var50 ^ 1036770970), 3247948025380053816L) | ((long)var30[1] & aa(b(441658907, var50 ^ 929779652), 1792208130551408594L)) << bab(b(441658904, var50 ^ -945145700), 4484855502030679723L) | ((long)var30[2] & aa(b(441658905, var50 ^ -1532852111), 1792208130551408594L)) << bab(b(441658910, var50 ^ -1716708000), 3477970195051175591L) | ((long)var30[3] & aa(b(441658911, var50 ^ -1073814795), 1792208130551408594L)) << bab(b(441658908, var50 ^ 1069702713), 878123814168641352L) | ((long)var30[4] & aa(b(441658909, var50 ^ 332141199), 1792208130551408594L)) << bab(b(441658898, var50 ^ 1516315415), 3409745431530422271L) | ((long)var30[5] & aa(b(441658899, var50 ^ 150225447), 1792208130551408594L)) << bab(b(441658896, var50 ^ -980226001), 7222706673739732257L) | ((long)var30[bab(b(441658897, var50 ^ 49191813), 7245721043317555494L)] & aa(b(441658902, var50 ^ 455225680), 1792208130551408594L)) << bab(b(441658903, var50 ^ 1864308293), 6904485016065624324L) | (long)var30[bab(b(441658900, var50 ^ 1050032631), 5665415811200744449L)] & aa(b(441658901, var50 ^ 109163903), 1792208130551408594L);
                                                                              var129 = 0;
                                                                           }
                                                                        }
                                                                     }
                                                                     break;
                                                                  default:
                                                                     var61[var10001] = var145;
                                                                     if (var33 < var36) {
                                                                        continue label137;
                                                                     }

                                                                     var36 = (var35 = var16[0]).length();
                                                                     var33 = 0;
                                                               }

                                                               var10001 = var33;
                                                               var33 += 8;
                                                               var38 = var35.substring(var10001, var33).getBytes(var16[1]);
                                                               var61 = var37;
                                                               var10001 = var34++;
                                                               var101 = ((long)var38[0] & aa(b(441658912, var50 ^ -501480348), 1792208130551408594L)) << bab(b(441658913, var50 ^ -50264995), 3247948025380053816L) | ((long)var38[1] & aa(b(441658918, var50 ^ -1679367936), 1792208130551408594L)) << bab(b(441658919, var50 ^ 1357687962), 4484855502030679723L) | ((long)var38[2] & aa(b(441658916, var50 ^ -791786558), 1792208130551408594L)) << bab(b(441658917, var50 ^ -1706556517), 3477970195051175591L) | ((long)var38[3] & aa(b(441658938, var50 ^ -301168903), 1792208130551408594L)) << bab(b(441658939, var50 ^ 2068861284), 878123814168641352L) | ((long)var38[4] & aa(b(441658936, var50 ^ -296060783), 1792208130551408594L)) << bab(b(441658937, var50 ^ -133137752), 3409745431530422271L) | ((long)var38[5] & aa(b(441658942, var50 ^ 849210215), 1792208130551408594L)) << bab(b(441658943, var50 ^ -759489752), 7222706673739732257L) | ((long)var38[bab(b(441658940, var50 ^ -918545083), 7245721043317555494L)] & aa(b(441658941, var50 ^ 2014014943), 1792208130551408594L)) << bab(b(441658930, var50 ^ 943407673), 6904485016065624324L) | (long)var38[bab(b(441658931, var50 ^ -1361064828), 5665415811200744449L)] & aa(b(441658928, var50 ^ 403010505), 1792208130551408594L);
                                                               var129 = 0;
                                                            }
                                                         }
                                                      }
                                                      break;
                                                   default:
                                                      var61[var10001] = var145;
                                                      if (var2 < var5) {
                                                         continue label147;
                                                      }

                                                      var5 = (var4 = aaaa('耙', 705907077, (byte)4, (short)-6857, 1734599606, '僣')).length();
                                                      var2 = 0;
                                                }

                                                var10001 = var2;
                                                var2 += 8;
                                                var7 = var4.substring(var10001, var2).getBytes(aaaa('目', -635793540, (byte)68, (short)1253, 1734599607, '䁄'));
                                                var61 = var6;
                                                var10001 = var3++;
                                                var101 = ((long)var7[0] & 255L) << b(441658951, var50 ^ 2096414660) | ((long)var7[1] & 255L) << b(441658948, var50 ^ -1160739890) | ((long)var7[2] & 255L) << b(441658949, var50 ^ -65036173) | ((long)var7[3] & 255L) << b(441658970, var50 ^ -769665784) | ((long)var7[4] & 255L) << b(441658971, var50 ^ -661781694) | ((long)var7[5] & 255L) << b(441658968, var50 ^ -19187269) | ((long)var7[b(441658969, var50 ^ 426910955)] & 255L) << b(441658974, var50 ^ -1469484814) | (long)var7[b(441658975, var50 ^ -1188766178)] & 255L;
                                                var129 = 0;
                                             }
                                          }
                                       }
                                       break;
                                    default:
                                       var61[var10001] = var145;
                                       if (var10 < var13) {
                                          continue label157;
                                       }

                                       var13 = (var12 = aaaa((char)'\ue8ac', -346610664, (byte)79, (short)26307, 1734599610, (char)13609)).length();
                                       var10 = 0;
                                 }

                                 var10001 = var10;
                                 var10 += 8;
                                 var15 = var12.substring(var10001, var10).getBytes(aaaa('䔿', -571359573, (byte)88, (short)-11701, 1734599611, '톺'));
                                 var61 = var14;
                                 var10001 = var11++;
                                 var101 = ((long)var15[0] & 255L) << b(441658995, var50 ^ 453210035) | ((long)var15[1] & 255L) << b(441658992, var50 ^ -1107142037) | ((long)var15[2] & 255L) << b(441658993, var50 ^ 1238231519) | ((long)var15[3] & 255L) << b(441658998, var50 ^ -1184265118) | ((long)var15[4] & 255L) << b(441658999, var50 ^ 2030251549) | ((long)var15[5] & 255L) << b(441658996, var50 ^ -7514568) | ((long)var15[b(441658997, var50 ^ -1634560700)] & 255L) << b(441658954, var50 ^ 1680044170) | (long)var15[b(441658955, var50 ^ -1327227492)] & 255L;
                                 var129 = 0;
                              }
                           }
                        }

                        var18 = var19.charAt(var54);
                        break;
                     default:
                        var16[var20++] = var128;
                        if ((var54 += var18) < var21) {
                           var18 = var19.charAt(var54);
                           continue label186;
                        }

                        var21 = (var19 = aaaa((char)'찉', 1864810902, (byte)73, (short)-17910, 1734599615, (char)'黠')).length();
                        var18 = b(441658988, var50 ^ 1785206472);
                        var54 = -1;
                  }

                  ++var54;
                  var59 = var19.substring(var54, var54 + var18);
                  var10001 = 0;
               }
            }
         }

         do {
            var45 = var41[var43] ^ var39;
            char[] var47 = var40.substring(var44, var44 + var45).toCharArray();
            int var48 = 0;

            do {
               short var10000;
               switch (var48 % 5) {
                  case 0:
                  default:
                     var10000 = 28;
                     break;
                  case 1:
                     var10000 = 85;
                     break;
                  case 2:
                     var10000 = 253;
                     break;
                  case 3:
                     var10000 = 194;
                     break;
                  case 4:
                     var10000 = 146;
               }

               short var49 = var10000;
               var47[var48] = (char)(var47[var48] ^ var49);
               ++var48;
            } while(var48 < var47.length);

            var42[var43] = (new String(var47)).intern();
            var44 += var45;
            ++var43;
         } while(var43 < var41.length);

         var46 = 0;
      }
   }

   private String bba() {
      // $FF: Couldn't be decompiled
   }

   private synchronized void bbb() {
      try {
         if (this.aab != null) {
            Arrays.fill(this.aab, (byte)0);
         }
      } catch (MatchException var1) {
         throw var1;
      } catch (IllegalStateException var2) {
         throw var2;
      }

      this.baa = 0L;
   }
}
