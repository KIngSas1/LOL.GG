package q70a83e53cc5c47b48a1443e04ba026b6.q3631a76f337940c1ab9012854eba33b0;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_304;
import net.minecraft.class_3675;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644.q2997348aa27a422480aea29cbfd800b1abbaaaba;
import q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644.q2997348aa27a422480aea29cbfd800b1bbabbbb;

@Environment(EnvType.CLIENT)
@Mixin({class_304.class})
public abstract class q832047b101f4476cb1e83cd851e08c28baaba {
   @Inject(
      method = {"method_1420"},
      at = {@At("TAIL")}
   )
   private static void a(class_3675.class_306 var0, CallbackInfo var1) {
      q2997348aa27a422480aea29cbfd800b1bbabbbb.bab(var0);
   }

   @Inject(
      method = {"method_1424"},
      at = {@At("HEAD")}
   )
   private static void b(CallbackInfo var0) {
      q2997348aa27a422480aea29cbfd800b1abbaaaba.aabbaa();
   }
}
