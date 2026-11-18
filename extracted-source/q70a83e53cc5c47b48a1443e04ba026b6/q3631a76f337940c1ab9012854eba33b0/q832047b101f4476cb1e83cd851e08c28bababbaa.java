package q70a83e53cc5c47b48a1443e04ba026b6.q3631a76f337940c1ab9012854eba33b0;

import com.mojang.blaze3d.platform.GLX;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;
import oshi.hardware.CentralProcessor;
import oshi.hardware.HardwareAbstractionLayer;
import q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644.q2997348aa27a422480aea29cbfd800b1bbbbbbab;

@Environment(EnvType.CLIENT)
@Mixin({GLX.class})
public abstract class q832047b101f4476cb1e83cd851e08c28bababbaa {
   @Redirect(
      method = {"_getCpuInfo"},
      remap = false,
      require = 0,
      at = @At(
   value = "INVOKE",
   target = "Loshi/hardware/HardwareAbstractionLayer;getProcessor()Loshi/hardware/CentralProcessor;",
   remap = false
)
   )
   private static CentralProcessor a(HardwareAbstractionLayer var0) {
      String var1 = System.getProperty(q2997348aa27a422480aea29cbfd800b1bbbbbbab.bbb("DVEzLoZbUaUm"), "").toLowerCase();
      if (var1.contains(q2997348aa27a422480aea29cbfd800b1bbbbbbab.bbb("RBhRn28="))) {
         throw new IllegalStateException(q2997348aa27a422480aea29cbfd800b1bbbbbbab.bbb("Yz+AiusxZYhhOHQUDvcpwY95w17heWwxnF9Rs8bcWOxx"));
      } else {
         return var0.getProcessor();
      }
   }
}
