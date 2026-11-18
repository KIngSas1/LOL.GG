package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum q2997348aa27a422480aea29cbfd800b1abbaabaab implements q2997348aa27a422480aea29cbfd800b1aabbbabab {
   private static final Object[] aab;
   private static final String[] aaa;
   public static final q2997348aa27a422480aea29cbfd800b1abbaabaab a;
   private static final int[] b;
   public static final q2997348aa27a422480aea29cbfd800b1abbaabaab aa;
   private static final q2997348aa27a422480aea29cbfd800b1abbaabaab[] ab;
   public static final q2997348aa27a422480aea29cbfd800b1abbaabaab ba;
   private final q2997348aa27a422480aea29cbfd800b1babba bb;

   static {
      // $FF: Couldn't be decompiled
   }

   private static String b(char var0, int var1, int var2) {
      int var3 = var0 ^ 'ꢲ';
      char[] var4 = aaa[var3].toCharArray();
      StackTraceElement[] var5 = (StackTraceElement[])aab[var3];
      StackTraceElement[] var6;
      if (var5 != null) {
         var6 = var5;
      } else {
         var6 = (new Throwable()).getStackTrace();
         aab[var3] = var6;
      }

      StackTraceElement var7 = var6[1];
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 8947;
      int var9 = 0;

      do {
         int var10 = var4[var9] - 'ꠥ';
         var10 += 34309;
         var10 -= 23484;
         var10 += 17696;
         var10 += 41133;
         var4[var9] = (char)(var10 ^ var8 ^ var2 ^ var1 >> 16);
         ++var9;
      } while(var9 < var4.length);

      return (new String(var4)).intern();
   }

   public static q2997348aa27a422480aea29cbfd800b1abbaabaab aa(String var0) {
      return (q2997348aa27a422480aea29cbfd800b1abbaabaab)Enum.valueOf(q2997348aa27a422480aea29cbfd800b1abbaabaab.class, var0);
   }

   private q2997348aa27a422480aea29cbfd800b1abbaabaab(q2997348aa27a422480aea29cbfd800b1babba var3) {
      this.bb = var3;
   }

   public String toString() {
      return this.bb.bba();
   }

   private static int a(int var0, int var1) {
      int var2 = b[var0 ^ 479769094] ^ var1 ^ var0;
      var2 += 44774;
      var2 += 49661;
      var2 -= 23007;
      var2 ^= 48740;
      var2 ^= 60867;
      var2 -= 46611;
      var2 -= 9451;
      var2 ^= 13909;
      var2 += 19637;
      return var2;
   }

   private static q2997348aa27a422480aea29cbfd800b1abbaabaab[] ab() {
      return new q2997348aa27a422480aea29cbfd800b1abbaabaab[]{a, ba, aa};
   }
}
