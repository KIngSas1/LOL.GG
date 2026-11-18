package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
enum q2997348aa27a422480aea29cbfd800b1aabaaabbb {
   private static final int[] ba;
   private static final String[] bb;
   public static final q2997348aa27a422480aea29cbfd800b1aabaaabbb a;
   public static final q2997348aa27a422480aea29cbfd800b1aabaaabbb aa;
   private static final Object[] aaa;
   private final q2997348aa27a422480aea29cbfd800b1babba ab;
   private static final q2997348aa27a422480aea29cbfd800b1aabaaabbb[] b;

   private static int b(int var0, int var1) {
      int var2 = ba[var0 ^ 934519189] ^ var1 ^ var0;
      var2 += 60543;
      var2 -= 30318;
      var2 -= 56610;
      var2 += 23958;
      var2 -= 5210;
      var2 -= 58280;
      var2 ^= 62446;
      var2 += 63179;
      return var2;
   }

   public static q2997348aa27a422480aea29cbfd800b1aabaaabbb a(String var0) {
      return (q2997348aa27a422480aea29cbfd800b1aabaaabbb)Enum.valueOf(q2997348aa27a422480aea29cbfd800b1aabaaabbb.class, var0);
   }

   private q2997348aa27a422480aea29cbfd800b1aabaaabbb(q2997348aa27a422480aea29cbfd800b1babba var3) {
      this.ab = var3;
   }

   private static q2997348aa27a422480aea29cbfd800b1aabaaabbb[] aa() {
      return new q2997348aa27a422480aea29cbfd800b1aabaaabbb[]{aa, a};
   }

   static {
      // $FF: Couldn't be decompiled
   }

   public String toString() {
      return this.ab.bba();
   }

   private static String ab(char var0, char var1, int var2) {
      int var3 = var0 ^ '쑑';
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
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 10715;
      int var9 = 0;

      do {
         int var10 = var4[var9] + '\ue430';
         var10 -= 59648;
         var10 ^= 15962;
         var10 += 27527;
         var4[var9] = (char)(var10 ^ var8 ^ var1 ^ var2 >> 16);
         ++var9;
      } while(var9 < var4.length);

      return (new String(var4)).intern();
   }
}
