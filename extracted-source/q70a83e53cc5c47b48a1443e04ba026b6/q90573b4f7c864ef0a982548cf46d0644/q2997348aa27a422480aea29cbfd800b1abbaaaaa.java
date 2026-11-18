package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum q2997348aa27a422480aea29cbfd800b1abbaaaaa {
   private final q2997348aa27a422480aea29cbfd800b1babba a;
   public static final q2997348aa27a422480aea29cbfd800b1abbaaaaa b;
   private static final q2997348aa27a422480aea29cbfd800b1abbaaaaa[] aa;
   private static final int[] ba;
   public static final q2997348aa27a422480aea29cbfd800b1abbaaaaa ab;
   private static final Object[] aaa;
   private static final String[] bb;

   private static String aa(short var0, char var1, int var2) {
      int var3 = var1 ^ 17790;
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
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 9790;
      int var9 = 0;

      do {
         int var10 = var4[var9] + 27151;
         var10 ^= 50840;
         var10 += 50381;
         var10 -= 19187;
         var10 ^= 19915;
         var4[var9] = (char)(var10 ^ var8 ^ var0 ^ var2 >> 16);
         ++var9;
      } while(var9 < var4.length);

      return (new String(var4)).intern();
   }

   private static q2997348aa27a422480aea29cbfd800b1abbaaaaa[] a() {
      return new q2997348aa27a422480aea29cbfd800b1abbaaaaa[]{ab, b};
   }

   private static int b(int var0, int var1) {
      int var2 = ba[var0 ^ 1027193113] ^ var1 ^ var0;
      var2 += 48506;
      var2 ^= 21961;
      var2 += 20405;
      var2 += 46828;
      var2 ^= 7676;
      var2 += 1888;
      var2 ^= 24906;
      var2 ^= 29949;
      var2 ^= 46687;
      return var2;
   }

   public String toString() {
      return this.a.bba();
   }

   static {
      // $FF: Couldn't be decompiled
   }

   private q2997348aa27a422480aea29cbfd800b1abbaaaaa(q2997348aa27a422480aea29cbfd800b1babba var3) {
      this.a = var3;
   }
}
