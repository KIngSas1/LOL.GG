package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_2338;
import net.minecraft.class_243;
import net.minecraft.class_3965;

@Environment(EnvType.CLIENT)
record q2997348aa27a422480aea29cbfd800b1abbbbaba(class_2338 id, class_243 ie, class_3965 ig, float ih, float ii) {
   private final float a;
   private final class_243 b;
   private final class_3965 aa;
   private final float ab;
   private final class_2338 ba;

   public float a() {
      return this.a;
   }

   private q2997348aa27a422480aea29cbfd800b1abbbbaba(class_2338 var1, class_243 var2, class_3965 var3, float var4, float var5) {
      this.ba = var1;
      this.b = var2;
      this.aa = var3;
      this.a = var4;
      this.ab = var5;
   }

   public float b() {
      return this.ab;
   }

   public class_2338 aa() {
      return this.ba;
   }

   public class_3965 ab() {
      return this.aa;
   }

   public class_243 ba() {
      return this.b;
   }
}
