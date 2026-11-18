package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import java.util.SplittableRandom;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
final class q2997348aa27a422480aea29cbfd800b1aabbbbaaa {
   private float a = 4.5F;
   private float aa;
   private SplittableRandom ab = new SplittableRandom();
   private float ba;
   private float bb;
   private float aaa = 2.7F;
   private float aab;
   private float aba;
   private float abb;

   q2997348aa27a422480aea29cbfd800b1aabbbbaaa() {
      this.a(System.nanoTime());
   }

   void a(long var1) {
      SplittableRandom var3 = new SplittableRandom(var1);
      this.ab = var3;
      this.abb = var3.nextFloat();
      this.aba = var3.nextFloat() * 2.0F - 1.0F;
      this.aab = var3.nextFloat() * 2.0F - 1.0F;
      this.ba = var3.nextFloat();
      this.aa = var3.nextFloat() * 2.0F - 1.0F;
      this.bb = var3.nextFloat() * 2.0F - 1.0F;
      this.aaa = 4.6F + var3.nextFloat() * 3.4F;
      this.a = 5.4F + var3.nextFloat() * 4.2F;
   }

   float[] aa(float var1, float var2, float var3) {
      return this.ab(var1, var2, var3, 0.65F);
   }

   float[] ab(float param1, float param2, float param3, float param4) {
      // $FF: Couldn't be decompiled
   }

   void ba() {
      this.a(System.nanoTime());
   }
}
