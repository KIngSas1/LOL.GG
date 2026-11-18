package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum q2997348aa27a422480aea29cbfd800b1aababab {
   private static final Object[] aaa;
   private static final String[] bb;
   public static final q2997348aa27a422480aea29cbfd800b1aababab a;
   private static final int[] ba;
   public static final q2997348aa27a422480aea29cbfd800b1aababab aa;
   private final q2997348aa27a422480aea29cbfd800b1babba ab;
   private static final q2997348aa27a422480aea29cbfd800b1aababab[] b;

   private static String aa(int var0, char var1, char var2) {
      int var3 = var1 ^ '췝';
      char[] var4 = bb[var3].toCharArray();
      StackTraceElement[] var5 = (StackTraceElement[])aaa[var3];
      StackTraceElement[] var6;
      if (var5 != null) {
         var6 = var5;
      } else {
         var6 = (new Throwable()).getStackTrace();
         aaa[var3] = var6;
      }

      StackTraceElement var7 = var6[1];
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 14934;
      int var9 = 0;

      do {
         int var10 = var4[var9] ^ '튡';
         var10 ^= 38421;
         var10 += 26142;
         var10 -= 40840;
         var10 += 54076;
         var10 ^= 53923;
         var10 ^= 37055;
         var4[var9] = (char)(var10 ^ var8 ^ var2 ^ var0 >> 16);
         ++var9;
      } while(var9 < var4.length);

      return (new String(var4)).intern();
   }

   static {
      // $FF: Couldn't be decompiled
   }

   public String toString() {
      return this.ab.bba();
   }

   private static int b(int var0, int var1) {
      int var2 = ba[var0 ^ 1947315844] ^ var1 ^ var0;
      var2 ^= 32400;
      var2 -= 1213;
      var2 -= 35020;
      var2 += 11246;
      var2 += 56938;
      var2 += 7157;
      var2 += 61076;
      var2 -= 39515;
      var2 += 53269;
      return var2;
   }

   private q2997348aa27a422480aea29cbfd800b1aababab(q2997348aa27a422480aea29cbfd800b1babba var3) {
      this.ab = var3;
   }

   private static q2997348aa27a422480aea29cbfd800b1aababab[] a() {
      return new q2997348aa27a422480aea29cbfd800b1aababab[]{a, aa};
   }
}
