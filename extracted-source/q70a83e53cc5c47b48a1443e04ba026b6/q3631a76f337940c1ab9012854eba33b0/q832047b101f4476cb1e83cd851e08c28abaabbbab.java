package q70a83e53cc5c47b48a1443e04ba026b6.q3631a76f337940c1ab9012854eba33b0;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_6396;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import oshi.SystemInfo;
import q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644.q2997348aa27a422480aea29cbfd800b1bbbbbbab;

@Environment(EnvType.CLIENT)
@Mixin({class_6396.class})
public abstract class q832047b101f4476cb1e83cd851e08c28abaabbbab {
   @Inject(
      method = {"method_37128"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void a(SystemInfo var1, CallbackInfo var2) {
      String var3 = System.getProperty(q2997348aa27a422480aea29cbfd800b1bbbbbbab.bbb("DVEzLoZbUaUm"), "").toLowerCase();
      if (var3.contains(q2997348aa27a422480aea29cbfd800b1bbbbbbab.bbb("RBhRn28="))) {
         this.method_37122(q2997348aa27a422480aea29cbfd800b1bbbbbbab.bbb("DFDhehE23wfWp1AshGVFAxlb"), q2997348aa27a422480aea29cbfd800b1bbbbbbab.bbb("dChhOViyhboMCCtoR1r2xgDKEOCYdkEzUFtmJgeabQXICMSy3W0="));
         this.method_37122(q2997348aa27a422480aea29cbfd800b1bbbbbbab.bbb("yZW/9PfNNoGUYWeQqIyO2Q=="), q2997348aa27a422480aea29cbfd800b1bbbbbbab.bbb("dChhOViyhboMCCtoR1r2xgDKEOCYdkEzUFtmJgeabQXICMSy3W0="));
         this.method_37122(q2997348aa27a422480aea29cbfd800b1bbbbbbab.bbb("I3847BCMs511ja8g"), q2997348aa27a422480aea29cbfd800b1bbbbbbab.bbb("dChhOViyhboMCCtoR1r2xgDKEOCYdkEzUFtmJgeabQXICMSy3W0="));
         this.method_37122(q2997348aa27a422480aea29cbfd800b1bbbbbbab.bbb("Mm7Hx1flciqY+Qa/b2HED3jTzw=="), q2997348aa27a422480aea29cbfd800b1bbbbbbab.bbb("dChhOViyhboMCCtoR1r2xgDKEOCYdkEzUFtmJgeabQXICMSy3W0="));
         this.method_37122(q2997348aa27a422480aea29cbfd800b1bbbbbbab.bbb("KnYNkxhS3WYG5EACH5En3jU="), q2997348aa27a422480aea29cbfd800b1bbbbbbab.bbb("dChhOViyhboMCCtoR1r2xgDKEOCYdkEzUFtmJgeabQXICMSy3W0="));
         this.method_37122(q2997348aa27a422480aea29cbfd800b1bbbbbbab.bbb("EEy4Ud2e5bbOndHiXrvhOSeul0iQjOGnhZPQp10="), q2997348aa27a422480aea29cbfd800b1bbbbbbab.bbb("dChhOViyhboMCCtoR1r2xgDKEOCYdkEzUFtmJgeabQXICMSy3W0="));
         this.method_37122(q2997348aa27a422480aea29cbfd800b1bbbbbbab.bbb("5rrKn8cvIoetfWZm3lBQu253hSZqrncAXg=="), q2997348aa27a422480aea29cbfd800b1bbbbbbab.bbb("dChhOViyhboMCCtoR1r2xgDKEOCYdkEzUFtmJgeabQXICMSy3W0="));
         this.method_37122(q2997348aa27a422480aea29cbfd800b1bbbbbbab.bbb("dCh6IlSmgaFABi8kThW5xwLZGLe6VHFg"), q2997348aa27a422480aea29cbfd800b1bbbbbbab.bbb("dChhOViyhboMCCtoR1r2xgDKEOCYdkEzUFtmJgeabQXICMSy3W0="));
         var2.cancel();
      }
   }

   @Shadow
   public abstract void method_37122(String var1, String var2);
}
