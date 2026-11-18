package q70a83e53cc5c47b48a1443e04ba026b6.q3631a76f337940c1ab9012854eba33b0;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_2561;
import net.minecraft.class_338;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644.q2997348aa27a422480aea29cbfd800b1aabbabab;
import q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644.q2997348aa27a422480aea29cbfd800b1babbbbbb;

@Environment(EnvType.CLIENT)
@Mixin({class_338.class})
public abstract class q832047b101f4476cb1e83cd851e08c28bbababab {
   @ModifyVariable(
      method = {"method_1812"},
      at = @At("HEAD"),
      argsOnly = true,
      ordinal = 0,
      require = 0
   )
   private class_2561 a(class_2561 var1) {
      return q2997348aa27a422480aea29cbfd800b1aabbabab.aa(var1);
   }

   @Inject(
      method = {"method_1812"},
      at = {@At("HEAD")},
      require = 0
   )
   private void b(class_2561 var1, CallbackInfo var2) {
      q2997348aa27a422480aea29cbfd800b1babbbbbb var3 = q2997348aa27a422480aea29cbfd800b1babbbbbb.aaba();
      if (var3 != null && var3.aab() != null && var1 != null) {
         var3.aab().abbabaa(var1.getString());
      }
   }
}
