package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record q2997348aa27a422480aea29cbfd800b1aababbab(List<Integer> b, int c) {
   private final List a;
   private final int b;

   public int a() {
      return this.b;
   }

   private q2997348aa27a422480aea29cbfd800b1aababbab(List var1, int var2) {
      this.a = var1;
      this.b = var2;
   }

   int aa() {
      return (Integer)this.a.get(ThreadLocalRandom.current().nextInt(this.a.size()));
   }

   boolean ab() {
      int var1 = q2997348aa27a422480aea29cbfd800b1bbabab.aaab;

      int var10000;
      label36: {
         try {
            try {
               var10000 = this.b;
               if (var1 != 0) {
                  return (boolean)var10000;
               }

               if (var10000 > 0) {
                  break label36;
               }
            } catch (IllegalStateException var2) {
               throw var2;
            }
         } catch (MatchException var3) {
            throw var3;
         }

         var10000 = 0;
         return (boolean)var10000;
      }

      var10000 = 1;
      return (boolean)var10000;
   }

   boolean b() {
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

   public List ba() {
      return this.a;
   }
}
