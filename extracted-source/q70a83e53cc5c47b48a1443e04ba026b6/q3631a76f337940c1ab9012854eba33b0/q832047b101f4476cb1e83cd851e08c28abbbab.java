package q70a83e53cc5c47b48a1443e04ba026b6.q3631a76f337940c1ab9012854eba33b0;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1774;
import net.minecraft.class_1799;
import net.minecraft.class_1838;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;
import q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644.q2997348aa27a422480aea29cbfd800b1aabbbabbb;
import q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644.q2997348aa27a422480aea29cbfd800b1babbbbbb;

@Environment(EnvType.CLIENT)
@Mixin({class_1774.class})
public abstract class q832047b101f4476cb1e83cd851e08c28abbbab {
   @Redirect(
      method = {"method_7884"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/class_1799;method_7934(I)V"
)
   )
   private void a(class_1799 var1, int var2, class_1838 var3) {
      q2997348aa27a422480aea29cbfd800b1babbbbbb var4 = q2997348aa27a422480aea29cbfd800b1babbbbbb.aaba();
      q2997348aa27a422480aea29cbfd800b1aabbbabbb var5 = var4 != null && var4.aab() != null ? (q2997348aa27a422480aea29cbfd800b1aabbbabbb)var4.aab().abbaaba(q2997348aa27a422480aea29cbfd800b1aabbbabbb.class) : null;
      if (!var3.method_8045().method_8608() || var5 == null || !var5.bbaabbb()) {
         var1.method_7934(var2);
      }
   }
}
