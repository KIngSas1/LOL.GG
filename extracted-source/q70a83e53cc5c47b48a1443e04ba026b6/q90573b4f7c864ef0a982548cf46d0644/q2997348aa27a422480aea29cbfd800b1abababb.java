package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum q2997348aa27a422480aea29cbfd800b1abababb {
   private static final Object[] aba;
   private static final int[] b;
   public static final q2997348aa27a422480aea29cbfd800b1abababb a;
   public static final q2997348aa27a422480aea29cbfd800b1abababb aa;
   private static final q2997348aa27a422480aea29cbfd800b1abababb[] ab;
   public static final q2997348aa27a422480aea29cbfd800b1abababb ba;
   public static final q2997348aa27a422480aea29cbfd800b1abababb bb;
   private static final String[] aab;
   private final q2997348aa27a422480aea29cbfd800b1babba aaa;

   private static q2997348aa27a422480aea29cbfd800b1abababb[] a() {
      return new q2997348aa27a422480aea29cbfd800b1abababb[]{bb, a, aa, ba};
   }

   static {
      // $FF: Couldn't be decompiled
   }

   private static int b(int var0, int var1) {
      int var2 = b[var0 ^ -1973286994] ^ var1 ^ var0;
      var2 -= 52236;
      var2 -= 61299;
      var2 ^= 1303;
      var2 ^= 53914;
      var2 -= 38624;
      var2 ^= 48849;
      var2 += 8304;
      var2 ^= 56760;
      return var2;
   }

   private q2997348aa27a422480aea29cbfd800b1abababb(q2997348aa27a422480aea29cbfd800b1babba var3) {
      this.aaa = var3;
   }

   public String toString() {
      return this.aaa.bba();
   }

   public q2997348aa27a422480aea29cbfd800b1babba aa() {
      return this.aaa;
   }

   private static String ab(int var0, int var1, int var2, char var3, char var4, int var5, int var6) {
      int var11 = var5 ^ -590648615;
      char[] var10 = aab[var11].toCharArray();
      StackTraceElement[] var12 = (StackTraceElement[])aba[var11];
      StackTraceElement[] var13;
      if (var12 != null) {
         var13 = var12;
      } else {
         var13 = (new Throwable()).getStackTrace();
         aba[var11] = var13;
      }

      StackTraceElement var14 = var13[1];
      int var8 = (var14.getClassName().hashCode() ^ var14.getMethodName().hashCode()) >> 16 ^ 13093;
      int var9 = 0;

      do {
         int var10002 = var10[var9] ^ 19967 ^ var9;
         short var10003;
         switch (var9 % 11) {
            case 0:
            default:
               var10003 = 192;
               break;
            case 1:
               var10003 = 232;
               break;
            case 2:
               var10003 = 157;
               break;
            case 3:
               var10003 = 207;
               break;
            case 4:
               var10003 = 134;
               break;
            case 5:
               var10003 = 60;
               break;
            case 6:
               var10003 = 41;
               break;
            case 7:
               var10003 = 90;
               break;
            case 8:
               var10003 = 138;
               break;
            case 9:
               var10003 = 5;
               break;
            case 10:
               var10003 = 128;
         }

         var10[var9] = (char)(var10002 ^ var10003 ^ var2 ^ var0 ^ var1 ^ var8 ^ var3 ^ var5 ^ var4 ^ var6);
         ++var9;
      } while(var9 < var10.length);

      return (new String(var10)).intern();
   }
}
