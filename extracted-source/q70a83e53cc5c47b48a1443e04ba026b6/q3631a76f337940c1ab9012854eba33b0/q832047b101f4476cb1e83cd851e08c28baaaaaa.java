package q70a83e53cc5c47b48a1443e04ba026b6.q3631a76f337940c1ab9012854eba33b0;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_310;
import net.minecraft.class_634;
import net.minecraft.class_7439;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644.q2997348aa27a422480aea29cbfd800b1aababbaa;

@Environment(EnvType.CLIENT)
@Mixin({class_634.class})
public abstract class q832047b101f4476cb1e83cd851e08c28baaaaaa {
   @Inject(
      method = {"method_43596"},
      at = {@At("HEAD")},
      require = 0
   )
   private void a(class_7439 var1, CallbackInfo var2) {
      if (class_310.method_1551().method_18854()) {
         if (var1 != null && var1.comp_763() != null) {
            q2997348aa27a422480aea29cbfd800b1aababbaa.a(var1.comp_763().getString());
         }

      }
   }
}
