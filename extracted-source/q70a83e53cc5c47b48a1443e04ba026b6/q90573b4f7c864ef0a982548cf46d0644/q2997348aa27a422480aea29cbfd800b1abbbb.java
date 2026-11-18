package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum q2997348aa27a422480aea29cbfd800b1abbbb {
   private static final Object[] aab;
   public static final q2997348aa27a422480aea29cbfd800b1abbbb a;
   public static final q2997348aa27a422480aea29cbfd800b1abbbb aa;
   private static final String[] aaa;
   private static final int[] b;
   private static final q2997348aa27a422480aea29cbfd800b1abbbb[] ab;
   public static final q2997348aa27a422480aea29cbfd800b1abbbb ba;
   private final q2997348aa27a422480aea29cbfd800b1babba bb;

   public q2997348aa27a422480aea29cbfd800b1babba a() {
      return this.bb;
   }

   private static int ab(int var0, int var1) {
      int var2 = b[var0 ^ 1556595965] ^ var1 ^ var0;
      var2 -= 59541;
      var2 += 16361;
      var2 -= 42685;
      var2 ^= 58266;
      var2 ^= 39677;
      var2 += 6272;
      var2 -= 50739;
      var2 -= 16549;
      var2 += 14318;
      var2 ^= 30044;
      return var2;
   }

   public String toString() {
      return this.bb.bba();
   }

   static {
      // $FF: Couldn't be decompiled
   }

   public static q2997348aa27a422480aea29cbfd800b1abbbb aa(String var0) {
      return (q2997348aa27a422480aea29cbfd800b1abbbb)Enum.valueOf(q2997348aa27a422480aea29cbfd800b1abbbb.class, var0);
   }

   private static String ba(int var0, int var1, int var2) {
      int var3 = var1 ^ '贵';
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
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 24246;
      int var9 = 0;

      do {
         int var10 = var4[var9] + 'ꈏ';
         var10 += 19861;
         var10 ^= 27239;
         var10 ^= 45353;
         var10 ^= 37430;
         var10 -= 62414;
         var10 ^= 61089;
         var4[var9] = (char)(var10 ^ var8 ^ var2 ^ var0 >> 16);
         ++var9;
      } while(var9 < var4.length);

      return (new String(var4)).intern();
   }

   private q2997348aa27a422480aea29cbfd800b1abbbb(q2997348aa27a422480aea29cbfd800b1babba var3) {
      this.bb = var3;
   }

   private static q2997348aa27a422480aea29cbfd800b1abbbb[] b() {
      return new q2997348aa27a422480aea29cbfd800b1abbbb[]{ba, a, aa};
   }
}
