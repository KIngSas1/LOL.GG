package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum q2997348aa27a422480aea29cbfd800b1aabbb {
   private static final Object[] aaa;
   private final q2997348aa27a422480aea29cbfd800b1babba a;
   private static final String[] bb;
   private static final q2997348aa27a422480aea29cbfd800b1aabbb[] b;
   public static final q2997348aa27a422480aea29cbfd800b1aabbb aa;
   private static final int[] ba;
   public static final q2997348aa27a422480aea29cbfd800b1aabbb ab;

   private static q2997348aa27a422480aea29cbfd800b1aabbb[] a() {
      return new q2997348aa27a422480aea29cbfd800b1aabbb[]{aa, ab};
   }

   public String toString() {
      return this.a.bba();
   }

   private static int b(int var0, int var1) {
      int var2 = ba[var0 ^ 289257043] ^ var1 ^ var0;
      var2 ^= 33573;
      var2 ^= 54996;
      var2 -= 20633;
      var2 -= 55287;
      var2 += 47067;
      var2 ^= 42049;
      var2 += 55320;
      var2 ^= 59346;
      var2 -= 38673;
      var2 ^= 40578;
      return var2;
   }

   static {
      // $FF: Couldn't be decompiled
   }

   private static String aa(short var0, int var1, short var2, int var3) {
      int var8 = var1 ^ 1685163447;
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
      int var5 = (var11.getClassName().hashCode() ^ var11.getMethodName().hashCode()) >> 16 ^ 30383;
      int var6 = 0;

      do {
         int var10002 = var7[var6] ^ '턁';
         short var10003;
         switch (var6 % 18) {
            case 0:
            default:
               var10003 = 15;
               break;
            case 1:
               var10003 = 134;
               break;
            case 2:
               var10003 = 76;
               break;
            case 3:
               var10003 = 160;
               break;
            case 4:
               var10003 = 191;
               break;
            case 5:
               var10003 = 199;
               break;
            case 6:
               var10003 = 2;
               break;
            case 7:
               var10003 = 234;
               break;
            case 8:
               var10003 = 69;
               break;
            case 9:
               var10003 = 189;
               break;
            case 10:
               var10003 = 212;
               break;
            case 11:
               var10003 = 206;
               break;
            case 12:
               var10003 = 91;
               break;
            case 13:
               var10003 = 62;
               break;
            case 14:
               var10003 = 54;
               break;
            case 15:
               var10003 = 142;
               break;
            case 16:
               var10003 = 171;
               break;
            case 17:
               var10003 = 66;
         }

         var7[var6] = (char)(var10002 ^ var10003 ^ var2 ^ var3 ^ var5 ^ var0 ^ var1);
         ++var6;
      } while(var6 < var7.length);

      return (new String(var7)).intern();
   }

   private q2997348aa27a422480aea29cbfd800b1aabbb(q2997348aa27a422480aea29cbfd800b1babba var3) {
      this.a = var3;
   }
}
