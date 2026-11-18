package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.atomic.AtomicLong;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public final class q2997348aa27a422480aea29cbfd800b1bbbabba {
   private static final long[] aa;
   private static final long[] ab;
   private final Deque ba = new ArrayDeque();
   private static final long[] bb;
   private static final Object[] bbb;
   private static final String[] bba;
   private static final int[] bab;
   private static final long[] a;
   private static final long aaa;
   private static final Long[] b;
   private static final Long[] aab;
   private static final Integer[] aba;
   private static final Integer[] abb;
   private final AtomicLong baa = new AtomicLong();

   public synchronized int aa(q2997348aa27a422480aea29cbfd800b1bbaabbba param1) {
      // $FF: Couldn't be decompiled
   }

   public synchronized q2997348aa27a422480aea29cbfd800b1aabbabaa ab(Object param1) {
      // $FF: Couldn't be decompiled
   }

   private static void ba(q2997348aa27a422480aea29cbfd800b1aaaabaa param0, int param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   public synchronized boolean bb() {
      int var1 = q2997348aa27a422480aea29cbfd800b1bbabab.aaab;

      boolean var10000;
      label36: {
         try {
            try {
               var10000 = this.ba.isEmpty();
               if (var1 != 0) {
                  return var10000;
               }

               if (!var10000) {
                  break label36;
               }
            } catch (IllegalStateException var2) {
               throw var2;
            }
         } catch (MatchException var3) {
            throw var3;
         }

         var10000 = false;
         return var10000;
      }

      var10000 = true;
      return var10000;
   }

   public synchronized boolean aaa(Object var1) {
      boolean var10000;
      try {
         try {
            if (this.abab(var1) != null) {
               var10000 = true;
               return var10000;
            }
         } catch (IllegalStateException var2) {
            throw var2;
         }
      } catch (MatchException var3) {
         throw var3;
      }

      var10000 = false;
      return var10000;
   }

   public synchronized boolean aab(Object param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   private static q2997348aa27a422480aea29cbfd800b1aabaaabab aba(int var0) {
      q2997348aa27a422480aea29cbfd800b1aabaaabab var10000;
      try {
         try {
            if (var0 > 0) {
               var10000 = q2997348aa27a422480aea29cbfd800b1aabaaabab.b;
               return var10000;
            }
         } catch (IllegalStateException var1) {
            throw var1;
         }
      } catch (MatchException var2) {
         throw var2;
      }

      var10000 = q2997348aa27a422480aea29cbfd800b1aabaaabab.aa;
      return var10000;
   }

   public synchronized boolean abb(Object param1) {
      // $FF: Couldn't be decompiled
   }

   private static String aabab(int var0, int var1) {
      int var3 = var0 ^ -1825643462;
      char[] var4 = bba[var3].toCharArray();
      StackTraceElement[] var2 = (StackTraceElement[])bbb[var3];
      StackTraceElement[] var5;
      if (var2 != null) {
         var5 = var2;
      } else {
         var5 = (new Throwable()).getStackTrace();
         bbb[var3] = var5;
      }

      StackTraceElement var6 = var5[1];
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ 682501602;
      int var8 = 0;

      do {
         short var9;
         switch (var8 & 31) {
            case 0:
            default:
               var9 = 17;
               break;
            case 1:
               var9 = 173;
               break;
            case 2:
               var9 = 45;
               break;
            case 3:
               var9 = 183;
               break;
            case 4:
               var9 = 174;
               break;
            case 5:
               var9 = 80;
               break;
            case 6:
               var9 = 216;
               break;
            case 7:
               var9 = 105;
               break;
            case 8:
               var9 = 78;
               break;
            case 9:
               var9 = 189;
               break;
            case 10:
               var9 = 167;
               break;
            case 11:
               var9 = 95;
               break;
            case 12:
               var9 = 127;
               break;
            case 13:
               var9 = 4;
               break;
            case 14:
               var9 = 194;
               break;
            case 15:
               var9 = 66;
               break;
            case 16:
               var9 = 37;
               break;
            case 17:
               var9 = 30;
               break;
            case 18:
               var9 = 248;
               break;
            case 19:
               var9 = 121;
               break;
            case 20:
               var9 = 158;
               break;
            case 21:
               var9 = 50;
               break;
            case 22:
               var9 = 102;
               break;
            case 23:
               var9 = 192;
               break;
            case 24:
               var9 = 29;
               break;
            case 25:
               var9 = 89;
               break;
            case 26:
               var9 = 207;
               break;
            case 27:
               var9 = 158;
               break;
            case 28:
               var9 = 139;
               break;
            case 29:
               var9 = 224;
               break;
            case 30:
               var9 = 49;
               break;
            case 31:
               var9 = 221;
         }

         var4[var8] = (char)(var4[var8] ^ var9 ^ var1 >> 16 ^ var7);
         ++var8;
      } while(var8 < var4.length);

      return (new String(var4)).intern();
   }

   public synchronized boolean baa(q2997348aa27a422480aea29cbfd800b1aabbbbb var1) {
      boolean var10000;
      try {
         try {
            if (this.aaab(var1) != null) {
               var10000 = true;
               return var10000;
            }
         } catch (IllegalStateException var2) {
            throw var2;
         }
      } catch (MatchException var3) {
         throw var3;
      }

      var10000 = false;
      return var10000;
   }

   private static boolean bab(q2997348aa27a422480aea29cbfd800b1bbaabbba param0, Object param1, int param2, q2997348aa27a422480aea29cbfd800b1aabbabaa param3) {
      // $FF: Couldn't be decompiled
   }

   public synchronized boolean bba() {
      int var10000 = q2997348aa27a422480aea29cbfd800b1bbabab.aaab;
      q2997348aa27a422480aea29cbfd800b1aaaabaa var2 = (q2997348aa27a422480aea29cbfd800b1aaaabaa)this.ba.peekFirst();
      int var1 = var10000;

      label35: {
         label34: {
            try {
               try {
                  var7 = var2;
                  if (var1 != 0) {
                     break label34;
                  }

                  if (var2 == null) {
                     break label35;
                  }
               } catch (IllegalStateException var5) {
                  throw var5;
               }
            } catch (MatchException var6) {
               throw var6;
            }

            var7 = var2;
         }

         try {
            try {
               if (var7.baa == q2997348aa27a422480aea29cbfd800b1aabbabaa.a) {
                  var10000 = 1;
                  return (boolean)var10000;
               }
            } catch (IllegalStateException var3) {
               throw var3;
            }
         } catch (MatchException var4) {
            throw var4;
         }
      }

      var10000 = 0;
      return (boolean)var10000;
   }

   public synchronized boolean bbb(Object param1) {
      // $FF: Couldn't be decompiled
   }

   public synchronized boolean aaaa(q2997348aa27a422480aea29cbfd800b1bbaabbba param1, q2997348aa27a422480aea29cbfd800b1aabbbbb param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   private q2997348aa27a422480aea29cbfd800b1aaaabaa aaab(q2997348aa27a422480aea29cbfd800b1aabbbbb param1) {
      // $FF: Couldn't be decompiled
   }

   static {
      int var55 = 2128655205;
      String[] var47 = new String[10];
      short var50 = 17290;
      int var10001 = ",岔琁峔듞咙\ue457兣ь壴⑂兘\ue49f唛ⓠ廔쐇哔哖剩ᑗ宓㑇傔㑍廸㒙冫䓥叔쐁峄蓘候\uf456幣푁兤\ue445常⒖偛ӣ岄䐎\u001b뿂⋢뾂\ue23d럏늴눵劯뮢犡눎㉴닭\uf20c롂勣똒鈶둿ꊴ냅\uf2ac먒劭뎮扼룍È蜗矖衇\ue702褊㞆詰瞕蛷析莫띅萸眴蒷柟螇㜅荚ឆ赐䞟職瞐贛蝄贸✺聧⟚葇圆謪螈譀ꞝ裇垒跛䝍荈\u1737襇䟟誷㜈袊ꞁ觠螜蠇យ蟻㝀趘圶覧៝趷霁莺ގ跐\uf79c袗잕蜛㝃蝈朹腧柘蹧霁肊螌訐ឞ貗Ꞙ荻靉諈蜶膇⟙蟷䜉赊鞊軠䞛菗Ꞝ荋蝃跸ꜵ臷㟖腗윏趺ފ諀瞛襇잞輛흍蝈㜻軗ߙ著܃胺잉迀\uf79b货랓诛\ue749迈뜼藧柒踇霏衪랋轰\uf796腧ស被睌躸机蝷ߛ螷\ue706辚힁踰힐覧랐苛❅詈Ꜿ胧\ua7dc豗✇虺\ue78d誠垞裷\uf790膻띃艈윳讗韟踗윂芊\ue787訐瞓臇䞜譫\ue744蟘蜹虇។著ᜂ轚鞌褀㞚蒇\uf79d进靎藸Ꜵ蠗ퟕ舧朆\n聒⋚菲戀豯䊌讥슐莢ʝ\u0010⅜걾⋼\uecaa↱갩⇫찹≌\uec3bⷐ㳥△䲖⟜䱺\n겛\uebf6꼻ꬬꂦ讠Ꝭ\u0bbc꽫쮱H㷜Ⱬ㭼벰㜡䰽㱛尤㻜Ⱙ㱰\uecfe㸳沏㫼걤㱌ಿ㜡밹㒛Ⱝ㖜\u0c29㫐泱㐃벂㠌汯〼䲰㿱\udc37㖛찤㾬谩㺀곸㰃벀㓼籪㳜沶ㅡ갿㵫ﰧ㦜찦㤀糾㻓㲃㶌ౡ㼼첷㜑\udc3b㿻鰬㽌谬　쳷㊃ⲉㆌ뱧\n\ue579ি\ue6d9䥥\ue944槩\uee8e\ue9f5\ue689⧸\u0010ꂒ狻ꏂȯꉿ抨Ʂ\ue2b9ꎢ늾ꞎꉧꇭ创곂당\n啢ሏ囂動奟牙底\uf245嚒㉈".length();
      int var49 = 0;
      int var46 = var10001;
      int var48 = 0;
      String var45 = ",岔琁峔듞咙\ue457兣ь壴⑂兘\ue49f唛ⓠ廔쐇哔哖剩ᑗ宓㑇傔㑍廸㒙冫䓥叔쐁峄蓘候\uf456幣푁兤\ue445常⒖偛ӣ岄䐎\u001b뿂⋢뾂\ue23d럏늴눵劯뮢犡눎㉴닭\uf20c롂勣똒鈶둿ꊴ냅\uf2ac먒劭뎮扼룍È蜗矖衇\ue702褊㞆詰瞕蛷析莫띅萸眴蒷柟螇㜅荚ឆ赐䞟職瞐贛蝄贸✺聧⟚葇圆謪螈譀ꞝ裇垒跛䝍荈\u1737襇䟟誷㜈袊ꞁ觠螜蠇យ蟻㝀趘圶覧៝趷霁莺ގ跐\uf79c袗잕蜛㝃蝈朹腧柘蹧霁肊螌訐ឞ貗Ꞙ荻靉諈蜶膇⟙蟷䜉赊鞊軠䞛菗Ꞝ荋蝃跸ꜵ臷㟖腗윏趺ފ諀瞛襇잞輛흍蝈㜻軗ߙ著܃胺잉迀\uf79b货랓诛\ue749迈뜼藧柒踇霏衪랋轰\uf796腧ស被睌躸机蝷ߛ螷\ue706辚힁踰힐覧랐苛❅詈Ꜿ胧\ua7dc豗✇虺\ue78d誠垞裷\uf790膻띃艈윳讗韟踗윂芊\ue787訐瞓臇䞜譫\ue744蟘蜹虇។著ᜂ轚鞌褀㞚蒇\uf79d进靎藸Ꜵ蠗ퟕ舧朆\n聒⋚菲戀豯䊌讥슐莢ʝ\u0010⅜걾⋼\uecaa↱갩⇫찹≌\uec3bⷐ㳥△䲖⟜䱺\n겛\uebf6꼻ꬬꂦ讠Ꝭ\u0bbc꽫쮱H㷜Ⱬ㭼벰㜡䰽㱛尤㻜Ⱙ㱰\uecfe㸳沏㫼걤㱌ಿ㜡밹㒛Ⱝ㖜\u0c29㫐泱㐃벂㠌汯〼䲰㿱\udc37㖛찤㾬谩㺀곸㰃벀㓼籪㳜沶ㅡ갿㵫ﰧ㦜찦㤀糾㻓㲃㶌ౡ㼼첷㜑\udc3b㿻鰬㽌谬　쳷㊃ⲉㆌ뱧\n\ue579ি\ue6d9䥥\ue944槩\uee8e\ue9f5\ue689⧸\u0010ꂒ狻ꏂȯꉿ抨Ʂ\ue2b9ꎢ늾ꞎꉧꇭ创곂당\n啢ሏ囂動奟牙底\uf245嚒㉈";

      do {
         int var10000 = var45.charAt(var49);
         int var53 = 0;
         char var51 = (char)var10000;
         char[] var52 = var45.substring(var49 + 1, var49 + 1 + var51).toCharArray();

         do {
            int var54 = var52[var53];
            switch (var53 % 7) {
               case 0:
               default:
                  var10000 = 16;
                  break;
               case 1:
                  var10000 = 80;
                  break;
               case 2:
                  var10000 = 16;
                  break;
               case 3:
                  var10000 = 140;
                  break;
               case 4:
                  var10000 = 205;
                  break;
               case 5:
                  var10000 = 15;
                  break;
               case 6:
                  var10000 = 183;
            }

            var54 = (char)var10000 ^ var54;
            if (var53 % 2 == 0) {
               var52[var53] = (char)((var54 >>> 4 | var54 << 12) & '\uffff' ^ var50);
            } else {
               var52[var53] = (char)((var54 << 4 | var54 >>> 12) & '\uffff' ^ var50);
            }

            ++var53;
         } while(var53 < var52.length);

         var47[var48] = new String(var52);
         ++var48;
         var49 = var49 + var51 + 1;
      } while(var49 < var46);

      bba = var47;
      bbb = new Object[var47.length];
      int var41 = -1419074881;
      byte[] var39 = "É>J\u0010BÄ(UÖ\u0001Àó¾\u0086[\u0087P\u0086\u0095]É¯\u008cFDÊÔyqA\u0005ê\u008c\u0086dÚë\bºf-¢\u0010Ðí9Mþ÷)GÂ²Ê£Þ\u0083Ëºó¿(¨Ó\u0006/s=r%\u008fh\u00849a´\u008a\u009d\u0084 ho&\u0087Ü³Æ<\rÖ\u0098Í \u001f\u0086K\u000fÝæ\u0098\u0014\u0002\u0003\u0086X\u0097EMÑV6\"<hú`uEnJu¨d6æ\u0000W$\u0091«|\u000f\u001a¶ET\u007ff #)x(E§\u009f+Í\u0019i\u009aè \u0094\u008daS°Ê¦×\u0013ºPzT¢\u0002¯æ£B\u0084R4bîDw\u009dR$ÂY{ã£ë& \u000b\u0005;´ù®ËåV\u009dX¯é\u0099å\u001c´£÷ïû\"C\u001db\u001c¾`£|{ø1_ñ5û/Ìq\u000fÂ_\u0089\u0007\u0004ë \u0086aÀ{ç\"äZ¼=nF,îÎ\u008bG\rR\u009bOÈ£\u008f6\u0085mVh\u0003\u007ff\u0012\u0091W¦èÁg\u0092Ed\u0080-t\u0001>·%.IN\u0087à7iY\u0085\u0094ë÷\bÄÚnFøó)ú\b\u001fÎp3w\u0097\u008eve\u0002oºJü6?\r\u001eõ:=b\u00ad°õùè\u008a\u000b \u0094¸\u0011½¡ø\bk\u000f\r\u0006àþ\u0016ãwÙ\u009e3\u0088e*x\u0099lÚ6\"&\u009e\u001a5¶í\u0005\nJãU\u0000¿kÜ\f\u0014b\u0089K\u001d\"æ!\n\u0092?¨\u009cò0wò\u0097(¨¡H21ë\u009aW8ÖÉÃô\u008c\u0014\u0090ÿ\u009a\u0083Ã\u0086°\u008döS~Oý?\rã§;\u001a\u0006É*\tâÑèIº@\u0018\n\u001f²K®mhý*\u009fHú4 }¹7ýèoáFÅ1tB¸vCø\u008e\u0090Ü\n£\u0097G".getBytes("ISO-8859-1");
      int var40 = var39.length / 4;
      bab = new int[var40];
      int var42 = 0;
      int var43 = 0;

      do {
         int var44 = (var39[var42] & 255) << 24 | (var39[var42 + 1] & 255) << 16 | (var39[var42 + 2] & 255) << 8 | var39[var42 + 3] & 255;
         var44 ^= var41;
         bab[var43] = var44;
         var42 += 4;
         ++var43;
      } while(var43 < var40);

      String[] var16 = new String[5];
      int var20 = 0;
      String var19;
      int var21 = (var19 = aabab(-1825643462, var55 ^ -17513357)).length();
      int var18 = b(-774015429, var55 ^ 1987267852);
      int var59 = -1;

      label174:
      while(true) {
         ++var59;
         String var64 = var19.substring(var59, var59 + var18);
         var10001 = -1;

         while(true) {
            char[] var92;
            label169: {
               char[] var72 = var64.toCharArray();
               int var10003 = var72.length;
               int var22 = 0;
               var92 = var72;
               int var75 = var10003;
               char[] var106;
               int var10004;
               if (var10003 <= 1) {
                  var106 = var72;
                  var10004 = var22;
               } else {
                  var92 = var72;
                  var75 = var10003;
                  if (var10003 <= var22) {
                     break label169;
                  }

                  var106 = var72;
                  var10004 = var22;
               }

               while(true) {
                  char var10005 = var106[var10004];
                  int var10006;
                  switch (var22 % b(-774015431, var55 ^ -1899280701)) {
                     case 0 -> var10006 = b(-774015426, var55 ^ 1815733462);
                     case 1 -> var10006 = b(-774015425, var55 ^ -656079771);
                     case 2 -> var10006 = 4;
                     case 3 -> var10006 = b(-774015428, var55 ^ 159406719);
                     case 4 -> var10006 = b(-774015427, var55 ^ -1538702246);
                     case 5 -> var10006 = b(-774015438, var55 ^ 193668275);
                     default -> var10006 = b(-774015437, var55 ^ 273990138);
                  }

                  var106[var10004] = (char)(var10005 ^ var10006);
                  ++var22;
                  if (var75 == 0) {
                     var10004 = var75;
                     var106 = var92;
                  } else {
                     if (var75 <= var22) {
                        break;
                     }

                     var106 = var92;
                     var10004 = var22;
                  }
               }
            }

            String var113 = (new String(var92)).intern();
            switch (var10001) {
               case 0:
                  var16[var20++] = var113;
                  if ((var59 += var18) >= var21) {
                     long var8 = 6349285382559662059L;
                     long[] var14 = new long[b(-774015440, var55 ^ 1556187123)];
                     int var11 = 0;
                     String var12;
                     int var13 = (var12 = aabab(-1825643464, var55 ^ -1018515408)).length();
                     int var10 = 0;

                     label145:
                     while(true) {
                        var10001 = var10;
                        var10 += 8;
                        byte[] var15 = var12.substring(var10001, var10).getBytes(aabab(-1825643463, var55 ^ -1828528378));
                        long[] var66 = var14;
                        var10001 = var11++;
                        long var97 = ((long)var15[0] & 255L) << b(-774015439, var55 ^ -721357722) | ((long)var15[1] & 255L) << b(-774015434, var55 ^ 943601899) | ((long)var15[2] & 255L) << b(-774015433, var55 ^ 1897114872) | ((long)var15[3] & 255L) << b(-774015436, var55 ^ 1912514191) | ((long)var15[4] & 255L) << b(-774015435, var55 ^ -497642108) | ((long)var15[5] & 255L) << b(-774015478, var55 ^ -1778532776) | ((long)var15[b(-774015477, var55 ^ 518031108)] & 255L) << b(-774015480, var55 ^ 2066801294) | (long)var15[b(-774015479, var55 ^ 758049302)] & 255L;
                        byte var114 = -1;

                        while(true) {
                           long var122 = var97 ^ var8;
                           switch (var114) {
                              case 0:
                                 var66[var10001] = var122;
                                 if (var10 >= var13) {
                                    bb = var14;
                                    aba = new Integer[b(-774015481, var55 ^ 1450311888)];
                                    long var0 = 3631513494564289257L;
                                    long[] var6 = new long[b(-774015484, var55 ^ 2142593457)];
                                    int var3 = 0;
                                    String var4;
                                    int var5 = (var4 = aabab(-1825643460, var55 ^ 2024654235)).length();
                                    int var2 = 0;

                                    label135:
                                    while(true) {
                                       var10001 = var2;
                                       var2 += 8;
                                       byte[] var7 = var4.substring(var10001, var2).getBytes(aabab(-1825643459, var55 ^ 626064292));
                                       var66 = var6;
                                       var10001 = var3++;
                                       var97 = ((long)var7[0] & 255L) << b(-774015483, var55 ^ 586598773) | ((long)var7[1] & 255L) << b(-774015462, var55 ^ 1071790857) | ((long)var7[2] & 255L) << b(-774015461, var55 ^ -810314749) | ((long)var7[3] & 255L) << b(-774015464, var55 ^ 1559833356) | ((long)var7[4] & 255L) << b(-774015463, var55 ^ -515213777) | ((long)var7[5] & 255L) << b(-774015458, var55 ^ -205964959) | ((long)var7[b(-774015457, var55 ^ 1196138584)] & 255L) << b(-774015460, var55 ^ -1170841147) | (long)var7[b(-774015459, var55 ^ 2142171928)] & 255L;
                                       var114 = -1;

                                       while(true) {
                                          var122 = var97 ^ var0;
                                          switch (var114) {
                                             case 0:
                                                var66[var10001] = var122;
                                                if (var2 >= var5) {
                                                   aa = var6;
                                                   b = new Long[b(-774015381, var55 ^ -1478888272)];
                                                   long var31 = bbbb(b(-774015384, var55 ^ 1761833505), 1030245956089093601L);
                                                   long[] var37 = new long[2];
                                                   int var34 = 0;
                                                   String var35;
                                                   int var36 = (var35 = var16[2]).length();
                                                   int var33 = 0;

                                                   do {
                                                      var10001 = var33;
                                                      var33 += 8;
                                                      byte[] var38 = var35.substring(var10001, var33).getBytes(var16[0]);
                                                      var10001 = var34++;
                                                      var122 = (((long)var38[0] & bbbb(b(-774015383, var55 ^ 2066961301), 2446418457408538871L)) << bbaa(b(-774015378, var55 ^ 1408492525), 7789898507320288115L) | ((long)var38[1] & bbbb(b(-774015377, var55 ^ 1673836134), 8721720400422075132L)) << bbaa(b(-774015380, var55 ^ -2072482358), 2954547860320432444L) | ((long)var38[2] & bbbb(b(-774015379, var55 ^ 987878958), 8721720400422075132L)) << bbaa(b(-774015390, var55 ^ 1293642893), 4476374981043946402L) | ((long)var38[3] & bbbb(b(-774015389, var55 ^ 859810443), 8721720400422075132L)) << bbaa(b(-774015392, var55 ^ -1866658758), 5956432368560296755L) | ((long)var38[4] & bbbb(b(-774015391, var55 ^ -1064526518), 8721720400422075132L)) << bbaa(b(-774015386, var55 ^ -56219684), 8712908991837136998L) | ((long)var38[5] & bbbb(b(-774015385, var55 ^ 206126458), 8721720400422075132L)) << bbaa(b(-774015388, var55 ^ 925007392), 7049346611782651133L) | ((long)var38[bbaa(b(-774015387, var55 ^ 1915998770), 5438701306481408646L)] & bbbb(b(-774015366, var55 ^ -1105457375), 8721720400422075132L)) << bbaa(b(-774015365, var55 ^ 995625177), 4164332975634751599L) | (long)var38[bbaa(b(-774015368, var55 ^ 1047245592), 4538448034022057153L)] & bbbb(b(-774015367, var55 ^ -1264383236), 8721720400422075132L)) ^ var31;
                                                      var114 = -1;
                                                      var37[var10001] = var122;
                                                   } while(var33 < var36);

                                                   ab = var37;
                                                   abb = new Integer[2];
                                                   long var23 = bbbb(b(-774015362, var55 ^ -1906401308), 3247215825949900325L);
                                                   long[] var29 = new long[4];
                                                   int var26 = 0;
                                                   String var27;
                                                   int var28 = (var27 = var16[1]).length();
                                                   int var25 = 0;

                                                   label120:
                                                   while(true) {
                                                      var10001 = var25;
                                                      var25 += 8;
                                                      byte[] var30 = var27.substring(var10001, var25).getBytes(var16[3]);
                                                      var66 = var29;
                                                      var10001 = var26++;
                                                      var97 = ((long)var30[0] & bbbb(b(-774015361, var55 ^ -1136177485), 8721720400422075132L)) << bbaa(b(-774015364, var55 ^ -61004183), 6785582919057354095L) | ((long)var30[1] & bbbb(b(-774015363, var55 ^ 156242926), 8721720400422075132L)) << bbaa(b(-774015374, var55 ^ 313946493), 2528851562300938218L) | ((long)var30[2] & bbbb(b(-774015373, var55 ^ -1704625285), 8721720400422075132L)) << bbaa(b(-774015376, var55 ^ 774744061), 1800785373024690153L) | ((long)var30[3] & bbbb(b(-774015375, var55 ^ -564080326), 8721720400422075132L)) << bbaa(b(-774015370, var55 ^ -1706085574), 1480984431163021277L) | ((long)var30[4] & bbbb(b(-774015369, var55 ^ -380372656), 8721720400422075132L)) << bbaa(b(-774015372, var55 ^ -419168816), 613859668838702438L) | ((long)var30[5] & bbbb(b(-774015371, var55 ^ 1871380236), 8721720400422075132L)) << bbaa(b(-774015414, var55 ^ 1725716975), 2624625019227907072L) | ((long)var30[bbaa(b(-774015413, var55 ^ 649270476), 3867324009041560834L)] & bbbb(b(-774015416, var55 ^ -1771480135), 8721720400422075132L)) << bbaa(b(-774015415, var55 ^ -161138076), 2579487926746425525L) | (long)var30[bbaa(b(-774015410, var55 ^ -1820485668), 6113026891283308416L)] & bbbb(b(-774015409, var55 ^ 1281671881), 8721720400422075132L);
                                                      var114 = -1;

                                                      while(true) {
                                                         var122 = var97 ^ var23;
                                                         switch (var114) {
                                                            case 0:
                                                               var66[var10001] = var122;
                                                               if (var25 >= var28) {
                                                                  a = var29;
                                                                  int var69 = b(-774015395, var55 ^ -52721708);
                                                                  aab = new Long[4];
                                                                  aaa = babb(bbaa(var69, 8488136711834838903L), bbbb(b(-774015406, var55 ^ 250950582), 7290411758071272519L));
                                                                  return;
                                                               }
                                                               break;
                                                            default:
                                                               var66[var10001] = var122;
                                                               if (var25 < var28) {
                                                                  continue label120;
                                                               }

                                                               var28 = (var27 = var16[4]).length();
                                                               var25 = 0;
                                                         }

                                                         var10001 = var25;
                                                         var25 += 8;
                                                         var30 = var27.substring(var10001, var25).getBytes(var16[3]);
                                                         var66 = var29;
                                                         var10001 = var26++;
                                                         var97 = ((long)var30[0] & bbbb(b(-774015412, var55 ^ -1644049417), 8721720400422075132L)) << bbaa(b(-774015411, var55 ^ -845760037), 6785582919057354095L) | ((long)var30[1] & bbbb(b(-774015422, var55 ^ 281414837), 8721720400422075132L)) << bbaa(b(-774015421, var55 ^ -2020179931), 2528851562300938218L) | ((long)var30[2] & bbbb(b(-774015424, var55 ^ -1985961901), 8721720400422075132L)) << bbaa(b(-774015423, var55 ^ 1269301677), 1800785373024690153L) | ((long)var30[3] & bbbb(b(-774015418, var55 ^ -403584975), 8721720400422075132L)) << bbaa(b(-774015417, var55 ^ 43789492), 1480984431163021277L) | ((long)var30[4] & bbbb(b(-774015420, var55 ^ -427353248), 8721720400422075132L)) << bbaa(b(-774015419, var55 ^ -1105795756), 613859668838702438L) | ((long)var30[5] & bbbb(b(-774015398, var55 ^ 467974297), 8721720400422075132L)) << bbaa(b(-774015397, var55 ^ 1765666761), 2624625019227907072L) | ((long)var30[bbaa(b(-774015400, var55 ^ -1692545055), 3867324009041560834L)] & bbbb(b(-774015399, var55 ^ 606816771), 8721720400422075132L)) << bbaa(b(-774015394, var55 ^ -105045408), 2579487926746425525L) | (long)var30[bbaa(b(-774015393, var55 ^ 1116737048), 6113026891283308416L)] & bbbb(b(-774015396, var55 ^ 1190036850), 8721720400422075132L);
                                                         var114 = 0;
                                                      }
                                                   }
                                                }
                                                break;
                                             default:
                                                var66[var10001] = var122;
                                                if (var2 < var5) {
                                                   continue label135;
                                                }

                                                var5 = (var4 = aabab(-1825643470, var55 ^ -1858951979)).length();
                                                var2 = 0;
                                          }

                                          var10001 = var2;
                                          var2 += 8;
                                          var7 = var4.substring(var10001, var2).getBytes(aabab(-1825643469, var55 ^ -1638796169));
                                          var66 = var6;
                                          var10001 = var3++;
                                          var97 = ((long)var7[0] & 255L) << b(-774015470, var55 ^ -178046648) | ((long)var7[1] & 255L) << b(-774015469, var55 ^ -936915604) | ((long)var7[2] & 255L) << b(-774015472, var55 ^ 1541391761) | ((long)var7[3] & 255L) << b(-774015471, var55 ^ -269073155) | ((long)var7[4] & 255L) << b(-774015466, var55 ^ -1003674207) | ((long)var7[5] & 255L) << b(-774015465, var55 ^ -536052105) | ((long)var7[b(-774015468, var55 ^ 1779494561)] & 255L) << b(-774015467, var55 ^ -891451971) | (long)var7[b(-774015382, var55 ^ 1456311800)] & 255L;
                                          var114 = 0;
                                       }
                                    }
                                 }
                                 break;
                              default:
                                 var66[var10001] = var122;
                                 if (var10 < var13) {
                                    continue label145;
                                 }

                                 var13 = (var12 = aabab(-1825643458, var55 ^ 2032910355)).length();
                                 var10 = 0;
                           }

                           var10001 = var10;
                           var10 += 8;
                           var15 = var12.substring(var10001, var10).getBytes(aabab(-1825643457, var55 ^ 30332087));
                           var66 = var14;
                           var10001 = var11++;
                           var97 = ((long)var15[0] & 255L) << b(-774015474, var55 ^ -1547048522) | ((long)var15[1] & 255L) << b(-774015473, var55 ^ 490690650) | ((long)var15[2] & 255L) << b(-774015476, var55 ^ -1530769432) | ((long)var15[3] & 255L) << b(-774015475, var55 ^ 1474693158) | ((long)var15[4] & 255L) << b(-774015486, var55 ^ -750421817) | ((long)var15[5] & 255L) << b(-774015485, var55 ^ 2114084956) | ((long)var15[b(-774015488, var55 ^ -1414504167)] & 255L) << b(-774015487, var55 ^ -2147158330) | (long)var15[b(-774015482, var55 ^ -367872575)] & 255L;
                           var114 = 0;
                        }
                     }
                  }

                  var18 = var19.charAt(var59);
                  break;
               default:
                  var16[var20++] = var113;
                  if ((var59 += var18) < var21) {
                     var18 = var19.charAt(var59);
                     continue label174;
                  }

                  var21 = (var19 = aabab(-1825643461, var55 ^ -1866350370)).length();
                  var18 = b(-774015432, var55 ^ -2140167213);
                  var59 = -1;
            }

            ++var59;
            var64 = var19.substring(var59, var59 + var18);
            var10001 = 0;
         }
      }
   }

   public synchronized boolean aaba(q2997348aa27a422480aea29cbfd800b1bbaabbba param1, q2997348aa27a422480aea29cbfd800b1aabbbbb param2, int param3, q2997348aa27a422480aea29cbfd800b1aabbabaa param4, int param5) {
      // $FF: Couldn't be decompiled
   }

   public synchronized void aabb(q2997348aa27a422480aea29cbfd800b1bbaabbba param1, q2997348aa27a422480aea29cbfd800b1aabbbbb param2, q2997348aa27a422480aea29cbfd800b1a param3) {
      // $FF: Couldn't be decompiled
   }

   public synchronized void abaa() {
      this.ba.clear();
   }

   private q2997348aa27a422480aea29cbfd800b1aaaabaa abab(Object param1) {
      // $FF: Couldn't be decompiled
   }

   public synchronized boolean abba(q2997348aa27a422480aea29cbfd800b1aabbbbb param1, int param2, int param3, q2997348aa27a422480aea29cbfd800b1aabaaabab param4) {
      // $FF: Couldn't be decompiled
   }

   public synchronized q2997348aa27a422480aea29cbfd800b1aabbbbb abbb(q2997348aa27a422480aea29cbfd800b1bbaabbba param1, Object param2, int param3, q2997348aa27a422480aea29cbfd800b1aabbabaa param4, int param5, boolean param6, Runnable param7) {
      // $FF: Couldn't be decompiled
   }

   public synchronized int baaa() {
      return this.ba.size();
   }

   private static q2997348aa27a422480aea29cbfd800b1aabbabaa baab(q2997348aa27a422480aea29cbfd800b1aabbabaa param0) {
      // $FF: Couldn't be decompiled
   }

   public synchronized void baba(q2997348aa27a422480aea29cbfd800b1bbaabbba param1, q2997348aa27a422480aea29cbfd800b1aabaaabab param2) {
      // $FF: Couldn't be decompiled
   }

   private static long babb(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ bbaa(b(-774015454, -2013271735 ^ 1909440593), 1927429492908578817L)) & bbaa(b(-774015453, -2013271735 ^ 373426591), 1529651871499160724L);

      try {
         if (aab[var3] == null) {
            aab[var3] = a[var3] ^ var1;
         }
      } catch (MatchException var4) {
         throw var4;
      }

      return aab[var3];
   }

   private static int bbaa(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ b(-774015456, -406699112 ^ -1328163139);
      if (aba[var3] == null) {
         aba[var3] = (int)(bb[var3] ^ var1);
      }

      return aba[var3];
   }

   public synchronized q2997348aa27a422480aea29cbfd800b1aabbbbb bbab(q2997348aa27a422480aea29cbfd800b1bbaabbba param1, Object param2, int param3, q2997348aa27a422480aea29cbfd800b1aabbabaa param4, int param5, boolean param6, Runnable param7) {
      // $FF: Couldn't be decompiled
   }

   private static void bbba(q2997348aa27a422480aea29cbfd800b1aaaabaa var0) {
      Runnable var2 = var0.ab;
      int var1 = q2997348aa27a422480aea29cbfd800b1bbabab.aaab;

      try {
         var0.ab = null;
         if (var1 != 0 || var2 == null) {
            return;
         }
      } catch (Throwable var5) {
         throw var5;
      }

      try {
         var2.run();
      } catch (Throwable var4) {
      }

   }

   private static long bbbb(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ b(-774015449, 1601389564 ^ -1760814206)) & b(-774015452, 1601389564 ^ -1509095188);
      if (b[var3] == null) {
         b[var3] = aa[var3] ^ var1;
      }

      return b[var3];
   }

   private void a(q2997348aa27a422480aea29cbfd800b1bbaabbba param1, q2997348aa27a422480aea29cbfd800b1aaaabaa param2) {
      // $FF: Couldn't be decompiled
   }

   public synchronized void aaaaa(q2997348aa27a422480aea29cbfd800b1bbaabbba param1, Object param2, q2997348aa27a422480aea29cbfd800b1a param3) {
      // $FF: Couldn't be decompiled
   }

   private static int aaaab(int param0, long param1) {
      // $FF: Couldn't be decompiled
   }

   public synchronized boolean aaaba(Object param1, int param2, int param3, q2997348aa27a422480aea29cbfd800b1aabaaabab param4) {
      // $FF: Couldn't be decompiled
   }

   private static int b(int var0, int var1) {
      int var2 = bab[var0 ^ -774015446] ^ var1 ^ var0;
      var2 -= 61719;
      var2 -= 15065;
      var2 -= 9596;
      var2 -= 3311;
      var2 -= 12784;
      var2 ^= 43886;
      var2 ^= 2121;
      var2 ^= 64772;
      var2 -= 19215;
      return var2;
   }

   public synchronized int aaabb(Object param1) {
      // $FF: Couldn't be decompiled
   }

   private void aabaa(q2997348aa27a422480aea29cbfd800b1aaaabaa param1) {
      // $FF: Couldn't be decompiled
   }
}
