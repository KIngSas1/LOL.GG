package q70a83e53cc5c47b48a1443e04ba026b6.q3631a76f337940c1ab9012854eba33b0;

import com.mojang.authlib.GameProfile;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_742;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644.q2997348aa27a422480aea29cbfd800b1aabbabab;

@Environment(EnvType.CLIENT)
@Mixin({class_742.class})
public abstract class q832047b101f4476cb1e83cd851e08c28babaa {
   @Inject(
      method = {"method_52814"},
      at = {@At("HEAD")},
      cancellable = true,
      require = 0
   )
   private void a(CallbackInfoReturnable var1) {
      GameProfile var2 = ((class_742)this).method_7334();
      Object var3 = q2997348aa27a422480aea29cbfd800b1aabbabab.aaa(var2);
      if (var3 != null) {
         var1.setReturnValue(var3);
      }

   }
}
