package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1309;

@Environment(EnvType.CLIENT)
record q2997348aa27a422480aea29cbfd800b1aabbbbaa(class_1309 cU, double cV, double cW, double cX, double cY) {
   private final double a;
   private final double b;
   private final class_1309 aa;
   private final double ab;
   private final double ba;

   public class_1309 a() {
      return this.aa;
   }

   public double b() {
      return this.ab;
   }

   private q2997348aa27a422480aea29cbfd800b1aabbbbaa(class_1309 var1, double var2, double var4, double var6, double var8) {
      this.aa = var1;
      this.b = var2;
      this.ba = var4;
      this.a = var6;
      this.ab = var8;
   }

   public double aa() {
      return this.a;
   }

   public double ab() {
      return this.b;
   }

   public double ba() {
      return this.ba;
   }
}
