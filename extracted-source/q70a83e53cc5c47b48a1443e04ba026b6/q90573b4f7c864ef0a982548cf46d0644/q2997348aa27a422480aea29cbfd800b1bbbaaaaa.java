package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum q2997348aa27a422480aea29cbfd800b1bbbaaaaa implements q2997348aa27a422480aea29cbfd800b1aabbbabab {
   private static final int[] baa;
   private static final Object[] bba;
   private final int a;
   private static final q2997348aa27a422480aea29cbfd800b1bbbaaaaa[] aa;
   private final q2997348aa27a422480aea29cbfd800b1babba ab;
   private static final String[] bab;
   private static final long b;
   public static final q2997348aa27a422480aea29cbfd800b1bbbaaaaa ba;
   public static final q2997348aa27a422480aea29cbfd800b1bbbaaaaa bb;
   public static final q2997348aa27a422480aea29cbfd800b1bbbaaaaa aaa;
   public static final q2997348aa27a422480aea29cbfd800b1bbbaaaaa aab;
   public static final q2997348aa27a422480aea29cbfd800b1bbbaaaaa aba;
   public static final q2997348aa27a422480aea29cbfd800b1bbbaaaaa abb;

   public Enum ba() {
      // $FF: Couldn't be decompiled
   }

   private static int aa(int var0, int var1) {
      int var2 = baa[var0 ^ 676169620] ^ var1 ^ var0;
      var2 -= 6371;
      var2 -= 38068;
      var2 -= 54002;
      var2 ^= 20345;
      var2 ^= 41857;
      var2 ^= 46840;
      return var2;
   }

   public int b() {
      return this.a;
   }

   private static q2997348aa27a422480aea29cbfd800b1bbbaaaaa[] a() {
      q2997348aa27a422480aea29cbfd800b1bbbaaaaa[] var10000 = new q2997348aa27a422480aea29cbfd800b1bbbaaaaa[(int)b];
      var10000[0] = abb;
      var10000[1] = aaa;
      var10000[2] = aba;
      var10000[3] = ba;
      var10000[4] = bb;
      var10000[5] = aab;
      return var10000;
   }

   private q2997348aa27a422480aea29cbfd800b1bbbaaaaa(q2997348aa27a422480aea29cbfd800b1babba var3, int var4) {
      this.ab = var3;
      this.a = var4;
   }

   private static String ab(int var0, int var1, int var2) {
      int var3 = var0 ^ '\ue301';
      char[] var4 = bab[var3].toCharArray();
      StackTraceElement[] var5 = (StackTraceElement[])bba[var3];
      StackTraceElement[] var6;
      if (var5 != null) {
         var6 = var5;
      } else {
         var6 = (new Throwable()).getStackTrace();
         bba[var3] = var6;
      }

      StackTraceElement var7 = var6[1];
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 28467;
      int var9 = 0;

      do {
         int var10 = var4[var9] - '釷';
         var10 ^= 37478;
         var10 ^= 23615;
         var10 += 20020;
         var10 ^= 43682;
         var10 += 18215;
         var10 ^= 62696;
         var4[var9] = (char)(var10 ^ var8 ^ var2 ^ var1 >> 16);
         ++var9;
      } while(var9 < var4.length);

      return (new String(var4)).intern();
   }

   static {
      // $FF: Couldn't be decompiled
   }

   public boolean bb() {
      // $FF: Couldn't be decompiled
   }

   public String toString() {
      return this.ab.bba();
   }
}
