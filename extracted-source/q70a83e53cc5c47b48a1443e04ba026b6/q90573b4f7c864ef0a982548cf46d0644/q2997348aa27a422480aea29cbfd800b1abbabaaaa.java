package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import com.google.gson.JsonObject;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1297;
import net.minecraft.class_1799;
import net.minecraft.class_310;
import net.minecraft.class_746;

@Environment(EnvType.CLIENT)
public final class q2997348aa27a422480aea29cbfd800b1abbabaaaa extends q2997348aa27a422480aea29cbfd800b1bbaababb {
   private static final int aa;
   private int a;
   private static final long[] ba;
   private static final Long[] ab;
   private static final String[] aaa;
   private static final long aab;
   private static final String[] aba;
   private static final Long[] abb;
   private static final Integer[] bb;
   private long baa;
   private long bab;
   private long bba;
   private final q2997348aa27a422480aea29cbfd800b1aabbabbbb bbb;
   private static final String[] abbb;
   private static final long[] aaaa;
   private static final int[] abba;
   private static final Object[] baaa;
   private int aaab;
   private static final long[] aaba;
   private static final long[] aabb;
   private static final int abaa;
   private static final Integer[] abab;

   private boolean aa(class_746 param1) {
      // $FF: Couldn't be decompiled
   }

   private static long ab(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ a(-94355393, 1615924293 ^ 175653688)) & a(-94355424, 1615924293 ^ 1258080314);
      if (abb[var3] == null) {
         abb[var3] = ba[var3] ^ var1;
      }

      return abb[var3];
   }

   private static String b(char var0, int var1, int var2) {
      int var3 = var1 ^ 18669;
      char[] var4 = abbb[var3].toCharArray();
      StackTraceElement[] var5 = (StackTraceElement[])baaa[var3];
      StackTraceElement[] var6;
      if (var5 != null) {
         var6 = var5;
      } else {
         var6 = (new Throwable()).getStackTrace();
         baaa[var3] = var6;
      }

      StackTraceElement var7 = var6[1];
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 21056;
      int var9 = 0;

      do {
         int var10 = var4[var9] - 20503;
         var10 -= 20727;
         var10 += 29199;
         var10 -= 16929;
         var10 ^= 27368;
         var10 += 32485;
         var10 ^= 35650;
         var4[var9] = (char)(var10 ^ var8 ^ var0 ^ var2 >> 16);
         ++var9;
      } while(var9 < var4.length);

      return (new String(var4)).intern();
   }

   public void baba() {
      // $FF: Couldn't be decompiled
   }

   private boolean ba(class_1799 param1) {
      // $FF: Couldn't be decompiled
   }

   private boolean bb(class_746 param1) {
      // $FF: Couldn't be decompiled
   }

   public void baaaaa(JsonObject var1) {
      super.baaaaa(var1);
      this.bbbaaab(var1, q2997348aa27a422480aea29cbfd800b1bbbbbbab.bbb(aaba(aaa(a(-94355419, -470733260 ^ -488137834), 5962753643730400899L), aaa(a(-94355418, -470733260 ^ 1894851426), 4094800116547160711L))), new q2997348aa27a422480aea29cbfd800b1aabbabbbb[]{this.bbb});
   }

   static {
      // $FF: Couldn't be decompiled
   }

   public q2997348aa27a422480aea29cbfd800b1abbabaaaa() {
      int var1 = -1149775257;
      super((Object)q2997348aa27a422480aea29cbfd800b1bbbbbbab.abbb(aaba(aaa(a(-94355417, var1 ^ -1890575805), 1254987425134785691L), aaa(a(-94355416, var1 ^ -1606991535), 3045602816539350071L))), q2997348aa27a422480aea29cbfd800b1aabbaaaaa.bba, (Object)q2997348aa27a422480aea29cbfd800b1bbbbbbab.abbb(aaba(aaa(a(-94355415, var1 ^ -1499819283), 7338183760335135684L), aaa(a(-94355414, var1 ^ -897159525), 9137371648817666183L))));
      this.bbb = (q2997348aa27a422480aea29cbfd800b1aabbabbbb)this.aaabbbbb((new q2997348aa27a422480aea29cbfd800b1aabbabbbb(q2997348aa27a422480aea29cbfd800b1bbbbbbab.abbb(aaba(aaa(a(-94355413, var1 ^ 410595976), 1204205922229191597L), aaa(a(-94355412, var1 ^ 1537394286), 8019725219670306653L))), (double)55.0F, (double)60.0F, (double)0.0F, (double)300.0F, (double)5.0F)).bbb(q2997348aa27a422480aea29cbfd800b1bbbbbbab.abbb(aaba(aaa(a(-94355411, var1 ^ -1651107356), 7958504248668717718L), aaa(a(-94355410, var1 ^ -1128756172), 524118860157250203L)))));
      this.aaab = bba(aaa(a(-94355409, var1 ^ 972027102), 5982871031593207233L), ab(a(-94355440, var1 ^ 821030241), 8661239768971964766L));
      this.bba = aabb(aaa(a(-94355439, var1 ^ 1068554962), 5809455506081130192L), ab(a(-94355438, var1 ^ 928834678), 7771482913335352327L));
      this.baa = aabb(aaa(a(-94355437, var1 ^ 1638751857), 5809455506081130192L), ab(a(-94355436, var1 ^ 1386272406), 7771482913335352327L));
      this.bab = aabb(aaa(a(-94355435, var1 ^ -670190045), 5809455506081130192L), ab(a(-94355434, var1 ^ -1163997171), 7771482913335352327L));
      this.a = -1;
   }

   private static int aaa(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ a(-94355433, 1555155003 ^ -1530426408);
      if (bb[var3] == null) {
         bb[var3] = (int)(aabb[var3] ^ var1);
      }

      return bb[var3];
   }

   private int aab(class_746 param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   private boolean aba(class_310 param1, class_746 param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   public boolean abb() {
      // $FF: Couldn't be decompiled
   }

   public void babbbba(class_1297 param1, byte param2) {
      // $FF: Couldn't be decompiled
   }

   private void baa() {
      int var1 = -264816979;
      this.bba = aabb(aaa(a(-94355456, var1 ^ 1141248848), 5540115308082250181L), ab(a(-94355455, var1 ^ -69182289), 1703394432570273399L));
      this.baa = aabb(aaa(a(-94355454, var1 ^ 344833798), 5809455506081130192L), ab(a(-94355453, var1 ^ 211357977), 7771482913335352327L));
      this.bab = aabb(aaa(a(-94355452, var1 ^ -894277160), 5809455506081130192L), ab(a(-94355451, var1 ^ 629603919), 7771482913335352327L));
      this.a = -1;
   }

   public void aabaa() {
      this.aaab = bba(aaa(a(-94355450, 215529031 ^ 348772798), 4831749056249233837L), ab(a(-94355449, 215529031 ^ 393468652), 3722785810489133886L));
      this.baa();
   }

   private boolean bab(class_310 param1, class_746 param2, long param3) {
      // $FF: Couldn't be decompiled
   }

   private static int a(int var0, int var1) {
      int var2 = abba[var0 ^ -94355280] ^ var1 ^ var0;
      var2 += 9014;
      var2 += 37324;
      var2 ^= 59977;
      var2 += 28106;
      var2 -= 32500;
      var2 -= 51300;
      var2 -= 62597;
      var2 -= 43787;
      return var2;
   }

   private static int bba(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & ab(a(-94355448, -1687228349 ^ 1485433208), 7379599863936666526L)) ^ aaa(a(-94355447, -1687228349 ^ -158448926), 6305825742810164175L);

      try {
         if (abab[var3] == null) {
            abab[var3] = (int)(aaaa[var3] ^ var1);
         }
      } catch (MatchException var4) {
         throw var4;
      }

      return abab[var3];
   }

   private int bbb(class_746 param1) {
      // $FF: Couldn't be decompiled
   }

   private int aaaa(class_746 param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   private long aaab(q2997348aa27a422480aea29cbfd800b1aabbabbbb param1) {
      // $FF: Couldn't be decompiled
   }

   private static String aaba(int param0, int param1) {
      // $FF: Couldn't be decompiled
   }

   private static long aabb(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ aaa(a(-94355087, -1906661453 ^ 1154551433), 2715741324909840649L)) & aaa(a(-94355086, -1906661453 ^ 1550418762), 8789110025707219467L);

      try {
         if (ab[var3] == null) {
            ab[var3] = aaba[var3] ^ var1;
         }
      } catch (MatchException var4) {
         throw var4;
      }

      return ab[var3];
   }
}
