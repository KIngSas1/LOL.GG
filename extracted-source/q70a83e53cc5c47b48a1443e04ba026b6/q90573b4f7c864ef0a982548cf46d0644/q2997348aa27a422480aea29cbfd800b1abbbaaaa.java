package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
enum q2997348aa27a422480aea29cbfd800b1abbbaaaa {
   private static final String[] bb;
   private static final Object[] aaa;
   public static final q2997348aa27a422480aea29cbfd800b1abbbaaaa a;
   public static final q2997348aa27a422480aea29cbfd800b1abbbaaaa aa;
   private final q2997348aa27a422480aea29cbfd800b1babba ab;
   private static final int[] ba;
   private static final q2997348aa27a422480aea29cbfd800b1abbbaaaa[] b;

   private static int b(int var0, int var1) {
      int var2 = ba[var0 ^ 881366882] ^ var1 ^ var0;
      var2 += 27699;
      var2 -= 14311;
      var2 += 59705;
      var2 -= 49840;
      var2 += 64739;
      var2 ^= 19263;
      return var2;
   }

   static {
      // $FF: Couldn't be decompiled
   }

   private static String aa(int var0, byte var1, short var2, int var3, char var4, short var5) {
      int var10 = var3 ^ -2130626380;
      char[] var9 = bb[var10].toCharArray();
      StackTraceElement[] var11 = (StackTraceElement[])aaa[var10];
      StackTraceElement[] var12;
      if (var11 != null) {
         var12 = var11;
      } else {
         var12 = (new Throwable()).getStackTrace();
         aaa[var10] = var12;
      }

      StackTraceElement var13 = var12[1];
      int var7 = (var13.getClassName().hashCode() ^ var13.getMethodName().hashCode()) >> 16 ^ '\uf20c';

      for(int var8 = 0; var8 < var9.length; ++var8) {
         var9[var8] = (char)(var9[var8] ^ var8 ^ var1 ^ var3 ^ var4 ^ var0 ^ var7 ^ var2 ^ var5);
      }

      return (new String(var9)).intern();
   }

   private q2997348aa27a422480aea29cbfd800b1abbbaaaa(q2997348aa27a422480aea29cbfd800b1babba var3) {
      this.ab = var3;
   }

   public String toString() {
      return this.ab.bba();
   }

   private static q2997348aa27a422480aea29cbfd800b1abbbaaaa[] a() {
      return new q2997348aa27a422480aea29cbfd800b1abbbaaaa[]{a, aa};
   }
}
