package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_332;

@Environment(EnvType.CLIENT)
public final class q2997348aa27a422480aea29cbfd800b1ababbab {
   private static final String[] bba;
   private static final long[] aa;
   private static final double a = (double)2.0F;
   private static final int[] bab;
   private static final long[] ab;
   public static final double ba = (double)0.5F;
   private static final Long[] bb;
   private static final double aaa = (double)4.0F;
   private static final int b;
   private static final Integer[] aab;
   private static final Integer[] aba;
   private static final long[] abb;
   private static final Object[] bbb;
   private static final double baa = (double)4.0F;

   private static String aaaa(char var0, byte var1, int var2, byte var3) {
      int var8 = var2 ^ 1038576061;
      char[] var7 = bba[var8].toCharArray();
      StackTraceElement[] var9 = (StackTraceElement[])bbb[var8];
      StackTraceElement[] var10;
      if (var9 != null) {
         var10 = var9;
      } else {
         var10 = (new Throwable()).getStackTrace();
         bbb[var8] = var10;
      }

      StackTraceElement var11 = var10[1];
      int var5 = (var11.getClassName().hashCode() ^ var11.getMethodName().hashCode()) >> 16 ^ '\uf492';
      int var6 = 0;

      do {
         var7[var6] = (char)(var7[var6] ^ '뱁' ^ var5 ^ var3 ^ var1 ^ var0 ^ var2);
         ++var6;
      } while(var6 < var7.length);

      return (new String(var7)).intern();
   }

   private q2997348aa27a422480aea29cbfd800b1ababbab() {
   }

   public static List aa() {
      // $FF: Couldn't be decompiled
   }

   public static q2997348aa27a422480aea29cbfd800b1aaabbbaaa ab(double var0, double var2, double var4, double var6, double var8, double var10, List var12) {
      ArrayList var13 = new ArrayList(2);
      double var14 = a(true, var0, var4, var8, var12, var13);
      double var16 = a(false, var2, var6, var10, var12, var13);
      var14 = bba(var14, (double)0.0F, Math.max((double)0.0F, var8 - var4));
      var16 = bba(var16, (double)0.0F, Math.max((double)0.0F, var10 - var6));
      return new q2997348aa27a422480aea29cbfd800b1aaabbbaaa(var14, var16, var13);
   }

   private static boolean ba(double param0, double param2, double param4) {
      // $FF: Couldn't be decompiled
   }

   public static void bb(class_332 param0, boolean param1, double param2, double param4, int param6) {
      // $FF: Couldn't be decompiled
   }

   private static boolean aaa(q2997348aa27a422480aea29cbfd800b1aaabaabab param0, double param1, double param3) {
      // $FF: Couldn't be decompiled
   }

   private static long aab(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ b(-2034745827, -25549399 ^ 826263940)) & b(-2034745828, -25549399 ^ 1350494927);
      if (bb[var3] == null) {
         bb[var3] = abb[var3] ^ var1;
      }

      return bb[var3];
   }

   private static double a(boolean param0, double param1, double param3, double param5, List param7, List param8) {
      // $FF: Couldn't be decompiled
   }

   private static int aba(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & aab(b(-2034745837, -1857627544 ^ 1696060685), 5688107914508070953L)) ^ baa(b(-2034745838, -1857627544 ^ 1333131587), 6762273482840834159L);

      try {
         if (aba[var3] == null) {
            aba[var3] = (int)(ab[var3] ^ var1);
         }
      } catch (MatchException var4) {
         throw var4;
      }

      return aba[var3];
   }

   private static int b(int var0, int var1) {
      int var2 = bab[var0 ^ -2034745831] ^ var1 ^ var0;
      var2 -= 52168;
      var2 -= 36928;
      var2 += 38733;
      var2 ^= 39108;
      var2 -= 41441;
      var2 -= 45294;
      var2 ^= 40088;
      return var2;
   }

   public static void abb(class_332 var0, List var1, double var2, double var4, int var6) {
      int var10000 = q2997348aa27a422480aea29cbfd800b1aabaabaaa.bb;
      Iterator var8 = var1.iterator();
      int var7 = var10000;

      while(var8.hasNext()) {
         q2997348aa27a422480aea29cbfd800b1bbbaaba var9 = (q2997348aa27a422480aea29cbfd800b1bbbaaba)var8.next();

         boolean var10001;
         double var10002;
         double var10003;
         label27: {
            try {
               try {
                  var12 = var0;
                  var10001 = var9.a();
                  var10002 = var9.b();
                  if (var9.a()) {
                     var10003 = var4;
                     break label27;
                  }
               } catch (IllegalStateException var10) {
                  throw var10;
               }
            } catch (MatchException var11) {
               throw var11;
            }

            var10003 = var2;
         }

         bb(var12, var10001, var10002, var10003, var6);
         if (var7 != 0) {
            break;
         }
      }

   }

   private static int baa(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ b(-2034745835, -40235888 ^ 1426747529);
      if (aab[var3] == null) {
         aab[var3] = (int)(aa[var3] ^ var1);
      }

      return aab[var3];
   }

   static {
      int var42 = 1931203574;
      char[] var33 = "糞糦籍糷糭糷糅糷糭糷".toCharArray();
      short var31 = 31997;
      byte var38 = -1;
      String var32 = "ꪪꨗꩅ\uaac6ꨳꪎꪱꪨꪜꪈꪱꪖꫂꩶꨫꪹꪾꨊ\uaa5bꩽꫮ\uaa3eꨢꫂꪷꩿꩅ\uaa3eꨇꪄꨗ꩜ꩥꩤꪖ\udf5d\udf40\udf38\udf5c\udf9b\udf51\udfd6\udf48\udf10\udf1b\udfdc\udf27\udf40\udf74\udfaf\udf25\udf34\udf12\udf1d\udfef\udf67\udf07\udf7a\udf04\udfb4\udf04\udf15糲糐簈簄糷粪簖糭粙糂糓糑粋籱粔籬糡粊籶籟糸糇糮粻糉精粢籾籈糍籊簙籎籱粔糲糭籠粊粅糀簩粐糮簫粲籵籣糆糮簨糓粋簘籔籦籀粢糳糆簴粌籓籭籾精簕糚糁籁簩糍簊米粲糀糑粐粂簓籅簹粷籤籈簃粙簲簴籐糯簊糲簴粤簫类糒簳粐簝糽籦糚籦籬糛糂簚簟簊粺籃粬粭籵簡籕类簧籫簷簐粣糭粋糪糴簦糹簠簱糪簎簋糛粕粌糀粻籐籜簎簅籯糊籧簵粅糦粽糣簈簖糅簉糳籕籹籀糅簇糖簦簋糜糜粓糰米粉粎糴簠籜簧㳝㳿㲱㳞㰐㲬㲙㳇㳞㰙扎抃拐报拖拯抢扤抱抹拜抃抠戻抓技朗練\ufafe晴著\ufae3𥳐愈晴節⥩⧶⥘⥤⤵⥷⤙⤖⤇⤥⦯⤥⥗⧷⧉⥽⤎⧆⦙⧙⥇⧞⦕⥪⧣⤐⥊⤂⥙⧓⧎⤎⤡⧬⤐⧴⦮⤵⥜⥴⤃⥎⦝⥻⦹⥤⦢⤁⥢⦝⦅⥰⥎⥱⤝⦃ب؊لثۥٙ٬زث۬ᒵᐛᓥᑅᑭᓺᓀᐃᒸᒙᑈᑾᐪᓻᓯᓢ奼奞夐奿妱复夸奦奿妸";
      String[] var34 = new String[var33.length];

      while(true) {
         int var35 = 0;
         int var36 = 0;
         int var37 = 0;
         if (var38 == 0) {
            bba = var34;
            bbb = new Object[var34.length];
            int var49 = 0;
            int var10001 = 0;
            byte[] var10002 = "31TO\u009dtzß\bbÄâMe\u00953F.\u0098\u009d'o\u0084ç\u007f\u0080n\u0013'\u0015¼}$\u0001·Ø\"XÊ9}:k\u0002WY%(!úyÂH\\\u00ad\u009d¹S\u0006þò¸ätÞ/\u007fy0µ\u00911v\u0003È»Ë\u000bê,\u00ad*\u00103\u008cÜP\u0093æÜº\u009cÝ5\u0015.\u001b\u0006vþ\u000e\u008d§d\u0004B_È\u008a\u0017/\u0095)á¡\u0004\u0002®Iùû\u0082.q[¡ê!f>9tWI¦\u0010\u0086iyQ»\u0088^\u0007\u0005\u0096ù\u0085h¥r\u000eÜ\u0083\u0094^q[|^Ý%Ù\u000b_lÏßl\u0094ÉKý\u0006\u001eÔê®s:\u0013h»]g\u009bÎ¯½4Ø¢×ÜÀó\u0010nmÔf\u008eÎÁüä\u0099Ò\u008fH\u009bõ5Cª×?êkd;;ÔWn\u000b\u001a×¹S¾ÿBÝH\u0081\"Û\u001bÞ\u0088®\u0016â\u001exU\u0012 ¨_\u0085~,ª\u0003ðM\u0095Xp\\\u008f¨\u0097À\u0081øÙ|ßã¿d:¿ÏR)Q\u0091m\u008c\u0000\u0014\u009d¤~Gà\u0090ÏÇXh\u0089ç,9d(&]\u0015\u0099\u001f^\\\u008fÌz5\u0019\f¾@¥¦Øð;aJ>Ð)h²¿A¡ê\r=àRð¬nÛï\u008c\u001cÏ\u0085®Ë¡\u008cÌ·(\tÇ$0´äe¦Kö\u0005.\u0019±¯? ô\u008a£\u0087\u0087ÊÝæ°¥½°b»u\u0080(Ô\u0092L\u0095\u0016«\u0084\u0082\u0007À".getBytes("ISO-8859-1");
            bab = new int[99];

            int var103;
            do {
               bab[var49] = ((var10002[var10001] & 255) << 24 | (var10002[var10001 + 1] & 255) << 16 | (var10002[var10001 + 2] & 255) << 8 | var10002[var10001 + 3] & 255) ^ 265291312;
               ++var49;
               var103 = var10001 + 4;
               var10001 += 4;
            } while(var103 < var10002.length);

            String[] var16 = new String[4];
            int var20 = 0;
            String var19;
            int var21 = (var19 = aaaa('ȃ', (byte)4, 1038576061, (byte)-24)).length();
            int var18 = b(-2034745836, var42 ^ -1305642487);
            int var46 = -1;

            label163:
            while(true) {
               ++var46;
               String var50 = var19.substring(var46, var46 + var18);
               var10001 = -1;

               while(true) {
                  label158: {
                     char[] var60 = var50.toCharArray();
                     var103 = var60.length;
                     int var22 = 0;
                     var84 = var60;
                     int var63 = var103;
                     char[] var107;
                     int var127;
                     if (var103 <= 1) {
                        var107 = var60;
                        var127 = var22;
                     } else {
                        var84 = var60;
                        var63 = var103;
                        if (var103 <= var22) {
                           break label158;
                        }

                        var107 = var60;
                        var127 = var22;
                     }

                     while(true) {
                        char var138 = var107[var127];
                        int var142;
                        switch (var22 % b(-2034745834, var42 ^ 147403713)) {
                           case 0 -> var142 = b(-2034745847, var42 ^ 610183363);
                           case 1 -> var142 = b(-2034745848, var42 ^ -893107966);
                           case 2 -> var142 = b(-2034745845, var42 ^ -1938677978);
                           case 3 -> var142 = b(-2034745846, var42 ^ 830094786);
                           case 4 -> var142 = 1;
                           case 5 -> var142 = b(-2034745843, var42 ^ 1465630724);
                           default -> var142 = b(-2034745844, var42 ^ 1991083863);
                        }

                        var107[var127] = (char)(var138 ^ var142);
                        ++var22;
                        if (var63 == 0) {
                           var127 = var63;
                           var107 = var84;
                        } else {
                           if (var63 <= var22) {
                              break;
                           }

                           var107 = var84;
                           var127 = var22;
                        }
                     }
                  }

                  String var114 = (new String(var84)).intern();
                  switch (var10001) {
                     case 0:
                        var16[var20++] = var114;
                        if ((var46 += var18) >= var21) {
                           long var8 = 3671168114804477470L;
                           long[] var14 = new long[b(-2034745841, var42 ^ 481127699)];
                           int var11 = 0;
                           String var12;
                           int var13 = (var12 = aaaa((char)11244, (byte)12, 1038576063, (byte)106)).length();
                           int var10 = 0;

                           label134:
                           while(true) {
                              var10001 = var10;
                              var10 += 8;
                              byte[] var15 = var12.substring(var10001, var10).getBytes(aaaa((char)27450, (byte)111, 1038576062, (byte)44));
                              long[] var52 = var14;
                              var10001 = var11++;
                              long var89 = ((long)var15[0] & 255L) << b(-2034745842, var42 ^ 658817664) | ((long)var15[1] & 255L) << b(-2034745855, var42 ^ -512253609) | ((long)var15[2] & 255L) << b(-2034745856, var42 ^ -184782636) | ((long)var15[3] & 255L) << b(-2034745853, var42 ^ -30175245) | ((long)var15[4] & 255L) << b(-2034745854, var42 ^ 1885796375) | ((long)var15[5] & 255L) << b(-2034745851, var42 ^ -745507191) | ((long)var15[b(-2034745852, var42 ^ -119562657)] & 255L) << b(-2034745849, var42 ^ 32766438) | (long)var15[b(-2034745850, var42 ^ -1580188284)] & 255L;
                              byte var115 = -1;

                              while(true) {
                                 long var129 = var89 ^ var8;
                                 switch (var115) {
                                    case 0:
                                       var52[var10001] = var129;
                                       if (var10 >= var13) {
                                          aa = var14;
                                          aab = new Integer[b(-2034745808, var42 ^ -1524819857)];
                                          long var0 = 8890763572846293750L;
                                          long[] var6 = new long[b(-2034745805, var42 ^ -1763369247)];
                                          int var3 = 0;
                                          String var4;
                                          int var5 = (var4 = aaaa((char)'腂', (byte)55, 1038576059, (byte)-63)).length();
                                          int var2 = 0;

                                          label124:
                                          while(true) {
                                             var10001 = var2;
                                             var2 += 8;
                                             byte[] var7 = var4.substring(var10001, var2).getBytes(aaaa((char)'까', (byte)107, 1038576058, (byte)-81));
                                             var52 = var6;
                                             var10001 = var3++;
                                             var89 = ((long)var7[0] & 255L) << b(-2034745806, var42 ^ 125290822) | ((long)var7[1] & 255L) << b(-2034745803, var42 ^ 283092135) | ((long)var7[2] & 255L) << b(-2034745804, var42 ^ -384209703) | ((long)var7[3] & 255L) << b(-2034745801, var42 ^ -1645601120) | ((long)var7[4] & 255L) << b(-2034745802, var42 ^ 1195708180) | ((long)var7[5] & 255L) << b(-2034745815, var42 ^ 766318418) | ((long)var7[b(-2034745816, var42 ^ -367019426)] & 255L) << b(-2034745813, var42 ^ -1661003398) | (long)var7[b(-2034745814, var42 ^ 110448219)] & 255L;
                                             var115 = -1;

                                             while(true) {
                                                var129 = var89 ^ var0;
                                                switch (var115) {
                                                   case 0:
                                                      var52[var10001] = var129;
                                                      if (var2 >= var5) {
                                                         abb = var6;
                                                         bb = new Long[b(-2034745820, var42 ^ -469138769)];
                                                         long var23 = aab(b(-2034745817, var42 ^ -623251257), 2750037410507511816L);
                                                         long[] var29 = new long[5];
                                                         int var26 = 0;
                                                         String var27;
                                                         int var28 = (var27 = var16[0]).length();
                                                         int var25 = 0;

                                                         label114:
                                                         while(true) {
                                                            var10001 = var25;
                                                            var25 += 8;
                                                            byte[] var30 = var27.substring(var10001, var25).getBytes(var16[1]);
                                                            var52 = var29;
                                                            var10001 = var26++;
                                                            var89 = ((long)var30[0] & aab(b(-2034745818, var42 ^ -2074251874), 8659991527446012003L)) << baa(b(-2034745767, var42 ^ 171770009), 6319468333551894566L) | ((long)var30[1] & aab(b(-2034745768, var42 ^ -1976741006), 5163277039036291880L)) << baa(b(-2034745765, var42 ^ 1840333034), 1165005001467766005L) | ((long)var30[2] & aab(b(-2034745766, var42 ^ 588055355), 5163277039036291880L)) << baa(b(-2034745763, var42 ^ 1158971887), 3189654631723814057L) | ((long)var30[3] & aab(b(-2034745764, var42 ^ 891549071), 5163277039036291880L)) << baa(b(-2034745761, var42 ^ 1797078434), 2329447141747995843L) | ((long)var30[4] & aab(b(-2034745762, var42 ^ -286492510), 5163277039036291880L)) << baa(b(-2034745775, var42 ^ -1114627291), 7616610828026918556L) | ((long)var30[5] & aab(b(-2034745776, var42 ^ 1026143323), 5163277039036291880L)) << baa(b(-2034745773, var42 ^ 492601472), 3953063315242699786L) | ((long)var30[baa(b(-2034745774, var42 ^ -766052179), 2729929247708426325L)] & aab(b(-2034745771, var42 ^ 1668186763), 5163277039036291880L)) << baa(b(-2034745772, var42 ^ 1975268608), 8036643573724412654L) | (long)var30[baa(b(-2034745769, var42 ^ -478396728), 3179816896933225846L)] & aab(b(-2034745770, var42 ^ 1607926820), 5163277039036291880L);
                                                            var115 = -1;

                                                            while(true) {
                                                               var129 = var89 ^ var23;
                                                               switch (var115) {
                                                                  case 0:
                                                                     var52[var10001] = var129;
                                                                     if (var25 >= var28) {
                                                                        ab = var29;
                                                                        int var55 = b(-2034745736, var42 ^ -1226459712);
                                                                        aba = new Integer[5];
                                                                        b = aba(baa(var55, 1637090317964100784L), aab(b(-2034745733, var42 ^ 2129831256), 406717536955237772L));
                                                                        return;
                                                                     }
                                                                     break;
                                                                  default:
                                                                     var52[var10001] = var129;
                                                                     if (var25 < var28) {
                                                                        continue label114;
                                                                     }

                                                                     var28 = (var27 = var16[2]).length();
                                                                     var25 = 0;
                                                               }

                                                               var10001 = var25;
                                                               var25 += 8;
                                                               var30 = var27.substring(var10001, var25).getBytes(var16[3]);
                                                               var52 = var29;
                                                               var10001 = var26++;
                                                               var89 = ((long)var30[0] & aab(b(-2034745783, var42 ^ -1055877387), 5163277039036291880L)) << baa(b(-2034745784, var42 ^ 710526244), 3281439328001640551L) | ((long)var30[1] & aab(b(-2034745781, var42 ^ 1160805667), 5163277039036291880L)) << baa(b(-2034745782, var42 ^ -146001831), 3136427508796593555L) | ((long)var30[2] & aab(b(-2034745779, var42 ^ 182301204), 5163277039036291880L)) << baa(b(-2034745780, var42 ^ 368864312), 616592295003125145L) | ((long)var30[3] & aab(b(-2034745777, var42 ^ 2145326956), 5163277039036291880L)) << baa(b(-2034745778, var42 ^ 1992123123), 8566040416126304308L) | ((long)var30[4] & aab(b(-2034745791, var42 ^ -206112525), 5163277039036291880L)) << baa(b(-2034745792, var42 ^ 1318422904), 4335847300251027768L) | ((long)var30[5] & aab(b(-2034745789, var42 ^ -1316496913), 5163277039036291880L)) << baa(b(-2034745790, var42 ^ -473936858), 6792148658917017327L) | ((long)var30[baa(b(-2034745787, var42 ^ -628875396), 2323637253241618489L)] & aab(b(-2034745788, var42 ^ 2113279515), 5163277039036291880L)) << baa(b(-2034745785, var42 ^ 482353668), 4960215907516179025L) | (long)var30[baa(b(-2034745786, var42 ^ 1242787631), 321575522039930788L)] & aab(b(-2034745735, var42 ^ 2052655209), 5163277039036291880L);
                                                               var115 = 0;
                                                            }
                                                         }
                                                      }
                                                      break;
                                                   default:
                                                      var52[var10001] = var129;
                                                      if (var2 < var5) {
                                                         continue label124;
                                                      }

                                                      var5 = (var4 = aaaa((char)17166, (byte)123, 1038576053, (byte)93)).length();
                                                      var2 = 0;
                                                }

                                                var10001 = var2;
                                                var2 += 8;
                                                var7 = var4.substring(var10001, var2).getBytes(aaaa((char)'\uf160', (byte)-116, 1038576052, (byte)62));
                                                var52 = var6;
                                                var10001 = var3++;
                                                var89 = ((long)var7[0] & 255L) << b(-2034745811, var42 ^ 1966689400) | ((long)var7[1] & 255L) << b(-2034745812, var42 ^ -818774701) | ((long)var7[2] & 255L) << b(-2034745809, var42 ^ -979649285) | ((long)var7[3] & 255L) << b(-2034745810, var42 ^ -1052113855) | ((long)var7[4] & 255L) << b(-2034745823, var42 ^ -1803891338) | ((long)var7[5] & 255L) << b(-2034745824, var42 ^ 1126328663) | ((long)var7[b(-2034745821, var42 ^ -1196646656)] & 255L) << b(-2034745822, var42 ^ -659895188) | (long)var7[b(-2034745819, var42 ^ 1927266660)] & 255L;
                                                var115 = 0;
                                             }
                                          }
                                       }
                                       break;
                                    default:
                                       var52[var10001] = var129;
                                       if (var10 < var13) {
                                          continue label134;
                                       }

                                       var13 = (var12 = aaaa('쪴', (byte)-28, 1038576057, (byte)27)).length();
                                       var10 = 0;
                                 }

                                 var10001 = var10;
                                 var10 += 8;
                                 var15 = var12.substring(var10001, var10).getBytes(aaaa((char)21211, (byte)101, 1038576056, (byte)-114));
                                 var52 = var14;
                                 var10001 = var11++;
                                 var89 = ((long)var15[0] & 255L) << b(-2034745799, var42 ^ -1672483091) | ((long)var15[1] & 255L) << b(-2034745800, var42 ^ -1388809856) | ((long)var15[2] & 255L) << b(-2034745797, var42 ^ 2081992410) | ((long)var15[3] & 255L) << b(-2034745798, var42 ^ 1106873861) | ((long)var15[4] & 255L) << b(-2034745795, var42 ^ -1626568) | ((long)var15[5] & 255L) << b(-2034745796, var42 ^ -1831557702) | ((long)var15[b(-2034745793, var42 ^ 653411267)] & 255L) << b(-2034745794, var42 ^ -1960137744) | (long)var15[b(-2034745807, var42 ^ 659820185)] & 255L;
                                 var115 = 0;
                              }
                           }
                        }

                        var18 = var19.charAt(var46);
                        break;
                     default:
                        var16[var20++] = var114;
                        if ((var46 += var18) < var21) {
                           var18 = var19.charAt(var46);
                           continue label163;
                        }

                        var21 = (var19 = aaaa('裲', (byte)80, 1038576060, (byte)75)).length();
                        var18 = b(-2034745833, var42 ^ 1126355297);
                        var46 = -1;
                  }

                  ++var46;
                  var50 = var19.substring(var46, var46 + var18);
                  var10001 = 0;
               }
            }
         }

         do {
            var37 = var33[var35] ^ var31;
            char[] var39 = var32.substring(var36, var36 + var37).toCharArray();
            int var40 = 0;

            do {
               short var10000;
               switch (var40 % 5) {
                  case 0:
                  default:
                     var10000 = 90;
                     break;
                  case 1:
                     var10000 = 98;
                     break;
                  case 2:
                     var10000 = 48;
                     break;
                  case 3:
                     var10000 = 61;
                     break;
                  case 4:
                     var10000 = 230;
               }

               short var41 = var10000;
               var39[var40] = (char)(var39[var40] ^ var41);
               ++var40;
            } while(var40 < var39.length);

            var34[var35] = (new String(var39)).intern();
            var36 += var37;
            ++var35;
         } while(var35 < var33.length);

         var38 = 0;
      }
   }

   public static List bab(List param0, q2997348aa27a422480aea29cbfd800b1aaabaabab param1) {
      // $FF: Couldn't be decompiled
   }

   private static double bba(double var0, double var2, double var4) {
      return Math.max(var2, Math.min(var4, var0));
   }

   public static void bbb(class_332 var0, q2997348aa27a422480aea29cbfd800b1aaabaabab var1, boolean var2) {
   }
}
