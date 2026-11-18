package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import java.util.HashMap;
import java.util.Map;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_243;
import net.minecraft.class_310;
import net.minecraft.class_8956;

@Environment(EnvType.CLIENT)
public final class q2997348aa27a422480aea29cbfd800b1abbbaa extends q2997348aa27a422480aea29cbfd800b1bbaababb {
   private static final long[] aa;
   private static final long[] ab;
   private static final Long[] ba;
   private static final double bb = 1.35;
   private static final Integer[] aaa;
   private static final int[] a;
   private static final double aab = 0.65;
   private static final String[] aba;
   private Object abb;
   private int baa;
   private static final String[] abaa;
   private final Map bab;
   private static final String[] bba;
   private static final Integer[] bbb;
   private static final int aaaa;
   private final q2997348aa27a422480aea29cbfd800b1abaaaaabb aaab;
   private static final Object[] abab;
   private static final long[] aaba;
   private static final int aabb;

   private void aa(int param1) {
      // $FF: Couldn't be decompiled
   }

   private static String ab(int param0, int param1) {
      // $FF: Couldn't be decompiled
   }

   private static int ba(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ a(1764342961, 1242598749 ^ -2052973579);
      if (aaa[var3] == null) {
         aaa[var3] = (int)(aaba[var3] ^ var1);
      }

      return aaa[var3];
   }

   private static int bb(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & bab(a(1764342960, -12747190 ^ -120146217), 4350994096897052202L)) ^ ba(a(1764342967, -12747190 ^ 1348337499), 793597793510356200L);

      try {
         if (bbb[var3] == null) {
            bbb[var3] = (int)(aa[var3] ^ var1);
         }
      } catch (MatchException var4) {
         throw var4;
      }

      return bbb[var3];
   }

   static {
      // $FF: Couldn't be decompiled
   }

   private void aaa() {
      this.bab.clear();
      this.baa = 0;
      this.abb = null;
   }

   private double aab(class_243 param1, class_243 param2, class_243 param3) {
      // $FF: Couldn't be decompiled
   }

   public boolean aba(class_310 param1) {
      // $FF: Couldn't be decompiled
   }

   private static String b(short var0, byte var1, int var2) {
      int var7 = var2 ^ -434395629;
      char[] var6 = abaa[var7].toCharArray();
      StackTraceElement[] var8 = (StackTraceElement[])abab[var7];
      StackTraceElement[] var9;
      if (var8 != null) {
         var9 = var8;
      } else {
         var9 = (new Throwable()).getStackTrace();
         abab[var7] = var9;
      }

      StackTraceElement var10 = var9[1];
      int var4 = (var10.getClassName().hashCode() ^ var10.getMethodName().hashCode()) >> 16 ^ '\uf44c';
      int var5 = 0;

      do {
         var6[var5] = (char)(var6[var5] ^ 26838 ^ var4 ^ var2 ^ var0 ^ var1);
         ++var5;
      } while(var5 < var6.length);

      return (new String(var6)).intern();
   }

   private static int a(int var0, int var1) {
      int var2 = a[var0 ^ 1764343219] ^ var1 ^ var0;
      var2 ^= 35836;
      var2 ^= 1057;
      var2 -= 39396;
      var2 ^= 29984;
      var2 += 14960;
      var2 ^= 952;
      var2 += 912;
      return var2;
   }

   public void aabaa() {
      this.aaa();
   }

   private void abb(class_310 param1) {
      // $FF: Couldn't be decompiled
   }

   public void baba() {
      // $FF: Couldn't be decompiled
   }

   private class_8956 baa(class_310 param1) {
      // $FF: Couldn't be decompiled
   }

   public q2997348aa27a422480aea29cbfd800b1abbbaa() {
      int var1 = 1588118752;
      super((Object)q2997348aa27a422480aea29cbfd800b1bbbbbbab.abbb(ab(ba(a(1764342964, var1 ^ -1694160270), 2972710793236220362L), ba(a(1764342971, var1 ^ 1625944268), 6130286738244065009L))), q2997348aa27a422480aea29cbfd800b1aabbaaaaa.aba, (Object)q2997348aa27a422480aea29cbfd800b1bbbbbbab.abbb(ab(ba(a(1764342970, var1 ^ 632414563), 6435986991972383227L), ba(a(1764342969, var1 ^ 1863347522), 779149728798452639L))));
      this.aaab = (q2997348aa27a422480aea29cbfd800b1abaaaaabb)this.aaabbbbb((new q2997348aa27a422480aea29cbfd800b1abaaaaabb(q2997348aa27a422480aea29cbfd800b1bbbbbbab.abbb(ab(ba(a(1764342968, var1 ^ 304437394), 4689329944454498091L), ba(a(1764342975, var1 ^ 759242059), 651880684150601563L))), 1.15, (double)0.5F, (double)2.5F, 0.05)).aba(q2997348aa27a422480aea29cbfd800b1bbbbbbab.abbb(ab(ba(a(1764342974, var1 ^ 631362367), 6741263126269162634L), ba(a(1764342973, var1 ^ -1452806000), 8236356820851699172L)))));
      this.bab = new HashMap();
   }

   private static long bab(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ a(1764342972, 746319245 ^ -967411833)) & a(1764342947, 746319245 ^ -1166784907);
      if (ba[var3] == null) {
         ba[var3] = ab[var3] ^ var1;
      }

      return ba[var3];
   }

   private boolean bba(class_310 param1) {
      // $FF: Couldn't be decompiled
   }
}
