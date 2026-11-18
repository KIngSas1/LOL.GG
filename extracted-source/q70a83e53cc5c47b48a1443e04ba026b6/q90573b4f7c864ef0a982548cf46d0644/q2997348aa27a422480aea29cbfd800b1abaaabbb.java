package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_2338;
import net.minecraft.class_243;
import net.minecraft.class_3965;

@Environment(EnvType.CLIENT)
record q2997348aa27a422480aea29cbfd800b1abaaabbb(class_2338 jA, class_243 jB, class_3965 jC) {
   private final class_3965 a;
   private final class_243 b;
   private final class_2338 aa;

   private q2997348aa27a422480aea29cbfd800b1abaaabbb(class_2338 var1, class_243 var2, class_3965 var3) {
      this.aa = var1;
      this.b = var2;
      this.a = var3;
   }

   public class_2338 a() {
      return this.aa;
   }

   public class_243 b() {
      return this.b;
   }

   public class_3965 aa() {
      return this.a;
   }
}
