package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
enum q2997348aa27a422480aea29cbfd800b1bbbaabbb {
   private static final int[] aaa;
   public static final q2997348aa27a422480aea29cbfd800b1bbbaabbb a;
   public static final q2997348aa27a422480aea29cbfd800b1bbbaabbb aa;
   private static final q2997348aa27a422480aea29cbfd800b1bbbaabbb[] ab;
   private static final String[] aab;
   public static final q2997348aa27a422480aea29cbfd800b1bbbaabbb ba;
   private final q2997348aa27a422480aea29cbfd800b1babba bb;
   private static final Object[] aba;
   public static final q2997348aa27a422480aea29cbfd800b1bbbaabbb b;

   public static q2997348aa27a422480aea29cbfd800b1bbbaabbb a(String var0) {
      return (q2997348aa27a422480aea29cbfd800b1bbbaabbb)Enum.valueOf(q2997348aa27a422480aea29cbfd800b1bbbaabbb.class, var0);
   }

   private static int b(int var0, int var1) {
      int var2 = aaa[var0 ^ -837690335] ^ var1 ^ var0;
      var2 ^= 7641;
      var2 -= 31209;
      var2 ^= 23063;
      var2 += 51078;
      var2 ^= 47085;
      var2 += 5979;
      var2 -= 45182;
      var2 += 43300;
      return var2;
   }

   public String toString() {
      return this.bb.bba();
   }

   private q2997348aa27a422480aea29cbfd800b1bbbaabbb(q2997348aa27a422480aea29cbfd800b1babba var3) {
      this.bb = var3;
   }

   static {
      // $FF: Couldn't be decompiled
   }

   private static String ab(int var0, char var1, int var2) {
      int var3 = var1 ^ 6779;
      char[] var4 = aab[var3].toCharArray();
      StackTraceElement[] var5 = (StackTraceElement[])aba[var3];
      StackTraceElement[] var6;
      if (var5 != null) {
         var6 = var5;
      } else {
         var6 = (new Throwable()).getStackTrace();
         aba[var3] = var6;
      }

      StackTraceElement var7 = var6[1];
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 14949;
      int var9 = 0;

      do {
         int var10 = var4[var9] ^ 13556;
         var10 += 48616;
         var10 -= 50028;
         var10 -= 50769;
         var10 -= 47107;
         var10 -= 35615;
         var10 += 49641;
         var4[var9] = (char)(var10 ^ var8 ^ var2 ^ var0 >> 16);
         ++var9;
      } while(var9 < var4.length);

      return (new String(var4)).intern();
   }

   private static q2997348aa27a422480aea29cbfd800b1bbbaabbb[] aa() {
      return new q2997348aa27a422480aea29cbfd800b1bbbaabbb[]{aa, b, ba, a};
   }
}
