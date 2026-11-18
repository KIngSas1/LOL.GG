package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
enum q2997348aa27a422480aea29cbfd800b1babaaaa {
   private static final q2997348aa27a422480aea29cbfd800b1babaaaa[] a;
   private static final int[] ba;
   private static final Object[] aaa;
   private static final String[] bb;
   public static final q2997348aa27a422480aea29cbfd800b1babaaaa aa;
   private final q2997348aa27a422480aea29cbfd800b1babba ab;
   public static final q2997348aa27a422480aea29cbfd800b1babaaaa b;

   private static q2997348aa27a422480aea29cbfd800b1babaaaa[] a() {
      return new q2997348aa27a422480aea29cbfd800b1babaaaa[]{aa, b};
   }

   static {
      // $FF: Couldn't be decompiled
   }

   public String toString() {
      return this.ab.bba();
   }

   private static String aa(int var0, int var1) {
      int var3 = var0 ^ -263961988;
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
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ 857479444;
      int var8 = 0;

      do {
         short var9;
         switch (var8 & 31) {
            case 0:
            default:
               var9 = 139;
               break;
            case 1:
               var9 = 85;
               break;
            case 2:
               var9 = 182;
               break;
            case 3:
               var9 = 157;
               break;
            case 4:
               var9 = 150;
               break;
            case 5:
               var9 = 81;
               break;
            case 6:
               var9 = 7;
               break;
            case 7:
               var9 = 189;
               break;
            case 8:
               var9 = 174;
               break;
            case 9:
               var9 = 103;
               break;
            case 10:
               var9 = 232;
               break;
            case 11:
               var9 = 12;
               break;
            case 12:
               var9 = 172;
               break;
            case 13:
               var9 = 233;
               break;
            case 14:
               var9 = 173;
               break;
            case 15:
               var9 = 186;
               break;
            case 16:
               var9 = 21;
               break;
            case 17:
               var9 = 47;
               break;
            case 18:
               var9 = 194;
               break;
            case 19:
               var9 = 121;
               break;
            case 20:
               var9 = 83;
               break;
            case 21:
               var9 = 62;
               break;
            case 22:
               var9 = 110;
               break;
            case 23:
               var9 = 241;
               break;
            case 24:
               var9 = 182;
               break;
            case 25:
               var9 = 3;
               break;
            case 26:
               var9 = 48;
               break;
            case 27:
               var9 = 193;
               break;
            case 28:
               var9 = 100;
               break;
            case 29:
               var9 = 92;
               break;
            case 30:
               var9 = 196;
               break;
            case 31:
               var9 = 179;
         }

         var4[var8] = (char)(var4[var8] ^ var9 ^ var1 >> 16 ^ var7);
         ++var8;
      } while(var8 < var4.length);

      return (new String(var4)).intern();
   }

   private static int b(int var0, int var1) {
      int var2 = ba[var0 ^ -803249084] ^ var1 ^ var0;
      var2 += 65525;
      var2 ^= 54640;
      var2 -= 16793;
      var2 += 22833;
      var2 ^= 31055;
      var2 += 42430;
      var2 -= 56098;
      var2 += 2892;
      var2 -= 62216;
      var2 += 34774;
      return var2;
   }

   private q2997348aa27a422480aea29cbfd800b1babaaaa(q2997348aa27a422480aea29cbfd800b1babba var3) {
      this.ab = var3;
   }
}
