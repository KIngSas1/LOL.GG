package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
enum q2997348aa27a422480aea29cbfd800b1abaaba implements q2997348aa27a422480aea29cbfd800b1aabbbabab {
   private final q2997348aa27a422480aea29cbfd800b1babba a;
   private static final int[] aaa;
   private static final q2997348aa27a422480aea29cbfd800b1abaaba[] b;
   private static final String[] aab;
   public static final q2997348aa27a422480aea29cbfd800b1abaaba aa;
   private static final Object[] aba;
   private final boolean ab;
   public static final q2997348aa27a422480aea29cbfd800b1abaaba ba;
   public static final q2997348aa27a422480aea29cbfd800b1abaaba bb;

   private q2997348aa27a422480aea29cbfd800b1abaaba(q2997348aa27a422480aea29cbfd800b1babba var3, boolean var4) {
      this.a = var3;
      this.ab = var4;
   }

   private static q2997348aa27a422480aea29cbfd800b1abaaba[] aa() {
      return new q2997348aa27a422480aea29cbfd800b1abaaba[]{bb, ba, aa};
   }

   public String toString() {
      return this.a.bba();
   }

   static {
      // $FF: Couldn't be decompiled
   }

   private static String ab(int var0, int var1) {
      int var3 = var0 ^ -514119066;
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
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ 1948542982;
      int var8 = 0;

      do {
         short var9;
         switch (var8 & 31) {
            case 0:
            default:
               var9 = 24;
               break;
            case 1:
               var9 = 129;
               break;
            case 2:
               var9 = 102;
               break;
            case 3:
               var9 = 74;
               break;
            case 4:
               var9 = 226;
               break;
            case 5:
               var9 = 165;
               break;
            case 6:
               var9 = 162;
               break;
            case 7:
               var9 = 86;
               break;
            case 8:
               var9 = 201;
               break;
            case 9:
               var9 = 225;
               break;
            case 10:
               var9 = 143;
               break;
            case 11:
               var9 = 151;
               break;
            case 12:
               var9 = 71;
               break;
            case 13:
               var9 = 243;
               break;
            case 14:
               var9 = 5;
               break;
            case 15:
               var9 = 135;
               break;
            case 16:
               var9 = 179;
               break;
            case 17:
               var9 = 243;
               break;
            case 18:
               var9 = 94;
               break;
            case 19:
               var9 = 127;
               break;
            case 20:
               var9 = 247;
               break;
            case 21:
               var9 = 79;
               break;
            case 22:
               var9 = 1;
               break;
            case 23:
               var9 = 202;
               break;
            case 24:
               var9 = 14;
               break;
            case 25:
               var9 = 37;
               break;
            case 26:
               var9 = 97;
               break;
            case 27:
               var9 = 225;
               break;
            case 28:
               var9 = 125;
               break;
            case 29:
               var9 = 138;
               break;
            case 30:
               var9 = 98;
               break;
            case 31:
               var9 = 38;
         }

         var4[var8] = (char)(var4[var8] ^ var9 ^ var1 >> 16 ^ var7);
         ++var8;
      } while(var8 < var4.length);

      return (new String(var4)).intern();
   }

   public static q2997348aa27a422480aea29cbfd800b1abaaba a(String var0) {
      return (q2997348aa27a422480aea29cbfd800b1abaaba)Enum.valueOf(q2997348aa27a422480aea29cbfd800b1abaaba.class, var0);
   }

   private static int b(int var0, int var1) {
      int var2 = aaa[var0 ^ -198085941] ^ var1 ^ var0;
      var2 ^= 17155;
      var2 += 14750;
      var2 ^= 26390;
      var2 += 60729;
      var2 -= 56981;
      var2 += 25784;
      var2 += 28993;
      var2 += 11879;
      var2 += 5985;
      return var2;
   }

   public Enum ba() {
      return this;
   }

   private q2997348aa27a422480aea29cbfd800b1abaaba(q2997348aa27a422480aea29cbfd800b1babba var3) {
      this(var3, true);
   }

   public boolean bb() {
      return this.ab;
   }
}
