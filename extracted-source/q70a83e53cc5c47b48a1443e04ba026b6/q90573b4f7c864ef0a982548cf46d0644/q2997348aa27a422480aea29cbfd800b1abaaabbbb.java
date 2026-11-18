package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum q2997348aa27a422480aea29cbfd800b1abaaabbbb {
   private static final q2997348aa27a422480aea29cbfd800b1abaaabbbb[] a;
   public static final q2997348aa27a422480aea29cbfd800b1abaaabbbb aa;
   private static final String[] aaa;
   private static final int[] b;
   public static final q2997348aa27a422480aea29cbfd800b1abaaabbbb ab;
   public static final q2997348aa27a422480aea29cbfd800b1abaaabbbb ba;
   private static final Object[] aab;
   private final q2997348aa27a422480aea29cbfd800b1babba bb;

   public static q2997348aa27a422480aea29cbfd800b1abaaabbbb a(String var0) {
      return (q2997348aa27a422480aea29cbfd800b1abaaabbbb)Enum.valueOf(q2997348aa27a422480aea29cbfd800b1abaaabbbb.class, var0);
   }

   private static String aaa(int var0, int var1, char var2, char var3) {
      int var8 = var0 ^ -164403891;
      char[] var7 = aaa[var8].toCharArray();
      StackTraceElement[] var9 = (StackTraceElement[])aab[var8];
      StackTraceElement[] var10;
      if (var9 != null) {
         var10 = var9;
      } else {
         var10 = (new Throwable()).getStackTrace();
         aab[var8] = var10;
      }

      StackTraceElement var11 = var10[1];
      int var5 = (var11.getClassName().hashCode() ^ var11.getMethodName().hashCode()) >> 16 ^ '\ua87a';

      for(int var6 = 0; var6 < var7.length; ++var6) {
         var7[var6] = (char)(var7[var6] ^ 14173 ^ var6 ^ var1 ^ var0 ^ var5 ^ var2 ^ var3);
      }

      return (new String(var7)).intern();
   }

   static {
      // $FF: Couldn't be decompiled
   }

   public float aa(float param1) {
      // $FF: Couldn't be decompiled
   }

   public String toString() {
      return this.bb.bba();
   }

   private static int bb(int var0, int var1) {
      int var2 = b[var0 ^ -196946480] ^ var1 ^ var0;
      var2 -= 17652;
      var2 -= 5170;
      var2 -= 27592;
      var2 ^= 56065;
      var2 -= 7964;
      var2 += 9595;
      var2 ^= 11358;
      var2 -= 32895;
      var2 ^= 44937;
      return var2;
   }

   public float ab(float param1) {
      // $FF: Couldn't be decompiled
   }

   public q2997348aa27a422480aea29cbfd800b1babba ba() {
      return this.bb;
   }

   private static q2997348aa27a422480aea29cbfd800b1abaaabbbb[] b() {
      return new q2997348aa27a422480aea29cbfd800b1abaaabbbb[]{ab, ba, aa};
   }

   private q2997348aa27a422480aea29cbfd800b1abaaabbbb(q2997348aa27a422480aea29cbfd800b1babba var3) {
      this.bb = var3;
   }
}
