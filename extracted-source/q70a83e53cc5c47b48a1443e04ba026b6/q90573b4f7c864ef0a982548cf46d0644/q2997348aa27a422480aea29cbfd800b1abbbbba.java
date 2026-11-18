package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum q2997348aa27a422480aea29cbfd800b1abbbbba {
   private final q2997348aa27a422480aea29cbfd800b1babba a;
   private static final q2997348aa27a422480aea29cbfd800b1abbbbba[] b;
   public static final q2997348aa27a422480aea29cbfd800b1abbbbba aa;
   private static final int[] bb;
   private static final String[] aaa;
   public static final q2997348aa27a422480aea29cbfd800b1abbbbba ab;
   private static final Object[] aab;
   public static final q2997348aa27a422480aea29cbfd800b1abbbbba ba;

   private static String aa(char var0, int var1, char var2) {
      int var3 = var2 ^ '턯';
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
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 2505;
      int var9 = 0;

      do {
         int var10 = var4[var9] ^ '膂';
         var10 += 63446;
         var10 -= 38761;
         var10 += 28032;
         var4[var9] = (char)(var10 ^ var8 ^ var0 ^ var1 >> 16);
         ++var9;
      } while(var9 < var4.length);

      return (new String(var4)).intern();
   }

   private q2997348aa27a422480aea29cbfd800b1abbbbba(q2997348aa27a422480aea29cbfd800b1babba var3) {
      this.a = var3;
   }

   private static int b(int var0, int var1) {
      int var2 = bb[var0 ^ 436385197] ^ var1 ^ var0;
      var2 += 38152;
      var2 ^= 59036;
      var2 -= 44386;
      var2 += 40785;
      var2 -= 18635;
      var2 ^= 38845;
      var2 -= 58354;
      var2 += 50016;
      var2 -= 56229;
      var2 += 55056;
      return var2;
   }

   private static q2997348aa27a422480aea29cbfd800b1abbbbba[] a() {
      return new q2997348aa27a422480aea29cbfd800b1abbbbba[]{aa, ba, ab};
   }

   static {
      // $FF: Couldn't be decompiled
   }

   public String toString() {
      return this.a.bba();
   }
}
