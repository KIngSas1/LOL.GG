package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record q2997348aa27a422480aea29cbfd800b1bbbaaa(double x, double z) {
   private final double a;
   private final double b;

   q2997348aa27a422480aea29cbfd800b1bbbaaa(double var1, double var3) {
      this.b = var1;
      this.a = var3;
   }

   public double a() {
      return this.b;
   }

   public double b() {
      return this.a;
   }
}
