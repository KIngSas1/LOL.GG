package q70a83e53cc5c47b48a1443e04ba026b6.q3631a76f337940c1ab9012854eba33b0;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_2535;
import net.minecraft.class_2720;
import net.minecraft.class_2856;
import net.minecraft.class_310;
import net.minecraft.class_8673;
import net.minecraft.class_2856.class_2857;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644.q2997348aa27a422480aea29cbfd800b1abbbaab;
import q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644.q2997348aa27a422480aea29cbfd800b1bbbbbbbb;

@Environment(EnvType.CLIENT)
@Mixin({class_8673.class})
public abstract class q832047b101f4476cb1e83cd851e08c28babaabab {
   @Shadow
   @Final
   protected class_310 field_45588;
   @Shadow
   @Final
   protected class_2535 field_45589;

   @Inject(
      method = {"method_52784"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void a(class_2720 var1, CallbackInfo var2) {
      if (q2997348aa27a422480aea29cbfd800b1bbbbbbbb.b()) {
         if (!q2997348aa27a422480aea29cbfd800b1bbbbbbbb.aabba(var1.comp_2158())) {
            var2.cancel();
            q2997348aa27a422480aea29cbfd800b1bbbbbbbb.aa(var1.comp_2159(), this::aa);
         }
      }
   }

   private void b(class_2720 var1, Boolean var2) {
      if (!q2997348aa27a422480aea29cbfd800b1abbbaab.ab() && this.field_45589.method_10758()) {
         if (!q2997348aa27a422480aea29cbfd800b1bbbbbbbb.b()) {
            this.method_52784(var1);
         } else if (var2 && q2997348aa27a422480aea29cbfd800b1bbbbbbbb.abb(var1.comp_2159())) {
            q2997348aa27a422480aea29cbfd800b1bbbbbbbb.ba(var1.comp_2158());
            this.method_52784(var1);
         } else {
            this.field_45589.method_10743(new class_2856(var1.comp_2158(), class_2857.field_47667));
            q2997348aa27a422480aea29cbfd800b1bbbbbbbb.aaaa(var1.comp_2159());
         }
      }
   }

   @Shadow
   public abstract void method_52784(class_2720 var1);

   private void aa(class_2720 var1, Boolean var2) {
      this.field_45588.execute(this::b);
   }
}
