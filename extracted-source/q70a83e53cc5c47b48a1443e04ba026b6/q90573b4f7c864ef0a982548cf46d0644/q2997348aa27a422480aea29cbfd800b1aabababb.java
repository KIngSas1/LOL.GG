package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
enum q2997348aa27a422480aea29cbfd800b1aabababb {
   private static final q2997348aa27a422480aea29cbfd800b1aabababb[] a;
   private static final String[] bb;
   public static final q2997348aa27a422480aea29cbfd800b1aabababb aa;
   private static final int[] b;
   private static final Object[] aaa;
   public static final q2997348aa27a422480aea29cbfd800b1aabababb ab;
   private final q2997348aa27a422480aea29cbfd800b1babba ba;

   private static int b(int var0, int var1) {
      int var2 = b[var0 ^ 1658088122] ^ var1 ^ var0;
      var2 += 12011;
      var2 ^= 24932;
      var2 -= 10434;
      var2 += 27694;
      var2 -= 4374;
      var2 -= 10918;
      var2 += 62681;
      var2 += 60899;
      var2 -= 48590;
      var2 += 53489;
      return var2;
   }

   public static q2997348aa27a422480aea29cbfd800b1aabababb a(String var0) {
      return (q2997348aa27a422480aea29cbfd800b1aabababb)Enum.valueOf(q2997348aa27a422480aea29cbfd800b1aabababb.class, var0);
   }

   private q2997348aa27a422480aea29cbfd800b1aabababb(q2997348aa27a422480aea29cbfd800b1babba var3) {
      this.ba = var3;
   }

   private static String ab(byte var0, char var1, byte var2, int var3) {
      int var8 = var3 ^ 2006679577;
      char[] var7 = bb[var8].toCharArray();
      StackTraceElement[] var9 = (StackTraceElement[])aaa[var8];
      StackTraceElement[] var10;
      if (var9 != null) {
         var10 = var9;
      } else {
         var10 = (new Throwable()).getStackTrace();
         aaa[var8] = var10;
      }

      StackTraceElement var11 = var10[1];
      int var5 = (var11.getClassName().hashCode() ^ var11.getMethodName().hashCode()) >> 16 ^ '쥄';
      int var6 = 0;

      do {
         char var10002 = var7[var6];
         short var10003;
         switch (var6 % 6) {
            case 0:
            default:
               var10003 = 219;
               break;
            case 1:
               var10003 = 62;
               break;
            case 2:
               var10003 = 27;
               break;
            case 3:
               var10003 = 31;
               break;
            case 4:
               var10003 = 165;
               break;
            case 5:
               var10003 = 164;
         }

         var7[var6] = (char)(var10002 ^ var10003 ^ var1 ^ var3 ^ var0 ^ var5 ^ var2);
         ++var6;
      } while(var6 < var7.length);

      return (new String(var7)).intern();
   }

   public String toString() {
      return this.ba.bba();
   }

   static {
      // $FF: Couldn't be decompiled
   }

   private static q2997348aa27a422480aea29cbfd800b1aabababb[] aa() {
      return new q2997348aa27a422480aea29cbfd800b1aabababb[]{aa, ab};
   }
}
