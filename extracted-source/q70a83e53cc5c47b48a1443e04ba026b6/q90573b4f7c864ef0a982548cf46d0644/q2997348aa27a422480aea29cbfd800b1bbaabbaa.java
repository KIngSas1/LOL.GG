package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1268;
import net.minecraft.class_1799;

@Environment(EnvType.CLIENT)
record q2997348aa27a422480aea29cbfd800b1bbaabbaa(int b, int g5, float d, class_1799 e) {
   private final int a;
   private static final int[] b;
   private static final Object[] aab;
   private final class_1799 aa;
   private static final long ab;
   private static final String[] aaa;
   private final float ba;
   private final int bb;

   public int a() {
      return this.a;
   }

   public float aa() {
      return this.ba;
   }

   private static String aaa(int var0, int var1) {
      int var3 = var0 ^ 1651570681;
      char[] var4 = aaa[var3].toCharArray();
      StackTraceElement[] var2 = (StackTraceElement[])aab[var3];
      StackTraceElement[] var5;
      if (var2 != null) {
         var5 = var2;
      } else {
         var5 = (new Throwable()).getStackTrace();
         aab[var3] = var5;
      }

      StackTraceElement var6 = var5[1];
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ -1038731332;
      int var8 = 0;

      do {
         short var9;
         switch (var8 & 31) {
            case 0:
            default:
               var9 = 140;
               break;
            case 1:
               var9 = 218;
               break;
            case 2:
               var9 = 92;
               break;
            case 3:
               var9 = 48;
               break;
            case 4:
               var9 = 164;
               break;
            case 5:
               var9 = 100;
               break;
            case 6:
               var9 = 59;
               break;
            case 7:
               var9 = 183;
               break;
            case 8:
               var9 = 70;
               break;
            case 9:
               var9 = 136;
               break;
            case 10:
               var9 = 8;
               break;
            case 11:
               var9 = 163;
               break;
            case 12:
               var9 = 152;
               break;
            case 13:
               var9 = 107;
               break;
            case 14:
               var9 = 51;
               break;
            case 15:
               var9 = 22;
               break;
            case 16:
               var9 = 161;
               break;
            case 17:
               var9 = 146;
               break;
            case 18:
               var9 = 157;
               break;
            case 19:
               var9 = 158;
               break;
            case 20:
               var9 = 149;
               break;
            case 21:
               var9 = 87;
               break;
            case 22:
               var9 = 207;
               break;
            case 23:
               var9 = 155;
               break;
            case 24:
               var9 = 59;
               break;
            case 25:
               var9 = 226;
               break;
            case 26:
               var9 = 80;
               break;
            case 27:
               var9 = 204;
               break;
            case 28:
               var9 = 218;
               break;
            case 29:
               var9 = 151;
               break;
            case 30:
               var9 = 1;
               break;
            case 31:
               var9 = 112;
         }

         var4[var8] = (char)(var4[var8] ^ var9 ^ var1 >> 16 ^ var7);
         ++var8;
      } while(var8 < var4.length);

      return (new String(var4)).intern();
   }

   private q2997348aa27a422480aea29cbfd800b1bbaabbaa(int var1, int var2, float var3, class_1799 var4) {
      this.bb = var1;
      this.a = var2;
      this.ba = var3;
      this.aa = var4;
   }

   static {
      int var20 = 358873952;
      short var15 = 26718;
      int var14 = 0;
      int var13 = 0;
      String[] var12 = new String[2];
      int var11 = "\u0010骼㥽餪龍鮙領魌珞頽맱魔祐鮆㧞鯹릻\n荘\uf8c4肎\uf87c艝렅肀㢿膉\uf85d".length();
      String var10 = "\u0010骼㥽餪龍鮙領魌珞頽맱魔祐鮆㧞鯹릻\n荘\uf8c4肎\uf87c艝렅肀㢿膉\uf85d";

      do {
         char var16 = var10.charAt(var14);
         String var10000 = var10.substring(var14 + 1, var14 + 1 + var16);
         int var18 = 0;
         char[] var17 = var10000.toCharArray();

         do {
            int var19 = var17[var18];
            short var22;
            switch (var18 % 5) {
               case 0:
               default:
                  var22 = 23;
                  break;
               case 1:
                  var22 = 227;
                  break;
               case 2:
                  var22 = 153;
                  break;
               case 3:
                  var22 = 126;
                  break;
               case 4:
                  var22 = 118;
            }

            var19 = (char)var22 ^ var19;
            if (var18 % 2 == 0) {
               var17[var18] = (char)((var19 >>> 2 | var19 << 14) & '\uffff' ^ var15);
            } else {
               var17[var18] = (char)((var19 << 2 | var19 >>> 14) & '\uffff' ^ var15);
            }

            ++var18;
         } while(var18 < var17.length);

         var12[var13] = new String(var17);
         ++var13;
         var14 = var14 + var16 + 1;
      } while(var14 < var11);

      aaa = var12;
      aab = new Object[var12.length];
      int var23 = 0;
      int var10001 = 0;
      b = new int[9];
      byte[] var10002 = "\u0017\u001a c¢CdÚµÌ\u0089\u0086¬ùHHÑo\u00898N\u0083¨]\rj,ÂüÅ±å\u0017T65".getBytes("ISO-8859-1");

      int var42;
      do {
         b[var23] = ((var10002[var10001] & 255) << 24 | (var10002[var10001 + 1] & 255) << 16 | (var10002[var10001 + 2] & 255) << 8 | var10002[var10001 + 3] & 255) ^ -439506408;
         ++var23;
         var42 = var10001 + 4;
         var10001 += 4;
      } while(var42 < var10002.length);

      long var1 = 4946334213744741396L;
      long[] var0 = new long[2];
      int var4 = 0;
      String var5;
      int var6 = (var5 = aaa(1651570681, var20 ^ -431310520)).length();
      int var3 = 0;

      do {
         var10001 = var3;
         var3 += 8;
         byte[] var7 = var5.substring(var10001, var3).getBytes(aaa(1651570680, var20 ^ -534670591));
         var10001 = var4++;
         long var50 = (((long)var7[0] & 255L) << b(1393449647, var20 ^ 1262854058) | ((long)var7[1] & 255L) << b(1393449646, var20 ^ -31663350) | ((long)var7[2] & 255L) << b(1393449645, var20 ^ -376228259) | ((long)var7[3] & 255L) << b(1393449644, var20 ^ -257493014) | ((long)var7[4] & 255L) << b(1393449643, var20 ^ -1926220139) | ((long)var7[5] & 255L) << b(1393449642, var20 ^ 316413929) | ((long)var7[b(1393449641, var20 ^ 1362465663)] & 255L) << b(1393449640, var20 ^ -1600516517) | (long)var7[b(1393449639, var20 ^ 1259047303)] & 255L) ^ var1;
         var42 = -1;
         var0[var10001] = var50;
      } while(var3 < var6);

      long var8 = var0[1];
      long var34 = var0[0] ^ var8;
      var10001 = -1;
      ab = var34;
   }

   public class_1799 ab() {
      return this.aa;
   }

   private static int b(int var0, int var1) {
      int var2 = b[var0 ^ 1393449647] ^ var1 ^ var0;
      var2 ^= 52465;
      var2 ^= 57558;
      var2 ^= 30315;
      var2 += 9858;
      var2 += 63422;
      var2 += 11646;
      var2 -= 54234;
      var2 += 13013;
      var2 -= 39123;
      return var2;
   }

   public int ba() {
      return this.bb;
   }

   private class_1268 bb() {
      class_1268 var10000;
      try {
         try {
            if (this.bb == (int)ab) {
               var10000 = class_1268.field_5810;
               return var10000;
            }
         } catch (IllegalStateException var1) {
            throw var1;
         }
      } catch (MatchException var2) {
         throw var2;
      }

      var10000 = class_1268.field_5808;
      return var10000;
   }
}
