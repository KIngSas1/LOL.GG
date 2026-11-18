package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum q2997348aa27a422480aea29cbfd800b1aaabbaaab {
   public static final q2997348aa27a422480aea29cbfd800b1aaabbaaab a;
   private final q2997348aa27a422480aea29cbfd800b1babba aa;
   public static final q2997348aa27a422480aea29cbfd800b1aaabbaaab b;
   private static final int[] bb;
   private static final Object[] aab;
   private static final String[] aaa;
   public static final q2997348aa27a422480aea29cbfd800b1aaabbaaab ab;
   private static final q2997348aa27a422480aea29cbfd800b1aaabbaaab[] ba;

   static {
      // $FF: Couldn't be decompiled
   }

   private static String aa(int var0, int var1, int var2) {
      int var7 = var1 ^ -570630588;
      char[] var6 = aaa[var7].toCharArray();
      StackTraceElement[] var8 = (StackTraceElement[])aab[var7];
      StackTraceElement[] var9;
      if (var8 != null) {
         var9 = var8;
      } else {
         var9 = (new Throwable()).getStackTrace();
         aab[var7] = var9;
      }

      StackTraceElement var10 = var9[1];
      int var4 = (var10.getClassName().hashCode() ^ var10.getMethodName().hashCode()) >> 16 ^ 30746;
      int var5 = 0;

      do {
         var6[var5] = (char)(var6[var5] ^ var5 ^ var0 ^ var1 ^ var2 ^ var4);
         ++var5;
      } while(var5 < var6.length);

      return (new String(var6)).intern();
   }

   public String toString() {
      return this.aa.bba();
   }

   private q2997348aa27a422480aea29cbfd800b1aaabbaaab(q2997348aa27a422480aea29cbfd800b1babba var3) {
      this.aa = var3;
   }

   private static int b(int var0, int var1) {
      int var2 = bb[var0 ^ -1604884068] ^ var1 ^ var0;
      var2 -= 26035;
      var2 += 15004;
      var2 += 57416;
      var2 += 22761;
      var2 -= 47924;
      var2 -= 10792;
      var2 ^= 49735;
      var2 -= 7126;
      return var2;
   }

   private static q2997348aa27a422480aea29cbfd800b1aaabbaaab[] a() {
      return new q2997348aa27a422480aea29cbfd800b1aaabbaaab[]{ab, b, a};
   }
}
