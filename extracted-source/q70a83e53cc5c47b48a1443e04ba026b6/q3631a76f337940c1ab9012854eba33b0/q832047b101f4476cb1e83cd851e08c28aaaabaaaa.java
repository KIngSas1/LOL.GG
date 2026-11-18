package q70a83e53cc5c47b48a1443e04ba026b6.q3631a76f337940c1ab9012854eba33b0;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_243;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;
import q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644.q2997348aa27a422480aea29cbfd800b1babaaa;
import q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644.q2997348aa27a422480aea29cbfd800b1babbbbbb;

@Environment(EnvType.CLIENT)
@Mixin({class_1657.class})
public abstract class q832047b101f4476cb1e83cd851e08c28aaaabaaaa {
   @Redirect(
      method = {"method_75122"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/class_243;method_18805(DDD)Lnet/minecraft/class_243;"
)
   )
   private class_243 a(class_243 var1, double var2, double var4, double var6, class_1297 var8, float var9, class_243 var10) {
      class_1657 var11 = (class_1657)this;
      q2997348aa27a422480aea29cbfd800b1babaaa var12 = aa();
      if (var12 != null && var12.a(var11)) {
         double var13 = var12.ba();
         return var1.method_18805(var13, var4, var13);
      } else {
         return var1.method_18805(var2, var4, var6);
      }
   }

   @Redirect(
      method = {"method_75122"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/class_1657;method_5728(Z)V"
)
   )
   private void b(class_1657 var1, boolean var2, class_1297 var3, float var4, class_243 var5) {
      q2997348aa27a422480aea29cbfd800b1babaaa var6 = aa();
      if (var6 == null || !var6.aaa(var1)) {
         var1.method_5728(var2);
      }
   }

   private static q2997348aa27a422480aea29cbfd800b1babaaa aa() {
      q2997348aa27a422480aea29cbfd800b1babbbbbb var0 = q2997348aa27a422480aea29cbfd800b1babbbbbb.aaba();
      return var0 != null && var0.aab() != null ? var0.aab().aabba() : null;
   }
}
