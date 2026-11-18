package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum q2997348aa27a422480aea29cbfd800b1aababbaaa {
   public static final q2997348aa27a422480aea29cbfd800b1aababbaaa a;
   private final q2997348aa27a422480aea29cbfd800b1babba aa;
   private static final Object[] aaa;
   private static final q2997348aa27a422480aea29cbfd800b1aababbaaa[] b;
   private static final String[] bb;
   private static final int[] ba;
   public static final q2997348aa27a422480aea29cbfd800b1aababbaaa ab;

   static {
      // $FF: Couldn't be decompiled
   }

   public q2997348aa27a422480aea29cbfd800b1babba a() {
      return this.aa;
   }

   private static q2997348aa27a422480aea29cbfd800b1aababbaaa[] b() {
      return new q2997348aa27a422480aea29cbfd800b1aababbaaa[]{ab, a};
   }

   private static int aa(int var0, int var1) {
      int var2 = ba[var0 ^ -568394285] ^ var1 ^ var0;
      var2 -= 30127;
      var2 ^= 58740;
      var2 ^= 34091;
      var2 += 36023;
      var2 -= 53324;
      var2 ^= 63651;
      var2 ^= 28736;
      var2 += 5783;
      var2 ^= 42481;
      var2 -= 14963;
      return var2;
   }

   private q2997348aa27a422480aea29cbfd800b1aababbaaa(q2997348aa27a422480aea29cbfd800b1babba var3) {
      this.aa = var3;
   }

   private static String ab(short var0, short var1, int var2, byte var3, short var4) {
      int var9 = var2 ^ -1402747255;
      char[] var8 = bb[var9].toCharArray();
      StackTraceElement[] var10 = (StackTraceElement[])aaa[var9];
      StackTraceElement[] var11;
      if (var10 != null) {
         var11 = var10;
      } else {
         var11 = (new Throwable()).getStackTrace();
         aaa[var9] = var11;
      }

      StackTraceElement var12 = var11[1];
      int var6 = (var12.getClassName().hashCode() ^ var12.getMethodName().hashCode()) >> 16 ^ '쀲';
      int var7 = 0;

      do {
         var8[var7] = (char)(var8[var7] ^ var7 ^ '\ud80f' ^ var3 ^ var1 ^ var4 ^ var2 ^ var0 ^ var6);
         ++var7;
      } while(var7 < var8.length);

      return (new String(var8)).intern();
   }

   public String toString() {
      return this.aa.bba();
   }
}
