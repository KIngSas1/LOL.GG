package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
enum q2997348aa27a422480aea29cbfd800b1aaabbabab {
   private static final Integer[] aa;
   public static final q2997348aa27a422480aea29cbfd800b1aaabbabab ab;
   private static final Long[] ba;
   public static final q2997348aa27a422480aea29cbfd800b1aaabbabab bb;
   public static final q2997348aa27a422480aea29cbfd800b1aaabbabab aaa;
   public static final q2997348aa27a422480aea29cbfd800b1aaabbabab aab;
   private static final long[] aba;
   public static final q2997348aa27a422480aea29cbfd800b1aaabbabab a;
   public static final q2997348aa27a422480aea29cbfd800b1aaabbabab abb;
   public static final q2997348aa27a422480aea29cbfd800b1aaabbabab baa;
   private static final Integer[] bab;
   private static final long[] bba;
   private static final String[] aabb;
   private static final int[] aaba;
   private static final long[] bbb;
   public static final q2997348aa27a422480aea29cbfd800b1aaabbabab aaaa;
   private static final q2997348aa27a422480aea29cbfd800b1aaabbabab[] aaab;
   private static final Object[] abaa;
   public static final q2997348aa27a422480aea29cbfd800b1aaabbabab b;

   private static int b(int var0, int var1) {
      int var2 = aaba[var0 ^ -107319223] ^ var1 ^ var0;
      var2 ^= 36962;
      var2 += 11765;
      var2 += 61837;
      var2 ^= 49057;
      var2 ^= 25174;
      var2 -= 8645;
      return var2;
   }

   static {
      // $FF: Couldn't be decompiled
   }

   public static q2997348aa27a422480aea29cbfd800b1aaabbabab aa(String var0) {
      return (q2997348aa27a422480aea29cbfd800b1aaabbabab)Enum.valueOf(q2997348aa27a422480aea29cbfd800b1aaabbabab.class, var0);
   }

   private static String aaa(char var0, char var1, short var2, char var3, char var4, int var5, short var6) {
      int var11 = var5 ^ 841791283;
      char[] var10 = aabb[var11].toCharArray();
      StackTraceElement[] var12 = (StackTraceElement[])abaa[var11];
      StackTraceElement[] var13;
      if (var12 != null) {
         var13 = var12;
      } else {
         var13 = (new Throwable()).getStackTrace();
         abaa[var11] = var13;
      }

      StackTraceElement var14 = var13[1];
      int var8 = (var14.getClassName().hashCode() ^ var14.getMethodName().hashCode()) >> 16 ^ '컄';

      for(int var9 = 0; var9 < var10.length; ++var9) {
         char var10002 = var10[var9];
         short var10003;
         switch (var9 % 12) {
            case 0:
            default:
               var10003 = 215;
               break;
            case 1:
               var10003 = 229;
               break;
            case 2:
               var10003 = 191;
               break;
            case 3:
               var10003 = 224;
               break;
            case 4:
               var10003 = 218;
               break;
            case 5:
               var10003 = 7;
               break;
            case 6:
               var10003 = 30;
               break;
            case 7:
               var10003 = 82;
               break;
            case 8:
               var10003 = 225;
               break;
            case 9:
               var10003 = 73;
               break;
            case 10:
               var10003 = 93;
               break;
            case 11:
               var10003 = 245;
         }

         var10[var9] = (char)(var10002 ^ var10003 ^ var3 ^ var4 ^ var0 ^ var2 ^ var5 ^ var8 ^ var6 ^ var1);
      }

      return (new String(var10)).intern();
   }

   private static long ab(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ b(-107319259, -956647184 ^ 1882117873)) & b(-107319260, -956647184 ^ -276458294);
      if (ba[var3] == null) {
         ba[var3] = bba[var3] ^ var1;
      }

      return ba[var3];
   }

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & ab(b(-107319257, -1569343537 ^ 1908063010), 329450092511113212L)) ^ ba(b(-107319258, -1569343537 ^ -1305791036), 8709818984049929272L);

      try {
         if (bab[var3] == null) {
            bab[var3] = (int)(bbb[var3] ^ var1);
         }
      } catch (MatchException var4) {
         throw var4;
      }

      return bab[var3];
   }

   private static int ba(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ b(-107319239, 1796573835 ^ 1157232699);
      if (aa[var3] == null) {
         aa[var3] = (int)(aba[var3] ^ var1);
      }

      return aa[var3];
   }

   private static q2997348aa27a422480aea29cbfd800b1aaabbabab[] bb() {
      int var0 = -403001415;
      q2997348aa27a422480aea29cbfd800b1aaabbabab[] var10000 = new q2997348aa27a422480aea29cbfd800b1aaabbabab[a(ba(b(-107319240, var0 ^ -1959045412), 8285071648498103947L), ab(b(-107319237, var0 ^ 2067285525), 5733587146532673849L))];
      var10000[0] = bb;
      var10000[1] = abb;
      var10000[2] = a;
      var10000[3] = baa;
      var10000[4] = aaa;
      var10000[5] = b;
      var10000[a(ba(b(-107319238, var0 ^ 1885617366), 357907286327255365L), ab(b(-107319235, var0 ^ 2044653418), 1969994555386382908L))] = aaaa;
      var10000[a(ba(b(-107319236, var0 ^ -570935977), 603673831999683983L), ab(b(-107319233, var0 ^ 421451059), 781471918812857438L))] = aab;
      var10000[a(ba(b(-107319234, var0 ^ -1680192778), 3707851083526826073L), ab(b(-107319247, var0 ^ -342646545), 2925213951059507360L))] = ab;
      return var10000;
   }
}
