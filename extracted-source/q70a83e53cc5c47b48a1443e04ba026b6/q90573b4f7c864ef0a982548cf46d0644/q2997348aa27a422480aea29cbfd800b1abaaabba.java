package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_243;

@Environment(EnvType.CLIENT)
record q2997348aa27a422480aea29cbfd800b1abaaabba(class_243 fn, float fo, float fp, float fq, float fr, float fs, float ft) {
   private final float a;
   private final class_243 b;
   private final float aa;
   private final float ab;
   private final float ba;
   private final float bb;
   private final float aaa;

   private q2997348aa27a422480aea29cbfd800b1abaaabba(class_243 var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      this.b = var1;
      this.a = var2;
      this.aa = var3;
      this.ba = var4;
      this.aaa = var5;
      this.ab = var6;
      this.bb = var7;
   }

   public float a() {
      return this.aaa;
   }

   public float b() {
      return this.bb;
   }

   public float aa() {
      return this.ba;
   }

   public float ab() {
      return this.ab;
   }

   public float ba() {
      return this.aa;
   }

   public class_243 bb() {
      return this.b;
   }

   public float aaa() {
      return this.a;
   }
}
