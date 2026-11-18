package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
enum q2997348aa27a422480aea29cbfd800b1abbbaaaab implements q2997348aa27a422480aea29cbfd800b1aabbbabab {
   public static final q2997348aa27a422480aea29cbfd800b1abbbaaaab a;
   private final boolean aa;
   private static final int[] aaa;
   private static final Object[] aba;
   public static final q2997348aa27a422480aea29cbfd800b1abbbaaaab ab;
   private static final String[] aab;
   private final q2997348aa27a422480aea29cbfd800b1babba ba;
   private static final q2997348aa27a422480aea29cbfd800b1abbbaaaab[] b;
   public static final q2997348aa27a422480aea29cbfd800b1abbbaaaab bb;

   public static q2997348aa27a422480aea29cbfd800b1abbbaaaab aa(String var0) {
      return (q2997348aa27a422480aea29cbfd800b1abbbaaaab)Enum.valueOf(q2997348aa27a422480aea29cbfd800b1abbbaaaab.class, var0);
   }

   private static String ab(int var0, char var1, char var2) {
      int var3 = var1 ^ '覊';
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
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 21659;
      int var9 = 0;

      do {
         int var10 = var4[var9] + 23922;
         var10 ^= 34960;
         var10 += 32506;
         var10 ^= 58603;
         var10 += 61839;
         var10 += 10044;
         var10 ^= 22;
         var10 -= 49289;
         var10 ^= 26082;
         var10 -= 13687;
         var4[var9] = (char)(var10 ^ var8 ^ var2 ^ var0 >> 16);
         ++var9;
      } while(var9 < var4.length);

      return (new String(var4)).intern();
   }

   static {
      // $FF: Couldn't be decompiled
   }

   public String toString() {
      return this.ba.bba();
   }

   public Enum ba() {
      // $FF: Couldn't be decompiled
   }

   private q2997348aa27a422480aea29cbfd800b1abbbaaaab(q2997348aa27a422480aea29cbfd800b1babba var3) {
      this(var3, true);
   }

   private q2997348aa27a422480aea29cbfd800b1abbbaaaab(q2997348aa27a422480aea29cbfd800b1babba var3, boolean var4) {
      this.ba = var3;
      this.aa = var4;
   }

   private static q2997348aa27a422480aea29cbfd800b1abbbaaaab[] b() {
      return new q2997348aa27a422480aea29cbfd800b1abbbaaaab[]{bb, a, ab};
   }

   public boolean bb() {
      return this.aa;
   }

   private static int a(int var0, int var1) {
      int var2 = aaa[var0 ^ 644518535] ^ var1 ^ var0;
      var2 ^= 58372;
      var2 ^= 7707;
      var2 -= 15168;
      var2 ^= 17773;
      var2 -= 53261;
      var2 += 19853;
      var2 += 39573;
      var2 ^= 31580;
      var2 += 21227;
      return var2;
   }
}
