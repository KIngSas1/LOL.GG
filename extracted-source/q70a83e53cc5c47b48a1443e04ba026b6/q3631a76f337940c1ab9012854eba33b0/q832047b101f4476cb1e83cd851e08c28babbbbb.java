package q70a83e53cc5c47b48a1443e04ba026b6.q3631a76f337940c1ab9012854eba33b0;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_310;
import net.minecraft.class_757;
import org.joml.Matrix4f;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;
import q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644.q2997348aa27a422480aea29cbfd800b1abbbaaabb;
import q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644.q2997348aa27a422480aea29cbfd800b1babbbbbb;

@Environment(EnvType.CLIENT)
@Mixin({class_757.class})
public abstract class q832047b101f4476cb1e83cd851e08c28babbbbb {
   @Invoker("method_3172")
   protected abstract void yj$invokeShaderHands(float var1, boolean var2, Matrix4f var3);

   private void a(float var1, boolean var2, Matrix4f var3) {
      this.yj$invokeShaderHands(var1, var2, var3);
   }

   @Redirect(
      method = {"method_3188(Lnet/minecraft/class_9779;)V"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/class_757;method_3172(FZLorg/joml/Matrix4f;)V"
),
      require = 1
   )
   private void b(class_757 var1, float var2, boolean var3, Matrix4f var4) {
      q2997348aa27a422480aea29cbfd800b1babbbbbb var5 = q2997348aa27a422480aea29cbfd800b1babbbbbb.aaba();
      class_310 var6 = class_310.method_1551();
      q2997348aa27a422480aea29cbfd800b1abbbaaabb var7 = var5 != null && var5.aab() != null ? var5.aab().bbabab() : null;
      if (var7 != null && var7.bba(var6, var3)) {
         var7.aa(var6, this::a);
      } else {
         this.yj$invokeShaderHands(var2, var3, var4);
      }

   }
}
