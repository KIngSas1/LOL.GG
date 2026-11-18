package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import java.util.List;
import java.util.Objects;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public final class q2997348aa27a422480aea29cbfd800b1aabaabaaa {
   private static final double aa = (double)382.0F;
   private static final Integer[] ab;
   private static final Object[] aabb;
   private static final String[] ba;
   public static int bb;
   private static final String[] aaa;
   private static final double aab = (double)620.0F;
   public static final boolean aba = true;
   private static final int[] a;
   public static final double abb = 0.01;
   public static final double b = 0.1;
   private static final double baa = (double)64.0F;
   private static final double bab = (double)32.0F;
   public static int bba;
   private static final double bbb = (double)3.0F;
   private static final String[] aaba;
   public static final double aaaa = 0.01;
   private static final long[] aaab;

   public static int aa(int var0, int var1) {
      return var0 + 1 + Math.max(0, var1);
   }

   public static boolean ab(long var0, long var2) {
      // $FF: Couldn't be decompiled
   }

   public static boolean ba(double var0, double var2, double var4, double var6, double var8, double var10, double var12) {
      // $FF: Couldn't be decompiled
   }

   public static double bb(double param0) {
      // $FF: Couldn't be decompiled
   }

   public static boolean aaa(double var0, double var2, double var4, double var6, double var8) {
      // $FF: Couldn't be decompiled
   }

   public static boolean aab(double param0, float param2, double param3) {
      // $FF: Couldn't be decompiled
   }

   private q2997348aa27a422480aea29cbfd800b1aabaabaaa() {
   }

   public static boolean aba(double var0, double var2) {
      // $FF: Couldn't be decompiled
   }

   public static double abb(double param0) {
      // $FF: Couldn't be decompiled
   }

   public static boolean baa(boolean param0, String param1) {
      // $FF: Couldn't be decompiled
   }

   public static long bab(long var0, long var2, long var4) {
      return Math.max(var0, var2 + Math.max(0L, var4));
   }

   private static boolean bba(double param0, double param2, double param4, double param6, double[] param8) {
      // $FF: Couldn't be decompiled
   }

   public static boolean bbb(Object var0, Object var1) {
      int var2 = bb;

      boolean var10000;
      label36: {
         try {
            try {
               var10000 = Objects.deepEquals(var0, var1);
               if (var2 != 0) {
                  return var10000;
               }

               if (!var10000) {
                  break label36;
               }
            } catch (IllegalStateException var3) {
               throw var3;
            }
         } catch (MatchException var4) {
            throw var4;
         }

         var10000 = false;
         return var10000;
      }

      var10000 = true;
      return var10000;
   }

   public static boolean aaaa(boolean var0, boolean var1) {
      int var2 = bba;
      int var3 = bb;

      boolean var10000;
      label65: {
         label66: {
            int var10001;
            label48: {
               label47: {
                  try {
                     try {
                        var10000 = var0;
                        var10001 = var3;
                        if (var2 != 0) {
                           break label48;
                        }

                        if (var3 != 0) {
                           break label47;
                        }
                     } catch (MatchException var6) {
                        throw var6;
                     }

                     if (!var10000) {
                        break label66;
                     }
                  } catch (MatchException var7) {
                     throw var7;
                  }

                  var10000 = var1;
               }

               try {
                  var10001 = var3;
               } catch (MatchException var5) {
                  var8 = var5;
                  var10001 = 0;
                  throw var8;
               }
            }

            try {
               if (var10001 != 0) {
                  return var10000;
               }

               if (var10000) {
                  break label65;
               }
            } catch (MatchException var4) {
               var8 = var4;
               var10001 = 0;
               throw var8;
            }
         }

         var10000 = false;
         return var10000;
      }

      var10000 = true;
      return var10000;
   }

   public static double aaab(int param0, int param1) {
      // $FF: Couldn't be decompiled
   }

   public static boolean aaba(double var0) {
      // $FF: Couldn't be decompiled
   }

   public static float aabb(float param0) {
      // $FF: Couldn't be decompiled
   }

   public static boolean abaa(double var0, double var2) {
      // $FF: Couldn't be decompiled
   }

   private static float abab(float param0) {
      // $FF: Couldn't be decompiled
   }

   public static double abba(double param0, double param2) {
      // $FF: Couldn't be decompiled
   }

   public static List abbb(String param0, String param1) {
      // $FF: Couldn't be decompiled
   }

   public static double baaa(double param0, double param2, double param4) {
      // $FF: Couldn't be decompiled
   }

   public static double baab(double param0, int param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   public static boolean baba(boolean param0, int param1, boolean param2) {
      // $FF: Couldn't be decompiled
   }

   public static double babb(double var0) {
      return abba(var0, 0.85);
   }

   public static String bbaa(String param0, int param1) {
      // $FF: Couldn't be decompiled
   }

   public static String bbab(long var0, long var2) {
      return Long.toString(var0 + Math.max(1L, var2));
   }

   private static String aabba(int var0, int var1, int var2, int var3) {
      int var8 = var3 ^ -183484294;
      char[] var7 = aaba[var8].toCharArray();
      StackTraceElement[] var9 = (StackTraceElement[])aabb[var8];
      StackTraceElement[] var10;
      if (var9 != null) {
         var10 = var9;
      } else {
         var10 = (new Throwable()).getStackTrace();
         aabb[var8] = var10;
      }

      StackTraceElement var11 = var10[1];
      int var5 = (var11.getClassName().hashCode() ^ var11.getMethodName().hashCode()) >> 16 ^ 31848;

      for(int var6 = 0; var6 < var7.length; ++var6) {
         int var10002 = var7[var6] ^ var6;
         short var10003;
         switch (var6 % 10) {
            case 0:
            default:
               var10003 = 94;
               break;
            case 1:
               var10003 = 125;
               break;
            case 2:
               var10003 = 29;
               break;
            case 3:
               var10003 = 132;
               break;
            case 4:
               var10003 = 89;
               break;
            case 5:
               var10003 = 159;
               break;
            case 6:
               var10003 = 204;
               break;
            case 7:
               var10003 = 41;
               break;
            case 8:
               var10003 = 199;
               break;
            case 9:
               var10003 = 228;
         }

         var7[var6] = (char)(var10002 ^ var10003 ^ 21288 ^ var2 ^ var0 ^ var1 ^ var5 ^ var3);
      }

      return (new String(var7)).intern();
   }

   public static double bbba(boolean param0, boolean param1) {
      // $FF: Couldn't be decompiled
   }

   private static double bbbb(double var0) {
      return Math.max((double)0.0F, Math.min((double)100.0F, var0));
   }

   public static boolean aaaaa(long param0, long param2, long param4) {
      // $FF: Couldn't be decompiled
   }

   public static boolean aaaab(double var0, float var2, boolean var3, boolean var4) {
      int var5 = bba;
      int var6 = bb;

      boolean var10000;
      label101: {
         label102: {
            int var10001;
            label77: {
               label76: {
                  try {
                     try {
                        var10000 = aab(var0, var2, (double)0.0F);
                        var10001 = var6;
                        if (var5 != 0) {
                           break label77;
                        }

                        if (var6 != 0) {
                           break label76;
                        }
                     } catch (MatchException var12) {
                        throw var12;
                     }

                     if (!var10000) {
                        break label102;
                     }
                  } catch (MatchException var13) {
                     throw var13;
                  }

                  var10000 = var3;
               }

               try {
                  var10001 = var6;
               } catch (MatchException var11) {
                  var14 = var11;
                  var10001 = 0;
                  throw var14;
               }
            }

            label63: {
               label62: {
                  try {
                     try {
                        if (var5 != 0) {
                           break label63;
                        }

                        if (var10001 != 0) {
                           break label62;
                        }
                     } catch (MatchException var9) {
                        throw var9;
                     }

                     if (var10000) {
                        break label102;
                     }
                  } catch (MatchException var10) {
                     var14 = var10;
                     var10001 = 0;
                     throw var14;
                  }

                  var10000 = var4;
               }

               try {
                  var10001 = var6;
               } catch (MatchException var8) {
                  var15 = var8;
                  var10001 = 0;
                  throw var15;
               }
            }

            try {
               if (var10001 != 0) {
                  return var10000;
               }

               if (!var10000) {
                  break label101;
               }
            } catch (MatchException var7) {
               var15 = var7;
               var10001 = 0;
               throw var15;
            }
         }

         var10000 = false;
         return var10000;
      }

      var10000 = true;
      return var10000;
   }

   private static int b(int var0, int var1) {
      int var2 = a[var0 ^ 1045637738] ^ var1 ^ var0;
      var2 ^= 8408;
      var2 ^= 49227;
      var2 += 8158;
      var2 ^= 58567;
      var2 ^= 61319;
      var2 ^= 58653;
      var2 ^= 24690;
      var2 ^= 50559;
      var2 -= 37434;
      return var2;
   }

   static {
      // $FF: Couldn't be decompiled
   }

   private static int aaaba(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ b(1045637698, -128236836 ^ -236921814);
      if (ab[var3] == null) {
         ab[var3] = (int)(aaab[var3] ^ var1);
      }

      return ab[var3];
   }

   public static q2997348aa27a422480aea29cbfd800b1abbbaaab a(boolean param0, boolean param1, boolean param2, boolean param3, float param4, float param5) {
      // $FF: Couldn't be decompiled
   }

   private static String aaabb(int param0, int param1) {
      // $FF: Couldn't be decompiled
   }

   public static boolean aabaa(double param0, double param2, double param4, double param6, double param8, double param10, double param12, double param14, double param16, double param18, double param20, double param22) {
      // $FF: Couldn't be decompiled
   }

   public static boolean aabab(boolean param0, boolean param1, double param2, double param4) {
      // $FF: Couldn't be decompiled
   }
}
