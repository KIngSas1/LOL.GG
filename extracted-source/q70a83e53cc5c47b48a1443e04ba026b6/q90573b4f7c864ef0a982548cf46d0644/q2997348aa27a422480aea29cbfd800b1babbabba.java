package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum q2997348aa27a422480aea29cbfd800b1babbabba {
   private static final Object[] aaa;
   public static final q2997348aa27a422480aea29cbfd800b1babbabba a;
   private static final q2997348aa27a422480aea29cbfd800b1babbabba[] aa;
   private final q2997348aa27a422480aea29cbfd800b1babba ab;
   private static final int[] ba;
   private static final String[] bb;
   public static final q2997348aa27a422480aea29cbfd800b1babbabba b;

   public q2997348aa27a422480aea29cbfd800b1babba a() {
      return this.ab;
   }

   public String toString() {
      return this.ab.bba();
   }

   private static int b(int var0, int var1) {
      int var2 = ba[var0 ^ -1655499832] ^ var1 ^ var0;
      var2 -= 1199;
      var2 += 21733;
      var2 += 42182;
      var2 -= 60493;
      var2 ^= 10732;
      var2 += 55218;
      return var2;
   }

   private static q2997348aa27a422480aea29cbfd800b1babbabba[] aa() {
      return new q2997348aa27a422480aea29cbfd800b1babbabba[]{a, b};
   }

   private q2997348aa27a422480aea29cbfd800b1babbabba(q2997348aa27a422480aea29cbfd800b1babba var3) {
      this.ab = var3;
   }

   static {
      // $FF: Couldn't be decompiled
   }

   private static String ba(short var0, int var1, byte var2, char var3, byte var4, char var5, byte var6) {
      int var11 = var1 ^ 343916167;
      char[] var10 = bb[var11].toCharArray();
      StackTraceElement[] var12 = (StackTraceElement[])aaa[var11];
      StackTraceElement[] var13;
      if (var12 != null) {
         var13 = var12;
      } else {
         var13 = (new Throwable()).getStackTrace();
         aaa[var11] = var13;
      }

      StackTraceElement var14 = var13[1];
      int var8 = (var14.getClassName().hashCode() ^ var14.getMethodName().hashCode()) >> 16 ^ '얀';

      for(int var9 = 0; var9 < var10.length; ++var9) {
         int var10002 = var10[var9] ^ var9 ^ '輼';
         short var10003;
         switch (var9 % 18) {
            case 0:
            default:
               var10003 = 12;
               break;
            case 1:
               var10003 = 119;
               break;
            case 2:
               var10003 = 215;
               break;
            case 3:
               var10003 = 134;
               break;
            case 4:
               var10003 = 147;
               break;
            case 5:
               var10003 = 144;
               break;
            case 6:
               var10003 = 254;
               break;
            case 7:
               var10003 = 140;
               break;
            case 8:
               var10003 = 182;
               break;
            case 9:
               var10003 = 164;
               break;
            case 10:
               var10003 = 137;
               break;
            case 11:
               var10003 = 223;
               break;
            case 12:
               var10003 = 18;
               break;
            case 13:
               var10003 = 43;
               break;
            case 14:
               var10003 = 94;
               break;
            case 15:
               var10003 = 74;
               break;
            case 16:
               var10003 = 59;
               break;
            case 17:
               var10003 = 110;
         }

         var10[var9] = (char)(var10002 ^ var10003 ^ var8 ^ var3 ^ var5 ^ var6 ^ var0 ^ var1 ^ var4 ^ var2);
      }

      return (new String(var10)).intern();
   }

   public static q2997348aa27a422480aea29cbfd800b1babbabba ab(String var0) {
      return (q2997348aa27a422480aea29cbfd800b1babbabba)Enum.valueOf(q2997348aa27a422480aea29cbfd800b1babbabba.class, var0);
   }
}
