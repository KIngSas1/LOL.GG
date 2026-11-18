package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public final class q2997348aa27a422480aea29cbfd800b1aaaabb extends q2997348aa27a422480aea29cbfd800b1bbabab {
   private Set aa;
   private final List ab;

   private static Set aa(q2997348aa27a422480aea29cbfd800b1abaaabaa var0) {
      int var1 = q2997348aa27a422480aea29cbfd800b1bbabab.b;
      int var10000 = q2997348aa27a422480aea29cbfd800b1bbabab.aaab;
      LinkedHashSet var3 = new LinkedHashSet();
      Iterator var4 = var0.iterator();
      int var2 = var10000;

      label47:
      while(var4.hasNext()) {
         String var5 = (String)var4.next();
         IllegalArgumentException var9;
         if (var1 != 0) {
            try {
               if (var2 == 0) {
                  continue;
               }
            } catch (IllegalArgumentException var8) {
               var9 = var8;
               boolean var10001 = false;
               throw var9;
            }

            if (var1 == 0) {
               break;
            }
         }

         while(true) {
            try {
               var10 = var3;
               if (var2 != 0) {
                  return (Set)var10;
               }

               var3.add(var5);
            } catch (IllegalArgumentException var6) {
               var9 = var6;
               boolean var11 = false;
               break;
            }

            try {
               if (var2 == 0) {
                  continue label47;
               }
            } catch (IllegalArgumentException var7) {
               var9 = var7;
               boolean var12 = false;
               break;
            }

            if (var1 == 0) {
               break label47;
            }
         }

         throw var9;
      }

      var10 = Collections.unmodifiableSet(var3);
      return (Set)var10;
   }

   public void ba(Set var1) {
      this.aaaa(var1);
   }

   public void aaa(Collection var1) {
      this.aaaa(var1);
   }

   private static Long aab(Object param0) {
      // $FF: Couldn't be decompiled
   }

   public q2997348aa27a422480aea29cbfd800b1aaaabb(Object var1, List var2, Collection var3) {
      super((Object)var1, a(var3, var2));
      this.aa = Set.of();
      this.ab = List.copyOf(var2);
      this.aaaa(var3);
   }

   public void aba(q2997348aa27a422480aea29cbfd800b1babbbabb param1) {
      // $FF: Couldn't be decompiled
   }

   public List abb() {
      return this.ab;
   }

   private static q2997348aa27a422480aea29cbfd800b1abaaabaa a(Collection param0, List param1) {
      // $FF: Couldn't be decompiled
   }

   public void ab(Object var1) {
      this.ba((Set)var1);
   }

   private q2997348aa27a422480aea29cbfd800b1abaaabaa baa() {
      return bba((Set)super.abbb(), this.ab);
   }

   private static q2997348aa27a422480aea29cbfd800b1abaaabaa bba(Set var0, List var1) {
      int var2 = q2997348aa27a422480aea29cbfd800b1bbabab.aaab;

      q2997348aa27a422480aea29cbfd800b1abaaabaa var6;
      label36: {
         label26: {
            try {
               try {
                  var10000 = var0;
                  if (var2 != 0) {
                     break label26;
                  }

                  if (var0 instanceof q2997348aa27a422480aea29cbfd800b1abaaabaa) {
                     break label36;
                  }
               } catch (MatchException var4) {
                  throw var4;
               }
            } catch (IllegalArgumentException var5) {
               throw var5;
            }

            var10000 = var0;
         }

         var6 = a(var10000, var1);
         return var6;
      }

      q2997348aa27a422480aea29cbfd800b1abaaabaa var3 = (q2997348aa27a422480aea29cbfd800b1abaaabaa)var0;
      var6 = var3;
      return var6;
   }

   public Set bbb() {
      return aa(bba((Set)this.baaa(), this.ab));
   }

   public void bab(JsonElement param1) {
      // $FF: Couldn't be decompiled
   }

   private void aaaa(Collection param1) {
      // $FF: Couldn't be decompiled
   }

   public boolean aaab(String param1) {
      // $FF: Couldn't be decompiled
   }

   public boolean aaba(q2997348aa27a422480aea29cbfd800b1babbbabb param1) {
      // $FF: Couldn't be decompiled
   }

   public boolean aabb(q2997348aa27a422480aea29cbfd800b1babba param1) {
      // $FF: Couldn't be decompiled
   }

   public JsonElement bb() {
      JsonArray var3 = new JsonArray();
      int var10000 = q2997348aa27a422480aea29cbfd800b1bbabab.b;
      int var10001 = q2997348aa27a422480aea29cbfd800b1bbabab.aaab;
      Iterator var4 = this.baa().iterator();
      int var2 = var10001;
      int var1 = var10000;

      label47:
      while(var4.hasNext()) {
         String var5 = (String)var4.next();
         IllegalArgumentException var9;
         if (var1 != 0) {
            try {
               if (var2 == 0) {
                  continue;
               }
            } catch (IllegalArgumentException var8) {
               var9 = var8;
               var10001 = 0;
               throw var9;
            }

            if (var1 == 0) {
               break;
            }
         }

         while(true) {
            try {
               var10 = var3;
               if (var2 != 0) {
                  return var10;
               }

               var3.add(var5);
            } catch (IllegalArgumentException var6) {
               var9 = var6;
               var10001 = 0;
               break;
            }

            try {
               if (var2 == 0) {
                  continue label47;
               }
            } catch (IllegalArgumentException var7) {
               var9 = var7;
               var10001 = 0;
               break;
            }

            if (var1 == 0) {
               break label47;
            }
         }

         throw var9;
      }

      var10 = var3;
      return var10;
   }

   public q2997348aa27a422480aea29cbfd800b1aaaabb(String var1, List var2, Collection var3) {
      this((Object)var1, var2, var3);
   }

   public q2997348aa27a422480aea29cbfd800b1aaaabb abaa(int[] var1) {
      int var10000 = q2997348aa27a422480aea29cbfd800b1bbabab.aaab;
      LinkedHashSet var4 = new LinkedHashSet();
      int var3 = var10000;
      int[] var5 = var1;
      int var6 = var1.length;
      int var7 = 0;
      int var2 = q2997348aa27a422480aea29cbfd800b1bbabab.b;

      while(true) {
         if (var7 < var6) {
            var10000 = var5[var7];
            if (var3 != 0) {
               break;
            }

            int var8 = var10000;
            var4.add(((q2997348aa27a422480aea29cbfd800b1babbbabb)this.ab.get(var8)).abb());
            ++var7;
            if (var3 == 0) {
               continue;
            }
         }

         try {
            if (var2 != 0) {
               return this;
            }

            var10000 = var4.isEmpty();
            break;
         } catch (IllegalArgumentException var9) {
            throw var9;
         }
      }

      try {
         try {
            if (var10000 != 0) {
               throw new IllegalArgumentException();
            }
         } catch (MatchException var10) {
            throw var10;
         }
      } catch (IllegalArgumentException var11) {
         throw var11;
      }

      this.aa = Collections.unmodifiableSet(var4);
      this.aaaa((Collection)super.abbb());
      return this;
   }

   public Set abab() {
      return aa(this.baa());
   }
}
