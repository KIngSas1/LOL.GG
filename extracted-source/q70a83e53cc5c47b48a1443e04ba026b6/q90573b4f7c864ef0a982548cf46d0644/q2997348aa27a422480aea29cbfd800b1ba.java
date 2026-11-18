package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1799;

@Environment(EnvType.CLIENT)
record q2997348aa27a422480aea29cbfd800b1ba(String x, int count, int clickedAtTick) {
   private final String a;
   private final int b;
   private final int aa;

   public String a() {
      return this.a;
   }

   boolean aa(class_1799 param1) {
      // $FF: Couldn't be decompiled
   }

   public int b() {
      return this.b;
   }

   private q2997348aa27a422480aea29cbfd800b1ba(String var1, int var2, int var3) {
      this.a = var1;
      this.b = var2;
      this.aa = var3;
   }

   public int ab() {
      return this.aa;
   }
}
