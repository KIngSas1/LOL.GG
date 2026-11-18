package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import java.awt.Color;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_2338;
import net.minecraft.class_238;

@Environment(EnvType.CLIENT)
public final class q2997348aa27a422480aea29cbfd800b1aaaababbb {
   private static final Long[] aa;
   private final boolean ab;
   private static final double ba = 0.18;
   private static final double bb = 1.70158;
   private long aaa;
   private class_2338 aab;
   private static final long[] aba;
   private static final Long[] a;
   private static final long abb;
   private long baa;
   private long bab;
   private static final long[] bba;
   private class_2338 bbb;
   private static final double aaaa = (double)1.4E9F;
   private double aaab;
   private static final long aaba;
   private static final Object[] abbb;
   private static final long[] b;
   private static final String[] abba;
   private static final long aabb;
   private static final int[] abab;
   private static final Integer[] abaa;

   static long aa() {
      return bb(abb(abab(636405071, 351258180 ^ -963819315), 5905019867550077292L), aab(abab(636405070, 351258180 ^ 1762736737), 2228694572210419904L));
   }

   public void ab(Object var1, Color var2, double var3, double var5, float var7, double var8) {
      long var10 = System.nanoTime();
      class_238 var12 = this.a(var10, var8);
      double var13 = this.aaa(var10);

      try {
         try {
            bab(var1, this.aba(var10, var8), var2, var3 * var13, var5 * var13, var7);
            if (var12 == null) {
               return;
            }
         } catch (IllegalStateException var23) {
            throw var23;
         }
      } catch (MatchException var24) {
         throw var24;
      }

      long var15 = var10 - this.aaa;
      double var17 = Math.min((double)1.0F, Math.max((double)0.0F, (double)var15 / (double)1.3E8F));

      double var10000;
      label27: {
         try {
            try {
               if (var15 < bb(abb(abab(636405069, -1696473847 ^ 887048372), 1514219976352638826L), aab(abab(636405068, -1696473847 ^ 133727318), 7502339580486588949L))) {
                  var10000 = (double)1.0F;
                  break label27;
               }
            } catch (IllegalStateException var21) {
               throw var21;
            }
         } catch (MatchException var22) {
            throw var22;
         }

         var10000 = (double)1.0F - 0.09 * ((double)1.0F - Math.cos((double)(var15 - bb(abb(abab(636405067, -1696473847 ^ -527618188), 1689203508205546714L), aab(abab(636405066, -1696473847 ^ -1952723285), 4277996147470716633L))) / (double)1.4E9F * (double)2.0F * Math.PI));
      }

      double var19 = var10000;
      bab(var1, var12, var2, var3 * var17 * var19, var5 * var17, var7);
   }

   public q2997348aa27a422480aea29cbfd800b1aaaababbb(boolean var1) {
      this.ab = var1;
   }

   static long ba() {
      return bb(abb(abab(636405036, 1403874281 ^ 377139970), 6485428823973521578L), aab(abab(636405035, 1403874281 ^ 1300874024), 1961094496888651942L));
   }

   private static long bb(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ abb(abab(636405034, 1265113463 ^ -550501938), 4493225108083924639L)) & abb(abab(636405033, 1265113463 ^ -2106558543), 6388342985344451773L);

      try {
         if (aa[var3] == null) {
            aa[var3] = b[var3] ^ var1;
         }
      } catch (MatchException var4) {
         throw var4;
      }

      return aa[var3];
   }

   private static String abba(int var0, char var1, int var2) {
      int var3 = var1 ^ 6429;
      char[] var4 = abba[var3].toCharArray();
      StackTraceElement[] var5 = (StackTraceElement[])abbb[var3];
      StackTraceElement[] var6;
      if (var5 != null) {
         var6 = var5;
      } else {
         var6 = (new Throwable()).getStackTrace();
         abbb[var3] = var6;
      }

      StackTraceElement var7 = var6[1];
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 24143;
      int var9 = 0;

      do {
         int var10 = var4[var9] + 28456;
         var10 -= 18933;
         var10 -= 7249;
         var10 += 43651;
         var10 -= 24541;
         var10 ^= 19168;
         var10 ^= 53326;
         var4[var9] = (char)(var10 ^ var8 ^ var2 ^ var0 >> 16);
         ++var9;
      } while(var9 < var4.length);

      return (new String(var4)).intern();
   }

   private double aaa(long var1) {
      double var10000;
      try {
         try {
            if (this.bbb == null) {
               var10000 = (double)0.0F;
               return var10000;
            }
         } catch (IllegalStateException var3) {
            throw var3;
         }
      } catch (MatchException var4) {
         throw var4;
      }

      var10000 = (double)1.0F - (double)(var1 - this.bab) / (double)1.5E8F;
      return var10000;
   }

   private static long aab(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ abab(636405032, -1541011063 ^ -983942179)) & abab(636405031, -1541011063 ^ -1688908777);
      if (a[var3] == null) {
         a[var3] = bba[var3] ^ var1;
      }

      return a[var3];
   }

   class_238 aba(long param1, double param3) {
      // $FF: Couldn't be decompiled
   }

   private static int abb(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ abab(636405030, -598439207 ^ 1592528988);
      if (abaa[var3] == null) {
         abaa[var3] = (int)(aba[var3] ^ var1);
      }

      return abaa[var3];
   }

   class_238 a(long param1, double param3) {
      // $FF: Couldn't be decompiled
   }

   public void baa(class_2338 var1) {
      this.aaab(var1, System.nanoTime());
   }

   private static void bab(Object var0, class_238 var1, Color var2, double var3, double var5, float var7) {
      int var8 = q2997348aa27a422480aea29cbfd800b1aabaabaaa.bba;
      int var9 = q2997348aa27a422480aea29cbfd800b1aabaabaaa.bb;
      if (var8 == 0) {
         Object var10000;
         label29: {
            try {
               try {
                  var10000 = var1;
                  if (var9 != 0) {
                     break label29;
                  }

                  if (var1 == null) {
                     return;
                  }
               } catch (IllegalStateException var10) {
                  throw var10;
               }
            } catch (MatchException var11) {
               throw var11;
            }

            q2997348aa27a422480aea29cbfd800b1abaaaaa.baaa(var0, var1, var2, var3);
            var10000 = var0;
         }

         q2997348aa27a422480aea29cbfd800b1abaaaaa.ba(var10000, var1, var2, var5, var7);
      }

   }

   static class_238 bba(class_2338 param0, double param1, boolean param3) {
      // $FF: Couldn't be decompiled
   }

   void bbb(long param1) {
      // $FF: Couldn't be decompiled
   }

   public void aaaa() {
      this.bbb(System.nanoTime());
   }

   void aaab(class_2338 param1, long param2) {
      // $FF: Couldn't be decompiled
   }

   private void b(long param1) {
      // $FF: Couldn't be decompiled
   }

   static long aaba() {
      return bb(abb(abab(636405027, -1375538939 ^ -1650826715), 5553343629492560562L), aab(abab(636405026, -1375538939 ^ -1535920505), 1853444720166178450L));
   }

   private static int abab(int var0, int var1) {
      int var2 = abab[var0 ^ 636405071] ^ var1 ^ var0;
      var2 -= 54472;
      var2 += 3986;
      var2 -= 14197;
      var2 -= 1292;
      var2 ^= 52165;
      var2 += 56256;
      return var2;
   }

   public void aabb() {
      this.aab = null;
      this.bbb = null;
      this.baa = 0L;
   }

   static double abaa(long param0) {
      // $FF: Couldn't be decompiled
   }

   static {
      int var41 = -625944423;
      int var10001 = "A㚃㌻㈣쌨㌣팴⺣䌬ん茨⦣쌬ㅳ⌮㗃茶㚳댱㔓䌲⫣㌵ㅓ䌴⡣⌷㟓⌰㐃팪⡓ꌪ㕓猵㏃쌷⮣錵ⴳꌳゃ\ue337㖣ꌶ㞃猬㓳팲㉳䌻⥃⌨ㅳ挭㖣茨㕳\ue337⩓㌬⧳㌻㕳̶㛓\u0015鳠ꂞ骰\ue09c麠삙鮠\ue09b顀傜颰\ue09c麠낚鳠ꂞ駀ꂛ鯠䂘鱐Øč䴾ˍﴻǝ派ƽᴄέ崼̍촼˽䴺Ѝ괂=괃íᴺ㷽费㴭䴿mⴽǝ\ued03㨍鴺\u06dd촹㺍\ued04ߍഁҽ崇ݝ\udd02ڝ\ued3c㫭봅㮝촿܍ﴁЍ촽ܽ洹㻝㴋㿍ⴀϝᴾۍഄ㹭䴂㡝촾㥝ⴁ㼭ᴀଢ଼촾㤽ⴼڍ\ued06ȍ괃ֽാ㯽ﴽ㿝㴀ଢ଼ഺ̽\ued06ˍ\ued03ଽ紾ܽ洄ٽ䴾ݝ봼㺝촆Ѝഄŭ﴾ҍ紂˽괆֝ﴅ㤍㴅ȝഹ㺭䴂㽭ⴸحⴀխ괁㰽ⴁ㥝䴼㽭紀㩽贁㠭괆ଭഹ㩍㴀Ɲ봅ō鴂ם洹㮭봼㨍ി֝费э䴼㠽\ued3cս봅㦭ⴁҝഽ㪽ഇܽ\ued01㺽ⴾ\u06dd\ued01㫭紼㾍紹ɭ贸㽝贁㧍ി㵝崽㰭ഹ\u00adᴿϽ䴸㩭鴹ѽ㴄̝ഀҝ\ued05ଭ\ued03㸽괇ʍ贇㽽崂㷝㴾㳝ᴃ㲍촄㢍\ued3a㳭봅ҭ﴿ڽ㴃㳭㴹íⴄ\nᘔ됖ᙴ吐ᜄЗეᐗၔ鐐\u0010ᾝⴟ曭絫\u1a7d\ued1a᪽촟ᶭ\ued1a\u192d絠捭鵥昭ച\n띏\uefb1뜯ྵ뙟徶랏侶딏쾷P饄蓥馄ҙ\ue184撙\ue6f4ӫ鿴\ue4e0\ue174钙\ue164蓤\ue6f4瓣鯄든\ue324풜\ue494꒞\ue1a4瓣鱤㓢\ue404擢鴄撝\ue554铧\ue344钚飤\ue498鱄铦\ue3a4咘頴㒜黤撙\ue734䓦\ue184풛鼔钝黔㓫髄䒟鵄ӥ鸤ᒙ鯤瓧\ue624뒙\ue074꒝\ue304듢鱔蒞\ue3a4擫\ue644瓣鵔蒙\ueb24뒝\ue6b4쓤\ueb24\ue49d\n顔\uf498頴ᒞ鵄䒝麔咝鸔풞\u0010䩘顏厸桑勨衋䯈行䳨顈匘⡑䲨\uf854䩈硉\n쮅◉쯥엍첕闌퍅藌췅ד".length();
      int var34 = 0;
      short var36 = 26062;
      String[] var33 = new String[10];
      int var32 = var10001;
      String var31 = "A㚃㌻㈣쌨㌣팴⺣䌬ん茨⦣쌬ㅳ⌮㗃茶㚳댱㔓䌲⫣㌵ㅓ䌴⡣⌷㟓⌰㐃팪⡓ꌪ㕓猵㏃쌷⮣錵ⴳꌳゃ\ue337㖣ꌶ㞃猬㓳팲㉳䌻⥃⌨ㅳ挭㖣茨㕳\ue337⩓㌬⧳㌻㕳̶㛓\u0015鳠ꂞ骰\ue09c麠삙鮠\ue09b顀傜颰\ue09c麠낚鳠ꂞ駀ꂛ鯠䂘鱐Øč䴾ˍﴻǝ派ƽᴄέ崼̍촼˽䴺Ѝ괂=괃íᴺ㷽费㴭䴿mⴽǝ\ued03㨍鴺\u06dd촹㺍\ued04ߍഁҽ崇ݝ\udd02ڝ\ued3c㫭봅㮝촿܍ﴁЍ촽ܽ洹㻝㴋㿍ⴀϝᴾۍഄ㹭䴂㡝촾㥝ⴁ㼭ᴀଢ଼촾㤽ⴼڍ\ued06ȍ괃ֽാ㯽ﴽ㿝㴀ଢ଼ഺ̽\ued06ˍ\ued03ଽ紾ܽ洄ٽ䴾ݝ봼㺝촆Ѝഄŭ﴾ҍ紂˽괆֝ﴅ㤍㴅ȝഹ㺭䴂㽭ⴸحⴀխ괁㰽ⴁ㥝䴼㽭紀㩽贁㠭괆ଭഹ㩍㴀Ɲ봅ō鴂ם洹㮭봼㨍ി֝费э䴼㠽\ued3cս봅㦭ⴁҝഽ㪽ഇܽ\ued01㺽ⴾ\u06dd\ued01㫭紼㾍紹ɭ贸㽝贁㧍ി㵝崽㰭ഹ\u00adᴿϽ䴸㩭鴹ѽ㴄̝ഀҝ\ued05ଭ\ued03㸽괇ʍ贇㽽崂㷝㴾㳝ᴃ㲍촄㢍\ued3a㳭봅ҭ﴿ڽ㴃㳭㴹íⴄ\nᘔ됖ᙴ吐ᜄЗეᐗၔ鐐\u0010ᾝⴟ曭絫\u1a7d\ued1a᪽촟ᶭ\ued1a\u192d絠捭鵥昭ച\n띏\uefb1뜯ྵ뙟徶랏侶딏쾷P饄蓥馄ҙ\ue184撙\ue6f4ӫ鿴\ue4e0\ue174钙\ue164蓤\ue6f4瓣鯄든\ue324풜\ue494꒞\ue1a4瓣鱤㓢\ue404擢鴄撝\ue554铧\ue344钚飤\ue498鱄铦\ue3a4咘頴㒜黤撙\ue734䓦\ue184풛鼔钝黔㓫髄䒟鵄ӥ鸤ᒙ鯤瓧\ue624뒙\ue074꒝\ue304듢鱔蒞\ue3a4擫\ue644瓣鵔蒙\ueb24뒝\ue6b4쓤\ueb24\ue49d\n顔\uf498頴ᒞ鵄䒝麔咝鸔풞\u0010䩘顏厸桑勨衋䯈行䳨顈匘⡑䲨\uf854䩈硉\n쮅◉쯥엍첕闌퍅藌췅ד";
      int var35 = 0;

      do {
         char var37 = var31.charAt(var35);
         var10001 = var35 + 1;
         int var10002 = var35 + 1;
         int var39 = 0;
         char[] var38 = var31.substring(var10001, var10002 + var37).toCharArray();

         do {
            char var40 = var38[var39];
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

      abba = var33;
      abbb = new Object[var33.length];
      int var10000 = 0;
      abab = new int[112];
      var10001 = 0;
      byte[] var74 = "O\u001d\u001dÞà\u0081mJ3A8ò\u0000fê\u0015ç\u0013cº\u008c\u0005û1c\u008c´E¶\u0085,rý\u0082`\u000e±Âdfú§$\u0017·\u009aµ²V \u0005\u0011f§ZkC¯â\u000f½ó\u0096f+¹ÅÞ\u0014\u009eà{~§årÒs´Úø²X¨!þÏÖK¬\u0010\u0092\u0003-Âè\b%{!ÙÜ1·½\u0099]\u0097X[\u0006|,s\u0014Ò_~B\u0000\u0013\u008c\u008b`¸ó\u001bÕÞx)]]\u0001Ç4\u0081T4Ü=\\|\u008a$\u0080\u0094Ef±\u0019\u001cËY®ö\u008e\u001aJoØ\u0098±,ç]\u0081\u0000\u001b¦¸\u009bF ¯º\u009cwê\r\u007feàzqp\u0080sN¯\u0085È\u0091µïu[kOd{ã#\u0082dz\u000b\u0098I×zVÅ\tv´Òå^\u0000J\t\u009a\u0090\u0003«\u0098A[V\u0094\u008c\u0012\u0084ô»YÄ\u001d\u0097®¯k¿z\n\u0092\tg(^\u007f×\u008c³®°}s\u009aÕ|&\u000e:¿ù!tbý6Uì-ÉhmSù\u009a:×\b_Óq\u008bï)àeÙ½µÐ:Ë´Ö:öR\u008cÓ{x\u009cC\u009d\\\u001ey¡[ý\bÚ\u0019-ÃT\u0004g2\u0097ô_ç#ÃÆ\u0000P\u0018ÈYÃ \u0015J\u0003±ÏÐCø»-\u008c\u0087+\u008aÊ%§×©5\u0085_\u008deúPT\u001bp\u008a'\u0087i>à\u009e°\u0094çC\u009fcØ¤7¯º\u008e¾6×Z\u0094»_ÀfØ¨<í\u0083[\u0002_\t'\u009faTg')ü\u0003\u009b\u0015¢\f(Þ\u001fÇæÚ4\bQ\u0081ªýi²®ç0Ú\u0097\u000eï1J{A{ú1<¬".getBytes("ISO-8859-1");

      int var102;
      do {
         abab[var10000] = ((var74[var10001] & 255) << 24 | (var74[var10001 + 1] & 255) << 16 | (var74[var10001 + 2] & 255) << 8 | var74[var10001 + 3] & 255) ^ -1198401066;
         ++var10000;
         var102 = var10001 + 4;
         var10001 += 4;
      } while(var102 < var74.length);

      String[] var16 = new String[4];
      int var20 = 0;
      String var19;
      int var21 = (var19 = abba(var41 ^ -794178738, 'ᤝ', 63932)).length();
      int var18 = abab(636405065, var41 ^ 608403727);
      int var45 = -1;

      label155:
      while(true) {
         ++var45;
         String var47 = var19.substring(var45, var45 + var18);
         var10001 = -1;

         while(true) {
            label150: {
               char[] var58 = var47.toCharArray();
               var102 = var58.length;
               int var22 = 0;
               var83 = var58;
               int var61 = var102;
               char[] var106;
               int var126;
               if (var102 <= 1) {
                  var106 = var58;
                  var126 = var22;
               } else {
                  var83 = var58;
                  var61 = var102;
                  if (var102 <= var22) {
                     break label150;
                  }

                  var106 = var58;
                  var126 = var22;
               }

               while(true) {
                  char var137 = var106[var126];
                  int var141;
                  switch (var22 % abab(636405063, var41 ^ -1169337025)) {
                     case 0 -> var141 = abab(636405062, var41 ^ -166899371);
                     case 1 -> var141 = abab(636405061, var41 ^ -1117253271);
                     case 2 -> var141 = abab(636405060, var41 ^ -262831954);
                     case 3 -> var141 = abab(636405059, var41 ^ 292499459);
                     case 4 -> var141 = abab(636405058, var41 ^ 560492395);
                     case 5 -> var141 = abab(636405057, var41 ^ 73455446);
                     default -> var141 = abab(636405056, var41 ^ -96689365);
                  }

                  var106[var126] = (char)(var137 ^ var141);
                  ++var22;
                  if (var61 == 0) {
                     var126 = var61;
                     var106 = var83;
                  } else {
                     if (var61 <= var22) {
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
                  if ((var45 += var18) >= var21) {
                     long var8 = 1161136873439755136L;
                     long[] var14 = new long[abab(636405087, var41 ^ 1819734145)];
                     int var11 = 0;
                     String var12;
                     int var13 = (var12 = abba(var41 ^ 1273752768, '\u191f', 49413)).length();
                     int var10 = 0;

                     label126:
                     while(true) {
                        var10001 = var10;
                        var10 += 8;
                        byte[] var15 = var12.substring(var10001, var10).getBytes(abba(var41 ^ 2016456386, 'ᤞ', 33606));
                        long[] var49 = var14;
                        var10001 = var11++;
                        long var88 = ((long)var15[0] & 255L) << abab(636405086, var41 ^ 1397871902) | ((long)var15[1] & 255L) << abab(636405085, var41 ^ 963170316) | ((long)var15[2] & 255L) << abab(636405084, var41 ^ -1782808147) | ((long)var15[3] & 255L) << abab(636405083, var41 ^ -1082298912) | ((long)var15[4] & 255L) << abab(636405082, var41 ^ 1714551447) | ((long)var15[5] & 255L) << abab(636405081, var41 ^ 207824328) | ((long)var15[abab(636405080, var41 ^ 1155725253)] & 255L) << abab(636405079, var41 ^ 1340755581) | (long)var15[abab(636405078, var41 ^ -1642920809)] & 255L;
                        byte var114 = -1;

                        while(true) {
                           long var128 = var88 ^ var8;
                           switch (var114) {
                              case 0:
                                 var49[var10001] = var128;
                                 if (var10 >= var13) {
                                    aba = var14;
                                    abaa = new Integer[abab(636405100, var41 ^ 2056473062)];
                                    long var0 = 555063579078950126L;
                                    long[] var6 = new long[abab(636405099, var41 ^ 1666162977)];
                                    int var3 = 0;
                                    String var4;
                                    int var5 = (var4 = abba(var41 ^ -242373482, 'ᤛ', 3453)).length();
                                    int var2 = 0;

                                    label116:
                                    while(true) {
                                       var10001 = var2;
                                       var2 += 8;
                                       byte[] var7 = var4.substring(var10001, var2).getBytes(abba(var41 ^ -1966433928, 'ᤚ', 30296));
                                       var49 = var6;
                                       var10001 = var3++;
                                       var88 = ((long)var7[0] & 255L) << abab(636405098, var41 ^ 561917005) | ((long)var7[1] & 255L) << abab(636405097, var41 ^ -1936286788) | ((long)var7[2] & 255L) << abab(636405096, var41 ^ -908755156) | ((long)var7[3] & 255L) << abab(636405095, var41 ^ -1621654440) | ((long)var7[4] & 255L) << abab(636405094, var41 ^ -1600998275) | ((long)var7[5] & 255L) << abab(636405093, var41 ^ 1550421501) | ((long)var7[abab(636405092, var41 ^ 24091307)] & 255L) << abab(636405091, var41 ^ -608641179) | (long)var7[abab(636405090, var41 ^ 950719854)] & 255L;
                                       var114 = -1;

                                       while(true) {
                                          var128 = var88 ^ var0;
                                          switch (var114) {
                                             case 0:
                                                var49[var10001] = var128;
                                                if (var2 >= var5) {
                                                   bba = var6;
                                                   a = new Long[abab(636405112, var41 ^ 231124967)];
                                                   long var23 = aab(abab(636405111, var41 ^ 1147468106), 4455573564499533815L);
                                                   long[] var29 = new long[abb(abab(636405110, var41 ^ 479841266), 3685737782743883491L)];
                                                   int var26 = 0;
                                                   String var27;
                                                   int var28 = (var27 = var16[1]).length();
                                                   int var25 = 0;

                                                   label106:
                                                   while(true) {
                                                      var10001 = var25;
                                                      var25 += 8;
                                                      byte[] var30 = var27.substring(var10001, var25).getBytes(var16[2]);
                                                      var49 = var29;
                                                      var10001 = var26++;
                                                      var88 = ((long)var30[0] & aab(abab(636405109, var41 ^ 1431035735), 3089094938639161874L)) << abb(abab(636405108, var41 ^ 504059274), 3323644159852539265L) | ((long)var30[1] & aab(abab(636405107, var41 ^ -379519843), 2113839128068566511L)) << abb(abab(636405106, var41 ^ 1036380198), 722168177408910263L) | ((long)var30[2] & aab(abab(636405105, var41 ^ 552061279), 2113839128068566511L)) << abb(abab(636405104, var41 ^ -1874594690), 8951570820924724570L) | ((long)var30[3] & aab(abab(636405007, var41 ^ -139270972), 2113839128068566511L)) << abb(abab(636405006, var41 ^ -1833739061), 1111211687121723950L) | ((long)var30[4] & aab(abab(636405005, var41 ^ 2104520317), 2113839128068566511L)) << abb(abab(636405004, var41 ^ 867028561), 2548636563889744536L) | ((long)var30[5] & aab(abab(636405003, var41 ^ 304331411), 2113839128068566511L)) << abb(abab(636405002, var41 ^ 799157295), 6824635333087935786L) | ((long)var30[abb(abab(636405001, var41 ^ -571110014), 5525440081009590909L)] & aab(abab(636405000, var41 ^ 404547282), 2113839128068566511L)) << abb(abab(636404999, var41 ^ -1461285025), 7850483742629940932L) | (long)var30[abb(abab(636404998, var41 ^ -1636642468), 6854348800856506486L)] & aab(abab(636404997, var41 ^ 2097423234), 2113839128068566511L);
                                                      var114 = -1;

                                                      while(true) {
                                                         var128 = var88 ^ var23;
                                                         switch (var114) {
                                                            case 0:
                                                               var49[var10001] = var128;
                                                               if (var25 >= var28) {
                                                                  b = var29;
                                                                  aa = new Long[abb(abab(636405011, var41 ^ -840374201), 7850483742629940932L)];
                                                                  aabb = bb(abb(abab(636405010, var41 ^ 2033174385), 7519136192431643412L), aab(abab(636405009, var41 ^ -752297396), 3691448926605357144L));
                                                                  aaba = bb(abb(abab(636405008, var41 ^ 605540153), 2782524672691974899L), aab(abab(636405039, var41 ^ -394942372), 9105914402144247106L));
                                                                  abb = bb(abb(abab(636405038, var41 ^ 1897412280), 3183742877838064102L), aab(abab(636405037, var41 ^ -57653565), 6865038523713142047L));
                                                                  return;
                                                               }
                                                               break;
                                                            default:
                                                               var49[var10001] = var128;
                                                               if (var25 < var28) {
                                                                  continue label106;
                                                               }

                                                               var28 = (var27 = var16[0]).length();
                                                               var25 = 0;
                                                         }

                                                         var10001 = var25;
                                                         var25 += 8;
                                                         var30 = var27.substring(var10001, var25).getBytes(var16[3]);
                                                         var49 = var29;
                                                         var10001 = var26++;
                                                         var88 = ((long)var30[0] & aab(abab(636404996, var41 ^ 2100938201), 2113839128068566511L)) << abb(abab(636404995, var41 ^ -1800134303), 8000971686061497095L) | ((long)var30[1] & aab(abab(636404994, var41 ^ 72534861), 2113839128068566511L)) << abb(abab(636404993, var41 ^ 1047405820), 6604938480153509621L) | ((long)var30[2] & aab(abab(636404992, var41 ^ 1326812796), 2113839128068566511L)) << abb(abab(636405023, var41 ^ -2070178971), 7434698871964337915L) | ((long)var30[3] & aab(abab(636405022, var41 ^ 1968726800), 2113839128068566511L)) << abb(abab(636405021, var41 ^ -1595128731), 5767154042244797787L) | ((long)var30[4] & aab(abab(636405020, var41 ^ 1201639301), 2113839128068566511L)) << abb(abab(636405019, var41 ^ 504159690), 6473269777398277930L) | ((long)var30[5] & aab(abab(636405018, var41 ^ 231483012), 2113839128068566511L)) << abb(abab(636405017, var41 ^ -1752386415), 4263059256352921646L) | ((long)var30[abb(abab(636405016, var41 ^ 1782831570), 9135996310814350859L)] & aab(abab(636405015, var41 ^ -855264543), 2113839128068566511L)) << abb(abab(636405014, var41 ^ -1872340306), 7850483742629940932L) | (long)var30[abb(abab(636405013, var41 ^ 406981040), 1893914641000806819L)] & aab(abab(636405012, var41 ^ 396069941), 2113839128068566511L);
                                                         var114 = 0;
                                                      }
                                                   }
                                                }
                                                break;
                                             default:
                                                var49[var10001] = var128;
                                                if (var2 < var5) {
                                                   continue label116;
                                                }

                                                var5 = (var4 = abba(var41 ^ -50219487, 'ᤕ', 19126)).length();
                                                var2 = 0;
                                          }

                                          var10001 = var2;
                                          var2 += 8;
                                          var7 = var4.substring(var10001, var2).getBytes(abba(var41 ^ -62599838, 'ᤔ', 62459));
                                          var49 = var6;
                                          var10001 = var3++;
                                          var88 = ((long)var7[0] & 255L) << abab(636405089, var41 ^ 918533417) | ((long)var7[1] & 255L) << abab(636405088, var41 ^ 157331595) | ((long)var7[2] & 255L) << abab(636405119, var41 ^ -696591839) | ((long)var7[3] & 255L) << abab(636405118, var41 ^ 480541193) | ((long)var7[4] & 255L) << abab(636405117, var41 ^ 1009522404) | ((long)var7[5] & 255L) << abab(636405116, var41 ^ 599080679) | ((long)var7[abab(636405115, var41 ^ 236474200)] & 255L) << abab(636405114, var41 ^ -2100935739) | (long)var7[abab(636405113, var41 ^ -1792382193)] & 255L;
                                          var114 = 0;
                                       }
                                    }
                                 }
                                 break;
                              default:
                                 var49[var10001] = var128;
                                 if (var10 < var13) {
                                    continue label126;
                                 }

                                 var13 = (var12 = abba(var41 ^ -777986876, 'ᤙ', 21916)).length();
                                 var10 = 0;
                           }

                           var10001 = var10;
                           var10 += 8;
                           var15 = var12.substring(var10001, var10).getBytes(abba(var41 ^ 808049169, 'ᤘ', 16682));
                           var49 = var14;
                           var10001 = var11++;
                           var88 = ((long)var15[0] & 255L) << abab(636405077, var41 ^ -95000327) | ((long)var15[1] & 255L) << abab(636405076, var41 ^ 529806091) | ((long)var15[2] & 255L) << abab(636405075, var41 ^ 1807491498) | ((long)var15[3] & 255L) << abab(636405074, var41 ^ 414283585) | ((long)var15[4] & 255L) << abab(636405073, var41 ^ 1413725738) | ((long)var15[5] & 255L) << abab(636405072, var41 ^ -12833146) | ((long)var15[abab(636405103, var41 ^ -1716052921)] & 255L) << abab(636405102, var41 ^ 449770065) | (long)var15[abab(636405101, var41 ^ -962919993)] & 255L;
                           var114 = 0;
                        }
                     }
                  }

                  var18 = var19.charAt(var45);
                  break;
               default:
                  var16[var20++] = var113;
                  if ((var45 += var18) < var21) {
                     var18 = var19.charAt(var45);
                     continue label155;
                  }

                  var21 = (var19 = abba(var41 ^ 998762301, 'ᤜ', 1864)).length();
                  var18 = abab(636405064, var41 ^ -246802125);
                  var45 = -1;
            }

            ++var45;
            var47 = var19.substring(var45, var45 + var18);
            var10001 = 0;
         }
      }
   }

   public q2997348aa27a422480aea29cbfd800b1aaaababbb() {
      this(false);
   }
}
