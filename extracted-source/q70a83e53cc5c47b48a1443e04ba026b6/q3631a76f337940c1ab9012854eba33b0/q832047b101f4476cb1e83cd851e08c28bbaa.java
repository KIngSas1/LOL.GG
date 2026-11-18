package q70a83e53cc5c47b48a1443e04ba026b6.q3631a76f337940c1ab9012854eba33b0;

import io.netty.channel.ChannelHandlerContext;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_2535;
import net.minecraft.class_2596;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644.q2997348aa27a422480aea29cbfd800b1abababaab;
import q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644.q2997348aa27a422480aea29cbfd800b1bbb;
import q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644.q2997348aa27a422480aea29cbfd800b1bbbbbbbb;

@Environment(EnvType.CLIENT)
@Mixin({class_2535.class})
public abstract class q832047b101f4476cb1e83cd851e08c28bbaa {
   @Inject(
      method = {"method_10770(Lio/netty/channel/ChannelHandlerContext;Lnet/minecraft/class_2596;)V"},
      at = {@At("HEAD")}
   )
   private void a(ChannelHandlerContext var1, class_2596 var2, CallbackInfo var3) {
      q2997348aa27a422480aea29cbfd800b1bbbbbbbb.aaaba(var2);
   }

   @Inject(
      method = {"method_10743(Lnet/minecraft/class_2596;)V"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void b(class_2596 var1, CallbackInfo var2) {
      if (q2997348aa27a422480aea29cbfd800b1bbbbbbbb.aab(var1)) {
         var2.cancel();
      }

   }

   @Inject(
      method = {"method_10743(Lnet/minecraft/class_2596;)V"},
      at = {@At("HEAD")}
   )
   private void aa(class_2596 var1, CallbackInfo var2) {
      q2997348aa27a422480aea29cbfd800b1bbb.baaaaaa(var1);
      q2997348aa27a422480aea29cbfd800b1abababaab.abaaabb(var1);
   }

   @ModifyVariable(
      method = {"method_10743(Lnet/minecraft/class_2596;)V"},
      at = @At("HEAD"),
      argsOnly = true
   )
   private class_2596 ab(class_2596 var1) {
      return q2997348aa27a422480aea29cbfd800b1bbbbbbbb.abbb(var1);
   }
}
