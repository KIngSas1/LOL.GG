package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record q2997348aa27a422480aea29cbfd800b1bbbbbaba(String ab, int ac, int ad) {
   private final int a;
   private final int b;
   private final String aa;

   q2997348aa27a422480aea29cbfd800b1bbbbbaba(String var1, int var2, int var3) {
      this.aa = var1;
      this.b = var2;
      this.a = var3;
   }

   public int a() {
      return this.b;
   }

   public int b() {
      return this.a;
   }

   public String aa() {
      return this.aa;
   }
}
