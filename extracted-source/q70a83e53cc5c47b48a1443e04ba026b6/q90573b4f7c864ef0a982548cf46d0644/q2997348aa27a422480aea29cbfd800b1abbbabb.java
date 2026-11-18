package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum q2997348aa27a422480aea29cbfd800b1abbbabb {
   private static final q2997348aa27a422480aea29cbfd800b1abbbabb[] a;
   private static final String[] bb;
   private static final Object[] aaa;
   private static final int[] ba;
   private final q2997348aa27a422480aea29cbfd800b1babba aa;
   public static final q2997348aa27a422480aea29cbfd800b1abbbabb b;
   public static final q2997348aa27a422480aea29cbfd800b1abbbabb ab;

   private static int b(int var0, int var1) {
      int var2 = ba[var0 ^ -310796999] ^ var1 ^ var0;
      var2 -= 43319;
      var2 ^= 50808;
      var2 ^= 48751;
      var2 += 11405;
      var2 += 22463;
      var2 += 48628;
      return var2;
   }

   private static String aa(int var0, int var1, short var2, byte var3, short var4, short var5) {
      int var10 = var1 ^ 456362491;
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
      int var7 = (var13.getClassName().hashCode() ^ var13.getMethodName().hashCode()) >> 16 ^ '蒩';
      int var8 = 0;

      do {
         int var10002 = var9[var8] ^ 16488;
         short var10003;
         switch (var8 % 21) {
            case 0:
            default:
               var10003 = 179;
               break;
            case 1:
               var10003 = 239;
               break;
            case 2:
               var10003 = 52;
               break;
            case 3:
               var10003 = 182;
               break;
            case 4:
               var10003 = 74;
               break;
            case 5:
               var10003 = 211;
               break;
            case 6:
               var10003 = 82;
               break;
            case 7:
               var10003 = 27;
               break;
            case 8:
               var10003 = 20;
               break;
            case 9:
               var10003 = 24;
               break;
            case 10:
               var10003 = 171;
               break;
            case 11:
               var10003 = 251;
               break;
            case 12:
               var10003 = 244;
               break;
            case 13:
               var10003 = 14;
               break;
            case 14:
               var10003 = 18;
               break;
            case 15:
               var10003 = 11;
               break;
            case 16:
               var10003 = 110;
               break;
            case 17:
               var10003 = 34;
               break;
            case 18:
               var10003 = 84;
               break;
            case 19:
               var10003 = 227;
               break;
            case 20:
               var10003 = 63;
         }

         var9[var8] = (char)(var10002 ^ var10003 ^ var3 ^ var0 ^ var1 ^ var7 ^ var5 ^ var2 ^ var4);
         ++var8;
      } while(var8 < var9.length);

      return (new String(var9)).intern();
   }

   public String toString() {
      return this.aa.bba();
   }

   private q2997348aa27a422480aea29cbfd800b1abbbabb(q2997348aa27a422480aea29cbfd800b1babba var3) {
      this.aa = var3;
   }

   static {
      // $FF: Couldn't be decompiled
   }

   private static q2997348aa27a422480aea29cbfd800b1abbbabb[] a() {
      return new q2997348aa27a422480aea29cbfd800b1abbbabb[]{ab, b};
   }
}
