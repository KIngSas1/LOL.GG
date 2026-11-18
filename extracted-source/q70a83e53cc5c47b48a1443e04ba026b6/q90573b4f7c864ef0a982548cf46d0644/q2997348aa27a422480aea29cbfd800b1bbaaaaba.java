package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
enum q2997348aa27a422480aea29cbfd800b1bbaaaaba implements q2997348aa27a422480aea29cbfd800b1aabbbabab {
   public static final q2997348aa27a422480aea29cbfd800b1bbaaaaba a;
   private final q2997348aa27a422480aea29cbfd800b1babba aa;
   public static final q2997348aa27a422480aea29cbfd800b1bbaaaaba b;
   private static final Object[] baa;
   public static final q2997348aa27a422480aea29cbfd800b1bbaaaaba ab;
   private static final String[] abb;
   public static final q2997348aa27a422480aea29cbfd800b1bbaaaaba ba;
   private static final q2997348aa27a422480aea29cbfd800b1bbaaaaba[] bb;
   private static final int[] aba;
   public static final q2997348aa27a422480aea29cbfd800b1bbaaaaba aaa;
   private final boolean aab;

   public static q2997348aa27a422480aea29cbfd800b1bbaaaaba aa(String var0) {
      return (q2997348aa27a422480aea29cbfd800b1bbaaaaba)Enum.valueOf(q2997348aa27a422480aea29cbfd800b1bbaaaaba.class, var0);
   }

   private q2997348aa27a422480aea29cbfd800b1bbaaaaba(q2997348aa27a422480aea29cbfd800b1babba var3, boolean var4) {
      this.aa = var3;
      this.aab = var4;
   }

   public boolean bb() {
      return this.aab;
   }

   private static String ab(char var0, int var1, char var2) {
      int var3 = var0 ^ 29387;
      char[] var4 = abb[var3].toCharArray();
      StackTraceElement[] var5 = (StackTraceElement[])baa[var3];
      StackTraceElement[] var6;
      if (var5 != null) {
         var6 = var5;
      } else {
         var6 = (new Throwable()).getStackTrace();
         baa[var3] = var6;
      }

      StackTraceElement var7 = var6[1];
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 2615;
      int var9 = 0;

      do {
         int var10 = var4[var9] ^ 24871;
         var10 ^= 57949;
         var10 += 37154;
         var10 -= 9940;
         var10 ^= 9961;
         var10 += 44405;
         var10 += 51614;
         var10 += 13078;
         var10 += 50717;
         var10 -= 4724;
         var4[var9] = (char)(var10 ^ var8 ^ var2 ^ var1 >> 16);
         ++var9;
      } while(var9 < var4.length);

      return (new String(var4)).intern();
   }

   private q2997348aa27a422480aea29cbfd800b1bbaaaaba(q2997348aa27a422480aea29cbfd800b1babba var3) {
      this(var3, true);
   }

   private static int a(int var0, int var1) {
      int var2 = aba[var0 ^ -1148023920] ^ var1 ^ var0;
      var2 -= 62511;
      var2 -= 39771;
      var2 ^= 41988;
      var2 ^= 55930;
      var2 += 49525;
      var2 ^= 55906;
      var2 += 9342;
      return var2;
   }

   static {
      // $FF: Couldn't be decompiled
   }

   public String toString() {
      return this.aa.bba();
   }

   private static q2997348aa27a422480aea29cbfd800b1bbaaaaba[] b() {
      return new q2997348aa27a422480aea29cbfd800b1bbaaaaba[]{a, b, aaa, ba, ab};
   }

   public Enum ba() {
      // $FF: Couldn't be decompiled
   }
}
