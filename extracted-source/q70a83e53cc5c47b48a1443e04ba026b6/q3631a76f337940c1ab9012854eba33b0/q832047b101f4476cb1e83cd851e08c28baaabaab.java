package q70a83e53cc5c47b48a1443e04ba026b6.q3631a76f337940c1ab9012854eba33b0;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1297;
import net.minecraft.class_897;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644.q2997348aa27a422480aea29cbfd800b1aabaaba;
import q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644.q2997348aa27a422480aea29cbfd800b1abababaaa;

@Environment(EnvType.CLIENT)
@Mixin({class_897.class})
public abstract class q832047b101f4476cb1e83cd851e08c28baaabaab {
   @Inject(
      method = {"method_3921"},
      at = {@At("HEAD")},
      cancellable = true,
      require = 0
   )
   private void a(class_1297 var1, double var2, CallbackInfoReturnable var4) {
      if (q2997348aa27a422480aea29cbfd800b1abababaaa.a(var1) || q2997348aa27a422480aea29cbfd800b1aabaaba.babb(var1)) {
         var4.setReturnValue(false);
      }

   }
}
