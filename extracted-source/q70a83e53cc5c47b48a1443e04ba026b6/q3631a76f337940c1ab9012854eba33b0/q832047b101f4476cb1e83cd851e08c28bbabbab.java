package q70a83e53cc5c47b48a1443e04ba026b6.q3631a76f337940c1ab9012854eba33b0;

import io.netty.channel.Channel;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelPipeline;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_2535;
import net.minecraft.class_2596;
import net.minecraft.class_2598;
import net.minecraft.class_2815;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644.q2997348aa27a422480aea29cbfd800b1aaaabaabb;
import q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644.q2997348aa27a422480aea29cbfd800b1aababbbbb;
import q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644.q2997348aa27a422480aea29cbfd800b1abababaab;
import q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644.q2997348aa27a422480aea29cbfd800b1abbaaabaa;
import q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644.q2997348aa27a422480aea29cbfd800b1babbbbbb;
import q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644.q2997348aa27a422480aea29cbfd800b1bbbbbbab;

@Environment(EnvType.CLIENT)
@Mixin({class_2535.class})
public abstract class q832047b101f4476cb1e83cd851e08c28bbabbab {
   @Shadow
   @Final
   private class_2598 field_11643;
   @Unique
   private q2997348aa27a422480aea29cbfd800b1abababaab a;
   @Shadow
   private Channel field_11651;
   @Unique
   private static final String b = q2997348aa27a422480aea29cbfd800b1bbbbbbab.bbb("WwfOxO93tv+0x9zMYu0lXlH2eJc2");

   @Inject(
      method = {"channelActive"},
      at = {@At("TAIL")}
   )
   private void a(ChannelHandlerContext var1, CallbackInfo var2) {
      if (this.aab()) {
         this.ba(var1.pipeline());
      }
   }

   private void b(Channel var1, ChannelPipeline var2) {
      if (this.field_11651 == var1 && var1.isOpen()) {
         ChannelHandler var3 = var2.get(b);
         if (var3 instanceof q2997348aa27a422480aea29cbfd800b1abababaab) {
            q2997348aa27a422480aea29cbfd800b1abababaab var6 = (q2997348aa27a422480aea29cbfd800b1abababaab)var3;
            this.a = var6;
         } else if (var3 == null) {
            ChannelHandlerContext var4 = var2.context((ChannelHandler)this);
            q2997348aa27a422480aea29cbfd800b1abababaab var5 = new q2997348aa27a422480aea29cbfd800b1abababaab();
            if (var4 != null) {
               var2.addBefore(var4.name(), b, var5);
            } else {
               var2.addLast(b, var5);
            }

            this.a = var5;
         }
      }
   }

   @Inject(
      method = {"channelInactive"},
      at = {@At("HEAD")}
   )
   private void aa(ChannelHandlerContext var1, CallbackInfo var2) {
      q2997348aa27a422480aea29cbfd800b1abbaaabaa.aaab().aaa();
      if (this.a != null) {
         this.a.abbaabb();
         this.a = null;
      }

   }

   @Inject(
      method = {"method_10743"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void ab(class_2596 var1, CallbackInfo var2) {
      q2997348aa27a422480aea29cbfd800b1babbbbbb var3 = q2997348aa27a422480aea29cbfd800b1babbbbbb.aaba();
      if (this.aab()) {
         this.ba(this.field_11651.pipeline());
      }

      if (var3 != null && var3.aab() != null) {
         q2997348aa27a422480aea29cbfd800b1aababbbbb var4 = var3.aab().ababa();
         if (var4 != null && var4.ababa(var1)) {
            var2.cancel();
            return;
         }
      }

      if (var3 != null && var1 instanceof class_2815 var6) {
         q2997348aa27a422480aea29cbfd800b1aaaabaabb var5 = var3.aab().babaab();
         if (var5 != null && var5.abb(var6)) {
            var2.cancel();
            return;
         }
      }

      if (var3 != null && var3.aab() != null && var3.aab().bbbbb() != null) {
         var3.aab().bbbbb().ab(var1);
      }

      if (var3 != null && var3.aab() != null) {
         var3.aab().abbbaaa(var1);
      }

      q2997348aa27a422480aea29cbfd800b1abababaab.baabb(var1);
   }

   @Unique
   private void ba(ChannelPipeline var1) {
      q2997348aa27a422480aea29cbfd800b1abbaaabaa.aaab().bbb();
      Channel var2 = var1.channel();
      Runnable var3 = this::b;
      if (var2.eventLoop().inEventLoop()) {
         var3.run();
      } else {
         try {
            var2.eventLoop().execute(var3);
         } catch (RuntimeException var5) {
         }

      }
   }

   @Inject(
      method = {"method_53859"},
      at = {@At("RETURN")}
   )
   private void bb(ChannelPipeline var1, CallbackInfo var2) {
      if (this.aab()) {
         this.ba(var1);
      }
   }

   @Inject(
      method = {"method_10743"},
      at = {@At("TAIL")}
   )
   private void aaa(class_2596 var1, CallbackInfo var2) {
      q2997348aa27a422480aea29cbfd800b1babbbbbb var3 = q2997348aa27a422480aea29cbfd800b1babbbbbb.aaba();
      if (var3 != null && var3.aab() != null) {
         var3.aab().abaabbb(var1);
      }

   }

   @Unique
   private boolean aab() {
      return this.field_11643 == class_2598.field_11942 && this.field_11651 != null;
   }
}
