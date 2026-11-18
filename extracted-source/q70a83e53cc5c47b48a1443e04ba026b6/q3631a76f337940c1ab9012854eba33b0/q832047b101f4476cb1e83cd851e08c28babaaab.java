package q70a83e53cc5c47b48a1443e04ba026b6.q3631a76f337940c1ab9012854eba33b0;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_2561;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644.q2997348aa27a422480aea29cbfd800b1aabaaba;
import q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644.q2997348aa27a422480aea29cbfd800b1aabbabab;
import q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644.q2997348aa27a422480aea29cbfd800b1ababaaaa;
import q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644.q2997348aa27a422480aea29cbfd800b1abababaaa;
import q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644.q2997348aa27a422480aea29cbfd800b1abbbaaa;

@Environment(EnvType.CLIENT)
@Mixin({class_1297.class})
public abstract class q832047b101f4476cb1e83cd851e08c28babaaab {
   @Inject(
      method = {"method_5756"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void a(class_1657 var1, CallbackInfoReturnable var2) {
      class_1297 var3 = (class_1297)this;
      if (q2997348aa27a422480aea29cbfd800b1abababaaa.aa(var3)) {
         var2.setReturnValue(true);
      }

   }

   @Inject(
      method = {"method_5477"},
      at = {@At("RETURN")},
      cancellable = true
   )
   private void b(CallbackInfoReturnable var1) {
      class_1297 var2 = (class_1297)this;
      if (var2 instanceof class_1657 var3) {
         class_2561 var4 = q2997348aa27a422480aea29cbfd800b1aabbabab.a(var3.method_7334(), (class_2561)var1.getReturnValue());
         var1.setReturnValue(q2997348aa27a422480aea29cbfd800b1abbbaaa.aaba(var3, q2997348aa27a422480aea29cbfd800b1ababaaaa.aba(var3, var4)));
      }

   }

   @Inject(
      method = {"method_5476"},
      at = {@At("RETURN")},
      cancellable = true
   )
   private void aa(CallbackInfoReturnable var1) {
      class_1297 var2 = (class_1297)this;
      if (var2 instanceof class_1657 var3) {
         class_2561 var4 = q2997348aa27a422480aea29cbfd800b1aabbabab.a(var3.method_7334(), (class_2561)var1.getReturnValue());
         var1.setReturnValue(q2997348aa27a422480aea29cbfd800b1abbbaaa.aaba(var3, q2997348aa27a422480aea29cbfd800b1ababaaaa.aba(var3, var4)));
      }

   }

   @Inject(
      method = {"method_5733"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void ab(CallbackInfoReturnable var1) {
      class_1297 var2 = (class_1297)this;
      if (q2997348aa27a422480aea29cbfd800b1abababaaa.a(var2) || q2997348aa27a422480aea29cbfd800b1aabaaba.babb(var2)) {
         var1.setReturnValue(false);
      }

   }
}
