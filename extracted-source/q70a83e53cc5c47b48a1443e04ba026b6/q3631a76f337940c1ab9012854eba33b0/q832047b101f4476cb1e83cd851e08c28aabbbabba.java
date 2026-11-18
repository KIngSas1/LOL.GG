package q70a83e53cc5c47b48a1443e04ba026b6.q3631a76f337940c1ab9012854eba33b0;

import com.mojang.authlib.GameProfile;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_640;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644.q2997348aa27a422480aea29cbfd800b1aabbabab;

@Environment(EnvType.CLIENT)
@Mixin({class_640.class})
public abstract class q832047b101f4476cb1e83cd851e08c28aabbbabba {
   @Shadow
   @Final
   private GameProfile field_3741;

   @Inject(
      method = {"method_52810"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void a(CallbackInfoReturnable var1) {
      Object var2 = q2997348aa27a422480aea29cbfd800b1aabbabab.aaa(this.field_3741);
      if (var2 != null) {
         var1.setReturnValue(var2);
      }

   }
}
