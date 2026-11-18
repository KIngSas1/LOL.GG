package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import java.awt.Color;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record q2997348aa27a422480aea29cbfd800b1baaabab(Color hK, Color hL) {
   private final Color a;
   private final Color b;

   public Color a() {
      return this.b;
   }

   private q2997348aa27a422480aea29cbfd800b1baaabab(Color var1, Color var2) {
      this.b = var1;
      this.a = var2;
   }

   public Color b() {
      return this.a;
   }
}
