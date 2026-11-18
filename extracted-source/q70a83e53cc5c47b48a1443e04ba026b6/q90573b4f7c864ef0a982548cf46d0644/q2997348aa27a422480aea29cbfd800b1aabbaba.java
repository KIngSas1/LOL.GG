package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum q2997348aa27a422480aea29cbfd800b1aabbaba {
   public static final q2997348aa27a422480aea29cbfd800b1aabbaba a;
   private static final Object[] aaa;
   private static final String[] bb;
   public static final q2997348aa27a422480aea29cbfd800b1aabbaba aa;
   private final q2997348aa27a422480aea29cbfd800b1babba ab;
   private static final int[] ba;
   private static final q2997348aa27a422480aea29cbfd800b1aabbaba[] b;

   private static String aa(short var0, byte var1, int var2, char var3) {
      int var8 = var2 ^ 438955050;
      char[] var7 = bb[var8].toCharArray();
      StackTraceElement[] var9 = (StackTraceElement[])aaa[var8];
      StackTraceElement[] var10;
      if (var9 != null) {
         var10 = var9;
      } else {
         var10 = (new Throwable()).getStackTrace();
         aaa[var8] = var10;
      }

      StackTraceElement var11 = var10[1];
      int var5 = (var11.getClassName().hashCode() ^ var11.getMethodName().hashCode()) >> 16 ^ '뽴';
      int var6 = 0;

      do {
         var7[var6] = (char)(var7[var6] ^ var6 ^ var5 ^ var2 ^ var3 ^ var1 ^ var0);
         ++var6;
      } while(var6 < var7.length);

      return (new String(var7)).intern();
   }

   static {
      // $FF: Couldn't be decompiled
   }

   public String toString() {
      return this.ab.bba();
   }

   private static int b(int var0, int var1) {
      int var2 = ba[var0 ^ -254060270] ^ var1 ^ var0;
      var2 ^= 10151;
      var2 ^= 46748;
      var2 ^= 40843;
      var2 -= 8491;
      var2 += 54855;
      var2 += 5794;
      return var2;
   }

   private q2997348aa27a422480aea29cbfd800b1aabbaba(q2997348aa27a422480aea29cbfd800b1babba var3) {
      this.ab = var3;
   }

   private static q2997348aa27a422480aea29cbfd800b1aabbaba[] a() {
      return new q2997348aa27a422480aea29cbfd800b1aabbaba[]{aa, a};
   }
}
