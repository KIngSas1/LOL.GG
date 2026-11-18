package q70a83e53cc5c47b48a1443e04ba026b6.q3631a76f337940c1ab9012854eba33b0;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_310;
import net.minecraft.class_315;
import net.minecraft.class_743;
import net.minecraft.class_744;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644.q2997348aa27a422480aea29cbfd800b1aaaabbaa;
import q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644.q2997348aa27a422480aea29cbfd800b1aabbbbbb;
import q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644.q2997348aa27a422480aea29cbfd800b1babbbbbb;
import q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644.q2997348aa27a422480aea29cbfd800b1bbb;

@Environment(EnvType.CLIENT)
@Mixin({class_743.class})
public abstract class q832047b101f4476cb1e83cd851e08c28abaaabbba extends class_744 {
   @Shadow
   private class_315 field_3902;

   @Inject(
      method = {"method_3129"},
      at = {@At("TAIL")},
      require = 0
   )
   private void a(CallbackInfo var1) {
      q2997348aa27a422480aea29cbfd800b1babbbbbb var2 = q2997348aa27a422480aea29cbfd800b1babbbbbb.aaba();
      if (var2 != null) {
         q2997348aa27a422480aea29cbfd800b1aaaabbaa var3 = var2.aab().bbaaaa();
         if (var3 != null) {
            var3.aaaa(class_310.method_1551(), this);
         }

         q2997348aa27a422480aea29cbfd800b1aabbbbbb var4 = q2997348aa27a422480aea29cbfd800b1aabbbbbb.aabb();
         if (var4 != null) {
            var4.aaaa(this.field_3902, this);
         }

         q2997348aa27a422480aea29cbfd800b1bbb.aabbbab(class_310.method_1551(), this);
      }
   }
}
