package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import com.mojang.blaze3d.pipeline.RenderPipeline;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_11231;
import net.minecraft.class_11244;
import net.minecraft.class_4588;
import net.minecraft.class_8030;
import org.joml.Matrix3x2fc;
import org.jspecify.annotations.Nullable;

@Environment(EnvType.CLIENT)
record q2997348aa27a422480aea29cbfd800b1aabaaaa(Matrix3x2fc iM, float iN, float iO, float iP, float iQ, float iR, int iS, @Nullable class_8030 a, @Nullable class_8030 b) implements class_11244 {
   private final @Nullable class_8030 aa;
   private final float a;
   private final float ab;
   private final float ba;
   private final float bb;
   private final @Nullable class_8030 aaa;
   private final Matrix3x2fc b;
   private final int aab;
   private final float aba;

   private q2997348aa27a422480aea29cbfd800b1aabaaaa(Matrix3x2fc var1, float var2, float var3, float var4, float var5, float var6, int var7, @Nullable class_8030 var8, @Nullable class_8030 var9) {
      this.b = var1;
      this.ab = var2;
      this.ba = var3;
      this.bb = var4;
      this.aba = var5;
      this.a = var6;
      this.aab = var7;
      this.aa = var8;
      this.aaa = var9;
   }

   public float a() {
      return this.aba;
   }

   public RenderPipeline comp_4055() {
      return q2997348aa27a422480aea29cbfd800b1aabab.baba;
   }

   public float b() {
      return this.a;
   }

   public float aa() {
      return this.bb;
   }

   public @Nullable class_8030 comp_4274() {
      return this.aaa;
   }

   public Matrix3x2fc ab() {
      return this.b;
   }

   public float ba() {
      return this.ab;
   }

   public float bb() {
      return this.ba;
   }

   public class_11231 comp_4056() {
      return q2997348aa27a422480aea29cbfd800b1aabab.baab;
   }

   public int aaa() {
      return this.aab;
   }

   public void method_70917(class_4588 param1) {
      // $FF: Couldn't be decompiled
   }

   private q2997348aa27a422480aea29cbfd800b1aabaaaa(Matrix3x2fc var1, float var2, float var3, float var4, float var5, float var6, int var7, @Nullable class_8030 var8) {
      this(var1, var2, var3, var4, var5, var6, var7, var8, q2997348aa27a422480aea29cbfd800b1aabab.aaabb(var2, var3, var4, var5, var1, var8));
   }

   public @Nullable class_8030 comp_4069() {
      return this.aa;
   }
}
