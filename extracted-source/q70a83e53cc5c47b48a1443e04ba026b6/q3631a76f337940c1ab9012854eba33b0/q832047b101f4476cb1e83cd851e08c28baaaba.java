package q70a83e53cc5c47b48a1443e04ba026b6.q3631a76f337940c1ab9012854eba33b0;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1294;
import net.minecraft.class_1297;
import net.minecraft.class_310;
import net.minecraft.class_5636;
import net.minecraft.class_6880;
import net.minecraft.class_7286;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644.q2997348aa27a422480aea29cbfd800b1aabaabaa;
import q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644.q2997348aa27a422480aea29cbfd800b1babbbbbb;

@Environment(EnvType.CLIENT)
@Mixin({class_7286.class})
public abstract class q832047b101f4476cb1e83cd851e08c28baaaba {
   private boolean a(class_1297 var1) {
      class_310 var2 = class_310.method_1551();
      if (var2 != null && var2.field_1724 != null && var1 == var2.field_1724) {
         class_6880 var3 = this.method_42590();
         if (!class_1294.field_5919.equals(var3) && !class_1294.field_38092.equals(var3)) {
            return false;
         } else {
            q2997348aa27a422480aea29cbfd800b1babbbbbb var4 = q2997348aa27a422480aea29cbfd800b1babbbbbb.aaba();
            if (var4 == null) {
               return false;
            } else {
               q2997348aa27a422480aea29cbfd800b1aabaabaa var5 = (q2997348aa27a422480aea29cbfd800b1aabaabaa)var4.aab().abbaaba(q2997348aa27a422480aea29cbfd800b1aabaabaa.class);
               return var5 != null && var5.ba(var3);
            }
         }
      } else {
         return false;
      }
   }

   @Shadow
   public abstract class_6880 method_42590();

   @Inject(
      method = {"method_42593"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void b(class_5636 var1, class_1297 var2, CallbackInfoReturnable var3) {
      if (this.a(var2)) {
         var3.setReturnValue(false);
      }

   }
}
