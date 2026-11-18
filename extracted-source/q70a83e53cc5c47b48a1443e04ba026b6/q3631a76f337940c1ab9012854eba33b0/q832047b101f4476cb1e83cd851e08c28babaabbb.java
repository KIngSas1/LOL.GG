package q70a83e53cc5c47b48a1443e04ba026b6.q3631a76f337940c1ab9012854eba33b0;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_310;
import net.minecraft.class_757;
import net.minecraft.class_9779;
import org.joml.Matrix4f;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644.q2997348aa27a422480aea29cbfd800b1babbbbbb;
import q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644.q2997348aa27a422480aea29cbfd800b1bbb;

@Environment(EnvType.CLIENT)
@Mixin({class_757.class})
public abstract class q832047b101f4476cb1e83cd851e08c28babaabbb {
   @Unique
   private int a;
   @Unique
   private boolean b;

   @Inject(
      method = {"method_3172(FZLorg/joml/Matrix4f;)V"},
      at = {@At("HEAD")},
      require = 1
   )
   private void a(float var1, boolean var2, Matrix4f var3, CallbackInfo var4) {
      class_310 var5 = class_310.method_1551();
      if (q2997348aa27a422480aea29cbfd800b1babbbbbb.aaba() != null && var5 != null && var5.field_1724 != null && var5.method_1560() == var5.field_1724 && q2997348aa27a422480aea29cbfd800b1bbb.abbaa(var5.field_1724)) {
         int var6 = System.identityHashCode(var5.field_1724);
         q2997348aa27a422480aea29cbfd800b1bbb.aababaa(var5.field_1724, q2997348aa27a422480aea29cbfd800b1bbb.abaabab(var5.field_1724, var1), q2997348aa27a422480aea29cbfd800b1bbb.abababa(var5.field_1724, var1), !this.b || this.a != var6);
         this.b = true;
         this.a = var6;
      } else {
         this.b = false;
         this.a = 0;
      }
   }

   @Inject(
      method = {"method_76295(Lnet/minecraft/class_9779;)V"},
      at = {@At("HEAD")},
      require = 1
   )
   private void b(class_9779 var1, CallbackInfo var2) {
      q2997348aa27a422480aea29cbfd800b1babbbbbb var3 = q2997348aa27a422480aea29cbfd800b1babbbbbb.aaba();
      if (var3 != null && var3.aab() != null) {
         var3.aab().bababa();
      }

   }
}
