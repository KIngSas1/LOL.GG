package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum q2997348aa27a422480aea29cbfd800b1aaabaabaa implements q2997348aa27a422480aea29cbfd800b1aabbbabab {
   private static final String[] aaa;
   public static final q2997348aa27a422480aea29cbfd800b1aaabaabaa a;
   public static final q2997348aa27a422480aea29cbfd800b1aaabaabaa aa;
   private static final int[] bb;
   private static final Object[] aab;
   private static final q2997348aa27a422480aea29cbfd800b1aaabaabaa[] ab;
   private final q2997348aa27a422480aea29cbfd800b1babba ba;
   public static final q2997348aa27a422480aea29cbfd800b1aaabaabaa b;

   private static q2997348aa27a422480aea29cbfd800b1aaabaabaa[] b() {
      return new q2997348aa27a422480aea29cbfd800b1aaabaabaa[]{a, b, aa};
   }

   static {
      // $FF: Couldn't be decompiled
   }

   private static int a(int var0, int var1) {
      int var2 = bb[var0 ^ 65960143] ^ var1 ^ var0;
      var2 += 37491;
      var2 ^= 57869;
      var2 ^= 57003;
      var2 -= 24365;
      var2 ^= 46758;
      var2 ^= 28164;
      var2 += 39311;
      var2 ^= 22788;
      var2 ^= 513;
      return var2;
   }

   private static String aa(char var0, char var1, byte var2, byte var3, int var4) {
      int var9 = var4 ^ 621438729;
      char[] var8 = aaa[var9].toCharArray();
      StackTraceElement[] var10 = (StackTraceElement[])aab[var9];
      StackTraceElement[] var11;
      if (var10 != null) {
         var11 = var10;
      } else {
         var11 = (new Throwable()).getStackTrace();
         aab[var9] = var11;
      }

      StackTraceElement var12 = var11[1];
      int var6 = (var12.getClassName().hashCode() ^ var12.getMethodName().hashCode()) >> 16 ^ '퍔';

      for(int var7 = 0; var7 < var8.length; ++var7) {
         int var10002 = var8[var7] ^ 32759;
         short var10003;
         switch (var7 % 27) {
            case 0:
            default:
               var10003 = 233;
               break;
            case 1:
               var10003 = 66;
               break;
            case 2:
               var10003 = 252;
               break;
            case 3:
               var10003 = 169;
               break;
            case 4:
               var10003 = 225;
               break;
            case 5:
               var10003 = 137;
               break;
            case 6:
               var10003 = 64;
               break;
            case 7:
               var10003 = 37;
               break;
            case 8:
               var10003 = 85;
               break;
            case 9:
               var10003 = 226;
               break;
            case 10:
               var10003 = 254;
               break;
            case 11:
               var10003 = 239;
               break;
            case 12:
               var10003 = 22;
               break;
            case 13:
               var10003 = 144;
               break;
            case 14:
               var10003 = 51;
               break;
            case 15:
               var10003 = 97;
               break;
            case 16:
               var10003 = 147;
               break;
            case 17:
               var10003 = 57;
               break;
            case 18:
               var10003 = 164;
               break;
            case 19:
               var10003 = 162;
               break;
            case 20:
               var10003 = 55;
               break;
            case 21:
               var10003 = 78;
               break;
            case 22:
               var10003 = 108;
               break;
            case 23:
               var10003 = 210;
               break;
            case 24:
               var10003 = 92;
               break;
            case 25:
               var10003 = 139;
               break;
            case 26:
               var10003 = 101;
         }

         var8[var7] = (char)(var10002 ^ var10003 ^ var4 ^ var1 ^ var0 ^ var3 ^ var2 ^ var6);
      }

      return (new String(var8)).intern();
   }

   private q2997348aa27a422480aea29cbfd800b1aaabaabaa(q2997348aa27a422480aea29cbfd800b1babba var3) {
      this.ba = var3;
   }

   public String toString() {
      return this.ba.bba();
   }
}
