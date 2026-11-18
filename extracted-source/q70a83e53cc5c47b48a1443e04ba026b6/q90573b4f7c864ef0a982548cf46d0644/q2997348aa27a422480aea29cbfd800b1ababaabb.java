package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.ModInitializer;

public final class q2997348aa27a422480aea29cbfd800b1ababaabb implements ModInitializer {
   private static final long[] aa;
   private static final String[] bbb;
   private static String[] ab;
   private static final long[] ba;
   private static final String a;
   private static final int[] bba;
   private static final long[] bb;
   private static final Object[] aaaa;
   public static boolean aaa;
   private static final Integer[] aab;
   private static final long aba;
   public static boolean abb;
   public static final String baa;
   private static final Long[] b;
   private static final Integer[] bab;

   private static String aa(char[] var0, long var1, int var3) {
      int var4 = bb(ab(a(419593135, 1637274916 ^ -981548572), 505558644823328833L), b(a(419593134, 1637274916 ^ -2848293), 1224015780704953389L)) ^ var3;

      for(int var5 = 0; var5 < var0.length; ++var5) {
         int var7 = var4 ^ (int)var1 ^ ~var5;
         int var8 = var7 ^ var3 - var5 * var0.length;
         var4 = -var8 * var3 | var5;
         var0[var5] = (char)(var0[var5] ^ var4);
         int var6 = var5 & bb(ab(a(419593133, 1637274916 ^ 1003151572), 2202543605986363625L), b(a(419593132, 1637274916 ^ -1565330972), 7233396370539030161L));
         var3 = var3 << var6 | var3 >>> -var6;
         var1 ^= (long)var6;
      }

      return new String(var0);
   }

   private static int ab(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ a(419593131, -1086985028 ^ 2082625166);
      if (bab[var3] == null) {
         bab[var3] = (int)(ba[var3] ^ var1);
      }

      return bab[var3];
   }

   private static int a(int var0, int var1) {
      int var2 = bba[var0 ^ 419593135] ^ var1 ^ var0;
      var2 ^= 19848;
      var2 += 45124;
      var2 += 7815;
      var2 ^= 43127;
      var2 -= 22999;
      var2 += 30416;
      var2 += 33677;
      return var2;
   }

   static {
      // $FF: Couldn't be decompiled
   }

   private static void ba() {
      ab[0] = aa(a.toCharArray(), aba, bb(ab(a(419593130, -829770863 ^ -1826529680), 4956487153234868679L), b(a(419593129, -829770863 ^ 1890440886), 892494016201077053L)));
   }

   private static String aaa(int var0, int var1) {
      int var3 = var0 ^ 221318865;
      char[] var4 = bbb[var3].toCharArray();
      StackTraceElement[] var2 = (StackTraceElement[])aaaa[var3];
      StackTraceElement[] var5;
      if (var2 != null) {
         var5 = var2;
      } else {
         var5 = (new Throwable()).getStackTrace();
         aaaa[var3] = var5;
      }

      StackTraceElement var6 = var5[1];
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ 815247006;
      int var8 = 0;

      do {
         short var9;
         switch (var8 & 31) {
            case 0:
            default:
               var9 = 128;
               break;
            case 1:
               var9 = 189;
               break;
            case 2:
               var9 = 144;
               break;
            case 3:
               var9 = 59;
               break;
            case 4:
               var9 = 55;
               break;
            case 5:
               var9 = 12;
               break;
            case 6:
               var9 = 98;
               break;
            case 7:
               var9 = 92;
               break;
            case 8:
               var9 = 97;
               break;
            case 9:
               var9 = 95;
               break;
            case 10:
               var9 = 244;
               break;
            case 11:
               var9 = 21;
               break;
            case 12:
               var9 = 141;
               break;
            case 13:
               var9 = 77;
               break;
            case 14:
               var9 = 228;
               break;
            case 15:
               var9 = 114;
               break;
            case 16:
               var9 = 173;
               break;
            case 17:
               var9 = 107;
               break;
            case 18:
               var9 = 110;
               break;
            case 19:
               var9 = 106;
               break;
            case 20:
               var9 = 21;
               break;
            case 21:
               var9 = 14;
               break;
            case 22:
               var9 = 215;
               break;
            case 23:
               var9 = 132;
               break;
            case 24:
               var9 = 156;
               break;
            case 25:
               var9 = 121;
               break;
            case 26:
               var9 = 6;
               break;
            case 27:
               var9 = 231;
               break;
            case 28:
               var9 = 40;
               break;
            case 29:
               var9 = 144;
               break;
            case 30:
               var9 = 202;
               break;
            case 31:
               var9 = 30;
         }

         var4[var8] = (char)(var4[var8] ^ var9 ^ var1 >> 16 ^ var7);
         ++var8;
      } while(var8 < var4.length);

      return (new String(var4)).intern();
   }

   public void onInitialize() {
   }

   private static int bb(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & b(a(419593128, -929039649 ^ 1537533654), 6037267614133041551L)) ^ ab(a(419593127, -929039649 ^ -1960167199), 751277527718050294L);

      try {
         if (aab[var3] == null) {
            aab[var3] = (int)(aa[var3] ^ var1);
         }
      } catch (MatchException var4) {
         throw var4;
      }

      return aab[var3];
   }

   private static long b(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ a(419593210, -892619183 ^ -321659659)) & a(419593209, -892619183 ^ -1616737378);
      if (b[var3] == null) {
         b[var3] = bb[var3] ^ var1;
      }

      return b[var3];
   }
}
