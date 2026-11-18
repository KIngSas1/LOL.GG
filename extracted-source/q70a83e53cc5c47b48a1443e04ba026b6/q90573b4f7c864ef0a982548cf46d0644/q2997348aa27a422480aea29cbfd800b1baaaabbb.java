package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum q2997348aa27a422480aea29cbfd800b1baaaabbb {
   private static final String[] bb;
   private static final Object[] aaa;
   private static final q2997348aa27a422480aea29cbfd800b1baaaabbb[] a;
   public static final q2997348aa27a422480aea29cbfd800b1baaaabbb aa;
   private static final int[] ba;
   private final q2997348aa27a422480aea29cbfd800b1babba ab;
   public static final q2997348aa27a422480aea29cbfd800b1baaaabbb b;

   public static q2997348aa27a422480aea29cbfd800b1baaaabbb a(String var0) {
      return (q2997348aa27a422480aea29cbfd800b1baaaabbb)Enum.valueOf(q2997348aa27a422480aea29cbfd800b1baaaabbb.class, var0);
   }

   private static String ba(int var0, int var1, int var2) {
      int var3 = var1 ^ '\ue0b7';
      char[] var4 = bb[var3].toCharArray();
      StackTraceElement[] var5 = (StackTraceElement[])aaa[var3];
      StackTraceElement[] var6;
      if (var5 != null) {
         var6 = var5;
      } else {
         var6 = (new Throwable()).getStackTrace();
         aaa[var3] = var6;
      }

      StackTraceElement var7 = var6[1];
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 3287;
      int var9 = 0;

      do {
         int var10 = var4[var9] + 17368;
         var10 -= 44103;
         var10 -= 7694;
         var10 += 31302;
         var10 ^= 38809;
         var10 ^= 29064;
         var10 += 36932;
         var4[var9] = (char)(var10 ^ var8 ^ var2 ^ var0 >> 16);
         ++var9;
      } while(var9 < var4.length);

      return (new String(var4)).intern();
   }

   private static q2997348aa27a422480aea29cbfd800b1baaaabbb[] aa() {
      return new q2997348aa27a422480aea29cbfd800b1baaaabbb[]{aa, b};
   }

   private static int b(int var0, int var1) {
      int var2 = ba[var0 ^ 669334223] ^ var1 ^ var0;
      var2 ^= 45539;
      var2 ^= 49929;
      var2 += 20592;
      var2 ^= 51419;
      var2 ^= 29229;
      var2 ^= 62864;
      var2 -= 63090;
      var2 += 26784;
      var2 ^= 55122;
      return var2;
   }

   public q2997348aa27a422480aea29cbfd800b1babba ab() {
      return this.ab;
   }

   private q2997348aa27a422480aea29cbfd800b1baaaabbb(q2997348aa27a422480aea29cbfd800b1babba var3) {
      this.ab = var3;
   }

   static {
      // $FF: Couldn't be decompiled
   }

   public String toString() {
      return this.ab.bba();
   }
}
