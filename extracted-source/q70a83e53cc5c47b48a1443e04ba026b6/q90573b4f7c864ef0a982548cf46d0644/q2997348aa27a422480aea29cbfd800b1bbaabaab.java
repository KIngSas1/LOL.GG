package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.FilterMode;
import java.util.function.Supplier;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1011;
import net.minecraft.class_1043;

@Environment(EnvType.CLIENT)
final class q2997348aa27a422480aea29cbfd800b1bbaabaab extends class_1043 {
   private q2997348aa27a422480aea29cbfd800b1bbaabaab(Supplier var1, class_1011 var2) {
      super(var1, var2);
      if (RenderSystem.getSamplerCache() != null) {
         this.field_63613 = RenderSystem.getSamplerCache().method_75294(FilterMode.LINEAR);
      }

   }
}
