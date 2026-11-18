package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum q2997348aa27a422480aea29cbfd800b1bbbabaab {
   private static final q2997348aa27a422480aea29cbfd800b1bbbabaab[] a;
   public static final q2997348aa27a422480aea29cbfd800b1bbbabaab aa;
   private static final String[] bb;
   private final q2997348aa27a422480aea29cbfd800b1babba ab;
   private static final int[] ba;
   private static final Object[] aaa;
   public static final q2997348aa27a422480aea29cbfd800b1bbbabaab b;

   static {
      // $FF: Couldn't be decompiled
   }

   public String toString() {
      return this.ab.bba();
   }

   private q2997348aa27a422480aea29cbfd800b1bbbabaab(q2997348aa27a422480aea29cbfd800b1babba var3) {
      this.ab = var3;
   }

   private static String aa(int var0, char var1, int var2) {
      int var3 = var1 ^ '\udf60';
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
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 15774;
      int var9 = 0;

      do {
         int var10 = var4[var9] + 31249;
         var10 += 4507;
         var10 -= 44016;
         var10 -= 46673;
         var4[var9] = (char)(var10 ^ var8 ^ var0 ^ var2 >> 16);
         ++var9;
      } while(var9 < var4.length);

      return (new String(var4)).intern();
   }

   private static int b(int var0, int var1) {
      int var2 = ba[var0 ^ -1758848853] ^ var1 ^ var0;
      var2 ^= 30336;
      var2 -= 39660;
      var2 ^= 14069;
      var2 += 41485;
      var2 ^= 17935;
      var2 -= 7763;
      return var2;
   }

   private static q2997348aa27a422480aea29cbfd800b1bbbabaab[] a() {
      return new q2997348aa27a422480aea29cbfd800b1bbbabaab[]{b, aa};
   }
}
