package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import com.google.gson.JsonObject;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.Set;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
final class q2997348aa27a422480aea29cbfd800b1aaaaabbba {
   private static final long[] aa;
   double ab;
   double ba;
   double bb;
   private static final double aaa = (double)1.75F;
   private final EnumMap aab;
   double aba;
   private long abb;
   double baa;
   private static final double bab = 0.36;
   private boolean bba;
   q2997348aa27a422480aea29cbfd800b1aaaaab bbb;
   double aaaa;
   double aaab;
   private final Set aaba;
   q2997348aa27a422480aea29cbfd800b1aabbaaaaa aabb;
   private static final String[] abaaa;
   double abaa;
   private boolean abab;
   private boolean abba;
   private static final long[] abbb;
   private static final String[] baaa;
   private static final double baab = (double)380.0F;
   q2997348aa27a422480aea29cbfd800b1aabaababa baba;
   private static final double babb = (double)420.0F;
   private static final Integer[] b;
   private static final Object[] abaab;
   double bbaa;
   private static final long[] bbab;
   double a;
   double bbba;
   private long bbbb;
   private static final Long[] aaaaa;
   private static final double aaaab = (double)680.0F;
   private static final String[] aaaba;
   q2997348aa27a422480aea29cbfd800b1ababbabaa aaabb;
   private static final double aabaa = (double)396.0F;
   double aabab;
   private static final int[] aabbb;
   private static final Integer[] aabba;

   void aa(JsonObject param1) {
      // $FF: Couldn't be decompiled
   }

   void ab(q2997348aa27a422480aea29cbfd800b1aabbaaaaa var1, double var2) {
      this.aab.put(var1, Math.max((double)0.0F, var2));
   }

   boolean ba(q2997348aa27a422480aea29cbfd800b1bbaababb param1) {
      // $FF: Couldn't be decompiled
   }

   private void bb(int param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   private static q2997348aa27a422480aea29cbfd800b1ababbabaa aaa(JsonObject param0, String param1, q2997348aa27a422480aea29cbfd800b1ababbabaa param2) {
      // $FF: Couldn't be decompiled
   }

   private double aab(int var1) {
      return bab((double)396.0F, (double)380.0F, Math.max((double)380.0F, (double)var1 - (double)54.0F));
   }

   double aba(q2997348aa27a422480aea29cbfd800b1aabbaaaaa var1) {
      return (Double)this.aab.getOrDefault(var1, (double)0.0F);
   }

   private static Long abb(JsonObject param0, String param1) {
      // $FF: Couldn't be decompiled
   }

   private static int baa(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ b(-1725447332, -729780517 ^ -1821717281);
      if (b[var3] == null) {
         b[var3] = (int)(bbab[var3] ^ var1);
      }

      return b[var3];
   }

   private static double bab(double var0, double var2, double var4) {
      return Math.max(var2, Math.min(var4, var0));
   }

   private static String bba(long param0) {
      // $FF: Couldn't be decompiled
   }

   void bbb(int param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   void aaaa(long var1) {
      this.abba = true;
      this.bbbb = var1;
   }

   void aaab() {
      this.abba = false;
   }

   void aaba(q2997348aa27a422480aea29cbfd800b1bbaababb param1) {
      // $FF: Couldn't be decompiled
   }

   static {
      // $FF: Couldn't be decompiled
   }

   void aabb(int param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   private static double abaa(JsonObject param0, Enum param1, double param2) {
      // $FF: Couldn't be decompiled
   }

   private static int b(int var0, int var1) {
      int var2 = aabbb[var0 ^ -1725447312] ^ var1 ^ var0;
      var2 ^= 53221;
      var2 ^= 14299;
      var2 ^= 13670;
      var2 += 23002;
      var2 ^= 60432;
      var2 ^= 41632;
      var2 -= 57762;
      var2 -= 57925;
      var2 -= 59028;
      return var2;
   }

   JsonObject abab() {
      // $FF: Couldn't be decompiled
   }

   q2997348aa27a422480aea29cbfd800b1aaaaabbba() {
      this.aabb = q2997348aa27a422480aea29cbfd800b1aabbaaaaa.bba;
      this.bbb = q2997348aa27a422480aea29cbfd800b1aaaaab.aa;
      this.baba = q2997348aa27a422480aea29cbfd800b1aabaababa.bbab;
      this.aaabb = q2997348aa27a422480aea29cbfd800b1ababbabaa.a;
      int var10000 = q2997348aa27a422480aea29cbfd800b1bbabab.aaab;
      this.aab = new EnumMap(q2997348aa27a422480aea29cbfd800b1aabbaaaaa.class);
      this.aaba = new HashSet();
      q2997348aa27a422480aea29cbfd800b1aabbaaaaa[] var2 = q2997348aa27a422480aea29cbfd800b1aabbaaaaa.values();
      int var1 = var10000;

      for(q2997348aa27a422480aea29cbfd800b1aabbaaaaa var5 : var2) {
         this.aab.put(var5, (double)0.0F);
         if (var1 != 0) {
            break;
         }
      }

   }

   boolean abba(q2997348aa27a422480aea29cbfd800b1bbaababb param1) {
      // $FF: Couldn't be decompiled
   }

   private static long abbb(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ b(-1725447379, -521276458 ^ -31125287)) & b(-1725447378, -521276458 ^ 767320178);
      if (aaaaa[var3] == null) {
         aaaaa[var3] = abbb[var3] ^ var1;
      }

      return aaaaa[var3];
   }

   private static Long a(String param0) {
      // $FF: Couldn't be decompiled
   }

   void baaa(q2997348aa27a422480aea29cbfd800b1bbaababb var1) {
      try {
         if (var1 != null) {
            this.aaba.remove(var1.aaabaaaa());
         }

      } catch (RuntimeException var2) {
         throw var2;
      }
   }

   private static String baab(int param0, int param1) {
      // $FF: Couldn't be decompiled
   }

   private double baba(int var1) {
      return bab((double)680.0F, (double)420.0F, Math.max((double)420.0F, (double)var1 - (double)16.0F));
   }

   private static double babb(JsonObject param0, String param1, double param2) {
      // $FF: Couldn't be decompiled
   }

   void bbaa(int var1, int var2) {
      this.bbaa = bab(this.bbaa, (double)420.0F, Math.max((double)420.0F, (double)var1 - (double)12.0F));
      this.aaaa = bab(this.aaaa, (double)380.0F, Math.max((double)380.0F, (double)var2 - (double)48.0F));
      this.a = bab(this.a, (double)4.0F, Math.max((double)4.0F, (double)var1 - this.bbaa - (double)4.0F));
      this.aba = bab(this.aba, (double)4.0F, Math.max((double)4.0F, (double)var2 - this.aaaa - (double)8.0F));
      this.ba = bab(this.ba, (double)4.0F, Math.max((double)4.0F, (double)var1 - (double)356.0F));
      this.bb = bab(this.bb, (double)4.0F, Math.max((double)4.0F, (double)var2 - (double)34.0F));
   }

   void bbab(q2997348aa27a422480aea29cbfd800b1bbaababb param1) {
      // $FF: Couldn't be decompiled
   }

   private static int bbba(int param0, long param1) {
      // $FF: Couldn't be decompiled
   }

   private static String aaabb(int var0, char var1, int var2) {
      int var3 = var2 ^ '쏘';
      char[] var4 = abaaa[var3].toCharArray();
      StackTraceElement[] var5 = (StackTraceElement[])abaab[var3];
      StackTraceElement[] var6;
      if (var5 != null) {
         var6 = var5;
      } else {
         var6 = (new Throwable()).getStackTrace();
         abaab[var3] = var6;
      }

      StackTraceElement var7 = var6[1];
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 99;
      int var9 = 0;

      do {
         int var10 = var4[var9] + '휶';
         var10 -= 1858;
         var10 -= 22564;
         var10 += 18558;
         var10 ^= 11905;
         var10 += 26516;
         var4[var9] = (char)(var10 ^ var8 ^ var1 ^ var0 >> 16);
         ++var9;
      } while(var9 < var4.length);

      return (new String(var4)).intern();
   }

   boolean bbbb(long param1) {
      // $FF: Couldn't be decompiled
   }

   void aaaaa() {
      this.aaba.clear();
      this.bba = false;
   }

   private static Enum aaaab(JsonObject param0, String param1, Enum[] param2, Enum param3) {
      // $FF: Couldn't be decompiled
   }

   private static String aaaba(JsonObject param0, String param1, String param2) {
      // $FF: Couldn't be decompiled
   }
}
