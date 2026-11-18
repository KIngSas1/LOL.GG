package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import java.awt.Color;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum q2997348aa27a422480aea29cbfd800b1baaaaaaa implements q2997348aa27a422480aea29cbfd800b1aabbbabab {
   private static final Integer[] aa;
   private final q2997348aa27a422480aea29cbfd800b1babba ab;
   public static final q2997348aa27a422480aea29cbfd800b1baaaaaaa b;
   private static final Integer[] ba;
   public static final q2997348aa27a422480aea29cbfd800b1baaaaaaa bb;
   public static final q2997348aa27a422480aea29cbfd800b1baaaaaaa aaa;
   private static final long[] aab;
   private static final String[] abaa;
   public static final q2997348aa27a422480aea29cbfd800b1baaaaaaa a;
   private static final long[] aba;
   private static final long[] abb;
   private static final q2997348aa27a422480aea29cbfd800b1baaaaaaa[] baa;
   private static final Object[] abab;
   private static final int[] aabb;
   private final Color bab;
   private static final Long[] bba;
   public static final q2997348aa27a422480aea29cbfd800b1baaaaaaa bbb;
   public static final q2997348aa27a422480aea29cbfd800b1baaaaaaa aaaa;
   public static final q2997348aa27a422480aea29cbfd800b1baaaaaaa aaab;
   public static final q2997348aa27a422480aea29cbfd800b1baaaaaaa aaba;

   private static int aa(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ a(-145203287, 1365777683 ^ -2122019542);
      if (aa[var3] == null) {
         aa[var3] = (int)(aab[var3] ^ var1);
      }

      return aa[var3];
   }

   public q2997348aa27a422480aea29cbfd800b1babba ab() {
      return this.ab;
   }

   public static q2997348aa27a422480aea29cbfd800b1baaaaaaa aaa(String var0) {
      return (q2997348aa27a422480aea29cbfd800b1baaaaaaa)Enum.valueOf(q2997348aa27a422480aea29cbfd800b1baaaaaaa.class, var0);
   }

   static {
      // $FF: Couldn't be decompiled
   }

   public String toString() {
      return this.ab.bba();
   }

   private static int a(int var0, int var1) {
      int var2 = aabb[var0 ^ -145203287] ^ var1 ^ var0;
      var2 += 52295;
      var2 ^= 8315;
      var2 ^= 59012;
      var2 ^= 62499;
      var2 ^= 62911;
      var2 += 60446;
      var2 -= 62954;
      return var2;
   }

   public Color aab(Color param1) {
      // $FF: Couldn't be decompiled
   }

   private static q2997348aa27a422480aea29cbfd800b1baaaaaaa[] aba() {
      int var0 = 1749017764;
      q2997348aa27a422480aea29cbfd800b1baaaaaaa[] var10000 = new q2997348aa27a422480aea29cbfd800b1baaaaaaa[abb(aa(a(-145203456, var0 ^ -1913643754), 9096011377579745647L), b(a(-145203453, var0 ^ 1792698205), 2038056011323279187L))];
      var10000[0] = aaab;
      var10000[1] = b;
      var10000[2] = aaaa;
      var10000[3] = aaa;
      var10000[4] = bb;
      var10000[5] = a;
      var10000[abb(aa(a(-145203454, var0 ^ -106993869), 3651267829254381798L), b(a(-145203451, var0 ^ -1579763257), 7521198214957103245L))] = aaba;
      var10000[abb(aa(a(-145203452, var0 ^ -1990931923), 8289839901273953312L), b(a(-145203449, var0 ^ 1847059478), 9047353258670055163L))] = bbb;
      return var10000;
   }

   private static String baa(char var0, char var1, int var2) {
      int var3 = var1 ^ 15740;
      char[] var4 = abaa[var3].toCharArray();
      StackTraceElement[] var5 = (StackTraceElement[])abab[var3];
      StackTraceElement[] var6;
      if (var5 != null) {
         var6 = var5;
      } else {
         var6 = (new Throwable()).getStackTrace();
         abab[var3] = var6;
      }

      StackTraceElement var7 = var6[1];
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 25338;
      int var9 = 0;

      do {
         int var10 = var4[var9] ^ '뺁';
         var10 -= 29500;
         var10 -= 34811;
         var10 -= 1389;
         var10 ^= 27643;
         var10 ^= 26424;
         var10 += 54675;
         var10 -= 17207;
         var10 -= 35499;
         var10 -= 64446;
         var4[var9] = (char)(var10 ^ var8 ^ var0 ^ var2 >> 16);
         ++var9;
      } while(var9 < var4.length);

      return (new String(var4)).intern();
   }

   private static int abb(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & b(a(-145203450, 427943898 ^ 1446672572), 1784691047421986656L)) ^ aa(a(-145203431, 427943898 ^ -2103581678), 593863653969141497L);

      try {
         if (ba[var3] == null) {
            ba[var3] = (int)(abb[var3] ^ var1);
         }
      } catch (MatchException var4) {
         throw var4;
      }

      return ba[var3];
   }

   private q2997348aa27a422480aea29cbfd800b1baaaaaaa(q2997348aa27a422480aea29cbfd800b1babba var3, Color var4) {
      this.ab = var3;
      this.bab = var4;
   }

   private static long b(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ a(-145203432, 347525676 ^ -857844950)) & a(-145203429, 347525676 ^ 1398646905);
      if (bba[var3] == null) {
         bba[var3] = aba[var3] ^ var1;
      }

      return bba[var3];
   }
}
