package q70a83e53cc5c47b48a1443e04ba026b6.q3631a76f337940c1ab9012854eba33b0;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_304;
import net.minecraft.class_3675;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Environment(EnvType.CLIENT)
@Mixin({class_304.class})
public interface q832047b101f4476cb1e83cd851e08c28bbbbbbba {
   @Accessor("field_1661")
   void yj$setTimesPressed(int var1);

   @Accessor("field_1661")
   int yj$getTimesPressed();

   @Accessor("field_1655")
   class_3675.class_306 yj$getBoundKey();
}
