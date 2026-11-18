package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public final class q2997348aa27a422480aea29cbfd800b1aabbaaa extends q2997348aa27a422480aea29cbfd800b1bbaababb {
   private final q2997348aa27a422480aea29cbfd800b1abaaaaabb aa;
   private final q2997348aa27a422480aea29cbfd800b1bbbabaaa ab;
   private static final String[] a;
   private static final long[] ba;
   private static final int[] aab;
   private static final String[] aba;
   private static final Integer[] bb;
   private static final Object[] abb;
   private static final String[] aaa;

   private static int a(int var0, int var1) {
      int var2 = aab[var0 ^ -915900858] ^ var1 ^ var0;
      var2 -= 58755;
      var2 += 8196;
      var2 -= 18158;
      var2 -= 63764;
      var2 += 29377;
      var2 ^= 49509;
      var2 -= 30878;
      var2 ^= 62711;
      var2 ^= 27887;
      var2 -= 28224;
      return var2;
   }

   public double aa(double param1) {
      // $FF: Couldn't be decompiled
   }

   private static String b(int var0, int var1, char var2) {
      int var3 = var0 ^ 29776;
      char[] var4 = aba[var3].toCharArray();
      StackTraceElement[] var5 = (StackTraceElement[])abb[var3];
      StackTraceElement[] var6;
      if (var5 != null) {
         var6 = var5;
      } else {
         var6 = (new Throwable()).getStackTrace();
         abb[var3] = var6;
      }

      StackTraceElement var7 = var6[1];
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 9031;
      int var9 = 0;

      do {
         int var10 = var4[var9] - 568;
         var10 -= 48810;
         var10 += 50943;
         var10 ^= 39772;
         var10 ^= 45191;
         var10 ^= 3017;
         var10 -= 27363;
         var10 += 37487;
         var10 -= 38979;
         var10 ^= 54717;
         var4[var9] = (char)(var10 ^ var8 ^ var2 ^ var1 >> 16);
         ++var9;
      } while(var9 < var4.length);

      return (new String(var4)).intern();
   }

   public q2997348aa27a422480aea29cbfd800b1aabbaaa() {
      int var1 = -495800096;
      super((Object)q2997348aa27a422480aea29cbfd800b1bbbbbbab.abbb(bb(ab(a(-915900832, var1 ^ -259975155), 2454188969885797846L), ab(a(-915900831, var1 ^ -1097286016), 6599817534835644687L))), q2997348aa27a422480aea29cbfd800b1aabbaaaaa.bab, (Object)q2997348aa27a422480aea29cbfd800b1bbbbbbab.abbb(bb(ab(a(-915900818, var1 ^ 1528138076), 2617133859965554291L), ab(a(-915900817, var1 ^ -760413700), 1114967137721809830L))));
      this.ab = (q2997348aa27a422480aea29cbfd800b1bbbabaaa)this.aaabbbbb(new q2997348aa27a422480aea29cbfd800b1bbbabaaa(q2997348aa27a422480aea29cbfd800b1bbbbbbab.abbb(bb(ab(a(-915900820, var1 ^ -1243312956), 4515193951683097993L), ab(a(-915900819, var1 ^ -1675551813), 6701814096350168882L))), q2997348aa27a422480aea29cbfd800b1ababaaab.class, q2997348aa27a422480aea29cbfd800b1ababaaab.aa));
      this.aa = (q2997348aa27a422480aea29cbfd800b1abaaaaabb)this.aaabbbbb((q2997348aa27a422480aea29cbfd800b1abaaaaabb)(new q2997348aa27a422480aea29cbfd800b1abaaaaabb(q2997348aa27a422480aea29cbfd800b1bbbbbbab.abbb(bb(ab(a(-915900822, var1 ^ 683865917), 3746275624149668381L), ab(a(-915900821, var1 ^ -555974904), 6108419710727660835L))), 1.78, (double)0.5F, (double)3.0F, 0.01)).aaaaa(this::ba));
   }

   public String abbaa() {
      return ((q2997348aa27a422480aea29cbfd800b1ababaaab)this.ab.abbb()).toString();
   }

   private static int ab(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ a(-915900824, -900643771 ^ -1886667105);
      if (bb[var3] == null) {
         bb[var3] = (int)(ba[var3] ^ var1);
      }

      return bb[var3];
   }

   static {
      // $FF: Couldn't be decompiled
   }

   private boolean ba() {
      boolean var10000;
      try {
         try {
            if (this.ab.abbb() == q2997348aa27a422480aea29cbfd800b1ababaaab.bb) {
               var10000 = true;
               return var10000;
            }
         } catch (IllegalStateException var1) {
            throw var1;
         }
      } catch (MatchException var2) {
         throw var2;
      }

      var10000 = false;
      return var10000;
   }

   private static String bb(int param0, int param1) {
      // $FF: Couldn't be decompiled
   }
}
