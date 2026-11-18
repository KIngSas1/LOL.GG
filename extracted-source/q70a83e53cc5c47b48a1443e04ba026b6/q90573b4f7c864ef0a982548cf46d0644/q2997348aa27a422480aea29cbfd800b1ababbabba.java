package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import java.util.Map;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_2960;

@Environment(EnvType.CLIENT)
record q2997348aa27a422480aea29cbfd800b1ababbabba(class_2960 aJ, double aK, double aL, float aM, double aN, double aO, double aP, Map<Integer, q2997348aa27a422480aea29cbfd800b1bbbbab> aQ, q2997348aa27a422480aea29cbfd800b1bbbbab[] aR, q2997348aa27a422480aea29cbfd800b1bbbbab aS) {
   private final double a;
   private final Map b;
   private final double aa;
   private final q2997348aa27a422480aea29cbfd800b1bbbbab[] ab;
   private final double ba;
   private final double bb;
   private final class_2960 aaa;
   private final q2997348aa27a422480aea29cbfd800b1bbbbab aab;
   private final double aba;
   private final float abb;

   public double a() {
      return this.ba;
   }

   public double b() {
      return this.a;
   }

   public double aa() {
      return this.bb;
   }

   public double ab() {
      return this.aa;
   }

   public q2997348aa27a422480aea29cbfd800b1bbbbab ba() {
      return this.aab;
   }

   public float bb() {
      return this.abb;
   }

   private q2997348aa27a422480aea29cbfd800b1ababbabba(class_2960 var1, double var2, double var4, float var6, double var7, double var9, double var11, Map var13, q2997348aa27a422480aea29cbfd800b1bbbbab[] var14, q2997348aa27a422480aea29cbfd800b1bbbbab var15) {
      this.aaa = var1;
      this.a = var2;
      this.bb = var4;
      this.abb = var6;
      this.aba = var7;
      this.ba = var9;
      this.aa = var11;
      this.b = var13;
      this.ab = var14;
      this.aab = var15;
   }

   public Map aaa() {
      return this.b;
   }

   public class_2960 aab() {
      return this.aaa;
   }

   public q2997348aa27a422480aea29cbfd800b1bbbbab[] aba() {
      return this.ab;
   }

   public double abb() {
      return this.aba;
   }
}
