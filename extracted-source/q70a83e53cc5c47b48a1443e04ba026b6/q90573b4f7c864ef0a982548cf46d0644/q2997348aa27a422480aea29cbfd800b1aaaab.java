package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum q2997348aa27a422480aea29cbfd800b1aaaab {
   private static final q2997348aa27a422480aea29cbfd800b1aaaab[] a;
   private static final Object[] bb;
   private final q2997348aa27a422480aea29cbfd800b1babba aa;
   private static final int[] ab;
   public static final q2997348aa27a422480aea29cbfd800b1aaaab b;
   private static final String[] ba;

   public String toString() {
      return this.aa.bba();
   }

   static {
      // $FF: Couldn't be decompiled
   }

   private static int aa(int var0, int var1) {
      int var2 = ab[var0 ^ 2019101832] ^ var1 ^ var0;
      var2 ^= 36179;
      var2 += 2148;
      var2 += 50655;
      var2 -= 11905;
      var2 -= 14696;
      var2 -= 23042;
      var2 ^= 28822;
      var2 ^= 59727;
      var2 ^= 50013;
      return var2;
   }

   private static String ab(byte var0, short var1, int var2) {
      int var7 = var2 ^ 1413688786;
      char[] var6 = ba[var7].toCharArray();
      StackTraceElement[] var8 = (StackTraceElement[])bb[var7];
      StackTraceElement[] var9;
      if (var8 != null) {
         var9 = var8;
      } else {
         var9 = (new Throwable()).getStackTrace();
         bb[var7] = var9;
      }

      StackTraceElement var10 = var9[1];
      int var4 = (var10.getClassName().hashCode() ^ var10.getMethodName().hashCode()) >> 16 ^ '쯏';

      for(int var5 = 0; var5 < var6.length; ++var5) {
         var6[var5] = (char)(var6[var5] ^ var5 ^ var0 ^ var2 ^ var4 ^ var1);
      }

      return (new String(var6)).intern();
   }

   private q2997348aa27a422480aea29cbfd800b1aaaab(q2997348aa27a422480aea29cbfd800b1babba var3) {
      this.aa = var3;
   }

   public q2997348aa27a422480aea29cbfd800b1babba a() {
      return this.aa;
   }

   private static q2997348aa27a422480aea29cbfd800b1aaaab[] b() {
      return new q2997348aa27a422480aea29cbfd800b1aaaab[]{b};
   }
}
