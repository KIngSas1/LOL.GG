package q70a83e53cc5c47b48a1443e04ba026b6.q3631a76f337940c1ab9012854eba33b0;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1297;
import net.minecraft.class_2616;
import net.minecraft.class_2663;
import net.minecraft.class_2664;
import net.minecraft.class_2672;
import net.minecraft.class_2743;
import net.minecraft.class_2767;
import net.minecraft.class_310;
import net.minecraft.class_634;
import net.minecraft.class_8143;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644.q2997348aa27a422480aea29cbfd800b1aababbaab;
import q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644.q2997348aa27a422480aea29cbfd800b1aababbbbb;
import q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644.q2997348aa27a422480aea29cbfd800b1aabbbab;
import q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644.q2997348aa27a422480aea29cbfd800b1abbaaaba;
import q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644.q2997348aa27a422480aea29cbfd800b1babbbbbb;
import q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644.q2997348aa27a422480aea29cbfd800b1bbbbbbab;

@Environment(EnvType.CLIENT)
@Mixin({class_634.class})
public abstract class q832047b101f4476cb1e83cd851e08c28babb {
   private static final Long[] aa;
   private static final long[] ab;
   private static final long[] ba;
   private static final long[] a;
   private static final Integer[] bb;
   private static final Integer[] aaa;

   private static int aa(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 3806;
      if (bb[var3] == null) {
         bb[var3] = (int)(a[var3] ^ var1);
      }

      return bb[var3];
   }

   @Inject(
      method = {"method_11148"},
      at = {@At("TAIL")}
   )
   private void b(class_2663 var1, CallbackInfo var2) {
      q2997348aa27a422480aea29cbfd800b1babbbbbb var3 = q2997348aa27a422480aea29cbfd800b1babbbbbb.aaba();
      if (var3 != null) {
         class_310 var4 = class_310.method_1551();
         if (var4.field_1687 != null) {
            class_1297 var5 = var1.method_11469(var4.field_1687);
            if (var5 != null && var3.aab() != null) {
               var3.aab().abbbbb(var5, var1.method_11470());
            }

            if (var1.method_11470() == baa(aa(31683, 6670007748715705623L), ab(8706, 3003718288389828986L))) {
               if (var4.field_1724 != null && var5 != null && var5.method_5628() == var4.field_1724.method_5628()) {
                  q2997348aa27a422480aea29cbfd800b1aababbbbb var6 = var3.aab().ababa();
                  if (var6 != null) {
                     var6.aabb();
                  }
               }

            }
         }
      }
   }

   private static long ab(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ 21368) & 32767;
      if (aa[var3] == null) {
         aa[var3] = ab[var3] ^ var1;
      }

      return aa[var3];
   }

   @Inject(
      method = {"method_49034"},
      at = {@At("TAIL")}
   )
   private void ba(class_8143 var1, CallbackInfo var2) {
      q2997348aa27a422480aea29cbfd800b1babbbbbb var3 = q2997348aa27a422480aea29cbfd800b1babbbbbb.aaba();
      if (var3 != null && var3.aab() != null) {
         class_310 var4 = class_310.method_1551();
         if (var4.field_1724 != null && var4.field_1687 != null && var1.comp_1267() == var4.field_1724.method_5628()) {
            var3.aab().babbba(var4, var1.method_49071(var4.field_1687));
            q2997348aa27a422480aea29cbfd800b1aababbaab var5 = var3.aab().aaaaaba();
            if (var5 != null && var5.bbaabbb()) {
               var5.bb(var1.method_49071(var4.field_1687));
            }

         }
      }
   }

   @Inject(
      method = {"method_45729"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void bb(String var1, CallbackInfo var2) {
      if (q2997348aa27a422480aea29cbfd800b1bbbbbbab.abbb("dCgVI1awhb8MEDxoVgi/xgjcEPKXZ0t+TUhnIBDJdgfHDMayyiEQ").babb(var1)) {
         var2.cancel();
         q2997348aa27a422480aea29cbfd800b1babbbbbb var3 = q2997348aa27a422480aea29cbfd800b1babbbbbb.aaba();
         if (var3 != null) {
            var3.baba().aabaa(q2997348aa27a422480aea29cbfd800b1abbaaaba.baaaaab(baa(aa(15703, 6125769113283376011L), ab(6530, 5226621440035736312L))));
            var3.aba();
         }

      }
   }

   @Inject(
      method = {"method_11124"},
      at = {@At("TAIL")},
      require = 1
   )
   private void aaa(class_2664 var1, CallbackInfo var2) {
      class_310 var3 = class_310.method_1551();
      q2997348aa27a422480aea29cbfd800b1babbbbbb var4 = q2997348aa27a422480aea29cbfd800b1babbbbbb.aaba();
      if (var4 != null && var4.aab() != null && var3.field_1724 != null && var3.field_1687 != null && var1.comp_2884().isPresent()) {
         var4.aab().aabaabb(var3);
      }

   }

   static {
      long var8 = 6203619349959479990L;
      long[] var14 = new long[12];
      int var11 = 0;
      String var12 = "\f\u008f\u0089\u001b\u000e\u0092pë=,eàCöÙ§ä$\tõ¹Cß \u0010÷\u007fø\u0085á\u0094¨jÖTµW8kúO7\u001fÓæ1 ³¾}\u009enÅ\bÈØ7]OUrDöï\u000e½\\¿-Fí\u0010pØ\u0017\u0082¬t+ã";
      int var13 = "\f\u008f\u0089\u001b\u000e\u0092pë=,eàCöÙ§ä$\tõ¹Cß \u0010÷\u007fø\u0085á\u0094¨jÖTµW8kúO7\u001fÓæ1 ³¾}\u009enÅ\bÈØ7]OUrDöï\u000e½\\¿-Fí\u0010pØ\u0017\u0082¬t+ã".length();
      int var10 = 0;

      label47:
      while(true) {
         int var10001 = var10;
         var10 += 8;
         byte[] var15 = var12.substring(var10001, var10).getBytes("ISO-8859-1");
         long[] var10000 = var14;
         var10001 = var11++;
         long var10002 = ((long)var15[0] & 255L) << 56 | ((long)var15[1] & 255L) << 48 | ((long)var15[2] & 255L) << 40 | ((long)var15[3] & 255L) << 32 | ((long)var15[4] & 255L) << 24 | ((long)var15[5] & 255L) << 16 | ((long)var15[6] & 255L) << 8 | (long)var15[7] & 255L;
         byte var10003 = -1;

         while(true) {
            long var41 = var10002 ^ var8;
            switch (var10003) {
               case 0:
                  var10000[var10001] = var41;
                  if (var10 >= var13) {
                     a = var14;
                     bb = new Integer[12];
                     long var0 = 8864966056563394200L;
                     long[] var6 = new long[6];
                     int var3 = 0;
                     String var4 = "\u000eF?x\u009c\u009e¼77[ìRiÿ\u009bì-N\u001cK.2Ó \u0001-\u0004\u0000\u0018Ö\u009aI";
                     int var5 = "\u000eF?x\u009c\u009e¼77[ìRiÿ\u009bì-N\u001cK.2Ó \u0001-\u0004\u0000\u0018Ö\u009aI".length();
                     int var2 = 0;

                     label37:
                     while(true) {
                        var10001 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
                        var10000 = var6;
                        var10001 = var3++;
                        var10002 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                        var10003 = -1;

                        while(true) {
                           var41 = var10002 ^ var0;
                           switch (var10003) {
                              case 0:
                                 var10000[var10001] = var41;
                                 if (var2 >= var5) {
                                    ab = var6;
                                    aa = new Long[6];
                                    long var16 = ab(21819, 4069144776216446528L);
                                    long[] var22 = new long[2];
                                    int var19 = 0;
                                    String var20 = "\u0080\u009a9Äª\u009dQgýÑ>¦l%\u0084\t";
                                    int var21 = "\u0080\u009a9Äª\u009dQgýÑ>¦l%\u0084\t".length();
                                    int var18 = 0;

                                    do {
                                       var10001 = var18;
                                       var18 += 8;
                                       byte[] var23 = var20.substring(var10001, var18).getBytes("ISO-8859-1");
                                       var10001 = var19++;
                                       var41 = (((long)var23[0] & ab(7207, 6102193979912146778L)) << aa(29000, 8091403088110682014L) | ((long)var23[1] & ab(3826, 5502629062929341835L)) << aa(28253, 299880697312272520L) | ((long)var23[2] & ab(3826, 5502629062929341835L)) << aa(14250, 8871272819374635389L) | ((long)var23[3] & ab(3826, 5502629062929341835L)) << aa(17902, 8729304221316664113L) | ((long)var23[4] & ab(3826, 5502629062929341835L)) << aa(27288, 4414410939111564353L) | ((long)var23[5] & ab(3826, 5502629062929341835L)) << aa(15566, 3314920221581685269L) | ((long)var23[aa(2245, 7866922643779388952L)] & ab(3826, 5502629062929341835L)) << aa(27787, 2023986949492138581L) | (long)var23[aa(30609, 8080598038527834443L)] & ab(3826, 5502629062929341835L)) ^ var16;
                                       var10003 = -1;
                                       var22[var10001] = var41;
                                    } while(var18 < var21);

                                    ba = var22;
                                    aaa = new Integer[2];
                                    return;
                                 }
                                 break;
                              default:
                                 var10000[var10001] = var41;
                                 if (var2 < var5) {
                                    continue label37;
                                 }

                                 var4 = "^\u000e\u0088_c`Ñ>/©ö°àk\u0089=";
                                 var5 = "^\u000e\u0088_c`Ñ>/©ö°àk\u0089=".length();
                                 var2 = 0;
                           }

                           var10001 = var2;
                           var2 += 8;
                           var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
                           var10000 = var6;
                           var10001 = var3++;
                           var10002 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                           var10003 = 0;
                        }
                     }
                  }
                  break;
               default:
                  var10000[var10001] = var41;
                  if (var10 < var13) {
                     continue label47;
                  }

                  var12 = "\u008f\u0019O@s^M¨éïòUúXr\u000e";
                  var13 = "\u008f\u0019O@s^M¨éïòUúXr\u000e".length();
                  var10 = 0;
            }

            var10001 = var10;
            var10 += 8;
            var15 = var12.substring(var10001, var10).getBytes("ISO-8859-1");
            var10000 = var14;
            var10001 = var11++;
            var10002 = ((long)var15[0] & 255L) << 56 | ((long)var15[1] & 255L) << 48 | ((long)var15[2] & 255L) << 40 | ((long)var15[3] & 255L) << 32 | ((long)var15[4] & 255L) << 24 | ((long)var15[5] & 255L) << 16 | ((long)var15[6] & 255L) << 8 | (long)var15[7] & 255L;
            var10003 = 0;
         }
      }
   }

   @Inject(
      method = {"method_11128"},
      at = {@At("TAIL")}
   )
   private void aab(class_2672 var1, CallbackInfo var2) {
      q2997348aa27a422480aea29cbfd800b1babbbbbb var3 = q2997348aa27a422480aea29cbfd800b1babbbbbb.aaba();
      class_310 var4 = class_310.method_1551();
      if (var3 != null && var3.aab() != null && var4.field_1687 != null) {
         q2997348aa27a422480aea29cbfd800b1aabbbab var5 = (q2997348aa27a422480aea29cbfd800b1aabbbab)var3.aab().abbaaba(q2997348aa27a422480aea29cbfd800b1aabbbab.class);
         if (var5 != null && var5.bbaabbb()) {
            var5.ba(var4, var1.method_11523(), var1.method_11524());
         }

      }
   }

   @Inject(
      method = {"method_11146"},
      at = {@At("TAIL")},
      require = 1
   )
   private void aba(class_2767 var1, CallbackInfo var2) {
      q2997348aa27a422480aea29cbfd800b1babbbbbb var3 = q2997348aa27a422480aea29cbfd800b1babbbbbb.aaba();
      if (var3 != null && var3.aab() != null) {
         var3.aab().abbbaab(var1);
      }

   }

   @Inject(
      method = {"method_11160"},
      at = {@At("HEAD")}
   )
   private void abb(class_2616 var1, CallbackInfo var2) {
      class_310 var3 = class_310.method_1551();
      if (var3.method_18854()) {
         q2997348aa27a422480aea29cbfd800b1babbbbbb var4 = q2997348aa27a422480aea29cbfd800b1babbbbbb.aaba();
         if (var4 != null && var4.aab() != null) {
            if (var3.field_1687 != null) {
               class_1297 var5 = var3.field_1687.method_8469(var1.method_11269());
               if (var5 != null) {
                  var4.aab().bbbaaa(var5, var1.method_11267());
               }

            }
         }
      }
   }

   private static int baa(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & ab(15141, 2668426723313051737L)) ^ aa(30058, 6486681895783103410L);
      if (aaa[var3] == null) {
         aaa[var3] = (int)(ba[var3] ^ var1);
      }

      return aaa[var3];
   }

   @Inject(
      method = {"method_11132"},
      at = {@At("TAIL")},
      require = 1
   )
   private void a(class_2743 var1, CallbackInfo var2) {
      class_310 var3 = class_310.method_1551();
      q2997348aa27a422480aea29cbfd800b1babbbbbb var4 = q2997348aa27a422480aea29cbfd800b1babbbbbb.aaba();
      if (var4 != null && var4.aab() != null && var3.field_1724 != null && var3.field_1687 != null && var1.method_11818() == var3.field_1724.method_5628()) {
         var4.aab().aabaabb(var3);
      }

   }
}
