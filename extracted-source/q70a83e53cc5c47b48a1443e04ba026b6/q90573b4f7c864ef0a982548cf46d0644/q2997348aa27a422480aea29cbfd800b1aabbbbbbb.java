package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
enum q2997348aa27a422480aea29cbfd800b1aabbbbbbb {
   private static final int[] ba;
   private final q2997348aa27a422480aea29cbfd800b1babba a;
   public static final q2997348aa27a422480aea29cbfd800b1aabbbbbbb b;
   private static final Object[] aaa;
   public static final q2997348aa27a422480aea29cbfd800b1aabbbbbbb aa;
   private static final String[] bb;
   private static final q2997348aa27a422480aea29cbfd800b1aabbbbbbb[] ab;

   private static q2997348aa27a422480aea29cbfd800b1aabbbbbbb[] a() {
      return new q2997348aa27a422480aea29cbfd800b1aabbbbbbb[]{aa, b};
   }

   private q2997348aa27a422480aea29cbfd800b1aabbbbbbb(q2997348aa27a422480aea29cbfd800b1babba var3) {
      this.a = var3;
   }

   private static String ab(int var0, char var1, short var2) {
      int var3 = var1 ^ 9554;
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
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 7425;
      int var9 = 0;

      do {
         int var10 = var4[var9] + 28429;
         var10 ^= 12314;
         var10 += 58792;
         var10 -= 49293;
         var10 ^= 22872;
         var10 -= 42547;
         var10 ^= 3558;
         var4[var9] = (char)(var10 ^ var8 ^ var2 ^ var0 >> 16);
         ++var9;
      } while(var9 < var4.length);

      return (new String(var4)).intern();
   }

   private static int b(int var0, int var1) {
      int var2 = ba[var0 ^ 188280285] ^ var1 ^ var0;
      var2 ^= 27835;
      var2 += 55033;
      var2 -= 59924;
      var2 -= 37576;
      var2 ^= 43604;
      var2 -= 38662;
      var2 ^= 41665;
      var2 += 47113;
      var2 ^= 51980;
      return var2;
   }

   public String toString() {
      return this.a.bba();
   }

   static {
      // $FF: Couldn't be decompiled
   }

   public static q2997348aa27a422480aea29cbfd800b1aabbbbbbb aa(String var0) {
      return (q2997348aa27a422480aea29cbfd800b1aabbbbbbb)Enum.valueOf(q2997348aa27a422480aea29cbfd800b1aabbbbbbb.class, var0);
   }
}
