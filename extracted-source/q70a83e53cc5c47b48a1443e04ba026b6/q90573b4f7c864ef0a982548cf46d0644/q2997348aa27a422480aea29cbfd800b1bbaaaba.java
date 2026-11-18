package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
enum q2997348aa27a422480aea29cbfd800b1bbaaaba {
   public static final q2997348aa27a422480aea29cbfd800b1bbaaaba a;
   private static final String[] bb;
   public static final q2997348aa27a422480aea29cbfd800b1bbaaaba aa;
   public static final q2997348aa27a422480aea29cbfd800b1bbaaaba ab;
   private static final int[] b;
   private static final Object[] aaa;
   private static final q2997348aa27a422480aea29cbfd800b1bbaaaba[] ba;

   private static int b(int var0, int var1) {
      int var2 = b[var0 ^ -1837417052] ^ var1 ^ var0;
      var2 -= 57014;
      var2 ^= 51247;
      var2 += 21526;
      var2 += 41559;
      var2 += 44720;
      var2 ^= 18644;
      var2 ^= 53821;
      var2 -= 50537;
      return var2;
   }

   static {
      // $FF: Couldn't be decompiled
   }

   private static q2997348aa27a422480aea29cbfd800b1bbaaaba[] a() {
      return new q2997348aa27a422480aea29cbfd800b1bbaaaba[]{aa, a, ab};
   }

   private static String aa(int var0, int var1) {
      int var3 = var0 ^ 1927376344;
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
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ 571313855;
      int var8 = 0;

      do {
         short var9;
         switch (var8 & 31) {
            case 0:
            default:
               var9 = 67;
               break;
            case 1:
               var9 = 105;
               break;
            case 2:
               var9 = 149;
               break;
            case 3:
               var9 = 163;
               break;
            case 4:
               var9 = 84;
               break;
            case 5:
               var9 = 18;
               break;
            case 6:
               var9 = 163;
               break;
            case 7:
               var9 = 20;
               break;
            case 8:
               var9 = 41;
               break;
            case 9:
               var9 = 117;
               break;
            case 10:
               var9 = 13;
               break;
            case 11:
               var9 = 181;
               break;
            case 12:
               var9 = 157;
               break;
            case 13:
               var9 = 153;
               break;
            case 14:
               var9 = 83;
               break;
            case 15:
               var9 = 194;
               break;
            case 16:
               var9 = 1;
               break;
            case 17:
               var9 = 42;
               break;
            case 18:
               var9 = 58;
               break;
            case 19:
               var9 = 46;
               break;
            case 20:
               var9 = 254;
               break;
            case 21:
               var9 = 208;
               break;
            case 22:
               var9 = 139;
               break;
            case 23:
               var9 = 95;
               break;
            case 24:
               var9 = 158;
               break;
            case 25:
               var9 = 181;
               break;
            case 26:
               var9 = 86;
               break;
            case 27:
               var9 = 45;
               break;
            case 28:
               var9 = 149;
               break;
            case 29:
               var9 = 195;
               break;
            case 30:
               var9 = 220;
               break;
            case 31:
               var9 = 159;
         }

         var4[var8] = (char)(var4[var8] ^ var9 ^ var1 >> 16 ^ var7);
         ++var8;
      } while(var8 < var4.length);

      return (new String(var4)).intern();
   }
}
