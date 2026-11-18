package q70a83e53cc5c47b48a1443e04ba026b6.q3631a76f337940c1ab9012854eba33b0;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_10055;
import net.minecraft.class_11659;
import net.minecraft.class_11890;
import net.minecraft.class_12075;
import net.minecraft.class_1297;
import net.minecraft.class_310;
import net.minecraft.class_4587;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644.q2997348aa27a422480aea29cbfd800b1aabaaba;
import q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644.q2997348aa27a422480aea29cbfd800b1abbaabbb;
import q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644.q2997348aa27a422480aea29cbfd800b1babbbbbb;
import q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644.q2997348aa27a422480aea29cbfd800b1bbb;

@Environment(EnvType.CLIENT)
@Mixin(
   targets = {"net/minecraft/class_1007"}
)
public abstract class q832047b101f4476cb1e83cd851e08c28aababa {
   @Inject(
      method = {"method_62604(Lnet/minecraft/class_11890;Lnet/minecraft/class_10055;F)V"},
      at = {@At("TAIL")},
      require = 1
   )
   private void a(class_11890 var1, class_10055 var2, float var3, CallbackInfo var4) {
      class_310 var5 = class_310.method_1551();
      q2997348aa27a422480aea29cbfd800b1babbbbbb var6 = q2997348aa27a422480aea29cbfd800b1babbbbbb.aaba();
      q2997348aa27a422480aea29cbfd800b1abbaabbb var7 = var6 != null && var6.aab() != null ? var6.aab().aabaaab() : null;
      if (var5 != null && var1 == var5.field_1724 && var7 != null && var7.bbaabbb() && !var5.field_1690.method_31044().method_31034()) {
         q2997348aa27a422480aea29cbfd800b1bbb.aaabaab(var5, var2, var3);
      }
   }

   @Inject(
      method = {"method_4213"},
      at = {@At("HEAD")},
      cancellable = true,
      require = 0
   )
   private void b(class_10055 var1, class_4587 var2, class_11659 var3, class_12075 var4, CallbackInfo var5) {
      if (q2997348aa27a422480aea29cbfd800b1aabaaba.bba()) {
         class_1297 var6 = aa(var1);
         if (var6 != null && q2997348aa27a422480aea29cbfd800b1aabaaba.babb(var6)) {
            var5.cancel();
         }
      }
   }

   private static class_1297 aa(class_10055 var0) {
      if (var0 == null) {
         return null;
      } else {
         class_310 var1 = class_310.method_1551();
         return var1 != null && var1.field_1687 != null ? var1.field_1687.method_8469(var0.field_53528) : null;
      }
   }
}
