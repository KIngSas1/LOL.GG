package q70a83e53cc5c47b48a1443e04ba026b6.q3631a76f337940c1ab9012854eba33b0;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_239;
import net.minecraft.class_304;
import net.minecraft.class_310;
import net.minecraft.class_3966;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644.q2997348aa27a422480aea29cbfd800b1aaababbaa;
import q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644.q2997348aa27a422480aea29cbfd800b1aaabbbbaa;
import q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644.q2997348aa27a422480aea29cbfd800b1abaaabbaa;
import q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644.q2997348aa27a422480aea29cbfd800b1ababab;
import q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644.q2997348aa27a422480aea29cbfd800b1abababaab;
import q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644.q2997348aa27a422480aea29cbfd800b1abbaaaba;
import q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644.q2997348aa27a422480aea29cbfd800b1abbbaab;
import q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644.q2997348aa27a422480aea29cbfd800b1baababab;
import q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644.q2997348aa27a422480aea29cbfd800b1babaabaa;
import q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644.q2997348aa27a422480aea29cbfd800b1babbbbbb;
import q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644.q2997348aa27a422480aea29cbfd800b1bbabbbb;
import q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644.q2997348aa27a422480aea29cbfd800b1bbb;

@Environment(EnvType.CLIENT)
@Mixin({class_310.class})
public abstract class q832047b101f4476cb1e83cd851e08c28ababaab {
   @Unique
   private class_239 a;
   @Unique
   private boolean b;

   @Inject(
      method = {"method_1508"},
      at = {@At("HEAD")}
   )
   private void a(CallbackInfo var1) {
      if (!q2997348aa27a422480aea29cbfd800b1abbbaab.ab()) {
         q2997348aa27a422480aea29cbfd800b1babbbbbb var2 = q2997348aa27a422480aea29cbfd800b1babbbbbb.aaba();
         if (var2 != null) {
            class_310 var3 = class_310.method_1551();
            q2997348aa27a422480aea29cbfd800b1bbabbbb var4 = var2.aab().aaabba();
            if (var4 != null) {
               var4.abbba(var3);
            }

            if (var2.aab().ababbba() != null && var2.aab().ababbba().bbaabbb() && var3 != null && var3.field_1690 != null) {
               class_304 var5 = var3.field_1690.field_1824;
               if (var5 != null) {
                  q2997348aa27a422480aea29cbfd800b1abbaaaba.abbaba(var5);
                  var5.method_23481(false);
               }
            }

            if (var3 != null && var3.field_1690 != null) {
               q2997348aa27a422480aea29cbfd800b1abbaaaba.babaaab(var3);
               q2997348aa27a422480aea29cbfd800b1baababab var6 = var2.aab().abbbab();
               if (var6 != null) {
                  var6.babbaab(var3);
               }

               if (q2997348aa27a422480aea29cbfd800b1abbaaaba.abababa(var3)) {
                  if (var6 != null) {
                     var6.abbaaba(var3);
                     var6.babaab(var3);
                  }

                  q2997348aa27a422480aea29cbfd800b1bbb.aaabbab(var3);
               }

               if (!q2997348aa27a422480aea29cbfd800b1abbaaaba.abaaaab() && (q2997348aa27a422480aea29cbfd800b1ababab.bba(var3) || q2997348aa27a422480aea29cbfd800b1abbaaaba.abbaaba() || q2997348aa27a422480aea29cbfd800b1bbb.a())) {
                  if (var3.field_1690.field_1886 != null) {
                     q2997348aa27a422480aea29cbfd800b1abbaaaba.abbaba(var3.field_1690.field_1886);
                     var3.field_1690.field_1886.method_23481(false);
                  }

                  if (var3.field_1690.field_1904 != null) {
                     q2997348aa27a422480aea29cbfd800b1abbaaaba.abbaba(var3.field_1690.field_1904);
                     var3.field_1690.field_1904.method_23481(false);
                  }
               }
            }

            if (var2.aab() != null) {
               var2.aab().ababba(var3);
               var2.aab().aaaabb(var3);
            }

            var2.aab().abbaaaa(class_310.method_1551());
            if (var4 != null) {
               var4.abbba(var3);
            }

            if (var3 != null && var3.field_1690 != null) {
               if (q2997348aa27a422480aea29cbfd800b1abbaaaba.abababa(var3)) {
                  q2997348aa27a422480aea29cbfd800b1bbb.aaabbab(var3);
               }

               if (q2997348aa27a422480aea29cbfd800b1abbaaaba.aaaabaab(var3)) {
                  if (var3.field_1690.field_1886 != null) {
                     q2997348aa27a422480aea29cbfd800b1abbaaaba.abbaba(var3.field_1690.field_1886);
                     var3.field_1690.field_1886.method_23481(false);
                  }

                  if (var3.field_1690.field_1904 != null) {
                     q2997348aa27a422480aea29cbfd800b1abbaaaba.abbaba(var3.field_1690.field_1904);
                     var3.field_1690.field_1904.method_23481(false);
                  }
               } else if (var3.field_1755 == null && !q2997348aa27a422480aea29cbfd800b1ababab.bba(var3) && !q2997348aa27a422480aea29cbfd800b1abbaaaba.abbaaba() && !q2997348aa27a422480aea29cbfd800b1bbb.a()) {
                  if (var3.field_1690.field_1886 != null && !var3.field_1690.field_1886.method_1434() && q2997348aa27a422480aea29cbfd800b1abbaaaba.baaaabb(var3, var3.field_1690.field_1886)) {
                     var3.field_1690.field_1886.method_23481(true);
                  }

                  if (var3.field_1690.field_1904 != null && !var3.field_1690.field_1904.method_1434() && q2997348aa27a422480aea29cbfd800b1abbaaaba.baaaabb(var3, var3.field_1690.field_1904)) {
                     var3.field_1690.field_1904.method_23481(true);
                  }
               }
            }

            q2997348aa27a422480aea29cbfd800b1abbaaaba.baaa(var3);
            q2997348aa27a422480aea29cbfd800b1bbabbbb.bbaa(true);
         }
      }
   }

   @Inject(
      method = {"method_1583"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void b(CallbackInfo var1) {
      if (!q2997348aa27a422480aea29cbfd800b1abbbaab.ab()) {
         class_310 var2 = class_310.method_1551();
         boolean var3 = q2997348aa27a422480aea29cbfd800b1abbaaaba.bbaaaaa(var2);
         if (q2997348aa27a422480aea29cbfd800b1abbaaaba.abaaaab() || !q2997348aa27a422480aea29cbfd800b1ababab.bba(var2) && !q2997348aa27a422480aea29cbfd800b1abbaaaba.abbaaba() && !q2997348aa27a422480aea29cbfd800b1bbb.a()) {
            q2997348aa27a422480aea29cbfd800b1babbbbbb var4 = q2997348aa27a422480aea29cbfd800b1babbbbbb.aaba();
            if (var4 != null && var4.aab() != null && var4.aab().aabaa(var2)) {
               var1.cancel();
            } else if (q2997348aa27a422480aea29cbfd800b1abbaaaba.aaaabaab(var2)) {
               var1.cancel();
            } else {
               if (var3) {
                  var1.cancel();
               }

            }
         } else {
            var1.cancel();
         }
      }
   }

   @Unique
   private void aa(class_310 var1) {
      if (this.b) {
         if (var1 != null) {
            var1.field_1765 = this.a;
         }

         this.a = null;
         this.b = false;
      }
   }

   @Inject(
      method = {"method_1536"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void ab(CallbackInfoReturnable var1) {
      if (!q2997348aa27a422480aea29cbfd800b1abbbaab.ab()) {
         class_310 var2 = class_310.method_1551();
         if (var2 != null) {
            this.aa(var2);
            q2997348aa27a422480aea29cbfd800b1babbbbbb var3 = q2997348aa27a422480aea29cbfd800b1babbbbbb.aaba();
            if (q2997348aa27a422480aea29cbfd800b1abbaaaba.abaabaa() || q2997348aa27a422480aea29cbfd800b1abbaaaba.abaaaab() || !q2997348aa27a422480aea29cbfd800b1ababab.bba(var2) && !q2997348aa27a422480aea29cbfd800b1abbaaaba.abbaaba() && !q2997348aa27a422480aea29cbfd800b1bbb.a()) {
               if (!q2997348aa27a422480aea29cbfd800b1abbaaaba.abaabaa() && q2997348aa27a422480aea29cbfd800b1abbaaaba.aaaabaab(var2)) {
                  var1.setReturnValue(false);
               } else if (var3 != null && var3.aab() != null) {
                  class_3966 var4 = this.aab(var2, var3);
                  if (var4 != null) {
                     this.a = var2.field_1765;
                     this.b = true;
                     var2.field_1765 = var4;
                  }

                  class_239 var6 = var2.field_1765;
                  if (var6 instanceof class_3966) {
                     class_3966 var5 = (class_3966)var6;
                     if (q2997348aa27a422480aea29cbfd800b1abbaaaba.abbabab(var2, var5.method_17782())) {
                        q2997348aa27a422480aea29cbfd800b1abbaaaba.baaaaa(var2);
                        var1.setReturnValue(false);
                        return;
                     }
                  }

                  if (!q2997348aa27a422480aea29cbfd800b1abbaaaba.abaabaa()) {
                     q2997348aa27a422480aea29cbfd800b1abaaabbaa var7 = var3.aab().aababb();
                     if (var7 != null && var7.aa(var2)) {
                        var1.setReturnValue(false);
                        return;
                     }

                     q2997348aa27a422480aea29cbfd800b1aaababbaa var8 = var3.aab().aaaab();
                     if (var8 != null && var8.bbaa(var2)) {
                        var1.setReturnValue(false);
                        return;
                     }
                  }

               }
            } else {
               var1.setReturnValue(false);
            }
         }
      }
   }

   @Inject(
      method = {"method_1583"},
      at = {@At("RETURN")}
   )
   private void ba(CallbackInfo var1) {
      if (!q2997348aa27a422480aea29cbfd800b1abbbaab.ab()) {
         q2997348aa27a422480aea29cbfd800b1babbbbbb var2 = q2997348aa27a422480aea29cbfd800b1babbbbbb.aaba();
         if (var2 != null && var2.aab() != null) {
            q2997348aa27a422480aea29cbfd800b1aaabbbbaa var3 = (q2997348aa27a422480aea29cbfd800b1aaabbbbaa)var2.aab().abbaaba(q2997348aa27a422480aea29cbfd800b1aaabbbbaa.class);
            if (var3 != null) {
               var3.abb(class_310.method_1551());
            }

         }
      }
   }

   @Inject(
      method = {"method_1523"},
      at = {@At("TAIL")}
   )
   private void bb(CallbackInfo var1) {
      if (!q2997348aa27a422480aea29cbfd800b1abbbaab.ab()) {
         q2997348aa27a422480aea29cbfd800b1bbabbbb.baaaa();
      }
   }

   @Inject(
      method = {"method_1536"},
      at = {@At("RETURN")}
   )
   private void aaa(CallbackInfoReturnable var1) {
      class_310 var2 = class_310.method_1551();
      this.aa(var2);
   }

   @Unique
   private class_3966 aab(class_310 var1, q2997348aa27a422480aea29cbfd800b1babbbbbb var2) {
      if (var1 != null && var1.field_1724 != null && var1.field_1687 != null && var2 != null && var2.aab() != null) {
         class_239 var4 = var1.field_1765;
         if (var4 instanceof class_3966) {
            class_3966 var3 = (class_3966)var4;
            if (var3.method_17782() instanceof class_1309) {
               return null;
            }
         }

         class_3966 var6 = q2997348aa27a422480aea29cbfd800b1abbaaaba.baab(var1, (double)3.0F);
         if (var6 != null) {
            class_1297 var5 = var6.method_17782();
            if (var5 instanceof class_1309) {
               class_1309 var7 = (class_1309)var5;
               if (!q2997348aa27a422480aea29cbfd800b1babaabaa.a(var7)) {
                  Object var8 = var1.method_1560() != null ? var1.method_1560() : var1.field_1724;
                  if (q2997348aa27a422480aea29cbfd800b1abbaaaba.aaaaaaab(var1.field_1765, ((class_1297)var8).method_5836(1.0F), var6.method_17784())) {
                     return null;
                  }

                  return var6;
               }
            }
         }

         return null;
      } else {
         return null;
      }
   }

   @Inject(
      method = {"method_1508"},
      at = {@At("TAIL")}
   )
   private void aba(CallbackInfo var1) {
      q2997348aa27a422480aea29cbfd800b1bbabbbb.bbaa(false);
      q2997348aa27a422480aea29cbfd800b1abbaaaba.abaabba();
      if (!q2997348aa27a422480aea29cbfd800b1abbbaab.ab()) {
         q2997348aa27a422480aea29cbfd800b1babbbbbb var2 = q2997348aa27a422480aea29cbfd800b1babbbbbb.aaba();
         if (var2 != null) {
            var2.aab().bbba(class_310.method_1551());
            q2997348aa27a422480aea29cbfd800b1bbabbbb.b(class_310.method_1551());
         }
      }
   }

   @Inject(
      method = {"method_1574"},
      at = {@At("HEAD")},
      order = 900
   )
   private void abb(CallbackInfo var1) {
      if (!q2997348aa27a422480aea29cbfd800b1abbbaab.ab()) {
         q2997348aa27a422480aea29cbfd800b1abababaab.abbbab();
         q2997348aa27a422480aea29cbfd800b1bbabbbb.ba(class_310.method_1551());
      }
   }

   @Inject(
      method = {"method_1490"},
      at = {@At("HEAD")}
   )
   private void baa(CallbackInfo var1) {
      if (!q2997348aa27a422480aea29cbfd800b1abbbaab.ab()) {
         q2997348aa27a422480aea29cbfd800b1babbbbbb var2 = q2997348aa27a422480aea29cbfd800b1babbbbbb.aaba();
         if (var2 != null) {
            var2.aaaba();
         }

      }
   }
}
