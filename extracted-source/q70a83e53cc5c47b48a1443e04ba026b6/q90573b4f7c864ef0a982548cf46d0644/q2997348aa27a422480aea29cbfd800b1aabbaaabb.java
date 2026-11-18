package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import java.awt.image.BufferedImage;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public record q2997348aa27a422480aea29cbfd800b1aabbaaabb(BufferedImage dP, int scaledWidth, int scaledHeight, long dS) {
   private final long a;
   private final int b;
   private final BufferedImage aa;
   private final int ab;

   public BufferedImage a() {
      return this.aa;
   }

   public int b() {
      return this.ab;
   }

   public int aa() {
      return this.b;
   }

   public q2997348aa27a422480aea29cbfd800b1aabbaaabb(BufferedImage var1, int var2, int var3, long var4) {
      this.aa = var1;
      this.b = var2;
      this.ab = var3;
      this.a = var4;
   }

   public long ab() {
      return this.a;
   }
}
