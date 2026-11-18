package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public final class q2997348aa27a422480aea29cbfd800b1aaabbaab extends q2997348aa27a422480aea29cbfd800b1bbabab {
   private q2997348aa27a422480aea29cbfd800b1babba aa;
   private final q2997348aa27a422480aea29cbfd800b1babba ab;

   public q2997348aa27a422480aea29cbfd800b1aaabbaab(Object var1, Object var2) {
      super((Object)var1, "");
      this.ab = ba(var2);
      this.aa = this.ab;
   }

   public void abba() {
      this.a(this.ab);
   }

   public void aa(String var1) {
      int var2 = q2997348aa27a422480aea29cbfd800b1bbabab.aaab;

      q2997348aa27a422480aea29cbfd800b1aaabbaab var10000;
      String var10001;
      label26: {
         label25: {
            try {
               try {
                  var10000 = this;
                  var10001 = var1;
                  if (var2 != 0) {
                     break label26;
                  }

                  if (var1 == null) {
                     break label25;
                  }
               } catch (IllegalStateException var3) {
                  throw var3;
               }
            } catch (MatchException var4) {
               throw var4;
            }

            var10001 = var1;
            break label26;
         }

         var10001 = "";
      }

      var10000.a(q2997348aa27a422480aea29cbfd800b1bbbbbbab.ab(var10001));
   }

   public Object abbb() {
      return this.aab();
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
            this.aa(var1.getAsString());
         }
      } catch (MatchException var3) {
         throw var3;
      } catch (IllegalStateException var4) {
         throw var4;
      }

   }

   private static q2997348aa27a422480aea29cbfd800b1babba ba(Object var0) {
      return q2997348aa27a422480aea29cbfd800b1bbbbbbab.abaa(var0);
   }

   public Object baaa() {
      return this.aba();
   }

   public q2997348aa27a422480aea29cbfd800b1aaabbaab(String var1, String var2) {
      this((Object)var1, (Object)var2);
   }

   public q2997348aa27a422480aea29cbfd800b1babba aaa() {
      return this.aa;
   }

   public String aab() {
      return this.aa.bba();
   }

   public void a(q2997348aa27a422480aea29cbfd800b1babba param1) {
      // $FF: Couldn't be decompiled
   }

   public String aba() {
      return this.ab.bba();
   }

   public JsonElement bb() {
      return new JsonPrimitive(this.aab());
   }

   public void ab(Object var1) {
      this.aa((String)var1);
   }

   public q2997348aa27a422480aea29cbfd800b1aaabbaab(Object var1, String var2) {
      this((Object)var1, (Object)var2);
   }
}
