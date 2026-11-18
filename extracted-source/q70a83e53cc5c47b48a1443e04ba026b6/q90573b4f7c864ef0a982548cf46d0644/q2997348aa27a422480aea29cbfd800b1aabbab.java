package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public record q2997348aa27a422480aea29cbfd800b1aabbab(boolean dk, boolean dl) {
   private static final q2997348aa27a422480aea29cbfd800b1aabbab b = new q2997348aa27a422480aea29cbfd800b1aabbab(false, false);
   private final boolean a;
   private final boolean aa;

   public q2997348aa27a422480aea29cbfd800b1aabbab(boolean var1, boolean var2) {
      this.a = var1;
      this.aa = var2;
   }

   public boolean a() {
      // $FF: Couldn't be decompiled
   }

   public boolean aa() {
      return this.a;
   }

   public boolean ab() {
      return this.aa;
   }

   private q2997348aa27a422480aea29cbfd800b1aabbab ba(boolean var1, boolean var2) {
      q2997348aa27a422480aea29cbfd800b1aabbab var10000;
      q2997348aa27a422480aea29cbfd800b1aabbab var10001;
      boolean var10002;
      label33: {
         label32: {
            try {
               try {
                  var10000 = new q2997348aa27a422480aea29cbfd800b1aabbab;
                  var10001 = var10000;
                  if (this.a || var1) {
                     break label32;
                  }
               } catch (IllegalStateException var3) {
                  throw var3;
               }
            } catch (MatchException var4) {
               throw var4;
            }

            var10002 = false;
            break label33;
         }

         var10002 = true;
      }

      var10001.<init>(var10002, this.aa || var2);
      return var10000;
   }
}
