package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public final class q2997348aa27a422480aea29cbfd800b1baaaaba extends q2997348aa27a422480aea29cbfd800b1bbaababb {
   private static final Integer[] aa;
   private static final long[] ab;
   private static final int[] bb;
   private static final String[] ba;
   private static final String[] a;
   private static final Object[] aab;
   private static final String[] aaa;

   private static String aa(int param0, int param1) {
      // $FF: Couldn't be decompiled
   }

   private static int ab(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ a(-1383164938, -388819265 ^ -1742628642);
      if (aa[var3] == null) {
         aa[var3] = (int)(ab[var3] ^ var1);
      }

      return aa[var3];
   }

   private static String b(char var0, int var1, char var2) {
      int var3 = var0 ^ 'ꛋ';
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
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 13438;
      int var9 = 0;

      do {
         int var10 = var4[var9] - 9187;
         var10 += 9742;
         var10 -= 33878;
         var10 += 3050;
         var10 ^= 48728;
         var4[var9] = (char)(var10 ^ var8 ^ var2 ^ var1 >> 16);
         ++var9;
      } while(var9 < var4.length);

      return (new String(var4)).intern();
   }

   static {
      // $FF: Couldn't be decompiled
   }

   private static int a(int var0, int var1) {
      int var2 = bb[var0 ^ -1383165232] ^ var1 ^ var0;
      var2 ^= 41567;
      var2 ^= 30812;
      var2 += 31798;
      var2 -= 30148;
      var2 += 61081;
      var2 += 34584;
      var2 ^= 19649;
      return var2;
   }

   public static boolean ba() {
      // $FF: Couldn't be decompiled
   }

   public q2997348aa27a422480aea29cbfd800b1baaaaba() {
      super((Object)q2997348aa27a422480aea29cbfd800b1bbbbbbab.abbb(aa(ab(a(-1383164937, 416375048 ^ -949013659), 2176153105543919071L), ab(a(-1383164936, 416375048 ^ 2130630041), 9222085725381145297L))), q2997348aa27a422480aea29cbfd800b1aabbaaaaa.bab, (Object)q2997348aa27a422480aea29cbfd800b1bbbbbbab.abbb(aa(ab(a(-1383164935, 416375048 ^ 884650404), 5518506747034995829L), ab(a(-1383164934, 416375048 ^ 1586548104), 1641352935441260090L))));
   }
}
