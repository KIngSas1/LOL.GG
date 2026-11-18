package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import io.netty.channel.ChannelPromise;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record q2997348aa27a422480aea29cbfd800b1babbbbaa(Object ev, ChannelPromise ew, long ex, long ey) {
   private final long a;
   private final ChannelPromise b;
   private final long aa;
   private final Object ab;

   public long a() {
      return this.aa;
   }

   public long b() {
      return this.a;
   }

   public Object aa() {
      return this.ab;
   }

   private q2997348aa27a422480aea29cbfd800b1babbbbaa(Object var1, ChannelPromise var2, long var3, long var5) {
      this.ab = var1;
      this.b = var2;
      this.aa = var3;
      this.a = var5;
   }

   public ChannelPromise ab() {
      return this.b;
   }
}
