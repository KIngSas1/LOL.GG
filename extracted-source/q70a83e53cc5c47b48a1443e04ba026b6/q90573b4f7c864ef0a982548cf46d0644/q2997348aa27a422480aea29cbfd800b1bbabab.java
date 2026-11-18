package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import com.google.gson.JsonElement;
import java.util.function.BooleanSupplier;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public abstract class q2997348aa27a422480aea29cbfd800b1bbabab {
   private static final BooleanSupplier bbb = q2997348aa27a422480aea29cbfd800b1bbabab::bbba;
   public static int b;
   private final q2997348aa27a422480aea29cbfd800b1babba aaaa;
   public static int aaab;
   private final Object aaba;
   private Object aabb;
   private boolean abaa;
   private BooleanSupplier abab;

   protected q2997348aa27a422480aea29cbfd800b1bbabab(Object var1, Object var2) {
      this.abab = bbb;
      this.abaa = true;
      this.aaaa = q2997348aa27a422480aea29cbfd800b1bbbbbbab.abaa(var1);
      this.aaba = var2;
      this.aabb = var2;
   }

   public q2997348aa27a422480aea29cbfd800b1babba baba() {
      return this.aaaa;
   }

   public abstract JsonElement bb();

   public String babb() {
      return this.aaaa.bba();
   }

   public long bbaa() {
      return this.aaaa.aaabb();
   }

   public q2997348aa27a422480aea29cbfd800b1bbabab bbab() {
      this.abaa = false;
      return this;
   }

   public Object abbb() {
      return this.aabb;
   }

   protected q2997348aa27a422480aea29cbfd800b1bbabab(String var1, Object var2) {
      this((Object)var1, var2);
   }

   public Object baaa() {
      return this.aaba;
   }

   public void ab(Object param1) {
      // $FF: Couldn't be decompiled
   }

   private static boolean bbba() {
      return true;
   }

   public boolean bbbb() {
      return this.abaa;
   }

   public q2997348aa27a422480aea29cbfd800b1bbabab aaaaa(BooleanSupplier var1) {
      int var2 = aaab;

      q2997348aa27a422480aea29cbfd800b1bbabab var10000;
      BooleanSupplier var10001;
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

         var10001 = bbb;
      }

      var10000.abab = var10001;
      return this;
   }

   public boolean aaaab() {
      // $FF: Couldn't be decompiled
   }

   public void abba() {
      this.ab(this.aaba);
   }

   public abstract void bab(JsonElement var1);

   protected final void aaaba() {
      int var10000 = aaab;
      q2997348aa27a422480aea29cbfd800b1babbbbbb var2 = q2997348aa27a422480aea29cbfd800b1babbbbbb.aaba();
      int var1 = var10000;

      label24: {
         try {
            try {
               var5 = var2;
               if (var1 != 0) {
                  break label24;
               }

               if (var2 == null) {
                  return;
               }
            } catch (IllegalStateException var3) {
               throw var3;
            }
         } catch (MatchException var4) {
            throw var4;
         }

         var5 = var2;
      }

      var5.bbb();
   }
}
