package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum q2997348aa27a422480aea29cbfd800b1abababbb {
   public static final q2997348aa27a422480aea29cbfd800b1abababbb a;
   public static final q2997348aa27a422480aea29cbfd800b1abababbb aa;
   private static final q2997348aa27a422480aea29cbfd800b1abababbb[] ab;
   public static final q2997348aa27a422480aea29cbfd800b1abababbb ba;
   private static final String[] aaa;
   private static final int[] b;
   private static final Object[] aab;
   private final q2997348aa27a422480aea29cbfd800b1babba bb;

   private q2997348aa27a422480aea29cbfd800b1abababbb(q2997348aa27a422480aea29cbfd800b1babba var3) {
      this.bb = var3;
   }

   private static String ab(int var0, char var1, short var2) {
      int var3 = var1 ^ 20987;
      char[] var4 = aaa[var3].toCharArray();
      StackTraceElement[] var5 = (StackTraceElement[])aab[var3];
      StackTraceElement[] var6;
      if (var5 != null) {
         var6 = var5;
      } else {
         var6 = (new Throwable()).getStackTrace();
         aab[var3] = var6;
      }

      StackTraceElement var7 = var6[1];
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 12178;
      int var9 = 0;

      do {
         int var10 = var4[var9] ^ '雴';
         var10 ^= 26357;
         var10 -= 2852;
         var10 += 59855;
         var10 ^= 40014;
         var10 += 4919;
         var4[var9] = (char)(var10 ^ var8 ^ var2 ^ var0 >> 16);
         ++var9;
      } while(var9 < var4.length);

      return (new String(var4)).intern();
   }

   public String toString() {
      return this.bb.bba();
   }

   public static q2997348aa27a422480aea29cbfd800b1abababbb a(String var0) {
      return (q2997348aa27a422480aea29cbfd800b1abababbb)Enum.valueOf(q2997348aa27a422480aea29cbfd800b1abababbb.class, var0);
   }

   static {
      // $FF: Couldn't be decompiled
   }

   private static int b(int var0, int var1) {
      int var2 = b[var0 ^ 976741297] ^ var1 ^ var0;
      var2 ^= 4064;
      var2 -= 35911;
      var2 ^= 9965;
      var2 += 42134;
      var2 += 58076;
      var2 += 17093;
      var2 += 21029;
      var2 += 54441;
      var2 ^= 1388;
      return var2;
   }

   private static q2997348aa27a422480aea29cbfd800b1abababbb[] aa() {
      return new q2997348aa27a422480aea29cbfd800b1abababbb[]{aa, a, ba};
   }
}
