package q70a83e53cc5c47b48a1443e04ba026b6.q3631a76f337940c1ab9012854eba33b0;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_11910;
import net.minecraft.class_312;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

@Environment(EnvType.CLIENT)
@Mixin({class_312.class})
public interface q832047b101f4476cb1e83cd851e08c28aabbabbba {
   @Invoker("method_1601")
   void yj$onMouseButton(long var1, class_11910 var3, int var4);
}
