package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
enum q2997348aa27a422480aea29cbfd800b1baabaaa {
   private static final Integer[] aa;
   private static final Long[] ab;
   private static final q2997348aa27a422480aea29cbfd800b1baabaaa[] ba;
   private static final String[] aaab;
   private static final long[] b;
   public static final q2997348aa27a422480aea29cbfd800b1baabaaa bb;
   private static final long[] aaa;
   public static final q2997348aa27a422480aea29cbfd800b1baabaaa aab;
   public static final q2997348aa27a422480aea29cbfd800b1baabaaa aba;
   private static final Object[] aaba;
   public static final q2997348aa27a422480aea29cbfd800b1baabaaa abb;
   private static final int[] aaaa;
   public static final q2997348aa27a422480aea29cbfd800b1baabaaa baa;
   private static final long[] bab;
   private static final Integer[] a;
   public static final q2997348aa27a422480aea29cbfd800b1baabaaa bba;
   public static final q2997348aa27a422480aea29cbfd800b1baabaaa bbb;

   private static String aaa(int var0, int var1, short var2, char var3, char var4) {
      int var9 = var0 ^ -1186393368;
      char[] var8 = aaab[var9].toCharArray();
      StackTraceElement[] var10 = (StackTraceElement[])aaba[var9];
      StackTraceElement[] var11;
      if (var10 != null) {
         var11 = var10;
      } else {
         var11 = (new Throwable()).getStackTrace();
         aaba[var9] = var11;
      }

      StackTraceElement var12 = var11[1];
      int var6 = (var12.getClassName().hashCode() ^ var12.getMethodName().hashCode()) >> 16 ^ 13058;
      int var7 = 0;

      do {
         int var10002 = var8[var7] ^ '뮼';
         short var10003;
         switch (var7 % 4) {
            case 0:
            default:
               var10003 = 120;
               break;
            case 1:
               var10003 = 116;
               break;
            case 2:
               var10003 = 194;
               break;
            case 3:
               var10003 = 90;
         }

         var8[var7] = (char)(var10002 ^ var10003 ^ var7 ^ var6 ^ var0 ^ var4 ^ var3 ^ var1 ^ var2);
         ++var7;
      } while(var7 < var8.length);

      return (new String(var8)).intern();
   }

   private static int aa(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ b(1977235627, 1778358092 ^ -1355975148);
      if (aa[var3] == null) {
         aa[var3] = (int)(bab[var3] ^ var1);
      }

      return aa[var3];
   }

   private static long ab(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ b(1977235626, 837285302 ^ 795051086)) & b(1977235625, 837285302 ^ -130084813);
      if (ab[var3] == null) {
         ab[var3] = b[var3] ^ var1;
      }

      return ab[var3];
   }

   private static q2997348aa27a422480aea29cbfd800b1baabaaa[] a() {
      q2997348aa27a422480aea29cbfd800b1baabaaa[] var10000 = new q2997348aa27a422480aea29cbfd800b1baabaaa[bb(aa(b(1977235624, 1046034465 ^ -1094556414), 2707523318830284940L), ab(b(1977235631, 1046034465 ^ -1666404586), 3973346928893103922L))];
      var10000[0] = bba;
      var10000[1] = bb;
      var10000[2] = bbb;
      var10000[3] = baa;
      var10000[4] = abb;
      var10000[5] = aab;
      var10000[bb(aa(b(1977235630, 1046034465 ^ 125371093), 5221029446977112882L), ab(b(1977235629, 1046034465 ^ -2068847938), 6212132497766654497L))] = aba;
      return var10000;
   }

   static {
      // $FF: Couldn't be decompiled
   }

   public static q2997348aa27a422480aea29cbfd800b1baabaaa ba(String var0) {
      return (q2997348aa27a422480aea29cbfd800b1baabaaa)Enum.valueOf(q2997348aa27a422480aea29cbfd800b1baabaaa.class, var0);
   }

   private static int bb(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & ab(b(1977235628, 1667930888 ^ -1939053587), 6263408215420348585L)) ^ aa(b(1977235619, 1667930888 ^ -904358130), 6178754423917040179L);

      try {
         if (a[var3] == null) {
            a[var3] = (int)(aaa[var3] ^ var1);
         }
      } catch (MatchException var4) {
         throw var4;
      }

      return a[var3];
   }

   private static int b(int var0, int var1) {
      int var2 = aaaa[var0 ^ 1977235627] ^ var1 ^ var0;
      var2 += 17033;
      var2 += 15872;
      var2 ^= 61600;
      var2 += 59539;
      var2 ^= 54219;
      var2 ^= 10700;
      var2 ^= 20609;
      return var2;
   }
}
