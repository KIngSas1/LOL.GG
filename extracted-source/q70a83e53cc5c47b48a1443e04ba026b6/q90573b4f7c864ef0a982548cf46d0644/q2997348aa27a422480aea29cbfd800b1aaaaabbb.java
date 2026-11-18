package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
enum q2997348aa27a422480aea29cbfd800b1aaaaabbb {
   public static final q2997348aa27a422480aea29cbfd800b1aaaaabbb aa;
   public static final q2997348aa27a422480aea29cbfd800b1aaaaabbb ab;
   private static final long[] ba;
   private static final Long[] bb;
   private static final long[] aaa;
   private static final String[] aaba;
   public static final q2997348aa27a422480aea29cbfd800b1aaaaabbb a;
   public static final q2997348aa27a422480aea29cbfd800b1aaaaabbb aab;
   private static final Integer[] aba;
   public static final q2997348aa27a422480aea29cbfd800b1aaaaabbb abb;
   private static final Integer[] baa;
   private static final Object[] aabb;
   private static final int[] aaab;
   public static final q2997348aa27a422480aea29cbfd800b1aaaaabbb bab;
   private static final long[] bba;
   private static final q2997348aa27a422480aea29cbfd800b1aaaaabbb[] bbb;
   public static final q2997348aa27a422480aea29cbfd800b1aaaaabbb b;
   public static final q2997348aa27a422480aea29cbfd800b1aaaaabbb aaaa;

   private static int aa(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & ba(b(862303693, -719988061 ^ -276013861), 1430449358003089713L)) ^ ab(b(862303692, -719988061 ^ -1541420722), 1189601960734826025L);

      try {
         if (aba[var3] == null) {
            aba[var3] = (int)(ba[var3] ^ var1);
         }
      } catch (MatchException var4) {
         throw var4;
      }

      return aba[var3];
   }

   private static int ab(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ b(862303695, -2078688631 ^ 384773916);
      if (baa[var3] == null) {
         baa[var3] = (int)(aaa[var3] ^ var1);
      }

      return baa[var3];
   }

   private static int b(int var0, int var1) {
      int var2 = aaab[var0 ^ 862303693] ^ var1 ^ var0;
      var2 += 484;
      var2 ^= 10084;
      var2 += 58295;
      var2 ^= 41525;
      var2 -= 53901;
      var2 ^= 52469;
      var2 += 21315;
      var2 ^= 52943;
      var2 ^= 57831;
      return var2;
   }

   private static String bb(int var0, int var1, short var2) {
      int var3 = var1 ^ '\ue80f';
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
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 2284;
      int var9 = 0;

      do {
         int var10 = var4[var9] + '\uda2b';
         var10 += 58169;
         var10 -= 36640;
         var10 -= 5843;
         var10 -= 64610;
         var4[var9] = (char)(var10 ^ var8 ^ var2 ^ var0 >> 16);
         ++var9;
      } while(var9 < var4.length);

      return (new String(var4)).intern();
   }

   static {
      // $FF: Couldn't be decompiled
   }

   private static long ba(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ b(862303658, -240697950 ^ -915786374)) & b(862303653, -240697950 ^ 246532576);
      if (bb[var3] == null) {
         bb[var3] = bba[var3] ^ var1;
      }

      return bb[var3];
   }

   private static q2997348aa27a422480aea29cbfd800b1aaaaabbb[] a() {
      int var0 = 1447414187;
      q2997348aa27a422480aea29cbfd800b1aaaaabbb[] var10000 = new q2997348aa27a422480aea29cbfd800b1aaaaabbb[aa(ab(b(862303652, var0 ^ -252230683), 6884232800011248202L), ba(b(862303655, var0 ^ 1945970820), 6964181053881160155L))];
      var10000[0] = aaaa;
      var10000[1] = abb;
      var10000[2] = aab;
      var10000[3] = aa;
      var10000[4] = ab;
      var10000[5] = b;
      var10000[aa(ab(b(862303654, var0 ^ 342432481), 4524297354775628042L), ba(b(862303649, var0 ^ 628287009), 2239377605362029842L))] = bab;
      var10000[aa(ab(b(862303648, var0 ^ -835863656), 4232068497733524352L), ba(b(862303651, var0 ^ -319412006), 7029891493692423309L))] = a;
      return var10000;
   }
}
