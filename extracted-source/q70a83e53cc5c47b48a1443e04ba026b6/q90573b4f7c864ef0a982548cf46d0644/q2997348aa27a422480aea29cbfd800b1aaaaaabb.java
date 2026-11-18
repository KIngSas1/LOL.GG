package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum q2997348aa27a422480aea29cbfd800b1aaaaaabb {
   private static final Object[] aab;
   public static final q2997348aa27a422480aea29cbfd800b1aaaaaabb a;
   private static final q2997348aa27a422480aea29cbfd800b1aaaaaabb[] aa;
   private static final int[] bb;
   private static final String[] aaa;
   private final q2997348aa27a422480aea29cbfd800b1babba ab;
   public static final q2997348aa27a422480aea29cbfd800b1aaaaaabb b;
   public static final q2997348aa27a422480aea29cbfd800b1aaaaaabb ba;

   public String toString() {
      return this.ab.bba();
   }

   private static q2997348aa27a422480aea29cbfd800b1aaaaaabb[] a() {
      return new q2997348aa27a422480aea29cbfd800b1aaaaaabb[]{b, a, ba};
   }

   private static String aa(char var0, int var1, char var2) {
      int var3 = var0 ^ 31502;
      char[] var4 = aaa[var3].toCharArray();
      StackTraceElement[] var5 = (StackTraceElement[])aab[var3];
      StackTraceElement[] var6;
      if (var5 != null) {
         var6 = var5;
      } else {
         var6 = (new Throwable()).getStackTrace();
         aab[var3] = var6;
      }

      StackTraceElement var7 = var6[1];
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 20763;
      int var9 = 0;

      do {
         int var10 = var4[var9] - 15065;
         var10 ^= 27960;
         var10 += 57431;
         var10 += 8300;
         var10 ^= 33975;
         var10 -= 4797;
         var10 -= 40883;
         var10 -= 15181;
         var10 += 39590;
         var10 ^= 32997;
         var4[var9] = (char)(var10 ^ var8 ^ var2 ^ var1 >> 16);
         ++var9;
      } while(var9 < var4.length);

      return (new String(var4)).intern();
   }

   private static int b(int var0, int var1) {
      int var2 = bb[var0 ^ 996215109] ^ var1 ^ var0;
      var2 += 2220;
      var2 ^= 60322;
      var2 -= 46292;
      var2 += 29450;
      var2 ^= 9397;
      var2 ^= 28670;
      var2 -= 2137;
      var2 += 16565;
      var2 += 57270;
      var2 -= 36813;
      return var2;
   }

   static {
      // $FF: Couldn't be decompiled
   }

   private q2997348aa27a422480aea29cbfd800b1aaaaaabb(q2997348aa27a422480aea29cbfd800b1babba var3) {
      this.ab = var3;
   }
}
