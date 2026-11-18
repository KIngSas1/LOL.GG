package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum q2997348aa27a422480aea29cbfd800b1aaaabbaab {
   private static final int[] ba;
   public static final q2997348aa27a422480aea29cbfd800b1aaaabbaab a;
   private final q2997348aa27a422480aea29cbfd800b1babba aa;
   private static final String[] bb;
   private static final Object[] aaa;
   public static final q2997348aa27a422480aea29cbfd800b1aaaabbaab b;
   private static final q2997348aa27a422480aea29cbfd800b1aaaabbaab[] ab;

   public q2997348aa27a422480aea29cbfd800b1babba a() {
      return this.aa;
   }

   public static q2997348aa27a422480aea29cbfd800b1aaaabbaab aa(String var0) {
      return (q2997348aa27a422480aea29cbfd800b1aaaabbaab)Enum.valueOf(q2997348aa27a422480aea29cbfd800b1aaaabbaab.class, var0);
   }

   private static int ab(int var0, int var1) {
      int var2 = ba[var0 ^ -317630117] ^ var1 ^ var0;
      var2 ^= 18356;
      var2 -= 60404;
      var2 ^= 9577;
      var2 ^= 20552;
      var2 ^= 1296;
      var2 ^= 53652;
      var2 += 20953;
      var2 -= 32542;
      var2 -= 57319;
      var2 ^= 4030;
      return var2;
   }

   static {
      // $FF: Couldn't be decompiled
   }

   public String toString() {
      return this.aa.bba();
   }

   private q2997348aa27a422480aea29cbfd800b1aaaabbaab(q2997348aa27a422480aea29cbfd800b1babba var3) {
      this.aa = var3;
   }

   private static String ba(int var0, char var1, char var2) {
      int var3 = var2 ^ 24784;
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
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 19204;
      int var9 = 0;

      do {
         int var10 = var4[var9] ^ '\uf2a1';
         var10 += 23407;
         var10 -= 37208;
         var10 += 50771;
         var10 += 13314;
         var10 ^= 35272;
         var10 -= 23459;
         var10 ^= 56458;
         var10 ^= 30412;
         var10 ^= 18221;
         var4[var9] = (char)(var10 ^ var8 ^ var1 ^ var0 >> 16);
         ++var9;
      } while(var9 < var4.length);

      return (new String(var4)).intern();
   }

   private static q2997348aa27a422480aea29cbfd800b1aaaabbaab[] b() {
      return new q2997348aa27a422480aea29cbfd800b1aaaabbaab[]{b, a};
   }
}
