package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import java.util.List;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
class q2997348aa27a422480aea29cbfd800b1aaaabbba implements q2997348aa27a422480aea29cbfd800b1baaababa {
   final List a;
   final q2997348aa27a422480aea29cbfd800b1aaabbaab b;

   public int ba() {
      return this.a.size() + 1;
   }

   public int aa() {
      // $FF: Couldn't be decompiled
   }

   public String a(int var1) {
      String var10000;
      try {
         try {
            if (var1 == 0) {
               var10000 = q2997348aa27a422480aea29cbfd800b1abbbaaba.abaaba.bba();
               return var10000;
            }
         } catch (IllegalStateException var2) {
            throw var2;
         }
      } catch (MatchException var3) {
         throw var3;
      }

      var10000 = ((q2997348aa27a422480aea29cbfd800b1babba)this.a.get(var1 - 1)).bba();
      return var10000;
   }

   q2997348aa27a422480aea29cbfd800b1aaaabbba(q2997348aa27a422480aea29cbfd800b1abbbaaba var1, List var2, q2997348aa27a422480aea29cbfd800b1aaabbaab var3) {
      this.a = var2;
      this.b = var3;
   }

   public void ab(int var1) {
      q2997348aa27a422480aea29cbfd800b1aaabbaab var10000;
      String var10001;
      label19: {
         try {
            try {
               var10000 = this.b;
               if (var1 == 0) {
                  var10001 = "";
                  break label19;
               }
            } catch (IllegalStateException var2) {
               throw var2;
            }
         } catch (MatchException var3) {
            throw var3;
         }

         var10001 = ((q2997348aa27a422480aea29cbfd800b1babba)this.a.get(var1 - 1)).bba();
      }

      var10000.aa(var10001);
   }
}
