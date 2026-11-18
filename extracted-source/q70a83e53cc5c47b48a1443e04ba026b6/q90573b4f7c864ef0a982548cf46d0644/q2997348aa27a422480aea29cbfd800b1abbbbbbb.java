package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import java.awt.Color;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.function.ToDoubleFunction;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_310;
import net.minecraft.class_327;
import net.minecraft.class_332;
import net.minecraft.class_3532;

@Environment(EnvType.CLIENT)
public final class q2997348aa27a422480aea29cbfd800b1abbbbbbb extends q2997348aa27a422480aea29cbfd800b1bbaababb {
   private final Map ba;
   private static final long[] aaa;
   private static final double aab = (double)30.0F;
   private static final Long[] aba;
   private static final String[] aabbb;
   private static final long[] abb;
   private static final Long[] bb;
   private static final Integer[] baa;
   private static final float bab = 1000.0F;
   private static final double bba = (double)9.0F;
   private static final double bbb = 0.28;
   private static final Color aaaa;
   private static final String[] aa;
   private final q2997348aa27a422480aea29cbfd800b1aabababab aaab;
   private static final Object[] abaaa;
   private static final Color aaba;
   private final q2997348aa27a422480aea29cbfd800b1abaaaaabb aabb;
   private static final double abaa = (double)7.0F;
   private final q2997348aa27a422480aea29cbfd800b1bbbabaaa abab;
   private static final int abba;
   private static final q2997348aa27a422480aea29cbfd800b1babbbb abbb;
   private static final int a;
   private long baaa;
   private static final double baab = (double)10.0F;
   private final q2997348aa27a422480aea29cbfd800b1aabababab baba;
   private static final Color babb;
   private static final int ab;
   private static final double bbaa = (double)21.0F;
   private static final int bbab;
   private static final double bbba = (double)120.0F;
   private static final String[] bbbb;
   private static final int[] aabba;
   private static final double aaaaa = 0.85;
   private static final double aaaab = (double)1.0F;
   private static final long[] aaaba;
   private static final double aaabb = (double)5.0F;
   private static final Integer[] aabaa;
   private static final long[] aabab;

   private double aa(q2997348aa27a422480aea29cbfd800b1abbaab var1, long var2, long var4) {
      return this.baab((double)(var1.ab() - var2) / (double)var4);
   }

   private static int ab(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & abaa(a(-774898491, 1589233497 ^ -827482901), 1094035629516472520L)) ^ abba(a(-774898470, 1589233497 ^ -60816824), 2060309627859259099L);

      try {
         if (aabaa[var3] == null) {
            aabaa[var3] = (int)(aaa[var3] ^ var1);
         }
      } catch (IllegalStateException var4) {
         throw var4;
      }

      return aabaa[var3];
   }

   private static long ba(int param0, long param1) {
      // $FF: Couldn't be decompiled
   }

   private static boolean bb(Set var0, Long var1) {
      int var2 = q2997348aa27a422480aea29cbfd800b1bbabab.aaab;

      boolean var10000;
      label36: {
         try {
            try {
               var10000 = var0.contains(var1);
               if (var2 != 0) {
                  return var10000;
               }

               if (!var10000) {
                  break label36;
               }
            } catch (MatchException var3) {
               throw var3;
            }
         } catch (IllegalStateException var4) {
            throw var4;
         }

         var10000 = false;
         return var10000;
      }

      var10000 = true;
      return var10000;
   }

   public long aaa() {
      return Math.max(ba(abba(a(-774898471, 1043203097 ^ -427192065), 4779736856290195082L), abaa(a(-774898466, 1043203097 ^ 1049382136), 9020519495456100717L)), Math.round((Double)this.aabb.abbb() * (double)1000.0F));
   }

   private void aab(class_332 var1, class_327 var2, q2997348aa27a422480aea29cbfd800b1abbaab var3, q2997348aa27a422480aea29cbfd800b1abaaaabbb var4, double var5, double var7, double var9) {
      double var15;
      int var18;
      double var19;
      List var21;
      double var22;
      label48: {
         int var26 = 1406767477;
         double var13 = var4.a();
         int var10000 = q2997348aa27a422480aea29cbfd800b1bbabab.b;
         var15 = var4.b();
         int var17 = (int)Math.round((double)255.0F * var9);
         q2997348aa27a422480aea29cbfd800b1aaabb.aaba(var1, var5, var7, var13, var15, (double)0.0F, q2997348aa27a422480aea29cbfd800b1ababbbbaa.a(ab(abba(a(-774898465, var26 ^ 408700126), 1226444318415845738L), abaa(a(-774898468, var26 ^ -828783130), 3592835659212335216L)), (int)Math.round((double)165.0F * var9)));
         int var10001 = q2997348aa27a422480aea29cbfd800b1bbabab.aaab;
         q2997348aa27a422480aea29cbfd800b1aaabb.aaba(var1, var5, var7, var13, (double)1.0F, (double)0.0F, q2997348aa27a422480aea29cbfd800b1ababbbbaa.a(this.bab(var3).getRGB(), var17));
         var18 = q2997348aa27a422480aea29cbfd800b1ababbbbaa.a(ab(abba(a(-774898467, var26 ^ -2138840582), 7490243815827703374L), abaa(a(-774898478, var26 ^ -2055359827), 584873002742137372L)), var17);
         int var12 = var10001;
         int var11 = var10000;
         var19 = var5 + (double)7.0F;
         var10000 = var12;
         var21 = var4.aa();
         var22 = (double)Math.max(0, var21.size() - 1) * (double)10.0F;
         IllegalStateException var31;
         if (var11 == 0) {
            try {
               try {
                  if (var10000 != 0) {
                     return;
                  }

                  var10000 = var4.ab().isEmpty();
               } catch (IllegalStateException var27) {
                  throw var27;
               }
            } catch (IllegalStateException var29) {
               var31 = var29;
               var10001 = 0;
               throw var31;
            }
         }

         try {
            if (var10000 != 0) {
               break label48;
            }
         } catch (IllegalStateException var28) {
            var31 = var28;
            var10001 = 0;
            throw var31;
         }

         this.aabab(var1, var2, var21, var19, var7 + (double)6.0F, (double)10.0F, var18);
         q2997348aa27a422480aea29cbfd800b1aaabb.aaaaa(var1);
         q2997348aa27a422480aea29cbfd800b1aaabb.babbbb(var1, var19, var7 + (double)17.5F + var22);
         q2997348aa27a422480aea29cbfd800b1aaabb.abaabb(var1, 0.85, 0.85);
         this.aabab(var1, var2, var4.ab(), (double)0.0F, (double)0.0F, 10.588235294117647, q2997348aa27a422480aea29cbfd800b1ababbbbaa.a(ab(abba(a(-774898477, var26 ^ 1126776950), 7001145971290907057L), abaa(a(-774898480, var26 ^ -1613168939), 5232255060144639365L)), var17));
         q2997348aa27a422480aea29cbfd800b1aaabb.aaaaab(var1);
         return;
      }

      double var32 = var7 + (double)1.0F;
      double var35 = var15 - (double)1.0F;
      Objects.requireNonNull(var2);
      double var24 = var32 + (var35 - (double)9.0F - var22) * (double)0.5F;
      this.aabab(var1, var2, var21, var19, var24, (double)10.0F, var18);
   }

   private static double aba(class_327 var0, String var1) {
      return (double)q2997348aa27a422480aea29cbfd800b1aaabb.bbaaa(var0, var1);
   }

   private q2997348aa27a422480aea29cbfd800b1abaaaabbb abb(class_327 var1, q2997348aa27a422480aea29cbfd800b1abbaab var2, q2997348aa27a422480aea29cbfd800b1aaabaaaba var3, int var4) {
      ToDoubleFunction var5 = q2997348aa27a422480aea29cbfd800b1abbbbbbb::aba;
      double var6 = Math.max((double)1.0F, (double)var4 - (double)10.0F);

      q2997348aa27a422480aea29cbfd800b1abaaaabbb var10000;
      label70: {
         try {
            try {
               switch (var3.ordinal()) {
                  case 0 -> { }
                  case 1 -> { }
                  default -> throw new MatchException((String)null, (Throwable)null);
               }
            } catch (MatchException var24) {
               throw var24;
            }
         } catch (IllegalStateException var25) {
            throw var25;
         }

         double var26 = Math.max((double)1.0F, var6 - (double)14.0F);
         List var10 = abbba(var2.aba(), var26, var5);

         label46: {
            try {
               try {
                  if (this.abbbb(var2)) {
                     var27 = List.of();
                     break label46;
                  }
               } catch (MatchException var22) {
                  throw var22;
               }
            } catch (IllegalStateException var23) {
               throw var23;
            }

            var27 = abbba(var2.aa(), var26 / 0.85, var5);
         }

         List var11 = var27;
         double var12 = Math.max(aaabb(var10, var5), aaabb(var11, var5) * 0.85);
         double var14 = Math.max(Math.min((double)120.0F, var6), Math.min(var6, var12 + (double)14.0F));
         double var16 = (double)Math.max(0, var10.size() - 1) * (double)10.0F;

         label37: {
            try {
               try {
                  if (var11.isEmpty()) {
                     var28 = (double)21.0F + var16;
                     break label37;
                  }
               } catch (MatchException var20) {
                  throw var20;
               }
            } catch (IllegalStateException var21) {
               throw var21;
            }

            var28 = (double)30.0F + var16 + (double)(var11.size() - 1) * (double)9.0F;
         }

         double var18 = var28;
         var10000 = new q2997348aa27a422480aea29cbfd800b1abaaaabbb(var14, var18, var10, var11);
         return var10000;
      }

      List var8 = abbba(this.aabbb(var2), Math.max((double)1.0F, var6 - (double)8.0F), var5);
      var10000 = new q2997348aa27a422480aea29cbfd800b1abaaaabbb(Math.min(var6, aaabb(var8, var5) + (double)8.0F), (double)16.0F + (double)Math.max(0, var8.size() - 1) * (double)10.0F, var8, List.of());
      return var10000;
   }

   private double baa(double var1) {
      return q2997348aa27a422480aea29cbfd800b1aaaabbabb.aaa(var1);
   }

   private Color bab(q2997348aa27a422480aea29cbfd800b1abbaab param1) {
      // $FF: Couldn't be decompiled
   }

   private boolean bba() {
      boolean var10000;
      try {
         try {
            if (this.abab.abbb() == q2997348aa27a422480aea29cbfd800b1aaabaaaba.ba) {
               var10000 = true;
               return var10000;
            }
         } catch (MatchException var1) {
            throw var1;
         }
      } catch (IllegalStateException var2) {
         throw var2;
      }

      var10000 = false;
      return var10000;
   }

   private void bbb(class_332 var1, class_310 var2, q2997348aa27a422480aea29cbfd800b1abbaab var3, q2997348aa27a422480aea29cbfd800b1abaaaabbb var4, double var5, double var7, double var9) {
      Boolean var11 = q2997348aa27a422480aea29cbfd800b1aaabb.aaaaba(true);

      try {
         this.aaaa(var1, var2.field_1772, var3, var4, var5, var7, var9);
      } finally {
         q2997348aa27a422480aea29cbfd800b1aaabb.bababa(var11);
      }

   }

   private static String b(char var0, int var1, int var2) {
      int var3 = var1 ^ '\ue2ad';
      char[] var4 = aabbb[var3].toCharArray();
      StackTraceElement[] var5 = (StackTraceElement[])abaaa[var3];
      StackTraceElement[] var6;
      if (var5 != null) {
         var6 = var5;
      } else {
         var6 = (new Throwable()).getStackTrace();
         abaaa[var3] = var6;
      }

      StackTraceElement var7 = var6[1];
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 27514;
      int var9 = 0;

      do {
         int var10 = var4[var9] - 8325;
         var10 ^= 15381;
         var10 ^= 12068;
         var10 -= 58543;
         var10 ^= 26433;
         var10 -= 46987;
         var10 += 33044;
         var10 ^= 14315;
         var4[var9] = (char)(var10 ^ var8 ^ var0 ^ var2 >> 16);
         ++var9;
      } while(var9 < var4.length);

      return (new String(var4)).intern();
   }

   private static int a(int var0, int var1) {
      int var2 = aabba[var0 ^ -774898614] ^ var1 ^ var0;
      var2 += 43643;
      var2 += 6182;
      var2 -= 16353;
      var2 -= 52315;
      var2 -= 62253;
      var2 -= 26520;
      var2 -= 32399;
      var2 ^= 62783;
      var2 += 17246;
      var2 -= 29139;
      return var2;
   }

   private void aaaa(class_332 param1, class_327 param2, q2997348aa27a422480aea29cbfd800b1abbaab param3, q2997348aa27a422480aea29cbfd800b1abaaaabbb param4, double param5, double param7, double param9) {
      // $FF: Couldn't be decompiled
   }

   public void abaab(class_332 param1, int param2, int param3, float param4) {
      // $FF: Couldn't be decompiled
   }

   public boolean aaab() {
      return false;
   }

   private double aaba(q2997348aa27a422480aea29cbfd800b1abbaab var1, long var2) {
      return this.bbbb((double)(var1.ab() - var2) / (double)Math.max(1L, var1.aab()));
   }

   static {
      // $FF: Couldn't be decompiled
   }

   private double aabb(q2997348aa27a422480aea29cbfd800b1abbaab var1, long var2, long var4) {
      double var6 = this.bbbb((double)(var2 - var1.a()) / (double)var4);
      double var8 = this.bbbb((double)(var1.ab() - var2) / (double)var4);
      double var10 = Math.pow((double)1.0F - var6, (double)3.0F);
      double var12 = Math.pow((double)1.0F - var8, (double)3.0F);
      return Math.max(var10, var12);
   }

   private static long abaa(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ a(-774898453, -1037953531 ^ 673861643)) & a(-774898456, -1037953531 ^ -1071280900);
      if (bb[var3] == null) {
         bb[var3] = aaaba[var3] ^ var1;
      }

      return bb[var3];
   }

   private static int abba(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ a(-774898455, 1123092951 ^ -585030834);
      if (baa[var3] == null) {
         baa[var3] = (int)(abb[var3] ^ var1);
      }

      return baa[var3];
   }

   private double abbb(q2997348aa27a422480aea29cbfd800b1abbaab var1, long var2, long var4) {
      double var6 = this.babb(var1, var2, var4);
      double var8 = this.aa(var1, var2, var4);
      return Math.min(var6, var8);
   }

   private double baaa(q2997348aa27a422480aea29cbfd800b1abbaab var1, long var2, long var4) {
      double var6 = this.babb(var1, var2, var4);
      double var8 = this.aa(var1, var2, var4);
      return (0.9 + 0.1 * var6) * (0.96 + 0.04 * var8);
   }

   public q2997348aa27a422480aea29cbfd800b1abbbbbbb(q2997348aa27a422480aea29cbfd800b1aabaabaab var1) {
      int var2 = 805584722;
      super((Object)q2997348aa27a422480aea29cbfd800b1bbbbbbab.abbb(baaaa(abba(a(-774898450, var2 ^ 1693064386), 4572333519006640509L), abba(a(-774898449, var2 ^ 960507555), 5732603240388030708L))), q2997348aa27a422480aea29cbfd800b1aabbaaaaa.aaa, (Object)q2997348aa27a422480aea29cbfd800b1bbbbbbab.abbb(baaaa(abba(a(-774898452, var2 ^ -1770369024), 286766275440184383L), abba(a(-774898451, var2 ^ 737376873), 8515323124806123341L))));
      this.abab = (q2997348aa27a422480aea29cbfd800b1bbbabaaa)this.aaabbbbb(new q2997348aa27a422480aea29cbfd800b1bbbabaaa(q2997348aa27a422480aea29cbfd800b1bbbbbbab.abbb(baaaa(abba(a(-774898462, var2 ^ 1013723281), 4983182229707617520L), abba(a(-774898461, var2 ^ -697016774), 7320649350356401677L))), q2997348aa27a422480aea29cbfd800b1aaabaaaba.class, q2997348aa27a422480aea29cbfd800b1aaabaaaba.ba));
      this.aaab = (q2997348aa27a422480aea29cbfd800b1aabababab)this.aaabbbbb(new q2997348aa27a422480aea29cbfd800b1aabababab(q2997348aa27a422480aea29cbfd800b1bbbbbbab.abbb(baaaa(abba(a(-774898464, var2 ^ -1455714804), 8739434588295320917L), abba(a(-774898463, var2 ^ -1204313075), 8812789054741131099L))), false));
      this.aabb = (q2997348aa27a422480aea29cbfd800b1abaaaaabb)this.aaabbbbb((new q2997348aa27a422480aea29cbfd800b1abaaaaabb(q2997348aa27a422480aea29cbfd800b1bbbbbbab.abbb(baaaa(abba(a(-774898458, var2 ^ 1514986128), 401130601046194564L), abba(a(-774898457, var2 ^ -1612838526), 5481438206501448555L))), (double)2.0F, (double)1.0F, (double)10.0F, (double)0.5F)).aba(q2997348aa27a422480aea29cbfd800b1bbbbbbab.abbb(baaaa(abba(a(-774898460, var2 ^ -932304019), 8636908534410156730L), abba(a(-774898459, var2 ^ -1265766080), 8881471752780604985L)))));
      this.baba = (q2997348aa27a422480aea29cbfd800b1aabababab)this.aaabbbbb(new q2997348aa27a422480aea29cbfd800b1aabababab(q2997348aa27a422480aea29cbfd800b1bbbbbbab.abbb(baaaa(abba(a(-774898438, var2 ^ -1714541740), 963696988930602638L), abba(a(-774898437, var2 ^ -770595025), 7641892551609822263L))), true));
      this.ba = new HashMap();
      this.aaab.aaaaa(this::bba);
      this.aaaabbaa(true);
   }

   private double baab(double var1) {
      return q2997348aa27a422480aea29cbfd800b1aaaabbabb.aa(var1);
   }

   private double babb(q2997348aa27a422480aea29cbfd800b1abbaab var1, long var2, long var4) {
      return this.baa((double)(var2 - var1.a()) / (double)var4);
   }

   private double bbaa(long var1, double var3, double var5, double var7) {
      Double var9 = (Double)this.ba.get(var1);
      if (var9 == null) {
         double var10 = (double)18.0F * ((double)1.0F - var5);
         var9 = var3 + var10;
      }

      double var12 = class_3532.method_16436(class_3532.method_15350(var7, (double)0.0F, (double)1.0F), var9, var3);
      this.ba.put(var1, var12);
      return var12;
   }

   private static int bbab(String param0, double param1, ToDoubleFunction param3) {
      // $FF: Couldn't be decompiled
   }

   private void bbba(class_332 var1, double var2, double var4, q2997348aa27a422480aea29cbfd800b1abaaaabbb var6, double var7, Runnable var9) {
      double var10 = var2 + var6.a() * (double)0.5F;
      double var12 = var4 + var6.b() * (double)0.5F;
      q2997348aa27a422480aea29cbfd800b1aabab.baab(var1);

      try {
         q2997348aa27a422480aea29cbfd800b1aabab.bbaab(var1, var10, var12);
         q2997348aa27a422480aea29cbfd800b1aabab.abbba(var1, var7, var7);
         q2997348aa27a422480aea29cbfd800b1aabab.bbaab(var1, -var10, -var12);
         var9.run();
      } finally {
         q2997348aa27a422480aea29cbfd800b1aabab.bbbb(var1);
      }

   }

   private double bbbb(double var1) {
      return Math.max((double)0.0F, Math.min((double)1.0F, var1));
   }

   public q2997348aa27a422480aea29cbfd800b1aaabaaaba aaaaa() {
      return (q2997348aa27a422480aea29cbfd800b1aaabaaaba)this.abab.abbb();
   }

   public boolean aaaab() {
      return (Boolean)this.baba.abbb();
   }

   private void aaaba(class_332 var1, double var2, double var4, double var6, double var8, double var10) {
      q2997348aa27a422480aea29cbfd800b1bbabaaba.bbab(var1, abbb, var2, var4, var6, var8, false, var10);
   }

   private static double aaabb(List var0, ToDoubleFunction var1) {
      double var4 = (double)0.0F;
      int var3 = q2997348aa27a422480aea29cbfd800b1bbabab.aaab;
      int var10000 = q2997348aa27a422480aea29cbfd800b1bbabab.b;
      Iterator var6 = var0.iterator();
      int var2 = var10000;

      while(true) {
         if (var6.hasNext()) {
            String var7 = (String)var6.next();

            label24: {
               try {
                  if (var2 != 0) {
                     break label24;
                  }

                  var9 = var4;
                  if (var3 != 0) {
                     break;
                  }
               } catch (IllegalStateException var8) {
                  throw var8;
               }

               var4 = Math.max(var9, var1.applyAsDouble(var7));
            }

            if (var3 == 0) {
               continue;
            }
         }

         var9 = var4;
         break;
      }

      return var9;
   }

   private void aabab(class_332 var1, class_327 var2, List var3, double var4, double var6, double var8, int var10) {
      int var11 = q2997348aa27a422480aea29cbfd800b1bbabab.b;
      int var13 = 0;
      int var12 = q2997348aa27a422480aea29cbfd800b1bbabab.aaab;

      label24:
      while(true) {
         if (var13 < var3.size()) {
            q2997348aa27a422480aea29cbfd800b1aaabb.abbbaa(var1, var2, (String)var3.get(var13), var4, var6 + (double)var13 * var8, var10);
         } else if (var11 == 0) {
            return;
         }

         do {
            ++var13;
            if (var12 == 0) {
               continue label24;
            }
         } while(var11 != 0);

         return;
      }
   }

   public void baba() {
      // $FF: Couldn't be decompiled
   }

   private double aabba(long param1) {
      // $FF: Couldn't be decompiled
   }

   public void aabaa() {
      q2997348aa27a422480aea29cbfd800b1abbabbaaa.aa().baa();
      this.ba.clear();
      this.baaa = 0L;
   }

   private String aabbb(q2997348aa27a422480aea29cbfd800b1abbaab param1) {
      // $FF: Couldn't be decompiled
   }

   private long abaaa(q2997348aa27a422480aea29cbfd800b1abbaab var1) {
      return var1.b();
   }

   private void ababa(class_332 param1, class_310 param2, List param3) {
      // $FF: Couldn't be decompiled
   }

   static List abbba(String param0, double param1, ToDoubleFunction param3) {
      // $FF: Couldn't be decompiled
   }

   private boolean abbbb(q2997348aa27a422480aea29cbfd800b1abbaab param1) {
      // $FF: Couldn't be decompiled
   }

   private static String baaaa(int param0, int param1) {
      // $FF: Couldn't be decompiled
   }
}
