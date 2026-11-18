package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
enum q2997348aa27a422480aea29cbfd800b1abbababbb {
   private static final q2997348aa27a422480aea29cbfd800b1abbababbb[] a;
   public static final q2997348aa27a422480aea29cbfd800b1abbababbb aa;
   private static final int[] b;
   public static final q2997348aa27a422480aea29cbfd800b1abbababbb ab;
   public static final q2997348aa27a422480aea29cbfd800b1abbababbb ba;
   private static final Object[] aab;
   private final q2997348aa27a422480aea29cbfd800b1babba bb;
   private static final String[] aaa;

   static {
      // $FF: Couldn't be decompiled
   }

   private static q2997348aa27a422480aea29cbfd800b1abbababbb[] a() {
      return new q2997348aa27a422480aea29cbfd800b1abbababbb[]{ab, aa, ba};
   }

   private static String ab(int var0, int var1, short var2, int var3, int var4) {
      int var9 = var4 ^ -1322393617;
      char[] var8 = aaa[var9].toCharArray();
      StackTraceElement[] var10 = (StackTraceElement[])aab[var9];
      StackTraceElement[] var11;
      if (var10 != null) {
         var11 = var10;
      } else {
         var11 = (new Throwable()).getStackTrace();
         aab[var9] = var11;
      }

      StackTraceElement var12 = var11[1];
      int var6 = (var12.getClassName().hashCode() ^ var12.getMethodName().hashCode()) >> 16 ^ 24742;
      int var7 = 0;

      do {
         var8[var7] = (char)(var8[var7] ^ var7 ^ var6 ^ var0 ^ var3 ^ var4 ^ var1 ^ var2);
         ++var7;
      } while(var7 < var8.length);

      return (new String(var8)).intern();
   }

   public String toString() {
      return this.bb.bba();
   }

   private q2997348aa27a422480aea29cbfd800b1abbababbb(q2997348aa27a422480aea29cbfd800b1babba var3) {
      this.bb = var3;
   }

   private static int b(int var0, int var1) {
      int var2 = b[var0 ^ -1342429552] ^ var1 ^ var0;
      var2 -= 53014;
      var2 -= 50628;
      var2 ^= 55150;
      var2 += 29306;
      var2 ^= 7179;
      var2 -= 5429;
      var2 ^= 27284;
      var2 ^= 46094;
      var2 += 49004;
      return var2;
   }

   public static q2997348aa27a422480aea29cbfd800b1abbababbb aa(String var0) {
      return (q2997348aa27a422480aea29cbfd800b1abbababbb)Enum.valueOf(q2997348aa27a422480aea29cbfd800b1abbababbb.class, var0);
   }
}
