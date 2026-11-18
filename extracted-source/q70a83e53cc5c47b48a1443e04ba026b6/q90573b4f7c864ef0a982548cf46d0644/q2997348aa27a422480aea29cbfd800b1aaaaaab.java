package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum q2997348aa27a422480aea29cbfd800b1aaaaaab {
   private final q2997348aa27a422480aea29cbfd800b1babba a;
   public static final q2997348aa27a422480aea29cbfd800b1aaaaaab b;
   private static final int[] ba;
   private static final Object[] aaa;
   private static final q2997348aa27a422480aea29cbfd800b1aaaaaab[] aa;
   public static final q2997348aa27a422480aea29cbfd800b1aaaaaab ab;
   private static final String[] bb;

   private q2997348aa27a422480aea29cbfd800b1aaaaaab(q2997348aa27a422480aea29cbfd800b1babba var3) {
      this.a = var3;
   }

   private static String aa(int var0, int var1, short var2) {
      int var7 = var1 ^ 2076535795;
      char[] var6 = bb[var7].toCharArray();
      StackTraceElement[] var8 = (StackTraceElement[])aaa[var7];
      StackTraceElement[] var9;
      if (var8 != null) {
         var9 = var8;
      } else {
         var9 = (new Throwable()).getStackTrace();
         aaa[var7] = var9;
      }

      StackTraceElement var10 = var9[1];
      int var4 = (var10.getClassName().hashCode() ^ var10.getMethodName().hashCode()) >> 16 ^ 5683;

      for(int var5 = 0; var5 < var6.length; ++var5) {
         char var10002 = var6[var5];
         short var10003;
         switch (var5 % 17) {
            case 0:
            default:
               var10003 = 136;
               break;
            case 1:
               var10003 = 85;
               break;
            case 2:
               var10003 = 80;
               break;
            case 3:
               var10003 = 237;
               break;
            case 4:
               var10003 = 177;
               break;
            case 5:
               var10003 = 119;
               break;
            case 6:
               var10003 = 87;
               break;
            case 7:
               var10003 = 194;
               break;
            case 8:
               var10003 = 15;
               break;
            case 9:
               var10003 = 53;
               break;
            case 10:
               var10003 = 18;
               break;
            case 11:
               var10003 = 82;
               break;
            case 12:
               var10003 = 116;
               break;
            case 13:
               var10003 = 44;
               break;
            case 14:
               var10003 = 201;
               break;
            case 15:
               var10003 = 101;
               break;
            case 16:
               var10003 = 179;
         }

         var6[var5] = (char)(var10002 ^ var10003 ^ 20697 ^ var5 ^ var2 ^ var1 ^ var0 ^ var4);
      }

      return (new String(var6)).intern();
   }

   static {
      // $FF: Couldn't be decompiled
   }

   private static q2997348aa27a422480aea29cbfd800b1aaaaaab[] a() {
      return new q2997348aa27a422480aea29cbfd800b1aaaaaab[]{b, ab};
   }

   private static int b(int var0, int var1) {
      int var2 = ba[var0 ^ 1626126174] ^ var1 ^ var0;
      var2 -= 16493;
      var2 ^= 12366;
      var2 ^= 50704;
      var2 ^= 7574;
      var2 -= 38143;
      var2 -= 59177;
      var2 -= 48209;
      var2 ^= 48503;
      var2 += 36863;
      return var2;
   }

   public String toString() {
      return this.a.bba();
   }
}
