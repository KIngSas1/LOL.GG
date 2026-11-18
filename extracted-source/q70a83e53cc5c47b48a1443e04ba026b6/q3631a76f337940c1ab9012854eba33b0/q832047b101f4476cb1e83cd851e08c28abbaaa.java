package q70a83e53cc5c47b48a1443e04ba026b6.q3631a76f337940c1ab9012854eba33b0;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_745;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644.q2997348aa27a422480aea29cbfd800b1abbaabaaa;
import q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644.q2997348aa27a422480aea29cbfd800b1abbbaab;
import q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644.q2997348aa27a422480aea29cbfd800b1bbbbaaab;

@Environment(EnvType.CLIENT)
@Mixin({class_745.class})
public abstract class q832047b101f4476cb1e83cd851e08c28abbaaa {
   @Inject(
      method = {"method_6007"},
      at = {@At("HEAD")},
      cancellable = true,
      require = 1
   )
   private void a(CallbackInfo var1) {
      if (!q2997348aa27a422480aea29cbfd800b1abbbaab.ab()) {
         q2997348aa27a422480aea29cbfd800b1bbbbaaab var2 = q2997348aa27a422480aea29cbfd800b1abbaabaaa.aabba();
         class_745 var3 = (class_745)this;
         if (var2 != null && var2.ba(var3)) {
            if (var3.method_66245()) {
               var3.method_66233().method_66271();
            }

            var3.method_22862();
            var3.field_42108.method_48567(0.0F);
            var1.cancel();
         }
      }
   }
}
