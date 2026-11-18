package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_2540;
import net.minecraft.class_8710;
import net.minecraft.class_9139;

@Environment(EnvType.CLIENT)
public record q2997348aa27a422480aea29cbfd800b1babaabb(byte[] jV) implements class_8710 {
   private static final Object[] bb;
   private static final int[] ab;
   private final byte[] a;
   public static final class_8710.class_9154 aa;
   private static final String[] ba;
   public static final class_9139 b;

   public byte[] a() {
      return this.a;
   }

   private static void b(q2997348aa27a422480aea29cbfd800b1babaabb var0, class_2540 var1) {
      var1.method_52983(var0.a());
   }

   public q2997348aa27a422480aea29cbfd800b1babaabb(byte[] var1) {
      this.a = var1;
   }

   private static int ab(int var0, int var1) {
      int var2 = ab[var0 ^ 485295032] ^ var1 ^ var0;
      var2 ^= 4251;
      var2 += 9797;
      var2 += 46555;
      var2 += 40887;
      var2 += 49153;
      var2 -= 65045;
      var2 += 43959;
      var2 ^= 19294;
      return var2;
   }

   private static String ba(char var0, int var1, int var2, byte var3, byte var4, byte var5, short var6) {
      int var11 = var2 ^ -566723922;
      char[] var10 = ba[var11].toCharArray();
      StackTraceElement[] var12 = (StackTraceElement[])bb[var11];
      StackTraceElement[] var13;
      if (var12 != null) {
         var13 = var12;
      } else {
         var13 = (new Throwable()).getStackTrace();
         bb[var11] = var13;
      }

      StackTraceElement var14 = var13[1];
      int var8 = (var14.getClassName().hashCode() ^ var14.getMethodName().hashCode()) >> 16 ^ 15606;

      for(int var9 = 0; var9 < var10.length; ++var9) {
         var10[var9] = (char)(var10[var9] ^ var9 ^ var8 ^ var3 ^ var2 ^ var4 ^ var1 ^ var5 ^ var6 ^ var0);
      }

      return (new String(var10)).intern();
   }

   private static q2997348aa27a422480aea29cbfd800b1babaabb aa(class_2540 var0) {
      byte[] var1 = new byte[var0.readableBytes()];
      var0.method_52979(var1);
      return new q2997348aa27a422480aea29cbfd800b1babaabb(var1);
   }

   static {
      // $FF: Couldn't be decompiled
   }

   public class_8710.class_9154 method_56479() {
      return aa;
   }
}
