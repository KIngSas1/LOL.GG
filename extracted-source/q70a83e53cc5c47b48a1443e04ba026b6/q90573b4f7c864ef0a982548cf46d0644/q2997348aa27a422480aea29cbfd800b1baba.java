package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_2596;
import net.minecraft.class_2923;
import net.minecraft.class_310;
import net.minecraft.class_634;

@Environment(EnvType.CLIENT)
public final class q2997348aa27a422480aea29cbfd800b1baba {
   private static final Long[] aa;
   private int ab;
   private volatile boolean ba;
   private static final long bb;
   private static final String[] aaa;
   private long aab;
   private q2997348aa27a422480aea29cbfd800b1aabbab aba;
   private static final int abb;
   private static final long baa;
   private static final long[] bab;
   private static final double bba = 0.07;
   private final int[] bbb;
   private boolean aaaa;
   private long aaab;
   private static final long[] aaba;
   private static final int a;
   private static final q2997348aa27a422480aea29cbfd800b1baba aabb;
   private long b;
   private volatile boolean abaa;
   private static final String[] abab;
   private static final Integer[] abba;
   private static final int abbb;
   private static final String[] abbab;
   private static final Object[] abbba;
   private static final double baaa = (double)25.0F;
   private static final int[] abbaa;
   private long baab;
   private volatile boolean baba;
   private double babb;
   private static final long bbaa;
   private static final long bbab;
   private volatile q2997348aa27a422480aea29cbfd800b1aabbba bbba;
   private final Map bbbb;
   private static final long aaaaa;
   private volatile int aaaab;
   private volatile boolean aaaba;
   private static final Long[] aaabb;
   private static final long[] aabaa;
   private static final long[] aabab;
   private volatile boolean aabba;
   private int aabbb;
   private volatile boolean abaaa;
   private int abaab;
   private static final Integer[] ababa;
   private double ababb;

   private q2997348aa27a422480aea29cbfd800b1baba() {
      this.bbba = q2997348aa27a422480aea29cbfd800b1aabbba.a;
      this.aba = q2997348aa27a422480aea29cbfd800b1aabbab.b;
      this.aabba = true;
      this.ba = true;
      this.bbb = new int[5];
      this.bbbb = new ConcurrentHashMap();
   }

   private void aa(long param1) {
      // $FF: Couldn't be decompiled
   }

   static {
      // $FF: Couldn't be decompiled
   }

   public void ab(long var1) {
      int var10000 = q2997348aa27a422480aea29cbfd800b1bbabab.aaab;
      q2997348aa27a422480aea29cbfd800b1abaabab var4 = (q2997348aa27a422480aea29cbfd800b1abaabab)this.bbbb.get(var1);
      int var3 = var10000;

      label24: {
         try {
            try {
               var7 = var4;
               if (var3 != 0) {
                  break label24;
               }

               if (var4 == null) {
                  return;
               }
            } catch (IllegalStateException var5) {
               throw var5;
            }
         } catch (MatchException var6) {
            throw var6;
         }

         var7 = var4;
      }

      var7.ab = System.currentTimeMillis();
   }

   private void ba(long param1) {
      // $FF: Couldn't be decompiled
   }

   private void bb() {
      this.bbbb.clear();
      this.aaaa = false;
      this.aaab = 0L;
      this.abaab = 0;
      this.ababb = (double)0.0F;
      this.b = 0L;
      this.aabbb = 0;
      this.ab = 0;
   }

   public void aaa(class_310 param1) {
      // $FF: Couldn't be decompiled
   }

   private void aab(class_634 param1, boolean param2) {
      // $FF: Couldn't be decompiled
   }

   public int aba() {
      return this.aaaab;
   }

   private static long abb(double param0) {
      // $FF: Couldn't be decompiled
   }

   public boolean baa() {
      return this.ba;
   }

   private static boolean bab(long var0, Map.Entry var2) {
      // $FF: Couldn't be decompiled
   }

   private int bba() {
      // $FF: Couldn't be decompiled
   }

   public boolean bbb() {
      return this.baba;
   }

   public void aaaa(long var1, long var3) {
      int var10000 = q2997348aa27a422480aea29cbfd800b1bbabab.aaab;
      q2997348aa27a422480aea29cbfd800b1abaabab var6 = (q2997348aa27a422480aea29cbfd800b1abaabab)this.bbbb.get(var1);
      int var5 = var10000;

      label24: {
         try {
            try {
               var9 = var6;
               if (var5 != 0) {
                  break label24;
               }

               if (var6 == null) {
                  return;
               }
            } catch (IllegalStateException var7) {
               throw var7;
            }
         } catch (MatchException var8) {
            throw var8;
         }

         var9 = var6;
      }

      var9.aaa = var3;
   }

   private static int aaab(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ babaa(728840160, -579879579 ^ -546211663);
      if (abba[var3] == null) {
         abba[var3] = (int)(aaba[var3] ^ var1);
      }

      return abba[var3];
   }

   public void aaba(long var1) {
      try {
         try {
            if (!this.aaaba) {
               return;
            }
         } catch (IllegalStateException var6) {
            throw var6;
         }
      } catch (MatchException var7) {
         throw var7;
      }

      long var3 = System.currentTimeMillis();
      this.aa(var3);
      q2997348aa27a422480aea29cbfd800b1abaabab var5 = new q2997348aa27a422480aea29cbfd800b1abaabab();
      var5.ba = this.aab;
      var5.b = this.baaab();
      var5.aaa = this.abaab();
      this.bbbb.put(var1, var5);
      this.aaab = var3;
      this.aaaa = true;
   }

   private static long aabb(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ babaa(728840161, 333880440 ^ 1918764129)) & babaa(728840162, 333880440 ^ -829383632);
      if (aaabb[var3] == null) {
         aaabb[var3] = bab[var3] ^ var1;
      }

      return aaabb[var3];
   }

   private int a(int param1) {
      // $FF: Couldn't be decompiled
   }

   private static long abaa(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ aaab(babaa(728840163, 609391773 ^ 1465858798), 1385814464534960763L)) & aaab(babaa(728840172, 609391773 ^ -1225413715), 7662746248089960828L);

      try {
         if (aa[var3] == null) {
            aa[var3] = aabaa[var3] ^ var1;
         }
      } catch (MatchException var4) {
         throw var4;
      }

      return aa[var3];
   }

   private static int abab(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & aabb(babaa(728840173, 1701904775 ^ 1466914710), 6712554391450298188L)) ^ aaab(babaa(728840174, 1701904775 ^ -845659556), 327676334830814956L);

      try {
         if (ababa[var3] == null) {
            ababa[var3] = (int)(aabab[var3] ^ var1);
         }
      } catch (MatchException var4) {
         throw var4;
      }

      return ababa[var3];
   }

   public synchronized void abba() {
      this.aaaaa(true);
   }

   public boolean abbb() {
      return this.aabba;
   }

   public boolean baaa() {
      return this.aaaba;
   }

   public static boolean baab(String param0) {
      // $FF: Couldn't be decompiled
   }

   static boolean baba(class_2596 param0) {
      // $FF: Couldn't be decompiled
   }

   public void babb(class_2923 param1) {
      // $FF: Couldn't be decompiled
   }

   private int bbaa(class_310 param1) {
      // $FF: Couldn't be decompiled
   }

   public static boolean bbab(String param0) {
      // $FF: Couldn't be decompiled
   }

   public static boolean bbba(class_2596 param0) {
      // $FF: Couldn't be decompiled
   }

   private static int babaa(int var0, int var1) {
      int var2 = abbaa[var0 ^ 728840004] ^ var1 ^ var0;
      var2 ^= 11173;
      var2 -= 47857;
      var2 -= 31242;
      var2 -= 24808;
      var2 ^= 53653;
      var2 ^= 16231;
      var2 -= 27454;
      var2 ^= 17655;
      return var2;
   }

   public boolean bbbb() {
      return this.abaaa;
   }

   public synchronized void aaaaa(boolean param1) {
      // $FF: Couldn't be decompiled
   }

   public static q2997348aa27a422480aea29cbfd800b1baba aaaab() {
      return aabb;
   }

   private static String aaaba(int param0, int param1) {
      // $FF: Couldn't be decompiled
   }

   public int aaabb() {
      return (int)this.aab;
   }

   private void aabaa(long param1, long param3) {
      // $FF: Couldn't be decompiled
   }

   public synchronized q2997348aa27a422480aea29cbfd800b1aabbab aabab() {
      q2997348aa27a422480aea29cbfd800b1aabbab var1 = this.aba;
      this.aba = q2997348aa27a422480aea29cbfd800b1aabbab.b;
      this.abaa = false;
      return var1;
   }

   private void aabba(int param1) {
      // $FF: Couldn't be decompiled
   }

   public int aabbb() {
      return this.bba();
   }

   public boolean abaaa() {
      return this.abaa;
   }

   public long abaab() {
      return this.aab - this.baaab();
   }

   private static String babab(int var0, int var1) {
      int var3 = var0 ^ 1730307893;
      char[] var4 = abbab[var3].toCharArray();
      StackTraceElement[] var2 = (StackTraceElement[])abbba[var3];
      StackTraceElement[] var5;
      if (var2 != null) {
         var5 = var2;
      } else {
         var5 = (new Throwable()).getStackTrace();
         abbba[var3] = var5;
      }

      StackTraceElement var6 = var5[1];
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ 1582629312;
      int var8 = 0;

      do {
         short var9;
         switch (var8 & 31) {
            case 0:
            default:
               var9 = 129;
               break;
            case 1:
               var9 = 4;
               break;
            case 2:
               var9 = 153;
               break;
            case 3:
               var9 = 245;
               break;
            case 4:
               var9 = 38;
               break;
            case 5:
               var9 = 163;
               break;
            case 6:
               var9 = 215;
               break;
            case 7:
               var9 = 123;
               break;
            case 8:
               var9 = 55;
               break;
            case 9:
               var9 = 210;
               break;
            case 10:
               var9 = 153;
               break;
            case 11:
               var9 = 220;
               break;
            case 12:
               var9 = 208;
               break;
            case 13:
               var9 = 163;
               break;
            case 14:
               var9 = 59;
               break;
            case 15:
               var9 = 71;
               break;
            case 16:
               var9 = 169;
               break;
            case 17:
               var9 = 73;
               break;
            case 18:
               var9 = 229;
               break;
            case 19:
               var9 = 119;
               break;
            case 20:
               var9 = 114;
               break;
            case 21:
               var9 = 47;
               break;
            case 22:
               var9 = 77;
               break;
            case 23:
               var9 = 200;
               break;
            case 24:
               var9 = 131;
               break;
            case 25:
               var9 = 238;
               break;
            case 26:
               var9 = 191;
               break;
            case 27:
               var9 = 76;
               break;
            case 28:
               var9 = 149;
               break;
            case 29:
               var9 = 22;
               break;
            case 30:
               var9 = 137;
               break;
            case 31:
               var9 = 235;
         }

         var4[var8] = (char)(var4[var8] ^ var9 ^ var1 >> 16 ^ var7);
         ++var8;
      } while(var8 < var4.length);

      return (new String(var4)).intern();
   }

   public synchronized void ababa(boolean param1, q2997348aa27a422480aea29cbfd800b1aabbba param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   public void ababb(boolean var1) {
      this.baba = var1;
   }

   public void abbaa(long var1, long var3) {
      int var10000 = q2997348aa27a422480aea29cbfd800b1bbabab.aaab;
      q2997348aa27a422480aea29cbfd800b1abaabab var6 = (q2997348aa27a422480aea29cbfd800b1abaabab)this.bbbb.get(var1);
      int var5 = var10000;

      label24: {
         try {
            try {
               var9 = var6;
               if (var5 != 0) {
                  break label24;
               }

               if (var6 == null) {
                  return;
               }
            } catch (IllegalStateException var7) {
               throw var7;
            }
         } catch (MatchException var8) {
            throw var8;
         }

         var9 = var6;
      }

      var9.b = var3;
   }

   public synchronized void abbab() {
      int var10000 = q2997348aa27a422480aea29cbfd800b1bbabab.aaab;
      this.aba = this.aba.ba(this.aabba, this.ba);
      int var1 = var10000;

      boolean var10001;
      label26: {
         label25: {
            try {
               try {
                  var4 = this;
                  var10001 = this.aba.a();
                  if (var1 != 0) {
                     break label26;
                  }

                  if (!var10001) {
                     break label25;
                  }
               } catch (IllegalStateException var2) {
                  throw var2;
               }
            } catch (MatchException var3) {
               throw var3;
            }

            var10001 = false;
            break label26;
         }

         var10001 = true;
      }

      var4.abaa = var10001;
   }

   public static boolean abbba(class_2596 param0) {
      // $FF: Couldn't be decompiled
   }

   public synchronized void abbbb(boolean var1, boolean var2) {
      this.aabba = var1;
      this.ba = var2;
   }

   public synchronized boolean b() {
      int var1 = q2997348aa27a422480aea29cbfd800b1bbabab.aaab;

      boolean var10000;
      label36: {
         try {
            try {
               var10000 = this.aabab().a();
               if (var1 != 0) {
                  return var10000;
               }

               if (!var10000) {
                  break label36;
               }
            } catch (IllegalStateException var2) {
               throw var2;
            }
         } catch (MatchException var3) {
            throw var3;
         }

         var10000 = false;
         return var10000;
      }

      var10000 = true;
      return var10000;
   }

   public void baaaa(long var1) {
      int var10000 = q2997348aa27a422480aea29cbfd800b1bbabab.aaab;
      q2997348aa27a422480aea29cbfd800b1abaabab var4 = (q2997348aa27a422480aea29cbfd800b1abaabab)this.bbbb.get(var1);
      int var3 = var10000;

      label24: {
         try {
            try {
               var7 = var4;
               if (var3 != 0) {
                  break label24;
               }

               if (var4 == null) {
                  return;
               }
            } catch (IllegalStateException var5) {
               throw var5;
            }
         } catch (MatchException var6) {
            throw var6;
         }

         var7 = var4;
      }

      var7.baa = System.currentTimeMillis();
   }

   public long baaab() {
      return this.aab / abaa(aaab(babaa(728839817, 1642339351 ^ -1634901667), 8584363615013020147L), aabb(babaa(728839818, 1642339351 ^ 628106131), 631763702465468803L));
   }

   public synchronized void baaba(boolean var1) {
      this.abaaa = var1;
   }

   private boolean baabb(long param1) {
      // $FF: Couldn't be decompiled
   }
}
