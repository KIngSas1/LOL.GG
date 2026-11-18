package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum q2997348aa27a422480aea29cbfd800b1bbbabbab {
   public static final q2997348aa27a422480aea29cbfd800b1bbbabbab a;
   private static final String[] bb;
   private static final q2997348aa27a422480aea29cbfd800b1bbbabbab[] aa;
   public static final q2997348aa27a422480aea29cbfd800b1bbbabbab ab;
   private static final Object[] aaa;
   private static final int[] b;
   private final q2997348aa27a422480aea29cbfd800b1babba ba;

   private static String aa(short var0, int var1, int var2) {
      int var3 = var2 ^ 27044;
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
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 17124;
      int var9 = 0;

      do {
         int var10 = var4[var9] - '\ud854';
         var10 ^= 59855;
         var10 -= 9728;
         var10 ^= 15109;
         var10 += 36820;
         var10 ^= 43956;
         var10 += 37044;
         var4[var9] = (char)(var10 ^ var8 ^ var0 ^ var1 >> 16);
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

   private static q2997348aa27a422480aea29cbfd800b1bbbabbab[] a() {
      return new q2997348aa27a422480aea29cbfd800b1bbbabbab[]{a, ab};
   }

   private static int b(int var0, int var1) {
      int var2 = b[var0 ^ 402568072] ^ var1 ^ var0;
      var2 += 57444;
      var2 -= 11544;
      var2 -= 1553;
      var2 ^= 11178;
      var2 += 47556;
      var2 ^= 868;
      var2 ^= 57693;
      var2 ^= 42564;
      return var2;
   }

   private q2997348aa27a422480aea29cbfd800b1bbbabbab(q2997348aa27a422480aea29cbfd800b1babba var3) {
      this.ba = var3;
   }
}
