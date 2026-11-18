package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

public final class q2997348aa27a422480aea29cbfd800b1abababbba {
   private static final Integer[] aa;
   private static final int[] aaa;
   private static final long[] ab;
   private static final Object[] aba;
   private static final String[] aab;
   private static final Integer[] ba;
   private static final long[] a;
   private static final long[] bb;
   private static final Long[] b;

   public static double aa(double var0, double var2, double var4) {
      return Math.max(var2, Math.min(var4, var0));
   }

   public static int ab(int var0, int var1, int var2) {
      return Math.max(var1, Math.min(var2, var0));
   }

   public static double ba(double var0, double var2, double var4, double var6) {
      double var8 = abbb(var0, (double)0.0F);
      double var10 = bab(var4, (double)1.0F);
      double var12 = bab(var6, (double)0.0F);
      double var14 = Math.max((double)0.0F, var10 - var12);
      double var16 = Math.max(abbb(var2, var14), var14);
      return var8 * (var10 + (var16 - var14) * (double)0.5F);
   }

   public static double bb(double var0, double var2, double var4, double var6) {
      double var8 = aa(var6 * var4, (double)0.0F, (double)1.0F);
      return ((double)1.0F - var8) * var0 + var8 * var2;
   }

   public static q2997348aa27a422480aea29cbfd800b1abbabaa aaa(double param0, double param2, double param4, double param6, double param8, double param10) {
      // $FF: Couldn't be decompiled
   }

   public static double aab(double var0, double var2, double var4) {
      return var0 + (var2 - var0) * var4;
   }

   public static boolean aba(double param0, double param2, double param4, double param6, double param8, double param10) {
      // $FF: Couldn't be decompiled
   }

   public static double abb(double var0, double var2, double var4) {
      return aab(var0, var2, aa(var4, (double)0.0F, (double)1.0F));
   }

   public static int baa(int var0, double var1) {
      int var3 = var0 >>> a(aaaa(b(-400381370, -1739574085 ^ -898708763), 2843899707787668028L), abab(b(-400381369, -1739574085 ^ -246151820), 788598938354538172L)) & a(aaaa(b(-400381372, -1739574085 ^ -1815475838), 6509451570667448502L), abab(b(-400381371, -1739574085 ^ 329282611), 7609344062879639880L));
      return abaa(var0, (int)((double)var3 * aa(var1, (double)0.0F, (double)1.0F)));
   }

   private static String baab(int var0, int var1) {
      int var3 = var0 ^ 765784820;
      char[] var4 = aab[var3].toCharArray();
      StackTraceElement[] var2 = (StackTraceElement[])aba[var3];
      StackTraceElement[] var5;
      if (var2 != null) {
         var5 = var2;
      } else {
         var5 = (new Throwable()).getStackTrace();
         aba[var3] = var5;
      }

      StackTraceElement var6 = var5[1];
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ 133403850;
      int var8 = 0;

      do {
         short var9;
         switch (var8 & 31) {
            case 0:
            default:
               var9 = 217;
               break;
            case 1:
               var9 = 164;
               break;
            case 2:
               var9 = 82;
               break;
            case 3:
               var9 = 122;
               break;
            case 4:
               var9 = 119;
               break;
            case 5:
               var9 = 66;
               break;
            case 6:
               var9 = 151;
               break;
            case 7:
               var9 = 154;
               break;
            case 8:
               var9 = 31;
               break;
            case 9:
               var9 = 55;
               break;
            case 10:
               var9 = 17;
               break;
            case 11:
               var9 = 255;
               break;
            case 12:
               var9 = 49;
               break;
            case 13:
               var9 = 28;
               break;
            case 14:
               var9 = 133;
               break;
            case 15:
               var9 = 170;
               break;
            case 16:
               var9 = 39;
               break;
            case 17:
               var9 = 141;
               break;
            case 18:
               var9 = 14;
               break;
            case 19:
               var9 = 171;
               break;
            case 20:
               var9 = 102;
               break;
            case 21:
               var9 = 227;
               break;
            case 22:
               var9 = 159;
               break;
            case 23:
               var9 = 245;
               break;
            case 24:
               var9 = 110;
               break;
            case 25:
               var9 = 166;
               break;
            case 26:
               var9 = 236;
               break;
            case 27:
               var9 = 113;
               break;
            case 28:
               var9 = 181;
               break;
            case 29:
               var9 = 209;
               break;
            case 30:
               var9 = 109;
               break;
            case 31:
               var9 = 143;
         }

         var4[var8] = (char)(var4[var8] ^ var9 ^ var1 >> 16 ^ var7);
         ++var8;
      } while(var8 < var4.length);

      return (new String(var4)).intern();
   }

   private static double bab(double param0, double param2) {
      // $FF: Couldn't be decompiled
   }

   public static q2997348aa27a422480aea29cbfd800b1abbabbabb bba(double param0, double param2, double param4, double param6, double param8, double param10) {
      // $FF: Couldn't be decompiled
   }

   public static double bbb(double var0, double var2, double var4) {
      return var0 + (var2 - var0) * aa(var4, (double)0.0F, (double)1.0F);
   }

   private static int b(int var0, int var1) {
      int var2 = aaa[var0 ^ -400381370] ^ var1 ^ var0;
      var2 ^= 63880;
      var2 -= 11574;
      var2 -= 20144;
      var2 ^= 17065;
      var2 ^= 50122;
      var2 ^= 48329;
      var2 -= 54635;
      var2 ^= 18825;
      return var2;
   }

   private static int aaaa(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ b(-400381374, -500275823 ^ 500321441);
      if (ba[var3] == null) {
         ba[var3] = (int)(ab[var3] ^ var1);
      }

      return ba[var3];
   }

   public static float aaab(float param0, float param1, float param2) {
      // $FF: Couldn't be decompiled
   }

   private q2997348aa27a422480aea29cbfd800b1abababbba() {
   }

   static {
      int var42 = 562087924;
      char[] var33 = "\u009dÁ$ÞÄÞ¼ÞÄÞ".toCharArray();
      String var32 = "ꎳꌁꍇꌮꌩꌯꍚꏌꎣꏈꏔꌌꎟꌐꎘꍓꌯꏒꏿꌪꍤꍴꍔꍔꌿꎛꍢꎖꎊꌰꍾꍏꌲꎟꏆꎸꏮꎶꏛꌴꏵꌽꎼꎽꏮꌩꏌꌜꌗꏔꎥꍸꏴꎀꏎꎋꍶꍽꌏꌪꏡꏜꎊꍢꏦꍼꎣꏠꎆꌅꎃꍄꎆ鎈鏐鍐鏘鍮鍟鏮鎗鏽錌鍌鏒錕鎦鏘鏘鍆鎤鎻鎶錶⊄∤⋯∛⋚∦⊰∐⊔≕⊊≠≠≲⊹⊻≹⋥≏∷∊∪≏⊁⋡⊍≱≒≶⊁∉⋙⊤≘⋷⋌∰⋿⋖≬⋖∌⊤⊸⋺⋺≈⋷⋁≔⊕⋸⋫⋳⋉√⋫⊳⊲∩⋟⋠≿⋶≵∋∠⋵∹∲∯∂≆⋫∲∿≰∤⊧⊥⊠≜≢≜∄⊇⊮⊔∋⊟≑≌⋉⊎∠⋌⊙⊁⊂⋒⋏≔⋳∲∎∩∧≈⋟⋸⊣≙⊞∹∧⋚≢⊒∕≀≁≬∪⋵⊱⊴⊣∟⊯≭⊆⋽⊿∼∆⋈⋓≇⊅⊍≱∜⋞⋘⊅⋊⊻∊∏⋡≨∺⋢⊌⋅∉≂∦≷⊃⊝⋮⋦∖∅⋅∪≳⊫∊⊤∲≖≥≸⊀≹≘≫⋝∣⊱⋘⊌⊚⊲⋩≉≬≿⊊⊖≐⊢−≒⊲≕≲⋑⊕⊛⊳∎≌⋤≋≰⊉≤⊚⋚≄⊵∵⊵⊳⋿∢∡⋗⋩∿⊎≢∔∕∺∑∓≷⋛⊶⋿≖⋉∋⊜≷∽ꥀ\ua95bꧡꤓ꧴ꦪꤎ꥟ꥶꦽ黵鸷麢鹲黍鸸麚鹬鸠鹿麧黚鸿鸥鹖鸿諮諵詏誽詚訄誠諱諘訓䆢䅲䇡䇔䆉䆭䄹䄗䇱䄚䇩䅶䇃䆸䇎䅿䄎䆂䆌䅫䆇䄤䄕䄦䄌䄠䅵䆊䇢䄧䄈䇾䇱䆞䅨䆥䇄䄛䆯䆽䄐䇹䇻䅂䆖䆵䄯䆉䇭䆿䅺䄡䆄䇱䆏䄟䄔䇄䆞䄖䅮䆥䇗䄽䆥䅽䅉䆋䅝䆥䇃䄲䄤䇵䇺䄾䅰䇺䄇䇸䅢䅶䄣䅗䄃䇿䇟䆎䆣䄗䄼䅧䆛䅘䆧䄰䇫䇁䅩䆒䅧䇧䇞䅘齜齇鿽鼏鿨龶鼒齃齪龡⠏⢁⣼⣙⡞⢎⡈⢁⠽⡈⣿⠽⣦⠋⡁⢠Ⓣⓒ⑨⒚⑽␣⒇ⓖ⓿\u2434";
      short var31 = 212;
      String[] var34 = new String[var33.length];
      byte var38 = -1;

      while(true) {
         int var35 = 0;
         int var36 = 0;
         int var37 = 0;
         if (var38 == 0) {
            aab = var34;
            aba = new Object[var34.length];
            int var49 = 0;
            int var10001 = 0;
            aaa = new int[120];
            byte[] var10002 = "ícÎ9ÖY\u001cÃ´Ç\u000bÒ4\u00ad@\u009b@¡¦ÄïYH=>£\u000fÓ8xRµpÅ,×Ýfä\u009a¥\u0085aÀ°\u00048¾Æ%\u0084NW\u0014¨¡Ð\u008d\u0099 Å. 3crÝ\u009d\u009e\u000f]\u0018µw\u008bàª\u0093¾-ÐrR\u009aR¦2åÉ]R«JÉ¡¹\u001d$D\u001b\u0006,t\u009fÌð\u001f\u0003ò\u001a³|]Ô_\u0083\u008d¢-À¨\u0082\u0006U×\u0083\u0098n¥*ÒA9\u0084³9ÿ~QØ\u008d\u0092¾7zÔöþÁÍæ*\u0006Ñ£²úk\u0096sÚ\u0089\u001c\u0000\u009e/¨f\u001ep<\u008cY\u0005\u0010î*oö\u00884a®¯\u001f¹oÄ\u000eÆ¢Ì\\x\u0094K®\u0005½H\u0091ÈÍ¬\u0011ß\u0004m%\u0002¸°'å\u009dÆT«B6Ço*\u0096¬Ä\u0095V|©XûÚæS\u0087\u0099l\u0019ÐV`]îTë\u0013<-\u00ad C\u0092t\u0093\u0080ñåP\u0002K^\u0081\u0007næ\u0085ó©X\u0001O¢Ò\u000fÛI\fIù\u008bhu%\u008eÔ·\u008bq\u0080ý¨¼®M\u0001\\k\u008daÍ\u008e-\u001fÅX\u0013¾1?F<fÓ,Þ\u0015ÛîÜ\u000eÍ[DwçËÛØd\u0016\u0080äT0\u00adû\u009c\t±Wùe\u0014\u00adå¿5NgáW\u007fs\u0005PÈOë»ñ><Ä¨\u0017ôjÙQ\f2,|´£2LÔcUó\u0002b¿h¸1\n\u0092\u0085ê\u0006'Ù¥\u0004Ôá@\u0081\u008d@dÖ\u0000\u001fJSdeH\u001bB\u008b$MN\u009b\u0083ù \u00943\u0002ÎÛ\u0019'\u0005\u008amF`\u009b´ \bê¼ô\u008eÞô\u0019w?J×\u0085òT\u0010ëÒ£i\u0085*4;LU\u008f«gA½ïªn\u000eT\u0091\tm\u0010Õe¹".getBytes("ISO-8859-1");

            int var102;
            do {
               aaa[var49] = ((var10002[var10001] & 255) << 24 | (var10002[var10001 + 1] & 255) << 16 | (var10002[var10001 + 2] & 255) << 8 | var10002[var10001 + 3] & 255) ^ 1467886750;
               ++var49;
               var102 = var10001 + 4;
               var10001 += 4;
            } while(var102 < var10002.length);

            String[] var16 = new String[4];
            int var20 = 0;
            String var19;
            int var21 = (var19 = baab(765784820, var42 ^ -533201708)).length();
            int var18 = b(-400381373, var42 ^ 1904504320);
            int var46 = -1;

            label166:
            while(true) {
               ++var46;
               String var50 = var19.substring(var46, var46 + var18);
               var10001 = -1;

               while(true) {
                  label161: {
                     char[] var59 = var50.toCharArray();
                     var102 = var59.length;
                     int var22 = 0;
                     var83 = var59;
                     int var62 = var102;
                     char[] var106;
                     int var126;
                     if (var102 <= 1) {
                        var106 = var59;
                        var126 = var22;
                     } else {
                        var83 = var59;
                        var62 = var102;
                        if (var102 <= var22) {
                           break label161;
                        }

                        var106 = var59;
                        var126 = var22;
                     }

                     while(true) {
                        char var137 = var106[var126];
                        int var141;
                        switch (var22 % b(-400381375, var42 ^ -1499106001)) {
                           case 0 -> var141 = b(-400381362, var42 ^ -300414214);
                           case 1 -> var141 = b(-400381361, var42 ^ 1136378743);
                           case 2 -> var141 = b(-400381364, var42 ^ 995641096);
                           case 3 -> var141 = b(-400381363, var42 ^ 785981073);
                           case 4 -> var141 = b(-400381366, var42 ^ 1492689885);
                           case 5 -> var141 = b(-400381365, var42 ^ -909537606);
                           default -> var141 = b(-400381368, var42 ^ 1313914835);
                        }

                        var106[var126] = (char)(var137 ^ var141);
                        ++var22;
                        if (var62 == 0) {
                           var126 = var62;
                           var106 = var83;
                        } else {
                           if (var62 <= var22) {
                              break;
                           }

                           var106 = var83;
                           var126 = var22;
                        }
                     }
                  }

                  String var113 = (new String(var83)).intern();
                  switch (var10001) {
                     case 0:
                        var16[var20++] = var113;
                        if ((var46 += var18) >= var21) {
                           long var8 = 3952760831326708472L;
                           long[] var14 = new long[b(-400381367, var42 ^ 1542686268)];
                           int var11 = 0;
                           String var12;
                           int var13 = (var12 = baab(765784822, var42 ^ 1637660738)).length();
                           int var10 = 0;

                           label137:
                           while(true) {
                              var10001 = var10;
                              var10 += 8;
                              byte[] var15 = var12.substring(var10001, var10).getBytes(baab(765784823, var42 ^ -359401998));
                              long[] var52 = var14;
                              var10001 = var11++;
                              long var88 = ((long)var15[0] & 255L) << b(-400381354, var42 ^ -38798411) | ((long)var15[1] & 255L) << b(-400381353, var42 ^ 13794265) | ((long)var15[2] & 255L) << b(-400381356, var42 ^ 732605914) | ((long)var15[3] & 255L) << b(-400381355, var42 ^ 877566014) | ((long)var15[4] & 255L) << b(-400381358, var42 ^ 1320121622) | ((long)var15[5] & 255L) << b(-400381357, var42 ^ -864348992) | ((long)var15[b(-400381360, var42 ^ 1468036399)] & 255L) << b(-400381359, var42 ^ -736852442) | (long)var15[b(-400381346, var42 ^ -2080808034)] & 255L;
                              byte var114 = -1;

                              while(true) {
                                 long var128 = var88 ^ var8;
                                 switch (var114) {
                                    case 0:
                                       var52[var10001] = var128;
                                       if (var10 >= var13) {
                                          ab = var14;
                                          ba = new Integer[b(-400381340, var42 ^ 1638103034)];
                                          long var0 = 5409614488039604218L;
                                          long[] var6 = new long[b(-400381339, var42 ^ 323983857)];
                                          int var3 = 0;
                                          String var4;
                                          int var5 = (var4 = baab(765784818, var42 ^ 37940670)).length();
                                          int var2 = 0;

                                          label127:
                                          while(true) {
                                             var10001 = var2;
                                             var2 += 8;
                                             byte[] var7 = var4.substring(var10001, var2).getBytes(baab(765784819, var42 ^ -594553476));
                                             var52 = var6;
                                             var10001 = var3++;
                                             var88 = ((long)var7[0] & 255L) << b(-400381342, var42 ^ -469118750) | ((long)var7[1] & 255L) << b(-400381341, var42 ^ 1594933471) | ((long)var7[2] & 255L) << b(-400381344, var42 ^ -1744009796) | ((long)var7[3] & 255L) << b(-400381343, var42 ^ 1689694292) | ((long)var7[4] & 255L) << b(-400381330, var42 ^ 1146370992) | ((long)var7[5] & 255L) << b(-400381329, var42 ^ 15896191) | ((long)var7[b(-400381332, var42 ^ -2136138956)] & 255L) << b(-400381331, var42 ^ -942131379) | (long)var7[b(-400381334, var42 ^ -1263349447)] & 255L;
                                             var114 = -1;

                                             while(true) {
                                                var128 = var88 ^ var0;
                                                switch (var114) {
                                                   case 0:
                                                      var52[var10001] = var128;
                                                      if (var2 >= var5) {
                                                         a = var6;
                                                         b = new Long[b(-400381328, var42 ^ -898210331)];
                                                         long var23 = abab(b(-400381327, var42 ^ 1504899100), 7311663906799339240L);
                                                         long[] var29 = new long[aaaa(b(-400381314, var42 ^ 840524919), 586286939359963315L)];
                                                         int var26 = 0;
                                                         String var27;
                                                         int var28 = (var27 = var16[0]).length();
                                                         int var25 = 0;

                                                         label117:
                                                         while(true) {
                                                            var10001 = var25;
                                                            var25 += 8;
                                                            byte[] var30 = var27.substring(var10001, var25).getBytes(var16[3]);
                                                            var52 = var29;
                                                            var10001 = var26++;
                                                            var88 = ((long)var30[0] & abab(b(-400381313, var42 ^ -495673387), 6720864292324976701L)) << aaaa(b(-400381316, var42 ^ 1144741634), 5371320744336016266L) | ((long)var30[1] & abab(b(-400381315, var42 ^ 129054564), 5673866382720930376L)) << aaaa(b(-400381318, var42 ^ -927108805), 6581144054611616713L) | ((long)var30[2] & abab(b(-400381317, var42 ^ -902414962), 5673866382720930376L)) << aaaa(b(-400381320, var42 ^ -1284482523), 5018301413034284770L) | ((long)var30[3] & abab(b(-400381319, var42 ^ 212450608), 5673866382720930376L)) << aaaa(b(-400381434, var42 ^ 1865961271), 4490486438395786080L) | ((long)var30[4] & abab(b(-400381433, var42 ^ -712790071), 5673866382720930376L)) << aaaa(b(-400381436, var42 ^ -264533190), 8411225925418762719L) | ((long)var30[5] & abab(b(-400381435, var42 ^ 931475331), 5673866382720930376L)) << aaaa(b(-400381438, var42 ^ 1007621022), 8813784585065909271L) | ((long)var30[aaaa(b(-400381437, var42 ^ -674136470), 3370711929088387851L)] & abab(b(-400381440, var42 ^ 364207084), 5673866382720930376L)) << aaaa(b(-400381439, var42 ^ 269084424), 381790789864853465L) | (long)var30[aaaa(b(-400381426, var42 ^ -279111628), 8507724923483714844L)] & abab(b(-400381425, var42 ^ 577987527), 5673866382720930376L);
                                                            var114 = -1;

                                                            while(true) {
                                                               var128 = var88 ^ var23;
                                                               switch (var114) {
                                                                  case 0:
                                                                     var52[var10001] = var128;
                                                                     if (var25 >= var28) {
                                                                        bb = var29;
                                                                        aa = new Integer[aaaa(b(-400381411, var42 ^ 919216013), 3602523995002758792L)];
                                                                        return;
                                                                     }
                                                                     break;
                                                                  default:
                                                                     var52[var10001] = var128;
                                                                     if (var25 < var28) {
                                                                        continue label117;
                                                                     }

                                                                     var28 = (var27 = var16[1]).length();
                                                                     var25 = 0;
                                                               }

                                                               var10001 = var25;
                                                               var25 += 8;
                                                               var30 = var27.substring(var10001, var25).getBytes(var16[2]);
                                                               var52 = var29;
                                                               var10001 = var26++;
                                                               var88 = ((long)var30[0] & abab(b(-400381428, var42 ^ -1028217948), 5673866382720930376L)) << aaaa(b(-400381427, var42 ^ 1397956706), 4321887174924131618L) | ((long)var30[1] & abab(b(-400381430, var42 ^ 1535458685), 5673866382720930376L)) << aaaa(b(-400381429, var42 ^ -1344137607), 6009168476176125867L) | ((long)var30[2] & abab(b(-400381432, var42 ^ -133299681), 5673866382720930376L)) << aaaa(b(-400381431, var42 ^ -1962477067), 2488036942268615356L) | ((long)var30[3] & abab(b(-400381418, var42 ^ -1877969509), 5673866382720930376L)) << aaaa(b(-400381417, var42 ^ -382041556), 954070845005070568L) | ((long)var30[4] & abab(b(-400381420, var42 ^ 1186543709), 5673866382720930376L)) << aaaa(b(-400381419, var42 ^ 2055808661), 7556200655076805219L) | ((long)var30[5] & abab(b(-400381422, var42 ^ 1698768746), 5673866382720930376L)) << aaaa(b(-400381421, var42 ^ -920352358), 323575802003422327L) | ((long)var30[aaaa(b(-400381424, var42 ^ 859366160), 8054058754908818512L)] & abab(b(-400381423, var42 ^ -793063537), 5673866382720930376L)) << aaaa(b(-400381410, var42 ^ -508641005), 2548569255710727072L) | (long)var30[aaaa(b(-400381409, var42 ^ 1452473371), 4943723759873673926L)] & abab(b(-400381412, var42 ^ 1877152273), 5673866382720930376L);
                                                               var114 = 0;
                                                            }
                                                         }
                                                      }
                                                      break;
                                                   default:
                                                      var52[var10001] = var128;
                                                      if (var2 < var5) {
                                                         continue label127;
                                                      }

                                                      var5 = (var4 = baab(765784828, var42 ^ 1805236351)).length();
                                                      var2 = 0;
                                                }

                                                var10001 = var2;
                                                var2 += 8;
                                                var7 = var4.substring(var10001, var2).getBytes(baab(765784829, var42 ^ 1729819829));
                                                var52 = var6;
                                                var10001 = var3++;
                                                var88 = ((long)var7[0] & 255L) << b(-400381333, var42 ^ -1430484806) | ((long)var7[1] & 255L) << b(-400381336, var42 ^ -2124134086) | ((long)var7[2] & 255L) << b(-400381335, var42 ^ -1877244725) | ((long)var7[3] & 255L) << b(-400381322, var42 ^ -1029328261) | ((long)var7[4] & 255L) << b(-400381321, var42 ^ 819501793) | ((long)var7[5] & 255L) << b(-400381324, var42 ^ 253094830) | ((long)var7[b(-400381323, var42 ^ -1895685172)] & 255L) << b(-400381326, var42 ^ -1142972660) | (long)var7[b(-400381325, var42 ^ -1187464594)] & 255L;
                                                var114 = 0;
                                             }
                                          }
                                       }
                                       break;
                                    default:
                                       var52[var10001] = var128;
                                       if (var10 < var13) {
                                          continue label137;
                                       }

                                       var13 = (var12 = baab(765784816, var42 ^ -585444138)).length();
                                       var10 = 0;
                                 }

                                 var10001 = var10;
                                 var10 += 8;
                                 var15 = var12.substring(var10001, var10).getBytes(baab(765784817, var42 ^ -918709381));
                                 var52 = var14;
                                 var10001 = var11++;
                                 var88 = ((long)var15[0] & 255L) << b(-400381345, var42 ^ -1729015106) | ((long)var15[1] & 255L) << b(-400381348, var42 ^ 1378695625) | ((long)var15[2] & 255L) << b(-400381347, var42 ^ 1825019215) | ((long)var15[3] & 255L) << b(-400381350, var42 ^ -1022789217) | ((long)var15[4] & 255L) << b(-400381349, var42 ^ 327092805) | ((long)var15[5] & 255L) << b(-400381352, var42 ^ 912203899) | ((long)var15[b(-400381351, var42 ^ 1230946275)] & 255L) << b(-400381338, var42 ^ 1006106089) | (long)var15[b(-400381337, var42 ^ -1487301499)] & 255L;
                                 var114 = 0;
                              }
                           }
                        }

                        var18 = var19.charAt(var46);
                        break;
                     default:
                        var16[var20++] = var113;
                        if ((var46 += var18) < var21) {
                           var18 = var19.charAt(var46);
                           continue label166;
                        }

                        var21 = (var19 = baab(765784821, var42 ^ -803950576)).length();
                        var18 = b(-400381376, var42 ^ -1602344869);
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
                     var10000 = 199;
                     break;
                  case 1:
                     var10000 = 187;
                     break;
                  case 2:
                     var10000 = 235;
                     break;
                  case 3:
                     var10000 = 83;
                     break;
                  case 4:
                     var10000 = 172;
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

   public static q2997348aa27a422480aea29cbfd800b1abbabaa aaba(q2997348aa27a422480aea29cbfd800b1abbabaa param0, Iterable param1, double param2, double param4) {
      // $FF: Couldn't be decompiled
   }

   public static double aabb(double var0, double var2, double var4, double var6) {
      double var8 = abbb(var0, (double)0.0F);
      double var10 = bab(var4, (double)1.0F);
      double var12 = bab(var6, (double)0.0F);
      double var14 = Math.max((double)0.0F, var10 - var12);
      double var16 = abbb(var2, var14);
      return var8 * Math.max(var16, var14);
   }

   public static int abaa(int var0, int var1) {
      int var2 = 710077332;
      return ab(var1, 0, a(aaaa(b(-400381414, var2 ^ 1281279026), 7631253123653923864L), abab(b(-400381413, var2 ^ -1183618616), 4607679777071914744L))) << a(aaaa(b(-400381416, var2 ^ -1488775643), 5013259567551406667L), abab(b(-400381415, var2 ^ -1057223172), 3381682759220661635L)) | var0 & a(aaaa(b(-400381402, var2 ^ 711439948), 2395207647035702860L), abab(b(-400381401, var2 ^ -1617081434), 3510554033472687612L));
   }

   private static long abab(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ b(-400381404, 1244100384 ^ -211978552)) & b(-400381403, 1244100384 ^ -240231582);
      if (b[var3] == null) {
         b[var3] = a[var3] ^ var1;
      }

      return b[var3];
   }

   private static int a(int param0, long param1) {
      // $FF: Couldn't be decompiled
   }

   public static int abba(int var0, int var1, double var2) {
      int var10 = 939887842;
      double var4 = aa(var2, (double)0.0F, (double)1.0F);
      int var6 = baaa(var0, var1, a(aaaa(b(-400381408, var10 ^ -734255528), 6595930930738284463L), abab(b(-400381407, var10 ^ -1675958939), 1207529310540203609L)), var4);
      int var7 = baaa(var0, var1, a(aaaa(b(-400381394, var10 ^ -904515269), 4574909192780151001L), abab(b(-400381393, var10 ^ 2121853563), 313935548564870745L)), var4);
      int var8 = baaa(var0, var1, a(aaaa(b(-400381396, var10 ^ -2053723064), 4350196122752756785L), abab(b(-400381395, var10 ^ -1604465723), 4877011957405676925L)), var4);
      int var9 = baaa(var0, var1, 0, var4);
      return var6 << a(aaaa(b(-400381398, var10 ^ -1053278538), 5013259567551406667L), abab(b(-400381397, var10 ^ -1487895962), 3381682759220661635L)) | var7 << a(aaaa(b(-400381400, var10 ^ 1943431929), 4500203035549913959L), abab(b(-400381399, var10 ^ -1641054596), 2439253609552246155L)) | var8 << a(aaaa(b(-400381386, var10 ^ 1356720889), 2030955494937104150L), abab(b(-400381385, var10 ^ -1749842918), 2832611965950459417L)) | var9;
   }

   private static double abbb(double param0, double param2) {
      // $FF: Couldn't be decompiled
   }

   private static int baaa(int var0, int var1, int var2, double var3) {
      int var7 = -1748823773;
      int var5 = var0 >>> var2 & a(aaaa(b(-400381388, var7 ^ 1092329792), 1890455656065633566L), abab(b(-400381387, var7 ^ 332567746), 89961251217734058L));
      int var6 = var1 >>> var2 & a(aaaa(b(-400381390, var7 ^ -2080804062), 7631253123653923864L), abab(b(-400381389, var7 ^ -952874502), 4607679777071914744L));
      return ab((int)aab((double)var5, (double)var6, var3), 0, a(aaaa(b(-400381392, var7 ^ 2081373168), 7631253123653923864L), abab(b(-400381391, var7 ^ 944456271), 4607679777071914744L)));
   }
}
