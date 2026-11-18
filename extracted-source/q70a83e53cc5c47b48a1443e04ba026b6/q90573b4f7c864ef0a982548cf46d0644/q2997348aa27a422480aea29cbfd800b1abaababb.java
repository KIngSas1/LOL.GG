package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
enum q2997348aa27a422480aea29cbfd800b1abaababb {
   private static final String[] aab;
   private static final q2997348aa27a422480aea29cbfd800b1abaababb[] a;
   private static final Object[] aba;
   private final boolean aa;
   private final boolean b;
   private static final int[] aaa;
   public static final q2997348aa27a422480aea29cbfd800b1abaababb ab;
   public static final q2997348aa27a422480aea29cbfd800b1abaababb ba;
   public static final q2997348aa27a422480aea29cbfd800b1abaababb bb;

   private q2997348aa27a422480aea29cbfd800b1abaababb(boolean var3, boolean var4) {
      this.aa = var3;
      this.b = var4;
   }

   public static q2997348aa27a422480aea29cbfd800b1abaababb a(String var0) {
      return (q2997348aa27a422480aea29cbfd800b1abaababb)Enum.valueOf(q2997348aa27a422480aea29cbfd800b1abaababb.class, var0);
   }

   boolean aa() {
      return this.aa;
   }

   private static String bb(int var0, int var1) {
      int var3 = var0 ^ -1234998745;
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
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ 73551721;
      int var8 = 0;

      do {
         short var9;
         switch (var8 & 31) {
            case 0:
            default:
               var9 = 130;
               break;
            case 1:
               var9 = 144;
               break;
            case 2:
               var9 = 220;
               break;
            case 3:
               var9 = 125;
               break;
            case 4:
               var9 = 148;
               break;
            case 5:
               var9 = 234;
               break;
            case 6:
               var9 = 16;
               break;
            case 7:
               var9 = 248;
               break;
            case 8:
               var9 = 166;
               break;
            case 9:
               var9 = 239;
               break;
            case 10:
               var9 = 18;
               break;
            case 11:
               var9 = 49;
               break;
            case 12:
               var9 = 13;
               break;
            case 13:
               var9 = 249;
               break;
            case 14:
               var9 = 227;
               break;
            case 15:
               var9 = 50;
               break;
            case 16:
               var9 = 224;
               break;
            case 17:
               var9 = 87;
               break;
            case 18:
               var9 = 242;
               break;
            case 19:
               var9 = 142;
               break;
            case 20:
               var9 = 49;
               break;
            case 21:
               var9 = 5;
               break;
            case 22:
               var9 = 54;
               break;
            case 23:
               var9 = 61;
               break;
            case 24:
               var9 = 215;
               break;
            case 25:
               var9 = 1;
               break;
            case 26:
               var9 = 40;
               break;
            case 27:
               var9 = 154;
               break;
            case 28:
               var9 = 210;
               break;
            case 29:
               var9 = 91;
               break;
            case 30:
               var9 = 93;
               break;
            case 31:
               var9 = 97;
         }

         var4[var8] = (char)(var4[var8] ^ var9 ^ var1 >> 16 ^ var7);
         ++var8;
      } while(var8 < var4.length);

      return (new String(var4)).intern();
   }

   static {
      // $FF: Couldn't be decompiled
   }

   private static int ba(int var0, int var1) {
      int var2 = aaa[var0 ^ -909390633] ^ var1 ^ var0;
      var2 += 41570;
      var2 ^= 47336;
      var2 -= 44119;
      var2 += 48535;
      var2 ^= 25275;
      var2 += 25298;
      var2 -= 42552;
      var2 -= 38866;
      return var2;
   }

   boolean b() {
      return this.b;
   }

   private static q2997348aa27a422480aea29cbfd800b1abaababb[] ab() {
      return new q2997348aa27a422480aea29cbfd800b1abaababb[]{ba, ab, bb};
   }
}
