package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1309;

@Environment(EnvType.CLIENT)
record q2997348aa27a422480aea29cbfd800b1aaabaaaaa(class_1309 jw, double jx, double jy, float jz) {
   private final double a;
   private final class_1309 b;
   private final float aa;
   private final double ab;

   public double a() {
      return this.a;
   }

   private q2997348aa27a422480aea29cbfd800b1aaabaaaaa(class_1309 var1, double var2, double var4, float var6) {
      this.b = var1;
      this.a = var2;
      this.ab = var4;
      this.aa = var6;
   }

   public class_1309 b() {
      return this.b;
   }

   public double aa() {
      return this.ab;
   }

   public float ab() {
      return this.aa;
   }
}
