package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum q2997348aa27a422480aea29cbfd800b1aaaaabbab {
   private static final q2997348aa27a422480aea29cbfd800b1aaaaabbab[] a;
   private static final String[] bb;
   private static final Object[] aaa;
   private static final int[] ba;
   public static final q2997348aa27a422480aea29cbfd800b1aaaaabbab b;
   public static final q2997348aa27a422480aea29cbfd800b1aaaaabbab aa;
   public static final q2997348aa27a422480aea29cbfd800b1aaaaabbab ab;

   static {
      // $FF: Couldn't be decompiled
   }

   private static q2997348aa27a422480aea29cbfd800b1aaaaabbab[] a() {
      return new q2997348aa27a422480aea29cbfd800b1aaaaabbab[]{ab, aa, b};
   }

   public static q2997348aa27a422480aea29cbfd800b1aaaaabbab aa(String var0) {
      return (q2997348aa27a422480aea29cbfd800b1aaaaabbab)Enum.valueOf(q2997348aa27a422480aea29cbfd800b1aaaaabbab.class, var0);
   }

   private static String ab(int var0, int var1) {
      int var3 = var0 ^ -1275170136;
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
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ -1224077981;
      int var8 = 0;

      do {
         short var9;
         switch (var8 & 31) {
            case 0:
            default:
               var9 = 147;
               break;
            case 1:
               var9 = 150;
               break;
            case 2:
               var9 = 161;
               break;
            case 3:
               var9 = 58;
               break;
            case 4:
               var9 = 245;
               break;
            case 5:
               var9 = 241;
               break;
            case 6:
               var9 = 180;
               break;
            case 7:
               var9 = 203;
               break;
            case 8:
               var9 = 102;
               break;
            case 9:
               var9 = 91;
               break;
            case 10:
               var9 = 16;
               break;
            case 11:
               var9 = 230;
               break;
            case 12:
               var9 = 159;
               break;
            case 13:
               var9 = 0;
               break;
            case 14:
               var9 = 63;
               break;
            case 15:
               var9 = 134;
               break;
            case 16:
               var9 = 111;
               break;
            case 17:
               var9 = 122;
               break;
            case 18:
               var9 = 11;
               break;
            case 19:
               var9 = 200;
               break;
            case 20:
               var9 = 195;
               break;
            case 21:
               var9 = 9;
               break;
            case 22:
               var9 = 249;
               break;
            case 23:
               var9 = 249;
               break;
            case 24:
               var9 = 197;
               break;
            case 25:
               var9 = 109;
               break;
            case 26:
               var9 = 176;
               break;
            case 27:
               var9 = 24;
               break;
            case 28:
               var9 = 4;
               break;
            case 29:
               var9 = 71;
               break;
            case 30:
               var9 = 75;
               break;
            case 31:
               var9 = 247;
         }

         var4[var8] = (char)(var4[var8] ^ var9 ^ var1 >> 16 ^ var7);
         ++var8;
      } while(var8 < var4.length);

      return (new String(var4)).intern();
   }

   private static int b(int var0, int var1) {
      int var2 = ba[var0 ^ -294649661] ^ var1 ^ var0;
      var2 += 56270;
      var2 += 8016;
      var2 -= 10528;
      var2 -= 21040;
      var2 ^= 1804;
      var2 ^= 43746;
      var2 += 43997;
      var2 += 64506;
      var2 ^= 10219;
      return var2;
   }
}
