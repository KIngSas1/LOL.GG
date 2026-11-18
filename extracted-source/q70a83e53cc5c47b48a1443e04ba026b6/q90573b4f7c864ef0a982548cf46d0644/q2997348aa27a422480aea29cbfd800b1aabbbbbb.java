package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_304;
import net.minecraft.class_310;
import net.minecraft.class_315;
import net.minecraft.class_3675;
import net.minecraft.class_744;

@Environment(EnvType.CLIENT)
public final class q2997348aa27a422480aea29cbfd800b1aabbbbbb {
   private final Map a = new IdentityHashMap();
   private final Map aa = new IdentityHashMap();
   private static final q2997348aa27a422480aea29cbfd800b1aabbbbbb ab = new q2997348aa27a422480aea29cbfd800b1aabbbbbb();

   public void a(class_310 param1) {
      // $FF: Couldn't be decompiled
   }

   private static boolean aa(class_310 param0) {
      // $FF: Couldn't be decompiled
   }

   public void ab(Object var1, class_310 var2) {
      int var3 = q2997348aa27a422480aea29cbfd800b1aabaabaaa.bb;

      try {
         try {
            if (var1 == null) {
               return;
            }
         } catch (IllegalStateException var6) {
            throw var6;
         }
      } catch (MatchException var7) {
         throw var7;
      }

      for(class_304 var5 : Set.copyOf(this.a.keySet())) {
         this.aaba(var1, var2, var5);
         if (var3 != 0) {
            break;
         }
      }

   }

   public void ba(Object param1, class_310 param2, class_304 param3) {
      // $FF: Couldn't be decompiled
   }

   public void bb(Object param1, class_310 param2, class_304 param3, boolean param4) {
      // $FF: Couldn't be decompiled
   }

   public void aaa(class_310 var1) {
      this.bab(var1, true);
   }

   public boolean aab(class_3675.class_306 param1) {
      // $FF: Couldn't be decompiled
   }

   private void aba(class_310 param1, class_304 param2, boolean param3) {
      // $FF: Couldn't be decompiled
   }

   private static boolean abb(Map param0) {
      // $FF: Couldn't be decompiled
   }

   private void baa(class_304 param1, boolean param2, boolean param3) {
      // $FF: Couldn't be decompiled
   }

   private void bab(class_310 var1, boolean var2) {
      int var3 = q2997348aa27a422480aea29cbfd800b1aabaabaaa.bba;
      int var10000 = q2997348aa27a422480aea29cbfd800b1aabaabaaa.bb;
      Iterator var5 = Set.copyOf(this.a.keySet()).iterator();
      int var4 = var10000;

      label47:
      while(var5.hasNext()) {
         class_304 var6 = (class_304)var5.next();
         MatchException var10;
         if (var3 != 0) {
            try {
               if (var4 == 0) {
                  continue;
               }
            } catch (MatchException var9) {
               var10 = var9;
               boolean var10001 = false;
               throw var10;
            }

            if (var3 == 0) {
               break;
            }
         }

         while(true) {
            try {
               if (var4 != 0) {
                  return;
               }

               this.aba(var1, var6, var2);
            } catch (MatchException var7) {
               var10 = var7;
               boolean var11 = false;
               break;
            }

            try {
               if (var4 == 0) {
                  continue label47;
               }
            } catch (MatchException var8) {
               var10 = var8;
               boolean var12 = false;
               break;
            }

            if (var3 == 0) {
               break label47;
            }
         }

         throw var10;
      }

      this.a.clear();
      this.aa.clear();
   }

   private boolean bba(class_304 param1, boolean param2) {
      // $FF: Couldn't be decompiled
   }

   public boolean bbb(class_310 param1, class_304 param2) {
      // $FF: Couldn't be decompiled
   }

   public void aaaa(class_315 param1, class_744 param2) {
      // $FF: Couldn't be decompiled
   }

   private static Map aaab(class_304 var0) {
      return new IdentityHashMap();
   }

   private void aaba(Object param1, class_310 param2, class_304 param3) {
      // $FF: Couldn't be decompiled
   }

   public static q2997348aa27a422480aea29cbfd800b1aabbbbbb aabb() {
      return ab;
   }
}
