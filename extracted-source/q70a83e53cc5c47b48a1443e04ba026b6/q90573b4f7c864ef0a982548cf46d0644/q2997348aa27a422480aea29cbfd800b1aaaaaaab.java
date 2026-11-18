package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1309;
import net.minecraft.class_243;

@Environment(EnvType.CLIENT)
record q2997348aa27a422480aea29cbfd800b1aaaaaaab(class_1309 cO, class_243 cP, double cQ) {
   private final class_243 a;
   private final double b;
   private final class_1309 aa;

   public class_243 a() {
      return this.a;
   }

   private q2997348aa27a422480aea29cbfd800b1aaaaaaab(class_1309 var1, class_243 var2, double var3) {
      this.aa = var1;
      this.a = var2;
      this.b = var3;
   }

   public class_1309 b() {
      return this.aa;
   }

   public double aa() {
      return this.b;
   }
}
