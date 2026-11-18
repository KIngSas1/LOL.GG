package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
enum q2997348aa27a422480aea29cbfd800b1bbbababb implements q2997348aa27a422480aea29cbfd800b1aabbbabab {
   private static final int[] aabb;
   private final q2997348aa27a422480aea29cbfd800b1babba aa;
   private static final String[] abaa;
   private final q2997348aa27a422480aea29cbfd800b1babba ab;
   private static final Long[] b;
   private static final Object[] abab;
   public static final q2997348aa27a422480aea29cbfd800b1bbbababb ba;
   private static final long[] bb;
   public static final q2997348aa27a422480aea29cbfd800b1bbbababb a;
   public static final q2997348aa27a422480aea29cbfd800b1bbbababb aaa;
   public static final q2997348aa27a422480aea29cbfd800b1bbbababb aab;
   public static final q2997348aa27a422480aea29cbfd800b1bbbababb aba;
   private static final Integer[] abb;
   private static final long[] baa;
   public static final q2997348aa27a422480aea29cbfd800b1bbbababb bab;
   public static final q2997348aa27a422480aea29cbfd800b1bbbababb bba;
   private static final long[] bbb;
   private static final Integer[] aaaa;
   public static final q2997348aa27a422480aea29cbfd800b1bbbababb aaab;
   private static final q2997348aa27a422480aea29cbfd800b1bbbababb[] aaba;

   public Enum ba() {
      // $FF: Couldn't be decompiled
   }

   private static int aa(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ a(-674962621, -1046059496 ^ 1982395875);
      if (aaaa[var3] == null) {
         aaaa[var3] = (int)(bb[var3] ^ var1);
      }

      return aaaa[var3];
   }

   private q2997348aa27a422480aea29cbfd800b1bbbababb(q2997348aa27a422480aea29cbfd800b1babba var3, q2997348aa27a422480aea29cbfd800b1babba var4) {
      this.ab = var3;
      this.aa = var4;
   }

   public boolean bb() {
      boolean var10000;
      try {
         try {
            if (this != a) {
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

   public String toString() {
      return this.ab.bba();
   }

   private static int ab(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & aaa(a(-674962636, -834578259 ^ -51531690), 1225522498016848787L)) ^ aa(a(-674962629, -834578259 ^ -519346632), 2447186875887983063L);

      try {
         if (abb[var3] == null) {
            abb[var3] = (int)(bbb[var3] ^ var1);
         }
      } catch (MatchException var4) {
         throw var4;
      }

      return abb[var3];
   }

   static {
      // $FF: Couldn't be decompiled
   }

   private static String aab(short var0, int var1, int var2) {
      int var3 = var2 ^ '鴜';
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
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 16222;
      int var9 = 0;

      do {
         int var10 = var4[var9] + 29255;
         var10 += 59075;
         var10 -= 62271;
         var10 += 43650;
         var10 ^= 3325;
         var10 -= 55847;
         var10 -= 965;
         var10 += 36481;
         var4[var9] = (char)(var10 ^ var8 ^ var0 ^ var1 >> 16);
         ++var9;
      } while(var9 < var4.length);

      return (new String(var4)).intern();
   }

   private static int a(int var0, int var1) {
      int var2 = aabb[var0 ^ -674962621] ^ var1 ^ var0;
      var2 ^= 59865;
      var2 += 35414;
      var2 += 4393;
      var2 ^= 43897;
      var2 += 41315;
      var2 ^= 48634;
      return var2;
   }

   private static q2997348aa27a422480aea29cbfd800b1bbbababb[] b() {
      int var0 = 678468501;
      q2997348aa27a422480aea29cbfd800b1bbbababb[] var10000 = new q2997348aa27a422480aea29cbfd800b1bbbababb[ab(aa(a(-674962630, var0 ^ -82267251), 6154505201213803120L), aaa(a(-674962631, var0 ^ -1247016337), 5632734920332492215L))];
      var10000[0] = aaa;
      var10000[1] = bba;
      var10000[2] = aab;
      var10000[3] = aba;
      var10000[4] = ba;
      var10000[5] = bab;
      var10000[ab(aa(a(-674962632, var0 ^ 1972011218), 7122722353500060565L), aaa(a(-674962625, var0 ^ 2142046716), 2859595465388261875L))] = a;
      var10000[ab(aa(a(-674962626, var0 ^ -2084609219), 8251173587441993884L), aaa(a(-674962627, var0 ^ -1016568093), 8570648620513605191L))] = aaab;
      return var10000;
   }

   private static long aaa(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ a(-674962628, -2141614919 ^ 2115151113)) & a(-674962493, -2141614919 ^ -436335472);
      if (b[var3] == null) {
         b[var3] = baa[var3] ^ var1;
      }

      return b[var3];
   }
}
