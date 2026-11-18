package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
enum q2997348aa27a422480aea29cbfd800b1bbbaab {
   private static final Object[] aab;
   public static final q2997348aa27a422480aea29cbfd800b1bbbaab a;
   private static final int[] bb;
   private static final String[] aaa;
   private final q2997348aa27a422480aea29cbfd800b1babba aa;
   public static final q2997348aa27a422480aea29cbfd800b1bbbaab b;
   public static final q2997348aa27a422480aea29cbfd800b1bbbaab ab;
   private static final q2997348aa27a422480aea29cbfd800b1bbbaab[] ba;

   private static int b(int var0, int var1) {
      int var2 = bb[var0 ^ -2047242403] ^ var1 ^ var0;
      var2 ^= 19206;
      var2 += 30788;
      var2 ^= 20753;
      var2 += 4012;
      var2 -= 9412;
      var2 -= 65323;
      var2 -= 633;
      var2 -= 3962;
      var2 += 60322;
      var2 -= 1365;
      return var2;
   }

   static {
      // $FF: Couldn't be decompiled
   }

   public String toString() {
      return this.aa.bba();
   }

   private static q2997348aa27a422480aea29cbfd800b1bbbaab[] a() {
      return new q2997348aa27a422480aea29cbfd800b1bbbaab[]{ab, a, b};
   }

   private static String aa(byte var0, int var1, int var2) {
      int var7 = var1 ^ -1268373048;
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
      int var4 = (var10.getClassName().hashCode() ^ var10.getMethodName().hashCode()) >> 16 ^ '\ue3b1';

      for(int var5 = 0; var5 < var6.length; ++var5) {
         var6[var5] = (char)(var6[var5] ^ var5 ^ var0 ^ var2 ^ var4 ^ var1);
      }

      return (new String(var6)).intern();
   }

   private q2997348aa27a422480aea29cbfd800b1bbbaab(q2997348aa27a422480aea29cbfd800b1babba var3) {
      this.aa = var3;
   }
}
