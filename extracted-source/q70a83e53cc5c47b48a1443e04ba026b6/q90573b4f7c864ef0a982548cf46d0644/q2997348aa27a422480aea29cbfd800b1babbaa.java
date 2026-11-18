package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1657;

@Environment(EnvType.CLIENT)
record q2997348aa27a422480aea29cbfd800b1babbaa(class_1657 dx, double screenX, double screenY, double distanceSq, double topY) {
   private final double a;
   private final double b;
   private final double aa;
   private final double ab;
   private final class_1657 ba;

   public double a() {
      return this.a;
   }

   private q2997348aa27a422480aea29cbfd800b1babbaa(class_1657 var1, double var2, double var4, double var6, double var8) {
      this.ba = var1;
      this.a = var2;
      this.aa = var4;
      this.b = var6;
      this.ab = var8;
   }

   public double b() {
      return this.ab;
   }

   public double aa() {
      return this.aa;
   }

   public class_1657 ab() {
      return this.ba;
   }

   public double ba() {
      return this.b;
   }
}
