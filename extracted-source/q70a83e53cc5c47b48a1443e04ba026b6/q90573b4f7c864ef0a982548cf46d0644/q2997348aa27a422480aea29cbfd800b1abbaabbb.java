package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public final class q2997348aa27a422480aea29cbfd800b1abbaabbb extends q2997348aa27a422480aea29cbfd800b1bbaababb {
   private static final int[] bb;
   private static final long[] aa;
   private static final String[] ab;
   private static final String[] aaa;
   private static final Object[] aab;
   private static final String[] a;
   private static final Integer[] ba;

   public q2997348aa27a422480aea29cbfd800b1abbaabbb() {
      super((Object)q2997348aa27a422480aea29cbfd800b1bbbbbbab.abbb(aa(b(a(1028381298, 1411475475 ^ 151365854), 1924447713768910843L), b(a(1028381299, 1411475475 ^ 204205141), 6975841508555079654L))), q2997348aa27a422480aea29cbfd800b1aabbaaaaa.bab, (Object)q2997348aa27a422480aea29cbfd800b1bbbbbbab.abbb(aa(b(a(1028381296, 1411475475 ^ -1414078262), 3631040932434968303L), b(a(1028381297, 1411475475 ^ -1703777642), 1597368730798412415L))));
      this.aaaabbaa(true);
   }

   static {
      // $FF: Couldn't be decompiled
   }

   private static int a(int var0, int var1) {
      int var2 = bb[var0 ^ 1028381298] ^ var1 ^ var0;
      var2 -= 27344;
      var2 += 57769;
      var2 ^= 32248;
      var2 += 65328;
      var2 ^= 4393;
      var2 += 6071;
      var2 += 42032;
      return var2;
   }

   private static String aa(int param0, int param1) {
      // $FF: Couldn't be decompiled
   }

   private static String ab(char var0, short var1, int var2) {
      int var3 = var0 ^ '숡';
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
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 23415;
      int var9 = 0;

      do {
         int var10 = var4[var9] + 27128;
         var10 += 20987;
         var10 -= 55200;
         var10 += 15152;
         var10 ^= 2622;
         var4[var9] = (char)(var10 ^ var8 ^ var1 ^ var2 >> 16);
         ++var9;
      } while(var9 < var4.length);

      return (new String(var4)).intern();
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ a(1028381529, 900547285 ^ 2080916587);
      if (ba[var3] == null) {
         ba[var3] = (int)(aa[var3] ^ var1);
      }

      return ba[var3];
   }

   public void baba() {
   }

   public void aabaa() {
      q2997348aa27a422480aea29cbfd800b1bbb.b();
   }
}
