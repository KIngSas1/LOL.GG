package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_2350;

// $FF: synthetic class
@Environment(EnvType.CLIENT)
class q2997348aa27a422480aea29cbfd800b1aaabbabaa {
   private static final Object[] ab;
   private static final int[] b;
   static final int[] a;
   private static final String[] aa;

   private static String b(char var0, char var1, int var2, short var3, byte var4, int var5, short var6) {
      int var11 = var5 ^ 268825608;
      char[] var10 = aa[var11].toCharArray();
      StackTraceElement[] var12 = (StackTraceElement[])ab[var11];
      StackTraceElement[] var13;
      if (var12 != null) {
         var13 = var12;
      } else {
         var13 = (new Throwable()).getStackTrace();
         ab[var11] = var13;
      }

      StackTraceElement var14 = var13[1];
      int var8 = (var14.getClassName().hashCode() ^ var14.getMethodName().hashCode()) >> 16 ^ 'ﾔ';
      int var9 = 0;

      do {
         int var10002 = var10[var9] ^ '폄';
         short var10003;
         switch (var9 % 19) {
            case 0:
            default:
               var10003 = 212;
               break;
            case 1:
               var10003 = 208;
               break;
            case 2:
               var10003 = 78;
               break;
            case 3:
               var10003 = 123;
               break;
            case 4:
               var10003 = 56;
               break;
            case 5:
               var10003 = 205;
               break;
            case 6:
               var10003 = 32;
               break;
            case 7:
               var10003 = 239;
               break;
            case 8:
               var10003 = 133;
               break;
            case 9:
               var10003 = 217;
               break;
            case 10:
               var10003 = 65;
               break;
            case 11:
               var10003 = 72;
               break;
            case 12:
               var10003 = 36;
               break;
            case 13:
               var10003 = 244;
               break;
            case 14:
               var10003 = 24;
               break;
            case 15:
               var10003 = 179;
               break;
            case 16:
               var10003 = 8;
               break;
            case 17:
               var10003 = 135;
               break;
            case 18:
               var10003 = 135;
         }

         var10[var9] = (char)(var10002 ^ var10003 ^ var2 ^ var4 ^ var8 ^ var3 ^ var1 ^ var0 ^ var6 ^ var5);
         ++var9;
      } while(var9 < var10.length);

      return (new String(var10)).intern();
   }

   static {
      int var24 = -651087448;
      short var13 = 19872;
      byte var20 = -1;
      char[] var15 = "䶰䶪".toCharArray();
      String var14 = "\ue9ec\ue98e\ue97c\ue9ad\ue9b0\ue93f\ue93d\ue9b8\ue95a\ue9d3\ue91a\ue9ed\ue9ee\ue9f9\ue9e7\ue99fബെ\u0d52෮ෳාඤഓ\u0dfb\u0d50";
      String[] var16 = new String[var15.length];

      while(true) {
         int var17 = 0;
         int var18 = 0;
         int var19 = 0;
         if (var20 == 0) {
            aa = var16;
            ab = new Object[var16.length];
            int var32 = 0;
            int var10001 = 0;
            b = new int[9];
            byte[] var10002 = "0¹\u00009OÌí\u008eÃ\u008f\u0001\u00ad\u0087R8ÿÅ\u008dí\u0001ê|äL\u009d\u0082ZhÒ³÷u¢%¥µ".getBytes("ISO-8859-1");

            int var51;
            do {
               b[var32] = ((var10002[var10001] & 255) << 24 | (var10002[var10001 + 1] & 255) << 16 | (var10002[var10001 + 2] & 255) << 8 | var10002[var10001 + 3] & 255) ^ -896569101;
               ++var32;
               var51 = var10001 + 4;
               var10001 += 4;
            } while(var51 < var10002.length);

            long var1 = 6862230720319735469L;
            long[] var0 = new long[2];
            int var4 = 0;
            String var5;
            int var6 = (var5 = b((char)3361, (char)'闊', 2142916729, (short)4574, (byte)59, 268825608, (short)30490)).length();
            int var3 = 0;

            do {
               var10001 = var3;
               var3 += 8;
               byte[] var7 = var5.substring(var10001, var3).getBytes(b('▉', '魒', 866765673, (short)-3466, (byte)-10, 268825609, (short)12975));
               var10001 = var4++;
               long var59 = (((long)var7[0] & 255L) << a(1868747769, var24 ^ -1281662101) | ((long)var7[1] & 255L) << a(1868747768, var24 ^ -856781115) | ((long)var7[2] & 255L) << a(1868747771, var24 ^ 1085104397) | ((long)var7[3] & 255L) << a(1868747770, var24 ^ 74472358) | ((long)var7[4] & 255L) << a(1868747773, var24 ^ 1185910199) | ((long)var7[5] & 255L) << a(1868747772, var24 ^ 1767802083) | ((long)var7[a(1868747775, var24 ^ 513817310)] & 255L) << a(1868747774, var24 ^ 1368496112) | (long)var7[a(1868747761, var24 ^ 554157312)] & 255L) ^ var1;
               var51 = -1;
               var0[var10001] = var59;
            } while(var3 < var6);

            long var10 = var0[0];
            long var43 = var0[1] ^ var10;
            var10001 = -1;
            long var8 = var43;
            a = new int[class_2350.values().length];

            try {
               a[class_2350.field_11036.ordinal()] = 1;
            } catch (NoSuchFieldError var30) {
            }

            try {
               a[class_2350.field_11033.ordinal()] = 2;
            } catch (NoSuchFieldError var29) {
            }

            try {
               a[class_2350.field_11043.ordinal()] = 3;
            } catch (NoSuchFieldError var28) {
            }

            try {
               a[class_2350.field_11035.ordinal()] = 4;
            } catch (NoSuchFieldError var27) {
            }

            try {
               a[class_2350.field_11039.ordinal()] = 5;
            } catch (NoSuchFieldError var26) {
            }

            try {
               a[class_2350.field_11034.ordinal()] = (int)var8;
            } catch (NoSuchFieldError var25) {
            }

            return;
         }

         do {
            var19 = var15[var17] ^ var13;
            char[] var21 = var14.substring(var18, var18 + var19).toCharArray();
            int var22 = 0;

            do {
               short var10000;
               switch (var22 % 6) {
                  case 0:
                  default:
                     var10000 = 103;
                     break;
                  case 1:
                     var10000 = 19;
                     break;
                  case 2:
                     var10000 = 133;
                     break;
                  case 3:
                     var10000 = 110;
                     break;
                  case 4:
                     var10000 = 37;
                     break;
                  case 5:
                     var10000 = 236;
               }

               short var23 = var10000;
               var21[var22] = (char)(var21[var22] ^ var23);
               ++var22;
            } while(var22 < var21.length);

            var16[var17] = (new String(var21)).intern();
            var18 += var19;
            ++var17;
         } while(var17 < var15.length);

         var20 = 0;
      }
   }

   private static int a(int var0, int var1) {
      int var2 = b[var0 ^ 1868747769] ^ var1 ^ var0;
      var2 += 1559;
      var2 += 52744;
      var2 ^= 3382;
      var2 -= 37007;
      var2 -= 1970;
      var2 += 52544;
      return var2;
   }
}
