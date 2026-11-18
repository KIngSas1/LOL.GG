package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
enum q2997348aa27a422480aea29cbfd800b1abaabbbba {
   private static final Long[] aa;
   private static final Object[] aaaab;
   public static final q2997348aa27a422480aea29cbfd800b1abaabbbba ab;
   private static final long[] ba;
   private static final Integer[] bb;
   public static final q2997348aa27a422480aea29cbfd800b1abaabbbba aaa;
   public static final q2997348aa27a422480aea29cbfd800b1abaabbbba aab;
   private static final q2997348aa27a422480aea29cbfd800b1abaabbbba[] aba;
   public static final q2997348aa27a422480aea29cbfd800b1abaabbbba abb;
   public static final q2997348aa27a422480aea29cbfd800b1abaabbbba baa;
   public static final q2997348aa27a422480aea29cbfd800b1abaabbbba bab;
   private final int bba;
   private static final String[] aaaaa;
   private final q2997348aa27a422480aea29cbfd800b1babba b;
   private final boolean bbb;
   private static final long[] aaaa;
   public static final q2997348aa27a422480aea29cbfd800b1abaabbbba a;
   public static final q2997348aa27a422480aea29cbfd800b1abaabbbba aaab;
   public static final q2997348aa27a422480aea29cbfd800b1abaabbbba aaba;
   public static final q2997348aa27a422480aea29cbfd800b1abaabbbba aabb;
   public static final q2997348aa27a422480aea29cbfd800b1abaabbbba abaa;
   private static final Integer[] abab;
   public static final q2997348aa27a422480aea29cbfd800b1abaabbbba abba;
   public static final q2997348aa27a422480aea29cbfd800b1abaabbbba abbb;
   private static final int[] bbbb;
   private static final long[] baaa;
   public static final q2997348aa27a422480aea29cbfd800b1abaabbbba baab;
   public static final q2997348aa27a422480aea29cbfd800b1abaabbbba baba;
   public static final q2997348aa27a422480aea29cbfd800b1abaabbbba babb;
   public static final q2997348aa27a422480aea29cbfd800b1abaabbbba bbaa;
   public static final q2997348aa27a422480aea29cbfd800b1abaabbbba bbab;
   private final q2997348aa27a422480aea29cbfd800b1babbbabb bbba;

   static {
      // $FF: Couldn't be decompiled
   }

   private static int aa(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ a(-1432747805, -799429515 ^ -1972486163);
      if (bb[var3] == null) {
         bb[var3] = (int)(aaaa[var3] ^ var1);
      }

      return bb[var3];
   }

   private static int ab(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & b(a(-1432747806, -1061567187 ^ 2133853031), 2910339128753201544L)) ^ aa(a(-1432747807, -1061567187 ^ -1232960797), 5433620585021556707L);

      try {
         if (abab[var3] == null) {
            abab[var3] = (int)(baaa[var3] ^ var1);
         }
      } catch (MatchException var4) {
         throw var4;
      }

      return abab[var3];
   }

   private static String aaa(int var0, int var1) {
      int var3 = var0 ^ -1328344419;
      char[] var4 = aaaaa[var3].toCharArray();
      StackTraceElement[] var2 = (StackTraceElement[])aaaab[var3];
      StackTraceElement[] var5;
      if (var2 != null) {
         var5 = var2;
      } else {
         var5 = (new Throwable()).getStackTrace();
         aaaab[var3] = var5;
      }

      StackTraceElement var6 = var5[1];
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ 883053264;
      int var8 = 0;

      do {
         short var9;
         switch (var8 & 31) {
            case 0:
            default:
               var9 = 20;
               break;
            case 1:
               var9 = 193;
               break;
            case 2:
               var9 = 169;
               break;
            case 3:
               var9 = 163;
               break;
            case 4:
               var9 = 87;
               break;
            case 5:
               var9 = 144;
               break;
            case 6:
               var9 = 187;
               break;
            case 7:
               var9 = 224;
               break;
            case 8:
               var9 = 190;
               break;
            case 9:
               var9 = 193;
               break;
            case 10:
               var9 = 228;
               break;
            case 11:
               var9 = 255;
               break;
            case 12:
               var9 = 65;
               break;
            case 13:
               var9 = 167;
               break;
            case 14:
               var9 = 172;
               break;
            case 15:
               var9 = 235;
               break;
            case 16:
               var9 = 254;
               break;
            case 17:
               var9 = 226;
               break;
            case 18:
               var9 = 228;
               break;
            case 19:
               var9 = 81;
               break;
            case 20:
               var9 = 165;
               break;
            case 21:
               var9 = 127;
               break;
            case 22:
               var9 = 199;
               break;
            case 23:
               var9 = 50;
               break;
            case 24:
               var9 = 158;
               break;
            case 25:
               var9 = 80;
               break;
            case 26:
               var9 = 103;
               break;
            case 27:
               var9 = 194;
               break;
            case 28:
               var9 = 185;
               break;
            case 29:
               var9 = 203;
               break;
            case 30:
               var9 = 91;
               break;
            case 31:
               var9 = 139;
         }

         var4[var8] = (char)(var4[var8] ^ var9 ^ var1 >> 16 ^ var7);
         ++var8;
      } while(var8 < var4.length);

      return (new String(var4)).intern();
   }

   private q2997348aa27a422480aea29cbfd800b1abaabbbba(int var3, boolean var4, q2997348aa27a422480aea29cbfd800b1babba var5, q2997348aa27a422480aea29cbfd800b1babba var6) {
      this.bba = var3;
      this.bbb = var4;
      this.bbba = new q2997348aa27a422480aea29cbfd800b1babbbabb(var5, var6);
      this.b = var3 <= 4 ? var6 : null;
   }

   private static int a(int var0, int var1) {
      int var2 = bbbb[var0 ^ -1432747805] ^ var1 ^ var0;
      var2 ^= 34689;
      var2 += 47476;
      var2 ^= 47420;
      var2 += 12880;
      var2 ^= 22738;
      var2 ^= 49794;
      var2 += 24974;
      return var2;
   }

   public static q2997348aa27a422480aea29cbfd800b1abaabbbba ba(String var0) {
      return (q2997348aa27a422480aea29cbfd800b1abaabbbba)Enum.valueOf(q2997348aa27a422480aea29cbfd800b1abaabbbba.class, var0);
   }

   private static q2997348aa27a422480aea29cbfd800b1abaabbbba[] bb() {
      int var0 = 1355512862;
      q2997348aa27a422480aea29cbfd800b1abaabbbba[] var10000 = new q2997348aa27a422480aea29cbfd800b1abaabbbba[ab(aa(a(-1432747994, var0 ^ -1860337250), 6825978088195091567L), b(a(-1432747995, var0 ^ 1940724310), 1343191680300746914L))];
      var10000[0] = abaa;
      var10000[1] = bbaa;
      var10000[2] = aaa;
      var10000[3] = abbb;
      var10000[4] = bab;
      var10000[5] = aaab;
      var10000[ab(aa(a(-1432747996, var0 ^ 794213362), 7937809525452320812L), b(a(-1432747989, var0 ^ 592007410), 4658494111776984765L))] = babb;
      var10000[ab(aa(a(-1432747990, var0 ^ -10031997), 3812279949436892915L), b(a(-1432747991, var0 ^ -19361258), 8775727270061097029L))] = baa;
      var10000[ab(aa(a(-1432747992, var0 ^ 298668051), 5707375243855239365L), b(a(-1432747985, var0 ^ 1567271622), 4105332022163147367L))] = baba;
      var10000[ab(aa(a(-1432747986, var0 ^ -1033122584), 3033190746343148728L), b(a(-1432747987, var0 ^ -1408646909), 7597229742460334592L))] = bbab;
      var10000[ab(aa(a(-1432747988, var0 ^ -97037134), 6554913619656865451L), b(a(-1432747981, var0 ^ 1393637169), 5423595789876492055L))] = abba;
      var10000[ab(aa(a(-1432747982, var0 ^ -1110086798), 5830701799471831951L), b(a(-1432747983, var0 ^ 371557071), 2302205448044848171L))] = baab;
      var10000[ab(aa(a(-1432747984, var0 ^ -779591062), 5340077468100729291L), b(a(-1432747977, var0 ^ 1216511089), 2699324053826056115L))] = aaba;
      var10000[ab(aa(a(-1432747978, var0 ^ -162994588), 641767902975298806L), b(a(-1432747979, var0 ^ -1900640377), 1042096930225510920L))] = abb;
      var10000[ab(aa(a(-1432747980, var0 ^ 2070319399), 411986364213229232L), b(a(-1432747973, var0 ^ 245754789), 7448244381864476804L))] = aabb;
      var10000[ab(aa(a(-1432747974, var0 ^ 1579715282), 2572557782918778552L), b(a(-1432747975, var0 ^ -1051515299), 431943480624953236L))] = ab;
      var10000[ab(aa(a(-1432747976, var0 ^ 331195467), 815852851026087701L), b(a(-1432747969, var0 ^ 577703770), 5998565867473718297L))] = a;
      var10000[ab(aa(a(-1432747970, var0 ^ 1724996438), 8683815647256248017L), b(a(-1432747971, var0 ^ -757796645), 143427674683521076L))] = aab;
      return var10000;
   }

   private static long b(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ a(-1432747972, -1571656262 ^ 157651941)) & a(-1432748029, -1571656262 ^ 1654166124);
      if (aa[var3] == null) {
         aa[var3] = ba[var3] ^ var1;
      }

      return aa[var3];
   }
}
