package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum q2997348aa27a422480aea29cbfd800b1abaabaaba {
   private static final int[] bb;
   private static final q2997348aa27a422480aea29cbfd800b1abaabaaba[] a;
   private final q2997348aa27a422480aea29cbfd800b1babba aa;
   private static final String[] aaa;
   public static final q2997348aa27a422480aea29cbfd800b1abaabaaba b;
   public static final q2997348aa27a422480aea29cbfd800b1abaabaaba ab;
   private static final Object[] aab;
   public static final q2997348aa27a422480aea29cbfd800b1abaabaaba ba;

   private static int b(int var0, int var1) {
      int var2 = bb[var0 ^ 211407040] ^ var1 ^ var0;
      var2 -= 62390;
      var2 ^= 31292;
      var2 -= 54249;
      var2 ^= 22410;
      var2 += 28620;
      var2 ^= 6780;
      var2 -= 17291;
      var2 ^= 18628;
      var2 ^= 65239;
      var2 += 57635;
      return var2;
   }

   private q2997348aa27a422480aea29cbfd800b1abaabaaba(q2997348aa27a422480aea29cbfd800b1babba var3) {
      this.aa = var3;
   }

   private static q2997348aa27a422480aea29cbfd800b1abaabaaba[] a() {
      return new q2997348aa27a422480aea29cbfd800b1abaabaaba[]{ab, ba, b};
   }

   public String toString() {
      return this.aa.bba();
   }

   private static String aa(char var0, int var1, char var2) {
      int var3 = var2 ^ 31801;
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
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 27589;
      int var9 = 0;

      do {
         int var10 = var4[var9] ^ '\udc1c';
         var10 += 1084;
         var10 ^= 26976;
         var10 ^= 56806;
         var10 ^= 22333;
         var10 += 43278;
         var10 -= 11310;
         var4[var9] = (char)(var10 ^ var8 ^ var0 ^ var1 >> 16);
         ++var9;
      } while(var9 < var4.length);

      return (new String(var4)).intern();
   }

   static {
      // $FF: Couldn't be decompiled
   }
}
