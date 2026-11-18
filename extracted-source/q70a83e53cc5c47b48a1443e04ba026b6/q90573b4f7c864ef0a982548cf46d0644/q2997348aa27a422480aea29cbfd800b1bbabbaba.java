package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record q2997348aa27a422480aea29cbfd800b1bbabbaba(String bE, String bF) {
   private final String a;
   private final String b;

   public String a() {
      return this.b;
   }

   public String b() {
      return this.a;
   }

   private q2997348aa27a422480aea29cbfd800b1bbabbaba(String var1, String var2) {
      this.a = var1;
      this.b = var2;
   }
}
