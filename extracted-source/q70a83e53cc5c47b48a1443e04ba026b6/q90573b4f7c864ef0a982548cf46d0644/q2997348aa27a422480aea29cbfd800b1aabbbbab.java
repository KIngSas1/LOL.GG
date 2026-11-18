package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_243;

@Environment(EnvType.CLIENT)
public record q2997348aa27a422480aea29cbfd800b1aabbbbab(class_243 h, float i, float j, float k, float l) {
   private final float a;
   private final float b;
   private final class_243 aa;
   private final float ab;
   private final float ba;

   public float a() {
      return this.a;
   }

   public float b() {
      return this.b;
   }

   public class_243 aa() {
      return this.aa;
   }

   public q2997348aa27a422480aea29cbfd800b1aabbbbab(class_243 var1, float var2, float var3, float var4, float var5) {
      this.aa = var1;
      this.ba = var2;
      this.ab = var3;
      this.a = var4;
      this.b = var5;
   }

   public float ab() {
      return this.ab;
   }

   public float ba() {
      return this.ba;
   }
}
