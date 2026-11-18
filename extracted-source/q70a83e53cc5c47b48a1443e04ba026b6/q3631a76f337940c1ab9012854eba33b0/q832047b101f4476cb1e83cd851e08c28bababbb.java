package q70a83e53cc5c47b48a1443e04ba026b6.q3631a76f337940c1ab9012854eba33b0;

import java.util.List;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_2477;
import net.minecraft.class_2588;
import net.minecraft.class_5348;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644.q2997348aa27a422480aea29cbfd800b1bbbbbbbb;

@Environment(EnvType.CLIENT)
@Mixin({class_2588.class})
public abstract class q832047b101f4476cb1e83cd851e08c28bababbb {
   @Shadow
   private class_2477 field_25317;
   @Shadow
   @Final
   private String field_11876;
   @Unique
   private boolean a;
   @Unique
   private boolean b;
   @Shadow
   private List field_11877;

   @Inject(
      method = {"method_11025"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void a(CallbackInfo var1) {
      if (!q2997348aa27a422480aea29cbfd800b1bbbbbbbb.b()) {
         if (this.a) {
            this.field_25317 = null;
            this.a = false;
         }

      } else if (this.b) {
         if (!q2997348aa27a422480aea29cbfd800b1bbbbbbbb.a(this.field_11876)) {
            class_2477 var2 = class_2477.method_10517();
            if (this.field_25317 != var2) {
               this.field_25317 = var2;
               this.field_11877 = List.of(class_5348.method_29430(this.field_11876));
            }

            q2997348aa27a422480aea29cbfd800b1bbbbbbbb.bbbb(this.field_11876);
            this.a = true;
            var1.cancel();
         }
      }
   }

   @Inject(
      method = {"<init>"},
      at = {@At("RETURN")},
      require = 1
   )
   private void b(String var1, String var2, Object[] var3, CallbackInfo var4) {
      this.b = q2997348aa27a422480aea29cbfd800b1bbbbbbbb.bb();
   }
}
