package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum q2997348aa27a422480aea29cbfd800b1abaaaaab {
   public static final q2997348aa27a422480aea29cbfd800b1abaaaaab a;
   private static final Object[] bb;
   private static final String[] ba;
   private static final int[] b;
   public static final q2997348aa27a422480aea29cbfd800b1abaaaaab aa;
   private static final q2997348aa27a422480aea29cbfd800b1abaaaaab[] ab;

   private static int b(int var0, int var1) {
      int var2 = b[var0 ^ 644717881] ^ var1 ^ var0;
      var2 += 64623;
      var2 ^= 30838;
      var2 ^= 59311;
      var2 ^= 29991;
      var2 += 7344;
      var2 -= 28997;
      return var2;
   }

   static {
      // $FF: Couldn't be decompiled
   }

   private static q2997348aa27a422480aea29cbfd800b1abaaaaab[] a() {
      return new q2997348aa27a422480aea29cbfd800b1abaaaaab[]{aa, a};
   }

   private static String ab(int var0, int var1) {
      int var3 = var0 ^ -1537020051;
      char[] var4 = ba[var3].toCharArray();
      StackTraceElement[] var2 = (StackTraceElement[])bb[var3];
      StackTraceElement[] var5;
      if (var2 != null) {
         var5 = var2;
      } else {
         var5 = (new Throwable()).getStackTrace();
         bb[var3] = var5;
      }

      StackTraceElement var6 = var5[1];
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ 82144974;
      int var8 = 0;

      do {
         short var9;
         switch (var8 & 31) {
            case 0:
            default:
               var9 = 10;
               break;
            case 1:
               var9 = 91;
               break;
            case 2:
               var9 = 197;
               break;
            case 3:
               var9 = 71;
               break;
            case 4:
               var9 = 158;
               break;
            case 5:
               var9 = 203;
               break;
            case 6:
               var9 = 29;
               break;
            case 7:
               var9 = 170;
               break;
            case 8:
               var9 = 89;
               break;
            case 9:
               var9 = 208;
               break;
            case 10:
               var9 = 103;
               break;
            case 11:
               var9 = 151;
               break;
            case 12:
               var9 = 3;
               break;
            case 13:
               var9 = 73;
               break;
            case 14:
               var9 = 99;
               break;
            case 15:
               var9 = 124;
               break;
            case 16:
               var9 = 38;
               break;
            case 17:
               var9 = 237;
               break;
            case 18:
               var9 = 118;
               break;
            case 19:
               var9 = 99;
               break;
            case 20:
               var9 = 184;
               break;
            case 21:
               var9 = 254;
               break;
            case 22:
               var9 = 15;
               break;
            case 23:
               var9 = 201;
               break;
            case 24:
               var9 = 14;
               break;
            case 25:
               var9 = 199;
               break;
            case 26:
               var9 = 253;
               break;
            case 27:
               var9 = 197;
               break;
            case 28:
               var9 = 113;
               break;
            case 29:
               var9 = 181;
               break;
            case 30:
               var9 = 81;
               break;
            case 31:
               var9 = 206;
         }

         var4[var8] = (char)(var4[var8] ^ var9 ^ var1 >> 16 ^ var7);
         ++var8;
      } while(var8 < var4.length);

      return (new String(var4)).intern();
   }

   public static q2997348aa27a422480aea29cbfd800b1abaaaaab aa(String var0) {
      return (q2997348aa27a422480aea29cbfd800b1abaaaaab)Enum.valueOf(q2997348aa27a422480aea29cbfd800b1abaaaaab.class, var0);
   }
}
