package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_2596;

@Environment(EnvType.CLIENT)
public final class q2997348aa27a422480aea29cbfd800b1abaaaaaa extends q2997348aa27a422480aea29cbfd800b1bbaababb {
   private static final long[] aa;
   private static final int[] a;
   private static final Object[] aba;
   private static final String[] ab;
   private static final Integer[] ba;
   private static final String[] aab;
   private static final String[] bb;
   private static volatile q2997348aa27a422480aea29cbfd800b1abaaaaaa aaa;

   private static int aa(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ b(1715404556, 1647173601 ^ 52673775);
      if (ba[var3] == null) {
         ba[var3] = (int)(aa[var3] ^ var1);
      }

      return ba[var3];
   }

   private static String bb(char var0, int var1, char var2) {
      int var3 = var0 ^ 29421;
      char[] var4 = aab[var3].toCharArray();
      StackTraceElement[] var5 = (StackTraceElement[])aba[var3];
      StackTraceElement[] var6;
      if (var5 != null) {
         var6 = var5;
      } else {
         var6 = (new Throwable()).getStackTrace();
         aba[var3] = var6;
      }

      StackTraceElement var7 = var6[1];
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 10485;
      int var9 = 0;

      do {
         int var10 = var4[var9] - 9573;
         var10 -= 61186;
         var10 ^= 46559;
         var10 -= 62787;
         var10 ^= 18029;
         var10 += 11159;
         var4[var9] = (char)(var10 ^ var8 ^ var2 ^ var1 >> 16);
         ++var9;
      } while(var9 < var4.length);

      return (new String(var4)).intern();
   }

   private q2997348aa27a422480aea29cbfd800b1abaaaaaa() {
      super((Object)q2997348aa27a422480aea29cbfd800b1bbbbbbab.abbb(ba(aa(b(1715404557, -1753192543 ^ -2014223343), 8187331948273584466L), aa(b(1715404558, -1753192543 ^ 638375503), 1847491156315752412L))), q2997348aa27a422480aea29cbfd800b1aabbaaaaa.bbb, (Object)q2997348aa27a422480aea29cbfd800b1bbbbbbab.abbb(ba(aa(b(1715404559, -1753192543 ^ -1679506495), 3467828201478586259L), aa(b(1715404552, -1753192543 ^ -1827423154), 3317103789606755681L))));
   }

   static {
      // $FF: Couldn't be decompiled
   }

   static q2997348aa27a422480aea29cbfd800b1abaaaaaa a() {
      int var0 = q2997348aa27a422480aea29cbfd800b1bbabab.b;
      q2997348aa27a422480aea29cbfd800b1abaaaaaa var2 = aaa;
      int var1 = q2997348aa27a422480aea29cbfd800b1bbabab.aaab;

      q2997348aa27a422480aea29cbfd800b1abaaaaaa var10000;
      label188: {
         try {
            try {
               var10000 = var2;
               if (var1 != 0) {
                  return var10000;
               }

               if (var2 != null) {
                  break label188;
               }
            } catch (IllegalStateException var15) {
               throw var15;
            }
         } catch (MatchException var16) {
            throw var16;
         }

         label192: {
            Class var3;
            Class var20 = var3 = q2997348aa27a422480aea29cbfd800b1abaaaaaa.class;
            if (var1 == 0) {
               synchronized(q2997348aa27a422480aea29cbfd800b1abaaaaaa.class){}

               try {
                  var2 = aaa;

                  label175: {
                     label174: {
                        try {
                           if (var0 != 0) {
                              break label174;
                           }

                           if (var2 != null) {
                              break label175;
                           }
                        } catch (MatchException var18) {
                           throw var18;
                        }

                        var2 = new q2997348aa27a422480aea29cbfd800b1abaaaaaa();
                     }

                     aaa = var2;
                  }

                  var20 = var3;
               } catch (Throwable var19) {
                  var21 = var19;
                  boolean var10001 = false;
                  break label192;
               }
            }

            label163:
            try {
               break label188;
            } catch (Throwable var17) {
               var21 = var17;
               boolean var22 = false;
               break label163;
            }
         }

         Throwable var4 = var21;
         throw var4;
      }

      var10000 = var2;
      return var10000;
   }

   public boolean ab(class_2596 var1) {
      return false;
   }

   private static int b(int var0, int var1) {
      int var2 = a[var0 ^ 1715404556] ^ var1 ^ var0;
      var2 ^= 53224;
      var2 -= 63049;
      var2 -= 45321;
      var2 ^= 14918;
      var2 -= 60687;
      var2 += 48290;
      var2 ^= 16293;
      var2 ^= 58689;
      return var2;
   }

   private static String ba(int param0, int param1) {
      // $FF: Couldn't be decompiled
   }
}
