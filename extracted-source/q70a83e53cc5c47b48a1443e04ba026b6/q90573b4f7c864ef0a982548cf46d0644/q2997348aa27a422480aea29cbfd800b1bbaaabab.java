package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record q2997348aa27a422480aea29cbfd800b1bbaaabab(double x, double y, double width, double height, double distanceSq, long hB) {
   private final double a;
   private final double b;
   private final double aa;
   private final double ab;
   private final double ba;
   private final long bb;

   private q2997348aa27a422480aea29cbfd800b1bbaaabab(double var1, double var3, double var5, double var7, double var9, long var11) {
      this.ba = var1;
      this.a = var3;
      this.ab = var5;
      this.b = var7;
      this.aa = var9;
      this.bb = var11;
   }

   public double a() {
      return this.ab;
   }

   public double b() {
      return this.a;
   }

   public double aa() {
      return this.ba;
   }

   public double ab() {
      return this.b;
   }

   public long ba() {
      return this.bb;
   }

   public double bb() {
      return this.aa;
   }
}
