package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum q2997348aa27a422480aea29cbfd800b1aaabbbbab implements q2997348aa27a422480aea29cbfd800b1aabbbabab {
   private static final Object[] aba;
   private static final String[] aab;
   private final q2997348aa27a422480aea29cbfd800b1babba a;
   private static final q2997348aa27a422480aea29cbfd800b1aaabbbbab[] b;
   public static final q2997348aa27a422480aea29cbfd800b1aaabbbbab aa;
   public static final q2997348aa27a422480aea29cbfd800b1aaabbbbab ab;
   private static final int[] aaa;
   public static final q2997348aa27a422480aea29cbfd800b1aaabbbbab ba;
   public static final q2997348aa27a422480aea29cbfd800b1aaabbbbab bb;

   private static int ab(int var0, int var1) {
      int var2 = aaa[var0 ^ 831873307] ^ var1 ^ var0;
      var2 ^= 17663;
      var2 -= 28630;
      var2 ^= 29758;
      var2 -= 49796;
      var2 += 27127;
      var2 += 48768;
      var2 += 13233;
      return var2;
   }

   static {
      // $FF: Couldn't be decompiled
   }

   private q2997348aa27a422480aea29cbfd800b1aaabbbbab(q2997348aa27a422480aea29cbfd800b1babba var3) {
      this.a = var3;
   }

   public boolean b() {
      // $FF: Couldn't be decompiled
   }

   private static String aaa(short var0, int var1, int var2) {
      int var3 = var2 ^ '텷';
      char[] var4 = aab[var3].toCharArray();
      StackTraceElement[] var5 = (StackTraceElement[])aba[var3];
      StackTraceElement[] var6;
      if (var5 != null) {
         var6 = var5;
      } else {
         var6 = (new Throwable()).getStackTrace();
         aba[var3] = var6;
      }

      StackTraceElement var7 = var6[1];
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 10461;
      int var9 = 0;

      do {
         int var10 = var4[var9] ^ 12992;
         var10 -= 34857;
         var10 ^= 18136;
         var10 += 61631;
         var4[var9] = (char)(var10 ^ var8 ^ var0 ^ var1 >> 16);
         ++var9;
      } while(var9 < var4.length);

      return (new String(var4)).intern();
   }

   public String toString() {
      return this.a.bba();
   }

   public boolean a() {
      // $FF: Couldn't be decompiled
   }

   private static q2997348aa27a422480aea29cbfd800b1aaabbbbab[] aa() {
      return new q2997348aa27a422480aea29cbfd800b1aaabbbbab[]{ba, aa, ab, bb};
   }
}
