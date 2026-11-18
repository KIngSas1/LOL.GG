package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_4184;
import net.minecraft.class_757;
import org.joml.Matrix4f;

@Environment(EnvType.CLIENT)
record q2997348aa27a422480aea29cbfd800b1bbbbbbaa(class_4184 iZ, class_757 i0, Matrix4f viewMatrix, Matrix4f projectionMatrix) {
   private final Matrix4f a;
   private final Matrix4f b;
   private final class_4184 aa;
   private final class_757 ab;

   public class_757 a() {
      return this.ab;
   }

   public class_4184 b() {
      return this.aa;
   }

   public Matrix4f aa() {
      return this.a;
   }

   public Matrix4f ab() {
      return this.b;
   }

   private q2997348aa27a422480aea29cbfd800b1bbbbbbaa(class_4184 var1, class_757 var2, Matrix4f var3, Matrix4f var4) {
      this.aa = var1;
      this.ab = var2;
      this.b = var3;
      this.a = var4;
   }
}
