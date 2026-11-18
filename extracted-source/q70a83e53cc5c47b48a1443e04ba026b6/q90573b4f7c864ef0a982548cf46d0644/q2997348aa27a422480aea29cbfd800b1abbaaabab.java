package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1297;
import net.minecraft.class_243;
import net.minecraft.class_3532;

@Environment(EnvType.CLIENT)
public record q2997348aa27a422480aea29cbfd800b1abbaaabab(float c2, float c3) {
   private final float a;
   private final float b;

   public float a(q2997348aa27a422480aea29cbfd800b1abbaaabab var1) {
      return class_3532.method_15393(var1.b - this.b);
   }

   public class_243 aa() {
      float var1 = (float)Math.toRadians((double)this.a);
      float var2 = (float)(-Math.toRadians((double)this.b));
      float var3 = (float)Math.cos((double)var1);
      return new class_243(Math.sin((double)var2) * (double)var3, -Math.sin((double)var1), Math.cos((double)var2) * (double)var3);
   }

   public float ab() {
      return this.a;
   }

   public static q2997348aa27a422480aea29cbfd800b1abbaaabab ba(class_243 var0, class_243 var1) {
      class_243 var2 = var1.method_1020(var0);
      double var3 = Math.hypot(var2.field_1352, var2.field_1350);
      float var5 = (float)Math.toDegrees(Math.atan2(var2.field_1350, var2.field_1352)) - 90.0F;
      float var6 = (float)(-Math.toDegrees(Math.atan2(var2.field_1351, var3)));
      return new q2997348aa27a422480aea29cbfd800b1abbaaabab(var5, var6);
   }

   public float bb() {
      return this.b;
   }

   public q2997348aa27a422480aea29cbfd800b1abbaaabab aaa(float var1, float var2) {
      return new q2997348aa27a422480aea29cbfd800b1abbaaabab(this.b + var1, class_3532.method_15363(this.a + var2, -90.0F, 90.0F));
   }

   public static q2997348aa27a422480aea29cbfd800b1abbaaabab aab(class_1297 var0) {
      return new q2997348aa27a422480aea29cbfd800b1abbaaabab(var0.method_36454(), var0.method_36455());
   }

   public q2997348aa27a422480aea29cbfd800b1abbaaabab(float var1, float var2) {
      this.b = var1;
      this.a = var2;
   }

   public float b(q2997348aa27a422480aea29cbfd800b1abbaaabab var1) {
      return class_3532.method_15363(var1.a, -90.0F, 90.0F) - this.a;
   }

   public float aba(q2997348aa27a422480aea29cbfd800b1abbaaabab var1) {
      return (float)Math.hypot((double)this.a(var1), (double)this.b(var1));
   }
}
