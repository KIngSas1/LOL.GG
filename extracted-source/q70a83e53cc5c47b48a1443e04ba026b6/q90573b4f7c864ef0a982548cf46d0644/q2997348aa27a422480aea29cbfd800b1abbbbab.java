package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import java.util.HashSet;
import java.util.Set;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1661;
import net.minecraft.class_1684;
import net.minecraft.class_1792;
import net.minecraft.class_310;

@Environment(EnvType.CLIENT)
public final class q2997348aa27a422480aea29cbfd800b1abbbbab extends q2997348aa27a422480aea29cbfd800b1bbaababb {
   private static final Integer[] aa;
   private static final long[] ab;
   private static final String[] bbb;
   private static final String[] ba;
   private static final long[] bb;
   private static final String[] aaa;
   private static final long[] aab;
   private final q2997348aa27a422480aea29cbfd800b1bbbabaaa aba;
   private static final Object[] aaaa;
   private static final Integer[] a;
   private final Set abb;
   private static final int[] bba;
   private final q2997348aa27a422480aea29cbfd800b1aabababab baa;
   private static final Long[] bab;

   private boolean aa(class_310 var1, int var2) {
      q2997348aa27a422480aea29cbfd800b1abbaaaba.babba(var1, this, var2, q2997348aa27a422480aea29cbfd800b1abbbbab::b);
      return true;
   }

   private class_1684 ab(class_310 param1) {
      // $FF: Couldn't be decompiled
   }

   private int ba(class_1661 param1, class_1792 param2) {
      // $FF: Couldn't be decompiled
   }

   private static int a(int var0, int var1) {
      int var2 = bba[var0 ^ 778369188] ^ var1 ^ var0;
      var2 -= 54320;
      var2 ^= 58093;
      var2 -= 16600;
      var2 += 23254;
      var2 += 62817;
      var2 -= 32166;
      var2 += 57516;
      return var2;
   }

   private static String abb(short var0, int var1, int var2) {
      int var7 = var2 ^ -782553559;
      char[] var6 = bbb[var7].toCharArray();
      StackTraceElement[] var8 = (StackTraceElement[])aaaa[var7];
      StackTraceElement[] var9;
      if (var8 != null) {
         var9 = var8;
      } else {
         var9 = (new Throwable()).getStackTrace();
         aaaa[var7] = var9;
      }

      StackTraceElement var10 = var9[1];
      int var4 = (var10.getClassName().hashCode() ^ var10.getMethodName().hashCode()) >> 16 ^ 5389;

      for(int var5 = 0; var5 < var6.length; ++var5) {
         var6[var5] = (char)(var6[var5] ^ var5 ^ 17658 ^ var2 ^ var0 ^ var1 ^ var4);
      }

      return (new String(var6)).intern();
   }

   static {
      // $FF: Couldn't be decompiled
   }

   public void baba() {
      // $FF: Couldn't be decompiled
   }

   private static int bb(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ a(778369270, -181787830 ^ -13415557);
      if (aa[var3] == null) {
         aa[var3] = (int)(bb[var3] ^ var1);
      }

      return aa[var3];
   }

   private static String aaa(int param0, int param1) {
      // $FF: Couldn't be decompiled
   }

   private static boolean b(class_310 param0, int param1) {
      // $FF: Couldn't be decompiled
   }

   private static long aab(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ a(778369521, 157014157 ^ 875362814)) & a(778369522, 157014157 ^ 1456690776);
      if (bab[var3] == null) {
         bab[var3] = aab[var3] ^ var1;
      }

      return bab[var3];
   }

   public void aabaa() {
      this.abb.clear();
   }

   public q2997348aa27a422480aea29cbfd800b1abbbbab() {
      int var1 = -1087071556;
      super((Object)q2997348aa27a422480aea29cbfd800b1bbbbbbab.abbb(aaa(bb(a(778369523, var1 ^ -480441329), 5236472229634629506L), bb(a(778369532, var1 ^ -8154137), 4927606302999303666L))), q2997348aa27a422480aea29cbfd800b1aabbaaaaa.aba, (Object)q2997348aa27a422480aea29cbfd800b1bbbbbbab.abbb(aaa(bb(a(778369533, var1 ^ -786749938), 6721989075923925853L), bb(a(778369534, var1 ^ -1630763618), 1275962435003539977L))));
      this.aba = (q2997348aa27a422480aea29cbfd800b1bbbabaaa)this.aaabbbbb(new q2997348aa27a422480aea29cbfd800b1bbbabaaa(q2997348aa27a422480aea29cbfd800b1bbbbbbab.abbb(aaa(bb(a(778369535, var1 ^ -2066347001), 3840431155099447021L), bb(a(778369528, var1 ^ -1248480176), 7576275201059430369L))), q2997348aa27a422480aea29cbfd800b1aababbaaa.class, q2997348aa27a422480aea29cbfd800b1aababbaaa.ab));
      this.baa = (q2997348aa27a422480aea29cbfd800b1aabababab)this.aaabbbbb(new q2997348aa27a422480aea29cbfd800b1aabababab(q2997348aa27a422480aea29cbfd800b1bbbbbbab.abbb(aaa(bb(a(778369529, var1 ^ 1417282620), 7046765563410455917L), bb(a(778369530, var1 ^ -1821414040), 1208949564417724290L))), false));
      this.abb = new HashSet();
   }

   private static int aba(int param0, long param1) {
      // $FF: Couldn't be decompiled
   }
}
