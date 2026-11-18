package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import java.util.HashSet;
import java.util.Set;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
final class q2997348aa27a422480aea29cbfd800b1bbbbaa {
   private final Set a = new HashSet();

   private q2997348aa27a422480aea29cbfd800b1bbbbaa() {
   }

   boolean a() {
      int var1 = q2997348aa27a422480aea29cbfd800b1bbabab.aaab;

      boolean var10000;
      label36: {
         try {
            try {
               var10000 = this.a.isEmpty();
               if (var1 != 0) {
                  return var10000;
               }

               if (!var10000) {
                  break label36;
               }
            } catch (IllegalStateException var2) {
               throw var2;
            }
         } catch (MatchException var3) {
            throw var3;
         }

         var10000 = false;
         return var10000;
      }

      var10000 = true;
      return var10000;
   }

   boolean aa(int var1) {
      return this.a.contains(var1);
   }

   void ab(int var1) {
      this.a.add(var1);
   }
}
