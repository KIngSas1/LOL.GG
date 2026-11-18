package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import java.util.Random;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_310;

@Environment(EnvType.CLIENT)
public final class q2997348aa27a422480aea29cbfd800b1bbbaabab {
   private static final float a = 2.0F;
   private static final float aa = 1.0E-4F;
   private final q2997348aa27a422480aea29cbfd800b1abaaaabb ab = new q2997348aa27a422480aea29cbfd800b1aabaaaaaa();
   float ba = -1.0F;
   private final Random bb = new Random();
   private final q2997348aa27a422480aea29cbfd800b1abaaaabb aaa = new q2997348aa27a422480aea29cbfd800b1bbaabba();
   private static final float aab = 0.15F;
   static final float b = 0.15F;

   Random a() {
      return this.bb;
   }

   public q2997348aa27a422480aea29cbfd800b1abbaaabab aa(q2997348aa27a422480aea29cbfd800b1abbaaabab var1, q2997348aa27a422480aea29cbfd800b1abbaaabab var2, boolean var3, float var4, float var5) {
      return this.aab(var1, var2, var3, var4, 10.0F, var5);
   }

   float ab() {
      return (float)(this.bb.nextDouble() * (double)0.3F - (double)0.15F);
   }

   public boolean ba(float param1) {
      // $FF: Couldn't be decompiled
   }

   void bb(long var1) {
      this.bb.setSeed(var1);
   }

   public void aaa() {
      int var1 = q2997348aa27a422480aea29cbfd800b1bbabab.b;
      q2997348aa27a422480aea29cbfd800b1abaaaabb var4 = this.aaa;
      int var2 = q2997348aa27a422480aea29cbfd800b1bbabab.aaab;

      Object var11;
      label52: {
         label69: {
            label48: {
               label56: {
                  try {
                     try {
                        var10000 = var4;
                        if (var2 != 0) {
                           break label48;
                        }

                        if (!(var4 instanceof q2997348aa27a422480aea29cbfd800b1bbaabba)) {
                           break label56;
                        }
                     } catch (IllegalStateException var9) {
                        throw var9;
                     }
                  } catch (MatchException var10) {
                     throw var10;
                  }

                  var11 = (q2997348aa27a422480aea29cbfd800b1bbaabba)var4;
                  if (var1 != 0) {
                     break label52;
                  }

                  Object var3 = var11;

                  try {
                     ((q2997348aa27a422480aea29cbfd800b1bbaabba)var3).b();
                     if (var2 == 0) {
                        break label69;
                     }
                  } catch (MatchException var7) {
                     var13 = var7;
                     boolean var14 = false;
                     throw var13;
                  } catch (IllegalStateException var8) {
                     var12 = var8;
                     boolean var10001 = false;
                     throw var12;
                  }
               }

               try {
                  var10000 = this.aaa;
               } catch (MatchException var5) {
                  var13 = var5;
                  boolean var16 = false;
                  throw var13;
               } catch (IllegalStateException var6) {
                  var12 = var6;
                  boolean var15 = false;
                  throw var12;
               }
            }

            var10000.baa();
         }

         var11 = this.ab;
      }

      ((q2997348aa27a422480aea29cbfd800b1abaaaabb)var11).baa();
      this.ba = -1.0F;
   }

   public q2997348aa27a422480aea29cbfd800b1abbaaabab aab(q2997348aa27a422480aea29cbfd800b1abbaaabab var1, q2997348aa27a422480aea29cbfd800b1abbaaabab var2, boolean var3, float var4, float var5, float var6) {
      q2997348aa27a422480aea29cbfd800b1abaaaabb var10000;
      label19: {
         try {
            try {
               if (var3) {
                  var10000 = this.aaa;
                  break label19;
               }
            } catch (IllegalStateException var8) {
               throw var8;
            }
         } catch (MatchException var9) {
            throw var9;
         }

         var10000 = this.ab;
      }

      q2997348aa27a422480aea29cbfd800b1abaaaabb var7 = var10000;
      return var7.aab(var1, var2, var4, var5, var6);
   }

   public static float aba(class_310 param0) {
      // $FF: Couldn't be decompiled
   }
}
