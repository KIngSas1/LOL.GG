package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum q2997348aa27a422480aea29cbfd800b1baab implements q2997348aa27a422480aea29cbfd800b1aabbbabab {
   private final q2997348aa27a422480aea29cbfd800b1babba a;
   public static final q2997348aa27a422480aea29cbfd800b1baab b;
   private static final int[] bb;
   private static final Object[] aab;
   private static final q2997348aa27a422480aea29cbfd800b1baab[] aa;
   private static final String[] aaa;
   private final q2997348aa27a422480aea29cbfd800b1babba ab;
   public static final q2997348aa27a422480aea29cbfd800b1baab ba;

   private static String aba(int var0, int var1, char var2) {
      int var3 = var1 ^ '酛';
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
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 13420;
      int var9 = 0;

      do {
         int var10 = var4[var9] + '뫩';
         var10 ^= 27495;
         var10 -= 46869;
         var10 -= 53081;
         var10 += 59948;
         var4[var9] = (char)(var10 ^ var8 ^ var2 ^ var0 >> 16);
         ++var9;
      } while(var9 < var4.length);

      return (new String(var4)).intern();
   }

   static {
      // $FF: Couldn't be decompiled
   }

   public q2997348aa27a422480aea29cbfd800b1babba aa() {
      return this.ab;
   }

   public q2997348aa27a422480aea29cbfd800b1babba ab() {
      return this.a;
   }

   private static int aab(int var0, int var1) {
      int var2 = bb[var0 ^ -47363415] ^ var1 ^ var0;
      var2 -= 22391;
      var2 += 64274;
      var2 += 27020;
      var2 -= 28337;
      var2 += 43828;
      var2 += 17577;
      var2 -= 58696;
      return var2;
   }

   public String toString() {
      return this.a.bba();
   }

   private q2997348aa27a422480aea29cbfd800b1baab(q2997348aa27a422480aea29cbfd800b1babba var3, q2997348aa27a422480aea29cbfd800b1babba var4) {
      this.a = var3;
      this.ab = var4;
   }

   public static q2997348aa27a422480aea29cbfd800b1baab aaa(String var0) {
      return (q2997348aa27a422480aea29cbfd800b1baab)Enum.valueOf(q2997348aa27a422480aea29cbfd800b1baab.class, var0);
   }

   public String b() {
      return this.ab.bba();
   }

   private static q2997348aa27a422480aea29cbfd800b1baab[] a() {
      return new q2997348aa27a422480aea29cbfd800b1baab[]{b, ba};
   }
}
