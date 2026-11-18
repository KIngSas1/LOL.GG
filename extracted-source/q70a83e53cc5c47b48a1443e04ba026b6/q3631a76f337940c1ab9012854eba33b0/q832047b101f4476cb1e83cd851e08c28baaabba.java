package q70a83e53cc5c47b48a1443e04ba026b6.q3631a76f337940c1ab9012854eba33b0;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1661;
import net.minecraft.class_1799;
import net.minecraft.class_310;
import net.minecraft.class_329;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;
import q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644.q2997348aa27a422480aea29cbfd800b1abbaaaba;

@Environment(EnvType.CLIENT)
@Mixin({class_329.class})
public abstract class q832047b101f4476cb1e83cd851e08c28baaabba {
   @Redirect(
      method = {"method_1748()V"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/class_1661;method_7391()Lnet/minecraft/class_1799;"
)
   )
   private class_1799 a(class_1661 var1) {
      class_310 var2 = class_310.method_1551();
      return var2 != null && var2.field_1724 != null && var2.field_1724.method_31548() == var1 ? q2997348aa27a422480aea29cbfd800b1abbaaaba.aaaababa(var2.field_1724) : var1.method_7391();
   }

   @Redirect(
      method = {"method_1759"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/class_1661;method_67532()I"
)
   )
   private int b(class_1661 var1) {
      return q2997348aa27a422480aea29cbfd800b1abbaaaba.babbbaa(var1);
   }
}
