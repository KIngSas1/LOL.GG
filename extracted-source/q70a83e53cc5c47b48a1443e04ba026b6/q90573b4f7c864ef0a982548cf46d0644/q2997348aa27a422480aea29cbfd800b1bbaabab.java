package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
enum q2997348aa27a422480aea29cbfd800b1bbaabab {
   private static final int[] ba;
   private static final q2997348aa27a422480aea29cbfd800b1bbaabab[] a;
   public static final q2997348aa27a422480aea29cbfd800b1bbaabab b;
   private static final String[] bb;
   private static final Object[] aaa;
   public static final q2997348aa27a422480aea29cbfd800b1bbaabab aa;
   public static final q2997348aa27a422480aea29cbfd800b1bbaabab ab;

   private static int b(int var0, int var1) {
      int var2 = ba[var0 ^ -2043681995] ^ var1 ^ var0;
      var2 ^= 44846;
      var2 -= 32999;
      var2 += 10802;
      var2 ^= 17860;
      var2 -= 21949;
      var2 ^= 26258;
      var2 += 7812;
      return var2;
   }

   static {
      // $FF: Couldn't be decompiled
   }

   private static q2997348aa27a422480aea29cbfd800b1bbaabab[] a() {
      return new q2997348aa27a422480aea29cbfd800b1bbaabab[]{ab, b, aa};
   }

   private static String aa(int var0, int var1) {
      int var3 = var0 ^ 2102101465;
      char[] var4 = bb[var3].toCharArray();
      StackTraceElement[] var2 = (StackTraceElement[])aaa[var3];
      StackTraceElement[] var5;
      if (var2 != null) {
         var5 = var2;
      } else {
         var5 = (new Throwable()).getStackTrace();
         aaa[var3] = var5;
      }

      StackTraceElement var6 = var5[1];
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ 1047145847;
      int var8 = 0;

      do {
         short var9;
         switch (var8 & 31) {
            case 0:
            default:
               var9 = 228;
               break;
            case 1:
               var9 = 202;
               break;
            case 2:
               var9 = 30;
               break;
            case 3:
               var9 = 211;
               break;
            case 4:
               var9 = 213;
               break;
            case 5:
               var9 = 133;
               break;
            case 6:
               var9 = 228;
               break;
            case 7:
               var9 = 207;
               break;
            case 8:
               var9 = 246;
               break;
            case 9:
               var9 = 144;
               break;
            case 10:
               var9 = 179;
               break;
            case 11:
               var9 = 95;
               break;
            case 12:
               var9 = 131;
               break;
            case 13:
               var9 = 31;
               break;
            case 14:
               var9 = 155;
               break;
            case 15:
               var9 = 206;
               break;
            case 16:
               var9 = 41;
               break;
            case 17:
               var9 = 26;
               break;
            case 18:
               var9 = 126;
               break;
            case 19:
               var9 = 89;
               break;
            case 20:
               var9 = 135;
               break;
            case 21:
               var9 = 241;
               break;
            case 22:
               var9 = 71;
               break;
            case 23:
               var9 = 186;
               break;
            case 24:
               var9 = 202;
               break;
            case 25:
               var9 = 94;
               break;
            case 26:
               var9 = 211;
               break;
            case 27:
               var9 = 5;
               break;
            case 28:
               var9 = 78;
               break;
            case 29:
               var9 = 234;
               break;
            case 30:
               var9 = 83;
               break;
            case 31:
               var9 = 18;
         }

         var4[var8] = (char)(var4[var8] ^ var9 ^ var1 >> 16 ^ var7);
         ++var8;
      } while(var8 < var4.length);

      return (new String(var4)).intern();
   }
}
