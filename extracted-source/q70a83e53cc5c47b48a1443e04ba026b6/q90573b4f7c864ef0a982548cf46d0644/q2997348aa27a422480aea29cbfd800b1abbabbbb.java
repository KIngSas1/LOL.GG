package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum q2997348aa27a422480aea29cbfd800b1abbabbbb implements q2997348aa27a422480aea29cbfd800b1aabbbabab {
   public static final q2997348aa27a422480aea29cbfd800b1abbabbbb a;
   public static final q2997348aa27a422480aea29cbfd800b1abbabbbb aa;
   private static final String[] aba;
   private static final Object[] abb;
   public static final q2997348aa27a422480aea29cbfd800b1abbabbbb ab;
   private final q2997348aa27a422480aea29cbfd800b1babba ba;
   private static final int[] aab;
   public static final q2997348aa27a422480aea29cbfd800b1abbabbbb b;
   private static final q2997348aa27a422480aea29cbfd800b1abbabbbb[] bb;
   public static final q2997348aa27a422480aea29cbfd800b1abbabbbb aaa;

   static {
      // $FF: Couldn't be decompiled
   }

   public String toString() {
      return this.ba.bba();
   }

   private static String aa(int var0, short var1, int var2) {
      int var3 = var0 ^ '\ued60';
      char[] var4 = aba[var3].toCharArray();
      StackTraceElement[] var5 = (StackTraceElement[])abb[var3];
      StackTraceElement[] var6;
      if (var5 != null) {
         var6 = var5;
      } else {
         var6 = (new Throwable()).getStackTrace();
         abb[var3] = var6;
      }

      StackTraceElement var7 = var6[1];
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 25215;
      int var9 = 0;

      do {
         int var10 = var4[var9] ^ '\ue8a7';
         var10 += 27351;
         var10 -= 35829;
         var10 += 7380;
         var10 += 26030;
         var10 += 2094;
         var4[var9] = (char)(var10 ^ var8 ^ var1 ^ var2 >> 16);
         ++var9;
      } while(var9 < var4.length);

      return (new String(var4)).intern();
   }

   private static int a(int var0, int var1) {
      int var2 = aab[var0 ^ -931098422] ^ var1 ^ var0;
      var2 ^= 30175;
      var2 ^= 52094;
      var2 ^= 58771;
      var2 += 56851;
      var2 -= 48161;
      var2 += 45586;
      var2 += 52587;
      var2 += 4902;
      return var2;
   }

   private q2997348aa27a422480aea29cbfd800b1abbabbbb(q2997348aa27a422480aea29cbfd800b1babba var3) {
      this.ba = var3;
   }

   private static q2997348aa27a422480aea29cbfd800b1abbabbbb[] b() {
      return new q2997348aa27a422480aea29cbfd800b1abbabbbb[]{a, aaa, ab, b, aa};
   }
}
