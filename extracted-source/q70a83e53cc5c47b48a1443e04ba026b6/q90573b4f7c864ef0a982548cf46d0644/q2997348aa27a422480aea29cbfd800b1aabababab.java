package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public final class q2997348aa27a422480aea29cbfd800b1aabababab extends q2997348aa27a422480aea29cbfd800b1bbabab {
   public q2997348aa27a422480aea29cbfd800b1aabababab(String var1, boolean var2) {
      this((Object)var1, var2);
   }

   public q2997348aa27a422480aea29cbfd800b1aabababab(Object var1, boolean var2) {
      super((Object)var1, var2);
   }

   public void bab(JsonElement var1) {
      int var2 = q2997348aa27a422480aea29cbfd800b1bbabab.aaab;

      JsonElement var10000;
      label32: {
         try {
            try {
               var10000 = var1;
               if (var2 != 0) {
                  break label32;
               }

               if (var1 == null) {
                  return;
               }
            } catch (IllegalStateException var5) {
               throw var5;
            }
         } catch (MatchException var6) {
            throw var6;
         }

         var10000 = var1;
      }

      try {
         if (var10000.isJsonPrimitive()) {
            this.ab(var1.getAsBoolean());
         }
      } catch (MatchException var3) {
         throw var3;
      } catch (IllegalStateException var4) {
         throw var4;
      }

   }

   public JsonElement bb() {
      return new JsonPrimitive((Boolean)this.abbb());
   }
}
