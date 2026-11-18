package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_2540;
import net.minecraft.class_8710;
import net.minecraft.class_9139;

@Environment(EnvType.CLIENT)
public record q2997348aa27a422480aea29cbfd800b1aaaabbbab(byte[] jW) implements class_8710 {
   public static final class_8710.class_9154 a;
   private static final int[] ab;
   public static final class_9139 b;
   private static final Object[] bb;
   private static final String[] ba;
   private final byte[] aa;

   private static void a(q2997348aa27a422480aea29cbfd800b1aaaabbbab var0, class_2540 var1) {
      var1.method_52983(var0.aa());
   }

   private static q2997348aa27a422480aea29cbfd800b1aaaabbbab b(class_2540 var0) {
      byte[] var1 = new byte[var0.readableBytes()];
      var0.method_52979(var1);
      return new q2997348aa27a422480aea29cbfd800b1aaaabbbab(var1);
   }

   public class_8710.class_9154 method_56479() {
      return a;
   }

   static {
      // $FF: Couldn't be decompiled
   }

   public q2997348aa27a422480aea29cbfd800b1aaaabbbab(byte[] var1) {
      this.aa = var1;
   }

   private static int ab(int var0, int var1) {
      int var2 = ab[var0 ^ 1575871087] ^ var1 ^ var0;
      var2 ^= 14661;
      var2 -= 38249;
      var2 -= 11576;
      var2 += 1725;
      var2 ^= 62135;
      var2 -= 39554;
      var2 -= 45510;
      var2 ^= 15499;
      var2 -= 63365;
      return var2;
   }

   private static String ba(int var0, char var1, char var2) {
      int var3 = var1 ^ '\ue645';
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
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 21820;
      int var9 = 0;

      do {
         int var10 = var4[var9] - 'ꭚ';
         var10 += 40200;
         var10 -= 53055;
         var10 -= 64012;
         var4[var9] = (char)(var10 ^ var8 ^ var2 ^ var0 >> 16);
         ++var9;
      } while(var9 < var4.length);

      return (new String(var4)).intern();
   }

   public byte[] aa() {
      return this.aa;
   }
}
