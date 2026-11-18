package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
enum q2997348aa27a422480aea29cbfd800b1aaabbbbbb {
   public static final q2997348aa27a422480aea29cbfd800b1aaabbbbbb a;
   public static final q2997348aa27a422480aea29cbfd800b1aaabbbbbb aa;
   private static final int[] b;
   public static final q2997348aa27a422480aea29cbfd800b1aaabbbbbb ab;
   private static final String[] bb;
   private static final Object[] aaa;
   private static final q2997348aa27a422480aea29cbfd800b1aaabbbbbb[] ba;

   private static q2997348aa27a422480aea29cbfd800b1aaabbbbbb[] a() {
      return new q2997348aa27a422480aea29cbfd800b1aaabbbbbb[]{aa, ab, a};
   }

   private static String aa(short var0, int var1, char var2) {
      int var7 = var1 ^ -1270935069;
      char[] var6 = bb[var7].toCharArray();
      StackTraceElement[] var8 = (StackTraceElement[])aaa[var7];
      StackTraceElement[] var9;
      if (var8 != null) {
         var9 = var8;
      } else {
         var9 = (new Throwable()).getStackTrace();
         aaa[var7] = var9;
      }

      StackTraceElement var10 = var9[1];
      int var4 = (var10.getClassName().hashCode() ^ var10.getMethodName().hashCode()) >> 16 ^ 724;
      int var5 = 0;

      do {
         int var10002 = var6[var5] ^ var5;
         short var10003;
         switch (var5 % 22) {
            case 0:
            default:
               var10003 = 8;
               break;
            case 1:
               var10003 = 41;
               break;
            case 2:
               var10003 = 173;
               break;
            case 3:
               var10003 = 136;
               break;
            case 4:
               var10003 = 174;
               break;
            case 5:
               var10003 = 40;
               break;
            case 6:
               var10003 = 80;
               break;
            case 7:
               var10003 = 54;
               break;
            case 8:
               var10003 = 40;
               break;
            case 9:
               var10003 = 215;
               break;
            case 10:
               var10003 = 126;
               break;
            case 11:
               var10003 = 116;
               break;
            case 12:
               var10003 = 119;
               break;
            case 13:
               var10003 = 12;
               break;
            case 14:
               var10003 = 51;
               break;
            case 15:
               var10003 = 82;
               break;
            case 16:
               var10003 = 232;
               break;
            case 17:
               var10003 = 8;
               break;
            case 18:
               var10003 = 173;
               break;
            case 19:
               var10003 = 248;
               break;
            case 20:
               var10003 = 206;
               break;
            case 21:
               var10003 = 218;
         }

         var6[var5] = (char)(var10002 ^ var10003 ^ var4 ^ var2 ^ var1 ^ var0);
         ++var5;
      } while(var5 < var6.length);

      return (new String(var6)).intern();
   }

   private static int b(int var0, int var1) {
      int var2 = b[var0 ^ 40056319] ^ var1 ^ var0;
      var2 -= 62951;
      var2 ^= 38789;
      var2 ^= 61729;
      var2 += 58738;
      var2 ^= 5379;
      var2 ^= 65112;
      var2 ^= 28734;
      var2 += 54742;
      var2 += 63012;
      var2 -= 21138;
      return var2;
   }

   static {
      // $FF: Couldn't be decompiled
   }
}
