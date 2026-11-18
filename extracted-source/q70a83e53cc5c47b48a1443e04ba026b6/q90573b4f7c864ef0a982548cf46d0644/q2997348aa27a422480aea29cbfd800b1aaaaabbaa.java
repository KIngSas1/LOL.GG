package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
enum q2997348aa27a422480aea29cbfd800b1aaaaabbaa {
   private static final Object[] aaa;
   private static final q2997348aa27a422480aea29cbfd800b1aaaaabbaa[] a;
   private final q2997348aa27a422480aea29cbfd800b1babba aa;
   public static final q2997348aa27a422480aea29cbfd800b1aaaaabbaa b;
   private static final int[] ba;
   public static final q2997348aa27a422480aea29cbfd800b1aaaaabbaa ab;
   private static final String[] bb;

   public String toString() {
      return this.aa.bba();
   }

   private static String ab(int var0, int var1, int var2) {
      int var3 = var1 ^ 3058;
      char[] var4 = bb[var3].toCharArray();
      StackTraceElement[] var5 = (StackTraceElement[])aaa[var3];
      StackTraceElement[] var6;
      if (var5 != null) {
         var6 = var5;
      } else {
         var6 = (new Throwable()).getStackTrace();
         aaa[var3] = var6;
      }

      StackTraceElement var7 = var6[1];
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 2422;
      int var9 = 0;

      do {
         int var10 = var4[var9] + '镾';
         var10 -= 52509;
         var10 -= 9526;
         var10 += 59081;
         var10 ^= 41381;
         var10 += 48021;
         var10 -= 35360;
         var10 ^= 31712;
         var4[var9] = (char)(var10 ^ var8 ^ var0 ^ var2 >> 16);
         ++var9;
      } while(var9 < var4.length);

      return (new String(var4)).intern();
   }

   static {
      // $FF: Couldn't be decompiled
   }

   private q2997348aa27a422480aea29cbfd800b1aaaaabbaa(q2997348aa27a422480aea29cbfd800b1babba var3) {
      this.aa = var3;
   }

   private static int b(int var0, int var1) {
      int var2 = ba[var0 ^ 333978385] ^ var1 ^ var0;
      var2 += 43863;
      var2 -= 7666;
      var2 += 29865;
      var2 += 58282;
      var2 -= 38104;
      var2 ^= 61232;
      var2 ^= 60096;
      var2 -= 10635;
      return var2;
   }

   private static q2997348aa27a422480aea29cbfd800b1aaaaabbaa[] a() {
      return new q2997348aa27a422480aea29cbfd800b1aaaaabbaa[]{b, ab};
   }

   public static q2997348aa27a422480aea29cbfd800b1aaaaabbaa aa(String var0) {
      return (q2997348aa27a422480aea29cbfd800b1aaaaabbaa)Enum.valueOf(q2997348aa27a422480aea29cbfd800b1aaaaabbaa.class, var0);
   }
}
