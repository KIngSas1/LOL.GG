package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
enum q2997348aa27a422480aea29cbfd800b1aabababaa {
   public static final q2997348aa27a422480aea29cbfd800b1aabababaa a;
   private static final q2997348aa27a422480aea29cbfd800b1aabababaa[] aa;
   private static final int[] b;
   public static final q2997348aa27a422480aea29cbfd800b1aabababaa ab;
   private static final String[] bb;
   private static final Object[] aaa;
   private final q2997348aa27a422480aea29cbfd800b1babba ba;

   private static int b(int var0, int var1) {
      int var2 = b[var0 ^ -379504611] ^ var1 ^ var0;
      var2 -= 7504;
      var2 ^= 30842;
      var2 += 10765;
      var2 += 6360;
      var2 ^= 40573;
      var2 += 34718;
      var2 -= 54995;
      return var2;
   }

   public String toString() {
      return this.ba.bba();
   }

   static {
      // $FF: Couldn't be decompiled
   }

   private q2997348aa27a422480aea29cbfd800b1aabababaa(q2997348aa27a422480aea29cbfd800b1babba var3) {
      this.ba = var3;
   }

   private static q2997348aa27a422480aea29cbfd800b1aabababaa[] a() {
      return new q2997348aa27a422480aea29cbfd800b1aabababaa[]{a, ab};
   }

   private static String ab(byte var0, int var1, char var2, int var3) {
      int var8 = var1 ^ -738333651;
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
      int var5 = (var11.getClassName().hashCode() ^ var11.getMethodName().hashCode()) >> 16 ^ '\uecf8';
      int var6 = 0;

      do {
         char var10002 = var7[var6];
         short var10003;
         switch (var6 % 5) {
            case 0:
            default:
               var10003 = 233;
               break;
            case 1:
               var10003 = 46;
               break;
            case 2:
               var10003 = 188;
               break;
            case 3:
               var10003 = 147;
               break;
            case 4:
               var10003 = 244;
         }

         var7[var6] = (char)(var10002 ^ var10003 ^ var6 ^ var1 ^ var5 ^ var2 ^ var0 ^ var3);
         ++var6;
      } while(var6 < var7.length);

      return (new String(var7)).intern();
   }

   public static q2997348aa27a422480aea29cbfd800b1aabababaa aa(String var0) {
      return (q2997348aa27a422480aea29cbfd800b1aabababaa)Enum.valueOf(q2997348aa27a422480aea29cbfd800b1aabababaa.class, var0);
   }
}
