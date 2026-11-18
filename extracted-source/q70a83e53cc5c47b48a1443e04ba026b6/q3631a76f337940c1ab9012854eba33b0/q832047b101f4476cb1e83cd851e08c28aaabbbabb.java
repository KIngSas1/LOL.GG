package q70a83e53cc5c47b48a1443e04ba026b6.q3631a76f337940c1ab9012854eba33b0;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_8828;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644.q2997348aa27a422480aea29cbfd800b1aabbabab;

@Environment(EnvType.CLIENT)
@Mixin({class_8828.class_2585.class})
public abstract class q832047b101f4476cb1e83cd851e08c28aaabbbabb {
   @ModifyArg(
      method = {"method_27660(Lnet/minecraft/class_5348$class_5246;Lnet/minecraft/class_2583;)Ljava/util/Optional;"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/class_5348$class_5246;accept(Lnet/minecraft/class_2583;Ljava/lang/String;)Ljava/util/Optional;"
),
      index = 1,
      require = 1
   )
   private static String a(String var0) {
      return q2997348aa27a422480aea29cbfd800b1aabbabab.ba(var0);
   }
}
