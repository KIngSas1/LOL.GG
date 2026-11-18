package q70a83e53cc5c47b48a1443e04ba026b6.q3631a76f337940c1ab9012854eba33b0;

import com.llamalad7.mixinextras.injector.wrapmethod.WrapMethod;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import java.util.List;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_2543;
import net.minecraft.class_2598;
import net.minecraft.class_9127;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644.q2997348aa27a422480aea29cbfd800b1bbbbbbbb;

@Environment(EnvType.CLIENT)
@Mixin({class_2543.class})
public abstract class q832047b101f4476cb1e83cd851e08c28ababbaa {
   @Shadow
   @Final
   private class_9127 field_48536;

   @WrapMethod(
      method = {"decode"},
      require = 1
   )
   private void a(ChannelHandlerContext var1, ByteBuf var2, List var3, Operation var4) {
      if (this.field_48536.comp_2235() != class_2598.field_11942) {
         var4.call(new Object[]{var1, var2, var3});
      } else {
         int var5 = q2997348aa27a422480aea29cbfd800b1bbbbbbbb.bbba();

         try {
            var4.call(new Object[]{var1, var2, var3});
         } finally {
            q2997348aa27a422480aea29cbfd800b1bbbbbbbb.bba(var5);
         }

      }
   }
}
