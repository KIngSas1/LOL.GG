package q70a83e53cc5c47b48a1443e04ba026b6.q3631a76f337940c1ab9012854eba33b0;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1799;
import net.minecraft.class_636;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.asm.mixin.gen.Invoker;

@Environment(EnvType.CLIENT)
@Mixin({class_636.class})
public interface q832047b101f4476cb1e83cd851e08c28ababbabbb {
   @Accessor("field_3721")
   void wq_setLastSelectedSlot(int var1);

   @Invoker("method_2911")
   void wq_invokeSyncSelectedSlot();

   @Accessor("field_3717")
   boolean wq_isBreakingBlock();

   @Accessor("field_3718")
   class_1799 wq_getSelectedStack();

   @Accessor("field_3716")
   void wq_setBbCooldown(int var1);

   @Accessor("field_3716")
   int wq_getBbCooldown();

   @Accessor("field_3721")
   int wq_getLastSelectedSlot();

   @Accessor("field_3718")
   void wq_setSelectedStack(class_1799 var1);
}
