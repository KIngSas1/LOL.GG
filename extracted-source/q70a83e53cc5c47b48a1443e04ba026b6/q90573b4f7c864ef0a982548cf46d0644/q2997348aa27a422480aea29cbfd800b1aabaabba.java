package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import java.awt.Color;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum q2997348aa27a422480aea29cbfd800b1aabaabba {
   private static final q2997348aa27a422480aea29cbfd800b1aabaabba[] a;
   public static final q2997348aa27a422480aea29cbfd800b1aabaabba aa;
   private static final int[] aba;
   private final Color ab;
   public static final q2997348aa27a422480aea29cbfd800b1aabaabba b;
   private final q2997348aa27a422480aea29cbfd800b1babba ba;
   public static final q2997348aa27a422480aea29cbfd800b1aabaabba bb;
   public static final q2997348aa27a422480aea29cbfd800b1aabaabba aaa;
   private static final Object[] baa;
   private static final String[] abb;
   public static final q2997348aa27a422480aea29cbfd800b1aabaabba aab;

   public Color a() {
      return this.ab;
   }

   private static q2997348aa27a422480aea29cbfd800b1aabaabba[] aa() {
      return new q2997348aa27a422480aea29cbfd800b1aabaabba[]{aab, bb, aaa, aa, b};
   }

   public q2997348aa27a422480aea29cbfd800b1babba ab() {
      return this.ba;
   }

   private static String aaa(int var0, int var1) {
      int var3 = var0 ^ 898794974;
      char[] var4 = abb[var3].toCharArray();
      StackTraceElement[] var2 = (StackTraceElement[])baa[var3];
      StackTraceElement[] var5;
      if (var2 != null) {
         var5 = var2;
      } else {
         var5 = (new Throwable()).getStackTrace();
         baa[var3] = var5;
      }

      StackTraceElement var6 = var5[1];
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ 149079037;
      int var8 = 0;

      do {
         short var9;
         switch (var8 & 31) {
            case 0:
            default:
               var9 = 241;
               break;
            case 1:
               var9 = 66;
               break;
            case 2:
               var9 = 91;
               break;
            case 3:
               var9 = 109;
               break;
            case 4:
               var9 = 110;
               break;
            case 5:
               var9 = 229;
               break;
            case 6:
               var9 = 209;
               break;
            case 7:
               var9 = 140;
               break;
            case 8:
               var9 = 40;
               break;
            case 9:
               var9 = 58;
               break;
            case 10:
               var9 = 37;
               break;
            case 11:
               var9 = 214;
               break;
            case 12:
               var9 = 69;
               break;
            case 13:
               var9 = 124;
               break;
            case 14:
               var9 = 129;
               break;
            case 15:
               var9 = 201;
               break;
            case 16:
               var9 = 103;
               break;
            case 17:
               var9 = 217;
               break;
            case 18:
               var9 = 65;
               break;
            case 19:
               var9 = 253;
               break;
            case 20:
               var9 = 15;
               break;
            case 21:
               var9 = 85;
               break;
            case 22:
               var9 = 194;
               break;
            case 23:
               var9 = 191;
               break;
            case 24:
               var9 = 187;
               break;
            case 25:
               var9 = 118;
               break;
            case 26:
               var9 = 7;
               break;
            case 27:
               var9 = 105;
               break;
            case 28:
               var9 = 203;
               break;
            case 29:
               var9 = 183;
               break;
            case 30:
               var9 = 37;
               break;
            case 31:
               var9 = 37;
         }

         var4[var8] = (char)(var4[var8] ^ var9 ^ var1 >> 16 ^ var7);
         ++var8;
      } while(var8 < var4.length);

      return (new String(var4)).intern();
   }

   public static q2997348aa27a422480aea29cbfd800b1aabaabba ba(String var0) {
      return (q2997348aa27a422480aea29cbfd800b1aabaabba)Enum.valueOf(q2997348aa27a422480aea29cbfd800b1aabaabba.class, var0);
   }

   static {
      // $FF: Couldn't be decompiled
   }

   private static int bb(int var0, int var1) {
      int var2 = aba[var0 ^ -1863167482] ^ var1 ^ var0;
      var2 += 13851;
      var2 -= 48513;
      var2 += 14605;
      var2 += 25643;
      var2 ^= 41230;
      var2 += 12924;
      var2 ^= 23972;
      var2 -= 32186;
      var2 ^= 35990;
      return var2;
   }

   private q2997348aa27a422480aea29cbfd800b1aabaabba(Color var3, q2997348aa27a422480aea29cbfd800b1babba var4) {
      this.ab = var3;
      this.ba = var4;
   }

   public String b() {
      return this.ba.bba();
   }
}
