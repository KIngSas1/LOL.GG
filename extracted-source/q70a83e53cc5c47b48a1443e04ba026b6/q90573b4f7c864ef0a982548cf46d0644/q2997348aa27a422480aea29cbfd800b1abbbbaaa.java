package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1735;
import net.minecraft.class_310;

@Environment(EnvType.CLIENT)
public final class q2997348aa27a422480aea29cbfd800b1abbbbaaa extends q2997348aa27a422480aea29cbfd800b1bbaababb {
   private int aa;
   private final q2997348aa27a422480aea29cbfd800b1abaaaaabb ba;
   private static final Long[] aaa;
   private int aab;
   private static final Long[] aba;
   private static final long[] abb;
   private final q2997348aa27a422480aea29cbfd800b1aabbabbbb baa;
   private static final long[] bab;
   private static final long[] bba;
   private static final int[] baaa;
   private long ab;
   private int bbb;
   private static final long aaaa;
   private static final String[] aaab;
   private long aaba;
   private static final String[] aabb;
   private static final String[] baab;
   private static final long[] abaa;
   private long abab;
   private static final Object[] baba;
   private static final Integer[] abba;
   private static final Integer[] bb;
   private static final int abbb;
   private final q2997348aa27a422480aea29cbfd800b1aabababab a;

   private static long aa(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ a(1240492699, 1099569207 ^ 1811940089)) & a(1240492698, 1099569207 ^ 1749603312);
      if (aba[var3] == null) {
         aba[var3] = abaa[var3] ^ var1;
      }

      return aba[var3];
   }

   private static long ab(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ ba(a(1240492769, 568202918 ^ -1458200270), 1209071975649435496L)) & ba(a(1240492768, 568202918 ^ -928754364), 1131981503214032923L);

      try {
         if (aaa[var3] == null) {
            aaa[var3] = bab[var3] ^ var1;
         }
      } catch (MatchException var4) {
         throw var4;
      }

      return aaa[var3];
   }

   public void aabaa() {
      this.bb();
      this.bbb = -1;
      this.abab = 0L;
   }

   private static String baa(int var0, char var1, int var2) {
      int var3 = var1 ^ 16713;
      char[] var4 = baab[var3].toCharArray();
      StackTraceElement[] var5 = (StackTraceElement[])baba[var3];
      StackTraceElement[] var6;
      if (var5 != null) {
         var6 = var5;
      } else {
         var6 = (new Throwable()).getStackTrace();
         baba[var3] = var6;
      }

      StackTraceElement var7 = var6[1];
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 30462;
      int var9 = 0;

      do {
         int var10 = var4[var9] ^ 13598;
         var10 ^= 12286;
         var10 += 3995;
         var10 ^= 8961;
         var10 -= 42574;
         var4[var9] = (char)(var10 ^ var8 ^ var0 ^ var2 >> 16);
         ++var9;
      } while(var9 < var4.length);

      return (new String(var4)).intern();
   }

   private static int ba(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ a(1240492775, 537663760 ^ -1743481774);
      if (abba[var3] == null) {
         abba[var3] = (int)(bba[var3] ^ var1);
      }

      return abba[var3];
   }

   private void bb() {
      this.aab = -1;
      this.aa = 0;
      this.aaba = 0L;
      this.ab = 0L;
   }

   public void abbbbb(class_310 var1) {
      this.aaa(var1);
   }

   public q2997348aa27a422480aea29cbfd800b1abbbbaaa() {
      int var1 = 1520149678;
      super((Object)q2997348aa27a422480aea29cbfd800b1bbbbbbab.abbb(abb(ba(a(1240492774, var1 ^ 1602438388), 2186869161233927175L), ba(a(1240492773, var1 ^ -1398247511), 458539266740174517L))), q2997348aa27a422480aea29cbfd800b1aabbaaaaa.abb, (Object)q2997348aa27a422480aea29cbfd800b1bbbbbbab.abbb(abb(ba(a(1240492772, var1 ^ 924362040), 8639170639531242021L), ba(a(1240492571, var1 ^ -318524363), 2449799083481695850L))));
      this.baa = (q2997348aa27a422480aea29cbfd800b1aabbabbbb)this.aaabbbbb((new q2997348aa27a422480aea29cbfd800b1aabbabbbb(q2997348aa27a422480aea29cbfd800b1bbbbbbab.abbb(abb(ba(a(1240492570, var1 ^ 798363709), 6636478807041695489L), ba(a(1240492569, var1 ^ -221964738), 259489224672250779L))), (double)0.0F, (double)0.0F, (double)0.0F, (double)500.0F, (double)5.0F)).bbb(q2997348aa27a422480aea29cbfd800b1bbbbbbab.abbb(abb(ba(a(1240492568, var1 ^ 1991639827), 2434512955547552009L), ba(a(1240492575, var1 ^ -991814128), 7074427759906734473L)))));
      this.a = (q2997348aa27a422480aea29cbfd800b1aabababab)this.aaabbbbb(new q2997348aa27a422480aea29cbfd800b1aabababab(q2997348aa27a422480aea29cbfd800b1bbbbbbab.abbb(abb(ba(a(1240492574, var1 ^ 1738664841), 739483984370749574L), ba(a(1240492573, var1 ^ 1480820056), 4445409811004531211L))), true));
      this.ba = (q2997348aa27a422480aea29cbfd800b1abaaaaabb)this.aaabbbbb(new q2997348aa27a422480aea29cbfd800b1abaaaaabb(q2997348aa27a422480aea29cbfd800b1bbbbbbab.abbb(abb(ba(a(1240492572, var1 ^ -204872025), 2030486181207059465L), ba(a(1240492563, var1 ^ -948964106), 8523590797349008531L))), (double)1.0F, (double)1.0F, (double)9.0F, (double)1.0F));
      this.bbb = -1;
      this.aab = -1;
   }

   private void aaa(class_310 param1) {
      // $FF: Couldn't be decompiled
   }

   private static int a(int var0, int var1) {
      int var2 = baaa[var0 ^ 1240492699] ^ var1 ^ var0;
      var2 -= 35592;
      var2 -= 11529;
      var2 ^= 28074;
      var2 += 55169;
      var2 ^= 25025;
      var2 += 16942;
      return var2;
   }

   private boolean aab(class_310 param1, class_1735 param2) {
      // $FF: Couldn't be decompiled
   }

   public void baba() {
      this.aaa(class_310.method_1551());
   }

   private long aba() {
      // $FF: Couldn't be decompiled
   }

   private static String abb(int param0, int param1) {
      // $FF: Couldn't be decompiled
   }

   static {
      // $FF: Couldn't be decompiled
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & aa(a(1240492814, 738349952 ^ 118271096), 4691583112443974058L)) ^ ba(a(1240492813, 738349952 ^ -1937453511), 242322793313316877L);

      try {
         if (bb[var3] == null) {
            bb[var3] = (int)(abb[var3] ^ var1);
         }
      } catch (MatchException var4) {
         throw var4;
      }

      return bb[var3];
   }
}
