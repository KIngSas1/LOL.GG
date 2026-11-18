package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
enum q2997348aa27a422480aea29cbfd800b1abaaaabab {
   private static final Object[] aab;
   private final q2997348aa27a422480aea29cbfd800b1babba a;
   public static final q2997348aa27a422480aea29cbfd800b1abaaaabab b;
   private static final String[] aaa;
   public static final q2997348aa27a422480aea29cbfd800b1abaaaabab aa;
   public static final q2997348aa27a422480aea29cbfd800b1abaaaabab ab;
   private static final int[] bb;
   private static final q2997348aa27a422480aea29cbfd800b1abaaaabab[] ba;

   private static int b(int var0, int var1) {
      int var2 = bb[var0 ^ 1786868861] ^ var1 ^ var0;
      var2 -= 3860;
      var2 -= 45412;
      var2 ^= 51130;
      var2 ^= 57459;
      var2 -= 42992;
      var2 += 29382;
      var2 += 50034;
      return var2;
   }

   static {
      // $FF: Couldn't be decompiled
   }

   public static q2997348aa27a422480aea29cbfd800b1abaaaabab a(String var0) {
      return (q2997348aa27a422480aea29cbfd800b1abaaaabab)Enum.valueOf(q2997348aa27a422480aea29cbfd800b1abaaaabab.class, var0);
   }

   private q2997348aa27a422480aea29cbfd800b1abaaaabab(q2997348aa27a422480aea29cbfd800b1babba var3) {
      this.a = var3;
   }

   private static String ab(int var0, char var1, short var2) {
      int var3 = var1 ^ '\uf126';
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
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 4686;
      int var9 = 0;

      do {
         int var10 = var4[var9] - 1161;
         var10 += 38232;
         var10 += 30968;
         var10 -= 35193;
         var10 ^= 15821;
         var10 -= 49356;
         var10 += 8524;
         var10 += 59082;
         var10 += 13895;
         var4[var9] = (char)(var10 ^ var8 ^ var2 ^ var0 >> 16);
         ++var9;
      } while(var9 < var4.length);

      return (new String(var4)).intern();
   }

   private static q2997348aa27a422480aea29cbfd800b1abaaaabab[] aa() {
      return new q2997348aa27a422480aea29cbfd800b1abaaaabab[]{aa, ab, b};
   }

   public String toString() {
      return this.a.bba();
   }
}
