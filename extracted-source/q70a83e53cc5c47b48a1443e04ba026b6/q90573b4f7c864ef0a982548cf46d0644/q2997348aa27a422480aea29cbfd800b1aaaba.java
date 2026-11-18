package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.UUID;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1657;
import net.minecraft.class_1921;
import net.minecraft.class_2561;
import net.minecraft.class_2960;
import net.minecraft.class_327;
import net.minecraft.class_332;
import net.minecraft.class_4587;
import net.minecraft.class_4588;
import net.minecraft.class_4597;
import net.minecraft.class_640;
import org.joml.Matrix4f;

@Environment(EnvType.CLIENT)
public final class q2997348aa27a422480aea29cbfd800b1aaaba {
   private static final long[] aa;
   private static final String[] ab;
   private static Class ba;
   private static Method bb;
   private static Class aaa;
   private static final Integer[] aab;
   private static Field aba;
   private static final Integer[] abb;
   private static Method baa;
   private static Field bab;
   private static Field bba;
   private static Field bbb;
   private static final long[] aaaa;
   private static Method a;
   private static final String[] aaab;
   private static Method aaba;
   private static final long[] aabb;
   private static boolean abaa;
   private static final int[] babb;
   private static Class abab;
   private static final float abba = -0.1F;
   private static final Long[] b;
   private static final Object[] bbab;
   private static Method abbb;
   private static final String[] bbaa;
   private static Field baaa;
   private static Method baab;
   private static boolean baba;

   public static int aa(class_2561 param0) {
      // $FF: Couldn't be decompiled
   }

   private static q2997348aa27a422480aea29cbfd800b1bbbaabb ab() {
      // $FF: Couldn't be decompiled
   }

   public static q2997348aa27a422480aea29cbfd800b1aabbbb ba(UUID param0) {
      // $FF: Couldn't be decompiled
   }

   private static String bb(int param0, int param1) {
      // $FF: Couldn't be decompiled
   }

   private static boolean aaa() {
      return false;
   }

   private static boolean aab(class_2561 param0) {
      // $FF: Couldn't be decompiled
   }

   private static q2997348aa27a422480aea29cbfd800b1aabbbb aba() {
      // $FF: Couldn't be decompiled
   }

   public static q2997348aa27a422480aea29cbfd800b1bbbbbaa abb(UUID param0, int param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   public static void baa(class_2561 param0, class_327 param1, class_4587 param2, class_4597 param3, float param4, float param5, class_327.class_6415 param6, int param7) {
      // $FF: Couldn't be decompiled
   }

   private q2997348aa27a422480aea29cbfd800b1aaaba() {
   }

   private static void bab(q2997348aa27a422480aea29cbfd800b1aabbbb var0, class_4587 var1, class_4597 var2, float var3, float var4, boolean var5, int var6) {
      Matrix4f var7 = var1.method_23760().method_23761();
      class_1921 var8 = bbba(var0.aba());

      try {
         try {
            if (var8 == null) {
               return;
            }
         } catch (IllegalStateException var12) {
            throw var12;
         }
      } catch (MatchException var13) {
         throw var13;
      }

      class_4588 var9 = var2.method_73477(var8);
      float var10 = var0.bba();
      float var11 = var0.ab();
      var9.method_22918(var7, var3, var4 + var11, 0.0F).method_22913(0.0F, 1.0F).method_39415(-1).method_60803(var6);
      var9.method_22918(var7, var3 + var10, var4 + var11, 0.0F).method_22913(1.0F, 1.0F).method_39415(-1).method_60803(var6);
      var9.method_22918(var7, var3 + var10, var4, 0.0F).method_22913(1.0F, 0.0F).method_39415(-1).method_60803(var6);
      var9.method_22918(var7, var3, var4, 0.0F).method_22913(0.0F, 0.0F).method_39415(-1).method_60803(var6);
   }

   private static boolean bba(Object var0) {
      return false;
   }

   public static q2997348aa27a422480aea29cbfd800b1aabbbb bbb(class_2561 var0) {
      q2997348aa27a422480aea29cbfd800b1aabbbb var10000;
      try {
         try {
            if (aab(var0)) {
               var10000 = aba();
               return var10000;
            }
         } catch (IllegalStateException var1) {
            throw var1;
         }
      } catch (MatchException var2) {
         throw var2;
      }

      var10000 = null;
      return var10000;
   }

   public static int aaaa(class_332 param0, class_640 param1, class_327 param2, int param3, int param4) {
      // $FF: Couldn't be decompiled
   }

   private static void aaab(String var0, Exception var1) {
      int var2 = q2997348aa27a422480aea29cbfd800b1bbabab.b;
      int var3 = q2997348aa27a422480aea29cbfd800b1bbabab.aaab;
      if (var2 == 0) {
         boolean var10000;
         label29: {
            try {
               try {
                  var10000 = abaa;
                  if (var3 != 0) {
                     break label29;
                  }

                  if (var10000) {
                     return;
                  }
               } catch (IllegalStateException var4) {
                  throw var4;
               }
            } catch (MatchException var5) {
               throw var5;
            }

            var10000 = true;
         }

         abaa = var10000;
      }

   }

   private static UUID aaba(Object param0) {
      // $FF: Couldn't be decompiled
   }

   private static int aabb(int param0, long param1) {
      // $FF: Couldn't be decompiled
   }

   private static int abaa(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ a(-1796414892, 994600126 ^ -435882003);
      if (abb[var3] == null) {
         abb[var3] = (int)(aaaa[var3] ^ var1);
      }

      return abb[var3];
   }

   private static String aaaab(byte var0, int var1, int var2, char var3, char var4, int var5) {
      int var10 = var1 ^ -667200213;
      char[] var9 = bbaa[var10].toCharArray();
      StackTraceElement[] var11 = (StackTraceElement[])bbab[var10];
      StackTraceElement[] var12;
      if (var11 != null) {
         var12 = var11;
      } else {
         var12 = (new Throwable()).getStackTrace();
         bbab[var10] = var12;
      }

      StackTraceElement var13 = var12[1];
      int var7 = (var13.getClassName().hashCode() ^ var13.getMethodName().hashCode()) >> 16 ^ 'ꢬ';

      for(int var8 = 0; var8 < var9.length; ++var8) {
         int var10002 = var9[var8] ^ var8;
         short var10003;
         switch (var8 % 25) {
            case 0:
            default:
               var10003 = 20;
               break;
            case 1:
               var10003 = 229;
               break;
            case 2:
               var10003 = 152;
               break;
            case 3:
               var10003 = 133;
               break;
            case 4:
               var10003 = 27;
               break;
            case 5:
               var10003 = 80;
               break;
            case 6:
               var10003 = 206;
               break;
            case 7:
               var10003 = 133;
               break;
            case 8:
               var10003 = 185;
               break;
            case 9:
               var10003 = 154;
               break;
            case 10:
               var10003 = 102;
               break;
            case 11:
               var10003 = 129;
               break;
            case 12:
               var10003 = 108;
               break;
            case 13:
               var10003 = 228;
               break;
            case 14:
               var10003 = 110;
               break;
            case 15:
               var10003 = 38;
               break;
            case 16:
               var10003 = 117;
               break;
            case 17:
               var10003 = 52;
               break;
            case 18:
               var10003 = 173;
               break;
            case 19:
               var10003 = 143;
               break;
            case 20:
               var10003 = 108;
               break;
            case 21:
               var10003 = 17;
               break;
            case 22:
               var10003 = 172;
               break;
            case 23:
               var10003 = 147;
               break;
            case 24:
               var10003 = 144;
         }

         var9[var8] = (char)(var10002 ^ var10003 ^ var5 ^ var2 ^ var3 ^ var0 ^ var1 ^ var4 ^ var7);
      }

      return (new String(var9)).intern();
   }

   static void abab() {
      abbb = null;
      bb = null;
      a = null;
      aaba = null;
      baa = null;
      baab = null;
      baaa = null;
      aba = null;
      bba = null;
      bbb = null;
      bab = null;
      abab = null;
      ba = null;
      aaa = null;
      baba = false;
      abaa = false;
   }

   public static q2997348aa27a422480aea29cbfd800b1babbabab abba(UUID var0) {
      q2997348aa27a422480aea29cbfd800b1babbabab var10000;
      try {
         try {
            if (baab(var0)) {
               var10000 = new q2997348aa27a422480aea29cbfd800b1babbabab(true, (Integer)null);
               return var10000;
            }
         } catch (IllegalStateException var1) {
            throw var1;
         }
      } catch (MatchException var2) {
         throw var2;
      }

      var10000 = q2997348aa27a422480aea29cbfd800b1babbabab.aa;
      return var10000;
   }

   private static String abbb(class_2561 param0) {
      // $FF: Couldn't be decompiled
   }

   public static q2997348aa27a422480aea29cbfd800b1aabbbb baaa(class_1657 param0) {
      // $FF: Couldn't be decompiled
   }

   private static boolean baab(UUID var0) {
      int var10000 = q2997348aa27a422480aea29cbfd800b1bbabab.aaab;
      q2997348aa27a422480aea29cbfd800b1bbbaabb var2 = ab();
      int var1 = var10000;

      label54: {
         label42: {
            label41: {
               try {
                  try {
                     var7 = var2;
                     if (var1 != 0) {
                        break label41;
                     }

                     if (var2 == null) {
                        break label42;
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
                  var10000 = var7.bb(var0);
                  if (var1 != 0) {
                     return (boolean)var10000;
                  }

                  if (var10000) {
                     break label54;
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

      var10000 = 1;
      return (boolean)var10000;
   }

   public static boolean baba() {
      boolean var10000;
      try {
         try {
            if (ab() != null) {
               var10000 = true;
               return var10000;
            }
         } catch (IllegalStateException var0) {
            throw var0;
         }
      } catch (MatchException var1) {
         throw var1;
      }

      var10000 = false;
      return var10000;
   }

   public static boolean babb(Object param0, Object param1, float param2, float param3, Object param4) {
      // $FF: Couldn't be decompiled
   }

   public static void bbaa(Object param0, class_2561 param1) {
      // $FF: Couldn't be decompiled
   }

   private static boolean bbab(Object var0, Object var1, Object var2) {
      return false;
   }

   private static class_1921 bbba(class_2960 var0) {
      int var8 = 1957737603;
      int var1 = q2997348aa27a422480aea29cbfd800b1bbabab.b;
      int var2 = q2997348aa27a422480aea29cbfd800b1bbabab.aaab;

      Exception var15;
      label62: {
         label57: {
            label56: {
               try {
                  var10000 = baab;
                  if (var2 != 0) {
                     break label56;
                  }

                  if (var10000 == null) {
                     break label57;
                  }
               } catch (Exception var13) {
                  throw var13;
               }

               try {
                  var10000 = baab.invoke((Object)null, var0);
               } catch (Exception var12) {
                  var15 = var12;
                  boolean var10001 = false;
                  break label62;
               }
            }

            try {
               return (class_1921)var10000;
            } catch (Exception var11) {
               var15 = var11;
               boolean var17 = false;
               break label62;
            }
         }

         String[] var3 = new String[]{q2997348aa27a422480aea29cbfd800b1bbbbbbab.bbb(bb(abaa(a(-1796414776, var8 ^ -1434798625), 3062586426048605589L), abaa(a(-1796414775, var8 ^ -226303685), 8590323282835834490L))), q2997348aa27a422480aea29cbfd800b1bbbbbbab.bbb(bb(abaa(a(-1796414770, var8 ^ 665705552), 112219231119248605L), abaa(a(-1796414769, var8 ^ 602932431), 6392499585604799665L))), q2997348aa27a422480aea29cbfd800b1bbbbbbab.bbb(bb(abaa(a(-1796414772, var8 ^ 491884648), 4545568141257564657L), abaa(a(-1796414771, var8 ^ -1951143824), 7291048495920923248L))), q2997348aa27a422480aea29cbfd800b1bbbbbbab.bbb(bb(abaa(a(-1796414766, var8 ^ -1143966462), 1005711404535507402L), abaa(a(-1796414765, var8 ^ -751024763), 6205715927438016303L)))};
         int var4 = var3.length;
         int var5 = 0;

         while(true) {
            int var16 = var5;

            while(true) {
               if (var16 < var4) {
                  String var6 = var3[var5];

                  try {
                     Method var7 = class_1921.class.getMethod(var6, class_2960.class);
                     baab = var7;
                     return (class_1921)var7.invoke((Object)null, var0);
                  } catch (NoSuchMethodException var9) {
                     ++var5;
                     var16 = var2;
                     if (var1 != 0) {
                        continue;
                     }

                     if (var2 == 0) {
                        break;
                     }
                  } catch (Exception var10) {
                     aaab(q2997348aa27a422480aea29cbfd800b1bbbbbbab.bbb(bb(abaa(a(-1796414768, var8 ^ 923348694), 6704484846898327660L), abaa(a(-1796414767, var8 ^ -1667630260), 8934341717459000063L))), var10);
                     return null;
                  }
               }

               return null;
            }
         }
      }

      Exception var14 = var15;
      aaab(q2997348aa27a422480aea29cbfd800b1bbbbbbab.bbb(bb(abaa(a(-1796414774, var8 ^ 1983610953), 1541984739556329892L), abaa(a(-1796414773, var8 ^ -896527358), 9204094314998252204L))), var14);
      return null;
   }

   static {
      // $FF: Couldn't be decompiled
   }

   public static class_2561 bbbb(class_2561 param0) {
      // $FF: Couldn't be decompiled
   }

   private static int a(int var0, int var1) {
      int var2 = babb[var0 ^ -1796414654] ^ var1 ^ var0;
      var2 -= 60847;
      var2 ^= 9629;
      var2 += 34254;
      var2 -= 48858;
      var2 -= 35849;
      var2 ^= 42705;
      var2 -= 21110;
      var2 += 36035;
      var2 -= 34249;
      var2 += 31919;
      return var2;
   }

   private static boolean b(Object param0) {
      // $FF: Couldn't be decompiled
   }

   private static long aaaaa(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ a(-1796414764, 321948148 ^ -1386425331)) & a(-1796414763, 321948148 ^ 811264523);
      if (b[var3] == null) {
         b[var3] = aabb[var3] ^ var1;
      }

      return b[var3];
   }
}
