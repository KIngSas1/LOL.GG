package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_243;
import net.minecraft.class_3532;

@Environment(EnvType.CLIENT)
public final class q2997348aa27a422480aea29cbfd800b1bbbabbbb {
   static final double a = 0.03;
   public static final double b = (double)1.5F;
   static final double aa = 0.99;
   private static final double ab = 0.00861375;
   private static final double ba = 0.0062500000000000056;
   static final double bb = 0.1625;
   static final double aaa = 0.0172275;
   private static final Object[] bbb;
   private static final String[] bba;
   static final double aab = 0.8;
   static final double aba = (double)0.15625F;
   private static final int[] bab;
   static final double abb = 0.15;
   private static final double[][] baa;

   private static String bba(short var0, byte var1, int var2, int var3) {
      int var8 = var3 ^ 1261610879;
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
      int var5 = (var11.getClassName().hashCode() ^ var11.getMethodName().hashCode()) >> 16 ^ '蔴';

      for(int var6 = 0; var6 < var7.length; ++var6) {
         var7[var6] = (char)(var7[var6] ^ var6 ^ var5 ^ var1 ^ var0 ^ var3 ^ var2);
      }

      return (new String(var7)).intern();
   }

   private static int a(float param0, float param1, class_243 param2, class_243 param3, int param4, class_243 param5, class_243 param6, int param7, q2997348aa27a422480aea29cbfd800b1aaaabbbaa param8) {
      // $FF: Couldn't be decompiled
   }

   private static int b(int var0, int var1) {
      int var2 = bab[var0 ^ 1752991209] ^ var1 ^ var0;
      var2 += 13837;
      var2 += 1488;
      var2 ^= 11074;
      var2 ^= 5337;
      var2 -= 2597;
      var2 += 53571;
      return var2;
   }

   public static class_243 aa(float var0, float var1) {
      float var2 = ((float)Math.PI / 180F);
      float var3 = -class_3532.method_15374((double)(var0 * var2)) * class_3532.method_15362((double)(var1 * var2));
      float var4 = -class_3532.method_15374((double)(var1 * var2));
      float var5 = class_3532.method_15362((double)(var0 * var2)) * class_3532.method_15362((double)(var1 * var2));
      return (new class_243((double)var3, (double)var4, (double)var5)).method_1029();
   }

   public static q2997348aa27a422480aea29cbfd800b1aabbabba ab(class_243 param0, class_243 param1, int param2, class_243 param3, class_243 param4, int param5, q2997348aa27a422480aea29cbfd800b1aaaabbbaa param6) {
      // $FF: Couldn't be decompiled
   }

   static class_243[] ba(class_243 param0, class_243 param1, int param2, q2997348aa27a422480aea29cbfd800b1aaaabbbaa param3) {
      // $FF: Couldn't be decompiled
   }

   static class_243 bb(class_243 var0, class_243 var1, q2997348aa27a422480aea29cbfd800b1aaaabbbaa var2) {
      int var3 = q2997348aa27a422480aea29cbfd800b1aabaabaaa.bb;

      double var10;
      label36: {
         label35: {
            label34: {
               try {
                  try {
                     var10000 = var2;
                     if (var3 != 0) {
                        break label34;
                     }

                     if (var2 == null) {
                        break label35;
                     }
                  } catch (IllegalStateException var8) {
                     throw var8;
                  }
               } catch (MatchException var9) {
                  throw var9;
               }

               var10000 = var2;
            }

            try {
               try {
                  if (var10000.a(var0)) {
                     var10 = 0.8;
                     break label36;
                  }
               } catch (IllegalStateException var6) {
                  throw var6;
               }
            } catch (MatchException var7) {
               throw var7;
            }
         }

         var10 = 0.99;
      }

      double var4 = var10;
      return var1.method_1023((double)0.0F, 0.03, (double)0.0F).method_1021(var4);
   }

   public static q2997348aa27a422480aea29cbfd800b1aabbabba aaa(class_243 param0, class_243 param1, int param2, class_243 param3, class_243 param4, int param5, q2997348aa27a422480aea29cbfd800b1aaaabbbaa param6, float param7, float param8) {
      // $FF: Couldn't be decompiled
   }

   private q2997348aa27a422480aea29cbfd800b1bbbabbbb() {
   }

   static float[] aab(class_243 var0) {
      class_243 var1 = var0.method_1029();
      float var2 = (float)Math.toDegrees(Math.atan2(-var1.field_1352, var1.field_1350));
      float var3 = (float)(-Math.toDegrees(Math.asin(class_3532.method_15350(var1.field_1351, (double)-1.0F, (double)1.0F))));
      return new float[]{class_3532.method_15393(var2), class_3532.method_15363(var3, -90.0F, 90.0F)};
   }

   static {
      int var41 = -94516638;
      int var35 = 0;
      short var36 = 10106;
      String[] var33 = new String[7];
      int var34 = 0;
      int var32 = "\u001b\ueb8b\uf348\ued83퍽\ue928ꍌ\ueb6bꍊ\ue9f3ꍸ\ue948⍂\ue69b퍄\ue4b3⍳\ue758㍎\ue5db́\uee53㍶\ue538\uf345\ue23b\uf34d\ue1f38ᜩ놶ႡꆊḊᆼ᱙憶ẁ\u218eᨪ膶ḙ醸ᳱ憁Ὰ↴ᮙƾᾱᆍ᷊Ʋᄩㆰ\u1771ↅᾊ醽ᷙ\ue1b5ᦁↄᦊƵᲙᆺṱ憃ᅪ솺ᾹƳᰱ醎Ṋ憱ᐹᆾᖱ膎ᴊᆿὙᆴ\n易࡞麗졭︣\uf85c﹀졘（ꡬ\u0010ꢗ꼁ꓯ缸귄\udf0f꾗⼅ꤏ༳ꛔ뼈귗弋꼿꼳\n묔ﰜ뭼㰯볗ఞ벴㰚뷼尮\u0018霦丿餾渆駅丳鹆踷阎⸇鞕\ude39鈦⸼鯎縇隵为頖渳顾丂鿕踲\n犎曕狦ꛦ畍雗甮ꛓ瑦웧".length();
      String var31 = "\u001b\ueb8b\uf348\ued83퍽\ue928ꍌ\ueb6bꍊ\ue9f3ꍸ\ue948⍂\ue69b퍄\ue4b3⍳\ue758㍎\ue5db́\uee53㍶\ue538\uf345\ue23b\uf34d\ue1f38ᜩ놶ႡꆊḊᆼ᱙憶ẁ\u218eᨪ膶ḙ醸ᳱ憁Ὰ↴ᮙƾᾱᆍ᷊Ʋᄩㆰ\u1771ↅᾊ醽ᷙ\ue1b5ᦁↄᦊƵᲙᆺṱ憃ᅪ솺ᾹƳᰱ醎Ṋ憱ᐹᆾᖱ膎ᴊᆿὙᆴ\n易࡞麗졭︣\uf85c﹀졘（ꡬ\u0010ꢗ꼁ꓯ缸귄\udf0f꾗⼅ꤏ༳ꛔ뼈귗弋꼿꼳\n묔ﰜ뭼㰯볗ఞ벴㰚뷼尮\u0018霦丿餾渆駅丳鹆踷阎⸇鞕\ude39鈦⸼鯎縇隵为頖渳顾丂鿕踲\n犎曕狦ꛦ畍雗甮ꛓ瑦웧";

      do {
         char var37 = var31.charAt(var35);
         char[] var38 = var31.substring(var35 + 1, var35 + 1 + var37).toCharArray();
         int var39 = 0;

         do {
            int var40 = var38[var39];
            short var10000;
            switch (var39 % 6) {
               case 0:
               default:
                  var10000 = 88;
                  break;
               case 1:
                  var10000 = 166;
                  break;
               case 2:
                  var10000 = 112;
                  break;
               case 3:
                  var10000 = 146;
                  break;
               case 4:
                  var10000 = 203;
                  break;
               case 5:
                  var10000 = 162;
            }

            var40 = (char)var10000 ^ var40;
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

      bba = var33;
      bbb = new Object[var33.length];
      bab = new int[39];
      int var45 = 0;
      int var10001 = 0;
      byte[] var10002 = "HãC\u001c#êOTX¡\u009fÃ\u0095\u008a@TJ\u0081%¾b\u0016>\u0086#±´¨L\fä\u0085\u000fÚäÚ¾ÑF\t\u0093)+ \u000f\u0084nE\bK\u0017ì\u009eáºÝ\u009f}½×\u0086\u0015Þj5\n\u001dtà8\u0087À×\u0090Ë}6Ø4ÐS³ªgþ\u0083ÿf\u0019µgIÒy\u0005¡á³!\u001f!\u001bB\u0016ç§ób\u0095¯U±-ß¨½¹C\t!^mß4\u008c,\u0011\u009eçQ¤álÎxP\u0000¡<®b#E\b8ÊþÚà\u0000§!+{A\u0018".getBytes("ISO-8859-1");

      int var86;
      do {
         bab[var45] = ((var10002[var10001] & 255) << 24 | (var10002[var10001 + 1] & 255) << 16 | (var10002[var10001 + 2] & 255) << 8 | var10002[var10001 + 3] & 255) ^ 211671798;
         ++var45;
         var86 = var10001 + 4;
         var10001 += 4;
      } while(var86 < var10002.length);

      String[] var16 = new String[2];
      int var20 = 0;
      String var19;
      int var21 = (var19 = bba((short)4817, (byte)-7, -234974504, 1261610879)).length();
      int var18 = b(1752991209, var41 ^ 698424827);
      int var17 = -1;

      while(true) {
         label132: {
            ++var17;
            char[] var50 = var19.substring(var17, var17 + var18).toCharArray();
            var86 = var50.length;
            int var22 = 0;
            var72 = var50;
            int var53 = var86;
            char[] var90;
            int var108;
            if (var86 <= 1) {
               var90 = var50;
               var108 = var22;
            } else {
               var72 = var50;
               var53 = var86;
               if (var86 <= var22) {
                  break label132;
               }

               var90 = var50;
               var108 = var22;
            }

            while(true) {
               char var117 = var90[var108];
               int var121;
               switch (var22 % b(1752991208, var41 ^ 1118310845)) {
                  case 0 -> var121 = b(1752991211, var41 ^ 971227226);
                  case 1 -> var121 = b(1752991210, var41 ^ -188211209);
                  case 2 -> var121 = b(1752991213, var41 ^ 734231371);
                  case 3 -> var121 = b(1752991212, var41 ^ 55861557);
                  case 4 -> var121 = b(1752991215, var41 ^ 1123281775);
                  case 5 -> var121 = b(1752991214, var41 ^ 760134448);
                  default -> var121 = 2;
               }

               var90[var108] = (char)(var117 ^ var121);
               ++var22;
               if (var53 == 0) {
                  var108 = var53;
                  var90 = var72;
               } else {
                  if (var53 <= var22) {
                     break;
                  }

                  var90 = var72;
                  var108 = var22;
               }
            }
         }

         String var97 = (new String(var72)).intern();
         var10001 = -1;
         var16[var20++] = var97;
         if ((var17 += var18) >= var21) {
            long var9 = 6439760922709897829L;
            long[] var8 = new long[b(1752991201, var41 ^ 1855502908)];
            int var12 = 0;
            String var13;
            int var14 = (var13 = bba((short)-16059, (byte)24, -1987014310, 1261610878)).length();
            int var11 = 0;

            label113:
            while(true) {
               var10001 = var11;
               var11 += 8;
               byte[] var15 = var13.substring(var10001, var11).getBytes(bba((short)21247, (byte)-43, -1640733816, 1261610877));
               long[] var46 = var8;
               var10001 = var12++;
               long var77 = ((long)var15[0] & 255L) << b(1752991200, var41 ^ -544007719) | ((long)var15[1] & 255L) << b(1752991203, var41 ^ -227838853) | ((long)var15[2] & 255L) << b(1752991202, var41 ^ 1858482567) | ((long)var15[3] & 255L) << b(1752991205, var41 ^ 1762215969) | ((long)var15[4] & 255L) << b(1752991204, var41 ^ -6036439) | ((long)var15[5] & 255L) << b(1752991207, var41 ^ -29367512) | ((long)var15[b(1752991206, var41 ^ -413695858)] & 255L) << b(1752991225, var41 ^ 1414022029) | (long)var15[b(1752991224, var41 ^ -2122655431)] & 255L;
               byte var98 = -1;

               while(true) {
                  long var110 = var77 ^ var9;
                  switch (var98) {
                     case 0:
                        var46[var10001] = var110;
                        if (var11 >= var14) {
                           long var1 = 8833981405195987693L;
                           long[] var0 = new long[3];
                           int var4 = 0;
                           String var5;
                           int var6 = (var5 = bba((short)31602, (byte)-44, 559492316, 1261610874)).length();
                           int var3 = 0;

                           do {
                              var10001 = var3;
                              var3 += 8;
                              byte[] var7 = var5.substring(var10001, var3).getBytes(bba((short)-18905, (byte)-91, 1563127698, 1261610873));
                              var10001 = var4++;
                              var110 = (((long)var7[0] & 255L) << b(1752991218, var41 ^ -185791885) | ((long)var7[1] & 255L) << b(1752991221, var41 ^ 1285420912) | ((long)var7[2] & 255L) << b(1752991220, var41 ^ -671000843) | ((long)var7[3] & 255L) << b(1752991223, var41 ^ 1060077803) | ((long)var7[4] & 255L) << b(1752991222, var41 ^ -311537800) | ((long)var7[5] & 255L) << b(1752991177, var41 ^ -2045511120) | ((long)var7[b(1752991176, var41 ^ 227288730)] & 255L) << b(1752991179, var41 ^ 1642291813) | (long)var7[b(1752991178, var41 ^ 56695747)] & 255L) ^ var1;
                              var98 = -1;
                              var0[var10001] = var110;
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
                              var110 = (((long)var30[0] & var0[0]) << (int)var8[b(1752991181, var41 ^ 1502126103)] | ((long)var30[1] & var0[2]) << (int)var8[3] | ((long)var30[2] & var0[2]) << (int)var8[1] | ((long)var30[3] & var0[2]) << (int)var8[4] | ((long)var30[4] & var0[2]) << (int)var8[b(1752991180, var41 ^ -2126317076)] | ((long)var30[5] & var0[2]) << (int)var8[0] | ((long)var30[(int)var8[2]] & var0[2]) << (int)var8[5] | (long)var30[(int)var8[b(1752991183, var41 ^ 1245257685)]] & var0[2]) ^ var24;
                              var98 = -1;
                              var23[var10001] = var110;
                           } while(var26 < var29);

                           double[][] var47 = new double[(int)var23[1]][];
                           var47[0] = new double[]{(double)0.0F, (double)0.0F, (double)0.0F};
                           var47[1] = new double[]{0.00861375, (double)0.0F, (double)0.0F};
                           var47[2] = new double[]{-0.00861375, (double)0.0F, (double)0.0F};
                           var47[3] = new double[]{(double)0.0F, 0.00861375, (double)0.0F};
                           var47[4] = new double[]{(double)0.0F, -0.00861375, (double)0.0F};
                           var47[5] = new double[]{(double)0.0F, (double)0.0F, 0.00861375};
                           var47[(int)var23[0]] = new double[]{(double)0.0F, (double)0.0F, -0.00861375};
                           baa = var47;
                           return;
                        }
                        break;
                     default:
                        var46[var10001] = var110;
                        if (var11 < var14) {
                           continue label113;
                        }

                        var14 = (var13 = bba((short)-18693, (byte)-38, 1751511576, 1261610876)).length();
                        var11 = 0;
                  }

                  var10001 = var11;
                  var11 += 8;
                  var15 = var13.substring(var10001, var11).getBytes(bba((short)-16758, (byte)-126, 1658375043, 1261610875));
                  var46 = var8;
                  var10001 = var12++;
                  var77 = ((long)var15[0] & 255L) << b(1752991227, var41 ^ -1227713354) | ((long)var15[1] & 255L) << b(1752991226, var41 ^ 1469737746) | ((long)var15[2] & 255L) << b(1752991229, var41 ^ 854717882) | ((long)var15[3] & 255L) << b(1752991228, var41 ^ -1614700366) | ((long)var15[4] & 255L) << b(1752991231, var41 ^ 2029468070) | ((long)var15[5] & 255L) << b(1752991230, var41 ^ -1287955641) | ((long)var15[b(1752991217, var41 ^ -2131656724)] & 255L) << b(1752991216, var41 ^ 1079581926) | (long)var15[b(1752991219, var41 ^ -2031768176)] & 255L;
                  var98 = 0;
               }
            }
         }

         var18 = var19.charAt(var17);
      }
   }

   static int aba(class_243 param0, class_243 param1, int param2, class_243 param3, class_243 param4, int param5, q2997348aa27a422480aea29cbfd800b1aaaabbbaa param6) {
      // $FF: Couldn't be decompiled
   }

   static boolean abb(class_243 param0, class_243 param1, double param2, double param4, double param6, double param8, double param10, double param12) {
      // $FF: Couldn't be decompiled
   }

   static double baa(int var0) {
      return (double)Math.max(0.0F, Math.min(0.3F, (float)(var0 - 2) / 20.0F));
   }

   private static double[] bab(class_243 param0, class_243 param1, class_243 param2, class_243 param3, int param4) {
      // $FF: Couldn't be decompiled
   }
}
