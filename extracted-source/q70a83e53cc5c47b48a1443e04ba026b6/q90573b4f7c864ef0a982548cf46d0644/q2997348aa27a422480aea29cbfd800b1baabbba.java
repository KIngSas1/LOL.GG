package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1309;
import net.minecraft.class_243;
import net.minecraft.class_310;

@Environment(EnvType.CLIENT)
public final class q2997348aa27a422480aea29cbfd800b1baabbba extends q2997348aa27a422480aea29cbfd800b1bbaababb {
   private static final long[] aa;
   private static final int[] abb;
   public static final float ab = 0.01F;
   private static final Object[] bab;
   private final q2997348aa27a422480aea29cbfd800b1bbbabaaa ba;
   private final q2997348aa27a422480aea29cbfd800b1aabababab a;
   private static final String[] baa;
   public static final float bb = 10.0F;
   private static final Integer[] aaa;
   private static final String[] aab;
   private static final String[] aba;

   private static int aa(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ bba(-370389723, -372540136 ^ 117914459);
      if (aaa[var3] == null) {
         aaa[var3] = (int)(aa[var3] ^ var1);
      }

      return aaa[var3];
   }

   public boolean a() {
      boolean var10000;
      try {
         try {
            if (this.bb() == q2997348aa27a422480aea29cbfd800b1aababb.a) {
               var10000 = true;
               return var10000;
            }
         } catch (IllegalStateException var1) {
            throw var1;
         }
      } catch (MatchException var2) {
         throw var2;
      }

      var10000 = false;
      return var10000;
   }

   public boolean ab() {
      return (Boolean)this.a.abbb();
   }

   private static String bbb(int var0, char var1, char var2) {
      int var3 = var1 ^ 185;
      char[] var4 = baa[var3].toCharArray();
      StackTraceElement[] var5 = (StackTraceElement[])bab[var3];
      StackTraceElement[] var6;
      if (var5 != null) {
         var6 = var5;
      } else {
         var6 = (new Throwable()).getStackTrace();
         bab[var3] = var6;
      }

      StackTraceElement var7 = var6[1];
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 1754;
      int var9 = 0;

      do {
         int var10 = var4[var9] ^ 24612;
         var10 += 22631;
         var10 += 43365;
         var10 ^= 41680;
         var10 ^= 23750;
         var10 -= 18794;
         var10 -= 31571;
         var10 ^= 30000;
         var4[var9] = (char)(var10 ^ var8 ^ var2 ^ var0 >> 16);
         ++var9;
      } while(var9 < var4.length);

      return (new String(var4)).intern();
   }

   public boolean ba() {
      boolean var10000;
      try {
         try {
            if (this.bb() == q2997348aa27a422480aea29cbfd800b1aababb.ba) {
               var10000 = true;
               return var10000;
            }
         } catch (IllegalStateException var1) {
            throw var1;
         }
      } catch (MatchException var2) {
         throw var2;
      }

      var10000 = false;
      return var10000;
   }

   static {
      // $FF: Couldn't be decompiled
   }

   public String abbaa() {
      return this.bb().toString();
   }

   public q2997348aa27a422480aea29cbfd800b1aababb bb() {
      return (q2997348aa27a422480aea29cbfd800b1aababb)this.ba.abbb();
   }

   private static String aaa(int param0, int param1) {
      // $FF: Couldn't be decompiled
   }

   public boolean aab() {
      boolean var10000;
      try {
         try {
            if (this.bb() == q2997348aa27a422480aea29cbfd800b1aababb.b) {
               var10000 = true;
               return var10000;
            }
         } catch (IllegalStateException var1) {
            throw var1;
         }
      } catch (MatchException var2) {
         throw var2;
      }

      var10000 = false;
      return var10000;
   }

   public q2997348aa27a422480aea29cbfd800b1bbbaaaaa aba() {
      return q2997348aa27a422480aea29cbfd800b1bbbaaaaa.abb;
   }

   private static int bba(int var0, int var1) {
      int var2 = abb[var0 ^ -370389723] ^ var1 ^ var0;
      var2 -= 31856;
      var2 -= 14149;
      var2 -= 36284;
      var2 += 14280;
      var2 += 57284;
      var2 += 62877;
      var2 -= 42200;
      var2 += 8338;
      return var2;
   }

   public q2997348aa27a422480aea29cbfd800b1baabbba() {
      int var1 = -387042058;
      super((Object)q2997348aa27a422480aea29cbfd800b1bbbbbbab.abbb(aaa(aa(bba(-370389978, var1 ^ -1078534993), 254271738305019141L), aa(bba(-370389983, var1 ^ 1725496268), 4501952887511339218L))), q2997348aa27a422480aea29cbfd800b1aabbaaaaa.aba, (Object)q2997348aa27a422480aea29cbfd800b1bbbbbbab.abbb(aaa(aa(bba(-370389984, var1 ^ -619329015), 6318935911774204995L), aa(bba(-370389981, var1 ^ -1153358596), 460284291747331183L))), false);
      this.ba = (q2997348aa27a422480aea29cbfd800b1bbbabaaa)this.aaabbbbb(new q2997348aa27a422480aea29cbfd800b1bbbabaaa(q2997348aa27a422480aea29cbfd800b1bbbbbbab.abbb(aaa(aa(bba(-370389982, var1 ^ 1682789561), 5402377649083351283L), aa(bba(-370389971, var1 ^ 472429145), 2191206058589112878L))), q2997348aa27a422480aea29cbfd800b1aababb.class, q2997348aa27a422480aea29cbfd800b1aababb.ba));
      this.a = (q2997348aa27a422480aea29cbfd800b1aabababab)this.aaabbbbb(new q2997348aa27a422480aea29cbfd800b1aabababab(q2997348aa27a422480aea29cbfd800b1bbbbbbab.abbb(aaa(aa(bba(-370389972, var1 ^ -16660707), 2580629122921492438L), aa(bba(-370389969, var1 ^ 1498560949), 3082494082096085609L))), false));
   }

   public class_243 abb(class_1309 var1) {
      class_310 var2 = class_310.method_1551();

      try {
         try {
            if (!this.bab(var2, var1)) {
               return var1.method_5720();
            }
         } catch (IllegalStateException var3) {
            throw var3;
         }
      } catch (MatchException var4) {
         throw var4;
      }

      return class_243.method_1030(q2997348aa27a422480aea29cbfd800b1bbb.bbbaaa(), q2997348aa27a422480aea29cbfd800b1bbb.bbbaa());
   }

   public boolean baa() {
      boolean var10000;
      try {
         try {
            if (this.bb() != q2997348aa27a422480aea29cbfd800b1aababb.b) {
               var10000 = true;
               return var10000;
            }
         } catch (IllegalStateException var1) {
            throw var1;
         }
      } catch (MatchException var2) {
         throw var2;
      }

      var10000 = false;
      return var10000;
   }

   private boolean bab(class_310 param1, class_1309 param2) {
      // $FF: Couldn't be decompiled
   }

   public float b() {
      return 60.0F;
   }
}
