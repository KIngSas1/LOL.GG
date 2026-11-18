package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import io.netty.channel.ChannelPromise;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record q2997348aa27a422480aea29cbfd800b1aababbb(Object hC, ChannelPromise hD, long hE, int hF, long hG) {
   private final long a;
   private final int b;
   private final Object aa;
   private final long ab;
   private final ChannelPromise ba;

   public long a() {
      return this.ab;
   }

   public long b() {
      return this.a;
   }

   public Object aa() {
      return this.aa;
   }

   private q2997348aa27a422480aea29cbfd800b1aababbb(Object var1, ChannelPromise var2, long var3, int var5, long var6) {
      this.aa = var1;
      this.ba = var2;
      this.ab = var3;
      this.b = var5;
      this.a = var6;
   }

   public int ab() {
      return this.b;
   }

   public ChannelPromise ba() {
      return this.ba;
   }
}
