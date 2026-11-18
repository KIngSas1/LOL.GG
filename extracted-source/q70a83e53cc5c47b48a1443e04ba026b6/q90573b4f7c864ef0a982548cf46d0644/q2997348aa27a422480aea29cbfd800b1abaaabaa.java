package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
final class q2997348aa27a422480aea29cbfd800b1abaaabaa extends AbstractSet {
   private final Set a;
   private final List aa;

   private boolean a(long var1) {
      return this.a.contains(var1);
   }

   public int size() {
      return this.a.size();
   }

   private Set aa() {
      return this.a;
   }

   public boolean contains(Object param1) {
      // $FF: Couldn't be decompiled
   }

   private q2997348aa27a422480aea29cbfd800b1babbbabb b(long param1) {
      // $FF: Couldn't be decompiled
   }

   public Iterator iterator() {
      Iterator var1 = this.a.iterator();
      return new q2997348aa27a422480aea29cbfd800b1abbbaaaba(this, var1);
   }

   private q2997348aa27a422480aea29cbfd800b1abaaabaa(List var1, Collection var2) {
      this.aa = List.copyOf(var1);
      this.a = Collections.unmodifiableSet(new LinkedHashSet(var2));
   }

   public boolean equals(Object param1) {
      // $FF: Couldn't be decompiled
   }

   public int hashCode() {
      int var2 = 0;
      int var1 = q2997348aa27a422480aea29cbfd800b1bbabab.aaab;

      for(long var4 : this.a) {
         q2997348aa27a422480aea29cbfd800b1babbbabb var6 = this.b(var4);
         if (var6 != null) {
            var2 += var6.ba;
         }

         if (var1 != 0) {
            break;
         }
      }

      return var2;
   }
}
