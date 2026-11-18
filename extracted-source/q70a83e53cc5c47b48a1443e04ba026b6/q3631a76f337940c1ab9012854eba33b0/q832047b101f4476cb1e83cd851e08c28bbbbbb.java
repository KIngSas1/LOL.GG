package q70a83e53cc5c47b48a1443e04ba026b6.q3631a76f337940c1ab9012854eba33b0;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1309;
import net.minecraft.class_1671;
import net.minecraft.class_243;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;
import q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644.q2997348aa27a422480aea29cbfd800b1baabbba;
import q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644.q2997348aa27a422480aea29cbfd800b1babbbbbb;

@Environment(EnvType.CLIENT)
@Mixin({class_1671.class})
public abstract class q832047b101f4476cb1e83cd851e08c28bbbbbb {
   @Redirect(
      method = {"method_5773"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/class_1309;method_5720()Lnet/minecraft/class_243;"
),
      require = 0
   )
   private class_243 a(class_1309 var1) {
      q2997348aa27a422480aea29cbfd800b1babbbbbb var2 = q2997348aa27a422480aea29cbfd800b1babbbbbb.aaba();
      if (var2 != null && var2.aab() != null) {
         q2997348aa27a422480aea29cbfd800b1baabbba var3 = var2.aab().baaa();
         return var3 == null ? var1.method_5720() : var3.abb(var1);
      } else {
         return var1.method_5720();
      }
   }
}
