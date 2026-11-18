package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum q2997348aa27a422480aea29cbfd800b1abbabab {
   public static final q2997348aa27a422480aea29cbfd800b1abbabab aa;
   private static final int[] abab;
   public static final q2997348aa27a422480aea29cbfd800b1abbabab ab;
   public static final q2997348aa27a422480aea29cbfd800b1abbabab ba;
   public static final q2997348aa27a422480aea29cbfd800b1abbabab bb;
   private static final long[] aaa;
   public static final q2997348aa27a422480aea29cbfd800b1abbabab aab;
   private static final String[] abba;
   private static final long[] aba;
   private static final q2997348aa27a422480aea29cbfd800b1abbabab[] a;
   public static final q2997348aa27a422480aea29cbfd800b1abbabab abb;
   public static final q2997348aa27a422480aea29cbfd800b1abbabab baa;
   private static final long[] bab;
   public static final q2997348aa27a422480aea29cbfd800b1abbabab bba;
   public static final q2997348aa27a422480aea29cbfd800b1abbabab bbb;
   private final q2997348aa27a422480aea29cbfd800b1babba aaaa;
   private static final Integer[] b;
   private static final Long[] aaab;
   private static final Object[] abbb;
   public static final q2997348aa27a422480aea29cbfd800b1abbabab aaba;
   public static final q2997348aa27a422480aea29cbfd800b1abbabab aabb;
   private static final Integer[] abaa;

   private static int aa(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & bb(aaa(1058242705, -190030723 ^ -909660973), 6662768508939989188L)) ^ b(aaa(1058242704, -190030723 ^ -1685351125), 8905132696947956344L);

      try {
         if (b[var3] == null) {
            b[var3] = (int)(aaa[var3] ^ var1);
         }
      } catch (MatchException var4) {
         throw var4;
      }

      return b[var3];
   }

   private static String aab(int var0, int var1, char var2) {
      int var3 = var2 ^ 27555;
      char[] var4 = abba[var3].toCharArray();
      StackTraceElement[] var5 = (StackTraceElement[])abbb[var3];
      StackTraceElement[] var6;
      if (var5 != null) {
         var6 = var5;
      } else {
         var6 = (new Throwable()).getStackTrace();
         abbb[var3] = var6;
      }

      StackTraceElement var7 = var6[1];
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 15532;
      int var9 = 0;

      do {
         int var10 = var4[var9] ^ '뫦';
         var10 ^= 2724;
         var10 += 63447;
         var10 += 9037;
         var4[var9] = (char)(var10 ^ var8 ^ var0 ^ var1 >> 16);
         ++var9;
      } while(var9 < var4.length);

      return (new String(var4)).intern();
   }

   public String toString() {
      return this.aaaa.bba();
   }

   private static q2997348aa27a422480aea29cbfd800b1abbabab[] ab() {
      int var0 = -1136301576;
      q2997348aa27a422480aea29cbfd800b1abbabab[] var10000 = new q2997348aa27a422480aea29cbfd800b1abbabab[aa(b(aaa(1058242707, var0 ^ -290239423), 3122124408575925352L), bb(aaa(1058242706, var0 ^ -1784912513), 8502566956045038235L))];
      var10000[0] = bbb;
      var10000[1] = bb;
      var10000[2] = bba;
      var10000[3] = abb;
      var10000[4] = aaba;
      var10000[5] = ba;
      var10000[aa(b(aaa(1058242669, var0 ^ -1112480052), 7142693864288261238L), bb(aaa(1058242668, var0 ^ -2015104419), 8203968213779327144L))] = aabb;
      var10000[aa(b(aaa(1058242671, var0 ^ 610054160), 4681539770263649262L), bb(aaa(1058242670, var0 ^ 917240647), 3666782323876755204L))] = aa;
      var10000[aa(b(aaa(1058242665, var0 ^ 34901105), 4381362925692776957L), bb(aaa(1058242664, var0 ^ 1296138275), 4900125099326841204L))] = baa;
      var10000[aa(b(aaa(1058242667, var0 ^ -578092503), 8578902703617655461L), bb(aaa(1058242666, var0 ^ 1033343502), 7253111018710588636L))] = aab;
      var10000[aa(b(aaa(1058242661, var0 ^ 2118575981), 6217991500571388264L), bb(aaa(1058242660, var0 ^ -786118980), 8034556589794259882L))] = ab;
      return var10000;
   }

   private q2997348aa27a422480aea29cbfd800b1abbabab(q2997348aa27a422480aea29cbfd800b1babba var3) {
      this.aaaa = var3;
   }

   static {
      // $FF: Couldn't be decompiled
   }

   public static q2997348aa27a422480aea29cbfd800b1abbabab ba(String var0) {
      return (q2997348aa27a422480aea29cbfd800b1abbabab)Enum.valueOf(q2997348aa27a422480aea29cbfd800b1abbabab.class, var0);
   }

   private static long bb(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ aaa(1058242663, -367781126 ^ -220328200)) & aaa(1058242662, -367781126 ^ -482054489);
      if (aaab[var3] == null) {
         aaab[var3] = bab[var3] ^ var1;
      }

      return aaab[var3];
   }

   public q2997348aa27a422480aea29cbfd800b1babba a() {
      return this.aaaa;
   }

   private static int aaa(int var0, int var1) {
      int var2 = abab[var0 ^ 1058242797] ^ var1 ^ var0;
      var2 -= 469;
      var2 -= 42873;
      var2 += 2273;
      var2 += 14438;
      var2 ^= 40037;
      var2 += 36013;
      return var2;
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ aaa(1058242657, -124357644 ^ 852111432);
      if (abaa[var3] == null) {
         abaa[var3] = (int)(aba[var3] ^ var1);
      }

      return abaa[var3];
   }
}
