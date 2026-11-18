package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum q2997348aa27a422480aea29cbfd800b1aabbaabba {
   private static final q2997348aa27a422480aea29cbfd800b1aabbaabba[] a;
   public static final q2997348aa27a422480aea29cbfd800b1aabbaabba aa;
   private static final int[] bb;
   private final q2997348aa27a422480aea29cbfd800b1babba ab;
   private static final String[] aaa;
   public static final q2997348aa27a422480aea29cbfd800b1aabbaabba b;
   private static final Object[] aab;
   public static final q2997348aa27a422480aea29cbfd800b1aabbaabba ba;

   static {
      // $FF: Couldn't be decompiled
   }

   private static q2997348aa27a422480aea29cbfd800b1aabbaabba[] a() {
      return new q2997348aa27a422480aea29cbfd800b1aabbaabba[]{ba, b, aa};
   }

   public String toString() {
      return this.ab.bba();
   }

   private static int b(int var0, int var1) {
      int var2 = bb[var0 ^ 1373140882] ^ var1 ^ var0;
      var2 ^= 30510;
      var2 += 13671;
      var2 ^= 58085;
      var2 ^= 20143;
      var2 ^= 64161;
      var2 -= 59455;
      var2 -= 38256;
      var2 += 53275;
      return var2;
   }

   private static String ab(int var0, int var1) {
      int var3 = var0 ^ 135501415;
      char[] var4 = aaa[var3].toCharArray();
      StackTraceElement[] var2 = (StackTraceElement[])aab[var3];
      StackTraceElement[] var5;
      if (var2 != null) {
         var5 = var2;
      } else {
         var5 = (new Throwable()).getStackTrace();
         aab[var3] = var5;
      }

      StackTraceElement var6 = var5[1];
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ 787928429;
      int var8 = 0;

      do {
         short var9;
         switch (var8 & 31) {
            case 0:
            default:
               var9 = 146;
               break;
            case 1:
               var9 = 250;
               break;
            case 2:
               var9 = 121;
               break;
            case 3:
               var9 = 103;
               break;
            case 4:
               var9 = 111;
               break;
            case 5:
               var9 = 21;
               break;
            case 6:
               var9 = 96;
               break;
            case 7:
               var9 = 46;
               break;
            case 8:
               var9 = 193;
               break;
            case 9:
               var9 = 12;
               break;
            case 10:
               var9 = 48;
               break;
            case 11:
               var9 = 172;
               break;
            case 12:
               var9 = 169;
               break;
            case 13:
               var9 = 226;
               break;
            case 14:
               var9 = 77;
               break;
            case 15:
               var9 = 242;
               break;
            case 16:
               var9 = 110;
               break;
            case 17:
               var9 = 6;
               break;
            case 18:
               var9 = 89;
               break;
            case 19:
               var9 = 249;
               break;
            case 20:
               var9 = 88;
               break;
            case 21:
               var9 = 204;
               break;
            case 22:
               var9 = 26;
               break;
            case 23:
               var9 = 140;
               break;
            case 24:
               var9 = 184;
               break;
            case 25:
               var9 = 21;
               break;
            case 26:
               var9 = 101;
               break;
            case 27:
               var9 = 230;
               break;
            case 28:
               var9 = 115;
               break;
            case 29:
               var9 = 79;
               break;
            case 30:
               var9 = 17;
               break;
            case 31:
               var9 = 214;
         }

         var4[var8] = (char)(var4[var8] ^ var9 ^ var1 >> 16 ^ var7);
         ++var8;
      } while(var8 < var4.length);

      return (new String(var4)).intern();
   }

   private q2997348aa27a422480aea29cbfd800b1aabbaabba(q2997348aa27a422480aea29cbfd800b1babba var3) {
      this.ab = var3;
   }

   public boolean aa(boolean param1) {
      // $FF: Couldn't be decompiled
   }
}
