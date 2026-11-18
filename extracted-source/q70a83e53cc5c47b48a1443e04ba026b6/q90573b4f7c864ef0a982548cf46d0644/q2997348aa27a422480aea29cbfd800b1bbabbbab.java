package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
enum q2997348aa27a422480aea29cbfd800b1bbabbbab {
   public static final q2997348aa27a422480aea29cbfd800b1bbabbbab a;
   private static final q2997348aa27a422480aea29cbfd800b1bbabbbab[] aa;
   private static final Object[] aaa;
   private static final int[] ba;
   private final q2997348aa27a422480aea29cbfd800b1babba ab;
   public static final q2997348aa27a422480aea29cbfd800b1bbabbbab b;
   private static final String[] bb;

   public String toString() {
      return this.ab.bba();
   }

   private static String aa(int var0, char var1, int var2) {
      int var3 = var2 ^ '\ue387';
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
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 10388;
      int var9 = 0;

      do {
         int var10 = var4[var9] ^ '꿎';
         var10 += 42203;
         var10 -= 50494;
         var10 ^= 10269;
         var10 += 44874;
         var4[var9] = (char)(var10 ^ var8 ^ var1 ^ var0 >> 16);
         ++var9;
      } while(var9 < var4.length);

      return (new String(var4)).intern();
   }

   private static int b(int var0, int var1) {
      int var2 = ba[var0 ^ -1048954871] ^ var1 ^ var0;
      var2 ^= 32497;
      var2 += 14593;
      var2 ^= 26076;
      var2 -= 40400;
      var2 ^= 31138;
      var2 += 30243;
      var2 ^= 56954;
      var2 ^= 41460;
      var2 += 6372;
      var2 -= 38809;
      return var2;
   }

   static {
      // $FF: Couldn't be decompiled
   }

   private q2997348aa27a422480aea29cbfd800b1bbabbbab(q2997348aa27a422480aea29cbfd800b1babba var3) {
      this.ab = var3;
   }

   private static q2997348aa27a422480aea29cbfd800b1bbabbbab[] a() {
      return new q2997348aa27a422480aea29cbfd800b1bbabbbab[]{b, a};
   }
}
