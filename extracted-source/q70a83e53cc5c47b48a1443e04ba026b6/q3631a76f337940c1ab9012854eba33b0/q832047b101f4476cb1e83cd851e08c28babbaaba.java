package q70a83e53cc5c47b48a1443e04ba026b6.q3631a76f337940c1ab9012854eba33b0;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1747;
import net.minecraft.class_1750;
import net.minecraft.class_2246;
import net.minecraft.class_2680;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644.q2997348aa27a422480aea29cbfd800b1abaaabaaa;
import q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644.q2997348aa27a422480aea29cbfd800b1abbabaaa;
import q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644.q2997348aa27a422480aea29cbfd800b1baabbabb;
import q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644.q2997348aa27a422480aea29cbfd800b1babbbbbb;

@Environment(EnvType.CLIENT)
@Mixin({class_1747.class})
public abstract class q832047b101f4476cb1e83cd851e08c28babbaaba {
   @Shadow
   protected abstract boolean method_20360();

   @Inject(
      method = {"method_7709"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void a(class_1750 var1, class_2680 var2, CallbackInfoReturnable var3) {
      q2997348aa27a422480aea29cbfd800b1babbbbbb var4 = q2997348aa27a422480aea29cbfd800b1babbbbbb.aaba();
      q2997348aa27a422480aea29cbfd800b1baabbabb var5 = var4 != null && var4.aab() != null ? var4.aab().abaaab() : null;
      q2997348aa27a422480aea29cbfd800b1abbabaaa var6 = var4 != null && var4.aab() != null ? var4.aab().bbab() : null;
      q2997348aa27a422480aea29cbfd800b1abaaabaaa var7 = var4 != null && var4.aab() != null ? var4.aab().abab() : null;
      if (var2.method_27852(class_2246.field_10343) && (var5 != null && var5.bbaabbb() || var6 != null && var6.bab() || var7 != null && var7.baaba())) {
         var3.setReturnValue(!this.method_20360() || var2.method_26184(var1.method_8045(), var1.method_8037()));
      }

   }
}
