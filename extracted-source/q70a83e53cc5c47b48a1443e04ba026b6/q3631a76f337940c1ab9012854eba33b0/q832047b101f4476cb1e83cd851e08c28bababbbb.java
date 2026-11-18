package q70a83e53cc5c47b48a1443e04ba026b6.q3631a76f337940c1ab9012854eba33b0;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1309;
import net.minecraft.class_310;
import net.minecraft.class_6880;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644.q2997348aa27a422480aea29cbfd800b1aabaabaa;
import q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644.q2997348aa27a422480aea29cbfd800b1babbbbbb;

@Environment(EnvType.CLIENT)
@Mixin({class_1309.class})
public abstract class q832047b101f4476cb1e83cd851e08c28bababbbb {
   private boolean a(class_6880 var1) {
      class_310 var2 = class_310.method_1551();
      if (var2 != null && var2.field_1724 != null && var2.field_1724 == this) {
         q2997348aa27a422480aea29cbfd800b1babbbbbb var3 = q2997348aa27a422480aea29cbfd800b1babbbbbb.aaba();
         if (var3 == null) {
            return false;
         } else {
            q2997348aa27a422480aea29cbfd800b1aabaabaa var4 = (q2997348aa27a422480aea29cbfd800b1aabaabaa)var3.aab().abbaaba(q2997348aa27a422480aea29cbfd800b1aabaabaa.class);
            return var4 != null && var4.ba(var1);
         }
      } else {
         return false;
      }
   }

   @Inject(
      method = {"method_66279"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void b(class_6880 var1, float var2, CallbackInfoReturnable var3) {
      if (this.a(var1)) {
         var3.setReturnValue(0.0F);
      }

   }
}
