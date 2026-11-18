package q70a83e53cc5c47b48a1443e04ba026b6.q3631a76f337940c1ab9012854eba33b0;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_11659;
import net.minecraft.class_12152;
import net.minecraft.class_1268;
import net.minecraft.class_1306;
import net.minecraft.class_1799;
import net.minecraft.class_310;
import net.minecraft.class_3532;
import net.minecraft.class_4587;
import net.minecraft.class_742;
import net.minecraft.class_746;
import net.minecraft.class_759;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.gen.Invoker;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644.q2997348aa27a422480aea29cbfd800b1abaabaabb;
import q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644.q2997348aa27a422480aea29cbfd800b1abbaaaba;
import q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644.q2997348aa27a422480aea29cbfd800b1bbb;
import q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644.q2997348aa27a422480aea29cbfd800b1bbbaaab;

@Environment(EnvType.CLIENT)
@Mixin({class_759.class})
public abstract class q832047b101f4476cb1e83cd851e08c28abbaabaa {
   @Unique
   private float a;
   @Shadow
   private float field_4052;
   @Unique
   private float b;
   @Shadow
   private class_1799 field_4047;
   @Shadow
   private float field_4043;
   @Shadow
   private class_1799 field_4048;
   @Unique
   private boolean aa;

   @Inject(
      method = {"method_3228"},
      at = {@At(
   value = "INVOKE",
   target = "Lnet/minecraft/class_759;method_3233(Lnet/minecraft/class_1309;Lnet/minecraft/class_1799;Lnet/minecraft/class_811;Lnet/minecraft/class_4587;Lnet/minecraft/class_11659;I)V"
)},
      require = 1
   )
   private void a(class_742 var1, float var2, float var3, class_1268 var4, float var5, class_1799 var6, float var7, class_4587 var8, class_11659 var9, int var10, CallbackInfo var11) {
      q2997348aa27a422480aea29cbfd800b1bbbaaab.abb(var1, var4, var6, var2, var5, var8);
   }

   @Unique
   private float b(float var1, float var2, float var3) {
      if (var3 <= 0.0F) {
         return var2;
      } else {
         float var4 = class_3532.method_15363(1.0F - var3 * 0.82F, 0.16F, 1.0F);
         return var1 + (var2 - var1) * var4;
      }
   }

   @Redirect(
      method = {"method_3228"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/class_12152;method_75391(FLnet/minecraft/class_4587;ILnet/minecraft/class_1306;)V"
),
      require = 1
   )
   private void aa(float var1, class_4587 var2, int var3, class_1306 var4, class_742 var5, float var6, float var7, class_1268 var8, float var9, class_1799 var10, float var11, class_4587 var12, class_11659 var13, int var14) {
      if (!q2997348aa27a422480aea29cbfd800b1bbbaaab.ab(var8)) {
         class_12152.method_75391(var1, var2, var3, var4);
      }

   }

   @Redirect(
      method = {"method_3228"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/class_759;method_65816(FLnet/minecraft/class_4587;ILnet/minecraft/class_1306;)V"
),
      require = 1
   )
   private void ab(class_759 var1, float var2, class_4587 var3, int var4, class_1306 var5, class_742 var6, float var7, float var8, class_1268 var9, float var10, class_1799 var11, float var12, class_4587 var13, class_11659 var14, int var15) {
      if (!q2997348aa27a422480aea29cbfd800b1bbbaaab.ab(var9)) {
         this.yj$invokeSwingArm(var2, var3, var4, var5);
      }

   }

   @Invoker("method_65816")
   protected abstract void yj$invokeSwingArm(float var1, class_4587 var2, int var3, class_1306 var4);

   @Unique
   private void ba() {
      this.aa = true;
      this.b = this.field_4043;
      this.a = this.field_4052;
   }

   @Redirect(
      method = {"method_22976(FLnet/minecraft/class_4587;Lnet/minecraft/class_11659;Lnet/minecraft/class_746;I)V"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/class_746;method_5695(F)F"
),
      require = 1
   )
   private float bb(class_746 var1, float var2) {
      float var3 = class_3532.method_16439(var2, var1.field_3914, var1.field_3916);
      return var3 + class_3532.method_15363(q2997348aa27a422480aea29cbfd800b1bbb.abababa(var1, var2) - var3, -30.0F, 30.0F);
   }

   @Redirect(
      method = {"method_22976(FLnet/minecraft/class_4587;Lnet/minecraft/class_11659;Lnet/minecraft/class_746;I)V"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/class_746;method_61414(F)F"
),
      require = 1
   )
   private float aaa(class_746 var1, float var2) {
      return q2997348aa27a422480aea29cbfd800b1bbb.abababa(var1, var2);
   }

   @Inject(
      method = {"method_3220"},
      at = {@At("TAIL")},
      require = 0
   )
   private void aab(CallbackInfo var1) {
      q2997348aa27a422480aea29cbfd800b1abaabaabb var2 = q2997348aa27a422480aea29cbfd800b1bbbaaab.bb();
      if (var2 != null && var2.bbaabbb()) {
         if (!this.aa) {
            this.ba();
         } else {
            this.b = this.b(this.b, this.field_4043, var2.baaa(class_1268.field_5808));
            this.a = this.b(this.a, this.field_4052, var2.baaa(class_1268.field_5810));
            class_310 var3 = class_310.method_1551();
            if (var2.ab(class_1268.field_5808)) {
               this.b = 1.0F;
               if (var3 != null && var3.field_1724 != null) {
                  this.field_4047 = q2997348aa27a422480aea29cbfd800b1abbaaaba.aaaababa(var3.field_1724);
               }
            }

            if (var2.ab(class_1268.field_5810)) {
               this.a = 1.0F;
               if (var3 != null && var3.field_1724 != null) {
                  this.field_4048 = var3.field_1724.method_6079();
               }
            }

            this.field_4043 = this.b;
            this.field_4052 = this.a;
         }
      } else {
         this.ba();
      }
   }

   @Redirect(
      method = {"method_22976(FLnet/minecraft/class_4587;Lnet/minecraft/class_11659;Lnet/minecraft/class_746;I)V"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/class_746;method_5705(F)F"
),
      require = 1
   )
   private float aba(class_746 var1, float var2) {
      float var3 = class_3532.method_16439(var2, var1.field_3931, var1.field_3932);
      return var3 + class_3532.method_15363(class_3532.method_15393(q2997348aa27a422480aea29cbfd800b1bbb.abaabab(var1, var2) - var3), -30.0F, 30.0F);
   }

   @Inject(
      method = {"method_3228"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void abb(class_742 var1, float var2, float var3, class_1268 var4, float var5, class_1799 var6, float var7, class_4587 var8, class_11659 var9, int var10, CallbackInfo var11) {
      if (!q2997348aa27a422480aea29cbfd800b1bbbaaab.ba(var1, var4)) {
         var11.cancel();
      }

   }
}
