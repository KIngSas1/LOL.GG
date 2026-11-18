package q70a83e53cc5c47b48a1443e04ba026b6.q3631a76f337940c1ab9012854eba33b0;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1309;
import net.minecraft.class_310;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644.q2997348aa27a422480aea29cbfd800b1abaabaabb;
import q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644.q2997348aa27a422480aea29cbfd800b1babbbbbb;

@Environment(EnvType.CLIENT)
@Mixin({class_1309.class})
public abstract class q832047b101f4476cb1e83cd851e08c28bababbba {
   @Inject(
      method = {"method_6028"},
      at = {@At("RETURN")},
      cancellable = true,
      require = 0
   )
   private void a(CallbackInfoReturnable var1) {
      class_310 var2 = class_310.method_1551();
      if (var2 != null && var2.field_1724 == this) {
         q2997348aa27a422480aea29cbfd800b1babbbbbb var3 = q2997348aa27a422480aea29cbfd800b1babbbbbb.aaba();
         if (var3 != null) {
            q2997348aa27a422480aea29cbfd800b1abaabaabb var4 = var3.aab().bbbaba();
            if (var4 != null && var4.abaa()) {
               var1.setReturnValue(var4.a((Integer)var1.getReturnValue()));
            }

         }
      }
   }
}
