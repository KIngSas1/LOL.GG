package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
enum q2997348aa27a422480aea29cbfd800b1aabbaa {
   public static final q2997348aa27a422480aea29cbfd800b1aabbaa a;
   private static final q2997348aa27a422480aea29cbfd800b1aabbaa[] aa;
   public static final q2997348aa27a422480aea29cbfd800b1aabbaa ab;
   private static final Object[] aab;
   private static final int[] b;
   private static final String[] aaa;
   public static final q2997348aa27a422480aea29cbfd800b1aabbaa ba;
   private final q2997348aa27a422480aea29cbfd800b1babba bb;

   private static String ab(short var0, int var1, short var2, int var3, short var4, int var5) {
      int var10 = var3 ^ 1883154520;
      char[] var9 = aaa[var10].toCharArray();
      StackTraceElement[] var11 = (StackTraceElement[])aab[var10];
      StackTraceElement[] var12;
      if (var11 != null) {
         var12 = var11;
      } else {
         var12 = (new Throwable()).getStackTrace();
         aab[var10] = var12;
      }

      StackTraceElement var13 = var12[1];
      int var7 = (var13.getClassName().hashCode() ^ var13.getMethodName().hashCode()) >> 16 ^ 19831;
      int var8 = 0;

      do {
         char var10002 = var9[var8];
         short var10003;
         switch (var8 % 13) {
            case 0:
            default:
               var10003 = 251;
               break;
            case 1:
               var10003 = 178;
               break;
            case 2:
               var10003 = 41;
               break;
            case 3:
               var10003 = 141;
               break;
            case 4:
               var10003 = 229;
               break;
            case 5:
               var10003 = 131;
               break;
            case 6:
               var10003 = 63;
               break;
            case 7:
               var10003 = 127;
               break;
            case 8:
               var10003 = 43;
               break;
            case 9:
               var10003 = 115;
               break;
            case 10:
               var10003 = 150;
               break;
            case 11:
               var10003 = 122;
               break;
            case 12:
               var10003 = 209;
         }

         var9[var8] = (char)(var10002 ^ var10003 ^ var1 ^ var7 ^ var0 ^ var4 ^ var2 ^ var5 ^ var3);
         ++var8;
      } while(var8 < var9.length);

      return (new String(var9)).intern();
   }

   private q2997348aa27a422480aea29cbfd800b1aabbaa(q2997348aa27a422480aea29cbfd800b1babba var3) {
      this.bb = var3;
   }

   public String toString() {
      return this.bb.bba();
   }

   private static int b(int var0, int var1) {
      int var2 = b[var0 ^ -294606886] ^ var1 ^ var0;
      var2 += 7351;
      var2 ^= 38728;
      var2 += 16013;
      var2 ^= 62384;
      var2 ^= 31728;
      var2 -= 21995;
      var2 += 34169;
      var2 += 32453;
      return var2;
   }

   private static q2997348aa27a422480aea29cbfd800b1aabbaa[] a() {
      return new q2997348aa27a422480aea29cbfd800b1aabbaa[]{a, ab, ba};
   }

   static {
      // $FF: Couldn't be decompiled
   }

   public static q2997348aa27a422480aea29cbfd800b1aabbaa aa(String var0) {
      return (q2997348aa27a422480aea29cbfd800b1aabbaa)Enum.valueOf(q2997348aa27a422480aea29cbfd800b1aabbaa.class, var0);
   }
}
