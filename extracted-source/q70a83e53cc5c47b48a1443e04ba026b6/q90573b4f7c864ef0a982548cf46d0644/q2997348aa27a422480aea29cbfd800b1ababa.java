package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_310;

@Environment(EnvType.CLIENT)
public final class q2997348aa27a422480aea29cbfd800b1ababa extends q2997348aa27a422480aea29cbfd800b1bbaababb {
   private static final String[] aa;
   private static final int ab;
   private static final Integer[] a;
   private static final long[] ba;
   private final q2997348aa27a422480aea29cbfd800b1abaaaaabb bb;
   private static final long[] aaa;
   private static final Integer[] aab;
   private static final Long[] aba;
   private static final Object[] aaaa;
   private static final String[] bbb;
   private int abb;
   private static final String[] baa;
   private static final int[] bba;
   private static final long[] bab;

   private static int aa(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & aba(a(1131382324, -1512373770 ^ -454406879), 8009909370727649318L)) ^ abb(a(1131382325, -1512373770 ^ -1817488307), 410931364808495073L);

      try {
         if (a[var3] == null) {
            a[var3] = (int)(bab[var3] ^ var1);
         }
      } catch (MatchException var4) {
         throw var4;
      }

      return a[var3];
   }

   public void baba() {
      // $FF: Couldn't be decompiled
   }

   private boolean ab(class_310 param1) {
      // $FF: Couldn't be decompiled
   }

   public void ababb() {
      this.ba();
   }

   public q2997348aa27a422480aea29cbfd800b1ababa() {
      int var1 = -566471245;
      super((Object)q2997348aa27a422480aea29cbfd800b1bbbbbbab.abbb(aaa(abb(a(1131382372, var1 ^ 12850784), 1750557194910338565L), abb(a(1131382373, var1 ^ 529936724), 1539454018735997650L))), q2997348aa27a422480aea29cbfd800b1aabbaaaaa.bba, (Object)q2997348aa27a422480aea29cbfd800b1bbbbbbab.abbb(aaa(abb(a(1131382374, var1 ^ -534792319), 8011209080419515734L), abb(a(1131382375, var1 ^ 1477314868), 6744293909746239635L))));
      this.bb = (q2997348aa27a422480aea29cbfd800b1abaaaaabb)this.aaabbbbb(new q2997348aa27a422480aea29cbfd800b1abaaaaabb(q2997348aa27a422480aea29cbfd800b1bbbbbbab.abbb(aaa(abb(a(1131382368, var1 ^ 726627879), 5707500813503453963L), abb(a(1131382369, var1 ^ 2124229719), 328679201751666808L))), (double)3.0F, (double)3.0F, (double)20.0F, (double)1.0F));
      this.abb = aa(abb(a(1131382370, var1 ^ -1424915933), 6495714975196873966L), aba(a(1131382371, var1 ^ -1113648460), 6800865369659937686L));
   }

   static {
      // $FF: Couldn't be decompiled
   }

   private void ba() {
      this.abb = aa(abb(a(1131382380, 409881968 ^ -1809165272), 2949495280467899683L), aba(a(1131382381, 409881968 ^ -1679696393), 2691413675956238959L));
   }

   static boolean bb(int param0, int param1) {
      // $FF: Couldn't be decompiled
   }

   private static String aaa(int param0, int param1) {
      // $FF: Couldn't be decompiled
   }

   private boolean aab(class_310 param1) {
      // $FF: Couldn't be decompiled
   }

   private static long aba(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ a(1131382632, 80027371 ^ -908606564)) & a(1131382633, 80027371 ^ -491959096);
      if (aba[var3] == null) {
         aba[var3] = ba[var3] ^ var1;
      }

      return aba[var3];
   }

   private static int a(int var0, int var1) {
      int var2 = bba[var0 ^ 1131382324] ^ var1 ^ var0;
      var2 -= 37354;
      var2 -= 44076;
      var2 -= 49144;
      var2 ^= 42889;
      var2 -= 29360;
      var2 -= 51287;
      var2 += 42587;
      var2 ^= 38821;
      return var2;
   }

   public void aabaa() {
      this.ba();
   }

   private static String b(int var0, char var1, char var2) {
      int var3 = var2 ^ 9227;
      char[] var4 = bbb[var3].toCharArray();
      StackTraceElement[] var5 = (StackTraceElement[])aaaa[var3];
      StackTraceElement[] var6;
      if (var5 != null) {
         var6 = var5;
      } else {
         var6 = (new Throwable()).getStackTrace();
         aaaa[var3] = var6;
      }

      StackTraceElement var7 = var6[1];
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 717;
      int var9 = 0;

      do {
         int var10 = var4[var9] + 13607;
         var10 += 35920;
         var10 -= 40967;
         var10 -= 3147;
         var10 ^= 51002;
         var10 -= 55039;
         var10 -= 30704;
         var10 += 30519;
         var10 -= 23809;
         var10 ^= 63145;
         var4[var9] = (char)(var10 ^ var8 ^ var1 ^ var0 >> 16);
         ++var9;
      } while(var9 < var4.length);

      return (new String(var4)).intern();
   }

   private static int abb(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ a(1131382634, -1747203535 ^ -1072571561);
      if (aab[var3] == null) {
         aab[var3] = (int)(aaa[var3] ^ var1);
      }

      return aab[var3];
   }
}
