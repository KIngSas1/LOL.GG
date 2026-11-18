package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public record q2997348aa27a422480aea29cbfd800b1aababba(double minX, double minY, double maxX, double maxY) {
   private final double a;
   private final double b;
   private final double aa;
   private final double ab;

   public q2997348aa27a422480aea29cbfd800b1aababba(double var1, double var3, double var5, double var7) {
      this.ab = var1;
      this.aa = var3;
      this.b = var5;
      this.a = var7;
   }

   public double a() {
      return this.b;
   }

   public double b() {
      return this.a;
   }

   public double aa() {
      return (this.aa + this.a) * (double)0.5F;
   }

   public double ab() {
      return this.a - this.aa;
   }

   public double ba() {
      return (this.ab + this.b) * (double)0.5F;
   }

   public double bb() {
      return this.aa;
   }

   public double aaa() {
      return this.ab;
   }

   public double aab() {
      return this.b - this.ab;
   }
}
