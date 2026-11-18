package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum q2997348aa27a422480aea29cbfd800b1bbaaabaa {
   private static final String[] aab;
   public static final q2997348aa27a422480aea29cbfd800b1bbaaabaa a;
   private final q2997348aa27a422480aea29cbfd800b1babba aa;
   public static final q2997348aa27a422480aea29cbfd800b1bbaaabaa b;
   public static final q2997348aa27a422480aea29cbfd800b1bbaaabaa ab;
   private static final Object[] aba;
   private static final int[] aaa;
   private static final q2997348aa27a422480aea29cbfd800b1bbaaabaa[] ba;
   public static final q2997348aa27a422480aea29cbfd800b1bbaaabaa bb;

   private static q2997348aa27a422480aea29cbfd800b1bbaaabaa[] a() {
      return new q2997348aa27a422480aea29cbfd800b1bbaaabaa[]{ab, a, b, bb};
   }

   private static int b(int var0, int var1) {
      int var2 = aaa[var0 ^ 116743013] ^ var1 ^ var0;
      var2 += 5806;
      var2 -= 37927;
      var2 ^= 40896;
      var2 += 46589;
      var2 += 30066;
      var2 ^= 57680;
      return var2;
   }

   static {
      // $FF: Couldn't be decompiled
   }

   private static String ba(int var0, int var1) {
      int var3 = var0 ^ 378789930;
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
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ 1610343274;
      int var8 = 0;

      do {
         short var9;
         switch (var8 & 31) {
            case 0:
            default:
               var9 = 85;
               break;
            case 1:
               var9 = 109;
               break;
            case 2:
               var9 = 102;
               break;
            case 3:
               var9 = 76;
               break;
            case 4:
               var9 = 188;
               break;
            case 5:
               var9 = 162;
               break;
            case 6:
               var9 = 59;
               break;
            case 7:
               var9 = 21;
               break;
            case 8:
               var9 = 167;
               break;
            case 9:
               var9 = 166;
               break;
            case 10:
               var9 = 72;
               break;
            case 11:
               var9 = 146;
               break;
            case 12:
               var9 = 119;
               break;
            case 13:
               var9 = 112;
               break;
            case 14:
               var9 = 183;
               break;
            case 15:
               var9 = 68;
               break;
            case 16:
               var9 = 213;
               break;
            case 17:
               var9 = 42;
               break;
            case 18:
               var9 = 251;
               break;
            case 19:
               var9 = 22;
               break;
            case 20:
               var9 = 227;
               break;
            case 21:
               var9 = 208;
               break;
            case 22:
               var9 = 23;
               break;
            case 23:
               var9 = 221;
               break;
            case 24:
               var9 = 118;
               break;
            case 25:
               var9 = 229;
               break;
            case 26:
               var9 = 196;
               break;
            case 27:
               var9 = 117;
               break;
            case 28:
               var9 = 45;
               break;
            case 29:
               var9 = 119;
               break;
            case 30:
               var9 = 38;
               break;
            case 31:
               var9 = 206;
         }

         var4[var8] = (char)(var4[var8] ^ var9 ^ var1 >> 16 ^ var7);
         ++var8;
      } while(var8 < var4.length);

      return (new String(var4)).intern();
   }

   public q2997348aa27a422480aea29cbfd800b1babba aa() {
      return this.aa;
   }

   private q2997348aa27a422480aea29cbfd800b1bbaaabaa(q2997348aa27a422480aea29cbfd800b1babba var3) {
      this.aa = var3;
   }

   public String ab() {
      return this.aa.bba();
   }
}
