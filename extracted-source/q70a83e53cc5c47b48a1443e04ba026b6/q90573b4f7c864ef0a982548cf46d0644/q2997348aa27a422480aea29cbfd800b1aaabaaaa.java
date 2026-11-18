package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum q2997348aa27a422480aea29cbfd800b1aaabaaaa {
   public static final q2997348aa27a422480aea29cbfd800b1aaabaaaa a;
   private static final String[] bb;
   public static final q2997348aa27a422480aea29cbfd800b1aaabaaaa aa;
   private static final q2997348aa27a422480aea29cbfd800b1aaabaaaa[] ab;
   private static final int[] b;
   private static final Object[] aaa;
   private final q2997348aa27a422480aea29cbfd800b1babba ba;

   static {
      // $FF: Couldn't be decompiled
   }

   public String toString() {
      return this.ba.bba();
   }

   private static String ab(short var0, int var1, char var2, char var3, int var4, short var5) {
      int var10 = var4 ^ -1581319350;
      char[] var9 = bb[var10].toCharArray();
      StackTraceElement[] var11 = (StackTraceElement[])aaa[var10];
      StackTraceElement[] var12;
      if (var11 != null) {
         var12 = var11;
      } else {
         var12 = (new Throwable()).getStackTrace();
         aaa[var10] = var12;
      }

      StackTraceElement var13 = var12[1];
      int var7 = (var13.getClassName().hashCode() ^ var13.getMethodName().hashCode()) >> 16 ^ 14974;
      int var8 = 0;

      do {
         int var10002 = var9[var8] ^ 17780 ^ var8;
         short var10003;
         switch (var8 % 7) {
            case 0:
            default:
               var10003 = 190;
               break;
            case 1:
               var10003 = 240;
               break;
            case 2:
               var10003 = 1;
               break;
            case 3:
               var10003 = 196;
               break;
            case 4:
               var10003 = 127;
               break;
            case 5:
               var10003 = 48;
               break;
            case 6:
               var10003 = 246;
         }

         var9[var8] = (char)(var10002 ^ var10003 ^ var5 ^ var2 ^ var0 ^ var7 ^ var4 ^ var1 ^ var3);
         ++var8;
      } while(var8 < var9.length);

      return (new String(var9)).intern();
   }

   private static int b(int var0, int var1) {
      int var2 = b[var0 ^ -943349922] ^ var1 ^ var0;
      var2 ^= 39928;
      var2 -= 61349;
      var2 -= 19935;
      var2 ^= 24995;
      var2 -= 21839;
      var2 += 35434;
      var2 += 60722;
      var2 += 58977;
      var2 -= 54176;
      var2 ^= 32490;
      return var2;
   }

   private q2997348aa27a422480aea29cbfd800b1aaabaaaa(q2997348aa27a422480aea29cbfd800b1babba var3) {
      this.ba = var3;
   }

   private static q2997348aa27a422480aea29cbfd800b1aaabaaaa[] a() {
      return new q2997348aa27a422480aea29cbfd800b1aaabaaaa[]{a, aa};
   }

   public static q2997348aa27a422480aea29cbfd800b1aaabaaaa aa(String var0) {
      return (q2997348aa27a422480aea29cbfd800b1aaabaaaa)Enum.valueOf(q2997348aa27a422480aea29cbfd800b1aaabaaaa.class, var0);
   }
}
