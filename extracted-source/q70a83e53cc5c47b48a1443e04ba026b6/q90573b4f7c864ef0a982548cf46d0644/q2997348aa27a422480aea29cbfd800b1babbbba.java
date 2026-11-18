package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.systems.CommandEncoder;
import com.mojang.blaze3d.systems.RenderPass;
import com.mojang.blaze3d.textures.GpuTextureView;
import java.nio.ByteBuffer;
import java.util.Objects;
import java.util.OptionalInt;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_12137;
import net.minecraft.class_310;
import net.minecraft.class_332;
import net.minecraft.class_6367;
import net.minecraft.class_8030;
import org.joml.Matrix3x2fc;
import org.jspecify.annotations.Nullable;

@Environment(EnvType.CLIENT)
public final class q2997348aa27a422480aea29cbfd800b1babbbba {
   private static final long[] aa;
   private static final long[] a;
   private static long ab;
   private static class_6367 ba;
   private static class_6367 bb;
   private static final q2997348aa27a422480aea29cbfd800b1babba aaa;
   private static final Long[] aab;
   private static int aba;
   private static final q2997348aa27a422480aea29cbfd800b1babba abb;
   private static final Integer[] baa;
   private static final q2997348aa27a422480aea29cbfd800b1babba bab;
   private static final q2997348aa27a422480aea29cbfd800b1babba b;
   private static boolean bba;
   private static GpuBuffer[] bbb;
   private static long aaaa;
   private static final long aaab;
   private static final double aaba = (double)6.0F;
   private static final q2997348aa27a422480aea29cbfd800b1babba aabb;
   private static long abaa;
   private static final int abab;
   private static final int abba;
   private static ByteBuffer abbb;
   private static final String[] ababa;
   private static final long[] baaa;
   private static final int baab;
   private static final q2997348aa27a422480aea29cbfd800b1babba baba;
   private static final long babb;
   private static final long[] bbaa;
   private static final Integer[] bbab;
   private static final Object[] ababb;
   private static final float bbba = 1.25F;
   private static final int bbbb;
   private static class_6367 aaaaa;
   private static final q2997348aa27a422480aea29cbfd800b1babba aaaab;
   private static double aaaba;
   private static final q2997348aa27a422480aea29cbfd800b1babba aaabb;
   private static final q2997348aa27a422480aea29cbfd800b1babba aabaa;
   private static final Long[] aabab;
   private static long aabba;
   private static final int[] abaab;
   private static final float aabbb = 8.0F;
   private static final q2997348aa27a422480aea29cbfd800b1babba abaaa;

   private static float aa(float var0) {
      return Math.max(0.0F, Math.min(1.0F, var0)) * 2.0F - 1.0F;
   }

   private static long ab(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ ba(b(-773773210, -1928969595 ^ 1911672585), 6417642319926488695L)) & ba(b(-773773209, -1928969595 ^ -424914545), 4222719373069035312L);

      try {
         if (aab[var3] == null) {
            aab[var3] = a[var3] ^ var1;
         }
      } catch (RuntimeException var4) {
         throw var4;
      }

      return aab[var3];
   }

   private static int ba(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ b(-773773212, -1127229773 ^ -1088512623);
      if (baa[var3] == null) {
         baa[var3] = (int)(aa[var3] ^ var1);
      }

      return baa[var3];
   }

   public static void bb() {
      // $FF: Couldn't be decompiled
   }

   private static long aaa(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ b(-773773211, 1272494850 ^ 275709998)) & b(-773773214, 1272494850 ^ 314881211);
      if (aabab[var3] == null) {
         aabab[var3] = bbaa[var3] ^ var1;
      }

      return aabab[var3];
   }

   private static boolean a() {
      // $FF: Couldn't be decompiled
   }

   static int aab(double param0) {
      // $FF: Couldn't be decompiled
   }

   static {
      // $FF: Couldn't be decompiled
   }

   private static int aba(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & aaa(b(-773773201, -1789474586 ^ -2064385121), 5792415358339239105L)) ^ ba(b(-773773204, -1789474586 ^ 635145813), 4416953772082174829L);

      try {
         if (bbab[var3] == null) {
            bbab[var3] = (int)(baaa[var3] ^ var1);
         }
      } catch (RuntimeException var4) {
         throw var4;
      }

      return bbab[var3];
   }

   public static boolean abb() {
      // $FF: Couldn't be decompiled
   }

   private static @Nullable class_8030 baa(float param0, float param1, float param2, float param3, Matrix3x2fc param4, @Nullable class_8030 param5) {
      // $FF: Couldn't be decompiled
   }

   public static boolean bab(class_332 param0, double param1, double param3, double param5, double param7, double param9, int param11, double param12) {
      // $FF: Couldn't be decompiled
   }

   private static String abaa(int var0, int var1) {
      int var3 = var0 ^ 1063790469;
      char[] var4 = ababa[var3].toCharArray();
      StackTraceElement[] var2 = (StackTraceElement[])ababb[var3];
      StackTraceElement[] var5;
      if (var2 != null) {
         var5 = var2;
      } else {
         var5 = (new Throwable()).getStackTrace();
         ababb[var3] = var5;
      }

      StackTraceElement var6 = var5[1];
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ 1445306749;
      int var8 = 0;

      do {
         short var9;
         switch (var8 & 31) {
            case 0:
            default:
               var9 = 183;
               break;
            case 1:
               var9 = 61;
               break;
            case 2:
               var9 = 224;
               break;
            case 3:
               var9 = 45;
               break;
            case 4:
               var9 = 122;
               break;
            case 5:
               var9 = 5;
               break;
            case 6:
               var9 = 249;
               break;
            case 7:
               var9 = 0;
               break;
            case 8:
               var9 = 55;
               break;
            case 9:
               var9 = 82;
               break;
            case 10:
               var9 = 131;
               break;
            case 11:
               var9 = 80;
               break;
            case 12:
               var9 = 201;
               break;
            case 13:
               var9 = 236;
               break;
            case 14:
               var9 = 9;
               break;
            case 15:
               var9 = 21;
               break;
            case 16:
               var9 = 109;
               break;
            case 17:
               var9 = 134;
               break;
            case 18:
               var9 = 169;
               break;
            case 19:
               var9 = 92;
               break;
            case 20:
               var9 = 95;
               break;
            case 21:
               var9 = 221;
               break;
            case 22:
               var9 = 176;
               break;
            case 23:
               var9 = 149;
               break;
            case 24:
               var9 = 193;
               break;
            case 25:
               var9 = 119;
               break;
            case 26:
               var9 = 11;
               break;
            case 27:
               var9 = 92;
               break;
            case 28:
               var9 = 86;
               break;
            case 29:
               var9 = 152;
               break;
            case 30:
               var9 = 12;
               break;
            case 31:
               var9 = 94;
         }

         var4[var8] = (char)(var4[var8] ^ var9 ^ var1 >> 16 ^ var7);
         ++var8;
      } while(var8 < var4.length);

      return (new String(var4)).intern();
   }

   private static int b(int var0, int var1) {
      int var2 = abaab[var0 ^ -773773210] ^ var1 ^ var0;
      var2 -= 47878;
      var2 -= 18816;
      var2 -= 48135;
      var2 ^= 45180;
      var2 -= 31480;
      var2 -= 6593;
      var2 -= 26375;
      var2 ^= 7289;
      var2 ^= 63989;
      var2 ^= 49610;
      return var2;
   }

   public static void bba() {
      // $FF: Couldn't be decompiled
   }

   private static void bbb(CommandEncoder var0, int var1, GpuTextureView var2, class_6367 var3, class_12137 var4, float var5, float var6, float var7, float var8, int var9, int var10) {
      ByteBuffer var13 = abbb;
      int var10000 = q2997348aa27a422480aea29cbfd800b1aabaabaaa.bba;
      int var10001 = q2997348aa27a422480aea29cbfd800b1aabaabaaa.bb;
      var13.clear();
      var13.putFloat(var5).putFloat(var6).putFloat(var7).putFloat(0.0F);
      var13.putFloat(var8).putFloat((float)var9).putFloat((float)var10).putFloat(0.0F);
      var13.flip();
      var0.writeToBuffer(bbb[var1].slice(), var13);
      int var12 = var10001;
      int var11 = var10000;
      q2997348aa27a422480aea29cbfd800b1babba var23 = aabaa;
      Objects.requireNonNull(var23);
      RenderPass var14 = var0.createRenderPass(var23::bba, var3.method_71639(), OptionalInt.empty());

      label56: {
         label55: {
            try {
               if (var11 != 0) {
                  break label55;
               }

               if (var12 != 0) {
                  return;
               }
            } catch (Throwable var21) {
               throw var21;
            }

            try {
               var14.setPipeline(q2997348aa27a422480aea29cbfd800b1baa.b);
               var14.setUniform(b.bba(), bbb[var1]);
               var22 = var14;
               if (var11 != 0) {
                  break label56;
               }

               var14.bindTexture(aaaab.bba(), var2, var4);
               var14.draw(0, 3);
            } catch (Throwable var20) {
               try {
                  if (var12 != 0 || var14 == null) {
                     throw var20;
                  }
               } catch (Throwable var18) {
                  throw var18;
               }

               try {
                  var14.close();
               } catch (Throwable var17) {
                  var20.addSuppressed(var17);
               }

               throw var20;
            }
         }

         try {
            if (var14 == null) {
               return;
            }

            var22 = var14;
         } catch (Throwable var19) {
            throw var19;
         }
      }

      var22.close();
   }

   private q2997348aa27a422480aea29cbfd800b1babbbba() {
   }

   private static int aaaa(float var0) {
      return Math.max(1, Math.min(aba(ba(b(-773773107, 793320594 ^ 1808778670), 3574579277503776831L), aaa(b(-773773110, 793320594 ^ -1968880751), 3768296900574055331L)), Math.round(var0 * 8.0F)));
   }

   private static class_6367 aaab(class_6367 param0, int param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   private static boolean aaba(class_310 param0, double param1, boolean param3) {
      // $FF: Couldn't be decompiled
   }

   public static boolean aabb(double param0) {
      // $FF: Couldn't be decompiled
   }
}
