package q70a83e53cc5c47b48a1443e04ba026b6.q3631a76f337940c1ab9012854eba33b0;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_746;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Environment(EnvType.CLIENT)
@Mixin({class_746.class})
public interface q832047b101f4476cb1e83cd851e08c28baabbbb {
   @Accessor("field_3924")
   double yj$getLastZClient();

   @Accessor("field_3941")
   void yj$setLastYawClient(float var1);

   @Accessor("field_3923")
   int yj$getTicksSinceLastPositionPacketSent();

   @Accessor("field_3940")
   double yj$getLastYClient();

   @Accessor("field_3924")
   void yj$setLastZClient(double var1);

   @Accessor("field_3919")
   void yj$setLastSprinting(boolean var1);

   @Accessor("field_3925")
   void yj$setLastPitchClient(float var1);

   @Accessor("field_3919")
   boolean yj$getLastSprinting();

   @Accessor("field_3926")
   void yj$setLastXClient(double var1);

   @Accessor("field_3940")
   void yj$setLastYClient(double var1);

   @Accessor("field_3941")
   float yj$getLastYawClient();

   @Accessor("field_3926")
   double yj$getLastXClient();

   @Accessor("field_3923")
   void yj$setTicksSinceLastPositionPacketSent(int var1);

   @Accessor("field_3925")
   float yj$getLastPitchClient();
}
