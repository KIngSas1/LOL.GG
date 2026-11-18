package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record q2997348aa27a422480aea29cbfd800b1abbaaabba(int a1, int a2, int a3, int a4, long a5) {
   private final long a;
   private final int b;
   private final int aa;
   private final int ab;
   private final int ba;

   private q2997348aa27a422480aea29cbfd800b1abbaaabba(int var1, int var2, int var3, int var4, long var5) {
      this.ba = var1;
      this.b = var2;
      this.ab = var3;
      this.aa = var4;
      this.a = var5;
   }

   public long a() {
      return this.a;
   }

   public int b() {
      return this.ab;
   }

   public int aa() {
      return this.ba;
   }

   public int ab() {
      return this.aa;
   }

   public int ba() {
      return this.b;
   }
}
