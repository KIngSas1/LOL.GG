package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum q2997348aa27a422480aea29cbfd800b1aaaaab {
   private final q2997348aa27a422480aea29cbfd800b1babba a;
   private static final String[] baa;
   private static final long b;
   public static final q2997348aa27a422480aea29cbfd800b1aaaaab aa;
   public static final q2997348aa27a422480aea29cbfd800b1aaaaab ab;
   public static final q2997348aa27a422480aea29cbfd800b1aaaaab ba;
   public static final q2997348aa27a422480aea29cbfd800b1aaaaab bb;
   private static final q2997348aa27a422480aea29cbfd800b1aaaaab[] aaa;
   private static final Object[] bab;
   private static final int[] abb;
   public static final q2997348aa27a422480aea29cbfd800b1aaaaab aab;
   public static final q2997348aa27a422480aea29cbfd800b1aaaaab aba;

   private static int b(int var0, int var1) {
      int var2 = abb[var0 ^ -492505961] ^ var1 ^ var0;
      var2 += 50333;
      var2 ^= 30945;
      var2 -= 6559;
      var2 ^= 23038;
      var2 += 21698;
      var2 += 622;
      return var2;
   }

   static {
      // $FF: Couldn't be decompiled
   }

   public String a() {
      return this.a.bba();
   }

   private static q2997348aa27a422480aea29cbfd800b1aaaaab[] aa() {
      q2997348aa27a422480aea29cbfd800b1aaaaab[] var10000 = new q2997348aa27a422480aea29cbfd800b1aaaaab[(int)b];
      var10000[0] = aa;
      var10000[1] = ba;
      var10000[2] = aba;
      var10000[3] = bb;
      var10000[4] = aab;
      var10000[5] = ab;
      return var10000;
   }

   private static String bb(int var0, int var1) {
      int var3 = var0 ^ -1697475593;
      char[] var4 = baa[var3].toCharArray();
      StackTraceElement[] var2 = (StackTraceElement[])bab[var3];
      StackTraceElement[] var5;
      if (var2 != null) {
         var5 = var2;
      } else {
         var5 = (new Throwable()).getStackTrace();
         bab[var3] = var5;
      }

      StackTraceElement var6 = var5[1];
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ 408592368;
      int var8 = 0;

      do {
         short var9;
         switch (var8 & 31) {
            case 0:
            default:
               var9 = 163;
               break;
            case 1:
               var9 = 159;
               break;
            case 2:
               var9 = 52;
               break;
            case 3:
               var9 = 203;
               break;
            case 4:
               var9 = 43;
               break;
            case 5:
               var9 = 174;
               break;
            case 6:
               var9 = 119;
               break;
            case 7:
               var9 = 17;
               break;
            case 8:
               var9 = 115;
               break;
            case 9:
               var9 = 101;
               break;
            case 10:
               var9 = 188;
               break;
            case 11:
               var9 = 69;
               break;
            case 12:
               var9 = 74;
               break;
            case 13:
               var9 = 116;
               break;
            case 14:
               var9 = 17;
               break;
            case 15:
               var9 = 98;
               break;
            case 16:
               var9 = 204;
               break;
            case 17:
               var9 = 200;
               break;
            case 18:
               var9 = 65;
               break;
            case 19:
               var9 = 37;
               break;
            case 20:
               var9 = 239;
               break;
            case 21:
               var9 = 20;
               break;
            case 22:
               var9 = 204;
               break;
            case 23:
               var9 = 133;
               break;
            case 24:
               var9 = 166;
               break;
            case 25:
               var9 = 13;
               break;
            case 26:
               var9 = 183;
               break;
            case 27:
               var9 = 81;
               break;
            case 28:
               var9 = 205;
               break;
            case 29:
               var9 = 77;
               break;
            case 30:
               var9 = 87;
               break;
            case 31:
               var9 = 136;
         }

         var4[var8] = (char)(var4[var8] ^ var9 ^ var1 >> 16 ^ var7);
         ++var8;
      } while(var8 < var4.length);

      return (new String(var4)).intern();
   }

   public q2997348aa27a422480aea29cbfd800b1babba ab() {
      return this.a;
   }

   private q2997348aa27a422480aea29cbfd800b1aaaaab(q2997348aa27a422480aea29cbfd800b1babba var3) {
      this.a = var3;
   }

   public static q2997348aa27a422480aea29cbfd800b1aaaaab ba(String var0) {
      return (q2997348aa27a422480aea29cbfd800b1aaaaab)Enum.valueOf(q2997348aa27a422480aea29cbfd800b1aaaaab.class, var0);
   }
}
