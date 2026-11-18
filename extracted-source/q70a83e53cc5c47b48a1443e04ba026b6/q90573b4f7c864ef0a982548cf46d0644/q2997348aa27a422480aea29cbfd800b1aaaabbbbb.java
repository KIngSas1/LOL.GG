package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
enum q2997348aa27a422480aea29cbfd800b1aaaabbbbb {
   private static final String[] bb;
   private static final q2997348aa27a422480aea29cbfd800b1aaaabbbbb[] a;
   private static final Object[] aaa;
   private static final int[] ba;
   public static final q2997348aa27a422480aea29cbfd800b1aaaabbbbb aa;
   private final q2997348aa27a422480aea29cbfd800b1babba ab;
   public static final q2997348aa27a422480aea29cbfd800b1aaaabbbbb b;

   private static int b(int var0, int var1) {
      int var2 = ba[var0 ^ -1203231852] ^ var1 ^ var0;
      var2 += 51951;
      var2 ^= 30344;
      var2 -= 57324;
      var2 -= 51397;
      var2 += 17310;
      var2 += 58411;
      var2 += 51412;
      var2 += 59661;
      return var2;
   }

   private q2997348aa27a422480aea29cbfd800b1aaaabbbbb(q2997348aa27a422480aea29cbfd800b1babba var3) {
      this.ab = var3;
   }

   static {
      // $FF: Couldn't be decompiled
   }

   private static String ab(char var0, int var1, int var2) {
      int var7 = var2 ^ 1558009628;
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
      int var4 = (var10.getClassName().hashCode() ^ var10.getMethodName().hashCode()) >> 16 ^ 24516;
      int var5 = 0;

      do {
         int var10002 = var6[var5] ^ '菀';
         short var10003;
         switch (var5 % 8) {
            case 0:
            default:
               var10003 = 25;
               break;
            case 1:
               var10003 = 60;
               break;
            case 2:
               var10003 = 107;
               break;
            case 3:
               var10003 = 185;
               break;
            case 4:
               var10003 = 5;
               break;
            case 5:
               var10003 = 46;
               break;
            case 6:
               var10003 = 141;
               break;
            case 7:
               var10003 = 33;
         }

         var6[var5] = (char)(var10002 ^ var10003 ^ var5 ^ var0 ^ var4 ^ var2 ^ var1);
         ++var5;
      } while(var5 < var6.length);

      return (new String(var6)).intern();
   }

   public String toString() {
      return this.ab.bba();
   }

   public static q2997348aa27a422480aea29cbfd800b1aaaabbbbb a(String var0) {
      return (q2997348aa27a422480aea29cbfd800b1aaaabbbbb)Enum.valueOf(q2997348aa27a422480aea29cbfd800b1aaaabbbbb.class, var0);
   }

   private static q2997348aa27a422480aea29cbfd800b1aaaabbbbb[] aa() {
      return new q2997348aa27a422480aea29cbfd800b1aaaabbbbb[]{b, aa};
   }
}
