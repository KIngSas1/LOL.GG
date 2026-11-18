package q70a83e53cc5c47b48a1443e04ba026b6.q3631a76f337940c1ab9012854eba33b0;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_310;
import net.minecraft.class_757;
import org.joml.Matrix4f;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644.q2997348aa27a422480aea29cbfd800b1aabbaaa;
import q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644.q2997348aa27a422480aea29cbfd800b1babbbbbb;

@Environment(EnvType.CLIENT)
@Mixin({class_757.class})
public abstract class q832047b101f4476cb1e83cd851e08c28abbaaaab {
   @Shadow
   public abstract float method_32796();

   @Inject(
      method = {"method_22973"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void a(float var1, CallbackInfoReturnable var2) {
      class_310 var3 = class_310.method_1551();
      q2997348aa27a422480aea29cbfd800b1babbbbbb var4 = q2997348aa27a422480aea29cbfd800b1babbbbbb.aaba();
      q2997348aa27a422480aea29cbfd800b1aabbaaa var5 = var4 != null && var4.aab() != null ? var4.aab().aaaabba() : null;
      if (var3 != null && var3.method_22683() != null && var5 != null && var5.bbaabbb()) {
         int var6 = var3.method_22683().method_4489();
         int var7 = var3.method_22683().method_4506();
         if (var6 > 0 && var7 > 0) {
            double var8 = (double)var6 / (double)var7;
            double var10 = var5.aa(var8);
            if (Double.isFinite(var10) && !(var10 <= (double)0.0F) && !(Math.abs(var10 - var8) < 1.0E-6)) {
               var2.setReturnValue((new Matrix4f()).perspective(var1 * ((float)Math.PI / 180F), (float)var10, 0.05F, this.method_32796()));
            }
         }
      }
   }
}
