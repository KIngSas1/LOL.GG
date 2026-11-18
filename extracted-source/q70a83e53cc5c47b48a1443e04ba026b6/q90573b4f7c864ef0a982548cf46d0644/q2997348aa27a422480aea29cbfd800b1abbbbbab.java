package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum q2997348aa27a422480aea29cbfd800b1abbbbbab implements q2997348aa27a422480aea29cbfd800b1aabbbabab {
   public static final q2997348aa27a422480aea29cbfd800b1abbbbbab a;
   public static final q2997348aa27a422480aea29cbfd800b1abbbbbab aa;
   private static final int[] bb;
   private static final Object[] aab;
   private static final q2997348aa27a422480aea29cbfd800b1abbbbbab[] ab;
   private final q2997348aa27a422480aea29cbfd800b1babba ba;
   private static final String[] aaa;
   public static final q2997348aa27a422480aea29cbfd800b1abbbbbab b;

   private static int a(int var0, int var1) {
      int var2 = bb[var0 ^ -1445685063] ^ var1 ^ var0;
      var2 += 31737;
      var2 ^= 1467;
      var2 += 31153;
      var2 ^= 57874;
      var2 += 4363;
      var2 += 10612;
      var2 -= 34077;
      var2 ^= 10245;
      return var2;
   }

   static {
      // $FF: Couldn't be decompiled
   }

   private static q2997348aa27a422480aea29cbfd800b1abbbbbab[] b() {
      return new q2997348aa27a422480aea29cbfd800b1abbbbbab[]{b, a, aa};
   }

   private static String aa(short var0, int var1, char var2) {
      int var3 = var2 ^ 11468;
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
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 21525;
      int var9 = 0;

      do {
         int var10 = var4[var9] - '镫';
         var10 += 18345;
         var10 += 6466;
         var10 ^= 11528;
         var10 ^= 48078;
         var10 ^= 24816;
         var10 += 26701;
         var10 ^= 55387;
         var10 ^= 32457;
         var4[var9] = (char)(var10 ^ var8 ^ var0 ^ var1 >> 16);
         ++var9;
      } while(var9 < var4.length);

      return (new String(var4)).intern();
   }

   public String toString() {
      return this.ba.bba();
   }

   private q2997348aa27a422480aea29cbfd800b1abbbbbab(q2997348aa27a422480aea29cbfd800b1babba var3) {
      this.ba = var3;
   }
}
