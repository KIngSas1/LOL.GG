package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import io.netty.channel.ChannelPromise;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record q2997348aa27a422480aea29cbfd800b1bababa(Object g6, ChannelPromise g7, long g8, q2997348aa27a422480aea29cbfd800b1aababbb g9) {
   private final ChannelPromise a;
   private final long b;
   private final q2997348aa27a422480aea29cbfd800b1aababbb aa;
   private final Object ab;

   public ChannelPromise a() {
      return this.a;
   }

   public long b() {
      return this.b;
   }

   public Object aa() {
      return this.ab;
   }

   private q2997348aa27a422480aea29cbfd800b1bababa(Object var1, ChannelPromise var2, long var3, q2997348aa27a422480aea29cbfd800b1aababbb var5) {
      this.ab = var1;
      this.a = var2;
      this.b = var3;
      this.aa = var5;
   }

   public q2997348aa27a422480aea29cbfd800b1aababbb ab() {
      return this.aa;
   }
}
