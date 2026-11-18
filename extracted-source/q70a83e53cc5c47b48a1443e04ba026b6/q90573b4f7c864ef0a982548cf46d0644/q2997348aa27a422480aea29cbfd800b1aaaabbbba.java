package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public final class q2997348aa27a422480aea29cbfd800b1aaaabbbba {
   private static final Map a;
   private static final String[] bb;
   private static final Object[] aaa;
   private static final Map b;
   private static volatile int aa;
   private static final int[] ba;
   private static final Map ab;

   public static int a(UUID param0) {
      // $FF: Couldn't be decompiled
   }

   public static int aa() {
      return aa;
   }

   private static int b(int var0, int var1) {
      int var2 = ba[var0 ^ -2102870216] ^ var1 ^ var0;
      var2 ^= 15124;
      var2 ^= 40871;
      var2 -= 58967;
      var2 ^= 27853;
      var2 ^= 27016;
      var2 ^= 2350;
      var2 ^= 7095;
      var2 -= 21751;
      return var2;
   }

   public static void ab(UUID param0, int param1) {
      // $FF: Couldn't be decompiled
   }

   static {
      int var28 = 1469073677;
      short var23 = 8103;
      int var22 = 0;
      int var21 = 0;
      String[] var20 = new String[2];
      int var19 = "\u0010捬嚒恉嚱怕隁捝囗懍噊惸隖憙ᚙ抍隠\n\uecab\u2e78\uef72깒\uec9a\u2e74\ueece긤\ueffe꺋".length();
      String var18 = "\u0010捬嚒恉嚱怕隁捝囗懍噊惸隖憙ᚙ抍隠\n\uecab\u2e78\uef72깒\uec9a\u2e74\ueece긤\ueffe꺋";

      do {
         int var26 = 0;
         char var24 = var18.charAt(var22);
         char[] var25 = var18.substring(var22 + 1, var22 + 1 + var24).toCharArray();

         do {
            int var27 = var25[var26];
            short var10000;
            switch (var26 % 5) {
               case 0:
               default:
                  var10000 = 177;
                  break;
               case 1:
                  var10000 = 136;
                  break;
               case 2:
                  var10000 = 252;
                  break;
               case 3:
                  var10000 = 176;
                  break;
               case 4:
                  var10000 = 96;
            }

            var27 = (char)var10000 ^ var27;
            if (var26 % 2 == 0) {
               var25[var26] = (char)((var27 >>> 2 | var27 << 14) & '\uffff' ^ var23);
            } else {
               var25[var26] = (char)((var27 << 2 | var27 >>> 14) & '\uffff' ^ var23);
            }

            ++var26;
         } while(var26 < var25.length);

         var20[var21] = new String(var25);
         ++var21;
         var22 = var22 + var24 + 1;
      } while(var22 < var19);

      bb = var20;
      aaa = new Object[var20.length];
      int var14 = -1296765247;
      byte[] var12 = "Ø\u008b\u0083âCäGu\u0094\u0006«=·E +\u0095\u0099áí¬º²Fª\u0018\u0087í°\u0013éd{\b\u0096X".getBytes("ISO-8859-1");
      int var13 = var12.length / 4;
      ba = new int[var13];
      int var15 = 0;
      int var16 = 0;

      do {
         int var17 = (var12[var15] & 255) << 24 | (var12[var15 + 1] & 255) << 16 | (var12[var15 + 2] & 255) << 8 | var12[var15 + 3] & 255;
         var17 ^= var14;
         ba[var16] = var17;
         var15 += 4;
         ++var16;
      } while(var16 < var13);

      long var1 = 9055005642414524342L;
      long[] var0 = new long[2];
      int var4 = 0;
      String var5;
      int var6 = (var5 = bab(769428442, var28 ^ -723108110)).length();
      int var3 = 0;

      do {
         int var10001 = var3;
         var3 += 8;
         byte[] var7 = var5.substring(var10001, var3).getBytes(bab(769428443, var28 ^ 928718911));
         var10001 = var4++;
         long var10004 = (((long)var7[0] & 255L) << b(-2102870216, var28 ^ -1090119953) | ((long)var7[1] & 255L) << b(-2102870215, var28 ^ 610914913) | ((long)var7[2] & 255L) << b(-2102870214, var28 ^ -208978334) | ((long)var7[3] & 255L) << b(-2102870213, var28 ^ -792185523) | ((long)var7[4] & 255L) << b(-2102870212, var28 ^ -233540476) | ((long)var7[5] & 255L) << b(-2102870211, var28 ^ -885577930) | ((long)var7[b(-2102870210, var28 ^ -845868332)] & 255L) << b(-2102870209, var28 ^ -677479330) | (long)var7[b(-2102870224, var28 ^ 478479214)] & 255L) ^ var1;
         boolean var10003 = true;
         var0[var10001] = var10004;
      } while(var3 < var6);

      long var10 = var0[1];
      long var10002 = var0[0] ^ var10;
      boolean var32 = true;
      long var8 = var10002;
      a = new ConcurrentHashMap();
      b = new ConcurrentHashMap();
      ab = new ConcurrentHashMap();
      aa = (int)var8;
   }

   public static void ba() {
      b.clear();
   }

   public static void bb(int var0) {
      aa = var0;
   }

   private static String bab(int var0, int var1) {
      int var3 = var0 ^ 769428442;
      char[] var4 = bb[var3].toCharArray();
      StackTraceElement[] var2 = (StackTraceElement[])aaa[var3];
      StackTraceElement[] var5;
      if (var2 != null) {
         var5 = var2;
      } else {
         var5 = (new Throwable()).getStackTrace();
         aaa[var3] = var5;
      }

      StackTraceElement var6 = var5[1];
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ -297772752;
      int var8 = 0;

      do {
         short var9;
         switch (var8 & 31) {
            case 0:
            default:
               var9 = 85;
               break;
            case 1:
               var9 = 137;
               break;
            case 2:
               var9 = 182;
               break;
            case 3:
               var9 = 189;
               break;
            case 4:
               var9 = 28;
               break;
            case 5:
               var9 = 54;
               break;
            case 6:
               var9 = 190;
               break;
            case 7:
               var9 = 65;
               break;
            case 8:
               var9 = 228;
               break;
            case 9:
               var9 = 133;
               break;
            case 10:
               var9 = 37;
               break;
            case 11:
               var9 = 245;
               break;
            case 12:
               var9 = 167;
               break;
            case 13:
               var9 = 175;
               break;
            case 14:
               var9 = 194;
               break;
            case 15:
               var9 = 152;
               break;
            case 16:
               var9 = 242;
               break;
            case 17:
               var9 = 199;
               break;
            case 18:
               var9 = 169;
               break;
            case 19:
               var9 = 83;
               break;
            case 20:
               var9 = 145;
               break;
            case 21:
               var9 = 72;
               break;
            case 22:
               var9 = 124;
               break;
            case 23:
               var9 = 151;
               break;
            case 24:
               var9 = 103;
               break;
            case 25:
               var9 = 25;
               break;
            case 26:
               var9 = 209;
               break;
            case 27:
               var9 = 131;
               break;
            case 28:
               var9 = 185;
               break;
            case 29:
               var9 = 179;
               break;
            case 30:
               var9 = 30;
               break;
            case 31:
               var9 = 160;
         }

         var4[var8] = (char)(var4[var8] ^ var9 ^ var1 >> 16 ^ var7);
         ++var8;
      } while(var8 < var4.length);

      return (new String(var4)).intern();
   }

   public static void aaa() {
      ab.clear();
   }

   private q2997348aa27a422480aea29cbfd800b1aaaabbbba() {
   }

   public static void aab() {
      a.clear();
   }

   public static boolean aba(UUID param0) {
      // $FF: Couldn't be decompiled
   }

   public static void abb(UUID param0, int param1) {
      // $FF: Couldn't be decompiled
   }

   public static void baa(UUID param0) {
      // $FF: Couldn't be decompiled
   }
}
