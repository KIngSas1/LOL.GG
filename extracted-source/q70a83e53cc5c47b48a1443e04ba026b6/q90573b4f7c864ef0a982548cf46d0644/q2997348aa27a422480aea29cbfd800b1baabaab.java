package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
enum q2997348aa27a422480aea29cbfd800b1baabaab implements q2997348aa27a422480aea29cbfd800b1aabbbabab {
   private static final int[] ba;
   private static final String[] bb;
   private static final Object[] aaa;
   public static final q2997348aa27a422480aea29cbfd800b1baabaab a;
   public static final q2997348aa27a422480aea29cbfd800b1baabaab aa;
   private final q2997348aa27a422480aea29cbfd800b1babba ab;
   private static final q2997348aa27a422480aea29cbfd800b1baabaab[] b;

   public String toString() {
      return this.ab.bba();
   }

   private q2997348aa27a422480aea29cbfd800b1baabaab(q2997348aa27a422480aea29cbfd800b1babba var3) {
      this.ab = var3;
   }

   private static q2997348aa27a422480aea29cbfd800b1baabaab[] b() {
      return new q2997348aa27a422480aea29cbfd800b1baabaab[]{a, aa};
   }

   private static String aa(int var0, char var1, char var2) {
      int var3 = var2 ^ 1182;
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
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 10481;
      int var9 = 0;

      do {
         int var10 = var4[var9] - 20262;
         var10 -= 63575;
         var10 ^= 41033;
         var10 -= 5554;
         var10 -= 10333;
         var10 ^= 33269;
         var10 -= 58765;
         var10 ^= 20258;
         var10 -= 61612;
         var4[var9] = (char)(var10 ^ var8 ^ var1 ^ var0 >> 16);
         ++var9;
      } while(var9 < var4.length);

      return (new String(var4)).intern();
   }

   private static int a(int var0, int var1) {
      int var2 = ba[var0 ^ 200271097] ^ var1 ^ var0;
      var2 ^= 45451;
      var2 += 10632;
      var2 += 44761;
      var2 ^= 19439;
      var2 ^= 2628;
      var2 -= 24555;
      var2 += 24769;
      var2 -= 14299;
      return var2;
   }

   static {
      // $FF: Couldn't be decompiled
   }
}
