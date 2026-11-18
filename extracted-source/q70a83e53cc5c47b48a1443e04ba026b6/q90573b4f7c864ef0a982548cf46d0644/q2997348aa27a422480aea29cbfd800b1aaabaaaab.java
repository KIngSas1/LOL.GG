package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum q2997348aa27a422480aea29cbfd800b1aaabaaaab {
   private static final Object[] aba;
   private final q2997348aa27a422480aea29cbfd800b1babba a;
   public static final q2997348aa27a422480aea29cbfd800b1aaabaaaab b;
   private static final int[] aaa;
   private static final String[] aab;
   public static final q2997348aa27a422480aea29cbfd800b1aaabaaaab aa;
   private static final q2997348aa27a422480aea29cbfd800b1aaabaaaab[] ab;
   public static final q2997348aa27a422480aea29cbfd800b1aaabaaaab ba;
   public static final q2997348aa27a422480aea29cbfd800b1aaabaaaab bb;

   private static int b(int var0, int var1) {
      int var2 = aaa[var0 ^ 2000211811] ^ var1 ^ var0;
      var2 += 5580;
      var2 -= 44542;
      var2 += 64773;
      var2 += 15630;
      var2 -= 47548;
      var2 += 56247;
      var2 ^= 46994;
      return var2;
   }

   public String toString() {
      return this.a.bba();
   }

   static {
      // $FF: Couldn't be decompiled
   }

   private static q2997348aa27a422480aea29cbfd800b1aaabaaaab[] a() {
      return new q2997348aa27a422480aea29cbfd800b1aaabaaaab[]{bb, ba, aa, b};
   }

   private q2997348aa27a422480aea29cbfd800b1aaabaaaab(q2997348aa27a422480aea29cbfd800b1babba var3) {
      this.a = var3;
   }

   private static String aa(int var0, short var1, int var2) {
      int var3 = var2 ^ 'ꢦ';
      char[] var4 = aab[var3].toCharArray();
      StackTraceElement[] var5 = (StackTraceElement[])aba[var3];
      StackTraceElement[] var6;
      if (var5 != null) {
         var6 = var5;
      } else {
         var6 = (new Throwable()).getStackTrace();
         aba[var3] = var6;
      }

      StackTraceElement var7 = var6[1];
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 22549;
      int var9 = 0;

      do {
         int var10 = var4[var9] ^ 1261;
         var10 -= 55859;
         var10 -= 34530;
         var10 -= 65448;
         var10 ^= 5821;
         var10 -= 59113;
         var4[var9] = (char)(var10 ^ var8 ^ var1 ^ var0 >> 16);
         ++var9;
      } while(var9 < var4.length);

      return (new String(var4)).intern();
   }
}
