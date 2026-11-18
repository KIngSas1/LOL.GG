package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
enum q2997348aa27a422480aea29cbfd800b1ababbb {
   private final q2997348aa27a422480aea29cbfd800b1babba a;
   private static final int[] ba;
   private static final Object[] aaa;
   public static final q2997348aa27a422480aea29cbfd800b1ababbb b;
   private static final q2997348aa27a422480aea29cbfd800b1ababbb[] aa;
   private static final String[] bb;
   public static final q2997348aa27a422480aea29cbfd800b1ababbb ab;

   public static q2997348aa27a422480aea29cbfd800b1ababbb a(String var0) {
      return (q2997348aa27a422480aea29cbfd800b1ababbb)Enum.valueOf(q2997348aa27a422480aea29cbfd800b1ababbb.class, var0);
   }

   private q2997348aa27a422480aea29cbfd800b1ababbb(q2997348aa27a422480aea29cbfd800b1babba var3) {
      this.a = var3;
   }

   private static q2997348aa27a422480aea29cbfd800b1ababbb[] aa() {
      return new q2997348aa27a422480aea29cbfd800b1ababbb[]{ab, b};
   }

   static {
      // $FF: Couldn't be decompiled
   }

   private static int b(int var0, int var1) {
      int var2 = ba[var0 ^ 1918203794] ^ var1 ^ var0;
      var2 -= 8049;
      var2 -= 22512;
      var2 -= 16486;
      var2 ^= 43467;
      var2 += 31265;
      var2 -= 14624;
      var2 -= 28303;
      var2 += 7859;
      var2 -= 45658;
      var2 ^= 50803;
      return var2;
   }

   private static String ab(int var0, short var1, int var2, int var3, char var4) {
      int var9 = var2 ^ 1054374664;
      char[] var8 = bb[var9].toCharArray();
      StackTraceElement[] var10 = (StackTraceElement[])aaa[var9];
      StackTraceElement[] var11;
      if (var10 != null) {
         var11 = var10;
      } else {
         var11 = (new Throwable()).getStackTrace();
         aaa[var9] = var11;
      }

      StackTraceElement var12 = var11[1];
      int var6 = (var12.getClassName().hashCode() ^ var12.getMethodName().hashCode()) >> 16 ^ '鍩';
      int var7 = 0;

      do {
         var8[var7] = (char)(var8[var7] ^ 29917 ^ var7 ^ var6 ^ var4 ^ var1 ^ var0 ^ var2 ^ var3);
         ++var7;
      } while(var7 < var8.length);

      return (new String(var8)).intern();
   }

   public String toString() {
      return this.a.bba();
   }
}
