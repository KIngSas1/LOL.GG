package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1799;
import net.minecraft.class_1842;
import net.minecraft.class_1844;
import net.minecraft.class_2960;
import net.minecraft.class_6880;
import net.minecraft.class_746;
import net.minecraft.class_7923;
import net.minecraft.class_9334;

@Environment(EnvType.CLIENT)
public final class q2997348aa27a422480aea29cbfd800b1bbabbbbb extends q2997348aa27a422480aea29cbfd800b1bbaababb {
   private final q2997348aa27a422480aea29cbfd800b1aaabbaab aa;
   private static final Integer[] ba;
   private static final Integer[] bb;
   private final q2997348aa27a422480aea29cbfd800b1abaaaaabb aaa;
   private final q2997348aa27a422480aea29cbfd800b1aaabbaab aab;
   private static final int aba;
   private q2997348aa27a422480aea29cbfd800b1baaaaaba a;
   private static final int[] abab;
   private final q2997348aa27a422480aea29cbfd800b1aaabbaab abb;
   private static final Long[] baa;
   private static final long[] ab;
   private static final long[] bab;
   private static final String[] bba;
   private static final long[] bbb;
   private q2997348aa27a422480aea29cbfd800b1baaaaaba aaaa;
   private static final Object[] abbb;
   private int aaab;
   private final q2997348aa27a422480aea29cbfd800b1aaabbaab aaba;
   private static final String[] aabb;
   private static final String[] abba;
   private final q2997348aa27a422480aea29cbfd800b1aaabbaab abaa;

   private static long aa(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ a(-679057832, -1827233268 ^ -505707016)) & a(-679057831, -1827233268 ^ -705191724);
      if (baa[var3] == null) {
         baa[var3] = ab[var3] ^ var1;
      }

      return baa[var3];
   }

   static {
      // $FF: Couldn't be decompiled
   }

   public String abbaa() {
      // $FF: Couldn't be decompiled
   }

   private static q2997348aa27a422480aea29cbfd800b1baaaaaba ab(class_746 param0) {
      // $FF: Couldn't be decompiled
   }

   public void ba(q2997348aa27a422480aea29cbfd800b1aaabbaab param1, boolean param2) {
      // $FF: Couldn't be decompiled
   }

   private static String bb(int param0, int param1) {
      // $FF: Couldn't be decompiled
   }

   private void aaa(q2997348aa27a422480aea29cbfd800b1baaaaaba param1) {
      // $FF: Couldn't be decompiled
   }

   private static boolean aab(class_1799 var0, String var1) {
      int var10000 = q2997348aa27a422480aea29cbfd800b1aabaabaaa.bb;
      class_1844 var3 = (class_1844)var0.method_58694(class_9334.field_49651);
      int var2 = var10000;

      label101: {
         label83: {
            label82: {
               try {
                  try {
                     var13 = var3;
                     if (var2 != 0) {
                        break label82;
                     }

                     if (var3 == null) {
                        break label83;
                     }
                  } catch (IllegalStateException var11) {
                     throw var11;
                  }
               } catch (MatchException var12) {
                  throw var12;
               }

               var13 = var3;
            }

            try {
               try {
                  var10000 = var13.comp_2378().isPresent();
                  if (var2 != 0) {
                     return (boolean)var10000;
                  }

                  if (var10000) {
                     break label101;
                  }
               } catch (IllegalStateException var9) {
                  throw var9;
               }
            } catch (MatchException var10) {
               throw var10;
            }
         }

         var10000 = 0;
         return (boolean)var10000;
      }

      class_2960 var4 = class_7923.field_41179.method_10221((class_1842)((class_6880)var3.comp_2378().get()).comp_349());

      label102: {
         label62: {
            label61: {
               try {
                  try {
                     var15 = var4;
                     if (var2 != 0) {
                        break label61;
                     }

                     if (var4 == null) {
                        break label62;
                     }
                  } catch (IllegalStateException var7) {
                     throw var7;
                  }
               } catch (MatchException var8) {
                  throw var8;
               }

               var15 = var4;
            }

            try {
               try {
                  var10000 = var15.method_12832().contains(var1);
                  if (var2 != 0) {
                     return (boolean)var10000;
                  }

                  if (var10000) {
                     break label102;
                  }
               } catch (IllegalStateException var5) {
                  throw var5;
               }
            } catch (MatchException var6) {
               throw var6;
            }
         }

         var10000 = 0;
         return (boolean)var10000;
      }

      var10000 = 1;
      return (boolean)var10000;
   }

   public void aabaa() {
      this.aaaa = null;
      this.a = null;
      this.aaab = 0;
   }

   private static String b(int var0, int var1, char var2) {
      int var3 = var1 ^ '駧';
      char[] var4 = abba[var3].toCharArray();
      StackTraceElement[] var5 = (StackTraceElement[])abbb[var3];
      StackTraceElement[] var6;
      if (var5 != null) {
         var6 = var5;
      } else {
         var6 = (new Throwable()).getStackTrace();
         abbb[var3] = var6;
      }

      StackTraceElement var7 = var6[1];
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 18821;
      int var9 = 0;

      do {
         int var10 = var4[var9] - 10652;
         var10 -= 32152;
         var10 += 11946;
         var10 -= 19391;
         var10 += 9940;
         var10 -= 31217;
         var10 ^= 58537;
         var10 ^= 62887;
         var10 += 35929;
         var10 ^= 16139;
         var4[var9] = (char)(var10 ^ var8 ^ var2 ^ var0 >> 16);
         ++var9;
      } while(var9 < var4.length);

      return (new String(var4)).intern();
   }

   private static int aba(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & aa(a(-679057664, -1148350000 ^ -1027123067), 175138084445334654L)) ^ abb(a(-679057663, -1148350000 ^ 1712160809), 7420703205720901851L);

      try {
         if (bb[var3] == null) {
            bb[var3] = (int)(bbb[var3] ^ var1);
         }
      } catch (MatchException var4) {
         throw var4;
      }

      return bb[var3];
   }

   private static int a(int var0, int var1) {
      int var2 = abab[var0 ^ -679057832] ^ var1 ^ var0;
      var2 -= 48659;
      var2 += 56359;
      var2 -= 52751;
      var2 ^= 55442;
      var2 += 37960;
      var2 -= 61698;
      var2 += 44796;
      var2 -= 10760;
      var2 += 34369;
      var2 -= 50485;
      return var2;
   }

   public q2997348aa27a422480aea29cbfd800b1bbabbbbb() {
      int var1 = 83332559;
      super((Object)q2997348aa27a422480aea29cbfd800b1bbbbbbab.abbb(bb(abb(a(-679057662, var1 ^ 636830970), 5282616606061736588L), abb(a(-679057661, var1 ^ 1754304576), 607511652059067458L))), q2997348aa27a422480aea29cbfd800b1aabbaaaaa.abb, (Object)q2997348aa27a422480aea29cbfd800b1bbbbbbab.abbb(bb(abb(a(-679057660, var1 ^ -912369160), 7366676325007906681L), abb(a(-679057659, var1 ^ 885293254), 7597399500826001482L))));
      this.aa = (q2997348aa27a422480aea29cbfd800b1aaabbaab)this.aaabbbbb(new q2997348aa27a422480aea29cbfd800b1aaabbaab(q2997348aa27a422480aea29cbfd800b1bbbbbbab.abbb(bb(abb(a(-679057658, var1 ^ -170643017), 938192382675505813L), abb(a(-679057657, var1 ^ -351825696), 268786847113048603L))), ""));
      this.aab = (q2997348aa27a422480aea29cbfd800b1aaabbaab)this.aaabbbbb(new q2997348aa27a422480aea29cbfd800b1aaabbaab(q2997348aa27a422480aea29cbfd800b1bbbbbbab.abbb(bb(abb(a(-679057608, var1 ^ -818157431), 4626932197494826992L), abb(a(-679057607, var1 ^ -1442913795), 5106429000202571476L))), ""));
      this.aaba = (q2997348aa27a422480aea29cbfd800b1aaabbaab)this.aaabbbbb(new q2997348aa27a422480aea29cbfd800b1aaabbaab(q2997348aa27a422480aea29cbfd800b1bbbbbbab.abbb(bb(abb(a(-679057606, var1 ^ -1385626646), 7765293807085082977L), abb(a(-679057605, var1 ^ 397335881), 6939136000684406013L))), ""));
      this.abaa = (q2997348aa27a422480aea29cbfd800b1aaabbaab)this.aaabbbbb(new q2997348aa27a422480aea29cbfd800b1aaabbaab(q2997348aa27a422480aea29cbfd800b1bbbbbbab.abbb(bb(abb(a(-679057604, var1 ^ -1038890088), 3874194115038479633L), abb(a(-679057603, var1 ^ -2116676313), 8107291269503231884L))), ""));
      this.abb = (q2997348aa27a422480aea29cbfd800b1aaabbaab)this.aaabbbbb(new q2997348aa27a422480aea29cbfd800b1aaabbaab(q2997348aa27a422480aea29cbfd800b1bbbbbbab.abbb(bb(abb(a(-679057602, var1 ^ -1126303692), 8626394584466805476L), abb(a(-679057601, var1 ^ -541180755), 2659532905966079592L))), ""));
      this.aaa = (q2997348aa27a422480aea29cbfd800b1abaaaaabb)this.aaabbbbb((new q2997348aa27a422480aea29cbfd800b1abaaaaabb(q2997348aa27a422480aea29cbfd800b1bbbbbbab.abbb(bb(abb(a(-679057616, var1 ^ 771292908), 1199737813453052927L), abb(a(-679057615, var1 ^ -1743146693), 7542585119733347634L))), (double)20.0F, (double)5.0F, (double)100.0F, (double)5.0F)).aba(q2997348aa27a422480aea29cbfd800b1bbbbbbab.abbb(bb(abb(a(-679057614, var1 ^ -1288070709), 4304343147238133580L), abb(a(-679057613, var1 ^ 140460348), 3740187558429070436L)))));
   }

   private static int abb(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ a(-679057612, -1877132066 ^ 587651597);
      if (ba[var3] == null) {
         ba[var3] = (int)(bab[var3] ^ var1);
      }

      return ba[var3];
   }

   public void baba() {
      // $FF: Couldn't be decompiled
   }

   private String baa(q2997348aa27a422480aea29cbfd800b1baaaaaba var1) {
      String var10000;
      label55: {
         label56: {
            label57: {
               label58: {
                  try {
                     try {
                        switch (var1.ordinal()) {
                           case 0 -> { }
                           case 1 -> { }
                           case 2 -> { }
                           case 3 -> { }
                           case 4 -> { }
                           default -> throw new MatchException((String)null, (Throwable)null);
                        }
                     } catch (IllegalStateException var2) {
                        throw var2;
                     }
                  } catch (MatchException var3) {
                     throw var3;
                  }

                  var10000 = this.abb.aab();
                  return var10000;
               }

               var10000 = this.abaa.aab();
               return var10000;
            }

            var10000 = this.aaba.aab();
            return var10000;
         }

         var10000 = this.aab.aab();
         return var10000;
      }

      var10000 = this.aa.aab();
      return var10000;
   }
}
