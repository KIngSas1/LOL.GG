package q70a83e53cc5c47b48a1443e04ba026b6.q3631a76f337940c1ab9012854eba33b0;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_310;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644.q2997348aa27a422480aea29cbfd800b1aabbbabbb;
import q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644.q2997348aa27a422480aea29cbfd800b1babbbbbb;

@Environment(EnvType.CLIENT)
@Mixin({class_1799.class})
public abstract class q832047b101f4476cb1e83cd851e08c28abaabbabb {
   @Inject(
      method = {"method_7965"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void a(CallbackInfoReturnable var1) {
      class_310 var2 = class_310.method_1551();
      q2997348aa27a422480aea29cbfd800b1babbbbbb var3 = q2997348aa27a422480aea29cbfd800b1babbbbbb.aaba();
      if (var2.field_1724 != null && var3 != null && var3.aab() != null) {
         q2997348aa27a422480aea29cbfd800b1aabbbabbb var4 = (q2997348aa27a422480aea29cbfd800b1aabbbabbb)var3.aab().abbaaba(q2997348aa27a422480aea29cbfd800b1aabbbabbb.class);
         class_1799 var5 = (class_1799)this;
         if (var4 != null && var4.bbaabbb() && var5.method_31574(class_1802.field_8301)) {
            var1.setReturnValue(0);
         }

      }
   }
}
