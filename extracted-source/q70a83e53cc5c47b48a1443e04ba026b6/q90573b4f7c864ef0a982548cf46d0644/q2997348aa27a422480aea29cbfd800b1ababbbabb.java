package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum q2997348aa27a422480aea29cbfd800b1ababbbabb {
   private final q2997348aa27a422480aea29cbfd800b1babba a;
   private static final int[] bb;
   private static final String[] aaa;
   private static final Object[] aab;
   public static final q2997348aa27a422480aea29cbfd800b1ababbbabb b;
   private static final q2997348aa27a422480aea29cbfd800b1ababbbabb[] aa;
   public static final q2997348aa27a422480aea29cbfd800b1ababbbabb ab;
   public static final q2997348aa27a422480aea29cbfd800b1ababbbabb ba;

   public static q2997348aa27a422480aea29cbfd800b1ababbbabb a(String var0) {
      return (q2997348aa27a422480aea29cbfd800b1ababbbabb)Enum.valueOf(q2997348aa27a422480aea29cbfd800b1ababbbabb.class, var0);
   }

   public String toString() {
      return this.a.bba();
   }

   private q2997348aa27a422480aea29cbfd800b1ababbbabb(q2997348aa27a422480aea29cbfd800b1babba var3) {
      this.a = var3;
   }

   public q2997348aa27a422480aea29cbfd800b1babba aa() {
      return this.a;
   }

   private static String ba(byte var0, char var1, char var2, byte var3, int var4, char var5, int var6) {
      int var11 = var6 ^ 1611387564;
      char[] var10 = aaa[var11].toCharArray();
      StackTraceElement[] var12 = (StackTraceElement[])aab[var11];
      StackTraceElement[] var13;
      if (var12 != null) {
         var13 = var12;
      } else {
         var13 = (new Throwable()).getStackTrace();
         aab[var11] = var13;
      }

      StackTraceElement var14 = var13[1];
      int var8 = (var14.getClassName().hashCode() ^ var14.getMethodName().hashCode()) >> 16 ^ 28846;

      for(int var9 = 0; var9 < var10.length; ++var9) {
         var10[var9] = (char)(var10[var9] ^ '龿' ^ var9 ^ var5 ^ var2 ^ var3 ^ var8 ^ var0 ^ var1 ^ var4 ^ var6);
      }

      return (new String(var10)).intern();
   }

   private static int ab(int var0, int var1) {
      int var2 = bb[var0 ^ -1580183101] ^ var1 ^ var0;
      var2 ^= 13398;
      var2 += 36901;
      var2 ^= 61303;
      var2 += 52634;
      var2 ^= 6281;
      var2 ^= 33354;
      return var2;
   }

   static {
      // $FF: Couldn't be decompiled
   }

   private static q2997348aa27a422480aea29cbfd800b1ababbbabb[] b() {
      return new q2997348aa27a422480aea29cbfd800b1ababbbabb[]{b, ab, ba};
   }
}
