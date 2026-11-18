package q70a83e53cc5c47b48a1443e04ba026b6.q3631a76f337940c1ab9012854eba33b0;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1297;
import net.minecraft.class_310;
import net.minecraft.class_746;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644.q2997348aa27a422480aea29cbfd800b1aaabbab;

@Environment(EnvType.CLIENT)
@Mixin({class_1297.class})
public abstract class q832047b101f4476cb1e83cd851e08c28ababbaaaa {
   @Inject(
      method = {"method_5697"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void a(class_1297 var1, CallbackInfo var2) {
      class_1297 var3 = (class_1297)this;
      class_746 var4 = class_310.method_1551().field_1724;
      if (var3 == var4 && q2997348aa27a422480aea29cbfd800b1aaabbab.aaa(var3, var1)) {
         var2.cancel();
      }
   }
}
