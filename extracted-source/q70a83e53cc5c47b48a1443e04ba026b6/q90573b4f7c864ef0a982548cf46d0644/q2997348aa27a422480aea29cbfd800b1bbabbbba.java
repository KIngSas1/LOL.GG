package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import com.google.gson.JsonElement;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record q2997348aa27a422480aea29cbfd800b1bbabbbba(String is, String it, String iu, String iv, String iw, String ix, int iy, int iz, boolean iA) {
   private static final String[] aa;
   private static final Long[] ab;
   private static final Object[] abab;
   private static final Integer[] ba;
   private static final long[] bb;
   private final boolean aaa;
   private final String aab;
   private final String aba;
   private static final long[] abb;
   private static final int[] aabb;
   private static final String[] a;
   private static final Integer[] b;
   private final String baa;
   private final int bab;
   private static final long[] bba;
   private final String bbb;
   private static final String[] abaa;
   private final int aaaa;
   private final String aaab;
   private final String aaba;

   public boolean aa() {
      return this.aaa;
   }

   private static long ab(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ b(-303375384, 642815858 ^ -1844476178)) & b(-303375383, 642815858 ^ -1224681829);
      if (ab[var3] == null) {
         ab[var3] = bb[var3] ^ var1;
      }

      return ab[var3];
   }

   public String a() {
      return this.aab;
   }

   public int ba() {
      return this.aaaa;
   }

   static {
      // $FF: Couldn't be decompiled
   }

   private static int bb(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ b(-303375382, 2019049372 ^ -1204320021);
      if (b[var3] == null) {
         b[var3] = (int)(abb[var3] ^ var1);
      }

      return b[var3];
   }

   public int aaa() {
      return this.bab;
   }

   public String aab() {
      return this.baa;
   }

   private static String aaab(char var0, int var1, short var2) {
      int var3 = var0 ^ '\uea2b';
      char[] var4 = abaa[var3].toCharArray();
      StackTraceElement[] var5 = (StackTraceElement[])abab[var3];
      StackTraceElement[] var6;
      if (var5 != null) {
         var6 = var5;
      } else {
         var6 = (new Throwable()).getStackTrace();
         abab[var3] = var6;
      }

      StackTraceElement var7 = var6[1];
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 31046;
      int var9 = 0;

      do {
         int var10 = var4[var9] ^ 15367;
         var10 -= 25260;
         var10 ^= 45677;
         var10 ^= 65278;
         var10 ^= 16920;
         var4[var9] = (char)(var10 ^ var8 ^ var2 ^ var1 >> 16);
         ++var9;
      } while(var9 < var4.length);

      return (new String(var4)).intern();
   }

   private static int b(int var0, int var1) {
      int var2 = aabb[var0 ^ -303375384] ^ var1 ^ var0;
      var2 ^= 36576;
      var2 -= 17399;
      var2 -= 47980;
      var2 ^= 64703;
      var2 -= 23933;
      var2 ^= 21475;
      var2 ^= 55062;
      return var2;
   }

   static q2997348aa27a422480aea29cbfd800b1bbabbbba aba(JsonElement param0) {
      // $FF: Couldn't be decompiled
   }

   public String abb() {
      return this.aaab;
   }

   public String baa() {
      return this.bbb;
   }

   private static String bab(int param0, int param1) {
      // $FF: Couldn't be decompiled
   }

   public String bba() {
      return this.aaba;
   }

   public String bbb() {
      return this.aba;
   }

   private static int aaaa(int param0, long param1) {
      // $FF: Couldn't be decompiled
   }

   private q2997348aa27a422480aea29cbfd800b1bbabbbba(String var1, String var2, String var3, String var4, String var5, String var6, int var7, int var8, boolean var9) {
      this.aaab = var1;
      this.baa = var2;
      this.aab = var3;
      this.aba = var4;
      this.aaba = var5;
      this.bbb = var6;
      this.aaaa = var7;
      this.bab = var8;
      this.aaa = var9;
   }
}
