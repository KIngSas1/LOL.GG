package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
class q2997348aa27a422480aea29cbfd800b1bbaabaaa implements q2997348aa27a422480aea29cbfd800b1bbbaaaab {
   final double a;
   final double[] aa;
   final double[] ab;
   final double[] ba;
   final int bb;
   final double b;

   public double a() {
      return this.a;
   }

   public double aa() {
      return this.b;
   }

   q2997348aa27a422480aea29cbfd800b1bbaabaaa(int var1, double[] var2, double[] var3, double[] var4, double var5, double var7) {
      this.bb = var1;
      this.ba = var2;
      this.ab = var3;
      this.aa = var4;
      this.b = var5;
      this.a = var7;
   }

   public void ab(double var1, double[] var3) {
      double var4 = Math.max((double)0.0F, Math.min((double)(this.bb - 1), var1));
      int var6 = Math.min(this.bb - 2, (int)Math.floor(var4));
      double var7 = var4 - (double)var6;
      var3[0] = this.ba[var6] + (this.ba[var6 + 1] - this.ba[var6]) * var7;
      var3[1] = this.ab[var6] + (this.ab[var6 + 1] - this.ab[var6]) * var7;
      var3[2] = this.aa[var6] + (this.aa[var6 + 1] - this.aa[var6]) * var7;
   }
}
