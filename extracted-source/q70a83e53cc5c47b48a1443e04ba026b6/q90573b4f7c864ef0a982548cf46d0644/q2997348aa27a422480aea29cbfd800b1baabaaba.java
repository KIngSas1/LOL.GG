package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record q2997348aa27a422480aea29cbfd800b1baabaaba(double x, double y, double w, double h) {
   private final double a;
   private final double b;
   private final double aa;
   private final double ab;

   private q2997348aa27a422480aea29cbfd800b1baabaaba(double var1, double var3, double var5, double var7) {
      this.b = var1;
      this.aa = var3;
      this.ab = var5;
      this.a = var7;
   }

   public double a() {
      return this.ab;
   }

   public double b() {
      return this.aa;
   }

   public double aa() {
      return this.b;
   }

   public double ab() {
      return this.a;
   }
}
