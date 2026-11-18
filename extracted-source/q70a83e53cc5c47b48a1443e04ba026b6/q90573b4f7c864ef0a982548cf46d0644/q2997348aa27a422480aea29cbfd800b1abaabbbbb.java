package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum q2997348aa27a422480aea29cbfd800b1abaabbbbb {
   public static final q2997348aa27a422480aea29cbfd800b1abaabbbbb a;
   private static final q2997348aa27a422480aea29cbfd800b1abaabbbbb[] aa;
   public static final q2997348aa27a422480aea29cbfd800b1abaabbbbb ab;
   private static final Object[] aaa;
   private static final String[] bb;
   private static final int[] b;
   private final q2997348aa27a422480aea29cbfd800b1babba ba;

   private static int b(int var0, int var1) {
      int var2 = b[var0 ^ 1304391004] ^ var1 ^ var0;
      var2 += 43420;
      var2 ^= 25749;
      var2 += 30871;
      var2 -= 20648;
      var2 -= 32179;
      var2 ^= 9014;
      var2 += 275;
      var2 ^= 41403;
      var2 -= 31088;
      return var2;
   }

   public String toString() {
      return this.ba.bba();
   }

   private q2997348aa27a422480aea29cbfd800b1abaabbbbb(q2997348aa27a422480aea29cbfd800b1babba var3) {
      this.ba = var3;
   }

   static {
      // $FF: Couldn't be decompiled
   }

   private static q2997348aa27a422480aea29cbfd800b1abaabbbbb[] a() {
      return new q2997348aa27a422480aea29cbfd800b1abaabbbbb[]{ab, a};
   }

   private static String aa(int var0, int var1) {
      int var3 = var0 ^ -121824748;
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
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ -115065099;
      int var8 = 0;

      do {
         short var9;
         switch (var8 & 31) {
            case 0:
            default:
               var9 = 91;
               break;
            case 1:
               var9 = 177;
               break;
            case 2:
               var9 = 245;
               break;
            case 3:
               var9 = 20;
               break;
            case 4:
               var9 = 85;
               break;
            case 5:
               var9 = 160;
               break;
            case 6:
               var9 = 237;
               break;
            case 7:
               var9 = 42;
               break;
            case 8:
               var9 = 14;
               break;
            case 9:
               var9 = 131;
               break;
            case 10:
               var9 = 88;
               break;
            case 11:
               var9 = 208;
               break;
            case 12:
               var9 = 103;
               break;
            case 13:
               var9 = 81;
               break;
            case 14:
               var9 = 169;
               break;
            case 15:
               var9 = 83;
               break;
            case 16:
               var9 = 247;
               break;
            case 17:
               var9 = 133;
               break;
            case 18:
               var9 = 127;
               break;
            case 19:
               var9 = 104;
               break;
            case 20:
               var9 = 52;
               break;
            case 21:
               var9 = 244;
               break;
            case 22:
               var9 = 168;
               break;
            case 23:
               var9 = 63;
               break;
            case 24:
               var9 = 7;
               break;
            case 25:
               var9 = 37;
               break;
            case 26:
               var9 = 230;
               break;
            case 27:
               var9 = 169;
               break;
            case 28:
               var9 = 162;
               break;
            case 29:
               var9 = 27;
               break;
            case 30:
               var9 = 222;
               break;
            case 31:
               var9 = 217;
         }

         var4[var8] = (char)(var4[var8] ^ var9 ^ var1 >> 16 ^ var7);
         ++var8;
      } while(var8 < var4.length);

      return (new String(var4)).intern();
   }
}
