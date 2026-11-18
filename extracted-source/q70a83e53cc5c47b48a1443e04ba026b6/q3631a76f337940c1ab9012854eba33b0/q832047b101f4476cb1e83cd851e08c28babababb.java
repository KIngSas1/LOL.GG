package q70a83e53cc5c47b48a1443e04ba026b6.q3631a76f337940c1ab9012854eba33b0;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_12249;
import net.minecraft.class_1921;
import net.minecraft.class_2960;
import net.minecraft.class_972;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Environment(EnvType.CLIENT)
@Mixin({class_972.class})
public abstract class q832047b101f4476cb1e83cd851e08c28babababb {
   @Redirect(
      method = {"method_4177"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/class_12249;method_75982(Lnet/minecraft/class_2960;)Lnet/minecraft/class_1921;"
),
      require = 0
   )
   private class_1921 a(class_2960 var1) {
      return class_12249.method_76000(var1);
   }
}
