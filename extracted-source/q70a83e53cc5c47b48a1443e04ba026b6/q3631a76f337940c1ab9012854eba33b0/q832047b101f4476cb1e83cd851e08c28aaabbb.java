package q70a83e53cc5c47b48a1443e04ba026b6.q3631a76f337940c1ab9012854eba33b0;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1309;
import net.minecraft.class_7172;
import net.minecraft.class_765;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644.q2997348aa27a422480aea29cbfd800b1abbaaaaaa;

@Environment(EnvType.CLIENT)
@Mixin({class_765.class})
public abstract class q832047b101f4476cb1e83cd851e08c28aaabbb {
   @Redirect(
      method = {"method_3313"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/class_7172;method_41753()Ljava/lang/Object;",
   ordinal = 2
),
      require = 0
   )
   private Object a(class_7172 var1) {
      Object var2 = var1.method_41753();
      return q2997348aa27a422480aea29cbfd800b1abbaaaaaa.abb() && var2 instanceof Double ? (double)16.0F : var2;
   }

   @Inject(
      method = {"method_42596"},
      at = {@At("HEAD")},
      cancellable = true,
      require = 0
   )
   private void b(class_1309 var1, float var2, float var3, CallbackInfoReturnable var4) {
      if (q2997348aa27a422480aea29cbfd800b1abbaaaaaa.abb()) {
         var4.setReturnValue(0.0F);
      }

   }
}
