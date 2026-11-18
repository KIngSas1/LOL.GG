package q70a83e53cc5c47b48a1443e04ba026b6.q3631a76f337940c1ab9012854eba33b0;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_1937;
import net.minecraft.class_243;
import net.minecraft.class_4184;
import net.minecraft.class_5134;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644.q2997348aa27a422480aea29cbfd800b1aaaaaabab;
import q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644.q2997348aa27a422480aea29cbfd800b1aabaabbaa;
import q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644.q2997348aa27a422480aea29cbfd800b1abaabbbb;
import q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644.q2997348aa27a422480aea29cbfd800b1abbbbbba;
import q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644.q2997348aa27a422480aea29cbfd800b1babbbbbb;

@Environment(EnvType.CLIENT)
@Mixin({class_4184.class})
public abstract class q832047b101f4476cb1e83cd851e08c28bbaaabb {
   @Shadow
   private boolean field_18719;

   @Shadow
   protected abstract float method_19318(float var1);

   @Shadow
   protected abstract void method_19322(class_243 var1);

   @Shadow
   protected abstract void method_19324(float var1, float var2, float var3);

   @Shadow
   protected abstract void method_19325(float var1, float var2);

   @Inject(
      method = {"method_19321"},
      at = {@At("TAIL")}
   )
   private void a(class_1937 var1, class_1297 var2, boolean var3, boolean var4, float var5, CallbackInfo var6) {
      q2997348aa27a422480aea29cbfd800b1babbbbbb var7 = q2997348aa27a422480aea29cbfd800b1babbbbbb.aaba();
      if (var7 != null) {
         q2997348aa27a422480aea29cbfd800b1abbbbbba var8 = var7.aab().ababbba();
         if (var8 != null && var8.abb(var2)) {
            this.field_18719 = false;
            this.method_19322(var8.ab(var5));
            this.method_19325(var8.bba(var5), var8.aa(var5));
         } else {
            float var9 = 0.0F;
            float var10 = 0.0F;
            boolean var11 = false;
            q2997348aa27a422480aea29cbfd800b1aaaaaabab var12 = var7.aab().baaaa();
            if (var12 != null && var12.abbbb(var2)) {
               var9 = var12.abb(var5);
               var10 = var12.babba(var5);
               var11 = true;
            } else {
               q2997348aa27a422480aea29cbfd800b1abaabbbb var13 = q2997348aa27a422480aea29cbfd800b1aabaabbaa.ab();
               if (q2997348aa27a422480aea29cbfd800b1aabaabbaa.ba(var13, var2)) {
                  var9 = q2997348aa27a422480aea29cbfd800b1aabaabbaa.bb(var13, var5);
                  var10 = q2997348aa27a422480aea29cbfd800b1aabaabbaa.b(var13, var5);
                  var11 = true;
               }
            }

            if (var11) {
               this.method_19322(var2.method_5836(var5));
               float var21 = var9;
               float var14 = var10;
               if (var4) {
                  var21 = var9 + 180.0F;
                  var14 = -var10;
               }

               this.method_19325(var21, var14);
               if (var3) {
                  float var15 = 1.0F;
                  float var16 = 4.0F;
                  if (var2 instanceof class_1309) {
                     class_1309 var17 = (class_1309)var2;
                     var15 = var17.method_55693();
                     var16 = (float)var17.method_45325(class_5134.field_59674);
                  }

                  float var22 = var15;
                  float var18 = var16;
                  if (var2.method_5765()) {
                     class_1297 var20 = var2.method_5854();
                     if (var20 instanceof class_1309) {
                        class_1309 var19 = (class_1309)var20;
                        var22 = var19.method_55693();
                        var18 = (float)var19.method_45325(class_5134.field_59674);
                     }
                  }

                  this.method_19324(-this.method_19318(Math.max(var15 * var16, var22 * var18)), 0.0F, 0.0F);
               }

            }
         }
      }
   }
}
