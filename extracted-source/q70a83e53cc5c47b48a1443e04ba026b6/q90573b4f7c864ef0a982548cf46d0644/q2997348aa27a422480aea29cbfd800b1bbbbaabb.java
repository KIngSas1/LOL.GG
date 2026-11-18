package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_2338;
import net.minecraft.class_243;
import net.minecraft.class_3965;

@Environment(EnvType.CLIENT)
record q2997348aa27a422480aea29cbfd800b1bbbbaabb(class_2338 j4, class_2338 j5, class_243 j6, class_3965 j7) {
   private final class_3965 a;
   private final class_243 b;
   private final class_2338 aa;
   private final class_2338 ab;

   public class_243 a() {
      return this.b;
   }

   private q2997348aa27a422480aea29cbfd800b1bbbbaabb(class_2338 var1, class_2338 var2, class_243 var3, class_3965 var4) {
      this.aa = var1;
      this.ab = var2;
      this.b = var3;
      this.a = var4;
   }

   public class_3965 b() {
      return this.a;
   }

   public class_2338 aa() {
      return this.aa;
   }

   public class_2338 ab() {
      return this.ab;
   }
}
