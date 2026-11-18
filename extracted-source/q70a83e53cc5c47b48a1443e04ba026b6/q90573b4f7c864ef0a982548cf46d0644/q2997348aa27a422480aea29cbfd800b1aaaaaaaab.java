package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum q2997348aa27a422480aea29cbfd800b1aaaaaaaab {
   private static final int[] b;
   public static final q2997348aa27a422480aea29cbfd800b1aaaaaaaab a;
   private static final q2997348aa27a422480aea29cbfd800b1aaaaaaaab[] aa;
   private static final String[] bb;
   public static final q2997348aa27a422480aea29cbfd800b1aaaaaaaab ab;
   private static final Object[] aaa;
   private final q2997348aa27a422480aea29cbfd800b1babba ba;

   private static q2997348aa27a422480aea29cbfd800b1aaaaaaaab[] a() {
      return new q2997348aa27a422480aea29cbfd800b1aaaaaaaab[]{ab, a};
   }

   public String toString() {
      return this.ba.bba();
   }

   private static int b(int var0, int var1) {
      int var2 = b[var0 ^ 1276675148] ^ var1 ^ var0;
      var2 -= 24049;
      var2 -= 33443;
      var2 ^= 26537;
      var2 ^= 44720;
      var2 += 21518;
      var2 ^= 9153;
      return var2;
   }

   private static String ba(byte var0, char var1, int var2, byte var3, short var4, char var5, int var6) {
      int var11 = var2 ^ -2066222111;
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
      int var8 = (var14.getClassName().hashCode() ^ var14.getMethodName().hashCode()) >> 16 ^ 14984;
      int var9 = 0;

      do {
         int var10002 = var10[var9] ^ var9;
         short var10003;
         switch (var9 % 13) {
            case 0:
            default:
               var10003 = 114;
               break;
            case 1:
               var10003 = 190;
               break;
            case 2:
               var10003 = 207;
               break;
            case 3:
               var10003 = 103;
               break;
            case 4:
               var10003 = 192;
               break;
            case 5:
               var10003 = 199;
               break;
            case 6:
               var10003 = 120;
               break;
            case 7:
               var10003 = 224;
               break;
            case 8:
               var10003 = 170;
               break;
            case 9:
               var10003 = 229;
               break;
            case 10:
               var10003 = 90;
               break;
            case 11:
               var10003 = 234;
               break;
            case 12:
               var10003 = 83;
         }

         var10[var9] = (char)(var10002 ^ var10003 ^ 28996 ^ var0 ^ var1 ^ var8 ^ var6 ^ var4 ^ var2 ^ var5 ^ var3);
         ++var9;
      } while(var9 < var10.length);

      return (new String(var10)).intern();
   }

   private q2997348aa27a422480aea29cbfd800b1aaaaaaaab(q2997348aa27a422480aea29cbfd800b1babba var3) {
      this.ba = var3;
   }

   public static q2997348aa27a422480aea29cbfd800b1aaaaaaaab aa(String var0) {
      return (q2997348aa27a422480aea29cbfd800b1aaaaaaaab)Enum.valueOf(q2997348aa27a422480aea29cbfd800b1aaaaaaaab.class, var0);
   }

   static {
      // $FF: Couldn't be decompiled
   }

   public q2997348aa27a422480aea29cbfd800b1babba ab() {
      return this.ba;
   }
}
