package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum q2997348aa27a422480aea29cbfd800b1aabbaaaaa {
   private static final Object[] aaba;
   private static final long[] aa;
   private static final Integer[] a;
   private static final Integer[] ab;
   private static final Long[] b;
   private static final int[] aaaa;
   private static final long[] bb;
   public static final q2997348aa27a422480aea29cbfd800b1aabbaaaaa aaa;
   public static final q2997348aa27a422480aea29cbfd800b1aabbaaaaa aab;
   public static final q2997348aa27a422480aea29cbfd800b1aabbaaaaa aba;
   public static final q2997348aa27a422480aea29cbfd800b1aabbaaaaa abb;
   private static final long[] baa;
   public static final q2997348aa27a422480aea29cbfd800b1aabbaaaaa bab;
   private static final String[] aaab;
   public static final q2997348aa27a422480aea29cbfd800b1aabbaaaaa bba;
   public static final q2997348aa27a422480aea29cbfd800b1aabbaaaaa bbb;

   static {
      // $FF: Couldn't be decompiled
   }

   private static int aa(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ b(-1904291277, 792140008 ^ 445887272);
      if (ab[var3] == null) {
         ab[var3] = (int)(aa[var3] ^ var1);
      }

      return ab[var3];
   }

   private static int b(int var0, int var1) {
      int var2 = aaaa[var0 ^ -1904291277] ^ var1 ^ var0;
      var2 ^= 56440;
      var2 -= 55317;
      var2 += 17044;
      var2 ^= 33852;
      var2 += 13674;
      var2 -= 11936;
      var2 -= 14514;
      var2 -= 4077;
      var2 -= 63130;
      var2 -= 57155;
      return var2;
   }

   private static String aaa(int var0, int var1) {
      int var3 = var0 ^ 1640358134;
      char[] var4 = aaab[var3].toCharArray();
      StackTraceElement[] var2 = (StackTraceElement[])aaba[var3];
      StackTraceElement[] var5;
      if (var2 != null) {
         var5 = var2;
      } else {
         var5 = (new Throwable()).getStackTrace();
         aaba[var3] = var5;
      }

      StackTraceElement var6 = var5[1];
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ -635751671;
      int var8 = 0;

      do {
         short var9;
         switch (var8 & 31) {
            case 0:
            default:
               var9 = 231;
               break;
            case 1:
               var9 = 31;
               break;
            case 2:
               var9 = 184;
               break;
            case 3:
               var9 = 132;
               break;
            case 4:
               var9 = 26;
               break;
            case 5:
               var9 = 34;
               break;
            case 6:
               var9 = 48;
               break;
            case 7:
               var9 = 39;
               break;
            case 8:
               var9 = 254;
               break;
            case 9:
               var9 = 75;
               break;
            case 10:
               var9 = 138;
               break;
            case 11:
               var9 = 76;
               break;
            case 12:
               var9 = 251;
               break;
            case 13:
               var9 = 62;
               break;
            case 14:
               var9 = 118;
               break;
            case 15:
               var9 = 63;
               break;
            case 16:
               var9 = 245;
               break;
            case 17:
               var9 = 157;
               break;
            case 18:
               var9 = 37;
               break;
            case 19:
               var9 = 24;
               break;
            case 20:
               var9 = 105;
               break;
            case 21:
               var9 = 246;
               break;
            case 22:
               var9 = 150;
               break;
            case 23:
               var9 = 46;
               break;
            case 24:
               var9 = 90;
               break;
            case 25:
               var9 = 124;
               break;
            case 26:
               var9 = 234;
               break;
            case 27:
               var9 = 195;
               break;
            case 28:
               var9 = 232;
               break;
            case 29:
               var9 = 215;
               break;
            case 30:
               var9 = 79;
               break;
            case 31:
               var9 = 179;
         }

         var4[var8] = (char)(var4[var8] ^ var9 ^ var1 >> 16 ^ var7);
         ++var8;
      } while(var8 < var4.length);

      return (new String(var4)).intern();
   }

   // $FF: synthetic method
   private static q2997348aa27a422480aea29cbfd800b1aabbaaaaa[] ab() {
      q2997348aa27a422480aea29cbfd800b1aabbaaaaa[] var10000 = new q2997348aa27a422480aea29cbfd800b1aabbaaaaa[bb(aa(b(-1904291231, -1001062849 ^ -1314920795), 3331730174319832289L), ba(b(-1904291232, -1001062849 ^ 1945529328), 3833900679760589261L))];
      var10000[0] = abb;
      var10000[1] = bba;
      var10000[2] = aba;
      var10000[3] = bab;
      var10000[4] = aaa;
      var10000[5] = bbb;
      var10000[bb(aa(b(-1904291225, -1001062849 ^ 128458235), 3686342496087108131L), ba(b(-1904291226, -1001062849 ^ -1373316868), 6705871462767053375L))] = aab;
      return var10000;
   }

   private static long ba(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ b(-1904291227, 1743114498 ^ -1266283387)) & b(-1904291228, 1743114498 ^ 404046957);
      if (b[var3] == null) {
         b[var3] = bb[var3] ^ var1;
      }

      return b[var3];
   }

   public static q2997348aa27a422480aea29cbfd800b1aabbaaaaa a(String var0) {
      return (q2997348aa27a422480aea29cbfd800b1aabbaaaaa)Enum.valueOf(q2997348aa27a422480aea29cbfd800b1aabbaaaaa.class, var0);
   }

   private static int bb(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & ba(b(-1904291221, -1121504618 ^ -650079338), 983019808445632499L)) ^ aa(b(-1904291222, -1121504618 ^ -1611525134), 2019745167377741520L);

      try {
         if (a[var3] == null) {
            a[var3] = (int)(baa[var3] ^ var1);
         }
      } catch (MatchException var4) {
         throw var4;
      }

      return a[var3];
   }
}
