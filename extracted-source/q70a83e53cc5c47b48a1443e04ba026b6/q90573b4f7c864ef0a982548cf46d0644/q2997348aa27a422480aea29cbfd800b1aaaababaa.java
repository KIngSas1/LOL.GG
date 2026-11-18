package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record q2997348aa27a422480aea29cbfd800b1aaaababaa(double iB, double iC, double iD, double iE) {
   private final double a;
   private final double b;
   private final double aa;
   private final double ab;

   private q2997348aa27a422480aea29cbfd800b1aaaababaa a(q2997348aa27a422480aea29cbfd800b1aaaababaa var1) {
      return new q2997348aa27a422480aea29cbfd800b1aaaababaa(Math.max(this.aa, var1.aa), Math.max(this.b, var1.b), Math.min(this.a, var1.a), Math.min(this.ab, var1.ab));
   }

   public double aa() {
      return this.a;
   }

   public double ab() {
      return this.aa;
   }

   private static q2997348aa27a422480aea29cbfd800b1aaaababaa ba(double var0, double var2, double var4, double var6) {
      return new q2997348aa27a422480aea29cbfd800b1aaaababaa(Math.min(var0, var4), Math.min(var2, var6), Math.max(var0, var4), Math.max(var2, var6));
   }

   public double b() {
      return this.ab;
   }

   public double bb() {
      return this.b;
   }

   private q2997348aa27a422480aea29cbfd800b1aaaababaa(double var1, double var3, double var5, double var7) {
      this.aa = var1;
      this.b = var3;
      this.a = var5;
      this.ab = var7;
   }
}
