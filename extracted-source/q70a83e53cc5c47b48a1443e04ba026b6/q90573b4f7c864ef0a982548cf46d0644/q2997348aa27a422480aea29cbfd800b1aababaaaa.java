package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum q2997348aa27a422480aea29cbfd800b1aababaaaa {
   public static final q2997348aa27a422480aea29cbfd800b1aababaaaa a;
   private static final int[] b;
   private static final q2997348aa27a422480aea29cbfd800b1aababaaaa[] aa;
   private static final Object[] aaa;
   private static final String[] bb;
   public static final q2997348aa27a422480aea29cbfd800b1aababaaaa ab;
   private final q2997348aa27a422480aea29cbfd800b1babba ba;

   private static String aa(char var0, char var1, int var2) {
      int var3 = var1 ^ 19403;
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
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 13534;
      int var9 = 0;

      do {
         int var10 = var4[var9] - 9026;
         var10 += 18530;
         var10 -= 43245;
         var10 ^= 29539;
         var10 += 60700;
         var4[var9] = (char)(var10 ^ var8 ^ var0 ^ var2 >> 16);
         ++var9;
      } while(var9 < var4.length);

      return (new String(var4)).intern();
   }

   private q2997348aa27a422480aea29cbfd800b1aababaaaa(q2997348aa27a422480aea29cbfd800b1babba var3) {
      this.ba = var3;
   }

   private static int b(int var0, int var1) {
      int var2 = b[var0 ^ 1479089148] ^ var1 ^ var0;
      var2 += 33385;
      var2 -= 45451;
      var2 -= 7389;
      var2 ^= 36055;
      var2 += 42555;
      var2 += 22926;
      var2 ^= 64740;
      var2 += 21010;
      return var2;
   }

   static {
      // $FF: Couldn't be decompiled
   }

   public String toString() {
      return this.ba.bba();
   }

   private static q2997348aa27a422480aea29cbfd800b1aababaaaa[] a() {
      return new q2997348aa27a422480aea29cbfd800b1aababaaaa[]{a, ab};
   }
}
