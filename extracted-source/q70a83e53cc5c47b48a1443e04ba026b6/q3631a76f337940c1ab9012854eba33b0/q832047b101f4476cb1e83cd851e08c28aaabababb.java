package q70a83e53cc5c47b48a1443e04ba026b6.q3631a76f337940c1ab9012854eba33b0;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1657;
import net.minecraft.class_2561;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644.q2997348aa27a422480aea29cbfd800b1aabbabab;
import q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644.q2997348aa27a422480aea29cbfd800b1ababaaaa;
import q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644.q2997348aa27a422480aea29cbfd800b1abbbaaa;

@Environment(EnvType.CLIENT)
@Mixin({class_1657.class})
public abstract class q832047b101f4476cb1e83cd851e08c28aaabababb {
   @Inject(
      method = {"method_5477"},
      at = {@At("RETURN")},
      cancellable = true,
      require = 0
   )
   private void a(CallbackInfoReturnable var1) {
      class_1657 var2 = (class_1657)this;
      class_2561 var3 = q2997348aa27a422480aea29cbfd800b1aabbabab.a(var2.method_7334(), (class_2561)var1.getReturnValue());
      var1.setReturnValue(q2997348aa27a422480aea29cbfd800b1abbbaaa.aaba(var2, q2997348aa27a422480aea29cbfd800b1ababaaaa.aba(var2, var3)));
   }

   @Inject(
      method = {"method_5476"},
      at = {@At("RETURN")},
      cancellable = true,
      require = 0
   )
   private void b(CallbackInfoReturnable var1) {
      class_1657 var2 = (class_1657)this;
      class_2561 var3 = q2997348aa27a422480aea29cbfd800b1aabbabab.a(var2.method_7334(), (class_2561)var1.getReturnValue());
      var1.setReturnValue(q2997348aa27a422480aea29cbfd800b1abbbaaa.aaba(var2, q2997348aa27a422480aea29cbfd800b1ababaaaa.aba(var2, var3)));
   }
}
