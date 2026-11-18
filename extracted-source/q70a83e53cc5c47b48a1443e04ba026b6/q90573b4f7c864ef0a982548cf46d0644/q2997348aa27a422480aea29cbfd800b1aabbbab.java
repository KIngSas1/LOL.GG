package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1937;
import net.minecraft.class_2338;
import net.minecraft.class_2680;
import net.minecraft.class_2818;
import net.minecraft.class_310;

@Environment(EnvType.CLIENT)
public final class q2997348aa27a422480aea29cbfd800b1aabbbab extends q2997348aa27a422480aea29cbfd800b1bbaababb {
   private final Queue ba;
   private static final int aaa;
   private int a;
   private static final int aab;
   private static final Set aba;
   private static final long[] abb;
   private static final String[] aaaaa;
   private static final int[] bbbb;
   private final q2997348aa27a422480aea29cbfd800b1baababba baa;
   private int bab;
   private static final String[] bba;
   private static final Long[] bbb;
   private static final long[] aaaa;
   private final Map bb;
   private static final long aaab;
   private class_1937 aaba;
   private static final int ab;
   private static final Object[] aaaab;
   private static final long[] aabb;
   private final Map abaa;
   private int abab;
   private final Map aa;
   private final q2997348aa27a422480aea29cbfd800b1abaaaaabb abba;
   private static final int abbb;
   private static final int baaa;
   private static final Integer[] baab;
   private int baba;
   private static final int babb;
   private static final int bbaa;
   private static final Integer[] bbab;
   private static final String[] bbba;

   private void aa() {
      // $FF: Couldn't be decompiled
   }

   private q2997348aa27a422480aea29cbfd800b1bab ab(class_1937 param1, class_2818 param2) {
      // $FF: Couldn't be decompiled
   }

   private static String b(int var0, int var1, char var2) {
      int var3 = var2 ^ '푵';
      char[] var4 = aaaaa[var3].toCharArray();
      StackTraceElement[] var5 = (StackTraceElement[])aaaab[var3];
      StackTraceElement[] var6;
      if (var5 != null) {
         var6 = var5;
      } else {
         var6 = (new Throwable()).getStackTrace();
         aaaab[var3] = var6;
      }

      StackTraceElement var7 = var6[1];
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 9977;
      int var9 = 0;

      do {
         int var10 = var4[var9] - 18570;
         var10 -= 61635;
         var10 += 25694;
         var10 ^= 27765;
         var10 -= 52579;
         var10 -= 50234;
         var10 -= 29614;
         var10 += 40104;
         var4[var9] = (char)(var10 ^ var8 ^ var0 ^ var1 >> 16);
         ++var9;
      } while(var9 < var4.length);

      return (new String(var4)).intern();
   }

   public void baba() {
      // $FF: Couldn't be decompiled
   }

   public void ba(class_310 param1, int param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   private void bb() {
      // $FF: Couldn't be decompiled
   }

   private boolean aaa(class_2680 param1) {
      // $FF: Couldn't be decompiled
   }

   private void aab(String param1, long param2) {
      // $FF: Couldn't be decompiled
   }

   static {
      // $FF: Couldn't be decompiled
   }

   private static int a(int var0, int var1) {
      int var2 = bbbb[var0 ^ 1110965886] ^ var1 ^ var0;
      var2 += 7811;
      var2 += 53744;
      var2 += 39482;
      var2 -= 4309;
      var2 -= 19825;
      var2 += 16520;
      var2 += 28313;
      var2 ^= 4671;
      return var2;
   }

   private static String aba(int param0, int param1) {
      // $FF: Couldn't be decompiled
   }

   private void abb(class_1937 var1, class_2338 var2) {
      this.aaba = var1;
      this.bab = 0;
      this.baba = var2.method_10263() >> 4;
      this.a = var2.method_10260() >> 4;
      this.bb.clear();
      this.abaa.clear();
      this.ba.clear();
   }

   public q2997348aa27a422480aea29cbfd800b1aabbbab() {
      int var1 = 341526941;
      super((Object)q2997348aa27a422480aea29cbfd800b1bbbbbbab.abbb(aba(bab(a(1110966260, var1 ^ 1739083226), 7301147044261616175L), bab(a(1110966261, var1 ^ -1052289193), 4691604785841219297L))), q2997348aa27a422480aea29cbfd800b1aabbaaaaa.bab, (Object)q2997348aa27a422480aea29cbfd800b1bbbbbbab.abbb(aba(bab(a(1110966258, var1 ^ -1288834755), 212214124762021928L), bab(a(1110966259, var1 ^ -2085856244), 1986432858211483216L))));
      this.abba = (q2997348aa27a422480aea29cbfd800b1abaaaaabb)this.aaabbbbb(new q2997348aa27a422480aea29cbfd800b1abaaaaabb(q2997348aa27a422480aea29cbfd800b1bbbbbbab.abbb(aba(bab(a(1110966256, var1 ^ -1472888789), 8341967533583848129L), bab(a(1110966257, var1 ^ -141817615), 5626146358757235186L))), (double)5.0F, (double)2.0F, (double)32.0F, (double)1.0F));
      this.baa = (q2997348aa27a422480aea29cbfd800b1baababba)this.aaabbbbb(new q2997348aa27a422480aea29cbfd800b1baababba(q2997348aa27a422480aea29cbfd800b1bbbbbbab.abbb(aba(bab(a(1110966254, var1 ^ -616811784), 57781686946863365L), bab(a(1110966255, var1 ^ -1739842483), 6908162990989822464L))), List.of()));
      this.bb = new HashMap();
      this.aa = new HashMap();
      this.abaa = new HashMap();
      this.ba = new ArrayDeque();
      this.bab = -1;
   }

   private void baa(class_1937 param1) {
      // $FF: Couldn't be decompiled
   }

   public void aabaa() {
      this.bab = -1;
      this.abab = 0;
      this.aaba = null;
      this.bb.clear();
      this.aa.clear();
      this.abaa.clear();
      this.ba.clear();
   }

   public void ababb() {
      // $FF: Couldn't be decompiled
   }

   private static int bab(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ a(1110966244, 644327522 ^ -777669595);
      if (bbab[var3] == null) {
         bbab[var3] = (int)(aaaa[var3] ^ var1);
      }

      return bbab[var3];
   }

   private static long bba(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ a(1110966245, 2023828573 ^ -1412411702)) & a(1110966242, 2023828573 ^ -245033090);
      if (bbb[var3] == null) {
         bbb[var3] = abb[var3] ^ var1;
      }

      return bbb[var3];
   }

   private static int bbb(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & bba(a(1110966243, -1349268856 ^ -1010600951), 873612343485139074L)) ^ bab(a(1110966240, -1349268856 ^ 919109750), 1611783578869187682L);

      try {
         if (baab[var3] == null) {
            baab[var3] = (int)(aabb[var3] ^ var1);
         }
      } catch (NumberFormatException var4) {
         throw var4;
      }

      return baab[var3];
   }

   private void aaaa(int param1, int param2, q2997348aa27a422480aea29cbfd800b1bab param3, long param4) {
      // $FF: Couldn't be decompiled
   }

   private static q2997348aa27a422480aea29cbfd800b1aabaabbb aaab(String param0) {
      // $FF: Couldn't be decompiled
   }

   private void aaba(class_1937 param1, class_2818 param2) {
      // $FF: Couldn't be decompiled
   }
}
