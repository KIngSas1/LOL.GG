package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum q2997348aa27a422480aea29cbfd800b1bbbaaaa {
   private final q2997348aa27a422480aea29cbfd800b1babba a;
   private static final String[] aaa;
   public static final q2997348aa27a422480aea29cbfd800b1bbbaaaa b;
   private static final Object[] aab;
   private static final int[] bb;
   public static final q2997348aa27a422480aea29cbfd800b1bbbaaaa aa;
   public static final q2997348aa27a422480aea29cbfd800b1bbbaaaa ab;
   private static final q2997348aa27a422480aea29cbfd800b1bbbaaaa[] ba;

   public String toString() {
      return this.a.bba();
   }

   private static q2997348aa27a422480aea29cbfd800b1bbbaaaa[] a() {
      return new q2997348aa27a422480aea29cbfd800b1bbbaaaa[]{ab, b, aa};
   }

   private q2997348aa27a422480aea29cbfd800b1bbbaaaa(q2997348aa27a422480aea29cbfd800b1babba var3) {
      this.a = var3;
   }

   private static String ba(char var0, int var1, int var2) {
      int var3 = var0 ^ '\ud86e';
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
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 7355;
      int var9 = 0;

      do {
         int var10 = var4[var9] - '뱈';
         var10 += 12078;
         var10 += 39104;
         var10 += 51452;
         var10 ^= 58963;
         var10 += 28219;
         var4[var9] = (char)(var10 ^ var8 ^ var1 ^ var2 >> 16);
         ++var9;
      } while(var9 < var4.length);

      return (new String(var4)).intern();
   }

   private static int b(int var0, int var1) {
      int var2 = bb[var0 ^ 659063086] ^ var1 ^ var0;
      var2 ^= 2055;
      var2 += 50465;
      var2 ^= 42911;
      var2 ^= 22054;
      var2 += 64170;
      var2 += 63786;
      var2 += 45046;
      var2 += 25491;
      var2 ^= 13098;
      var2 += 63215;
      return var2;
   }

   static {
      // $FF: Couldn't be decompiled
   }

   public q2997348aa27a422480aea29cbfd800b1babba aa() {
      return this.a;
   }

   public static q2997348aa27a422480aea29cbfd800b1bbbaaaa ab(String var0) {
      return (q2997348aa27a422480aea29cbfd800b1bbbaaaa)Enum.valueOf(q2997348aa27a422480aea29cbfd800b1bbbaaaa.class, var0);
   }
}
