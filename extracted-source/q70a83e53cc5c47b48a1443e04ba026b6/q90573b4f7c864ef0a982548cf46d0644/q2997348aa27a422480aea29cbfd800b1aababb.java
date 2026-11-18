package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum q2997348aa27a422480aea29cbfd800b1aababb implements q2997348aa27a422480aea29cbfd800b1aabbbabab {
   public static final q2997348aa27a422480aea29cbfd800b1aababb a;
   private static final Object[] aab;
   private static final q2997348aa27a422480aea29cbfd800b1aababb[] aa;
   private final q2997348aa27a422480aea29cbfd800b1babba ab;
   private static final String[] aaa;
   private static final int[] bb;
   public static final q2997348aa27a422480aea29cbfd800b1aababb b;
   public static final q2997348aa27a422480aea29cbfd800b1aababb ba;

   public boolean bb() {
      boolean var10000;
      try {
         try {
            if (this != b) {
               var10000 = true;
               return var10000;
            }
         } catch (IllegalStateException var1) {
            throw var1;
         }
      } catch (MatchException var2) {
         throw var2;
      }

      var10000 = false;
      return var10000;
   }

   public String toString() {
      return this.ab.bba();
   }

   static {
      // $FF: Couldn't be decompiled
   }

   public static q2997348aa27a422480aea29cbfd800b1aababb aa(String var0) {
      return (q2997348aa27a422480aea29cbfd800b1aababb)Enum.valueOf(q2997348aa27a422480aea29cbfd800b1aababb.class, var0);
   }

   private static int a(int var0, int var1) {
      int var2 = bb[var0 ^ 1342907414] ^ var1 ^ var0;
      var2 -= 29682;
      var2 -= 63648;
      var2 += 45501;
      var2 -= 12942;
      var2 ^= 7243;
      var2 += 36440;
      var2 += 12607;
      var2 -= 10166;
      var2 += 37398;
      return var2;
   }

   private static String ab(short var0, int var1, char var2) {
      int var7 = var1 ^ -1135557184;
      char[] var6 = aaa[var7].toCharArray();
      StackTraceElement[] var8 = (StackTraceElement[])aab[var7];
      StackTraceElement[] var9;
      if (var8 != null) {
         var9 = var8;
      } else {
         var9 = (new Throwable()).getStackTrace();
         aab[var7] = var9;
      }

      StackTraceElement var10 = var9[1];
      int var4 = (var10.getClassName().hashCode() ^ var10.getMethodName().hashCode()) >> 16 ^ '뵋';
      int var5 = 0;

      do {
         var6[var5] = (char)(var6[var5] ^ var5 ^ '\ue328' ^ var4 ^ var0 ^ var1 ^ var2);
         ++var5;
      } while(var5 < var6.length);

      return (new String(var6)).intern();
   }

   private q2997348aa27a422480aea29cbfd800b1aababb(q2997348aa27a422480aea29cbfd800b1babba var3) {
      this.ab = var3;
   }

   private static q2997348aa27a422480aea29cbfd800b1aababb[] b() {
      return new q2997348aa27a422480aea29cbfd800b1aababb[]{b, ba, a};
   }

   public Enum ba() {
      // $FF: Couldn't be decompiled
   }
}
