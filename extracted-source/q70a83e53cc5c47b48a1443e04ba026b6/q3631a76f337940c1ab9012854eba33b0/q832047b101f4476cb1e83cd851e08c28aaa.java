package q70a83e53cc5c47b48a1443e04ba026b6.q3631a76f337940c1ab9012854eba33b0;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_312;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644.q2997348aa27a422480aea29cbfd800b1aaaaabbbb;
import q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644.q2997348aa27a422480aea29cbfd800b1aabbbaa;
import q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644.q2997348aa27a422480aea29cbfd800b1abbabbb;
import q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644.q2997348aa27a422480aea29cbfd800b1babbbbbb;

@Environment(EnvType.CLIENT)
@Mixin({class_312.class})
public abstract class q832047b101f4476cb1e83cd851e08c28aaa {
   @Shadow
   private double field_1789;
   @Shadow
   private double field_1787;

   @Inject(
      method = {"method_55793"},
      at = {@At("HEAD")}
   )
   private void a(CallbackInfo var1) {
      q2997348aa27a422480aea29cbfd800b1babbbbbb var2 = q2997348aa27a422480aea29cbfd800b1babbbbbb.aaba();
      if (var2 != null) {
         q2997348aa27a422480aea29cbfd800b1abbabbb var3 = var2.aab();
         if (var3 != null) {
            q2997348aa27a422480aea29cbfd800b1aabbbaa var4 = var3.aaababb();
            if (var4 != null) {
               var4.a(this.field_1789, this.field_1787);
            }

            q2997348aa27a422480aea29cbfd800b1aaaaabbbb var5 = var3.ababaaa();
            if (var5 != null && var5.aa()) {
               float var6 = var5.bbb();
               this.field_1789 *= (double)var6;
               this.field_1787 *= (double)var6;
            }
         }
      }
   }
}
