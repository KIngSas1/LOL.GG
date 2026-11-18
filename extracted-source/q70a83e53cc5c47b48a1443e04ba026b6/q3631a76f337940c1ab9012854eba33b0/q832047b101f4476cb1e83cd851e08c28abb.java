package q70a83e53cc5c47b48a1443e04ba026b6.q3631a76f337940c1ab9012854eba33b0;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_11908;
import net.minecraft.class_309;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644.q2997348aa27a422480aea29cbfd800b1abbaaaba;

@Environment(EnvType.CLIENT)
@Mixin({class_309.class})
public abstract class q832047b101f4476cb1e83cd851e08c28abb {
   @Inject(
      method = {"method_1466"},
      at = {@At("HEAD")}
   )
   private void a(long var1, int var3, class_11908 var4, CallbackInfo var5) {
      if (var4 != null) {
         q2997348aa27a422480aea29cbfd800b1abbaaaba.abaaab(var3, var4.comp_4796());
      }

   }
}
