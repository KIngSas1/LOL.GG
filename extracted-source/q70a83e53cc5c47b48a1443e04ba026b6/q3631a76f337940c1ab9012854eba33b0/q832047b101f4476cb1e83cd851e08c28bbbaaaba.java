package q70a83e53cc5c47b48a1443e04ba026b6.q3631a76f337940c1ab9012854eba33b0;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_10042;
import net.minecraft.class_1309;
import net.minecraft.class_310;
import net.minecraft.class_922;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644.q2997348aa27a422480aea29cbfd800b1babaab;

@Environment(EnvType.CLIENT)
@Mixin({class_922.class})
public abstract class q832047b101f4476cb1e83cd851e08c28bbbaaaba {
   @Inject(
      method = {"method_62355(Lnet/minecraft/class_1309;Lnet/minecraft/class_10042;F)V"},
      at = {@At("TAIL")},
      require = 0
   )
   private void a(class_1309 var1, class_10042 var2, float var3, CallbackInfo var4) {
      class_310 var5 = class_310.method_1551();
      if (var5 != null && var5.field_1724 != null && var1 == var5.field_1724) {
         q2997348aa27a422480aea29cbfd800b1babaab var6 = q2997348aa27a422480aea29cbfd800b1babaab.bb();
         if (var6 != null) {
            var6.ba(var2, var3);
         }

      }
   }
}
