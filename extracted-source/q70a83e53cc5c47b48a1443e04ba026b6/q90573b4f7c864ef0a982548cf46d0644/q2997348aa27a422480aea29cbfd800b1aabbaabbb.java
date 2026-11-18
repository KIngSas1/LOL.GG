package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum q2997348aa27a422480aea29cbfd800b1aabbaabbb {
   private static final String[] bb;
   private static final Object[] aaa;
   public static final q2997348aa27a422480aea29cbfd800b1aabbaabbb a;
   private static final int[] ba;
   private final q2997348aa27a422480aea29cbfd800b1babba aa;
   private static final q2997348aa27a422480aea29cbfd800b1aabbaabbb[] b;
   public static final q2997348aa27a422480aea29cbfd800b1aabbaabbb ab;

   private static int b(int var0, int var1) {
      int var2 = ba[var0 ^ -1643590533] ^ var1 ^ var0;
      var2 += 38220;
      var2 -= 38754;
      var2 -= 61194;
      var2 ^= 8752;
      var2 ^= 62998;
      var2 -= 36489;
      var2 ^= 32647;
      var2 += 7735;
      var2 += 9353;
      return var2;
   }

   private q2997348aa27a422480aea29cbfd800b1aabbaabbb(q2997348aa27a422480aea29cbfd800b1babba var3) {
      this.aa = var3;
   }

   private static q2997348aa27a422480aea29cbfd800b1aabbaabbb[] a() {
      return new q2997348aa27a422480aea29cbfd800b1aabbaabbb[]{a, ab};
   }

   static {
      // $FF: Couldn't be decompiled
   }

   private static String aa(char var0, int var1, int var2) {
      int var3 = var0 ^ 'ꚢ';
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
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 22380;
      int var9 = 0;

      do {
         int var10 = var4[var9] + '\udf39';
         var10 += 7065;
         var10 -= 51785;
         var10 += 41434;
         var10 += 52098;
         var10 -= 2836;
         var10 ^= 28641;
         var4[var9] = (char)(var10 ^ var8 ^ var2 ^ var1 >> 16);
         ++var9;
      } while(var9 < var4.length);

      return (new String(var4)).intern();
   }

   public String toString() {
      return this.aa.bba();
   }
}
