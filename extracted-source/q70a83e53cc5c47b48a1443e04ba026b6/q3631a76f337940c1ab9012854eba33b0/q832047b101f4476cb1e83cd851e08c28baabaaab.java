package q70a83e53cc5c47b48a1443e04ba026b6.q3631a76f337940c1ab9012854eba33b0;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import org.lwjgl.glfw.GLFW;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Pseudo;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;
import q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644.q2997348aa27a422480aea29cbfd800b1bbabbbb;

@Environment(EnvType.CLIENT)
@Pseudo
@Mixin(
   targets = {"com/soyboy/visualkeystrokes/input/InputTracker"},
   remap = false
)
public abstract class q832047b101f4476cb1e83cd851e08c28baabaaab {
   @Redirect(
      method = {"update", "isPressed"},
      at = @At(
   value = "INVOKE",
   target = "Lorg/lwjgl/glfw/GLFW;glfwGetMouseButton(JI)I",
   remap = false
),
      require = 0,
      remap = false
   )
   private int a(long var1, int var3) {
      return q2997348aa27a422480aea29cbfd800b1bbabbbb.bba(var3, GLFW.glfwGetMouseButton(var1, var3));
   }
}
