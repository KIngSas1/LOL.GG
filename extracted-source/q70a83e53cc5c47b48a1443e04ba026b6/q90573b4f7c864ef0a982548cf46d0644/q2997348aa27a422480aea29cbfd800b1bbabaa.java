package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
enum q2997348aa27a422480aea29cbfd800b1bbabaa {
   private final q2997348aa27a422480aea29cbfd800b1babba a;
   private static final String[] bb;
   private static final Object[] aaa;
   public static final q2997348aa27a422480aea29cbfd800b1bbabaa b;
   private static final int[] ba;
   private static final q2997348aa27a422480aea29cbfd800b1bbabaa[] aa;
   public static final q2997348aa27a422480aea29cbfd800b1bbabaa ab;

   private static int b(int var0, int var1) {
      int var2 = ba[var0 ^ -1903218708] ^ var1 ^ var0;
      var2 -= 59548;
      var2 += 1024;
      var2 ^= 38527;
      var2 -= 6750;
      var2 -= 47573;
      var2 -= 60394;
      var2 += 34040;
      return var2;
   }

   public String toString() {
      return this.a.bba();
   }

   private q2997348aa27a422480aea29cbfd800b1bbabaa(q2997348aa27a422480aea29cbfd800b1babba var3) {
      this.a = var3;
   }

   public static q2997348aa27a422480aea29cbfd800b1bbabaa a(String var0) {
      return (q2997348aa27a422480aea29cbfd800b1bbabaa)Enum.valueOf(q2997348aa27a422480aea29cbfd800b1bbabaa.class, var0);
   }

   private static String ab(byte var0, char var1, char var2, int var3, char var4) {
      int var9 = var3 ^ 1235563274;
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
      int var6 = (var12.getClassName().hashCode() ^ var12.getMethodName().hashCode()) >> 16 ^ 27367;
      int var7 = 0;

      do {
         var8[var7] = (char)(var8[var7] ^ 14582 ^ var4 ^ var2 ^ var3 ^ var6 ^ var0 ^ var1);
         ++var7;
      } while(var7 < var8.length);

      return (new String(var8)).intern();
   }

   static {
      // $FF: Couldn't be decompiled
   }

   private static q2997348aa27a422480aea29cbfd800b1bbabaa[] aa() {
      return new q2997348aa27a422480aea29cbfd800b1bbabaa[]{b, ab};
   }
}
