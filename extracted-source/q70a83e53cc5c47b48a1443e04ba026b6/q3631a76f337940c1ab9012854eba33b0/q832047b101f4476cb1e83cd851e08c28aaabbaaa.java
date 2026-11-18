package q70a83e53cc5c47b48a1443e04ba026b6.q3631a76f337940c1ab9012854eba33b0;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1309;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Environment(EnvType.CLIENT)
@Mixin({class_1309.class})
public interface q832047b101f4476cb1e83cd851e08c28aaabbaaa {
   @Accessor("field_6252")
   boolean yj$isHandSwinging();

   @Accessor("field_6279")
   void yj$setHandSwingTicks(int var1);

   @Accessor("field_6279")
   int yj$getHandSwingTicks();

   @Accessor("field_6252")
   void yj$setHandSwinging(boolean var1);
}
