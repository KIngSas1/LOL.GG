package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum q2997348aa27a422480aea29cbfd800b1aaabaaaba {
   private static final Object[] aba;
   private final long a;
   private final double aa;
   private static final String[] aab;
   public static final q2997348aa27a422480aea29cbfd800b1aaabaaaba ab;
   public static final q2997348aa27a422480aea29cbfd800b1aaabaaaba ba;
   private final q2997348aa27a422480aea29cbfd800b1babba bb;
   private static final int[] aaa;
   private static final q2997348aa27a422480aea29cbfd800b1aaabaaaba[] b;

   static {
      // $FF: Couldn't be decompiled
   }

   public long a() {
      return this.a;
   }

   private static q2997348aa27a422480aea29cbfd800b1aaabaaaba[] aa() {
      return new q2997348aa27a422480aea29cbfd800b1aaabaaaba[]{ba, ab};
   }

   private static String bb(char var0, char var1, int var2) {
      int var3 = var0 ^ 13564;
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
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 11252;
      int var9 = 0;

      do {
         int var10 = var4[var9] - 26120;
         var10 ^= 38186;
         var10 += 19925;
         var10 ^= 24443;
         var10 ^= 49607;
         var4[var9] = (char)(var10 ^ var8 ^ var1 ^ var2 >> 16);
         ++var9;
      } while(var9 < var4.length);

      return (new String(var4)).intern();
   }

   public static q2997348aa27a422480aea29cbfd800b1aaabaaaba ab(String var0) {
      return (q2997348aa27a422480aea29cbfd800b1aaabaaaba)Enum.valueOf(q2997348aa27a422480aea29cbfd800b1aaabaaaba.class, var0);
   }

   public String toString() {
      return this.bb.bba();
   }

   public double b() {
      return this.aa;
   }

   private q2997348aa27a422480aea29cbfd800b1aaabaaaba(q2997348aa27a422480aea29cbfd800b1babba var3, long var4, double var6) {
      this.bb = var3;
      this.a = var4;
      this.aa = var6;
   }

   private static int ba(int var0, int var1) {
      int var2 = aaa[var0 ^ 1320562476] ^ var1 ^ var0;
      var2 += 5738;
      var2 ^= 9809;
      var2 += 3328;
      var2 -= 48797;
      var2 += 45502;
      var2 -= 49447;
      var2 += 16866;
      return var2;
   }
}
