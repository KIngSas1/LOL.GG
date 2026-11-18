package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1792;
import net.minecraft.class_1802;

@Environment(EnvType.CLIENT)
final class q2997348aa27a422480aea29cbfd800b1bbabbaa {
   private static final Object[] ab;
   private static final String[] aa;
   private static final int[] b;
   private static final class_1792[] a;

   static {
      int var48 = 547478497;
      char[] var39 = "\u001b8\n\u0010\n\u0018\n".toCharArray();
      byte var44 = -1;
      String var38 = "峮掁据掜层捣揃捑屌捪揲島掁掔挂屓掽捖挤捺接峔屆尪層挀控놻낪뀃냬끷낝뀞끯뀬냾녎넧냑낁냧낸뇃끓놂끻뀨끮낸낛냝뀚끪낤끷낝뀞끿냵낔넨냚냑낁냧날뀴나냰낟뀨끮낸끶뀜뀟끬냲끷낝뀞끩ﵺﵺﶹ\ufdef︫ﻏﺆﻔﶧ︳❁⟵ₒ➯❓❉❂❣⟚⃚➋❬⟵❕➻➴乆侾亽俓伟俻侺俨供伏\uf6cb\uf6ad\uf711\uf6e3\uf60f\uf610\uf63c\uf7e2\uf6ce\uf6ba\uf6e1\uf670\uf7e0\uf691\uf6e1\uf6a6\uf66d\uf6b1\uf7e8\uf60c\uf650\uf6e3\uf69a\uf7feჭᝩ៊ᝀ\u173c៘យៃᜈᜤ";
      short var37 = 17669;
      String[] var40 = new String[var39.length];

      while(true) {
         int var41 = 0;
         int var42 = 0;
         char var43 = '\u0000';
         if (var44 == 0) {
            aa = var40;
            ab = new Object[var40.length];
            int var33 = -735250992;
            byte[] var31 = "u\u008c|(M|Ê\u0084ÙcÔ¦ã2äÑ·©¨N_\u0004\u008fI*µ\u009e©\u0081òá\u00845:òÂè·äs@\u00ad/¦ß\u000bÕQ\u0005j5¡çý¯°J\u0096b¡\u0096C-øô\u008e!ù\f*\u009c\u0096\u0006±,n\u0080G½\f&\u000f~0¶<Ü\u008c7 +\u008dÛ\u0088jX\u0017Ì\u0007ÆnY=\u000fÄk\u007fb\u0011½ndÌ½ÿ\u008bB\b\u0012\u008a!MXS\u0016¹M\u0098Ú±\rKxÐÌDRî\u008a¿st\u001a\u000b+\ncÞ®¸Ï\u0089û|]ßÆU\u0019\u0017".getBytes("ISO-8859-1");
            int var32 = var31.length / 4;
            b = new int[var32];
            int var34 = 0;
            int var35 = 0;

            do {
               int var36 = (var31[var34] & 255) << 24 | (var31[var34 + 1] & 255) << 16 | (var31[var34 + 2] & 255) << 8 | var31[var34 + 3] & 255;
               var36 ^= var33;
               b[var35] = var36;
               var34 += 4;
               ++var35;
            } while(var35 < var32);

            String[] var16 = new String[2];
            int var20 = 0;
            String var19;
            int var21 = (var19 = b('麋', var48 ^ -1752960135, (short)'뺲')).length();
            int var18 = a(831653655, var48 ^ -1332495630);
            int var17 = -1;

            while(true) {
               char[] var70;
               label131: {
                  ++var17;
                  char[] var10001 = var19.substring(var17, var17 + var18).toCharArray();
                  int var10003 = var10001.length;
                  int var22 = 0;
                  var70 = var10001;
                  int var57 = var10003;
                  char[] var79;
                  int var10004;
                  if (var10003 <= 1) {
                     var79 = var10001;
                     var10004 = var22;
                  } else {
                     var70 = var10001;
                     var57 = var10003;
                     if (var10003 <= var22) {
                        break label131;
                     }

                     var79 = var10001;
                     var10004 = var22;
                  }

                  while(true) {
                     char var10005 = var79[var10004];
                     int var10006;
                     switch (var22 % a(831653654, var48 ^ -2006774720)) {
                        case 0 -> var10006 = a(831653653, var48 ^ 477893152);
                        case 1 -> var10006 = a(831653652, var48 ^ 640492468);
                        case 2 -> var10006 = a(831653651, var48 ^ 1924558640);
                        case 3 -> var10006 = a(831653650, var48 ^ -1709488092);
                        case 4 -> var10006 = a(831653649, var48 ^ -274048991);
                        case 5 -> var10006 = a(831653648, var48 ^ 1156392762);
                        default -> var10006 = a(831653663, var48 ^ -265997226);
                     }

                     var79[var10004] = (char)(var10005 ^ var10006);
                     ++var22;
                     if (var57 == 0) {
                        var10004 = var57;
                        var79 = var70;
                     } else {
                        if (var57 <= var22) {
                           break;
                        }

                        var79 = var70;
                        var10004 = var22;
                     }
                  }
               }

               String var86 = (new String(var70)).intern();
               int var61 = -1;
               var16[var20++] = var86;
               if ((var17 += var18) >= var21) {
                  long var9 = 5335911607875835260L;
                  long[] var8 = new long[a(831653662, var48 ^ 765993657)];
                  int var12 = 0;
                  String var13;
                  int var14 = (var13 = b('麊', var48 ^ 871468561, (short)340)).length();
                  int var11 = 0;

                  label112:
                  while(true) {
                     var61 = var11;
                     var11 += 8;
                     byte[] var15 = var13.substring(var61, var11).getBytes(b('麉', var48 ^ -29064100, (short)'褙'));
                     long[] var53 = var8;
                     var61 = var12++;
                     long var75 = ((long)var15[0] & 255L) << a(831653661, var48 ^ -2051872482) | ((long)var15[1] & 255L) << a(831653660, var48 ^ 437523424) | ((long)var15[2] & 255L) << a(831653659, var48 ^ -1066011889) | ((long)var15[3] & 255L) << a(831653658, var48 ^ 585263383) | ((long)var15[4] & 255L) << a(831653657, var48 ^ -1886804867) | ((long)var15[5] & 255L) << a(831653656, var48 ^ 1398598445) | ((long)var15[a(831653639, var48 ^ 831645485)] & 255L) << a(831653638, var48 ^ -919250363) | (long)var15[a(831653637, var48 ^ -1011946823)] & 255L;
                     byte var87 = -1;

                     while(true) {
                        long var92 = var75 ^ var9;
                        switch (var87) {
                           case 0:
                              var53[var61] = var92;
                              if (var11 >= var14) {
                                 long var1 = 8384600397534398838L;
                                 long[] var0 = new long[3];
                                 int var4 = 0;
                                 String var5;
                                 int var6 = (var5 = b('麎', var48 ^ -1546078615, (short)'\udf07')).length();
                                 int var3 = 0;

                                 do {
                                    var61 = var3;
                                    var3 += 8;
                                    byte[] var7 = var5.substring(var61, var3).getBytes(b('麍', var48 ^ 1078651697, (short)'鷆'));
                                    var61 = var4++;
                                    var92 = (((long)var7[0] & 255L) << a(831653643, var48 ^ 161626405) | ((long)var7[1] & 255L) << a(831653642, var48 ^ -2028481491) | ((long)var7[2] & 255L) << a(831653641, var48 ^ -464347409) | ((long)var7[3] & 255L) << a(831653640, var48 ^ -744060115) | ((long)var7[4] & 255L) << a(831653687, var48 ^ 531549113) | ((long)var7[5] & 255L) << a(831653686, var48 ^ -1110504769) | ((long)var7[a(831653685, var48 ^ -1745793959)] & 255L) << a(831653684, var48 ^ -1234445078) | (long)var7[a(831653683, var48 ^ -300571329)] & 255L) ^ var1;
                                    var87 = -1;
                                    var0[var61] = var92;
                                 } while(var3 < var6);

                                 long var24 = var0[1];
                                 long[] var23 = new long[2];
                                 int var27 = 0;
                                 String var28;
                                 int var29 = (var28 = var16[0]).length();
                                 int var26 = 0;

                                 do {
                                    var61 = var26;
                                    var26 += 8;
                                    byte[] var30 = var28.substring(var61, var26).getBytes(var16[1]);
                                    var61 = var27++;
                                    var92 = (((long)var30[0] & var0[0]) << (int)var8[0] | ((long)var30[1] & var0[2]) << (int)var8[1] | ((long)var30[2] & var0[2]) << (int)var8[a(831653682, var48 ^ 1806109038)] | ((long)var30[3] & var0[2]) << (int)var8[2] | ((long)var30[4] & var0[2]) << (int)var8[4] | ((long)var30[5] & var0[2]) << (int)var8[a(831653681, var48 ^ 1046715196)] | ((long)var30[(int)var8[a(831653680, var48 ^ 55238644)]] & var0[2]) << (int)var8[3] | (long)var30[(int)var8[5]] & var0[2]) ^ var24;
                                    var87 = -1;
                                    var23[var61] = var92;
                                 } while(var26 < var29);

                                 class_1792[] var54 = new class_1792[(int)var23[1]];
                                 var54[0] = class_1802.field_63390;
                                 var54[1] = class_1802.field_63389;
                                 var54[2] = class_1802.field_63387;
                                 var54[3] = class_1802.field_63388;
                                 var54[4] = class_1802.field_63386;
                                 var54[5] = class_1802.field_63385;
                                 var54[(int)var23[0]] = class_1802.field_63384;
                                 a = var54;
                                 return;
                              }
                              break;
                           default:
                              var53[var61] = var92;
                              if (var11 < var14) {
                                 continue label112;
                              }

                              var14 = (var13 = b('麈', var48 ^ -489691179, (short)12150)).length();
                              var11 = 0;
                        }

                        var61 = var11;
                        var11 += 8;
                        var15 = var13.substring(var61, var11).getBytes(b('麏', var48 ^ -1627333846, (short)'뭡'));
                        var53 = var8;
                        var61 = var12++;
                        var75 = ((long)var15[0] & 255L) << a(831653636, var48 ^ 1163426733) | ((long)var15[1] & 255L) << a(831653635, var48 ^ -485443426) | ((long)var15[2] & 255L) << a(831653634, var48 ^ 1931680315) | ((long)var15[3] & 255L) << a(831653633, var48 ^ -222302927) | ((long)var15[4] & 255L) << a(831653632, var48 ^ 513256605) | ((long)var15[5] & 255L) << a(831653647, var48 ^ -757874428) | ((long)var15[a(831653646, var48 ^ -1421411374)] & 255L) << a(831653645, var48 ^ 24426938) | (long)var15[a(831653644, var48 ^ -727537478)] & 255L;
                        var87 = 0;
                     }
                  }
               }

               var18 = var19.charAt(var17);
            }
         }

         do {
            var43 = var39[var41];
            char[] var45 = var38.substring(var42, var42 + var43).toCharArray();
            int var46 = 0;

            do {
               short var10000;
               switch (var46 % 6) {
                  case 0:
                  default:
                     var10000 = 12;
                     break;
                  case 1:
                     var10000 = 82;
                     break;
                  case 2:
                     var10000 = 245;
                     break;
                  case 3:
                     var10000 = 189;
                     break;
                  case 4:
                     var10000 = 170;
                     break;
                  case 5:
                     var10000 = 78;
               }

               short var47 = var10000;
               var45[var46] = (char)(var45[var46] ^ var47 ^ var37);
               ++var46;
            } while(var46 < var45.length);

            var40[var41] = (new String(var45)).intern();
            var42 += var43;
            ++var41;
         } while(var41 < var39.length);

         var44 = 0;
      }
   }

   private static int a(int var0, int var1) {
      int var2 = b[var0 ^ 831653655] ^ var1 ^ var0;
      var2 ^= 55958;
      var2 += 55422;
      var2 ^= 32218;
      var2 += 46218;
      var2 -= 30542;
      var2 -= 62582;
      var2 -= 47336;
      return var2;
   }

   private static String b(char var0, int var1, short var2) {
      int var3 = var0 ^ '麋';
      char[] var4 = aa[var3].toCharArray();
      StackTraceElement[] var5 = (StackTraceElement[])ab[var3];
      StackTraceElement[] var6;
      if (var5 != null) {
         var6 = var5;
      } else {
         var6 = (new Throwable()).getStackTrace();
         ab[var3] = var6;
      }

      StackTraceElement var7 = var6[1];
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 2487;
      int var9 = 0;

      do {
         int var10 = var4[var9] ^ '蘘';
         var10 -= 11299;
         var10 += 55730;
         var10 ^= 62383;
         var10 += 58706;
         var4[var9] = (char)(var10 ^ var8 ^ var2 ^ var1 >> 16);
         ++var9;
      } while(var9 < var4.length);

      return (new String(var4)).intern();
   }

   private q2997348aa27a422480aea29cbfd800b1bbabbaa() {
   }
}
