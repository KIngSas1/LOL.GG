package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
enum q2997348aa27a422480aea29cbfd800b1ababbaabb {
   private final q2997348aa27a422480aea29cbfd800b1babba a;
   public static final q2997348aa27a422480aea29cbfd800b1ababbaabb b;
   private static final q2997348aa27a422480aea29cbfd800b1ababbaabb[] aa;
   private static final Object[] aaa;
   private static final int[] ba;
   public static final q2997348aa27a422480aea29cbfd800b1ababbaabb ab;
   private static final String[] bb;

   private static String ab(short var0, int var1, int var2) {
      int var7 = var1 ^ -1510345067;
      char[] var6 = bb[var7].toCharArray();
      StackTraceElement[] var8 = (StackTraceElement[])aaa[var7];
      StackTraceElement[] var9;
      if (var8 != null) {
         var9 = var8;
      } else {
         var9 = (new Throwable()).getStackTrace();
         aaa[var7] = var9;
      }

      StackTraceElement var10 = var9[1];
      int var4 = (var10.getClassName().hashCode() ^ var10.getMethodName().hashCode()) >> 16 ^ '폈';

      for(int var5 = 0; var5 < var6.length; ++var5) {
         var6[var5] = (char)(var6[var5] ^ var5 ^ var2 ^ var0 ^ var4 ^ var1);
      }

      return (new String(var6)).intern();
   }

   private static int b(int var0, int var1) {
      int var2 = ba[var0 ^ -102426978] ^ var1 ^ var0;
      var2 += 4158;
      var2 += 39204;
      var2 -= 36694;
      var2 ^= 12419;
      var2 -= 2680;
      var2 += 63799;
      var2 -= 53994;
      var2 += 4741;
      return var2;
   }

   private static q2997348aa27a422480aea29cbfd800b1ababbaabb[] a() {
      return new q2997348aa27a422480aea29cbfd800b1ababbaabb[]{ab, b};
   }

   private q2997348aa27a422480aea29cbfd800b1ababbaabb(q2997348aa27a422480aea29cbfd800b1babba var3) {
      this.a = var3;
   }

   static {
      // $FF: Couldn't be decompiled
   }

   public String toString() {
      return this.a.bba();
   }

   public static q2997348aa27a422480aea29cbfd800b1ababbaabb aa(String var0) {
      return (q2997348aa27a422480aea29cbfd800b1ababbaabb)Enum.valueOf(q2997348aa27a422480aea29cbfd800b1ababbaabb.class, var0);
   }
}
