package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import java.util.List;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1297;
import net.minecraft.class_2350;
import net.minecraft.class_243;

@Environment(EnvType.CLIENT)
record q2997348aa27a422480aea29cbfd800b1aabbbbbba(List<class_243> jr, class_2350 js, class_1297 jt) {
   private final List a;
   private final class_1297 b;
   private final class_2350 aa;

   private q2997348aa27a422480aea29cbfd800b1aabbbbbba(List var1, class_2350 var2, class_1297 var3) {
      this.a = var1;
      this.aa = var2;
      this.b = var3;
   }

   public List a() {
      return this.a;
   }

   public class_1297 b() {
      return this.b;
   }

   public class_2350 aa() {
      return this.aa;
   }
}
