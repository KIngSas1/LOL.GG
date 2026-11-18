package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1297;

@Environment(EnvType.CLIENT)
public final class q2997348aa27a422480aea29cbfd800b1abababaaa extends q2997348aa27a422480aea29cbfd800b1bbaababb {
   private static final int[] aba;
   private static final Integer[] aa;
   private static final String[] ab;
   private final q2997348aa27a422480aea29cbfd800b1aabababab ba;
   private static final long[] bb;
   private final q2997348aa27a422480aea29cbfd800b1aabababab aaa;
   private static final String[] abb;
   private static volatile q2997348aa27a422480aea29cbfd800b1abababaaa aab;
   private static final Object[] baa;
   private static final String[] a;

   public static boolean aa(class_1297 param0) {
      // $FF: Couldn't be decompiled
   }

   private static int b(int var0, int var1) {
      int var2 = aba[var0 ^ -1635588662] ^ var1 ^ var0;
      var2 ^= 58845;
      var2 += 18399;
      var2 ^= 8905;
      var2 -= 33963;
      var2 -= 25044;
      var2 ^= 16563;
      var2 ^= 28219;
      var2 += 25792;
      var2 += 43256;
      return var2;
   }

   private static int ab(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ b(-1635588662, -588313324 ^ 1720227623);
      if (aa[var3] == null) {
         aa[var3] = (int)(bb[var3] ^ var1);
      }

      return aa[var3];
   }

   public static boolean a(class_1297 param0) {
      // $FF: Couldn't be decompiled
   }

   private static String aaa(char var0, short var1, int var2) {
      int var3 = var0 ^ 10359;
      char[] var4 = abb[var3].toCharArray();
      StackTraceElement[] var5 = (StackTraceElement[])baa[var3];
      StackTraceElement[] var6;
      if (var5 != null) {
         var6 = var5;
      } else {
         var6 = (new Throwable()).getStackTrace();
         baa[var3] = var6;
      }

      StackTraceElement var7 = var6[1];
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 19342;
      int var9 = 0;

      do {
         int var10 = var4[var9] ^ 7581;
         var10 += 3272;
         var10 += 14887;
         var10 ^= 50165;
         var10 -= 26720;
         var10 += 63200;
         var10 -= 28393;
         var4[var9] = (char)(var10 ^ var8 ^ var1 ^ var2 >> 16);
         ++var9;
      } while(var9 < var4.length);

      return (new String(var4)).intern();
   }

   private static String ba(int param0, int param1) {
      // $FF: Couldn't be decompiled
   }

   public q2997348aa27a422480aea29cbfd800b1abababaaa() {
      int var1 = 638707152;
      super((Object)q2997348aa27a422480aea29cbfd800b1bbbbbbab.abbb(ba(ab(b(-1635588919, var1 ^ 691360518), 191388090435176761L), ab(b(-1635588914, var1 ^ -1411492185), 5324201664370564712L))), q2997348aa27a422480aea29cbfd800b1aabbaaaaa.bab, (Object)q2997348aa27a422480aea29cbfd800b1bbbbbbab.abbb(ba(ab(b(-1635588913, var1 ^ -753068137), 8672321988532199745L), ab(b(-1635588916, var1 ^ 475025535), 4029955369945831491L))));
      this.ba = (q2997348aa27a422480aea29cbfd800b1aabababab)this.aaabbbbb(new q2997348aa27a422480aea29cbfd800b1aabababab(q2997348aa27a422480aea29cbfd800b1bbbbbbab.abbb(ba(ab(b(-1635588915, var1 ^ -1044145935), 3799657111933129877L), ab(b(-1635588926, var1 ^ -1065075493), 5595447092952286815L))), true));
      this.aaa = (q2997348aa27a422480aea29cbfd800b1aabababab)this.aaabbbbb(new q2997348aa27a422480aea29cbfd800b1aabababab(q2997348aa27a422480aea29cbfd800b1bbbbbbab.abbb(ba(ab(b(-1635588925, var1 ^ 652427409), 5577782995855484849L), ab(b(-1635588928, var1 ^ 1082342837), 8599725124782743615L))), true));
      aab = this;
   }

   static {
      // $FF: Couldn't be decompiled
   }

   public static void bb() {
      aab = null;
   }
}
