package q70a83e53cc5c47b48a1443e04ba026b6.q3631a76f337940c1ab9012854eba33b0;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.ClientBrandRetriever;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644.q2997348aa27a422480aea29cbfd800b1bbbbbbbb;

@Environment(EnvType.CLIENT)
@Mixin({ClientBrandRetriever.class})
public abstract class q832047b101f4476cb1e83cd851e08c28ababbba {
   @Inject(
      method = {"getClientModName"},
      at = {@At("HEAD")},
      cancellable = true,
      remap = false
   )
   private static void a(CallbackInfoReturnable var0) {
      if (q2997348aa27a422480aea29cbfd800b1bbbbbbbb.aaab()) {
         var0.setReturnValue(q2997348aa27a422480aea29cbfd800b1bbbbbbbb.abab());
      }

   }
}
