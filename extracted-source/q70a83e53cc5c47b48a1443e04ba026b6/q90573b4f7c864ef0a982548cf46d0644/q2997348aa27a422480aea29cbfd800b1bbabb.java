package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record q2997348aa27a422480aea29cbfd800b1bbabb(String dC, int dD, int dE, String dF, String dG, String dH) {
   private final String a;
   private final String b;
   private final String aa;
   private final int ab;
   private final String ba;
   private final int bb;

   public String a() {
      return this.a;
   }

   public int b() {
      return this.ab;
   }

   q2997348aa27a422480aea29cbfd800b1bbabb(String var1, int var2, int var3, String var4, String var5, String var6) {
      this.aa = var1;
      this.ab = var2;
      this.bb = var3;
      this.b = var4;
      this.ba = var5;
      this.a = var6;
   }

   public String aa() {
      return this.aa;
   }

   public int ab() {
      return this.bb;
   }

   public String ba() {
      return this.b;
   }

   public String bb() {
      return this.ba;
   }
}
