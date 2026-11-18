package q70a83e53cc5c47b48a1443e04ba026b6.q3631a76f337940c1ab9012854eba33b0;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_310;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.asm.mixin.gen.Invoker;

@Environment(EnvType.CLIENT)
@Mixin({class_310.class})
public interface q832047b101f4476cb1e83cd851e08c28abbabbbba {
   @Accessor("field_1771")
   void wq$setAttackCooldown(int var1);

   @Accessor("field_1752")
   void wq_setUseCd(int var1);

   @Accessor("field_1771")
   void wq_setAtkCd(int var1);

   @Accessor("field_1752")
   int wq_getUseCd();

   @Accessor("field_1752")
   void wq$setUseCd(int var1);

   @Accessor("field_1771")
   int wq$getAttackCooldown();

   @Invoker("method_1583")
   void wq_doItemUse();

   @Accessor("field_1771")
   void wq$setAtkCd(int var1);

   @Accessor("field_1771")
   int wq_getAtkCd();

   @Accessor("field_1752")
   int wq$getUseCd();

   @Accessor("field_1771")
   int wq$getAtkCd();

   @Accessor("field_1771")
   int wq_getAttackCooldown();

   @Invoker("method_1536")
   boolean wq_doAttack();

   @Accessor("field_1771")
   void wq_setAttackCooldown(int var1);
}
