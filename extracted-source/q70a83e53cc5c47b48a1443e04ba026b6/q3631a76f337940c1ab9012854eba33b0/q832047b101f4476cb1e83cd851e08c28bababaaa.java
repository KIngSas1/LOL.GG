package q70a83e53cc5c47b48a1443e04ba026b6.q3631a76f337940c1ab9012854eba33b0;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_310;
import net.minecraft.class_761;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644.q2997348aa27a422480aea29cbfd800b1abbbbbba;
import q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644.q2997348aa27a422480aea29cbfd800b1babbbbbb;

@Environment(EnvType.CLIENT)
@Mixin({class_761.class})
public abstract class q832047b101f4476cb1e83cd851e08c28bababaaa {
   @ModifyVariable(
      method = {"method_74752"},
      at = @At("HEAD"),
      argsOnly = true
   )
   private boolean a(boolean var1) {
      if (var1) {
         return true;
      } else {
         q2997348aa27a422480aea29cbfd800b1babbbbbb var2 = q2997348aa27a422480aea29cbfd800b1babbbbbb.aaba();
         if (var2 != null && var2.aab() != null) {
            q2997348aa27a422480aea29cbfd800b1abbbbbba var3 = var2.aab().ababbba();
            class_310 var4 = class_310.method_1551();
            return var3 != null && var3.abb(var4.field_1773.method_19418().method_19331());
         } else {
            return false;
         }
      }
   }
}
