package q70a83e53cc5c47b48a1443e04ba026b6.q3631a76f337940c1ab9012854eba33b0;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1297;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644.q2997348aa27a422480aea29cbfd800b1bbb;

@Environment(EnvType.CLIENT)
@Mixin({class_1297.class})
public abstract class q832047b101f4476cb1e83cd851e08c28ababaaa {
   @ModifyArg(
      method = {"method_5724"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/class_1297;method_18795(Lnet/minecraft/class_243;FF)Lnet/minecraft/class_243;"
),
      index = 2,
      require = 0
   )
   private float a(float var1) {
      return q2997348aa27a422480aea29cbfd800b1bbb.bbbba((class_1297)this, var1);
   }
}
