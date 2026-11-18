package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_2540;
import net.minecraft.class_8710;
import net.minecraft.class_9139;

@Environment(EnvType.CLIENT)
public record q2997348aa27a422480aea29cbfd800b1abababaa(byte[] jU) implements class_8710 {
   public static final class_8710.class_9154 a;
   private static final int[] ab;
   public static final class_9139 b;
   private static final String[] ba;
   private static final Object[] bb;
   private final byte[] aa;

   public byte[] a() {
      return this.aa;
   }

   private static q2997348aa27a422480aea29cbfd800b1abababaa b(class_2540 var0) {
      byte[] var1 = new byte[var0.readableBytes()];
      var0.method_52979(var1);
      return new q2997348aa27a422480aea29cbfd800b1abababaa(var1);
   }

   private static String ba(int var0, int var1) {
      int var3 = var0 ^ -1910109823;
      char[] var4 = ba[var3].toCharArray();
      StackTraceElement[] var2 = (StackTraceElement[])bb[var3];
      StackTraceElement[] var5;
      if (var2 != null) {
         var5 = var2;
      } else {
         var5 = (new Throwable()).getStackTrace();
         bb[var3] = var5;
      }

      StackTraceElement var6 = var5[1];
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ 1990746933;
      int var8 = 0;

      do {
         short var9;
         switch (var8 & 31) {
            case 0:
            default:
               var9 = 26;
               break;
            case 1:
               var9 = 34;
               break;
            case 2:
               var9 = 245;
               break;
            case 3:
               var9 = 244;
               break;
            case 4:
               var9 = 46;
               break;
            case 5:
               var9 = 99;
               break;
            case 6:
               var9 = 24;
               break;
            case 7:
               var9 = 160;
               break;
            case 8:
               var9 = 15;
               break;
            case 9:
               var9 = 243;
               break;
            case 10:
               var9 = 9;
               break;
            case 11:
               var9 = 208;
               break;
            case 12:
               var9 = 120;
               break;
            case 13:
               var9 = 28;
               break;
            case 14:
               var9 = 8;
               break;
            case 15:
               var9 = 38;
               break;
            case 16:
               var9 = 175;
               break;
            case 17:
               var9 = 203;
               break;
            case 18:
               var9 = 111;
               break;
            case 19:
               var9 = 197;
               break;
            case 20:
               var9 = 49;
               break;
            case 21:
               var9 = 154;
               break;
            case 22:
               var9 = 220;
               break;
            case 23:
               var9 = 34;
               break;
            case 24:
               var9 = 247;
               break;
            case 25:
               var9 = 226;
               break;
            case 26:
               var9 = 49;
               break;
            case 27:
               var9 = 246;
               break;
            case 28:
               var9 = 45;
               break;
            case 29:
               var9 = 71;
               break;
            case 30:
               var9 = 129;
               break;
            case 31:
               var9 = 140;
         }

         var4[var8] = (char)(var4[var8] ^ var9 ^ var1 >> 16 ^ var7);
         ++var8;
      } while(var8 < var4.length);

      return (new String(var4)).intern();
   }

   private static int ab(int var0, int var1) {
      int var2 = ab[var0 ^ -1510651894] ^ var1 ^ var0;
      var2 ^= 41064;
      var2 += 48416;
      var2 -= 1151;
      var2 ^= 52605;
      var2 -= 7257;
      var2 += 52243;
      var2 -= 56931;
      var2 += 64847;
      return var2;
   }

   public class_8710.class_9154 method_56479() {
      return a;
   }

   static {
      // $FF: Couldn't be decompiled
   }

   public q2997348aa27a422480aea29cbfd800b1abababaa(byte[] var1) {
      this.aa = var1;
   }

   private static void aa(q2997348aa27a422480aea29cbfd800b1abababaa var0, class_2540 var1) {
      var1.method_52983(var0.a());
   }
}
