package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
enum q2997348aa27a422480aea29cbfd800b1baaabbba {
   final q2997348aa27a422480aea29cbfd800b1babba a;
   private static final int[] bb;
   private static final q2997348aa27a422480aea29cbfd800b1baaabbba[] b;
   private static final String[] aaa;
   private static final Object[] aab;
   public static final q2997348aa27a422480aea29cbfd800b1baaabbba aa;
   public static final q2997348aa27a422480aea29cbfd800b1baaabbba ab;
   final q2997348aa27a422480aea29cbfd800b1babba ba;

   private static int b(int var0, int var1) {
      int var2 = bb[var0 ^ -1666586280] ^ var1 ^ var0;
      var2 += 45670;
      var2 ^= 31772;
      var2 -= 4094;
      var2 += 59539;
      var2 += 46043;
      var2 -= 46523;
      var2 -= 34830;
      var2 ^= 61230;
      var2 ^= 14191;
      var2 += 29771;
      return var2;
   }

   private static String aa(char var0, int var1, short var2) {
      int var3 = var0 ^ '莽';
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
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 6446;
      int var9 = 0;

      do {
         int var10 = var4[var9] ^ '묭';
         var10 ^= 60192;
         var10 ^= 47313;
         var10 -= 18476;
         var10 += 36671;
         var10 -= 44433;
         var10 -= 62954;
         var4[var9] = (char)(var10 ^ var8 ^ var2 ^ var1 >> 16);
         ++var9;
      } while(var9 < var4.length);

      return (new String(var4)).intern();
   }

   private static q2997348aa27a422480aea29cbfd800b1baaabbba[] a() {
      return new q2997348aa27a422480aea29cbfd800b1baaabbba[]{ab, aa};
   }

   static {
      // $FF: Couldn't be decompiled
   }

   private q2997348aa27a422480aea29cbfd800b1baaabbba(q2997348aa27a422480aea29cbfd800b1babba var3, q2997348aa27a422480aea29cbfd800b1babba var4) {
      this.a = var3;
      this.ba = var4;
   }
}
