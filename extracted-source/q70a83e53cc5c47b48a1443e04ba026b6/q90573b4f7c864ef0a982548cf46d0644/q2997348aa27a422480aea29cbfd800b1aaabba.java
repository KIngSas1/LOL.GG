package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record q2997348aa27a422480aea29cbfd800b1aaabba(boolean moving, boolean closeToEdge, boolean safeToRelease, double directionX, double directionZ, double distance) {
   private final boolean a;
   private final double aa;
   private final boolean ab;
   private final double ba;
   private final double bb;
   private final boolean aaa;

   public double a() {
      return this.ba;
   }

   public double aa() {
      return this.bb;
   }

   public double ab() {
      return this.aa;
   }

   q2997348aa27a422480aea29cbfd800b1aaabba(boolean var1, boolean var2, boolean var3, double var4, double var6, double var8) {
      this.aaa = var1;
      this.a = var2;
      this.ab = var3;
      this.aa = var4;
      this.ba = var6;
      this.bb = var8;
   }

   public boolean ba() {
      return this.ab;
   }

   public boolean bb() {
      return this.a;
   }

   public boolean aaa() {
      return this.aaa;
   }

   static q2997348aa27a422480aea29cbfd800b1aaabba aab() {
      return new q2997348aa27a422480aea29cbfd800b1aaabba(false, false, true, (double)0.0F, (double)0.0F, (double)0.0F);
   }
}
