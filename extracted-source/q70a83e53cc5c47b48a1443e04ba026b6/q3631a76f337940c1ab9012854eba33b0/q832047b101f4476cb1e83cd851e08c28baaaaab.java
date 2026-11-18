package q70a83e53cc5c47b48a1443e04ba026b6.q3631a76f337940c1ab9012854eba33b0;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1297;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644.q2997348aa27a422480aea29cbfd800b1aaaabbbba;

@Environment(EnvType.CLIENT)
@Mixin({class_1297.class})
public abstract class q832047b101f4476cb1e83cd851e08c28baaaaab {
   @Inject(
      method = {"method_22861"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void a(CallbackInfoReturnable var1) {
      class_1297 var2 = (class_1297)this;
      if (q2997348aa27a422480aea29cbfd800b1aaaabbbba.aba(var2.method_5667())) {
         var1.setReturnValue(q2997348aa27a422480aea29cbfd800b1aaaabbbba.a(var2.method_5667()));
      }

   }

   @Inject(
      method = {"method_5851"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void b(CallbackInfoReturnable var1) {
      class_1297 var2 = (class_1297)this;
      if (q2997348aa27a422480aea29cbfd800b1aaaabbbba.aba(var2.method_5667())) {
         var1.setReturnValue(true);
      }

   }
}
