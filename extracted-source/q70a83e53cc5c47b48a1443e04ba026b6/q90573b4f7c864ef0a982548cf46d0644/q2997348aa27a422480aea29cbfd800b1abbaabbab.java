package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
enum q2997348aa27a422480aea29cbfd800b1abbaabbab {
   public static final q2997348aa27a422480aea29cbfd800b1abbaabbab aa;
   private static final long[] ab;
   private static final Object[] aaba;
   public static final q2997348aa27a422480aea29cbfd800b1abbaabbab ba;
   public static final q2997348aa27a422480aea29cbfd800b1abbaabbab bb;
   private static final Integer[] aaa;
   private static final int[] aaaa;
   private static final Integer[] aab;
   public static final q2997348aa27a422480aea29cbfd800b1abbaabbab aba;
   private static final q2997348aa27a422480aea29cbfd800b1abbaabbab[] abb;
   public static final q2997348aa27a422480aea29cbfd800b1abbaabbab b;
   private static final long[] baa;
   public static final q2997348aa27a422480aea29cbfd800b1abbaabbab a;
   private static final long[] bab;
   public static final q2997348aa27a422480aea29cbfd800b1abbaabbab bba;
   private static final String[] aaab;
   private static final Long[] bbb;

   private static int b(int var0, int var1) {
      int var2 = aaaa[var0 ^ -454056552] ^ var1 ^ var0;
      var2 -= 61060;
      var2 -= 4633;
      var2 ^= 36030;
      var2 -= 17786;
      var2 ^= 11164;
      var2 ^= 49591;
      var2 ^= 34422;
      return var2;
   }

   static {
      // $FF: Couldn't be decompiled
   }

   public static q2997348aa27a422480aea29cbfd800b1abbaabbab aa(String var0) {
      return (q2997348aa27a422480aea29cbfd800b1abbaabbab)Enum.valueOf(q2997348aa27a422480aea29cbfd800b1abbaabbab.class, var0);
   }

   private static long ab(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ b(-454056552, -1923266918 ^ 648586149)) & b(-454056551, -1923266918 ^ -356042632);
      if (bbb[var3] == null) {
         bbb[var3] = bab[var3] ^ var1;
      }

      return bbb[var3];
   }

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ b(-454056550, -943456366 ^ 576254559);
      if (aab[var3] == null) {
         aab[var3] = (int)(baa[var3] ^ var1);
      }

      return aab[var3];
   }

   private static q2997348aa27a422480aea29cbfd800b1abbaabbab[] ba() {
      q2997348aa27a422480aea29cbfd800b1abbaabbab[] var10000 = new q2997348aa27a422480aea29cbfd800b1abbaabbab[bb(a(b(-454056499, -1702283296 ^ 187168104), 7426822317644411439L), ab(b(-454056498, -1702283296 ^ 11488814), 7068373235350593236L))];
      var10000[0] = bba;
      var10000[1] = ba;
      var10000[2] = aa;
      var10000[3] = aba;
      var10000[4] = a;
      var10000[5] = b;
      var10000[bb(a(b(-454056497, -1702283296 ^ 1510484802), 487686243710096899L), ab(b(-454056512, -1702283296 ^ -1473937671), 5206621285803727325L))] = bb;
      return var10000;
   }

   private static String aaa(int var0, char var1, char var2) {
      int var3 = var2 ^ '鿙';
      char[] var4 = aaab[var3].toCharArray();
      StackTraceElement[] var5 = (StackTraceElement[])aaba[var3];
      StackTraceElement[] var6;
      if (var5 != null) {
         var6 = var5;
      } else {
         var6 = (new Throwable()).getStackTrace();
         aaba[var3] = var6;
      }

      StackTraceElement var7 = var6[1];
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 979;
      int var9 = 0;

      do {
         int var10 = var4[var9] - 31676;
         var10 += 17375;
         var10 -= 40998;
         var10 ^= 64865;
         var10 -= 51448;
         var10 -= 50598;
         var4[var9] = (char)(var10 ^ var8 ^ var1 ^ var0 >> 16);
         ++var9;
      } while(var9 < var4.length);

      return (new String(var4)).intern();
   }

   private static int bb(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & ab(b(-454056511, 92984148 ^ -1083589945), 8988327975784235834L)) ^ a(b(-454056510, 92984148 ^ 479023597), 3160948842468424615L);

      try {
         if (aaa[var3] == null) {
            aaa[var3] = (int)(ab[var3] ^ var1);
         }
      } catch (MatchException var4) {
         throw var4;
      }

      return aaa[var3];
   }
}
