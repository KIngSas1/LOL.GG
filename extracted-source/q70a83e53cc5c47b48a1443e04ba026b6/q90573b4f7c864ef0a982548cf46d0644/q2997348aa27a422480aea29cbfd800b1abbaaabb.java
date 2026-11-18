package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import java.nio.file.Path;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_2338;
import net.minecraft.class_243;
import net.minecraft.class_2561;
import net.minecraft.class_2596;
import net.minecraft.class_2680;

@Environment(EnvType.CLIENT)
public final class q2997348aa27a422480aea29cbfd800b1abbaaabb extends q2997348aa27a422480aea29cbfd800b1bbaababb {
   static final int ba;
   private static final q2997348aa27a422480aea29cbfd800b1babba a;
   private static final String[] bbab;
   private static volatile long aaa;
   private static final ArrayDeque aab;
   private static final long[] aba;
   private static final long[] aa;
   private static final long[] abb;
   private static volatile boolean baa;
   private static final Object[] bbba;
   private boolean bab;
   private static final q2997348aa27a422480aea29cbfd800b1babba bba;
   private static final q2997348aa27a422480aea29cbfd800b1babba bbb;
   private static final q2997348aa27a422480aea29cbfd800b1babba aaaa;
   private static final Integer[] aaab;
   private static final int ab;
   private static final Object aaba;
   private static final q2997348aa27a422480aea29cbfd800b1babba aabb;
   private static final Integer[] abaa;
   private static final int abab;
   private static final int[] bbaa;
   private final q2997348aa27a422480aea29cbfd800b1bbaaaaaa abba;
   private static final q2997348aa27a422480aea29cbfd800b1babba abbb;
   private static final long[] baaa;
   private static final q2997348aa27a422480aea29cbfd800b1babba bb;
   private static final Long[] baab;
   private static final q2997348aa27a422480aea29cbfd800b1babba baba;
   private static final Long[] babb;

   public void ababb() {
      this.bab = false;
      aaba();
   }

   private static int abbb(int var0, int var1) {
      int var2 = bbaa[var0 ^ 1781004737] ^ var1 ^ var0;
      var2 -= 7022;
      var2 += 19920;
      var2 -= 37306;
      var2 ^= 59320;
      var2 ^= 56500;
      var2 += 63418;
      var2 += 54750;
      var2 += 22248;
      var2 -= 56469;
      return var2;
   }

   public static void aa(class_2561 var0) {
      try {
         try {
            if (!baa) {
               return;
            }
         } catch (IllegalStateException var4) {
            throw var4;
         }
      } catch (MatchException var5) {
         throw var5;
      }

      synchronized(aaba) {
         aab.clear();
      }
   }

   private static String baaa(int var0, int var1) {
      int var3 = var0 ^ 431458530;
      char[] var4 = bbab[var3].toCharArray();
      StackTraceElement[] var2 = (StackTraceElement[])bbba[var3];
      StackTraceElement[] var5;
      if (var2 != null) {
         var5 = var2;
      } else {
         var5 = (new Throwable()).getStackTrace();
         bbba[var3] = var5;
      }

      StackTraceElement var6 = var5[1];
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ -494919985;
      int var8 = 0;

      do {
         short var9;
         switch (var8 & 31) {
            case 0:
            default:
               var9 = 255;
               break;
            case 1:
               var9 = 200;
               break;
            case 2:
               var9 = 131;
               break;
            case 3:
               var9 = 149;
               break;
            case 4:
               var9 = 92;
               break;
            case 5:
               var9 = 231;
               break;
            case 6:
               var9 = 219;
               break;
            case 7:
               var9 = 95;
               break;
            case 8:
               var9 = 179;
               break;
            case 9:
               var9 = 75;
               break;
            case 10:
               var9 = 143;
               break;
            case 11:
               var9 = 111;
               break;
            case 12:
               var9 = 185;
               break;
            case 13:
               var9 = 239;
               break;
            case 14:
               var9 = 3;
               break;
            case 15:
               var9 = 29;
               break;
            case 16:
               var9 = 70;
               break;
            case 17:
               var9 = 156;
               break;
            case 18:
               var9 = 97;
               break;
            case 19:
               var9 = 189;
               break;
            case 20:
               var9 = 116;
               break;
            case 21:
               var9 = 37;
               break;
            case 22:
               var9 = 34;
               break;
            case 23:
               var9 = 120;
               break;
            case 24:
               var9 = 118;
               break;
            case 25:
               var9 = 216;
               break;
            case 26:
               var9 = 30;
               break;
            case 27:
               var9 = 58;
               break;
            case 28:
               var9 = 29;
               break;
            case 29:
               var9 = 7;
               break;
            case 30:
               var9 = 43;
               break;
            case 31:
               var9 = 153;
         }

         var4[var8] = (char)(var4[var8] ^ var9 ^ var1 >> 16 ^ var7);
         ++var8;
      } while(var8 < var4.length);

      return (new String(var4)).intern();
   }

   private static long ab(int param0, long param1) {
      // $FF: Couldn't be decompiled
   }

   public static boolean ba() {
      return baa;
   }

   private static long bb(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ abbb(1781004739, -588594455 ^ 1371289890)) & abbb(1781004738, -588594455 ^ 1903636654);
      if (babb[var3] == null) {
         babb[var3] = abb[var3] ^ var1;
      }

      return babb[var3];
   }

   static {
      // $FF: Couldn't be decompiled
   }

   static List aaa() {
      synchronized(aaba) {
         return new ArrayList(aab);
      }
   }

   public static void aab(Object param0) {
      // $FF: Couldn't be decompiled
   }

   public static boolean aba(Object param0) {
      // $FF: Couldn't be decompiled
   }

   private static void abb(String var0) {
      q2997348aa27a422480aea29cbfd800b1abbabbaaa.aa().aab(q2997348aa27a422480aea29cbfd800b1aabaabba.aaa, bb.bba(), var0, ab(baa(abbb(1781004743, 32701841 ^ 1174996337), 3815620032264186970L), bb(abbb(1781004742, 32701841 ^ -1455405180), 2385841818122991770L)));
   }

   private static int baa(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ abbb(1781004745, -919707767 ^ 862141804);
      if (abaa[var3] == null) {
         abaa[var3] = (int)(baaa[var3] ^ var1);
      }

      return abaa[var3];
   }

   static String bab(char param0, class_2596 param1) {
      // $FF: Couldn't be decompiled
   }

   private static int bba(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & bb(abbb(1781004714, 669443230 ^ -1982203789), 993797688154716350L)) ^ baa(abbb(1781004717, 669443230 ^ 578108806), 7376255813802317036L);

      try {
         if (aaab[var3] == null) {
            aaab[var3] = (int)(aba[var3] ^ var1);
         }
      } catch (MatchException var4) {
         throw var4;
      }

      return aaab[var3];
   }

   private static void a(StringBuilder var0, class_2338 var1) {
      int var2 = -1457680389;

      try {
         try {
            if (var1 == null) {
               var0.append((char)bba(baa(abbb(1781004716, var2 ^ 1363940397), 7979625770621018838L), bb(abbb(1781004719, var2 ^ -1210715155), 2241172707398034001L)));
               return;
            }
         } catch (IllegalStateException var3) {
            throw var3;
         }
      } catch (MatchException var4) {
         throw var4;
      }

      var0.append(var1.method_10263()).append((char)bba(baa(abbb(1781004718, var2 ^ 119171256), 3051543567052776989L), bb(abbb(1781004721, var2 ^ -400587431), 1163839637607321107L))).append(var1.method_10264()).append((char)bba(baa(abbb(1781004720, var2 ^ 1879795569), 7252416976369586878L), bb(abbb(1781004723, var2 ^ 1592765993), 6509225076793652975L))).append(var1.method_10260());
   }

   private static void bbb(StringBuilder var0, class_243 var1) {
      int var2 = -557310105;

      try {
         try {
            if (var1 == null) {
               var0.append((char)bba(baa(abbb(1781004722, var2 ^ -141387180), 1726820455734152253L), bb(abbb(1781004725, var2 ^ 1534303108), 3166719583097231182L)));
               return;
            }
         } catch (IllegalStateException var3) {
            throw var3;
         }
      } catch (MatchException var4) {
         throw var4;
      }

      var0.append(var1.field_1352).append((char)bba(baa(abbb(1781004724, var2 ^ -168238606), 7252416976369586878L), bb(abbb(1781004727, var2 ^ -1083974295), 6509225076793652975L))).append(var1.field_1351).append((char)bba(baa(abbb(1781004726, var2 ^ 1954415993), 7252416976369586878L), bb(abbb(1781004729, var2 ^ 853495991), 6509225076793652975L))).append(var1.field_1350);
   }

   private static void aaaa(int[] var0, StringBuilder var1, class_2338 var2, class_2680 var3) {
      int var4 = -1026117325;

      try {
         int var10003 = var0[0];
         int var10000 = var0[0];
         var0[0] = var10003 + 1;
         if (var10000 < bba(baa(abbb(1781004728, var4 ^ -443802238), 2726965282597840912L), bb(abbb(1781004731, var4 ^ 41943033), 8995036910455354296L))) {
            a(var1.append((char)bba(baa(abbb(1781004730, var4 ^ 1420006164), 9122665453925852071L), bb(abbb(1781004733, var4 ^ 983843328), 4810334160651917877L))), var2);
            var1.append((char)bba(baa(abbb(1781004732, var4 ^ 1877156767), 3724488203829245902L), bb(abbb(1781004735, var4 ^ 1166558868), 6168980050913379768L))).append(var3);
         }

      } catch (MatchException var5) {
         throw var5;
      } catch (IllegalStateException var6) {
         throw var6;
      }
   }

   public void aabaa() {
      b();
   }

   private static void aaab(char var0, class_2596 var1) {
      int var2 = q2997348aa27a422480aea29cbfd800b1aabaabaaa.bba;
      int var10000 = q2997348aa27a422480aea29cbfd800b1aabaabaaa.bb;
      String var4 = bab(var0, var1);
      int var3 = var10000;
      Object var5;
      Object var27 = var5 = aaba;

      label166: {
         label165: {
            label164: {
               try {
                  if (var3 != 0) {
                     break label165;
                  }

                  synchronized(var27){}
                  if (var2 != 0) {
                     break label164;
                  }
               } catch (MatchException var26) {
                  throw var26;
               }

               try {
                  try {
                     if (aab.size() >= bba(baa(abbb(1781004734, 1225009219 ^ 1078042642), 5024640706697804598L), bb(abbb(1781004609, 1225009219 ^ -1015839997), 346767049052939870L))) {
                        aab.pollFirst();
                     }
                  } catch (MatchException var24) {
                     throw var24;
                  }

                  aab.addLast(var4);
               } catch (Throwable var25) {
                  var28 = var25;
                  boolean var10001 = false;
                  break label166;
               }
            }

            try {
               var27 = var5;
            } catch (Throwable var23) {
               var28 = var23;
               boolean var29 = false;
               break label166;
            }
         }

         label149:
         try {
            return;
         } catch (Throwable var22) {
            var28 = var22;
            boolean var30 = false;
            break label149;
         }
      }

      Throwable var6 = var28;
      throw var6;
   }

   static void aaba() {
      synchronized(aaba) {
         aab.clear();
      }

      aaa = System.nanoTime();
      baa = true;
   }

   public q2997348aa27a422480aea29cbfd800b1abbaaabb() {
      super((Object)bb, q2997348aa27a422480aea29cbfd800b1aabbaaaaa.abb, (Object)baba);
      this.abba = (q2997348aa27a422480aea29cbfd800b1bbaaaaaa)this.aaabbbbb(new q2997348aa27a422480aea29cbfd800b1bbaaaaaa(a));
   }

   private static void aabb(String param0, boolean param1) {
      // $FF: Couldn't be decompiled
   }

   static void b() {
      baa = false;
      synchronized(aaba) {
         aab.clear();
      }
   }

   public void baba() {
      // $FF: Couldn't be decompiled
   }

   public static void abaa(Object param0) {
      // $FF: Couldn't be decompiled
   }

   private static Path abba(List param0) {
      // $FF: Couldn't be decompiled
   }
}
