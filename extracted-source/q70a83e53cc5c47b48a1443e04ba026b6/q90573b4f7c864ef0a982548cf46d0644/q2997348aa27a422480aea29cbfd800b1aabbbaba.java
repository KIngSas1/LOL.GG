package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
record q2997348aa27a422480aea29cbfd800b1aabbbaba(List<q2997348aa27a422480aea29cbfd800b1aabbbb> ae, Map<Long, q2997348aa27a422480aea29cbfd800b1aabbbb> af, q2997348aa27a422480aea29cbfd800b1aabbbb b) {
   private final q2997348aa27a422480aea29cbfd800b1aabbbb a;
   private final Map b;
   private final List aa;

   public List a() {
      return this.aa;
   }

   private q2997348aa27a422480aea29cbfd800b1aabbbb aa(String param1) {
      // $FF: Couldn't be decompiled
   }

   private List ab() {
      int var10000 = q2997348aa27a422480aea29cbfd800b1bbabab.aaab;
      ArrayList var3 = new ArrayList(this.aa.size() + 1);
      int var2 = var10000;
      var10000 = q2997348aa27a422480aea29cbfd800b1bbabab.b;
      var3.add("");
      int var1 = var10000;

      label47:
      for(q2997348aa27a422480aea29cbfd800b1aabbbb var5 : this.aa) {
         MatchException var10;
         if (var1 != 0) {
            try {
               if (var2 == 0) {
                  continue;
               }
            } catch (MatchException var8) {
               var10 = var8;
               boolean var10001 = false;
               throw var10;
            }

            if (var1 == 0) {
               break;
            }
         }

         while(true) {
            try {
               var11 = var3;
               if (var2 != 0) {
                  return (List)var11;
               }

               var3.add(var5.bb());
            } catch (MatchException var6) {
               var10 = var6;
               boolean var12 = false;
               break;
            }

            try {
               if (var2 == 0) {
                  continue label47;
               }
            } catch (MatchException var7) {
               var10 = var7;
               boolean var13 = false;
               break;
            }

            if (var1 == 0) {
               break label47;
            }
         }

         throw var10;
      }

      var11 = List.copyOf(var3);
      return (List)var11;
   }

   public q2997348aa27a422480aea29cbfd800b1aabbbb b() {
      return this.a;
   }

   private q2997348aa27a422480aea29cbfd800b1aabbbaba(List var1, Map var2, q2997348aa27a422480aea29cbfd800b1aabbbb var3) {
      this.aa = var1;
      this.b = var2;
      this.a = var3;
   }

   public Map ba() {
      return this.b;
   }
}
