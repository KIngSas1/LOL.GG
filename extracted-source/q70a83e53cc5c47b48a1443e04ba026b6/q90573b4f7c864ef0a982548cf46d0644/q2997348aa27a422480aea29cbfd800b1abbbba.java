package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_10707;
import net.minecraft.class_1309;
import net.minecraft.class_1799;
import net.minecraft.class_243;
import net.minecraft.class_310;
import net.minecraft.class_3532;
import net.minecraft.class_6880;
import net.minecraft.class_746;

@Environment(EnvType.CLIENT)
public final class q2997348aa27a422480aea29cbfd800b1abbbba {
   static final int aa;
   private static int ab;
   private static final long[] ba;
   private static int a;
   private static final Map bb;
   static final double aaa = (double)25.0F;
   static final int aab;
   static final float aba = 90.0F;
   private static final Integer[] abb;
   private static int baa;
   private static int bab;
   private static final Object[] aaaaa;
   static final int bba;
   static final int bbb;
   static final int b;
   static final double aaaa = 0.35;
   static final int aaab;
   static final double aaba = (double)12.0F;
   static final int aabb;
   private static int abaa;
   private static final long[] abab;
   private static int abba;
   private static final String[] bbbb;
   private static final Long[] abbb;
   private static int baaa;
   private static final int[] bbba;
   static final int baab;
   static final double baba = (double)3.0F;
   private static final Integer[] babb;
   private static final long[] bbaa;
   static final int bbab;

   public static boolean aa(class_310 param0, class_1309 param1) {
      // $FF: Couldn't be decompiled
   }

   public static int ab(class_1799 param0, class_1799 param1) {
      // $FF: Couldn't be decompiled
   }

   static boolean ba(boolean param0, boolean param1, int param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   public static boolean bb(class_310 param0, class_1309 param1) {
      // $FF: Couldn't be decompiled
   }

   static int aaa(class_1309 var0) {
      return var0.field_6012 - bbaa(var0);
   }

   private static String bbbbb(int var0, int var1, int var2) {
      int var3 = var0 ^ 8597;
      char[] var4 = bbbb[var3].toCharArray();
      StackTraceElement[] var5 = (StackTraceElement[])aaaaa[var3];
      StackTraceElement[] var6;
      if (var5 != null) {
         var6 = var5;
      } else {
         var6 = (new Throwable()).getStackTrace();
         aaaaa[var3] = var6;
      }

      StackTraceElement var7 = var6[1];
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 8795;
      int var9 = 0;

      do {
         int var10 = var4[var9] + '뀽';
         var10 += 17094;
         var10 ^= 24223;
         var10 -= 42637;
         var10 += 40799;
         var10 ^= 34392;
         var4[var9] = (char)(var10 ^ var8 ^ var2 ^ var1 >> 16);
         ++var9;
      } while(var9 < var4.length);

      return (new String(var4)).intern();
   }

   private static double aab(float var0, double var1, double var3, double var5) {
      double var7 = Math.toRadians((double)var0);
      double var9 = (-Math.sin(var7) * var1 + Math.cos(var7) * var3) / var5;
      return Math.toDegrees(Math.acos(class_3532.method_15350(var9, (double)-1.0F, (double)1.0F)));
   }

   private static double aba(class_310 var0, class_1309 var1, double var2, double var4, double var6) {
      double var8 = var1.method_5649(var2, var4, var6);
      q2997348aa27a422480aea29cbfd800b1abaaabab var10 = bbabb(var1);

      try {
         try {
            if (var10 == null || !abbbb(var0, var10)) {
               return var8;
            }
         } catch (IllegalStateException var17) {
            throw var17;
         }
      } catch (MatchException var18) {
         throw var18;
      }

      double var11 = var10.aaa - var2;
      double var13 = var10.aab - var4;
      double var15 = var10.aabb - var6;
      var8 = Math.min(var8, var11 * var11 + var13 * var13 + var15 * var15);
      return var8;
   }

   private static boolean abb(class_1309 param0) {
      // $FF: Couldn't be decompiled
   }

   private static float baa(class_10707 var0) {
      int var1 = q2997348aa27a422480aea29cbfd800b1aabaabaaa.bba;
      int var2 = q2997348aa27a422480aea29cbfd800b1aabaabaaa.bb;

      try {
         try {
            if (var0 == null) {
               return 0.0F;
            }
         } catch (IllegalStateException var7) {
            throw var7;
         }
      } catch (MatchException var8) {
         throw var8;
      }

      float var3 = 0.0F;
      Iterator var4 = var0.comp_3588().iterator();

      float var10000;
      while(true) {
         if (var4.hasNext()) {
            class_10707.class_10708 var5 = (class_10707.class_10708)var4.next();

            label31: {
               try {
                  if (var1 != 0) {
                     break label31;
                  }

                  var10000 = var3;
                  if (var2 != 0) {
                     break;
                  }
               } catch (MatchException var6) {
                  throw var6;
               }

               var3 = Math.max(var10000, var5.comp_3638());
            }

            if (var2 == 0) {
               continue;
            }
         }

         var10000 = var3;
         break;
      }

      return var10000;
   }

   private static int bab(class_1309 param0, q2997348aa27a422480aea29cbfd800b1abaaabab param1) {
      // $FF: Couldn't be decompiled
   }

   static boolean bba(int param0, int param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   private static void bbb(class_310 param0, class_1309 param1, int param2, boolean param3) {
      // $FF: Couldn't be decompiled
   }

   static {
      int var41 = 1162428658;
      short var36 = 30984;
      int var35 = 0;
      String[] var33 = new String[10];
      int var32 = "\u0015嶔핹䚮緕姷旻䁔앸䁎䷐䊗䗼寔鵾䄮䗓䅷㗻徔╿嗮Á趈艌鳲鋤龋닎鉨ᩍ頒⫢讋쫉颈祐빲ዢ鑋ꋖ\uee48\uea48褒苧贫\udad7頨쉓蹒嫹蝋髗\uee68㉏蒲狠耫뫄\uee68\u0a4e\uf7d2쫸麫靖\uf688橈蜒㋥齫立\uf6a8퉒耲\ue2e3螋\ue2d6胨扉茲鋸豫\ue2cc鰈扎頒\u1ae5軋⋎聨ੈ\uf132\u1ae3\uf16b⫎蠈橍颲䋠被鋌铨≉鷒ዥ蕋\u0aca賈䉉黒뫪\uf3ab\uf2d7諈鉌龒㫢蔋ꋊ陨艎藒\ueae2鳋ው\uf7e8쉒迒닾苋㫊鰨驒課닡虫᫈\uf728䉏耒⋢鈫髈饈\ue24e\uf752櫥葋\uead6肈\uea52蟲뫤\uf06b狗\uf0a8\uea49饒䋢鼫㋉風艒\uf072쫦\uf76b\udacb\uf348牊駒뫾脫諌鱨積衲勤鮫ᫎ谨㉊镒\u1af9\uf1cb髖髈ꩍ\uf392㫢蔫㋌鰨≈覒苣貫櫋鐨\ue24f鑒싣聋䫍茨鉒耒⫥驋틗\uf0a8驉赲\uaafe驋\ueacb賨Š佀恼奚郔喃û崀遼䐚\uf8e9媣䣺䢀\ud842峺ᣩ䷣죽剠硼䕚飩랃\uf0c6䣠\ua87d巚죔䉣裸喠䁃䂚×喃・䅠\u187f䢺飨嗣胺䔀䁹䚚ꃗ䰃ø啀\ua87b덺\uf0d3䜃僼䈀塼䚚磔䕣棸䈀㡿䔚磒뛃裹䧠ၼ䂚䣒婣룹䎠灃刚\ua8da䄃壾뇀偸됺僒俣壻峀끻끺ე䴃ꣽ繀聾塺\ue8e9䣃磽嬀\ua87e嵺ヒ낃磼忀⁼뀺䃕띣룀侠ၺ䙚ࣩ됃\uf0fd䊠恼럺\ud8e8哃僇䎀项呚僔䘣჻깠⡼뎺㣔끣룴嶀졾끺죩亣\u18fb开끺䫚飨뀃㣆岀遾婺룮닃\u18fa놠⡾䐚죗䡃\ud8c6彀၃䞺ꃨ늃죻럀硿䇺⣒댣\u20fc䓀၃䀚⃔끣냀䣠ꡰ妚\uf0e8䠣㣸䥠塼啚\uf0d2䞣\ud8c6䡠桹岚죖뛣ჺ럀ま䶚თ䆣ヽ덀㡿䣚裖䚃\uf0fb啠灃䪺⣖랣Ç댠塸崚ࣗ䟣烾䰀项䎚\ue8d3尣郻佀塃䌚壐幣㣼嬀\ud87d뙚ᣔ夃䣇䋀ၽ䓺惕䅃ࣸ댠x䥚\ud8d2뉣샼䊠灸䏚僩媃胺姀\uf07f䴺\ud8e8䴣ꃇ䖀쁾늚䣩䆣烼䐀衼墺࣐돣⣻侠쁾뚺裔嘣탹䓀桃䠺惐䊃ࣺ删顂䦚ꃖ긣壼䦀遂䚚⣕䩃飇대桿䝺⃩䅃䣸䖠쁹呚裔뎃ꣿ䴀䡃婺\ue8d6妣죻忠聃䠺ࣖ䯣飻䆀遽䝚ᣕ咣\uf8fd䯀⁺䨺࣐䖃ꃼ唀䁃닺㣖䘃ý峀\u1879噺裓䯃\uf0c6덀롾廚꣑䶣⣻둠遃䷺裕\n\ue62d嬕\uef37讑\uec2e㎐\uedad⬔勷殾\u0010䮃梺䓹렕䐀\ud83d季\ud8bc뎙㠗䦀젺嘣낻䶹ꀓ\n퇌荚텖爜毈쨱手튵攑鈟è诐ю阊ᓤ茓蓌覐ᑎ蘪铦鷳\udcca轐\ue44f辊볣蕳\uf4cc飰呌軪䓦蹳\u1cc9觰둎蝊瓹闳ⓗ诰㑊贊고鷳䳎覐\ue44f莪Ⳡ\uf333哈讐鑓譊\ue4f9\uf2f3峍踐ᱎ\uf6ea곡襓ᓗ\uf610ⱓ裪\uf4e4臓볊萐鱓褪쓢蒓㓎\uf070葒黪Ⳣ蘳별詐\ue448豊\uf4e2賓\uf4ca\uf050뱍蓪擹轳듊詰ⱌ變䳤\uf073ӗ蛐屌鱪\uece5趓ᓈ蒰᱈鳪쳦诳䳈黐ﱉ航䳢\uf093ﳊ\uf210챎\uf38a\uece4\uf793蓈阰鱌\uf6aa瓦蠳곏\uf690\udc4f騪蓥襓\ua4cd閰鑌觊糹萓泗走\uec53\uee6a蓢\uf393䳌貐䑈\uf2ca鳸\uf0b3峍\uf1f0䱏菊㳣詳鳊蝰\u244f\uf78aⳣ讳䓎賐䱎\uf34a峤袓쓍臰\ue448骪鳧臓퓍\uf1f0\u1c4c鯪賧蒳쳌訰\u0c4f諪铧菳쳋记ѓ\uf2ea곪褓볉鿰ᑓ\uf36a糣蔓퓉贐ⱍ铪고蠓\ua4cc飐䑌誊\uf4e6軳\uf4ca觐鑉騊᳢諓铗蝐鑒鰊蓤葓䓈趐摊螊ᓥ葳퓋\uf0b0\uf452\uf64a擢\uf053峍蔐둎\uf28a㓢\n鳉숏鱓㊣黊誌齉鈈頓튢\u0010ꜘ็뵂웬ꊻ黯ꇸ䙅뫂蛀ꢻ盃뒸뙆둂\ue6ed\n辐ᑍ輊\ue4f9訓볉谐䑌\uf34aӦ".length();
      String var31 = "\u0015嶔핹䚮緕姷旻䁔앸䁎䷐䊗䗼寔鵾䄮䗓䅷㗻徔╿嗮Á趈艌鳲鋤龋닎鉨ᩍ頒⫢讋쫉颈祐빲ዢ鑋ꋖ\uee48\uea48褒苧贫\udad7頨쉓蹒嫹蝋髗\uee68㉏蒲狠耫뫄\uee68\u0a4e\uf7d2쫸麫靖\uf688橈蜒㋥齫立\uf6a8퉒耲\ue2e3螋\ue2d6胨扉茲鋸豫\ue2cc鰈扎頒\u1ae5軋⋎聨ੈ\uf132\u1ae3\uf16b⫎蠈橍颲䋠被鋌铨≉鷒ዥ蕋\u0aca賈䉉黒뫪\uf3ab\uf2d7諈鉌龒㫢蔋ꋊ陨艎藒\ueae2鳋ው\uf7e8쉒迒닾苋㫊鰨驒課닡虫᫈\uf728䉏耒⋢鈫髈饈\ue24e\uf752櫥葋\uead6肈\uea52蟲뫤\uf06b狗\uf0a8\uea49饒䋢鼫㋉風艒\uf072쫦\uf76b\udacb\uf348牊駒뫾脫諌鱨積衲勤鮫ᫎ谨㉊镒\u1af9\uf1cb髖髈ꩍ\uf392㫢蔫㋌鰨≈覒苣貫櫋鐨\ue24f鑒싣聋䫍茨鉒耒⫥驋틗\uf0a8驉赲\uaafe驋\ueacb賨Š佀恼奚郔喃û崀遼䐚\uf8e9媣䣺䢀\ud842峺ᣩ䷣죽剠硼䕚飩랃\uf0c6䣠\ua87d巚죔䉣裸喠䁃䂚×喃・䅠\u187f䢺飨嗣胺䔀䁹䚚ꃗ䰃ø啀\ua87b덺\uf0d3䜃僼䈀塼䚚磔䕣棸䈀㡿䔚磒뛃裹䧠ၼ䂚䣒婣룹䎠灃刚\ua8da䄃壾뇀偸됺僒俣壻峀끻끺ე䴃ꣽ繀聾塺\ue8e9䣃磽嬀\ua87e嵺ヒ낃磼忀⁼뀺䃕띣룀侠ၺ䙚ࣩ됃\uf0fd䊠恼럺\ud8e8哃僇䎀项呚僔䘣჻깠⡼뎺㣔끣룴嶀졾끺죩亣\u18fb开끺䫚飨뀃㣆岀遾婺룮닃\u18fa놠⡾䐚죗䡃\ud8c6彀၃䞺ꃨ늃죻럀硿䇺⣒댣\u20fc䓀၃䀚⃔끣냀䣠ꡰ妚\uf0e8䠣㣸䥠塼啚\uf0d2䞣\ud8c6䡠桹岚죖뛣ჺ럀ま䶚თ䆣ヽ덀㡿䣚裖䚃\uf0fb啠灃䪺⣖랣Ç댠塸崚ࣗ䟣烾䰀项䎚\ue8d3尣郻佀塃䌚壐幣㣼嬀\ud87d뙚ᣔ夃䣇䋀ၽ䓺惕䅃ࣸ댠x䥚\ud8d2뉣샼䊠灸䏚僩媃胺姀\uf07f䴺\ud8e8䴣ꃇ䖀쁾늚䣩䆣烼䐀衼墺࣐돣⣻侠쁾뚺裔嘣탹䓀桃䠺惐䊃ࣺ删顂䦚ꃖ긣壼䦀遂䚚⣕䩃飇대桿䝺⃩䅃䣸䖠쁹呚裔뎃ꣿ䴀䡃婺\ue8d6妣죻忠聃䠺ࣖ䯣飻䆀遽䝚ᣕ咣\uf8fd䯀⁺䨺࣐䖃ꃼ唀䁃닺㣖䘃ý峀\u1879噺裓䯃\uf0c6덀롾廚꣑䶣⣻둠遃䷺裕\n\ue62d嬕\uef37讑\uec2e㎐\uedad⬔勷殾\u0010䮃梺䓹렕䐀\ud83d季\ud8bc뎙㠗䦀젺嘣낻䶹ꀓ\n퇌荚텖爜毈쨱手튵攑鈟è诐ю阊ᓤ茓蓌覐ᑎ蘪铦鷳\udcca轐\ue44f辊볣蕳\uf4cc飰呌軪䓦蹳\u1cc9觰둎蝊瓹闳ⓗ诰㑊贊고鷳䳎覐\ue44f莪Ⳡ\uf333哈讐鑓譊\ue4f9\uf2f3峍踐ᱎ\uf6ea곡襓ᓗ\uf610ⱓ裪\uf4e4臓볊萐鱓褪쓢蒓㓎\uf070葒黪Ⳣ蘳별詐\ue448豊\uf4e2賓\uf4ca\uf050뱍蓪擹轳듊詰ⱌ變䳤\uf073ӗ蛐屌鱪\uece5趓ᓈ蒰᱈鳪쳦诳䳈黐ﱉ航䳢\uf093ﳊ\uf210챎\uf38a\uece4\uf793蓈阰鱌\uf6aa瓦蠳곏\uf690\udc4f騪蓥襓\ua4cd閰鑌觊糹萓泗走\uec53\uee6a蓢\uf393䳌貐䑈\uf2ca鳸\uf0b3峍\uf1f0䱏菊㳣詳鳊蝰\u244f\uf78aⳣ讳䓎賐䱎\uf34a峤袓쓍臰\ue448骪鳧臓퓍\uf1f0\u1c4c鯪賧蒳쳌訰\u0c4f諪铧菳쳋记ѓ\uf2ea곪褓볉鿰ᑓ\uf36a糣蔓퓉贐ⱍ铪고蠓\ua4cc飐䑌誊\uf4e6軳\uf4ca觐鑉騊᳢諓铗蝐鑒鰊蓤葓䓈趐摊螊ᓥ葳퓋\uf0b0\uf452\uf64a擢\uf053峍蔐둎\uf28a㓢\n鳉숏鱓㊣黊誌齉鈈頓튢\u0010ꜘ็뵂웬ꊻ黯ꇸ䙅뫂蛀ꢻ盃뒸뙆둂\ue6ed\n辐ᑍ輊\ue4f9訓볉谐䑌\uf34aӦ";
      int var34 = 0;

      do {
         char var37 = var31.charAt(var35);
         int var10001 = var35 + 1;
         int var39 = 0;
         char[] var38 = var31.substring(var10001, var10001 + var37).toCharArray();

         do {
            int var40 = var38[var39];
            short var10000;
            switch (var39 % 6) {
               case 0:
               default:
                  var10000 = 128;
                  break;
               case 1:
                  var10000 = 111;
                  break;
               case 2:
                  var10000 = 218;
                  break;
               case 3:
                  var10000 = 197;
                  break;
               case 4:
                  var10000 = 227;
                  break;
               case 5:
                  var10000 = 235;
            }

            var40 = (char)var10000 ^ var40;
            if (var39 % 2 == 0) {
               var38[var39] = (char)((var40 >>> 5 | var40 << 11) & '\uffff' ^ var36);
            } else {
               var38[var39] = (char)((var40 << 5 | var40 >>> 11) & '\uffff' ^ var36);
            }

            ++var39;
         } while(var39 < var38.length);

         var33[var34] = new String(var38);
         ++var34;
         var35 = var35 + var37 + 1;
      } while(var35 < var32);

      bbbb = var33;
      aaaaa = new Object[var33.length];
      bbba = new int[186];
      int var48 = 0;
      int var55 = 0;
      byte[] var10002 = "Qüð\u0004\u001887\u001e¾ÐsØ°îÂ(Aæ\u009e\u0090\u0090=ø^@:Eõ\u008d\u008fâ7QqÒvÀ\u0018Â\u0013¶½D\u001b%\u0080+ïÕVÑ$a,ÛÊõ\u0017\u00025q}\u0013±I\u0010ëËÔE\u0015\u001d\u0018º%âÕÊí\u0089ÊüßútÅ\u0096¢\u0087à?ç'ò2k;\u0086R\u0099Ç\u001a\u001f\u0019\t\u0010=\u0087©ÑJÖªÍiö.vn3\u0085|\u0098h\u009bäìµÕå\u009b¿çüç\u0016³|\u0087¸g¸FN\u0019ãMg}°¹wÖe|ÝìBÖÙCÔÜ\u000e`i\u0018j\u009cHà~h¦rsµO\u008bá\u0004Ü\u00162ß[\"1u_/K]#M\u0018&QÒpW²ÝÍsW\u0018\u0015½e=âýÃ|ý\u0098sR'òL\u0099\u0004ó´ü¦e½¹\u0082NE1UÜ^ì$)9 ÉcnLÍ3×{¿Ã\u008e\u0085¾\u009bo9y-q*ÆKQ\u0092µô?P\u000e\u001eßhV¾ÿÆx¦åÄ\u0099Ó:ü\u0013P403÷MîÐIåªU\u0083\u0083\u0018¸\u007f\u009b\u009e\u008auå||è^±IO]9Ù=àGó£\u0088¦\u0094Ý\u001c\u0080\u00809AûêÌ\\á4\bº\u0096\u0088ùB\u0098ì\u007f\u0005E%íg»ªæë\u0015]!\"ob\tí\u009e\u008c¡~eÇ\u001b\u0017àY\u0090¾E«¬}\t\u008fÏÐþ\r@É÷²OT\u009ft2£\u0086Õ=\b \u001cbãø²ô\u0013\u0004\u0096_\u008dÇpC÷dÔ|Y\u000eg²>5b\tvÿ\u0002îpñ+àaw£\u001bÄL\u0083×êA\u0086ÚÉ#\u0015ãµ~\u0018@\u0001\u0010\u0005¡\u0014¾_ÇZnb\u0098\u0000Òsiæ\b\u009açaTêîìeDë\u0098ÀZÎ\u008e\u0080\u001a²¤28zJ ¹p~°ø\u0089\u0085\u0083É©ÈSRÜ©û\u0002\u001e£}\u008eÔA\u0098\u001bØ\u00ad\"\u0093\u009bHîóø\u009d\u0099vm)ÍT5p?±%w\u0011BØ\u0087WÐ\tî`¬\u00ad\u0092Ù¿9\u0010\u0082û¹I\u0017\u0087ssæ$v\u0081\u008b\u0007\u0001æh~P\u0084ã¡~G~&òIE&,\u0005Ñ\\\u0095ÿ|\u00adagº¥H\u001d\u0089\u008f\u009aèÐËÀ\u0002\\\u0012ND{\u0099ÝØ\u009co:%)I°\u0097'æ=çÌ`Â§Êø\u0013$RJ\u0014þ2Â \u0081O\u0014\u001eÚWÌ\u008cMÿ\u0080\u0085ÌP\u009fJÚ\u0097\u0082-7/\u0094\u009e\u0011!ey\u001b\u0005÷X?\u0007\u000bÑPù\u009fÜeCN!åd\u0004\u0089¹g|\u001eLb·\u0014¹'¢T\b>\u0084Ö4úÎð \u001e\u0098¡\u0083ß\u0097Õ4\u009dR¼W\u001f¬ÒUxÃÝkl\u0013;þ\u0097p".getBytes("ISO-8859-1");

      int var103;
      do {
         bbba[var48] = ((var10002[var55] & 255) << 24 | (var10002[var55 + 1] & 255) << 16 | (var10002[var55 + 2] & 255) << 8 | var10002[var55 + 3] & 255) ^ 759000307;
         ++var48;
         var103 = var55 + 4;
         var55 += 4;
      } while(var103 < var10002.length);

      String[] var16 = new String[4];
      int var20 = 0;
      String var19;
      int var21 = (var19 = bbbbb(8597, var41 ^ -634122318, 19779)).length();
      int var18 = bbbba(-1259990353, var41 ^ 262743615);
      int var45 = -1;

      label166:
      while(true) {
         ++var45;
         String var49 = var19.substring(var45, var45 + var18);
         var55 = -1;

         while(true) {
            label161: {
               char[] var60 = var49.toCharArray();
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
                     break label161;
                  }

                  var107 = var60;
                  var127 = var22;
               }

               while(true) {
                  char var138 = var107[var127];
                  int var142;
                  switch (var22 % bbbba(-1259990367, var41 ^ 735982595)) {
                     case 0 -> var142 = bbbba(-1259990366, var41 ^ -1787400032);
                     case 1 -> var142 = bbbba(-1259990365, var41 ^ 1594933908);
                     case 2 -> var142 = bbbba(-1259990364, var41 ^ -1559739266);
                     case 3 -> var142 = bbbba(-1259990363, var41 ^ -1451841961);
                     case 4 -> var142 = bbbba(-1259990362, var41 ^ 885877717);
                     case 5 -> var142 = bbbba(-1259990361, var41 ^ -1815157768);
                     default -> var142 = bbbba(-1259990344, var41 ^ -512516810);
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
            switch (var55) {
               case 0:
                  var16[var20++] = var114;
                  if ((var45 += var18) >= var21) {
                     long var8 = 2602997591711679336L;
                     long[] var14 = new long[bbbba(-1259990343, var41 ^ 2132507530)];
                     int var11 = 0;
                     String var12;
                     int var13 = (var12 = bbbbb(8599, var41 ^ -2015421609, 45281)).length();
                     int var10 = 0;

                     label137:
                     while(true) {
                        var55 = var10;
                        var10 += 8;
                        byte[] var15 = var12.substring(var55, var10).getBytes(bbbbb(8598, var41 ^ 234907420, 16598));
                        long[] var51 = var14;
                        var55 = var11++;
                        long var89 = ((long)var15[0] & 255L) << bbbba(-1259990342, var41 ^ 26172803) | ((long)var15[1] & 255L) << bbbba(-1259990341, var41 ^ -439212320) | ((long)var15[2] & 255L) << bbbba(-1259990340, var41 ^ 282016801) | ((long)var15[3] & 255L) << bbbba(-1259990339, var41 ^ -735490924) | ((long)var15[4] & 255L) << bbbba(-1259990338, var41 ^ 634471115) | ((long)var15[5] & 255L) << bbbba(-1259990337, var41 ^ -1550409973) | ((long)var15[bbbba(-1259990352, var41 ^ 838099301)] & 255L) << bbbba(-1259990351, var41 ^ 980995941) | (long)var15[bbbba(-1259990350, var41 ^ -38685278)] & 255L;
                        byte var115 = -1;

                        while(true) {
                           long var129 = var89 ^ var8;
                           switch (var115) {
                              case 0:
                                 var51[var55] = var129;
                                 if (var10 >= var13) {
                                    ba = var14;
                                    babb = new Integer[bbbba(-1259990388, var41 ^ -509903561)];
                                    long var0 = 5708049104163054055L;
                                    long[] var6 = new long[bbbba(-1259990387, var41 ^ -1099947339)];
                                    int var3 = 0;
                                    String var4;
                                    int var5 = (var4 = bbbbb(8595, var41 ^ 1145076025, 64916)).length();
                                    int var2 = 0;

                                    label127:
                                    while(true) {
                                       var55 = var2;
                                       var2 += 8;
                                       byte[] var7 = var4.substring(var55, var2).getBytes(bbbbb(8594, var41 ^ 744032122, 23930));
                                       var51 = var6;
                                       var55 = var3++;
                                       var89 = ((long)var7[0] & 255L) << bbbba(-1259990386, var41 ^ 679532961) | ((long)var7[1] & 255L) << bbbba(-1259990385, var41 ^ -2095179186) | ((long)var7[2] & 255L) << bbbba(-1259990400, var41 ^ -1620788739) | ((long)var7[3] & 255L) << bbbba(-1259990399, var41 ^ -1597320121) | ((long)var7[4] & 255L) << bbbba(-1259990398, var41 ^ 1856892793) | ((long)var7[5] & 255L) << bbbba(-1259990397, var41 ^ -706403056) | ((long)var7[bbbba(-1259990396, var41 ^ 853748688)] & 255L) << bbbba(-1259990395, var41 ^ 1022537135) | (long)var7[bbbba(-1259990394, var41 ^ -950561161)] & 255L;
                                       var115 = -1;

                                       while(true) {
                                          var129 = var89 ^ var0;
                                          switch (var115) {
                                             case 0:
                                                var51[var55] = var129;
                                                if (var2 >= var5) {
                                                   bbaa = var6;
                                                   abbb = new Long[bbbba(-1259990384, var41 ^ 847232862)];
                                                   long var23 = babba(bbbba(-1259990383, var41 ^ 923288870), 5871232718762897279L);
                                                   long[] var29 = new long[aaaaa(bbbba(-1259990382, var41 ^ 304016643), 977138187919916532L)];
                                                   int var26 = 0;
                                                   String var27;
                                                   int var28 = (var27 = var16[3]).length();
                                                   int var25 = 0;

                                                   label117:
                                                   while(true) {
                                                      var55 = var25;
                                                      var25 += 8;
                                                      byte[] var30 = var27.substring(var55, var25).getBytes(var16[0]);
                                                      var51 = var29;
                                                      var55 = var26++;
                                                      var89 = ((long)var30[0] & babba(bbbba(-1259990381, var41 ^ 1848904333), 2313040843246426668L)) << aaaaa(bbbba(-1259990380, var41 ^ -1495649155), 5034984588538336443L) | ((long)var30[1] & babba(bbbba(-1259990379, var41 ^ -1393668927), 1907737249286481837L)) << aaaaa(bbbba(-1259990378, var41 ^ 1427502381), 5163547890486670028L) | ((long)var30[2] & babba(bbbba(-1259990377, var41 ^ 1968746345), 1907737249286481837L)) << aaaaa(bbbba(-1259990424, var41 ^ 3790045), 5557468177629134035L) | ((long)var30[3] & babba(bbbba(-1259990423, var41 ^ -1036811957), 1907737249286481837L)) << aaaaa(bbbba(-1259990422, var41 ^ 147975100), 308358546074369812L) | ((long)var30[4] & babba(bbbba(-1259990421, var41 ^ 71163476), 1907737249286481837L)) << aaaaa(bbbba(-1259990420, var41 ^ 1205546818), 399829116115732745L) | ((long)var30[5] & babba(bbbba(-1259990419, var41 ^ 604857783), 1907737249286481837L)) << aaaaa(bbbba(-1259990418, var41 ^ -1313214200), 6757255894294056087L) | ((long)var30[aaaaa(bbbba(-1259990417, var41 ^ -370939852), 6674049745257995065L)] & babba(bbbba(-1259990432, var41 ^ -102240882), 1907737249286481837L)) << aaaaa(bbbba(-1259990431, var41 ^ 68646880), 7036458409882314882L) | (long)var30[aaaaa(bbbba(-1259990430, var41 ^ -713159489), 4690197054588779710L)] & babba(bbbba(-1259990429, var41 ^ 1895966064), 1907737249286481837L);
                                                      var115 = -1;

                                                      while(true) {
                                                         var129 = var89 ^ var23;
                                                         switch (var115) {
                                                            case 0:
                                                               var51[var55] = var129;
                                                               if (var25 >= var28) {
                                                                  abab = var29;
                                                                  abb = new Integer[aaaaa(bbbba(-1259990411, var41 ^ 1812260430), 399829116115732745L)];
                                                                  aaab = aaab(aaaaa(bbbba(-1259990410, var41 ^ -512486335), 5380307383397748925L), babba(bbbba(-1259990409, var41 ^ 506933380), 141612163305301780L));
                                                                  aab = aaab(aaaaa(bbbba(-1259990456, var41 ^ -810258369), 6972762817657169562L), babba(bbbba(-1259990455, var41 ^ -932318552), 4149801726951793194L));
                                                                  baab = aaab(aaaaa(bbbba(-1259990454, var41 ^ -65949214), 2821301568878316072L), babba(bbbba(-1259990453, var41 ^ -1035322235), 346336482279724039L));
                                                                  aabb = aaab(aaaaa(bbbba(-1259990452, var41 ^ 1356732739), 8814083736202486492L), babba(bbbba(-1259990451, var41 ^ 1499227271), 7251062758153314021L));
                                                                  bba = aaab(aaaaa(bbbba(-1259990450, var41 ^ -1773507864), 620781080908434801L), babba(bbbba(-1259990449, var41 ^ -240711117), 8498729652149948266L));
                                                                  bbb = aaab(aaaaa(bbbba(-1259990464, var41 ^ 1115879052), 6932094325844153569L), babba(bbbba(-1259990463, var41 ^ -1517762693), 1968597534078381126L));
                                                                  aa = aaab(aaaaa(bbbba(-1259990462, var41 ^ -2068875621), 3754474070599792911L), babba(bbbba(-1259990461, var41 ^ 230895892), 3381698577702234704L));
                                                                  b = aaab(aaaaa(bbbba(-1259990460, var41 ^ 16162870), 7683357663526432682L), babba(bbbba(-1259990459, var41 ^ -42565489), 6384438249094565442L));
                                                                  bbab = aaab(aaaaa(bbbba(-1259990458, var41 ^ 1428780135), 7125756351254224825L), babba(bbbba(-1259990457, var41 ^ -1025747014), 251722600900517844L));
                                                                  int var54 = aaaaa(bbbba(-1259990440, var41 ^ -936826614), 6336704188784958036L);
                                                                  bb = new HashMap();
                                                                  baaa = aaab(var54, babba(bbbba(-1259990439, var41 ^ -2003293853), 6523699111232975177L));
                                                                  ab = aaab(aaaaa(bbbba(-1259990438, var41 ^ 178582628), 6336704188784958036L), babba(bbbba(-1259990437, var41 ^ 749734269), 6523699111232975177L));
                                                                  baa = aaab(aaaaa(bbbba(-1259990436, var41 ^ 2098450747), 6336704188784958036L), babba(bbbba(-1259990435, var41 ^ 161778353), 6523699111232975177L));
                                                                  bab = aaab(aaaaa(bbbba(-1259990434, var41 ^ 1623658754), 6336704188784958036L), babba(bbbba(-1259990433, var41 ^ 247820066), 6523699111232975177L));
                                                                  abba = aaab(aaaaa(bbbba(-1259990448, var41 ^ 33252019), 6336704188784958036L), babba(bbbba(-1259990447, var41 ^ -412188513), 6523699111232975177L));
                                                                  return;
                                                               }
                                                               break;
                                                            default:
                                                               var51[var55] = var129;
                                                               if (var25 < var28) {
                                                                  continue label117;
                                                               }

                                                               var28 = (var27 = var16[2]).length();
                                                               var25 = 0;
                                                         }

                                                         var55 = var25;
                                                         var25 += 8;
                                                         var30 = var27.substring(var55, var25).getBytes(var16[1]);
                                                         var51 = var29;
                                                         var55 = var26++;
                                                         var89 = ((long)var30[0] & babba(bbbba(-1259990428, var41 ^ -444563917), 1907737249286481837L)) << aaaaa(bbbba(-1259990427, var41 ^ 1708736134), 8855297561946775973L) | ((long)var30[1] & babba(bbbba(-1259990426, var41 ^ -1344070930), 1907737249286481837L)) << aaaaa(bbbba(-1259990425, var41 ^ -1441679221), 5817468421247680277L) | ((long)var30[2] & babba(bbbba(-1259990408, var41 ^ -579431254), 1907737249286481837L)) << aaaaa(bbbba(-1259990407, var41 ^ -1944784312), 3138068203630647780L) | ((long)var30[3] & babba(bbbba(-1259990406, var41 ^ -1562934544), 1907737249286481837L)) << aaaaa(bbbba(-1259990405, var41 ^ 786005306), 5677290188332576939L) | ((long)var30[4] & babba(bbbba(-1259990404, var41 ^ -258658932), 1907737249286481837L)) << aaaaa(bbbba(-1259990403, var41 ^ 1231863053), 399829116115732745L) | ((long)var30[5] & babba(bbbba(-1259990402, var41 ^ -1107868041), 1907737249286481837L)) << aaaaa(bbbba(-1259990401, var41 ^ -1802639460), 8716241596373695149L) | ((long)var30[aaaaa(bbbba(-1259990416, var41 ^ 1182333210), 2723525700042088957L)] & babba(bbbba(-1259990415, var41 ^ 479371471), 1907737249286481837L)) << aaaaa(bbbba(-1259990414, var41 ^ -1831598017), 7511808085041708856L) | (long)var30[aaaaa(bbbba(-1259990413, var41 ^ 21712465), 1025427991779808915L)] & babba(bbbba(-1259990412, var41 ^ -424290927), 1907737249286481837L);
                                                         var115 = 0;
                                                      }
                                                   }
                                                }
                                                break;
                                             default:
                                                var51[var55] = var129;
                                                if (var2 < var5) {
                                                   continue label127;
                                                }

                                                var5 = (var4 = bbbbb(8605, var41 ^ 818829097, 50382)).length();
                                                var2 = 0;
                                          }

                                          var55 = var2;
                                          var2 += 8;
                                          var7 = var4.substring(var55, var2).getBytes(bbbbb(8604, var41 ^ 440759572, 41884));
                                          var51 = var6;
                                          var55 = var3++;
                                          var89 = ((long)var7[0] & 255L) << bbbba(-1259990393, var41 ^ 192519352) | ((long)var7[1] & 255L) << bbbba(-1259990376, var41 ^ 106626620) | ((long)var7[2] & 255L) << bbbba(-1259990375, var41 ^ 1059496744) | ((long)var7[3] & 255L) << bbbba(-1259990374, var41 ^ -1668101570) | ((long)var7[4] & 255L) << bbbba(-1259990373, var41 ^ 2106025053) | ((long)var7[5] & 255L) << bbbba(-1259990372, var41 ^ 466203759) | ((long)var7[bbbba(-1259990371, var41 ^ 1150486673)] & 255L) << bbbba(-1259990370, var41 ^ -1250569587) | (long)var7[bbbba(-1259990369, var41 ^ 1005751815)] & 255L;
                                          var115 = 0;
                                       }
                                    }
                                 }
                                 break;
                              default:
                                 var51[var55] = var129;
                                 if (var10 < var13) {
                                    continue label137;
                                 }

                                 var13 = (var12 = bbbbb(8593, var41 ^ 648741576, 14765)).length();
                                 var10 = 0;
                           }

                           var55 = var10;
                           var10 += 8;
                           var15 = var12.substring(var55, var10).getBytes(bbbbb(8592, var41 ^ -1303825521, 59586));
                           var51 = var14;
                           var55 = var11++;
                           var89 = ((long)var15[0] & 255L) << bbbba(-1259990349, var41 ^ -713145466) | ((long)var15[1] & 255L) << bbbba(-1259990348, var41 ^ 2112731330) | ((long)var15[2] & 255L) << bbbba(-1259990347, var41 ^ -947634875) | ((long)var15[3] & 255L) << bbbba(-1259990346, var41 ^ 1278058428) | ((long)var15[4] & 255L) << bbbba(-1259990345, var41 ^ 1894699937) | ((long)var15[5] & 255L) << bbbba(-1259990392, var41 ^ 323167252) | ((long)var15[bbbba(-1259990391, var41 ^ -1671811772)] & 255L) << bbbba(-1259990390, var41 ^ -1815657097) | (long)var15[bbbba(-1259990389, var41 ^ -298820564)] & 255L;
                           var115 = 0;
                        }
                     }
                  }

                  var18 = var19.charAt(var45);
                  break;
               default:
                  var16[var20++] = var114;
                  if ((var45 += var18) < var21) {
                     var18 = var19.charAt(var45);
                     continue label166;
                  }

                  var21 = (var19 = bbbbb(8596, var41 ^ 1410746530, 11657)).length();
                  var18 = bbbba(-1259990368, var41 ^ -1935152638);
                  var45 = -1;
            }

            ++var45;
            var49 = var19.substring(var45, var45 + var18);
            var55 = 0;
         }
      }
   }

   private static boolean aaaa(class_1309 param0) {
      // $FF: Couldn't be decompiled
   }

   private static int aaab(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & babba(bbbba(-1259990298, -20153560 ^ -1845370051), 7347386022614942765L)) ^ aaaaa(bbbba(-1259990297, -20153560 ^ 375968307), 3876826832671903263L);

      try {
         if (abb[var3] == null) {
            abb[var3] = (int)(abab[var3] ^ var1);
         }
      } catch (MatchException var4) {
         throw var4;
      }

      return abb[var3];
   }

   public static boolean aaba(class_310 param0, class_1309 param1) {
      // $FF: Couldn't be decompiled
   }

   static boolean aabb(int param0, int param1) {
      // $FF: Couldn't be decompiled
   }

   public static void abaa(class_310 param0, class_6880 param1, double param2, double param4, double param6) {
      // $FF: Couldn't be decompiled
   }

   private static int bbbba(int var0, int var1) {
      int var2 = bbba[var0 ^ -1259990296] ^ var1 ^ var0;
      var2 -= 19747;
      var2 -= 60062;
      var2 -= 40288;
      var2 ^= 25477;
      var2 -= 3861;
      var2 ^= 24005;
      return var2;
   }

   private static boolean abab(class_310 param0, class_1309 param1) {
      // $FF: Couldn't be decompiled
   }

   private static boolean abba(class_1799 param0, class_6880 param1) {
      // $FF: Couldn't be decompiled
   }

   private static class_10707 abbb(class_1799 param0) {
      // $FF: Couldn't be decompiled
   }

   private static boolean baaa(class_1309 param0) {
      // $FF: Couldn't be decompiled
   }

   public static class_243 baab(class_746 var0) {
      try {
         try {
            if (var0 == null) {
               return null;
            }
         } catch (IllegalStateException var1) {
            throw var1;
         }
      } catch (MatchException var2) {
         throw var2;
      }

      return new class_243(q2997348aa27a422480aea29cbfd800b1abbbbaa.abaa(var0), q2997348aa27a422480aea29cbfd800b1abbbbaa.baa(var0), q2997348aa27a422480aea29cbfd800b1abbbbaa.aaaaa(var0));
   }

   static int baba(int param0, int param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   static boolean babb(double param0, double param2, boolean param4) {
      // $FF: Couldn't be decompiled
   }

   static int bbaa(class_1309 param0) {
      // $FF: Couldn't be decompiled
   }

   public static void bbab(class_310 var0, class_1309 var1, int var2) {
      bbb(var0, var1, var2, false);
   }

   public static void bbba(class_1309 param0, int param1) {
      // $FF: Couldn't be decompiled
   }

   private static class_1799 bbbb(class_1309 param0) {
      // $FF: Couldn't be decompiled
   }

   private static int aaaaa(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ bbbba(-1259990284, 1257259965 ^ 2045043441);
      if (babb[var3] == null) {
         babb[var3] = (int)(ba[var3] ^ var1);
      }

      return babb[var3];
   }

   static boolean aaaab(int param0, int param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   private static void aaaba(class_310 param0, class_1309 param1, int param2, boolean param3, int param4) {
      // $FF: Couldn't be decompiled
   }

   static boolean aaabb(int param0, int param1) {
      // $FF: Couldn't be decompiled
   }

   public static void aabaa(class_310 param0) {
      // $FF: Couldn't be decompiled
   }

   public static void aabab(class_310 param0, class_1309 param1, byte param2) {
      // $FF: Couldn't be decompiled
   }

   public static void aabba(class_310 param0, class_1309 param1) {
      // $FF: Couldn't be decompiled
   }

   private static boolean aabbb(class_310 param0, class_1309 param1) {
      // $FF: Couldn't be decompiled
   }

   private static void abaaa(class_310 param0, class_1309 param1, class_1799 param2) {
      // $FF: Couldn't be decompiled
   }

   static boolean abaab(double param0, double param2, float param4, double param5, double param7, float param9) {
      // $FF: Couldn't be decompiled
   }

   private static boolean ababa(class_1309 param0) {
      // $FF: Couldn't be decompiled
   }

   private q2997348aa27a422480aea29cbfd800b1abbbba() {
   }

   static boolean ababb(double param0, double param2, float param4, double param5, double param7, float param9) {
      // $FF: Couldn't be decompiled
   }

   private static boolean abbaa(class_1309 param0) {
      // $FF: Couldn't be decompiled
   }

   public static int abbab(class_310 param0) {
      // $FF: Couldn't be decompiled
   }

   private static class_1799 abbba(class_1309 param0) {
      // $FF: Couldn't be decompiled
   }

   private static boolean abbbb(class_310 param0, q2997348aa27a422480aea29cbfd800b1abaaabab param1) {
      // $FF: Couldn't be decompiled
   }

   public static int baaaa(class_310 var0) {
      return class_3532.method_15340(abbab(var0) / aaab(aaaaa(bbbba(-1259990311, 1712481541 ^ -644272572), 3558746017813303412L), babba(bbbba(-1259990310, 1712481541 ^ -1468428364), 4606860698689081794L)), 0, aaab(aaaaa(bbbba(-1259990309, 1712481541 ^ -1935929877), 6806038144411547709L), babba(bbbba(-1259990308, 1712481541 ^ 1118712900), 7523562324343019141L)));
   }

   static boolean baaab(int param0, int param1) {
      // $FF: Couldn't be decompiled
   }

   private static void baaba(class_310 param0, class_1309 param1, q2997348aa27a422480aea29cbfd800b1abaaabab param2, boolean param3, class_1799 param4) {
      // $FF: Couldn't be decompiled
   }

   public static boolean baabb(class_1309 param0, class_243 param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   public static int babaa(class_310 param0) {
      // $FF: Couldn't be decompiled
   }

   private static int babab(class_1309 param0) {
      // $FF: Couldn't be decompiled
   }

   private static long babba(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ bbbba(-1259990315, -256575092 ^ 168028782)) & bbbba(-1259990314, -256575092 ^ 1522195453);
      if (abbb[var3] == null) {
         abbb[var3] = bbaa[var3] ^ var1;
      }

      return abbb[var3];
   }

   private static boolean a(class_1309 var0) {
      int var10000 = q2997348aa27a422480aea29cbfd800b1aabaabaaa.bb;
      q2997348aa27a422480aea29cbfd800b1abaaabab var2 = bbabb(var0);
      int var1 = var10000;

      label54: {
         label41: {
            try {
               try {
                  var7 = var2;
                  if (var1 != 0) {
                     break label41;
                  }

                  if (var2 == null) {
                     break label54;
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
               var10000 = var7.abb;
               if (var1 != 0) {
                  return (boolean)var10000;
               }

               if (!var10000) {
                  break label54;
               }
            } catch (IllegalStateException var3) {
               throw var3;
            }
         } catch (MatchException var4) {
            throw var4;
         }

         var10000 = 0;
         return (boolean)var10000;
      }

      var10000 = 1;
      return (boolean)var10000;
   }

   static boolean babbb(int param0, int param1) {
      // $FF: Couldn't be decompiled
   }

   public static void bbaaa() {
      int var10000 = aaaaa(bbbba(-1259990359, 926878539 ^ -2087227610), 6336704188784958036L);
      bb.clear();
      baaa = aaab(var10000, babba(bbbba(-1259990358, 926878539 ^ -440938984), 6523699111232975177L));
      bab = aaab(aaaaa(bbbba(-1259990357, 926878539 ^ 1524176364), 6336704188784958036L), babba(bbbba(-1259990356, 926878539 ^ -1338428163), 6523699111232975177L));
   }

   private static boolean bbaab(class_1309 param0) {
      // $FF: Couldn't be decompiled
   }

   static boolean bbaba(int param0, int param1, int param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   private static q2997348aa27a422480aea29cbfd800b1abaaabab bbabb(class_1309 param0) {
      // $FF: Couldn't be decompiled
   }

   private static void bbbaa(class_1309 var0) {
      bab = var0.method_5628();
      abba = var0.field_6012 + aaab(aaaaa(bbbba(-1259990355, -2006446390 ^ -1353804780), 4606505662694812715L), babba(bbbba(-1259990354, -2006446390 ^ -1219192702), 6408031453913496713L));
   }

   public static boolean bbbab(class_310 param0, class_1309 param1) {
      // $FF: Couldn't be decompiled
   }

   private static q2997348aa27a422480aea29cbfd800b1abaaabab b(class_1309 var0) {
      int var10000 = q2997348aa27a422480aea29cbfd800b1aabaabaaa.bb;
      q2997348aa27a422480aea29cbfd800b1abaaabab var2 = bbabb(var0);
      int var1 = var10000;

      label24: {
         try {
            try {
               var5 = var2;
               if (var1 != 0) {
                  return var5;
               }

               if (var2 != null) {
                  break label24;
               }
            } catch (IllegalStateException var3) {
               throw var3;
            }
         } catch (MatchException var4) {
            throw var4;
         }

         var2 = new q2997348aa27a422480aea29cbfd800b1abaaabab();
         var2.ab = a;
         var2.bab = var0.field_6012;
         bb.put(var0.method_5628(), var2);
      }

      var5 = var2;
      return var5;
   }
}
