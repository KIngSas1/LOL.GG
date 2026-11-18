package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum q2997348aa27a422480aea29cbfd800b1bbabaaab {
   private static final int[] bb;
   private static final Object[] aab;
   public static final q2997348aa27a422480aea29cbfd800b1bbabaaab a;
   public static final q2997348aa27a422480aea29cbfd800b1bbabaaab aa;
   private static final String[] aaa;
   private final q2997348aa27a422480aea29cbfd800b1babba ab;
   private static final q2997348aa27a422480aea29cbfd800b1bbabaaab[] b;
   public static final q2997348aa27a422480aea29cbfd800b1bbabaaab ba;

   private static q2997348aa27a422480aea29cbfd800b1bbabaaab[] a() {
      return new q2997348aa27a422480aea29cbfd800b1bbabaaab[]{a, aa, ba};
   }

   private q2997348aa27a422480aea29cbfd800b1bbabaaab(q2997348aa27a422480aea29cbfd800b1babba var3) {
      this.ab = var3;
   }

   private static int b(int var0, int var1) {
      int var2 = bb[var0 ^ 468239466] ^ var1 ^ var0;
      var2 ^= 16554;
      var2 ^= 3271;
      var2 += 18044;
      var2 ^= 16062;
      var2 -= 43849;
      var2 ^= 58060;
      var2 ^= 29762;
      var2 += 60096;
      return var2;
   }

   static {
      // $FF: Couldn't be decompiled
   }

   public String toString() {
      return this.ab.bba();
   }

   private static String ab(char var0, byte var1, int var2, byte var3) {
      int var8 = var2 ^ 612525295;
      char[] var7 = aaa[var8].toCharArray();
      StackTraceElement[] var9 = (StackTraceElement[])aab[var8];
      StackTraceElement[] var10;
      if (var9 != null) {
         var10 = var9;
      } else {
         var10 = (new Throwable()).getStackTrace();
         aab[var8] = var10;
      }

      StackTraceElement var11 = var10[1];
      int var5 = (var11.getClassName().hashCode() ^ var11.getMethodName().hashCode()) >> 16 ^ 20860;
      int var6 = 0;

      do {
         int var10002 = var7[var6] ^ 28546 ^ var6;
         short var10003;
         switch (var6 % 7) {
            case 0:
            default:
               var10003 = 140;
               break;
            case 1:
               var10003 = 120;
               break;
            case 2:
               var10003 = 55;
               break;
            case 3:
               var10003 = 158;
               break;
            case 4:
               var10003 = 3;
               break;
            case 5:
               var10003 = 22;
               break;
            case 6:
               var10003 = 80;
         }

         var7[var6] = (char)(var10002 ^ var10003 ^ var3 ^ var0 ^ var1 ^ var5 ^ var2);
         ++var6;
      } while(var6 < var7.length);

      return (new String(var7)).intern();
   }

   public static q2997348aa27a422480aea29cbfd800b1bbabaaab aa(String var0) {
      return (q2997348aa27a422480aea29cbfd800b1bbabaaab)Enum.valueOf(q2997348aa27a422480aea29cbfd800b1bbabaaab.class, var0);
   }
}
