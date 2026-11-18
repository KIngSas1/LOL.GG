package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_2561;

@Environment(EnvType.CLIENT)
record q2997348aa27a422480aea29cbfd800b1ababba(class_2561 dI, boolean dJ, boolean dK) {
   private final boolean a;
   private final class_2561 b;
   private final boolean aa;

   private q2997348aa27a422480aea29cbfd800b1ababba(class_2561 var1, boolean var2, boolean var3) {
      this.b = var1;
      this.aa = var2;
      this.a = var3;
   }

   public class_2561 a() {
      return this.b;
   }

   public boolean b() {
      return this.a;
   }

   public boolean aa() {
      return this.aa;
   }
}
