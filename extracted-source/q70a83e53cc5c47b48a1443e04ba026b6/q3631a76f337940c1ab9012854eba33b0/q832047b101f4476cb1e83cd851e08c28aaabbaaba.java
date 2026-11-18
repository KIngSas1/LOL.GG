package q70a83e53cc5c47b48a1443e04ba026b6.q3631a76f337940c1ab9012854eba33b0;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_10426;
import net.minecraft.class_1306;
import net.minecraft.class_1309;
import net.minecraft.class_1799;
import net.minecraft.class_746;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;
import q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644.q2997348aa27a422480aea29cbfd800b1abbaaaba;

@Environment(EnvType.CLIENT)
@Mixin({class_10426.class})
public abstract class q832047b101f4476cb1e83cd851e08c28aaabbaaba {
   @Redirect(
      method = {"method_65577"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/class_1309;method_6047()Lnet/minecraft/class_1799;"
)
   )
   private static class_1799 a(class_1309 var0) {
      class_1799 var10000;
      if (var0 instanceof class_746 var1) {
         var10000 = q2997348aa27a422480aea29cbfd800b1abbaaaba.aaaababa(var1);
      } else {
         var10000 = var0.method_6047();
      }

      return var10000;
   }

   @Redirect(
      method = {"method_65577"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/class_1309;method_61420(Lnet/minecraft/class_1306;)Lnet/minecraft/class_1799;"
)
   )
   private static class_1799 b(class_1309 var0, class_1306 var1) {
      if (var0 instanceof class_746 var2) {
         if (var1 == var0.method_6068()) {
            return q2997348aa27a422480aea29cbfd800b1abbaaaba.aaaababa(var2);
         }
      }

      return var0.method_61420(var1);
   }
}
