package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
final class q2997348aa27a422480aea29cbfd800b1bbaabbab {
   private static final Object[] bb;
   private static final int[] b;
   private static final String[] ba;
   private static final long a;
   private final int aa;
   private final long ab;

   private q2997348aa27a422480aea29cbfd800b1bbaabbab(long var1, int var3) {
      this.ab = var1;
      this.aa = var3;
   }

   public int hashCode() {
      return Long.hashCode(this.ab) * (int)a + this.aa;
   }

   private static q2997348aa27a422480aea29cbfd800b1bbaabbab a(q2997348aa27a422480aea29cbfd800b1babba var0) {
      return new q2997348aa27a422480aea29cbfd800b1bbaabbab(var0.aaabb(), var0.aab());
   }

   static {
      int var20 = 1823235792;
      String[] var12 = new String[2];
      int var10001 = "\u0010琝ｚ䵝ݝ牝ꝟ䐝읜繽ὐ糽睚牝ꝟ䐝Ὗ\n뇩䩯늩驭량\uf26d녩舘뙩㩬".length();
      int var14 = 0;
      int var13 = 0;
      int var11 = var10001;
      short var15 = 12065;
      String var10 = "\u0010琝ｚ䵝ݝ牝ꝟ䐝읜繽ὐ糽睚牝ꝟ䐝Ὗ\n뇩䩯늩驭량\uf26d녩舘뙩㩬";

      do {
         char var16 = var10.charAt(var14);
         int var18 = 0;
         char[] var17 = var10.substring(var14 + 1, var14 + 1 + var16).toCharArray();

         do {
            char var19 = var17[var18];
            if (var18 % 2 == 0) {
               var17[var18] = (char)((var19 >>> 5 | var19 << 11) & '\uffff' ^ var15);
            } else {
               var17[var18] = (char)((var19 << 5 | var19 >>> 11) & '\uffff' ^ var15);
            }

            ++var18;
         } while(var18 < var17.length);

         var12[var13] = new String(var17);
         ++var13;
         var14 = var14 + var16 + 1;
      } while(var14 < var11);

      ba = var12;
      bb = new Object[var12.length];
      int var10000 = 0;
      var10001 = 0;
      byte[] var10002 = "+\u0004\u0091@ðý\u0087Úñ\u0000ïHL\u0013\u0012\u0011Æ7\u001b1÷¿ÅËÉ\fêJù1Ì\u0001\u0082\u0014:·".getBytes("ISO-8859-1");
      b = new int[9];

      int var40;
      do {
         b[var10000] = ((var10002[var10001] & 255) << 24 | (var10002[var10001 + 1] & 255) << 16 | (var10002[var10001 + 2] & 255) << 8 | var10002[var10001 + 3] & 255) ^ -867222642;
         ++var10000;
         var40 = var10001 + 4;
         var10001 += 4;
      } while(var40 < var10002.length);

      long var1 = 6018682894174927058L;
      long[] var0 = new long[2];
      int var4 = 0;
      String var5;
      int var6 = (var5 = aa('큧', var20 ^ -601788496, 1023)).length();
      int var3 = 0;

      do {
         var10001 = var3;
         var3 += 8;
         byte[] var7 = var5.substring(var10001, var3).getBytes(aa('큦', var20 ^ 984551912, 35709));
         var10001 = var4++;
         long var48 = (((long)var7[0] & 255L) << b(1744360108, var20 ^ 333567757) | ((long)var7[1] & 255L) << b(1744360109, var20 ^ -937901666) | ((long)var7[2] & 255L) << b(1744360110, var20 ^ -907695817) | ((long)var7[3] & 255L) << b(1744360111, var20 ^ 1962300519) | ((long)var7[4] & 255L) << b(1744360104, var20 ^ -19767976) | ((long)var7[5] & 255L) << b(1744360105, var20 ^ -816151637) | ((long)var7[b(1744360106, var20 ^ -236344117)] & 255L) << b(1744360107, var20 ^ -1043035493) | (long)var7[b(1744360100, var20 ^ -1158579139)] & 255L) ^ var1;
         var40 = -1;
         var0[var10001] = var48;
      } while(var3 < var6);

      long var8 = var0[1];
      long var32 = var0[0] ^ var8;
      var10001 = -1;
      a = var32;
   }

   private static int b(int var0, int var1) {
      int var2 = b[var0 ^ 1744360108] ^ var1 ^ var0;
      var2 -= 61843;
      var2 += 6253;
      var2 ^= 51223;
      var2 += 43745;
      var2 ^= 55554;
      var2 -= 31304;
      var2 += 55315;
      return var2;
   }

   private static String aa(char var0, int var1, int var2) {
      int var3 = var0 ^ '큧';
      char[] var4 = ba[var3].toCharArray();
      StackTraceElement[] var5 = (StackTraceElement[])bb[var3];
      StackTraceElement[] var6;
      if (var5 != null) {
         var6 = var5;
      } else {
         var6 = (new Throwable()).getStackTrace();
         bb[var3] = var6;
      }

      StackTraceElement var7 = var6[1];
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 15942;
      int var9 = 0;

      do {
         int var10 = var4[var9] + 15185;
         var10 += 26329;
         var10 ^= 6439;
         var10 ^= 21925;
         var10 ^= 28421;
         var10 += 63443;
         var10 += 23904;
         var10 += 11573;
         var4[var9] = (char)(var10 ^ var8 ^ var2 ^ var1 >> 16);
         ++var9;
      } while(var9 < var4.length);

      return (new String(var4)).intern();
   }

   public boolean equals(Object param1) {
      // $FF: Couldn't be decompiled
   }
}
