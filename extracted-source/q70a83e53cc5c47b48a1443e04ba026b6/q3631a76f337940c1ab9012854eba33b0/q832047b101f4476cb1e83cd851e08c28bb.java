package q70a83e53cc5c47b48a1443e04ba026b6.q3631a76f337940c1ab9012854eba33b0;

import com.mojang.blaze3d.buffers.GpuBufferSlice;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_310;
import net.minecraft.class_4184;
import net.minecraft.class_761;
import net.minecraft.class_9779;
import net.minecraft.class_9922;
import org.joml.Matrix4f;
import org.joml.Vector4f;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644.q2997348aa27a422480aea29cbfd800b1aabbbbbaa;

@Environment(EnvType.CLIENT)
@Mixin({class_761.class})
public abstract class q832047b101f4476cb1e83cd851e08c28bb {
   @Inject(
      method = {"method_22710"},
      at = {@At("HEAD")},
      require = 0
   )
   private void a(class_9922 var1, class_9779 var2, boolean var3, class_4184 var4, Matrix4f var5, Matrix4f var6, Matrix4f var7, GpuBufferSlice var8, Vector4f var9, boolean var10, CallbackInfo var11) {
      q2997348aa27a422480aea29cbfd800b1aabbbbbaa.a(var4, class_310.method_1551().field_1773, var5, var6);
   }
}
