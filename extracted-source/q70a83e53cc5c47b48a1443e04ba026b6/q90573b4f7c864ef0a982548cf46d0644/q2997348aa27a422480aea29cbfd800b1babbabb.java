package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum q2997348aa27a422480aea29cbfd800b1babbabb {
   public static final q2997348aa27a422480aea29cbfd800b1babbabb a;
   private static final String[] aaa;
   private static final Object[] aab;
   public static final q2997348aa27a422480aea29cbfd800b1babbabb aa;
   private static final int[] bb;
   public static final q2997348aa27a422480aea29cbfd800b1babbabb ab;
   private static final q2997348aa27a422480aea29cbfd800b1babbabb[] ba;
   public static final q2997348aa27a422480aea29cbfd800b1babbabb b;

   private static String ab(short var0, short var1, int var2) {
      int var7 = var2 ^ -644470671;
      char[] var6 = aaa[var7].toCharArray();
      StackTraceElement[] var8 = (StackTraceElement[])aab[var7];
      StackTraceElement[] var9;
      if (var8 != null) {
         var9 = var8;
      } else {
         var9 = (new Throwable()).getStackTrace();
         aab[var7] = var9;
      }

      StackTraceElement var10 = var9[1];
      int var4 = (var10.getClassName().hashCode() ^ var10.getMethodName().hashCode()) >> 16 ^ '\uf735';

      for(int var5 = 0; var5 < var6.length; ++var5) {
         var6[var5] = (char)(var6[var5] ^ var5 ^ var0 ^ var2 ^ var1 ^ var4);
      }

      return (new String(var6)).intern();
   }

   private static q2997348aa27a422480aea29cbfd800b1babbabb[] a() {
      return new q2997348aa27a422480aea29cbfd800b1babbabb[]{b, aa, ab, a};
   }

   public static q2997348aa27a422480aea29cbfd800b1babbabb aa(String var0) {
      return (q2997348aa27a422480aea29cbfd800b1babbabb)Enum.valueOf(q2997348aa27a422480aea29cbfd800b1babbabb.class, var0);
   }

   private static int b(int var0, int var1) {
      int var2 = bb[var0 ^ 1662895819] ^ var1 ^ var0;
      var2 -= 8643;
      var2 -= 60973;
      var2 ^= 36798;
      var2 += 23403;
      var2 += 2577;
      var2 ^= 57884;
      var2 -= 14653;
      var2 ^= 3264;
      return var2;
   }

   static {
      // $FF: Couldn't be decompiled
   }
}
