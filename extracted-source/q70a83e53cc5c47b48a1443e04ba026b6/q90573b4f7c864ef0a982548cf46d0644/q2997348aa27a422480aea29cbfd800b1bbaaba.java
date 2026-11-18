package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_243;

@Environment(EnvType.CLIENT)
record q2997348aa27a422480aea29cbfd800b1bbaaba(int e6, class_243 e7, float e8, double e9, double e_, double fa, double fb) {
   private final double a;
   private final double b;
   private final double aa;
   private final float ab;
   private final double ba;
   private final class_243 bb;
   private final int aaa;

   private q2997348aa27a422480aea29cbfd800b1bbaaba(int var1, class_243 var2, float var3, double var4, double var6, double var8, double var10) {
      this.aaa = var1;
      this.bb = var2;
      this.ab = var3;
      this.b = var4;
      this.a = var6;
      this.ba = var8;
      this.aa = var10;
   }

   public class_243 a() {
      return this.bb;
   }

   public int b() {
      return this.aaa;
   }

   public double aa() {
      return this.b;
   }

   public float ab() {
      return this.ab;
   }

   public double ba() {
      return this.ba;
   }

   public double bb() {
      return this.aa;
   }

   public double aaa() {
      return this.a;
   }
}
