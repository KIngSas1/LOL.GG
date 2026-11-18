package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import java.util.function.Consumer;
import java.util.function.Predicate;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_2596;

@Environment(EnvType.CLIENT)
record q2997348aa27a422480aea29cbfd800b1ababbbaab(Predicate<class_2596<?>> gs, Consumer<class_2596<?>> gt, Predicate<class_2596<?>> gu, Predicate<class_2596<?>> gv) {
   private final Predicate a;
   private final Predicate b;
   private final Predicate aa;
   private final Consumer ab;

   public Consumer a() {
      return this.ab;
   }

   public Predicate b() {
      return this.b;
   }

   public Predicate aa() {
      return this.aa;
   }

   public Predicate ab() {
      return this.a;
   }

   private q2997348aa27a422480aea29cbfd800b1ababbbaab(Predicate var1, Consumer var2, Predicate var3, Predicate var4) {
      this.a = var1;
      this.ab = var2;
      this.aa = var3;
      this.b = var4;
   }
}
