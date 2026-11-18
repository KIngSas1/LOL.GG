package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
enum q2997348aa27a422480aea29cbfd800b1aaababaab {
   public static final q2997348aa27a422480aea29cbfd800b1aaababaab a;
   public static final q2997348aa27a422480aea29cbfd800b1aaababaab aa;
   private static final int[] abb;
   private static final Object[] bab;
   public static final q2997348aa27a422480aea29cbfd800b1aaababaab ab;
   private static final q2997348aa27a422480aea29cbfd800b1aaababaab[] ba;
   public static final q2997348aa27a422480aea29cbfd800b1aaababaab bb;
   private final q2997348aa27a422480aea29cbfd800b1babba aaa;
   public static final q2997348aa27a422480aea29cbfd800b1aaababaab b;
   private static final String[] baa;
   private static final long aab;
   public static final q2997348aa27a422480aea29cbfd800b1aaababaab aba;

   private q2997348aa27a422480aea29cbfd800b1aaababaab(q2997348aa27a422480aea29cbfd800b1babba var3) {
      this.aaa = var3;
   }

   public static q2997348aa27a422480aea29cbfd800b1aaababaab a(String var0) {
      return (q2997348aa27a422480aea29cbfd800b1aaababaab)Enum.valueOf(q2997348aa27a422480aea29cbfd800b1aaababaab.class, var0);
   }

   private static int ab(int var0, int var1) {
      int var2 = abb[var0 ^ -1223002635] ^ var1 ^ var0;
      var2 -= 11484;
      var2 ^= 28987;
      var2 ^= 54098;
      var2 += 64534;
      var2 -= 13377;
      var2 -= 61631;
      return var2;
   }

   q2997348aa27a422480aea29cbfd800b1babba aa() {
      return this.aaa;
   }

   private static String ba(int var0, char var1, byte var2) {
      int var7 = var0 ^ 1668568745;
      char[] var6 = baa[var7].toCharArray();
      StackTraceElement[] var8 = (StackTraceElement[])bab[var7];
      StackTraceElement[] var9;
      if (var8 != null) {
         var9 = var8;
      } else {
         var9 = (new Throwable()).getStackTrace();
         bab[var7] = var9;
      }

      StackTraceElement var10 = var9[1];
      int var4 = (var10.getClassName().hashCode() ^ var10.getMethodName().hashCode()) >> 16 ^ 28531;
      int var5 = 0;

      do {
         int var10002 = var6[var5] ^ 16267;
         short var10003;
         switch (var5 % 16) {
            case 0:
            default:
               var10003 = 164;
               break;
            case 1:
               var10003 = 37;
               break;
            case 2:
               var10003 = 17;
               break;
            case 3:
               var10003 = 186;
               break;
            case 4:
               var10003 = 149;
               break;
            case 5:
               var10003 = 201;
               break;
            case 6:
               var10003 = 190;
               break;
            case 7:
               var10003 = 70;
               break;
            case 8:
               var10003 = 120;
               break;
            case 9:
               var10003 = 139;
               break;
            case 10:
               var10003 = 174;
               break;
            case 11:
               var10003 = 83;
               break;
            case 12:
               var10003 = 207;
               break;
            case 13:
               var10003 = 74;
               break;
            case 14:
               var10003 = 247;
               break;
            case 15:
               var10003 = 239;
         }

         var6[var5] = (char)(var10002 ^ var10003 ^ var5 ^ var2 ^ var0 ^ var4 ^ var1);
         ++var5;
      } while(var5 < var6.length);

      return (new String(var6)).intern();
   }

   static {
      // $FF: Couldn't be decompiled
   }

   private static q2997348aa27a422480aea29cbfd800b1aaababaab[] b() {
      q2997348aa27a422480aea29cbfd800b1aaababaab[] var10000 = new q2997348aa27a422480aea29cbfd800b1aaababaab[(int)aab];
      var10000[0] = bb;
      var10000[1] = ab;
      var10000[2] = aa;
      var10000[3] = a;
      var10000[4] = aba;
      var10000[5] = b;
      return var10000;
   }
}
