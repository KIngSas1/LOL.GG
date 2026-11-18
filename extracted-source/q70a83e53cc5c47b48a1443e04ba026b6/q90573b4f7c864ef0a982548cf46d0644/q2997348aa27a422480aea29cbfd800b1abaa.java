package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_2338;

@Environment(EnvType.CLIENT)
record q2997348aa27a422480aea29cbfd800b1abaa(class_2338 cb, int cc, float cd, float ce) {
   private final float a;
   private final int b;
   private final class_2338 aa;
   private final float ab;

   public class_2338 a() {
      return this.aa;
   }

   public float b() {
      return this.ab;
   }

   private q2997348aa27a422480aea29cbfd800b1abaa(class_2338 var1, int var2, float var3, float var4) {
      this.aa = var1;
      this.b = var2;
      this.ab = var3;
      this.a = var4;
   }

   public float aa() {
      return this.a;
   }

   public int ab() {
      return this.b;
   }
}
