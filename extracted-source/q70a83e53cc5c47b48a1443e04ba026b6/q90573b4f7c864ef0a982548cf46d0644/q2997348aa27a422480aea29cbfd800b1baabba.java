package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum q2997348aa27a422480aea29cbfd800b1baabba {
   public static final q2997348aa27a422480aea29cbfd800b1baabba aa;
   private static final long[] ab;
   public static final q2997348aa27a422480aea29cbfd800b1baabba a;
   private static final long[] ba;
   private static final Integer[] bb;
   private static final int[] aaab;
   public static final q2997348aa27a422480aea29cbfd800b1baabba aaa;
   private static final Long[] aab;
   private static final String[] aaba;
   public static final q2997348aa27a422480aea29cbfd800b1baabba aba;
   public static final q2997348aa27a422480aea29cbfd800b1baabba abb;
   private static final Integer[] baa;
   private final q2997348aa27a422480aea29cbfd800b1babba bab;
   public static final q2997348aa27a422480aea29cbfd800b1baabba b;
   public static final q2997348aa27a422480aea29cbfd800b1baabba bba;
   private static final long[] bbb;
   private static final Object[] aabb;
   private static final q2997348aa27a422480aea29cbfd800b1baabba[] aaaa;

   private static int aab(int var0, int var1) {
      int var2 = aaab[var0 ^ 880726977] ^ var1 ^ var0;
      var2 -= 7479;
      var2 ^= 17575;
      var2 -= 19917;
      var2 -= 63502;
      var2 -= 8182;
      var2 ^= 218;
      var2 ^= 55705;
      var2 += 11983;
      var2 ^= 10747;
      return var2;
   }

   public q2997348aa27a422480aea29cbfd800b1babba aa() {
      return this.bab;
   }

   private q2997348aa27a422480aea29cbfd800b1baabba(q2997348aa27a422480aea29cbfd800b1babba var3) {
      this.bab = var3;
   }

   private static int ab(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ aab(880726934, 1619011232 ^ -877235361);
      if (bb[var3] == null) {
         bb[var3] = (int)(ab[var3] ^ var1);
      }

      return bb[var3];
   }

   private static q2997348aa27a422480aea29cbfd800b1baabba[] ba() {
      q2997348aa27a422480aea29cbfd800b1baabba[] var10000 = new q2997348aa27a422480aea29cbfd800b1baabba[aaa(ab(aab(880726937, 717214909 ^ 523839542), 8349308340717442621L), b(aab(880726936, 717214909 ^ 471890980), 4910501356062990801L))];
      var10000[0] = b;
      var10000[1] = aba;
      var10000[2] = aa;
      var10000[3] = a;
      var10000[4] = abb;
      var10000[5] = aaa;
      var10000[aaa(ab(aab(880726939, 717214909 ^ 1865059639), 4051703368655569312L), b(aab(880726938, 717214909 ^ 1835255824), 7714216504316024669L))] = bba;
      return var10000;
   }

   public static q2997348aa27a422480aea29cbfd800b1baabba bb(String var0) {
      return (q2997348aa27a422480aea29cbfd800b1baabba)Enum.valueOf(q2997348aa27a422480aea29cbfd800b1baabba.class, var0);
   }

   private static int aaa(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & b(aab(880726941, 2068106272 ^ 796011897), 8591228891614958078L)) ^ ab(aab(880726940, 2068106272 ^ 1894461977), 3683223792036248191L);

      try {
         if (baa[var3] == null) {
            baa[var3] = (int)(ba[var3] ^ var1);
         }
      } catch (MatchException var4) {
         throw var4;
      }

      return baa[var3];
   }

   private static long b(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ aab(880726943, -69854877 ^ -31107057)) & aab(880726942, -69854877 ^ 1065359258);
      if (aab[var3] == null) {
         aab[var3] = bbb[var3] ^ var1;
      }

      return aab[var3];
   }

   private static String aba(char var0, int var1, char var2) {
      int var3 = var0 ^ '푵';
      char[] var4 = aaba[var3].toCharArray();
      StackTraceElement[] var5 = (StackTraceElement[])aabb[var3];
      StackTraceElement[] var6;
      if (var5 != null) {
         var6 = var5;
      } else {
         var6 = (new Throwable()).getStackTrace();
         aabb[var3] = var6;
      }

      StackTraceElement var7 = var6[1];
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 19917;
      int var9 = 0;

      do {
         int var10 = var4[var9] + 15482;
         var10 ^= 17698;
         var10 -= 60956;
         var10 += 42849;
         var4[var9] = (char)(var10 ^ var8 ^ var2 ^ var1 >> 16);
         ++var9;
      } while(var9 < var4.length);

      return (new String(var4)).intern();
   }

   static {
      // $FF: Couldn't be decompiled
   }

   public String toString() {
      return this.bab.bba();
   }

   public boolean a() {
      boolean var10000;
      try {
         try {
            if (this != b) {
               var10000 = true;
               return var10000;
            }
         } catch (IllegalStateException var1) {
            throw var1;
         }
      } catch (MatchException var2) {
         throw var2;
      }

      var10000 = false;
      return var10000;
   }
}
