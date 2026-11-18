package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1309;

@Environment(EnvType.CLIENT)
record q2997348aa27a422480aea29cbfd800b1abaabb(class_1309 bZ, double b0, double b1, float b2) {
   private final double a;
   private final double b;
   private final float aa;
   private final class_1309 ab;

   public double a() {
      return this.b;
   }

   public double b() {
      return this.a;
   }

   public class_1309 aa() {
      return this.ab;
   }

   private q2997348aa27a422480aea29cbfd800b1abaabb(class_1309 var1, double var2, double var4, float var6) {
      this.ab = var1;
      this.b = var2;
      this.a = var4;
      this.aa = var6;
   }

   public float ab() {
      return this.aa;
   }
}
