package q70a83e53cc5c47b48a1443e04ba026b6.q3631a76f337940c1ab9012854eba33b0;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1297;
import net.minecraft.class_310;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644.q2997348aa27a422480aea29cbfd800b1aaaaaabab;
import q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644.q2997348aa27a422480aea29cbfd800b1aabaabbaa;
import q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644.q2997348aa27a422480aea29cbfd800b1abaabbbb;
import q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644.q2997348aa27a422480aea29cbfd800b1abbbbbba;
import q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644.q2997348aa27a422480aea29cbfd800b1babbbbbb;

@Environment(EnvType.CLIENT)
@Mixin({class_1297.class})
public abstract class q832047b101f4476cb1e83cd851e08c28aabbbbabb {
   @Unique
   private static final int aa = 0;
   private static final Long[] ab;
   private static final Integer[] ba;
   private static final long[] b;
   @Unique
   private static final int bb;
   @Unique
   private int aaa;
   @Unique
   private float aab;
   @Unique
   private static final int aba;
   @Unique
   private float abb;
   private static final long[] baa;
   private static final Integer[] a;
   @Unique
   private static final int bab = 1;
   private static final long[] bba;
   @Unique
   private q2997348aa27a422480aea29cbfd800b1abaabbbb bbb;

   private static int aa(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & ab(10175, 7369029992157600905L)) ^ ba(31778, 3371728715087102993L);
      if (ba[var3] == null) {
         ba[var3] = (int)(baa[var3] ^ var1);
      }

      return ba[var3];
   }

   @Inject(
      method = {"method_5872"},
      at = {@At("TAIL")}
   )
   private void a(double var1, double var3, CallbackInfo var5) {
      if (this.aaa != 0) {
         class_1297 var6 = (class_1297)this;
         class_310 var7 = class_310.method_1551();
         q2997348aa27a422480aea29cbfd800b1babbbbbb var8 = q2997348aa27a422480aea29cbfd800b1babbbbbb.aaba();

         try {
            if (var6 == var7.field_1724) {
               float var9 = var6.method_36454();
               float var10 = var6.method_36455();
               if (var8 != null && this.aaa == 1) {
                  q2997348aa27a422480aea29cbfd800b1abbbbbba var15 = var8.aab().ababbba();
                  if (var15 != null) {
                     var15.aaa(this.aab, this.abb, var9, var10);
                  }

                  return;
               }

               if (var8 != null && this.aaa == 2) {
                  q2997348aa27a422480aea29cbfd800b1aaaaaabab var11 = var8.aab().baaaa();
                  if (var11 != null) {
                     var11.ababba(this.aab, this.abb, var9, var10);
                  }

                  return;
               }

               if (this.aaa == 3) {
                  q2997348aa27a422480aea29cbfd800b1aabaabbaa.a(this.bbb, this.aab, this.abb, var9, var10);
               }

               return;
            }
         } finally {
            if (var6 == var7.field_1724) {
               var6.method_36456(this.aab);
               var6.method_36457(this.abb);
            }

            this.aaa = 0;
            this.bbb = q2997348aa27a422480aea29cbfd800b1abaabbbb.a;
         }

      }
   }

   private static long ab(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ 31539) & 32767;
      if (ab[var3] == null) {
         ab[var3] = bba[var3] ^ var1;
      }

      return ab[var3];
   }

   public q832047b101f4476cb1e83cd851e08c28aabbbbabb() {
      this.bbb = q2997348aa27a422480aea29cbfd800b1abaabbbb.a;
   }

   private static int ba(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 14389;
      if (a[var3] == null) {
         a[var3] = (int)(b[var3] ^ var1);
      }

      return a[var3];
   }

   @Inject(
      method = {"method_5872"},
      at = {@At("HEAD")}
   )
   private void b(double var1, double var3, CallbackInfo var5) {
      this.aaa = 0;
      this.bbb = q2997348aa27a422480aea29cbfd800b1abaabbbb.a;
      q2997348aa27a422480aea29cbfd800b1babbbbbb var6 = q2997348aa27a422480aea29cbfd800b1babbbbbb.aaba();
      class_1297 var7 = (class_1297)this;
      class_310 var8 = class_310.method_1551();
      if (var6 != null && var7 == var8.field_1724) {
         q2997348aa27a422480aea29cbfd800b1abbbbbba var9 = var6.aab().ababbba();
         q2997348aa27a422480aea29cbfd800b1aaaaaabab var10 = var6.aab().baaaa();
         q2997348aa27a422480aea29cbfd800b1abaabbbb var11 = q2997348aa27a422480aea29cbfd800b1aabaabbaa.ab();
         if (var9 != null && var9.bbaabbb()) {
            this.aaa = 1;
         } else if (var10 != null && var10.baabbb()) {
            this.aaa = aa(ba(10563, 886930739154030966L), ab(23342, 1344472219605934105L));
         } else {
            if (var11 == q2997348aa27a422480aea29cbfd800b1abaabbbb.a) {
               return;
            }

            this.aaa = aa(ba(12553, 4064718997656275259L), ab(7611, 1180587114111788686L));
            this.bbb = var11;
         }

         this.aab = var7.method_36454();
         this.abb = var7.method_36455();
      }
   }

   static {
      long var8 = 4243940629963578129L;
      long[] var14 = new long[23];
      int var11 = 0;
      String var12 = "è«Æ8_u\u0003¤ -2SØ2Â`{\u0099-0\u001ct\u0003c\u0012[ÌÂN0ËT;ÒÈv\u0087\u0017h°\u0011\u0085\u0090r>Ý\u00ad1\f\u001cè=u\u0013ô|\u00183hÃÿÆ\u0003Á®DºÏ]ÝûÉ1q«¥£J\u0007ÒwÓ\u001fzU/\u0089eC®\u001f\u0082Lfaä\u001fãÍ>\u0083}§½\u0084\u0000õ\u0006\u00027·\tÏÍsÿs\u009a£<J+R\u0012ô»\u0011å\u0018\u0002QnE4do\u0003u(é\fM\u0007Bñ\bx\u008dèwx\u0007m\u0093\u001f\u0093ùÓò©è\u0096ë\u000f\u0006\u001fv0";
      int var13 = "è«Æ8_u\u0003¤ -2SØ2Â`{\u0099-0\u001ct\u0003c\u0012[ÌÂN0ËT;ÒÈv\u0087\u0017h°\u0011\u0085\u0090r>Ý\u00ad1\f\u001cè=u\u0013ô|\u00183hÃÿÆ\u0003Á®DºÏ]ÝûÉ1q«¥£J\u0007ÒwÓ\u001fzU/\u0089eC®\u001f\u0082Lfaä\u001fãÍ>\u0083}§½\u0084\u0000õ\u0006\u00027·\tÏÍsÿs\u009a£<J+R\u0012ô»\u0011å\u0018\u0002QnE4do\u0003u(é\fM\u0007Bñ\bx\u008dèwx\u0007m\u0093\u001f\u0093ùÓò©è\u0096ë\u000f\u0006\u001fv0".length();
      int var10 = 0;

      label56:
      while(true) {
         int var10001 = var10;
         var10 += 8;
         byte[] var15 = var12.substring(var10001, var10).getBytes("ISO-8859-1");
         long[] var10000 = var14;
         var10001 = var11++;
         long var10002 = ((long)var15[0] & 255L) << 56 | ((long)var15[1] & 255L) << 48 | ((long)var15[2] & 255L) << 40 | ((long)var15[3] & 255L) << 32 | ((long)var15[4] & 255L) << 24 | ((long)var15[5] & 255L) << 16 | ((long)var15[6] & 255L) << 8 | (long)var15[7] & 255L;
         byte var10003 = -1;

         while(true) {
            long var47 = var10002 ^ var8;
            switch (var10003) {
               case 0:
                  var10000[var10001] = var47;
                  if (var10 >= var13) {
                     b = var14;
                     a = new Integer[23];
                     long var0 = 8660910758252080584L;
                     long[] var6 = new long[8];
                     int var3 = 0;
                     String var4 = "N»:ñÎ¢$Ï\u0014ÅjßP\u0084·\u0087:\u0092'ª\u0090\t[\u009fFé\u0014\u007fRTE\u009dl:\u001b\u008dK¹ïm\u001eu±ÎU9Î¾";
                     int var5 = "N»:ñÎ¢$Ï\u0014ÅjßP\u0084·\u0087:\u0092'ª\u0090\t[\u009fFé\u0014\u007fRTE\u009dl:\u001b\u008dK¹ïm\u001eu±ÎU9Î¾".length();
                     int var2 = 0;

                     label46:
                     while(true) {
                        var10001 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
                        var10000 = var6;
                        var10001 = var3++;
                        var10002 = ((long)var7[0] & 255L) << 56 | ((long)var7[1] & 255L) << 48 | ((long)var7[2] & 255L) << 40 | ((long)var7[3] & 255L) << 32 | ((long)var7[4] & 255L) << 24 | ((long)var7[5] & 255L) << 16 | ((long)var7[6] & 255L) << 8 | (long)var7[7] & 255L;
                        var10003 = -1;

                        while(true) {
                           var47 = var10002 ^ var0;
                           switch (var10003) {
                              case 0:
                                 var10000[var10001] = var47;
                                 if (var2 >= var5) {
                                    bba = var6;
                                    ab = new Long[8];
                                    long var16 = ab(29858, 966299147639099282L);
                                    long[] var22 = new long[4];
                                    int var19 = 0;
                                    String var20 = "7|7I[7\u001dSî&ñK¤o«¹";
                                    int var21 = "7|7I[7\u001dSî&ñK¤o«¹".length();
                                    int var18 = 0;

                                    label36:
                                    while(true) {
                                       var10001 = var18;
                                       var18 += 8;
                                       byte[] var23 = var20.substring(var10001, var18).getBytes("ISO-8859-1");
                                       var10000 = var22;
                                       var10001 = var19++;
                                       var10002 = ((long)var23[0] & ab(15844, 5581770997595129552L)) << ba(18275, 724981295950069574L) | ((long)var23[1] & ab(13003, 3930101525092452856L)) << ba(19360, 5030730605940503441L) | ((long)var23[2] & ab(13003, 3930101525092452856L)) << ba(23321, 4129439837988381502L) | ((long)var23[3] & ab(13003, 3930101525092452856L)) << ba(1205, 4159911314999622796L) | ((long)var23[4] & ab(13003, 3930101525092452856L)) << ba(14, 4020340025954220085L) | ((long)var23[5] & ab(13003, 3930101525092452856L)) << ba(22773, 2371077450115211464L) | ((long)var23[ba(24899, 3270582954188953975L)] & ab(13003, 3930101525092452856L)) << ba(680, 8369701987701996171L) | (long)var23[ba(26740, 653093198652198978L)] & ab(13003, 3930101525092452856L);
                                       var10003 = -1;

                                       while(true) {
                                          var47 = var10002 ^ var16;
                                          switch (var10003) {
                                             case 0:
                                                var10000[var10001] = var47;
                                                if (var18 >= var21) {
                                                   baa = var22;
                                                   ba = new Integer[4];
                                                   bb = aa(ba(25483, 9046394423939718061L), ab(21517, 1560423971878186812L));
                                                   aba = aa(ba(26058, 3103065689556377076L), ab(11521, 1593170294652393011L));
                                                   return;
                                                }
                                                break;
                                             default:
                                                var10000[var10001] = var47;
                                                if (var18 < var21) {
                                                   continue label36;
                                                }

                                                var20 = "Ê\r\u0004\u0005ýZ>¯\u0081Öó×ÛÙ\u0005y";
                                                var21 = "Ê\r\u0004\u0005ýZ>¯\u0081Öó×ÛÙ\u0005y".length();
                                                var18 = 0;
                                          }

                                          var10001 = var18;
                                          var18 += 8;
                                          var23 = var20.substring(var10001, var18).getBytes("ISO-8859-1");
                                          var10000 = var22;
                                          var10001 = var19++;
                                          var10002 = ((long)var23[0] & ab(13003, 3930101525092452856L)) << ba(13046, 2375973307350026956L) | ((long)var23[1] & ab(13003, 3930101525092452856L)) << ba(10875, 5427366776146760260L) | ((long)var23[2] & ab(13003, 3930101525092452856L)) << ba(5128, 4058208750717381680L) | ((long)var23[3] & ab(13003, 3930101525092452856L)) << ba(9303, 6269432672785702003L) | ((long)var23[4] & ab(13003, 3930101525092452856L)) << ba(21784, 6128091380650405177L) | ((long)var23[5] & ab(13003, 3930101525092452856L)) << ba(3584, 7530113550468920880L) | ((long)var23[ba(16141, 5468681449314780973L)] & ab(13003, 3930101525092452856L)) << ba(8269, 3982657845461489786L) | (long)var23[ba(9464, 6143406399139978436L)] & ab(13003, 3930101525092452856L);
                                          var10003 = 0;
                                       }
                                    }
                                 }
                                 break;
                              default:
                                 var10000[var10001] = var47;
                                 if (var2 < var5) {
                                    continue label46;
                                 }

                                 var4 = "EÔ2é# ±Ñ5GÓTaÅ+ç";
                                 var5 = "EÔ2é# ±Ñ5GÓTaÅ+ç".length();
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
                  var10000[var10001] = var47;
                  if (var10 < var13) {
                     continue label56;
                  }

                  var12 = "î8°áHþ\u009c:a³\u0083U|\b!\u0092";
                  var13 = "î8°áHþ\u009c:a³\u0083U|\b!\u0092".length();
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
