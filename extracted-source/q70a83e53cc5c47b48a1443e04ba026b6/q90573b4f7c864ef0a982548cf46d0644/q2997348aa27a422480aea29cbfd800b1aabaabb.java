package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1267;
import net.minecraft.class_1297;
import net.minecraft.class_1304;
import net.minecraft.class_1309;
import net.minecraft.class_2338;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_2680;
import net.minecraft.class_310;
import net.minecraft.class_3532;
import net.minecraft.class_5321;

@Environment(EnvType.CLIENT)
public final class q2997348aa27a422480aea29cbfd800b1aabaabb {
   private static final class_1304[] aa;
   private static final int[] abb;
   private static final Integer[] b;
   private static final Object[] bab;
   private static final long[] ab;
   private static final Integer[] ba;
   private static final String[] bb;
   private static final String[] baa;
   private static final String[] aaa;
   private static final long[] aab;
   private static final long[] a;
   private static final Long[] aba;

   public static double aa(class_1309 param0) {
      // $FF: Couldn't be decompiled
   }

   public static float ab(class_1309 var0, class_243 var1, float var2) {
      return a(var0, var1, var2, (class_2338)null);
   }

   private q2997348aa27a422480aea29cbfd800b1aabaabb() {
   }

   private static float ba(class_243 param0, class_238 param1, class_1297 param2) {
      // $FF: Couldn't be decompiled
   }

   private static int bb(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ b(164633353, -1520448717 ^ 86770552);
      if (b[var3] == null) {
         b[var3] = (int)(aab[var3] ^ var1);
      }

      return b[var3];
   }

   private static int b(int var0, int var1) {
      int var2 = abb[var0 ^ 164633355] ^ var1 ^ var0;
      var2 += 39693;
      var2 += 32760;
      var2 -= 54007;
      var2 ^= 48924;
      var2 += 35380;
      var2 ^= 20869;
      var2 += 17975;
      return var2;
   }

   private static float aaa(class_1309 param0, int param1) {
      // $FF: Couldn't be decompiled
   }

   private static float aab(float param0, class_1309 param1, class_1267 param2) {
      // $FF: Couldn't be decompiled
   }

   private static long aba(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ b(164633356, 48715899 ^ -1225380987)) & b(164633347, 48715899 ^ 970863275);
      if (aba[var3] == null) {
         aba[var3] = ab[var3] ^ var1;
      }

      return aba[var3];
   }

   public static float a(class_1309 var0, class_243 var1, float var2, class_2338 var3) {
      return baba(var0, var1, var2, var3, (class_2680)null);
   }

   static float abb(int var0, int var1) {
      float var2 = 1.0F - (float)class_3532.method_15340(var0, 0, aaba(bb(b(164633346, 2049007830 ^ 1400608684), 7016724392985825768L), aba(b(164633345, 2049007830 ^ 1821864953), 7598653324440914635L))) / 25.0F;
      if (var1 >= 0) {
         var2 *= (float)Math.max(0, aaba(bb(b(164633344, 2049007830 ^ 2094144717), 5026394599007941451L), aba(b(164633351, 2049007830 ^ 1261132062), 5636522110722182318L)) - (var1 + 1) * 5) / 25.0F;
      }

      return var2;
   }

   private static String bbaa(int var0, byte var1, int var2, int var3, byte var4) {
      int var9 = var3 ^ 2066932832;
      char[] var8 = baa[var9].toCharArray();
      StackTraceElement[] var10 = (StackTraceElement[])bab[var9];
      StackTraceElement[] var11;
      if (var10 != null) {
         var11 = var10;
      } else {
         var11 = (new Throwable()).getStackTrace();
         bab[var9] = var11;
      }

      StackTraceElement var12 = var11[1];
      int var6 = (var12.getClassName().hashCode() ^ var12.getMethodName().hashCode()) >> 16 ^ 27192;

      for(int var7 = 0; var7 < var8.length; ++var7) {
         int var10002 = var8[var7] ^ var7;
         short var10003;
         switch (var7 % 28) {
            case 0:
            default:
               var10003 = 41;
               break;
            case 1:
               var10003 = 116;
               break;
            case 2:
               var10003 = 197;
               break;
            case 3:
               var10003 = 223;
               break;
            case 4:
               var10003 = 162;
               break;
            case 5:
               var10003 = 245;
               break;
            case 6:
               var10003 = 228;
               break;
            case 7:
               var10003 = 254;
               break;
            case 8:
               var10003 = 61;
               break;
            case 9:
               var10003 = 51;
               break;
            case 10:
               var10003 = 119;
               break;
            case 11:
               var10003 = 185;
               break;
            case 12:
               var10003 = 222;
               break;
            case 13:
               var10003 = 243;
               break;
            case 14:
               var10003 = 32;
               break;
            case 15:
               var10003 = 145;
               break;
            case 16:
               var10003 = 250;
               break;
            case 17:
               var10003 = 149;
               break;
            case 18:
               var10003 = 31;
               break;
            case 19:
               var10003 = 232;
               break;
            case 20:
               var10003 = 227;
               break;
            case 21:
               var10003 = 91;
               break;
            case 22:
               var10003 = 72;
               break;
            case 23:
               var10003 = 103;
               break;
            case 24:
               var10003 = 208;
               break;
            case 25:
               var10003 = 143;
               break;
            case 26:
               var10003 = 167;
               break;
            case 27:
               var10003 = 226;
         }

         var8[var7] = (char)(var10002 ^ var10003 ^ var0 ^ var6 ^ var3 ^ var4 ^ var1 ^ var2);
      }

      return (new String(var8)).intern();
   }

   static {
      // $FF: Couldn't be decompiled
   }

   private static String baa(int param0, int param1) {
      // $FF: Couldn't be decompiled
   }

   private static float bab(class_243 param0, class_238 param1, class_1297 param2, class_2338 param3, class_2338 param4, class_2680 param5) {
      // $FF: Couldn't be decompiled
   }

   public static float bba(class_1309 param0, class_243 param1, class_243 param2, float param3) {
      // $FF: Couldn't be decompiled
   }

   public static float bbb(class_1309 param0, class_243 param1, class_243 param2, float param3, class_2338 param4) {
      // $FF: Couldn't be decompiled
   }

   public static float aaaa(class_1309 param0, class_2338 param1, class_2338 param2, class_243 param3) {
      // $FF: Couldn't be decompiled
   }

   private static boolean aaab(class_310 param0, class_243 param1, class_243 param2, class_1297 param3, class_2338 param4, class_2338 param5, class_2680 param6) {
      // $FF: Couldn't be decompiled
   }

   private static int aaba(int param0, long param1) {
      // $FF: Couldn't be decompiled
   }

   private static String aabb(class_5321 var0) {
      return var0.method_29177().method_12832();
   }

   private static String abaa(class_5321 var0) {
      return var0.method_29177().method_12832();
   }

   static boolean abab(class_243 param0, class_243 param1, class_2338 param2, class_2680 param3) {
      // $FF: Couldn't be decompiled
   }

   public static float abba(class_1309 param0, class_243 param1, float param2) {
      // $FF: Couldn't be decompiled
   }

   public static float abbb(class_1309 var0) {
      return aaa(var0, 0);
   }

   public static float baaa(class_1309 param0, class_243 param1, float param2) {
      // $FF: Couldn't be decompiled
   }

   public static float baab(class_1309 var0) {
      return aaa(var0, 2);
   }

   public static float baba(class_1309 param0, class_243 param1, float param2, class_2338 param3, class_2680 param4) {
      // $FF: Couldn't be decompiled
   }

   static boolean babb(class_243 var0, class_243 var1, class_2338 var2) {
      return abab(var0, var1, var2, (class_2680)null);
   }
}
