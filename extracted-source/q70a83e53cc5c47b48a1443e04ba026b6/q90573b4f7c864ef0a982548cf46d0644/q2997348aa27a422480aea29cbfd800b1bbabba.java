package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum q2997348aa27a422480aea29cbfd800b1bbabba {
   private static final String[] bb;
   private static final int[] ba;
   private static final q2997348aa27a422480aea29cbfd800b1bbabba[] a;
   private static final Object[] aaa;
   private final q2997348aa27a422480aea29cbfd800b1babba aa;
   public static final q2997348aa27a422480aea29cbfd800b1bbabba b;
   public static final q2997348aa27a422480aea29cbfd800b1bbabba ab;

   static {
      // $FF: Couldn't be decompiled
   }

   private q2997348aa27a422480aea29cbfd800b1bbabba(q2997348aa27a422480aea29cbfd800b1babba var3) {
      this.aa = var3;
   }

   private static q2997348aa27a422480aea29cbfd800b1bbabba[] a() {
      return new q2997348aa27a422480aea29cbfd800b1bbabba[]{ab, b};
   }

   private static String aa(char var0, int var1, char var2) {
      int var3 = var2 ^ 'ꋵ';
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
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 20216;
      int var9 = 0;

      do {
         int var10 = var4[var9] ^ 5739;
         var10 ^= 23404;
         var10 += 35701;
         var10 -= 57737;
         var10 -= 17419;
         var4[var9] = (char)(var10 ^ var8 ^ var0 ^ var1 >> 16);
         ++var9;
      } while(var9 < var4.length);

      return (new String(var4)).intern();
   }

   private static int b(int var0, int var1) {
      int var2 = ba[var0 ^ -1164493317] ^ var1 ^ var0;
      var2 += 15973;
      var2 ^= 26676;
      var2 -= 57727;
      var2 -= 15880;
      var2 += 63409;
      var2 ^= 14300;
      var2 -= 56043;
      var2 -= 1970;
      var2 -= 64808;
      var2 += 623;
      return var2;
   }

   public String toString() {
      return this.aa.bba();
   }
}
