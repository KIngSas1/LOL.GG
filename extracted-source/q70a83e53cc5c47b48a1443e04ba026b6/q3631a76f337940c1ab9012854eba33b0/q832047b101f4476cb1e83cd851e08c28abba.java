package q70a83e53cc5c47b48a1443e04ba026b6.q3631a76f337940c1ab9012854eba33b0;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1297;
import net.minecraft.class_4604;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644.q2997348aa27a422480aea29cbfd800b1abababaaa;

@Environment(EnvType.CLIENT)
@Mixin(
   targets = {"net/minecraft/class_898"}
)
public abstract class q832047b101f4476cb1e83cd851e08c28abba {
   @Inject(
      method = {"method_3950"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void a(class_1297 var1, class_4604 var2, double var3, double var5, double var7, CallbackInfoReturnable var9) {
      if (q2997348aa27a422480aea29cbfd800b1abababaaa.aa(var1)) {
         var9.setReturnValue(false);
      }

   }
}
