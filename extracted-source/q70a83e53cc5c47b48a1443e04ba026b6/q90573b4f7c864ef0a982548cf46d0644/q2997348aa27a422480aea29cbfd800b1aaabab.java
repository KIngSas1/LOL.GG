package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record q2997348aa27a422480aea29cbfd800b1aaabab(double g2, double g3, double g4) {
   private final double a;
   private final double b;
   private final double aa;

   public double a() {
      return this.a;
   }

   private q2997348aa27a422480aea29cbfd800b1aaabab(double var1, double var3, double var5) {
      this.aa = var1;
      this.a = var3;
      this.b = var5;
   }

   public double b() {
      return this.aa;
   }

   public double aa() {
      return this.b;
   }
}
