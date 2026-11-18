package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public record q2997348aa27a422480aea29cbfd800b1aabbabba(float jX, float jY, int jZ, int j0, int j1) {
   private final float a;
   private final float b;
   private final int aa;
   private final int ab;
   private final int ba;

   public float a() {
      return this.a;
   }

   public float b() {
      return this.b;
   }

   public int aa() {
      return this.ab;
   }

   public q2997348aa27a422480aea29cbfd800b1aabbabba(float var1, float var2, int var3, int var4, int var5) {
      this.a = var1;
      this.b = var2;
      this.ab = var3;
      this.aa = var4;
      this.ba = var5;
   }

   public int ab() {
      return this.aa;
   }

   public int ba() {
      return this.ba;
   }
}
