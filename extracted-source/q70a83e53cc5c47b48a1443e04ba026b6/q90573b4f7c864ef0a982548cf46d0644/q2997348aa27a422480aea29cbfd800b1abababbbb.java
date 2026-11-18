package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum q2997348aa27a422480aea29cbfd800b1abababbbb {
   private final q2997348aa27a422480aea29cbfd800b1babba a;
   private static final Object[] aaa;
   public static final q2997348aa27a422480aea29cbfd800b1abababbbb b;
   public static final q2997348aa27a422480aea29cbfd800b1abababbbb aa;
   private static final int[] ba;
   private static final q2997348aa27a422480aea29cbfd800b1abababbbb[] ab;
   private static final String[] bb;

   static {
      // $FF: Couldn't be decompiled
   }

   private static String ab(int var0, short var1, char var2) {
      int var3 = var2 ^ 5043;
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
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 23497;
      int var9 = 0;

      do {
         int var10 = var4[var9] ^ '蝵';
         var10 ^= 17529;
         var10 += 58707;
         var10 -= 40793;
         var10 += 5977;
         var4[var9] = (char)(var10 ^ var8 ^ var1 ^ var0 >> 16);
         ++var9;
      } while(var9 < var4.length);

      return (new String(var4)).intern();
   }

   public static q2997348aa27a422480aea29cbfd800b1abababbbb a(String var0) {
      return (q2997348aa27a422480aea29cbfd800b1abababbbb)Enum.valueOf(q2997348aa27a422480aea29cbfd800b1abababbbb.class, var0);
   }

   private static q2997348aa27a422480aea29cbfd800b1abababbbb[] aa() {
      return new q2997348aa27a422480aea29cbfd800b1abababbbb[]{aa, b};
   }

   public String toString() {
      return this.a.bba();
   }

   private q2997348aa27a422480aea29cbfd800b1abababbbb(q2997348aa27a422480aea29cbfd800b1babba var3) {
      this.a = var3;
   }

   private static int b(int var0, int var1) {
      int var2 = ba[var0 ^ -1032315414] ^ var1 ^ var0;
      var2 += 50233;
      var2 -= 22861;
      var2 ^= 63750;
      var2 ^= 37084;
      var2 += 64863;
      var2 += 38079;
      var2 ^= 12446;
      return var2;
   }
}
