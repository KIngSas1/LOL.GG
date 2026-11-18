package q70a83e53cc5c47b48a1443e04ba026b6.q3631a76f337940c1ab9012854eba33b0;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1268;
import net.minecraft.class_1269;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_310;
import net.minecraft.class_3965;
import net.minecraft.class_636;
import net.minecraft.class_746;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644.q2997348aa27a422480aea29cbfd800b1aaaabaaa;
import q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644.q2997348aa27a422480aea29cbfd800b1aaababaaa;
import q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644.q2997348aa27a422480aea29cbfd800b1aaabbbaba;
import q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644.q2997348aa27a422480aea29cbfd800b1aaabbbba;
import q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644.q2997348aa27a422480aea29cbfd800b1aababbbbb;
import q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644.q2997348aa27a422480aea29cbfd800b1abbaaaba;
import q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644.q2997348aa27a422480aea29cbfd800b1baabaaaa;
import q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644.q2997348aa27a422480aea29cbfd800b1babbbbbb;
import q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644.q2997348aa27a422480aea29cbfd800b1bbababba;
import q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644.q2997348aa27a422480aea29cbfd800b1bbbabbb;
import q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644.q2997348aa27a422480aea29cbfd800b1bbbba;

@Environment(EnvType.CLIENT)
@Mixin({class_636.class})
public abstract class q832047b101f4476cb1e83cd851e08c28aaababab {
   @Unique
   private int a;

   @Unique
   private void a() {
      if (this.a > 0) {
         --this.a;
         q2997348aa27a422480aea29cbfd800b1abbaaaba.bbababa();
      }

   }

   @Inject(
      method = {"method_2911"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void b(CallbackInfo var1) {
      if (q2997348aa27a422480aea29cbfd800b1abbaaaba.aabbbab()) {
         var1.cancel();
      }

   }

   @Inject(
      method = {"method_2910"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void aa(class_2338 var1, class_2350 var2, CallbackInfoReturnable var3) {
      q2997348aa27a422480aea29cbfd800b1babbbbbb var4 = q2997348aa27a422480aea29cbfd800b1babbbbbb.aaba();
      if (var4 != null) {
         q2997348aa27a422480aea29cbfd800b1aaaabaaa var5 = (q2997348aa27a422480aea29cbfd800b1aaaabaaa)var4.aab().abbaaba(q2997348aa27a422480aea29cbfd800b1aaaabaaa.class);
         boolean var6 = var5 != null && var5.babb(class_310.method_1551(), var1, var2);
         q2997348aa27a422480aea29cbfd800b1aababbbbb var7 = var4.aab().ababa();
         if (var7 != null && var7.abb(class_310.method_1551())) {
            var3.setReturnValue(false);
         } else if (var6) {
            var3.setReturnValue(false);
         } else {
            q2997348aa27a422480aea29cbfd800b1aaabbbba var8 = var4.aab().bab();
            if (var8 != null) {
               if (var8.abaaa(var1, var2)) {
                  var3.setReturnValue(true);
               }

            }
         }
      }
   }

   @Inject(
      method = {"method_2919"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void ab(class_1657 var1, class_1268 var2, CallbackInfoReturnable var3) {
      if (q2997348aa27a422480aea29cbfd800b1abbaaaba.abbbbbb()) {
         ++this.a;
      }

      q2997348aa27a422480aea29cbfd800b1babbbbbb var4 = q2997348aa27a422480aea29cbfd800b1babbbbbb.aaba();
      if (var4 != null) {
         q2997348aa27a422480aea29cbfd800b1aababbbbb var5 = var4.aab().ababa();
         if (var5 != null && var5.abb(class_310.method_1551())) {
            this.a();
            var3.setReturnValue(class_1269.field_5814);
         }

      }
   }

   @Inject(
      method = {"method_2919"},
      at = {@At("RETURN")}
   )
   private void ba(class_1657 var1, class_1268 var2, CallbackInfoReturnable var3) {
      this.a();
      q2997348aa27a422480aea29cbfd800b1babbbbbb var4 = q2997348aa27a422480aea29cbfd800b1babbbbbb.aaba();
      if (var4 != null) {
         q2997348aa27a422480aea29cbfd800b1bbababba var5 = var4.aab().baa();
         if (var5 != null) {
            var5.bba(class_310.method_1551(), var2, (class_1269)var3.getReturnValue());
         }

      }
   }

   @Inject(
      method = {"method_2918"},
      at = {@At("HEAD")}
   )
   private void bb(class_1657 var1, class_1297 var2, CallbackInfo var3) {
      if (q2997348aa27a422480aea29cbfd800b1abbaaaba.abbbbbb()) {
         ++this.a;
      }

   }

   @Inject(
      method = {"method_2896"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void aaa(class_746 var1, class_1268 var2, class_3965 var3, CallbackInfoReturnable var4) {
      if (q2997348aa27a422480aea29cbfd800b1abbaaaba.abbbbbb()) {
         ++this.a;
      }

      q2997348aa27a422480aea29cbfd800b1babbbbbb var5 = q2997348aa27a422480aea29cbfd800b1babbbbbb.aaba();
      if (var5 != null) {
         q2997348aa27a422480aea29cbfd800b1aababbbbb var6 = var5.aab().ababa();
         if (var6 != null && var6.abb(class_310.method_1551())) {
            this.a();
            var4.setReturnValue(class_1269.field_5814);
         } else {
            q2997348aa27a422480aea29cbfd800b1baabaaaa var7 = (q2997348aa27a422480aea29cbfd800b1baabaaaa)var5.aab().abbaaba(q2997348aa27a422480aea29cbfd800b1baabaaaa.class);
            if (var7 != null && var7.aab(class_310.method_1551(), var3)) {
               this.a();
               var4.setReturnValue(class_1269.field_5814);
            } else {
               q2997348aa27a422480aea29cbfd800b1bbbabbb var8 = var5.aab().baab();
               if (var8 != null) {
                  var8.bbaa(class_310.method_1551(), var2, var3);
               }

               q2997348aa27a422480aea29cbfd800b1aaababaaa var9 = var5.aab().ab();
               if (var9 != null) {
                  var9.abb(class_310.method_1551(), var2, var3);
               }

               q2997348aa27a422480aea29cbfd800b1aaabbbaba var10 = var5.aab().babbb();
               if (var10 != null) {
                  var10.aabbab(class_310.method_1551(), var2, var3);
               }

               q2997348aa27a422480aea29cbfd800b1bbbba var11 = var5.aab().aaabab();
               if (var11 != null && !var11.baab()) {
                  var11.bbaa(class_310.method_1551(), var2, var3);
               }

               q2997348aa27a422480aea29cbfd800b1bbababba var12 = var5.aab().baa();
               if (var12 != null) {
                  var12.aabb(class_310.method_1551(), var2, var3);
               }

               q2997348aa27a422480aea29cbfd800b1aaabbbba var13 = var5.aab().bab();
               if (var13 != null && var13.bbaabbb()) {
                  if (var13.baa(class_310.method_1551())) {
                     this.a();
                     var4.setReturnValue(class_1269.field_5814);
                  }

               }
            }
         }
      }
   }

   @Inject(
      method = {"method_2896"},
      at = {@At("RETURN")}
   )
   private void aab(class_746 var1, class_1268 var2, class_3965 var3, CallbackInfoReturnable var4) {
      this.a();
      q2997348aa27a422480aea29cbfd800b1babbbbbb var5 = q2997348aa27a422480aea29cbfd800b1babbbbbb.aaba();
      if (var5 != null) {
         q2997348aa27a422480aea29cbfd800b1aaababaaa var6 = var5.aab().ab();
         if (var6 != null) {
            var6.bbbab(class_310.method_1551(), var2, var3, (class_1269)var4.getReturnValue());
         }

         q2997348aa27a422480aea29cbfd800b1bbbabbb var7 = var5.aab().baab();
         if (var7 != null) {
            var7.babb(class_310.method_1551(), var2, var3, (class_1269)var4.getReturnValue());
         }

         q2997348aa27a422480aea29cbfd800b1bbababba var8 = var5.aab().baa();
         if (var8 != null) {
            var8.aaaa(class_310.method_1551(), var2, var3, (class_1269)var4.getReturnValue());
         }

         q2997348aa27a422480aea29cbfd800b1aaabbbaba var9 = var5.aab().babbb();
         if (var9 != null) {
            var9.babbab(class_310.method_1551(), var2, var3, (class_1269)var4.getReturnValue());
         }

         q2997348aa27a422480aea29cbfd800b1bbbba var10 = var5.aab().aaabab();
         if (var10 != null) {
            var10.bba(class_310.method_1551(), var2, var3, (class_1269)var4.getReturnValue());
         }

      }
   }

   @Inject(
      method = {"method_2918"},
      at = {@At("RETURN")}
   )
   private void aba(class_1657 var1, class_1297 var2, CallbackInfo var3) {
      this.a();
   }
}
