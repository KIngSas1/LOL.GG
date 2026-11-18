package q70a83e53cc5c47b48a1443e04ba026b6.q3631a76f337940c1ab9012854eba33b0;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_11909;
import net.minecraft.class_332;
import net.minecraft.class_408;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644.q2997348aa27a422480aea29cbfd800b1babbb;
import q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644.q2997348aa27a422480aea29cbfd800b1babbbbbb;

@Environment(EnvType.CLIENT)
@Mixin({class_408.class})
public abstract class q832047b101f4476cb1e83cd851e08c28bbbbabb {
   @Unique
   private q2997348aa27a422480aea29cbfd800b1babbb a;

   @Unique
   private q2997348aa27a422480aea29cbfd800b1babbb a() {
      if (this.a == null) {
         this.a = new q2997348aa27a422480aea29cbfd800b1babbb();
      }

      return this.a;
   }

   @Inject(
      method = {"method_25402"},
      at = {@At("HEAD")},
      cancellable = true,
      require = 1
   )
   private void b(class_11909 var1, boolean var2, CallbackInfoReturnable var3) {
      q2997348aa27a422480aea29cbfd800b1babbbbbb var4 = q2997348aa27a422480aea29cbfd800b1babbbbbb.aaba();
      if (var4 != null && var4.aab() != null && var4.aab().bababb(var1.comp_4798(), var1.comp_4799(), var1.method_74245())) {
         var3.setReturnValue(true);
      } else {
         if (this.a().ab(var1.comp_4798(), var1.comp_4799(), var1.method_74245())) {
            var3.setReturnValue(true);
         }

      }
   }

   @Inject(
      method = {"method_25394"},
      at = {@At("TAIL")},
      require = 1
   )
   private void aa(class_332 var1, int var2, int var3, float var4, CallbackInfo var5) {
      this.a().a(var1);
   }

   @Inject(
      method = {"method_25432"},
      at = {@At("HEAD")},
      require = 0
   )
   private void ab(CallbackInfo var1) {
      if (this.a != null) {
         this.a.aa();
      }

   }
}
