package q70a83e53cc5c47b48a1443e04ba026b6.q3631a76f337940c1ab9012854eba33b0;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1661;
import net.minecraft.class_1799;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644.q2997348aa27a422480aea29cbfd800b1abbaaaba;

@Environment(EnvType.CLIENT)
@Mixin({class_1661.class})
public abstract class q832047b101f4476cb1e83cd851e08c28baaaaabb {
   private static final Long[] aa;
   private static final Integer[] ab;
   private static final long[] ba;
   private static final long[] bb;
   private static final Integer[] a;
   private static final long[] b;

   @Inject(
      method = {"method_67531"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void aa(class_1799 var1, CallbackInfoReturnable var2) {
      class_1661 var3 = (class_1661)this;
      int var4 = q2997348aa27a422480aea29cbfd800b1abbaaaba.baaabb(var3);
      int var5 = ((q832047b101f4476cb1e83cd851e08c28bbbbaaa)var3).wq_getSelectedSlot();
      if (var4 >= 0 && var4 < ab(a(20193, 3005013835219770757L), b(12871, 2900752871255393630L)) && var4 != var5) {
         class_1799 var6 = var3.method_5438(var4);
         var3.method_5447(var4, var1);
         var2.setReturnValue(var6);
      }

   }

   private static int ab(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & b(28979, 562471112076559915L)) ^ a(11404, 9101034407693025258L);
      if (a[var3] == null) {
         a[var3] = (int)(bb[var3] ^ var1);
      }

      return a[var3];
   }

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 21356;
      if (ab[var3] == null) {
         ab[var3] = (int)(b[var3] ^ var1);
      }

      return ab[var3];
   }

   private static long b(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ 30488) & 32767;
      if (aa[var3] == null) {
         aa[var3] = ba[var3] ^ var1;
      }

      return aa[var3];
   }

   @Inject(
      method = {"method_7391"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void ba(CallbackInfoReturnable var1) {
      class_1661 var2 = (class_1661)this;
      int var3 = q2997348aa27a422480aea29cbfd800b1abbaaaba.baaabb(var2);
      int var4 = ((q832047b101f4476cb1e83cd851e08c28bbbbaaa)var2).wq_getSelectedSlot();
      if (var3 >= 0 && var3 < ab(a(13617, 2044540514473502292L), b(623, 163587948038681973L)) && var3 != var4) {
         var1.setReturnValue(var2.method_5438(var3));
      }

   }

   static {
      long var8 = 5138295696207692042L;
      long[] var14 = new long[12];
      int var11 = 0;
      String var12 = "â\b\u0087¶=³Í3\u007fËG¿\u0098\\¥y¦\u001b=7GöÀ5c\u0088\u0094%Ü¤fh½Í\u0015\"\u008c\u0016nöð:âg£¥âÿ^\u0016i8$h6\u0083Á\u001c½¼4IT· \u008d\u0085\u0005J\b)=gY|ÖÍvßº";
      int var13 = "â\b\u0087¶=³Í3\u007fËG¿\u0098\\¥y¦\u001b=7GöÀ5c\u0088\u0094%Ü¤fh½Í\u0015\"\u008c\u0016nöð:âg£¥âÿ^\u0016i8$h6\u0083Á\u001c½¼4IT· \u008d\u0085\u0005J\b)=gY|ÖÍvßº".length();
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
                     b = var14;
                     ab = new Integer[12];
                     long var0 = 7631297058749923941L;
                     long[] var6 = new long[6];
                     int var3 = 0;
                     String var4 = "n)\u009cA\u0015û»±G*öý¹/ÌLWc{\"i\u008bñ0m0ID\u0092o\u0002c";
                     int var5 = "n)\u009cA\u0015û»±G*öý¹/ÌLWc{\"i\u008bñ0m0ID\u0092o\u0002c".length();
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
                                    ba = var6;
                                    aa = new Long[6];
                                    long var16 = b(15002, 3176504413732654471L);
                                    long[] var22 = new long[2];
                                    int var19 = 0;
                                    String var20 = "òx\u0080ò\u008dK%\u001bóÞJmyÑ(L";
                                    int var21 = "òx\u0080ò\u008dK%\u001bóÞJmyÑ(L".length();
                                    int var18 = 0;

                                    do {
                                       var10001 = var18;
                                       var18 += 8;
                                       byte[] var23 = var20.substring(var10001, var18).getBytes("ISO-8859-1");
                                       var10001 = var19++;
                                       var41 = (((long)var23[0] & b(870, 670801092618253434L)) << a(18158, 125788210690889093L) | ((long)var23[1] & b(14306, 348916247694065913L)) << a(31908, 5097092195823300556L) | ((long)var23[2] & b(14306, 348916247694065913L)) << a(24445, 2180766316058840081L) | ((long)var23[3] & b(14306, 348916247694065913L)) << a(9411, 7936531231981238185L) | ((long)var23[4] & b(14306, 348916247694065913L)) << a(29717, 8618547921417447290L) | ((long)var23[5] & b(14306, 348916247694065913L)) << a(21057, 1557613236794556719L) | ((long)var23[a(28826, 3427097550711497715L)] & b(14306, 348916247694065913L)) << a(14102, 5413000444697666683L) | (long)var23[a(15641, 5598665747325742718L)] & b(14306, 348916247694065913L)) ^ var16;
                                       var10003 = -1;
                                       var22[var10001] = var41;
                                    } while(var18 < var21);

                                    bb = var22;
                                    a = new Integer[2];
                                    return;
                                 }
                                 break;
                              default:
                                 var10000[var10001] = var41;
                                 if (var2 < var5) {
                                    continue label37;
                                 }

                                 var4 = "`¨ú421¶à\\\u000bkú\u001bÅa\u0087";
                                 var5 = "`¨ú421¶à\\\u000bkú\u001bÅa\u0087".length();
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

                  var12 = "Ö\u0086ª\u00984F\u0080%~#Éë¶\u001f¯s";
                  var13 = "Ö\u0086ª\u00984F\u0080%~#Éë¶\u001f¯s".length();
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
}
