package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1309;

@Environment(EnvType.CLIENT)
record q2997348aa27a422480aea29cbfd800b1bbbbbab(class_1309 in, q2997348aa27a422480aea29cbfd800b1babbbab io, double ip, double iq, float ir) {
   private final class_1309 a;
   private final double b;
   private final float aa;
   private final double ab;
   private final q2997348aa27a422480aea29cbfd800b1babbbab ba;

   public float a() {
      return this.aa;
   }

   private q2997348aa27a422480aea29cbfd800b1bbbbbab(class_1309 var1, q2997348aa27a422480aea29cbfd800b1babbbab var2, double var3, double var5, float var7) {
      this.a = var1;
      this.ba = var2;
      this.b = var3;
      this.ab = var5;
      this.aa = var7;
   }

   public q2997348aa27a422480aea29cbfd800b1babbbab b() {
      return this.ba;
   }

   public double aa() {
      return this.b;
   }

   public double ab() {
      return this.ab;
   }

   public class_1309 ba() {
      return this.a;
   }
}
