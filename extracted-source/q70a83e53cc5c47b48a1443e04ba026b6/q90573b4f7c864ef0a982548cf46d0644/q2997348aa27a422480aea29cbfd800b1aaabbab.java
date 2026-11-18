package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1297;
import net.minecraft.class_1657;

@Environment(EnvType.CLIENT)
public final class q2997348aa27a422480aea29cbfd800b1aaabbab extends q2997348aa27a422480aea29cbfd800b1bbaababb {
   private static final long[] aa;
   private static volatile q2997348aa27a422480aea29cbfd800b1aaabbab ab;
   private static final String[] a;
   private static final int[] aab;
   private static final Object[] abb;
   private static final Integer[] ba;
   private static final String[] bb;
   private static final String[] aba;
   private final q2997348aa27a422480aea29cbfd800b1aabababab aaa;

   private static String aba(char var0, short var1, int var2, short var3, int var4, byte var5, char var6) {
      int var11 = var2 ^ 1635345199;
      char[] var10 = aba[var11].toCharArray();
      StackTraceElement[] var12 = (StackTraceElement[])abb[var11];
      StackTraceElement[] var13;
      if (var12 != null) {
         var13 = var12;
      } else {
         var13 = (new Throwable()).getStackTrace();
         abb[var11] = var13;
      }

      StackTraceElement var14 = var13[1];
      int var8 = (var14.getClassName().hashCode() ^ var14.getMethodName().hashCode()) >> 16 ^ '镒';

      for(int var9 = 0; var9 < var10.length; ++var9) {
         char var10002 = var10[var9];
         short var10003;
         switch (var9 % 14) {
            case 0:
            default:
               var10003 = 200;
               break;
            case 1:
               var10003 = 9;
               break;
            case 2:
               var10003 = 19;
               break;
            case 3:
               var10003 = 176;
               break;
            case 4:
               var10003 = 110;
               break;
            case 5:
               var10003 = 63;
               break;
            case 6:
               var10003 = 227;
               break;
            case 7:
               var10003 = 220;
               break;
            case 8:
               var10003 = 238;
               break;
            case 9:
               var10003 = 137;
               break;
            case 10:
               var10003 = 155;
               break;
            case 11:
               var10003 = 87;
               break;
            case 12:
               var10003 = 51;
               break;
            case 13:
               var10003 = 207;
         }

         var10[var9] = (char)(var10002 ^ var10003 ^ var9 ^ var1 ^ var5 ^ var8 ^ var4 ^ var0 ^ var6 ^ var2 ^ var3);
      }

      return (new String(var10)).intern();
   }

   private static int aab(int var0, int var1) {
      int var2 = aab[var0 ^ -1884578039] ^ var1 ^ var0;
      var2 -= 62744;
      var2 += 16520;
      var2 += 59612;
      var2 += 7415;
      var2 += 23240;
      var2 += 14326;
      var2 -= 54675;
      return var2;
   }

   public q2997348aa27a422480aea29cbfd800b1aaabbab() {
      int var1 = -622823942;
      super((Object)q2997348aa27a422480aea29cbfd800b1bbbbbbab.abbb(ba(bb(aab(-1884578039, var1 ^ -1430325928), 5867069302223275513L), bb(aab(-1884578040, var1 ^ 1550961300), 5832675304300583877L))), q2997348aa27a422480aea29cbfd800b1aabbaaaaa.aba, (Object)q2997348aa27a422480aea29cbfd800b1bbbbbbab.abbb(ba(bb(aab(-1884578037, var1 ^ 1358876440), 7602567890089182876L), bb(aab(-1884578038, var1 ^ -601901142), 2194167588581885800L))));
      this.aaa = (q2997348aa27a422480aea29cbfd800b1aabababab)this.aaabbbbb(new q2997348aa27a422480aea29cbfd800b1aabababab(q2997348aa27a422480aea29cbfd800b1bbbbbbab.abbb(ba(bb(aab(-1884578035, var1 ^ -1102339817), 6624693076786908508L), bb(aab(-1884578036, var1 ^ -565752162), 2153825470622044512L))), false));
      ab = this;
   }

   private boolean aa(class_1657 param1) {
      // $FF: Couldn't be decompiled
   }

   static {
      // $FF: Couldn't be decompiled
   }

   public static void ab() {
      ab = null;
   }

   private static String ba(int param0, int param1) {
      // $FF: Couldn't be decompiled
   }

   private static int bb(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ aab(-1884578303, 147927803 ^ 1071611873);
      if (ba[var3] == null) {
         ba[var3] = (int)(aa[var3] ^ var1);
      }

      return ba[var3];
   }

   private boolean a(class_1297 param1) {
      // $FF: Couldn't be decompiled
   }

   public static boolean aaa(class_1297 param0, class_1297 param1) {
      // $FF: Couldn't be decompiled
   }

   private boolean b(class_1297 param1, class_1297 param2) {
      // $FF: Couldn't be decompiled
   }
}
