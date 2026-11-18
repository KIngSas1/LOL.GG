package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_4184;
import net.minecraft.class_4604;
import net.minecraft.class_757;
import org.joml.Matrix4f;

@Environment(EnvType.CLIENT)
public final class q2997348aa27a422480aea29cbfd800b1aabbbbbaa {
   public static final q2997348aa27a422480aea29cbfd800b1ababbbbab a = new q2997348aa27a422480aea29cbfd800b1ababbbbab();
   private static volatile q2997348aa27a422480aea29cbfd800b1bbbbbbaa b = new q2997348aa27a422480aea29cbfd800b1bbbbbbaa((class_4184)null, (class_757)null, (Matrix4f)null, (Matrix4f)null);
   private static volatile q2997348aa27a422480aea29cbfd800b1aabaabab aa = new q2997348aa27a422480aea29cbfd800b1aabaabab((class_4184)null, (class_4604)null, (class_757)null, (Matrix4f)null, (Matrix4f)null);

   public static void a(class_4184 var0, class_757 var1, Matrix4f var2, Matrix4f var3) {
      b = new q2997348aa27a422480aea29cbfd800b1bbbbbbaa(var0, var1, ab(var2), ab(var3));
   }

   private static Object aa(Object var0, Object var1) {
      int var2 = q2997348aa27a422480aea29cbfd800b1bbabab.aaab;

      Object var10000;
      label36: {
         try {
            try {
               var10000 = var0;
               if (var2 != 0) {
                  return var10000;
               }

               if (var0 != null) {
                  break label36;
               }
            } catch (IllegalStateException var3) {
               throw var3;
            }
         } catch (MatchException var4) {
            throw var4;
         }

         var10000 = var1;
         return var10000;
      }

      var10000 = var0;
      return var10000;
   }

   private static Matrix4f ab(Matrix4f var0) {
      Matrix4f var10000;
      try {
         try {
            if (var0 == null) {
               var10000 = null;
               return var10000;
            }
         } catch (IllegalStateException var1) {
            throw var1;
         }
      } catch (MatchException var2) {
         throw var2;
      }

      var10000 = new Matrix4f(var0);
      return var10000;
   }

   private q2997348aa27a422480aea29cbfd800b1aabbbbbaa() {
   }
}
