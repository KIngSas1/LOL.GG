package q70a83e53cc5c47b48a1443e04ba026b6.q3631a76f337940c1ab9012854eba33b0;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1799;
import net.minecraft.class_746;
import net.minecraft.class_759;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;
import q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644.q2997348aa27a422480aea29cbfd800b1abbaaaba;

@Environment(EnvType.CLIENT)
@Mixin({class_759.class})
public abstract class q832047b101f4476cb1e83cd851e08c28baabbaa {
   @Redirect(
      method = {"method_3220"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/class_746;method_6047()Lnet/minecraft/class_1799;"
)
   )
   private class_1799 a(class_746 var1) {
      return q2997348aa27a422480aea29cbfd800b1abbaaaba.aaaababa(var1);
   }

   @Redirect(
      method = {"method_33303"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/class_746;method_6047()Lnet/minecraft/class_1799;"
)
   )
   private static class_1799 b(class_746 var0) {
      return q2997348aa27a422480aea29cbfd800b1abbaaaba.aaaababa(var0);
   }
}
