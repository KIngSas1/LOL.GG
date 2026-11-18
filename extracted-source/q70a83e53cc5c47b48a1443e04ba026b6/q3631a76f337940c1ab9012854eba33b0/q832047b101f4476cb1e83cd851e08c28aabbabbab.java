package q70a83e53cc5c47b48a1443e04ba026b6.q3631a76f337940c1ab9012854eba33b0;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_2960;
import net.minecraft.class_761;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644.q2997348aa27a422480aea29cbfd800b1ababbaab;

@Environment(EnvType.CLIENT)
@Mixin({class_761.class})
public abstract class q832047b101f4476cb1e83cd851e08c28aabbabbab {
   @ModifyArg(
      method = {"method_22710(Lnet/minecraft/class_9922;Lnet/minecraft/class_9779;ZLnet/minecraft/class_4184;Lorg/joml/Matrix4f;Lorg/joml/Matrix4f;Lorg/joml/Matrix4f;Lcom/mojang/blaze3d/buffers/GpuBufferSlice;Lorg/joml/Vector4f;Z)V"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/class_10151;method_62941(Lnet/minecraft/class_2960;Ljava/util/Set;)Lnet/minecraft/class_279;"
),
      index = 0,
      require = 0
   )
   private class_2960 a(class_2960 var1) {
      class_2960 var2 = q2997348aa27a422480aea29cbfd800b1ababbaab.babb();
      return var2 != null ? var2 : var1;
   }
}
