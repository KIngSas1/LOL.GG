package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public final class q2997348aa27a422480aea29cbfd800b1b extends q2997348aa27a422480aea29cbfd800b1bbaababb {
   private static final long[] aa;
   private static volatile q2997348aa27a422480aea29cbfd800b1b ab;
   private static final String[] aab;
   private static final Object[] aba;
   private static final Integer[] a;
   private static final int[] aaa;
   private static final String[] ba;
   private static final String[] bb;

   static q2997348aa27a422480aea29cbfd800b1b aa() {
      int var0 = q2997348aa27a422480aea29cbfd800b1bbabab.b;
      q2997348aa27a422480aea29cbfd800b1b var2 = ab;
      int var1 = q2997348aa27a422480aea29cbfd800b1bbabab.aaab;

      q2997348aa27a422480aea29cbfd800b1b var10000;
      label195: {
         try {
            try {
               var10000 = var2;
               if (var1 != 0) {
                  return var10000;
               }

               if (var2 != null) {
                  break label195;
               }
            } catch (IllegalStateException var17) {
               throw var17;
            }
         } catch (MatchException var18) {
            throw var18;
         }

         Class var3;
         Class var23 = var3 = q2997348aa27a422480aea29cbfd800b1b.class;

         label188: {
            label187: {
               try {
                  synchronized(var23){}
                  if (var0 != 0) {
                     break label187;
                  }

                  if (var1 != 0) {
                     break label195;
                  }
               } catch (MatchException var22) {
                  throw var22;
               }

               try {
                  var2 = ab;
               } catch (Throwable var21) {
                  var24 = var21;
                  boolean var10001 = false;
                  break label188;
               }
            }

            label180:
            try {
               label175: {
                  try {
                     if (var0 != 0) {
                        break label175;
                     }

                     if (var2 != null) {
                        break label195;
                     }
                  } catch (MatchException var19) {
                     throw var19;
                  }

                  var2 = new q2997348aa27a422480aea29cbfd800b1b();
               }

               ab = var2;
               break label195;
            } catch (Throwable var20) {
               var24 = var20;
               boolean var25 = false;
               break label180;
            }
         }

         Throwable var4 = var24;
         throw var4;
      }

      var10000 = var2;
      return var10000;
   }

   private static int ab(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ b(575143329, -613636008 ^ -1399380140);
      if (a[var3] == null) {
         a[var3] = (int)(aa[var3] ^ var1);
      }

      return a[var3];
   }

   private static String ba(char var0, char var1, int var2) {
      int var3 = var0 ^ 9455;
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
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 18069;
      int var9 = 0;

      do {
         int var10 = var4[var9] ^ 25825;
         var10 -= 45037;
         var10 += 43263;
         var10 ^= 65066;
         var10 -= 63476;
         var10 ^= 14273;
         var4[var9] = (char)(var10 ^ var8 ^ var1 ^ var2 >> 16);
         ++var9;
      } while(var9 < var4.length);

      return (new String(var4)).intern();
   }

   private q2997348aa27a422480aea29cbfd800b1b() {
      super((Object)q2997348aa27a422480aea29cbfd800b1bbbbbbab.abbb(a(ab(b(575143328, 1849305652 ^ 1470239490), 3995441149791815134L), ab(b(575143331, 1849305652 ^ -1201350691), 314044715911504858L))), q2997348aa27a422480aea29cbfd800b1aabbaaaaa.bbb, (Object)q2997348aa27a422480aea29cbfd800b1bbbbbbab.abbb(a(ab(b(575143330, 1849305652 ^ 469780371), 7601454695142629867L), ab(b(575143333, 1849305652 ^ -1791526448), 8038686712939199279L))));
   }

   static {
      // $FF: Couldn't be decompiled
   }

   private static int b(int var0, int var1) {
      int var2 = aaa[var0 ^ 575143329] ^ var1 ^ var0;
      var2 ^= 20850;
      var2 += 9194;
      var2 -= 53837;
      var2 ^= 16743;
      var2 ^= 56139;
      var2 += 50276;
      var2 -= 48044;
      var2 -= 1609;
      var2 ^= 17694;
      var2 += 2217;
      return var2;
   }

   private static String a(int param0, int param1) {
      // $FF: Couldn't be decompiled
   }
}
