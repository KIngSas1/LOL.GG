package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record q2997348aa27a422480aea29cbfd800b1aabaaa(String hH, boolean hI, boolean hJ) {
   private final String a;
   private final boolean b;
   private final boolean aa;

   public boolean a() {
      return this.aa;
   }

   private q2997348aa27a422480aea29cbfd800b1aabaaa(String var1, boolean var2, boolean var3) {
      this.a = var1;
      this.aa = var2;
      this.b = var3;
   }

   public String b() {
      return this.a;
   }

   public boolean aa() {
      return this.b;
   }
}
