package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum q2997348aa27a422480aea29cbfd800b1aaababba {
   private static final int[] aaa;
   private final q2997348aa27a422480aea29cbfd800b1babba a;
   public static final q2997348aa27a422480aea29cbfd800b1aaababba b;
   private static final q2997348aa27a422480aea29cbfd800b1aaababba[] aa;
   private static final String[] aab;
   private static final Object[] aba;
   public static final q2997348aa27a422480aea29cbfd800b1aaababba ab;
   public static final q2997348aa27a422480aea29cbfd800b1aaababba ba;
   public static final q2997348aa27a422480aea29cbfd800b1aaababba bb;

   private q2997348aa27a422480aea29cbfd800b1aaababba(q2997348aa27a422480aea29cbfd800b1babba var3) {
      this.a = var3;
   }

   private static String aa(char var0, char var1, int var2) {
      int var3 = var1 ^ 22302;
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
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 26655;
      int var9 = 0;

      do {
         int var10 = var4[var9] - 22046;
         var10 -= 43827;
         var10 -= 61252;
         var10 ^= 53669;
         var10 ^= 2118;
         var10 -= 23602;
         var10 ^= 60176;
         var10 -= 16151;
         var4[var9] = (char)(var10 ^ var8 ^ var0 ^ var2 >> 16);
         ++var9;
      } while(var9 < var4.length);

      return (new String(var4)).intern();
   }

   static {
      // $FF: Couldn't be decompiled
   }

   private static int b(int var0, int var1) {
      int var2 = aaa[var0 ^ 231722709] ^ var1 ^ var0;
      var2 ^= 59927;
      var2 -= 51108;
      var2 ^= 54706;
      var2 += 34046;
      var2 ^= 4411;
      var2 -= 53361;
      var2 ^= 22577;
      var2 -= 15738;
      var2 -= 63348;
      return var2;
   }

   private static q2997348aa27a422480aea29cbfd800b1aaababba[] a() {
      return new q2997348aa27a422480aea29cbfd800b1aaababba[]{ba, ab, bb, b};
   }

   public String toString() {
      return this.a.bba();
   }
}
