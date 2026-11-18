package q70a83e53cc5c47b48a1443e04ba026b6.q3631a76f337940c1ab9012854eba33b0;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_4184;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644.q2997348aa27a422480aea29cbfd800b1baaaaba;

@Environment(EnvType.CLIENT)
@Mixin({class_4184.class})
public abstract class q832047b101f4476cb1e83cd851e08c28aaaaaaaa {
   @Inject(
      method = {"method_19318(F)F"},
      at = {@At("HEAD")},
      cancellable = true,
      require = 0
   )
   private void a(float var1, CallbackInfoReturnable var2) {
      if (q2997348aa27a422480aea29cbfd800b1baaaaba.ba()) {
         var2.setReturnValue(var1);
      }

   }
}
