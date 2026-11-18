package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public record q2997348aa27a422480aea29cbfd800b1babbbaa(double x, double y, double distanceSq) {
   private final double a;
   private final double b;
   private final double aa;

   public double a() {
      return this.aa;
   }

   public double b() {
      return this.a;
   }

   public q2997348aa27a422480aea29cbfd800b1babbbaa(double var1, double var3, double var5) {
      this.a = var1;
      this.b = var3;
      this.aa = var5;
   }

   public double aa() {
      return this.b;
   }
}
