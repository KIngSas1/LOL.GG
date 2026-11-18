package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public record q2997348aa27a422480aea29cbfd800b1aabbbabaa(String id, String name, String bindLabel, int dW) {
   private final String a;
   private final int b;
   private final String aa;
   private final String ab;

   public String a() {
      return this.a;
   }

   public String b() {
      return this.aa;
   }

   public q2997348aa27a422480aea29cbfd800b1aabbbabaa(String var1, String var2, String var3, int var4) {
      this.ab = var1;
      this.aa = var2;
      this.a = var3;
      this.b = var4;
   }

   public String aa() {
      return this.ab;
   }

   public int ab() {
      return this.b;
   }
}
