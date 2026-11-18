package q70a83e53cc5c47b48a1443e04ba026b6.q3631a76f337940c1ab9012854eba33b0;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_1657;
import net.minecraft.class_310;
import net.minecraft.class_636;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644.q2997348aa27a422480aea29cbfd800b1aaaaaabba;
import q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644.q2997348aa27a422480aea29cbfd800b1aababbbbb;
import q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644.q2997348aa27a422480aea29cbfd800b1abbaaaba;
import q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644.q2997348aa27a422480aea29cbfd800b1babbbbbb;

@Environment(EnvType.CLIENT)
@Mixin({class_636.class})
public abstract class q832047b101f4476cb1e83cd851e08c28abbaabab {
   @Inject(
      method = {"method_2918"},
      at = {@At("TAIL")}
   )
   private void a(class_1657 var1, class_1297 var2, CallbackInfo var3) {
      q2997348aa27a422480aea29cbfd800b1abbaaaba.a();
      q2997348aa27a422480aea29cbfd800b1babbbbbb var4 = q2997348aa27a422480aea29cbfd800b1babbbbbb.aaba();
      if (var4 != null) {
         var4.aab().abaaa(var2);
      }

   }

   @Inject(
      method = {"method_2918"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void b(class_1657 var1, class_1297 var2, CallbackInfo var3) {
      q2997348aa27a422480aea29cbfd800b1babbbbbb var4 = q2997348aa27a422480aea29cbfd800b1babbbbbb.aaba();
      if (var4 != null) {
         q2997348aa27a422480aea29cbfd800b1aababbbbb var5 = var4.aab().ababa();
         if (var5 != null && var5.abb(class_310.method_1551())) {
            var3.cancel();
            return;
         }

         q2997348aa27a422480aea29cbfd800b1aaaaaabba var6 = var4.aab().abbabbb();
         if (var6 != null && var6.bbaabbb() && !q2997348aa27a422480aea29cbfd800b1abbaaaba.babbaba() && var2 instanceof class_1309) {
            class_1309 var7 = (class_1309)var2;
            var6.aba(class_310.method_1551(), var7);
         }

         var4.aab().abbabab(var2);
      }

   }
}
