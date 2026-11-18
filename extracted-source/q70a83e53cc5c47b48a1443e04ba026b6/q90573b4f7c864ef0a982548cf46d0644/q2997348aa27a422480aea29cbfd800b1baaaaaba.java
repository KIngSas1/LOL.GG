package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum q2997348aa27a422480aea29cbfd800b1baaaaaba implements q2997348aa27a422480aea29cbfd800b1aabbbabab {
   public static final q2997348aa27a422480aea29cbfd800b1baaaaaba a;
   public static final q2997348aa27a422480aea29cbfd800b1baaaaaba aa;
   private static final Object[] abb;
   public static final q2997348aa27a422480aea29cbfd800b1baaaaaba ab;
   public static final q2997348aa27a422480aea29cbfd800b1baaaaaba ba;
   private final q2997348aa27a422480aea29cbfd800b1babba bb;
   private static final int[] aab;
   private static final q2997348aa27a422480aea29cbfd800b1baaaaaba[] b;
   public static final q2997348aa27a422480aea29cbfd800b1baaaaaba aaa;
   private static final String[] aba;

   private static q2997348aa27a422480aea29cbfd800b1baaaaaba[] b() {
      return new q2997348aa27a422480aea29cbfd800b1baaaaaba[]{a, ba, aa, aaa, ab};
   }

   static {
      // $FF: Couldn't be decompiled
   }

   private static String aa(int var0, byte var1, int var2, short var3, int var4) {
      int var9 = var0 ^ -67658492;
      char[] var8 = aba[var9].toCharArray();
      StackTraceElement[] var10 = (StackTraceElement[])abb[var9];
      StackTraceElement[] var11;
      if (var10 != null) {
         var11 = var10;
      } else {
         var11 = (new Throwable()).getStackTrace();
         abb[var9] = var11;
      }

      StackTraceElement var12 = var11[1];
      int var6 = (var12.getClassName().hashCode() ^ var12.getMethodName().hashCode()) >> 16 ^ 28732;
      int var7 = 0;

      do {
         int var10002 = var8[var7] ^ var7 ^ '赜';
         short var10003;
         switch (var7 % 5) {
            case 0:
            default:
               var10003 = 193;
               break;
            case 1:
               var10003 = 94;
               break;
            case 2:
               var10003 = 89;
               break;
            case 3:
               var10003 = 226;
               break;
            case 4:
               var10003 = 181;
         }

         var8[var7] = (char)(var10002 ^ var10003 ^ var2 ^ var1 ^ var3 ^ var4 ^ var6 ^ var0);
         ++var7;
      } while(var7 < var8.length);

      return (new String(var8)).intern();
   }

   private q2997348aa27a422480aea29cbfd800b1baaaaaba(q2997348aa27a422480aea29cbfd800b1babba var3) {
      this.bb = var3;
   }

   public String toString() {
      return this.bb.bba();
   }

   private static int a(int var0, int var1) {
      int var2 = aab[var0 ^ 1735114212] ^ var1 ^ var0;
      var2 ^= 36899;
      var2 ^= 416;
      var2 += 60867;
      var2 -= 13760;
      var2 ^= 19520;
      var2 ^= 17258;
      var2 ^= 26150;
      return var2;
   }
}
