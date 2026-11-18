package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum q2997348aa27a422480aea29cbfd800b1babbab {
   private static final Object[] aaa;
   public static final q2997348aa27a422480aea29cbfd800b1babbab a;
   private static final String[] bb;
   private static final int[] ba;
   private final q2997348aa27a422480aea29cbfd800b1babba aa;
   public static final q2997348aa27a422480aea29cbfd800b1babbab b;
   private static final q2997348aa27a422480aea29cbfd800b1babbab[] ab;

   private q2997348aa27a422480aea29cbfd800b1babbab(q2997348aa27a422480aea29cbfd800b1babba var3) {
      this.aa = var3;
   }

   static {
      // $FF: Couldn't be decompiled
   }

   public String toString() {
      return this.aa.bba();
   }

   private static int b(int var0, int var1) {
      int var2 = ba[var0 ^ -1106509925] ^ var1 ^ var0;
      var2 ^= 20106;
      var2 ^= 20670;
      var2 ^= 57936;
      var2 += 24906;
      var2 -= 57598;
      var2 ^= 58517;
      var2 -= 56520;
      var2 += 16511;
      var2 -= 22347;
      return var2;
   }

   private static String ab(int var0, char var1, byte var2, byte var3, char var4, int var5, byte var6) {
      int var11 = var5 ^ -1160589589;
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
      int var8 = (var14.getClassName().hashCode() ^ var14.getMethodName().hashCode()) >> 16 ^ '큈';

      for(int var9 = 0; var9 < var10.length; ++var9) {
         int var10002 = var10[var9] ^ '딢';
         short var10003;
         switch (var9 % 21) {
            case 0:
            default:
               var10003 = 236;
               break;
            case 1:
               var10003 = 17;
               break;
            case 2:
               var10003 = 26;
               break;
            case 3:
               var10003 = 19;
               break;
            case 4:
               var10003 = 45;
               break;
            case 5:
               var10003 = 67;
               break;
            case 6:
               var10003 = 197;
               break;
            case 7:
               var10003 = 21;
               break;
            case 8:
               var10003 = 134;
               break;
            case 9:
               var10003 = 95;
               break;
            case 10:
               var10003 = 169;
               break;
            case 11:
               var10003 = 206;
               break;
            case 12:
               var10003 = 17;
               break;
            case 13:
               var10003 = 157;
               break;
            case 14:
               var10003 = 51;
               break;
            case 15:
               var10003 = 29;
               break;
            case 16:
               var10003 = 126;
               break;
            case 17:
               var10003 = 177;
               break;
            case 18:
               var10003 = 212;
               break;
            case 19:
               var10003 = 147;
               break;
            case 20:
               var10003 = 252;
         }

         var10[var9] = (char)(var10002 ^ var10003 ^ var9 ^ var5 ^ var8 ^ var1 ^ var2 ^ var6 ^ var3 ^ var4 ^ var0);
      }

      return (new String(var10)).intern();
   }

   private static q2997348aa27a422480aea29cbfd800b1babbab[] a() {
      return new q2997348aa27a422480aea29cbfd800b1babbab[]{b, a};
   }

   public static q2997348aa27a422480aea29cbfd800b1babbab aa(String var0) {
      return (q2997348aa27a422480aea29cbfd800b1babbab)Enum.valueOf(q2997348aa27a422480aea29cbfd800b1babbab.class, var0);
   }
}
