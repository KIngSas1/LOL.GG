package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
enum q2997348aa27a422480aea29cbfd800b1aaaaaabaa {
   private final q2997348aa27a422480aea29cbfd800b1babba a;
   public static final q2997348aa27a422480aea29cbfd800b1aaaaaabaa b;
   private static final int[] ba;
   private static final String[] bb;
   public static final q2997348aa27a422480aea29cbfd800b1aaaaaabaa aa;
   private static final Object[] aaa;
   private static final q2997348aa27a422480aea29cbfd800b1aaaaaabaa[] ab;

   private static int b(int var0, int var1) {
      int var2 = ba[var0 ^ -228585248] ^ var1 ^ var0;
      var2 ^= 31411;
      var2 -= 48116;
      var2 ^= 34876;
      var2 += 59612;
      var2 += 38369;
      var2 ^= 25252;
      var2 -= 40655;
      var2 -= 16006;
      var2 += 2948;
      return var2;
   }

   static {
      // $FF: Couldn't be decompiled
   }

   private q2997348aa27a422480aea29cbfd800b1aaaaaabaa(q2997348aa27a422480aea29cbfd800b1babba var3) {
      this.a = var3;
   }

   public static q2997348aa27a422480aea29cbfd800b1aaaaaabaa a(String var0) {
      return (q2997348aa27a422480aea29cbfd800b1aaaaaabaa)Enum.valueOf(q2997348aa27a422480aea29cbfd800b1aaaaaabaa.class, var0);
   }

   private static q2997348aa27a422480aea29cbfd800b1aaaaaabaa[] aa() {
      return new q2997348aa27a422480aea29cbfd800b1aaaaaabaa[]{aa, b};
   }

   private static String ab(int var0, int var1) {
      int var3 = var0 ^ -664725195;
      char[] var4 = bb[var3].toCharArray();
      StackTraceElement[] var2 = (StackTraceElement[])aaa[var3];
      StackTraceElement[] var5;
      if (var2 != null) {
         var5 = var2;
      } else {
         var5 = (new Throwable()).getStackTrace();
         aaa[var3] = var5;
      }

      StackTraceElement var6 = var5[1];
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ -2121877093;
      int var8 = 0;

      do {
         short var9;
         switch (var8 & 31) {
            case 0:
            default:
               var9 = 81;
               break;
            case 1:
               var9 = 252;
               break;
            case 2:
               var9 = 232;
               break;
            case 3:
               var9 = 145;
               break;
            case 4:
               var9 = 240;
               break;
            case 5:
               var9 = 234;
               break;
            case 6:
               var9 = 23;
               break;
            case 7:
               var9 = 242;
               break;
            case 8:
               var9 = 237;
               break;
            case 9:
               var9 = 84;
               break;
            case 10:
               var9 = 140;
               break;
            case 11:
               var9 = 57;
               break;
            case 12:
               var9 = 116;
               break;
            case 13:
               var9 = 240;
               break;
            case 14:
               var9 = 101;
               break;
            case 15:
               var9 = 138;
               break;
            case 16:
               var9 = 230;
               break;
            case 17:
               var9 = 94;
               break;
            case 18:
               var9 = 124;
               break;
            case 19:
               var9 = 34;
               break;
            case 20:
               var9 = 89;
               break;
            case 21:
               var9 = 170;
               break;
            case 22:
               var9 = 148;
               break;
            case 23:
               var9 = 92;
               break;
            case 24:
               var9 = 247;
               break;
            case 25:
               var9 = 161;
               break;
            case 26:
               var9 = 114;
               break;
            case 27:
               var9 = 117;
               break;
            case 28:
               var9 = 45;
               break;
            case 29:
               var9 = 160;
               break;
            case 30:
               var9 = 13;
               break;
            case 31:
               var9 = 0;
         }

         var4[var8] = (char)(var4[var8] ^ var9 ^ var1 >> 16 ^ var7);
         ++var8;
      } while(var8 < var4.length);

      return (new String(var4)).intern();
   }

   public String toString() {
      return this.a.bba();
   }
}
