package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import com.mojang.blaze3d.pipeline.BlendFunction;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.platform.DepthTestFunction;
import com.mojang.blaze3d.vertex.VertexFormat.class_5596;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_10799;
import net.minecraft.class_11231;
import net.minecraft.class_290;
import net.minecraft.class_2960;
import net.minecraft.class_332;
import net.minecraft.class_4588;
import net.minecraft.class_8030;
import org.joml.Matrix3x2f;
import org.joml.Matrix3x2fc;
import org.jspecify.annotations.Nullable;

@Environment(EnvType.CLIENT)
final class q2997348aa27a422480aea29cbfd800b1aabab {
   private static final q2997348aa27a422480aea29cbfd800b1babba aa;
   private static final int ab;
   private static final float ba = 8.0F;
   private static final int bb;
   private static final float aaa = 12.0F;
   private static final int aab;
   private static final int aba;
   private static final String[] abbaa;
   private static final RenderPipeline abb;
   private static final q2997348aa27a422480aea29cbfd800b1babba baa;
   private static final Integer[] bab;
   private static final float bba = 8.0F;
   private static final int[] ababb;
   private static final q2997348aa27a422480aea29cbfd800b1babba bbb;
   private static final q2997348aa27a422480aea29cbfd800b1babba aaaa;
   private static final long[] b;
   private static final RenderPipeline a;
   private static final int aaab = 0;
   private static final RenderPipeline aaba;
   private static final Integer[] aabb;
   private static final int abaa;
   private static final q2997348aa27a422480aea29cbfd800b1babba abab;
   private static final int abba = 1;
   private static final Object[] abbab;
   private static final float abbb = 2.0F;
   private static final q2997348aa27a422480aea29cbfd800b1babba baaa;
   private static final class_11231 baab;
   private static final RenderPipeline baba;
   private static final float babb = 1.25F;
   private static final RenderPipeline bbaa;
   private static final int bbab;
   private static final long[] bbba;
   private static final q2997348aa27a422480aea29cbfd800b1babba bbbb;
   private static final q2997348aa27a422480aea29cbfd800b1babba aaaaa;
   private static final q2997348aa27a422480aea29cbfd800b1babba aaaab;
   private static final RenderPipeline aaaba;
   private static final Long[] aaabb;
   private static final q2997348aa27a422480aea29cbfd800b1babba aabaa;
   private static final int aabab;
   private static final int aabba;
   private static final long[] aabbb;
   private static final q2997348aa27a422480aea29cbfd800b1babba abaaa;
   private static final q2997348aa27a422480aea29cbfd800b1babba abaab;
   private static final int ababa;

   static boolean aa(class_332 var0, class_2960 var1, double var2, double var4, double var6, double var8, int var10) {
      return aabaa(var0, var1, var2, var4, var6, var8, 0.0F, 0.0F, 1.0F, 1.0F, var10);
   }

   static boolean ab(class_332 param0, double param1, double param3, double param5, double param7, double param9, double param11, int param13) {
      // $FF: Couldn't be decompiled
   }

   static void ba(class_332 param0, class_2960 param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
      // $FF: Couldn't be decompiled
   }

   private static long bb(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ aaaabb(542778030, -137917426 ^ 346152543)) & aaaabb(542778031, -137917426 ^ 272497189);
      if (aaabb[var3] == null) {
         aaabb[var3] = aabbb[var3] ^ var1;
      }

      return aaabb[var3];
   }

   private static void a(class_4588 var0, Matrix3x2fc var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, int var10, float var11) {
      bbbaa(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, 0.0F);
   }

   static boolean aaa(class_332 param0, double param1, double param3, double param5, double param7, double param9, int param11) {
      // $FF: Couldn't be decompiled
   }

   static boolean aab(class_332 param0, double param1, double param3, double param5, double param7, double param9, double param11, int param13) {
      // $FF: Couldn't be decompiled
   }

   static void aba(class_332 var0, double var1, double var3) {
      var0.method_51448().mul(new Matrix3x2f(1.0F, (float)var3, (float)var1, 1.0F, 0.0F, 0.0F));
   }

   private static class_2960 abb(q2997348aa27a422480aea29cbfd800b1babba var0) {
      return class_2960.method_60655(aaaa.bba(), var0.bba());
   }

   private static int baa(float[] var0, float[] var1, int var2, float var3, float var4, float var5, float var6, float var7, int var8) {
      int var10 = 0;
      int var9 = q2997348aa27a422480aea29cbfd800b1bbabab.aaab;

      int var10000;
      while(true) {
         if (var10 <= var8) {
            var10000 = var10;
            if (var9 != 0) {
               break;
            }

            float var11 = (float)var10 / (float)var8;
            double var12 = Math.toRadians((double)(var6 + (var7 - var6) * var11));
            var0[var2] = var3 + (float)Math.cos(var12) * var5;
            var1[var2] = var4 + (float)Math.sin(var12) * var5;
            ++var2;
            ++var10;
            if (var9 == 0) {
               continue;
            }
         }

         var10000 = var2;
         break;
      }

      return var10000;
   }

   private static float bab(float param0, float param1, float param2, float param3, float param4) {
      // $FF: Couldn't be decompiled
   }

   private static RenderPipeline bba() {
      return class_10799.method_67887(RenderPipeline.builder(new RenderPipeline.Snippet[]{class_10799.field_56863}).withLocation(abb(abaaa)).withCull(false).withVertexFormat(class_290.field_1576, class_5596.field_27379).build());
   }

   private static float bbb(float var0) {
      return aabb(var0) * 2.0F - 1.0F;
   }

   static boolean aaaa(class_332 param0, double param1, double param3, double param5, double param7, double param9, double param11, int param13) {
      // $FF: Couldn't be decompiled
   }

   private static String aaabaa(int var0, int var1, char var2) {
      int var3 = var1 ^ '\ueeae';
      char[] var4 = abbaa[var3].toCharArray();
      StackTraceElement[] var5 = (StackTraceElement[])abbab[var3];
      StackTraceElement[] var6;
      if (var5 != null) {
         var6 = var5;
      } else {
         var6 = (new Throwable()).getStackTrace();
         abbab[var3] = var6;
      }

      StackTraceElement var7 = var6[1];
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 12185;
      int var9 = 0;

      do {
         int var10 = var4[var9] + 4625;
         var10 ^= 26222;
         var10 ^= 40889;
         var10 += 7755;
         var10 ^= 6279;
         var10 ^= 63463;
         var4[var9] = (char)(var10 ^ var8 ^ var2 ^ var0 >> 16);
         ++var9;
      } while(var9 < var4.length);

      return (new String(var4)).intern();
   }

   private static int aaab(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ aaaabb(542778046, 1282400305 ^ 1444716030);
      if (bab[var3] == null) {
         bab[var3] = (int)(b[var3] ^ var1);
      }

      return bab[var3];
   }

   private static RenderPipeline aaba() {
      return class_10799.method_67887(RenderPipeline.builder(new RenderPipeline.Snippet[]{class_10799.field_56864}).withLocation(abb(aabaa)).withSampler(abaab.bba()).withBlend(BlendFunction.TRANSLUCENT).withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST).withDepthWrite(false).withCull(false).withVertexFormat(class_290.field_1575, class_5596.field_27379).build());
   }

   private static float aabb(float var0) {
      return Math.max(0.0F, Math.min(1.0F, var0));
   }

   static void abaa(class_332 param0, class_2960 param1, int param2, int param3, int param4, int param5, int param6) {
      // $FF: Couldn't be decompiled
   }

   private static int abab(float var0) {
      return Math.max(1, Math.min(aabab(aaab(aaaabb(542778043, -724053108 ^ 1062399161), 8599619607561127057L), bb(aaaabb(542778040, -724053108 ^ 2083436806), 5771200272178815231L)), Math.round(var0 * 8.0F)));
   }

   private static void abba(class_4588 var0, Matrix3x2fc var1, float var2, float var3, float var4, float var5, float var6, int var7) {
      int var10000 = aaab(aaaabb(542778041, -245374535 ^ 1380658107), 600698869792354244L);
      int var9 = babaa(var6);
      float[] var10 = new float[aabab(var10000, bb(aaaabb(542777990, -245374535 ^ -1074060300), 6080931318046655053L))];
      float[] var11 = new float[aabab(aaab(aaaabb(542777991, -245374535 ^ -583160218), 600698869792354244L), bb(aaaabb(542777988, -245374535 ^ 775220437), 6080931318046655053L))];
      var10000 = q2997348aa27a422480aea29cbfd800b1bbabab.aaab;
      int var12 = bbaba(var10, var11, var2, var3, var4, var5, var6, var9);
      int var8 = var10000;
      float var13 = var2 + var4 * 0.5F;
      float var14 = var3 + var5 * 0.5F;
      int var15 = 0;

      while(var15 < var12) {
         int var16 = (var15 + 1) % var12;
         babbb(var0, var1, var13, var14, var7);
         babbb(var0, var1, var10[var15], var11[var15], var7);
         babbb(var0, var1, var10[var16], var11[var16], var7);
         ++var15;
         if (var8 != 0) {
            break;
         }
      }

   }

   private static void abbb(class_4588 var0, Matrix3x2fc var1, float var2, float var3, float var4, float var5, int var6, int var7, float var8, float var9, float var10, int var11) {
      var0.method_70815(var1, var2, var3).method_39415(var11).method_22913(var4, var5).method_22921(var6, var7).method_22914(var8, var9, var10);
   }

   static boolean baaa(class_332 param0, double param1, double param3, double param5, double param7, double param9, int param11) {
      // $FF: Couldn't be decompiled
   }

   static void baab(class_332 var0) {
      var0.method_51448().pushMatrix();
   }

   static boolean baba(class_332 param0, double param1, double param3, double param5, double param7, double param9, int param11, int param12) {
      // $FF: Couldn't be decompiled
   }

   private static double babb(double var0, double var2, double var4) {
      return Math.min(Math.min(var0, var2) * (double)0.5F, Math.max((double)0.0F, var4));
   }

   static boolean bbaa(class_332 param0, double param1, double param3, double param5, double param7, double param9, int param11) {
      // $FF: Couldn't be decompiled
   }

   private static void bbab(class_4588 param0, Matrix3x2fc param1, float param2, float param3, float param4, float param5, float param6, float param7, int param8, int param9, int param10, int param11, int param12) {
      // $FF: Couldn't be decompiled
   }

   private q2997348aa27a422480aea29cbfd800b1aabab() {
   }

   private static RenderPipeline bbba() {
      return class_10799.method_67887(RenderPipeline.builder(new RenderPipeline.Snippet[]{class_10799.field_60125}).withLocation(abb(abab)).withVertexShader(abb(baa)).withFragmentShader(abb(aaaaa)).withSampler(abaab.bba()).withBlend(BlendFunction.TRANSLUCENT).withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST).withDepthWrite(false).withCull(false).withVertexFormat(class_290.field_1590, class_5596.field_27382).build());
   }

   static void bbbb(class_332 var0) {
      var0.method_51448().popMatrix();
   }

   private static RenderPipeline aaaaa() {
      return class_10799.method_67887(RenderPipeline.builder(new RenderPipeline.Snippet[]{class_10799.field_60125}).withLocation(abb(bbb)).withVertexShader(abb(baa)).withFragmentShader(abb(bbbb)).withBlend(BlendFunction.TRANSLUCENT).withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST).withDepthWrite(false).withCull(false).withVertexFormat(class_290.field_1590, class_5596.field_27382).build());
   }

   static void aaaab(class_332 var0, double var1) {
      var0.method_51448().rotate((float)Math.toRadians(var1));
   }

   private static RenderPipeline aaaba() {
      return class_10799.method_67887(RenderPipeline.builder(new RenderPipeline.Snippet[]{class_10799.field_60125}).withLocation(abb(baaa)).withVertexShader(abb(baa)).withFragmentShader(abb(baa)).withBlend(BlendFunction.TRANSLUCENT).withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST).withDepthWrite(false).withCull(false).withVertexFormat(class_290.field_1590, class_5596.field_27382).build());
   }

   private static @Nullable class_8030 aaabb(float param0, float param1, float param2, float param3, Matrix3x2fc param4, @Nullable class_8030 param5) {
      // $FF: Couldn't be decompiled
   }

   static boolean aabaa(class_332 var0, class_2960 var1, double var2, double var4, double var6, double var8, float var10, float var11, float var12, float var13, int var14) {
      return baaaa(var0, var1, var2, var4, var6, var8, var10, var11, var12, var13, var14, 12.0F);
   }

   static {
      // $FF: Couldn't be decompiled
   }

   private static int aabab(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & bb(aaaabb(542778005, -1354050952 ^ 900913020), 3384479686433978338L)) ^ aaab(aaaabb(542778002, -1354050952 ^ 534644544), 1963343476469730876L);

      try {
         if (aabb[var3] == null) {
            aabb[var3] = (int)(bbba[var3] ^ var1);
         }
      } catch (MatchException var4) {
         throw var4;
      }

      return aabb[var3];
   }

   private static void aabba(class_4588 var0, Matrix3x2fc var1, float var2, float var3, float var4, int var5) {
      int var10000 = q2997348aa27a422480aea29cbfd800b1bbabab.aaab;
      int var7 = baaba(var4);
      int var6 = var10000;
      int var8 = 0;

      while(var8 < var7) {
         double var9 = (Math.PI * 2D) * (double)var8 / (double)var7;
         double var11 = (Math.PI * 2D) * (double)(var8 + 1) / (double)var7;
         babbb(var0, var1, var2, var3, var5);
         babbb(var0, var1, var2 + (float)Math.cos(var9) * var4, var3 + (float)Math.sin(var9) * var4, var5);
         babbb(var0, var1, var2 + (float)Math.cos(var11) * var4, var3 + (float)Math.sin(var11) * var4, var5);
         ++var8;
         if (var6 != 0) {
            break;
         }
      }

   }

   static boolean aabbb(class_332 param0, double param1, double param3, double param5, double param7, double param9, double param11, int param13) {
      // $FF: Couldn't be decompiled
   }

   private static void abaaa(class_4588 var0, Matrix3x2fc var1, float var2, float var3, float var4, float var5, int var6) {
      var0.method_70815(var1, var2, var3).method_22913(var4, var5).method_39415(var6);
   }

   public static void abaab(class_332 param0, float[] param1, int[] param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   private static void ababa(class_4588 param0, Matrix3x2fc param1, float param2, float param3, float param4, float param5, float param6, int param7) {
      // $FF: Couldn't be decompiled
   }

   static void ababb(class_332 param0, class_2960 param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12) {
      // $FF: Couldn't be decompiled
   }

   static boolean abbaa(class_332 param0, double param1, double param3, double param5, int param7) {
      // $FF: Couldn't be decompiled
   }

   static void abbab(class_332 param0, q2997348aa27a422480aea29cbfd800b1aaaaaba param1, double param2, double param4, double param6, double param8, float param10, float param11, float param12, float param13, int param14, float param15, float param16) {
      // $FF: Couldn't be decompiled
   }

   static void abbba(class_332 var0, double var1, double var3) {
      var0.method_51448().scale((float)var1, (float)var3);
   }

   static boolean abbbb(class_332 param0, double param1, double param3, double param5, double param7, double param9, int param11, int param12, boolean param13, boolean param14) {
      // $FF: Couldn't be decompiled
   }

   private static int aaaabb(int var0, int var1) {
      int var2 = ababb[var0 ^ 542778022] ^ var1 ^ var0;
      var2 -= 1475;
      var2 ^= 60185;
      var2 += 19196;
      var2 += 51478;
      var2 ^= 53041;
      var2 ^= 58951;
      var2 ^= 22916;
      var2 ^= 35663;
      var2 += 38512;
      var2 ^= 47570;
      return var2;
   }

   static boolean baaaa(class_332 var0, class_2960 var1, double var2, double var4, double var6, double var8, float var10, float var11, float var12, float var13, int var14, float var15) {
      return baaab(var0, var1, var2, var4, var6, var8, var10, var11, var12, var13, var14, var15, 0.0F);
   }

   static boolean baaab(class_332 param0, class_2960 param1, double param2, double param4, double param6, double param8, float param10, float param11, float param12, float param13, int param14, float param15, float param16) {
      // $FF: Couldn't be decompiled
   }

   private static int baaba(float var0) {
      return Math.max(aabab(aaab(aaaabb(542777974, -528391881 ^ 1303485521), 2083378515621424243L), bb(aaaabb(542777975, -528391881 ^ -194860719), 7459458456419971635L)), Math.min(aabab(aaab(aaaabb(542777972, -528391881 ^ 1557096069), 8603677128577522424L), bb(aaaabb(542777973, -528391881 ^ 1733518287), 7082616843088308429L)), (int)Math.ceil((double)(var0 * 0.75F))));
   }

   private static void baabb(class_4588 param0, Matrix3x2fc param1, float param2, float param3, float param4, float param5, float param6, float param7, float param8, int param9) {
      // $FF: Couldn't be decompiled
   }

   private static int babaa(float var0) {
      return Math.max(aabab(aaab(aaaabb(542777970, -587078133 ^ -897208993), 9191569639635673410L), bb(aaaabb(542777971, -587078133 ^ -1876384001), 3329147928014218676L)), Math.min(aabab(aaab(aaaabb(542777968, -587078133 ^ 975604031), 6399953622113573409L), bb(aaaabb(542777969, -587078133 ^ 1750831151), 4150685339433899381L)), (int)Math.ceil((double)var0)));
   }

   static boolean babab(class_332 param0, double param1, double param3, double param5, double param7, double param9, int param11, int param12, int param13, int param14) {
      // $FF: Couldn't be decompiled
   }

   private static void babba(class_4588 param0, Matrix3x2fc param1, float param2, float param3, float param4, float param5, int param6) {
      // $FF: Couldn't be decompiled
   }

   private static void babbb(class_4588 var0, Matrix3x2fc var1, float var2, float var3, int var4) {
      var0.method_70815(var1, var2, var3).method_39415(var4);
   }

   private static RenderPipeline bbaaa() {
      return class_10799.method_67887(RenderPipeline.builder(new RenderPipeline.Snippet[]{class_10799.field_60125}).withLocation(abb(aaaab)).withVertexShader(abb(aa)).withFragmentShader(abb(aa)).withBlend(BlendFunction.TRANSLUCENT).withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST).withDepthWrite(false).withCull(false).withVertexFormat(class_290.field_1575, class_5596.field_27379).build());
   }

   static void bbaab(class_332 var0, double var1, double var3) {
      var0.method_51448().translate((float)var1, (float)var3);
   }

   private static int bbaba(float[] var0, float[] var1, float var2, float var3, float var4, float var5, float var6, int var7) {
      float var8 = Math.min(Math.min(var4, var5) * 0.5F, Math.max(0.0F, var6));
      int var9 = 0;
      var9 = baa(var0, var1, var9, var2 + var4 - var8, var3 + var8, var8, -90.0F, 0.0F, var7);
      var9 = baa(var0, var1, var9, var2 + var4 - var8, var3 + var5 - var8, var8, 0.0F, 90.0F, var7);
      var9 = baa(var0, var1, var9, var2 + var8, var3 + var5 - var8, var8, 90.0F, 180.0F, var7);
      return baa(var0, var1, var9, var2 + var8, var3 + var8, var8, 180.0F, 270.0F, var7);
   }

   private static float bbabb(int var0) {
      return Math.max(-1.0F, Math.min(1.0F, -1.0F + (float)var0 * 0.25F));
   }

   private static void bbbaa(class_4588 param0, Matrix3x2fc param1, float param2, float param3, float param4, float param5, float param6, float param7, float param8, float param9, int param10, float param11, float param12) {
      // $FF: Couldn't be decompiled
   }

   static boolean bbbab(class_332 param0, double param1, double param3, double param5, double param7, int param9) {
      // $FF: Couldn't be decompiled
   }

   static void bbbba(class_332 var0, double var1, double var3, double var5) {
      var0.method_51448().translate((float)var1, (float)var3);
   }

   static boolean bbbbb(class_332 var0, double var1, double var3, double var5, double var7, double var9, int var11) {
      return aab(var0, var1, var3, var5, var7, var9, (double)1.0F, var11);
   }

   private static void aaaaaa(class_4588 param0, Matrix3x2fc param1, float param2, float param3, float param4, float param5, float param6, float param7, int param8) {
      // $FF: Couldn't be decompiled
   }

   static void aaaaab(class_332 param0, class_2960 param1, double param2, double param4, double param6, double param8, double param10, int param12) {
      // $FF: Couldn't be decompiled
   }

   static q2997348aa27a422480aea29cbfd800b1aaaaaba aaaaba(class_332 param0, class_2960 param1) {
      // $FF: Couldn't be decompiled
   }

   static boolean b(class_332 param0, double param1, double param3, double param5, double param7, double param9, int param11) {
      // $FF: Couldn't be decompiled
   }
}
