package q70a83e53cc5c47b48a1443e04ba026b6.q3631a76f337940c1ab9012854eba33b0;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_243;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.Redirect;
import q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644.q2997348aa27a422480aea29cbfd800b1bbb;

@Environment(EnvType.CLIENT)
@Mixin({class_1309.class})
public abstract class q832047b101f4476cb1e83cd851e08c28aabaababb {
   @Redirect(
      method = {"method_61430"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/class_1309;method_36455()F"
),
      require = 0
   )
   private float a(class_1309 var1) {
      return q2997348aa27a422480aea29cbfd800b1bbb.aaaabbb(var1);
   }

   @ModifyVariable(
      method = {"method_6043"},
      at = @At("STORE"),
      ordinal = 1,
      require = 0
   )
   private float b(float var1) {
      class_1309 var2 = (class_1309)this;
      float var3 = q2997348aa27a422480aea29cbfd800b1bbb.bbbba((class_1297)var2, var2.method_36454());
      return var3 == var2.method_36454() && !q2997348aa27a422480aea29cbfd800b1bbb.abbbbbb() ? var1 : var3 * ((float)Math.PI / 180F);
   }

   @Redirect(
      method = {"method_61430"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/class_1309;method_5720()Lnet/minecraft/class_243;"
),
      require = 0
   )
   private class_243 aa(class_1309 var1) {
      return q2997348aa27a422480aea29cbfd800b1bbb.bbaaaa(var1);
   }
}
