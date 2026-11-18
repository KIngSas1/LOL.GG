package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
enum q2997348aa27a422480aea29cbfd800b1baabb implements q2997348aa27a422480aea29cbfd800b1aabbbabab {
   private static final q2997348aa27a422480aea29cbfd800b1baabb[] a;
   public static final q2997348aa27a422480aea29cbfd800b1baabb aa;
   private final q2997348aa27a422480aea29cbfd800b1babba ab;
   private static final int[] ba;
   private static final Object[] aaa;
   private static final String[] bb;
   public static final q2997348aa27a422480aea29cbfd800b1baabb b;

   static {
      // $FF: Couldn't be decompiled
   }

   private static String aa(int var0, byte var1, int var2, int var3) {
      int var8 = var2 ^ -1009813493;
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
      int var5 = (var11.getClassName().hashCode() ^ var11.getMethodName().hashCode()) >> 16 ^ 7502;
      int var6 = 0;

      do {
         int var10002 = var7[var6] ^ var6;
         short var10003;
         switch (var6 % 6) {
            case 0:
            default:
               var10003 = 133;
               break;
            case 1:
               var10003 = 188;
               break;
            case 2:
               var10003 = 159;
               break;
            case 3:
               var10003 = 178;
               break;
            case 4:
               var10003 = 146;
               break;
            case 5:
               var10003 = 54;
         }

         var7[var6] = (char)(var10002 ^ var10003 ^ var1 ^ var0 ^ var5 ^ var3 ^ var2);
         ++var6;
      } while(var6 < var7.length);

      return (new String(var7)).intern();
   }

   private static q2997348aa27a422480aea29cbfd800b1baabb[] b() {
      return new q2997348aa27a422480aea29cbfd800b1baabb[]{aa, b};
   }

   private q2997348aa27a422480aea29cbfd800b1baabb(q2997348aa27a422480aea29cbfd800b1babba var3) {
      this.ab = var3;
   }

   private static int a(int var0, int var1) {
      int var2 = ba[var0 ^ -335813391] ^ var1 ^ var0;
      var2 ^= 61736;
      var2 += 43433;
      var2 += 54331;
      var2 ^= 6295;
      var2 -= 7967;
      var2 += 12197;
      var2 += 10720;
      var2 -= 44838;
      return var2;
   }

   public String toString() {
      return this.ab.bba();
   }
}
