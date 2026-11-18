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
record q2997348aa27a422480aea29cbfd800b1bbaaabbb(Matrix3x2fc d0, float d1, float d2, float d3, float d4, float d5, float d6, int d7, boolean d8, @Nullable class_8030 a, @Nullable class_8030 b) implements class_11244 {
   private final int aa;
   private final @Nullable class_8030 ab;
   private final float b;
   private final boolean ba;
   private final float bb;
   private final float aaa;
   private final float aab;
   private final @Nullable class_8030 aba;
   private final float a;
   private final float abb;
   private final Matrix3x2fc baa;

   public float a() {
      return this.bb;
   }

   public @Nullable class_8030 comp_4069() {
      return this.aba;
   }

   public Matrix3x2fc b() {
      return this.baa;
   }

   public boolean aa() {
      return this.ba;
   }

   public @Nullable class_8030 comp_4274() {
      return this.ab;
   }

   public float ab() {
      return this.b;
   }

   public float ba() {
      return this.aab;
   }

   public void method_70917(class_4588 var1) {
      try {
         try {
            if (this.ba) {
               q2997348aa27a422480aea29cbfd800b1aabab.aaaaaa(var1, this.baa, this.aab, this.abb, this.bb, this.aaa, this.a, this.b, this.aa);
               return;
            }
         } catch (IllegalStateException var2) {
            throw var2;
         }
      } catch (MatchException var3) {
         throw var3;
      }

      q2997348aa27a422480aea29cbfd800b1aabab.abba(var1, this.baa, this.aab, this.abb, this.bb, this.aaa, this.a, this.aa);
   }

   public class_11231 comp_4056() {
      return q2997348aa27a422480aea29cbfd800b1aabab.baab;
   }

   public int bb() {
      return this.aa;
   }

   public float aaa() {
      return this.a;
   }

   private q2997348aa27a422480aea29cbfd800b1bbaaabbb(Matrix3x2fc var1, float var2, float var3, float var4, float var5, float var6, float var7, int var8, boolean var9, @Nullable class_8030 var10, @Nullable class_8030 var11) {
      this.baa = var1;
      this.aab = var2;
      this.abb = var3;
      this.bb = var4;
      this.aaa = var5;
      this.a = var6;
      this.b = var7;
      this.aa = var8;
      this.ba = var9;
      this.aba = var10;
      this.ab = var11;
   }

   public float aab() {
      return this.abb;
   }

   public RenderPipeline comp_4055() {
      return q2997348aa27a422480aea29cbfd800b1aabab.aaba;
   }

   private q2997348aa27a422480aea29cbfd800b1bbaaabbb(Matrix3x2fc var1, float var2, float var3, float var4, float var5, float var6, float var7, int var8, boolean var9, @Nullable class_8030 var10) {
      this(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, q2997348aa27a422480aea29cbfd800b1aabab.aaabb(var2, var3, var4, var5, var1, var10));
   }

   public float aba() {
      return this.aaa;
   }
}
