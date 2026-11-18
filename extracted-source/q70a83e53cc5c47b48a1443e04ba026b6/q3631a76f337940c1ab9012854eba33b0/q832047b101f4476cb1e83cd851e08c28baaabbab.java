package q70a83e53cc5c47b48a1443e04ba026b6.q3631a76f337940c1ab9012854eba33b0;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_10017;
import net.minecraft.class_11659;
import net.minecraft.class_11785;
import net.minecraft.class_12075;
import net.minecraft.class_12249;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_243;
import net.minecraft.class_2561;
import net.minecraft.class_310;
import net.minecraft.class_327;
import net.minecraft.class_4587;
import net.minecraft.class_4588;
import net.minecraft.class_5250;
import net.minecraft.class_897;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644.q2997348aa27a422480aea29cbfd800b1aaaba;
import q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644.q2997348aa27a422480aea29cbfd800b1aabbabab;
import q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644.q2997348aa27a422480aea29cbfd800b1aabbbb;
import q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644.q2997348aa27a422480aea29cbfd800b1bbbbbbab;

@Environment(EnvType.CLIENT)
@Mixin({class_897.class})
public abstract class q832047b101f4476cb1e83cd851e08c28baaabbab {
   private static final long b;

   @Inject(
      method = {"method_3926"},
      at = {@At("HEAD")}
   )
   private void a(class_10017 var1, class_4587 var2, class_11659 var3, class_12075 var4, CallbackInfo var5) {
      var1.field_53337 = this.abb(var1, var1.field_53337);
   }

   private void b(class_11659 var1, class_4587 var2, class_243 var3, int var4, int var5, class_12075 var6, class_2561 var7, q2997348aa27a422480aea29cbfd800b1aabbbb var8) {
      class_327 var9 = this.method_3932();
      if (var1 != null && var2 != null && var6 != null && var9 != null && var7 != null && var8 != null) {
         int var10 = var9.method_27525(var7);
         float var11 = (float)(-var10) / 2.0F;
         float var10000 = (float)var4;
         Objects.requireNonNull(var9);
         float var12 = var10000 + (9.0F - var8.ab()) / 2.0F;
         float var13 = var8.bba();
         float var14 = var8.ab();
         var2.method_22903();
         var2.method_22904(var3.field_1352, var3.field_1351 + (double)0.5F, var3.field_1350);
         var2.method_22907(var6.field_63081);
         var2.method_22905(0.025F, -0.025F, 0.025F);
         var1.method_73483(var2, class_12249.method_76000(var8.aba()), this::bb);
         var2.method_22909();
      }
   }

   private void aa(class_4588 var1, class_4587.class_4665 var2, float var3, float var4, float var5, float var6, int var7) {
      var1.method_56824(var2, var3, var4 + var6, 0.0F).method_22913(0.0F, 1.0F).method_39415(-1).method_60803(var7);
      var1.method_56824(var2, var3 + var5, var4 + var6, 0.0F).method_22913(1.0F, 1.0F).method_39415(-1).method_60803(var7);
      var1.method_56824(var2, var3 + var5, var4, 0.0F).method_22913(1.0F, 0.0F).method_39415(-1).method_60803(var7);
      var1.method_56824(var2, var3, var4, 0.0F).method_22913(0.0F, 0.0F).method_39415(-1).method_60803(var7);
   }

   private static class_1297 ab(Object var0) {
      if (var0 == null) {
         return null;
      } else {
         class_1297 var1 = aaa(var0);
         if (var1 != null) {
            return var1;
         } else {
            Integer var2 = ba(var0);
            if (var2 == null) {
               return null;
            } else {
               class_310 var3 = class_310.method_1551();
               return var3 != null && var3.field_1687 != null ? var3.field_1687.method_8469(var2) : null;
            }
         }
      }
   }

   private static Integer ba(Object var0) {
      class_310 var1 = class_310.method_1551();
      if (var1 == null) {
         return null;
      } else {
         ArrayList var2 = new ArrayList();

         for(Field var4 : baa(var0.getClass())) {
            Class var5 = var4.getType();
            if (var5 == Integer.TYPE || var5 == Integer.class) {
               try {
                  var4.setAccessible(true);
                  Object var6 = var4.get(var0);
                  if (var6 instanceof Integer) {
                     Integer var7 = (Integer)var6;
                     if (var7 >= 0) {
                        String var8 = var4.getName().toLowerCase();
                        if ((var8.equals(q2997348aa27a422480aea29cbfd800b1bbbbbbab.bbb("gt4J4Q==")) || var8.contains(q2997348aa27a422480aea29cbfd800b1bbbbbbab.bbb("OmZw7TRhW3o1DQ==")) || var8.contains(q2997348aa27a422480aea29cbfd800b1bbbbbbab.bbb("8q47b1VdYQ8jvw4="))) && (var1.field_1687 == null || var1.field_1687.method_8469(var7) != null)) {
                           return var7;
                        }

                        var2.add(var7);
                     }
                  }
               } catch (ReflectiveOperationException var9) {
               }
            }
         }

         if (var1.field_1687 != null) {
            for(Integer var11 : var2) {
               if (var1.field_1687.method_8469(var11) != null) {
                  return var11;
               }
            }
         }

         if (!var2.isEmpty()) {
            return (Integer)var2.get(0);
         } else {
            return null;
         }
      }
   }

   private void bb(float var1, float var2, float var3, float var4, int var5, class_4587.class_4665 var6, class_4588 var7) {
      this.aa(var7, var6, var1, var2, var3, var4, var5);
   }

   @Shadow
   public abstract class_327 method_3932();

   private static class_1297 aaa(Object var0) {
      for(Field var2 : baa(var0.getClass())) {
         if (class_1297.class.isAssignableFrom(var2.getType())) {
            try {
               var2.setAccessible(true);
               Object var3 = var2.get(var0);
               if (var3 instanceof class_1297) {
                  class_1297 var4 = (class_1297)var3;
                  return var4;
               }
            } catch (ReflectiveOperationException var5) {
            }
         }
      }

      return null;
   }

   private class_2561 aab(class_2561 var1, int var2) {
      class_327 var3 = this.method_3932();
      if (var1 != null && var3 != null && var2 > 0) {
         StringBuilder var4 = new StringBuilder(q2997348aa27a422480aea29cbfd800b1bbbbbbab.bbb("5bnO"));
         class_5250 var5 = class_2561.method_43470(var4.toString()).method_10852(var1.method_27661());

         for(int var6 = var3.method_27525(var1); var3.method_27525(var5) - var6 < var2; var5 = class_2561.method_43470(var4.toString()).method_10852(var1.method_27661())) {
            var4.append((char)((int)b));
         }

         return var5;
      } else {
         return var1;
      }
   }

   @Redirect(
      method = {"method_3926"},
      at = @At(
   value = "INVOKE",
   target = "Lnet/minecraft/class_11785;method_73482(Lnet/minecraft/class_4587;Lnet/minecraft/class_243;ILnet/minecraft/class_2561;ZIDLnet/minecraft/class_12075;)V"
)
   )
   private void aba(class_11785 var1, class_4587 var2, class_243 var3, int var4, class_2561 var5, boolean var6, int var7, double var8, class_12075 var10, class_10017 var11, class_4587 var12, class_11659 var13, class_12075 var14) {
      class_2561 var15 = this.abb(var11, var5);
      q2997348aa27a422480aea29cbfd800b1aabbbb var16 = q2997348aa27a422480aea29cbfd800b1aaaba.bbb(var5);
      if (var16 == null) {
         var1.method_73482(var2, var3, var4, var15, var6, var7, var8, var10);
      } else {
         class_2561 var17 = this.aab(var15, var16.bab());
         this.b(var13, var12, var3, var4, var7, var14, var17, var16);
         var1.method_73482(var2, var3, var4, var17, var6, var7, var8, var10);
      }
   }

   static {
      long var1 = 4500931494037489568L;
      long[] var0 = new long[2];
      int var4 = 0;
      String var5 = "o\"É\u0006ÌE{ö\u001fþ\u0096\u0087ÌE{Ö";
      int var6 = "o\"É\u0006ÌE{ö\u001fþ\u0096\u0087ÌE{Ö".length();
      int var3 = 0;

      do {
         int var10001 = var3;
         var3 += 8;
         byte[] var7 = var5.substring(var10001, var3).getBytes("ISO-8859-1");
         var10001 = var4++;
         long var10004 = (((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L) ^ var1;
         boolean var10003 = true;
         var0[var10001] = var10004;
      } while(var3 < var6);

      long var8 = var0[1];
      long var10002 = var0[0] ^ var8;
      boolean var11 = true;
      b = var10002;
   }

   private class_2561 abb(class_10017 var1, class_2561 var2) {
      if (var2 == null) {
         return null;
      } else {
         boolean var3 = q2997348aa27a422480aea29cbfd800b1aabbabab.ab();
         boolean var4 = q2997348aa27a422480aea29cbfd800b1aaaba.baba();
         if (!var3 && !var4) {
            return var2;
         } else {
            class_2561 var5 = var2;
            if (var3) {
               class_1297 var6 = ab(var1);
               class_2561 var10000;
               if (var6 instanceof class_1657) {
                  class_1657 var7 = (class_1657)var6;
                  var10000 = q2997348aa27a422480aea29cbfd800b1aabbabab.a(var7.method_7334(), var2);
               } else {
                  var10000 = q2997348aa27a422480aea29cbfd800b1aabbabab.aa(var2);
               }

               var5 = var10000;
            }

            return var4 ? q2997348aa27a422480aea29cbfd800b1aaaba.bbbb(var5) : var5;
         }
      }
   }

   private static List baa(Class var0) {
      ArrayList var1 = new ArrayList();

      for(Class var2 = var0; var2 != null && var2 != Object.class; var2 = var2.getSuperclass()) {
         Field[] var3 = var2.getDeclaredFields();

         for(Field var7 : var3) {
            var1.add(var7);
         }
      }

      return var1;
   }
}
