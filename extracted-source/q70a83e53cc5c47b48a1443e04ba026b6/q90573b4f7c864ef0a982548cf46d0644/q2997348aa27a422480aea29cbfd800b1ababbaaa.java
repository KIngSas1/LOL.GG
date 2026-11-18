package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import io.netty.channel.ChannelPromise;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record q2997348aa27a422480aea29cbfd800b1ababbaaa(Object cn, ChannelPromise co, q2997348aa27a422480aea29cbfd800b1babbabb cp, long cq, long cr) {
   private final Object a;
   private final long b;
   private final ChannelPromise aa;
   private final q2997348aa27a422480aea29cbfd800b1babbabb ab;
   private final long ba;

   public q2997348aa27a422480aea29cbfd800b1babbabb a() {
      return this.ab;
   }

   private q2997348aa27a422480aea29cbfd800b1ababbaaa(Object var1, ChannelPromise var2, q2997348aa27a422480aea29cbfd800b1babbabb var3, long var4, long var6) {
      this.a = var1;
      this.aa = var2;
      this.ab = var3;
      this.ba = var4;
      this.b = var6;
   }

   public ChannelPromise b() {
      return this.aa;
   }

   public long aa() {
      return this.b;
   }

   public long ab() {
      return this.ba;
   }

   public Object ba() {
      return this.a;
   }
}
