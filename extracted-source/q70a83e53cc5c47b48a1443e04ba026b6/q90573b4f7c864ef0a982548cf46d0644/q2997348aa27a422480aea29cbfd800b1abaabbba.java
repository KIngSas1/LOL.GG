package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum q2997348aa27a422480aea29cbfd800b1abaabbba {
   private final q2997348aa27a422480aea29cbfd800b1babba a;
   public static final q2997348aa27a422480aea29cbfd800b1abaabbba b;
   public static final q2997348aa27a422480aea29cbfd800b1abaabbba aa;
   private static final int[] aaa;
   private static final String[] aab;
   private final q2997348aa27a422480aea29cbfd800b1babba ab;
   public static final q2997348aa27a422480aea29cbfd800b1abaabbba ba;
   private static final Object[] aba;
   private static final q2997348aa27a422480aea29cbfd800b1abaabbba[] bb;

   static {
      // $FF: Couldn't be decompiled
   }

   private static q2997348aa27a422480aea29cbfd800b1abaabbba[] a() {
      return new q2997348aa27a422480aea29cbfd800b1abaabbba[]{aa, b, ba};
   }

   public q2997348aa27a422480aea29cbfd800b1babba aa() {
      return this.ab;
   }

   private static int b(int var0, int var1) {
      int var2 = aaa[var0 ^ -42411916] ^ var1 ^ var0;
      var2 += 54821;
      var2 += 32248;
      var2 += 60233;
      var2 ^= 47536;
      var2 += 18570;
      var2 += 41307;
      var2 += 32254;
      var2 += 6870;
      return var2;
   }

   private static String bb(int var0, int var1) {
      int var3 = var0 ^ 1452432068;
      char[] var4 = aab[var3].toCharArray();
      StackTraceElement[] var2 = (StackTraceElement[])aba[var3];
      StackTraceElement[] var5;
      if (var2 != null) {
         var5 = var2;
      } else {
         var5 = (new Throwable()).getStackTrace();
         aba[var3] = var5;
      }

      StackTraceElement var6 = var5[1];
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ 2139461187;
      int var8 = 0;

      do {
         short var9;
         switch (var8 & 31) {
            case 0:
            default:
               var9 = 225;
               break;
            case 1:
               var9 = 25;
               break;
            case 2:
               var9 = 39;
               break;
            case 3:
               var9 = 60;
               break;
            case 4:
               var9 = 72;
               break;
            case 5:
               var9 = 28;
               break;
            case 6:
               var9 = 49;
               break;
            case 7:
               var9 = 237;
               break;
            case 8:
               var9 = 251;
               break;
            case 9:
               var9 = 245;
               break;
            case 10:
               var9 = 140;
               break;
            case 11:
               var9 = 74;
               break;
            case 12:
               var9 = 59;
               break;
            case 13:
               var9 = 9;
               break;
            case 14:
               var9 = 213;
               break;
            case 15:
               var9 = 63;
               break;
            case 16:
               var9 = 126;
               break;
            case 17:
               var9 = 247;
               break;
            case 18:
               var9 = 22;
               break;
            case 19:
               var9 = 31;
               break;
            case 20:
               var9 = 60;
               break;
            case 21:
               var9 = 123;
               break;
            case 22:
               var9 = 43;
               break;
            case 23:
               var9 = 185;
               break;
            case 24:
               var9 = 88;
               break;
            case 25:
               var9 = 224;
               break;
            case 26:
               var9 = 161;
               break;
            case 27:
               var9 = 98;
               break;
            case 28:
               var9 = 28;
               break;
            case 29:
               var9 = 9;
               break;
            case 30:
               var9 = 36;
               break;
            case 31:
               var9 = 17;
         }

         var4[var8] = (char)(var4[var8] ^ var9 ^ var1 >> 16 ^ var7);
         ++var8;
      } while(var8 < var4.length);

      return (new String(var4)).intern();
   }

   public String toString() {
      return this.ab.bba();
   }

   public String ab() {
      return this.ab.bba();
   }

   public String ba() {
      return this.a.bba();
   }

   private q2997348aa27a422480aea29cbfd800b1abaabbba(q2997348aa27a422480aea29cbfd800b1babba var3, q2997348aa27a422480aea29cbfd800b1babba var4) {
      this.a = var3;
      this.ab = var4;
   }
}
