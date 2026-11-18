package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import java.util.List;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1309;
import net.minecraft.class_238;
import net.minecraft.class_243;

@Environment(EnvType.CLIENT)
public interface q2997348aa27a422480aea29cbfd800b1abbbbbb {
   int[] b;
   q2997348aa27a422480aea29cbfd800b1babba baaabab;
   Object[] baaabbb;
   String[] baaabba;

   static int abbab(int var0, int var1) {
      int var2 = b[var0 ^ -721618840] ^ var1 ^ var0;
      var2 += 57003;
      var2 ^= 32994;
      var2 ^= 7169;
      var2 -= 17361;
      var2 += 57771;
      var2 -= 19316;
      return var2;
   }

   boolean aaab(q2997348aa27a422480aea29cbfd800b1aababbabb var1);

   q2997348aa27a422480aea29cbfd800b1aababbabb bababb();

   private static String aaaaba(char var0, char var1, int var2) {
      int var3 = var1 ^ '듗';
      char[] var4 = baaabba[var3].toCharArray();
      StackTraceElement[] var5 = (StackTraceElement[])baaabbb[var3];
      StackTraceElement[] var6;
      if (var5 != null) {
         var6 = var5;
      } else {
         var6 = (new Throwable()).getStackTrace();
         baaabbb[var3] = var6;
      }

      StackTraceElement var7 = var6[1];
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 8682;
      int var9 = 0;

      do {
         int var10 = var4[var9] ^ 24916;
         var10 -= 53754;
         var10 += 39056;
         var10 -= 41257;
         var10 -= 17468;
         var10 -= 12223;
         var10 -= 63215;
         var10 -= 10800;
         var4[var9] = (char)(var10 ^ var8 ^ var0 ^ var2 >> 16);
         ++var9;
      } while(var9 < var4.length);

      return (new String(var4)).intern();
   }

   static List a(boolean param0, boolean param1, boolean param2) {
      // $FF: Couldn't be decompiled
   }

   static class_243 abab(class_1309 param0, q2997348aa27a422480aea29cbfd800b1aababbabb param1) {
      // $FF: Couldn't be decompiled
   }

   static {
      // $FF: Couldn't be decompiled
   }

   private static void abbaa(List param0, q2997348aa27a422480aea29cbfd800b1aababbabb param1, boolean param2) {
      // $FF: Couldn't be decompiled
   }

   static class_238 b(class_1309 param0, q2997348aa27a422480aea29cbfd800b1aababbabb param1) {
      // $FF: Couldn't be decompiled
   }
}
