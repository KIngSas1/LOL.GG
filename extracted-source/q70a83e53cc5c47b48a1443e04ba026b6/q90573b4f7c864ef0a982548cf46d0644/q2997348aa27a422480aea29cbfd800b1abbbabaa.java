package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record q2997348aa27a422480aea29cbfd800b1abbbabaa(int cZ, float c0, float c1) {
   private final float a;
   private final float b;
   private final int aa;

   private q2997348aa27a422480aea29cbfd800b1abbbabaa(int var1, float var2, float var3) {
      this.aa = var1;
      this.b = var2;
      this.a = var3;
   }

   public int a() {
      return this.aa;
   }

   public float b() {
      return this.b;
   }

   public float aa() {
      return this.a;
   }
}
