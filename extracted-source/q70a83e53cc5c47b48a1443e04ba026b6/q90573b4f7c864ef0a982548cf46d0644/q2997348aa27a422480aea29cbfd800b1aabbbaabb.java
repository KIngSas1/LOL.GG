package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_310;

@Environment(EnvType.CLIENT)
final class q2997348aa27a422480aea29cbfd800b1aabbbaabb implements q2997348aa27a422480aea29cbfd800b1bbaabbba {
   private static final Object[] ba;
   private static final String[] ab;
   private static final int[] aa;
   private final class_310 a;
   private static final long b;

   private q2997348aa27a422480aea29cbfd800b1aabbbaabb(class_310 var1) {
      this.a = var1;
   }

   private static int b(int var0, int var1) {
      int var2 = aa[var0 ^ 772265371] ^ var1 ^ var0;
      var2 += 64022;
      var2 -= 4571;
      var2 += 60832;
      var2 ^= 39306;
      var2 -= 45220;
      var2 ^= 63123;
      var2 += 10657;
      var2 += 29690;
      return var2;
   }

   public int a() {
      // $FF: Couldn't be decompiled
   }

   public int aa() {
      return q2997348aa27a422480aea29cbfd800b1abbbbaa.baab(this.a.field_1724.method_31548());
   }

   public boolean ab(q2997348aa27a422480aea29cbfd800b1aabbabaa param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   private static String aaa(int var0, int var1) {
      int var3 = var0 ^ 834350955;
      char[] var4 = ab[var3].toCharArray();
      StackTraceElement[] var2 = (StackTraceElement[])ba[var3];
      StackTraceElement[] var5;
      if (var2 != null) {
         var5 = var2;
      } else {
         var5 = (new Throwable()).getStackTrace();
         ba[var3] = var5;
      }

      StackTraceElement var6 = var5[1];
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ -2030069854;
      int var8 = 0;

      do {
         short var9;
         switch (var8 & 31) {
            case 0:
            default:
               var9 = 0;
               break;
            case 1:
               var9 = 29;
               break;
            case 2:
               var9 = 245;
               break;
            case 3:
               var9 = 207;
               break;
            case 4:
               var9 = 238;
               break;
            case 5:
               var9 = 83;
               break;
            case 6:
               var9 = 76;
               break;
            case 7:
               var9 = 35;
               break;
            case 8:
               var9 = 77;
               break;
            case 9:
               var9 = 9;
               break;
            case 10:
               var9 = 76;
               break;
            case 11:
               var9 = 241;
               break;
            case 12:
               var9 = 202;
               break;
            case 13:
               var9 = 244;
               break;
            case 14:
               var9 = 10;
               break;
            case 15:
               var9 = 41;
               break;
            case 16:
               var9 = 223;
               break;
            case 17:
               var9 = 35;
               break;
            case 18:
               var9 = 43;
               break;
            case 19:
               var9 = 148;
               break;
            case 20:
               var9 = 128;
               break;
            case 21:
               var9 = 61;
               break;
            case 22:
               var9 = 63;
               break;
            case 23:
               var9 = 183;
               break;
            case 24:
               var9 = 69;
               break;
            case 25:
               var9 = 153;
               break;
            case 26:
               var9 = 150;
               break;
            case 27:
               var9 = 84;
               break;
            case 28:
               var9 = 36;
               break;
            case 29:
               var9 = 108;
               break;
            case 30:
               var9 = 241;
               break;
            case 31:
               var9 = 139;
         }

         var4[var8] = (char)(var4[var8] ^ var9 ^ var1 >> 16 ^ var7);
         ++var8;
      } while(var8 < var4.length);

      return (new String(var4)).intern();
   }

   static {
      int var20 = -1971589416;
      int var10001 = "\u0010⨧☜Ⳳ麍㧾\u0e66⬠훑⚩웇⾽뻌㷖㙕⍧츟\n䪃뼂哶\udf93奺靼䰄῎佭࿚".length();
      short var15 = 22554;
      String[] var10002 = new String[2];
      int var13 = 0;
      String[] var12 = var10002;
      int var14 = 0;
      int var11 = var10001;
      String var10 = "\u0010⨧☜Ⳳ麍㧾\u0e66⬠훑⚩웇⾽뻌㷖㙕⍧츟\n䪃뼂哶\udf93奺靼䰄῎佭࿚";

      do {
         int var18 = 0;
         char var16 = var10.charAt(var14);
         char[] var17 = var10.substring(var14 + 1, var14 + 1 + var16).toCharArray();

         do {
            int var19 = var17[var18];
            short var10000;
            switch (var18 % 7) {
               case 0:
               default:
                  var10000 = 158;
                  break;
               case 1:
                  var10000 = 80;
                  break;
               case 2:
                  var10000 = 139;
                  break;
               case 3:
                  var10000 = 196;
                  break;
               case 4:
                  var10000 = 135;
                  break;
               case 5:
                  var10000 = 47;
                  break;
               case 6:
                  var10000 = 25;
            }

            var19 = (char)var10000 ^ var19;
            if (var18 % 2 == 0) {
               var17[var18] = (char)((var19 >>> 5 | var19 << 11) & '\uffff' ^ var15);
            } else {
               var17[var18] = (char)((var19 << 5 | var19 >>> 11) & '\uffff' ^ var15);
            }

            ++var18;
         } while(var18 < var17.length);

         var12[var13] = new String(var17);
         ++var13;
         var14 = var14 + var16 + 1;
      } while(var14 < var11);

      ab = var12;
      ba = new Object[var12.length];
      int var22 = 0;
      aa = new int[9];
      var10001 = 0;
      byte[] var29 = "\u007fR¯äÁ×~o\u009383ëþî=á\u0012@z&\u0000Õðg¼\u0090p*\u0083\tÉ\u007f«£\u0081\b".getBytes("ISO-8859-1");

      int var43;
      do {
         aa[var22] = ((var29[var10001] & 255) << 24 | (var29[var10001 + 1] & 255) << 16 | (var29[var10001 + 2] & 255) << 8 | var29[var10001 + 3] & 255) ^ 498734249;
         ++var22;
         var43 = var10001 + 4;
         var10001 += 4;
      } while(var43 < var29.length);

      long var1 = 1887341997300887257L;
      long[] var0 = new long[2];
      int var4 = 0;
      String var5;
      int var6 = (var5 = aaa(834350955, var20 ^ 1196548192)).length();
      int var3 = 0;

      do {
         var10001 = var3;
         var3 += 8;
         byte[] var7 = var5.substring(var10001, var3).getBytes(aaa(834350954, var20 ^ 1680246281));
         var10001 = var4++;
         long var51 = (((long)var7[0] & 255L) << b(772265371, var20 ^ 963348307) | ((long)var7[1] & 255L) << b(772265370, var20 ^ -2014423359) | ((long)var7[2] & 255L) << b(772265369, var20 ^ -721347730) | ((long)var7[3] & 255L) << b(772265368, var20 ^ -1193863843) | ((long)var7[4] & 255L) << b(772265375, var20 ^ 1417237493) | ((long)var7[5] & 255L) << b(772265374, var20 ^ 1189927341) | ((long)var7[b(772265373, var20 ^ -89564675)] & 255L) << b(772265372, var20 ^ -986652449) | (long)var7[b(772265363, var20 ^ -308631388)] & 255L) ^ var1;
         var43 = -1;
         var0[var10001] = var51;
      } while(var3 < var6);

      long var8 = var0[0];
      long var35 = var0[1] ^ var8;
      var10001 = -1;
      b = var35;
   }

   public int ba() {
      // $FF: Couldn't be decompiled
   }

   public void bb(q2997348aa27a422480aea29cbfd800b1aabbabaa param1, int param2) {
      // $FF: Couldn't be decompiled
   }
}
