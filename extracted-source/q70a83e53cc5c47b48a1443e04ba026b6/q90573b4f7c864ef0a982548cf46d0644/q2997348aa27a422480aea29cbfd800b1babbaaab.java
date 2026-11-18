package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import com.mojang.authlib.GameProfile;
import java.util.Map;
import java.util.Optional;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_1011;
import net.minecraft.class_12079;
import net.minecraft.class_310;
import net.minecraft.class_8685;

@Environment(EnvType.CLIENT)
public final class q2997348aa27a422480aea29cbfd800b1babbaaab extends q2997348aa27a422480aea29cbfd800b1bbaababb {
   private static final int[] abba;
   private static final long[] aa;
   private static final int ba;
   private String aaa;
   private static final Object[] baaa;
   private static final Long[] aab;
   private static final String[] aba;
   private static final Map abb;
   private static final int baa;
   private static final int a;
   private static final Long[] bab;
   private static final int bb;
   private boolean bba;
   private class_8685 bbb;
   private static final Integer[] aaaa;
   private static final long[] aaab;
   private q2997348aa27a422480aea29cbfd800b1aaaabaab ab;
   private static final long[] aaba;
   private class_8685 aabb;
   private static final String[] abbb;
   private static final String[] abaa;
   private final q2997348aa27a422480aea29cbfd800b1bbbabaaa abab;

   public String abbaa() {
      return ((q2997348aa27a422480aea29cbfd800b1aaaabaab)this.abab.abbb()).b();
   }

   private static class_8685 aa(class_8685 param0, q2997348aa27a422480aea29cbfd800b1aaaabaab param1) {
      // $FF: Couldn't be decompiled
   }

   private void ab(class_310 var1, Optional var2, Throwable var3) {
      var1.execute(this::bb);
   }

   public void ababb() {
      this.aba();
   }

   public q2997348aa27a422480aea29cbfd800b1babbaaab() {
      int var1 = -1926674768;
      super((Object)q2997348aa27a422480aea29cbfd800b1bbbbbbab.abbb(aabb(aaaa(a(1357925111, var1 ^ -450236199), 683864661276245611L), aaaa(a(1357925108, var1 ^ 1335146060), 9161056538189930162L))), q2997348aa27a422480aea29cbfd800b1aabbaaaaa.bab, (Object)q2997348aa27a422480aea29cbfd800b1bbbbbbab.abbb(aabb(aaaa(a(1357925109, var1 ^ 1724906506), 7297346778418164148L), aaaa(a(1357925106, var1 ^ 349021946), 9030593351572176541L))));
      this.abab = (q2997348aa27a422480aea29cbfd800b1bbbabaaa)this.aaabbbbb(new q2997348aa27a422480aea29cbfd800b1bbbabaaa(q2997348aa27a422480aea29cbfd800b1bbbbbbab.abbb(aabb(aaaa(a(1357925107, var1 ^ -938630069), 797222097656694577L), aaaa(a(1357925104, var1 ^ 87238225), 6239855838310577950L))), q2997348aa27a422480aea29cbfd800b1aaaabaab.class, q2997348aa27a422480aea29cbfd800b1aaaabaab.abaa));
      this.ab = q2997348aa27a422480aea29cbfd800b1aaaabaab.abaa;
      this.aaa = "";
   }

   private static class_1011 ba(class_1011 param0) {
      // $FF: Couldn't be decompiled
   }

   private void bb(Throwable param1, Optional param2) {
      // $FF: Couldn't be decompiled
   }

   public Object aaa(GameProfile param1, Object param2) {
      // $FF: Couldn't be decompiled
   }

   private static long aab(long var0, long var2) {
      return (var0 + var2 - 1L) / var2;
   }

   private void aba() {
      // $FF: Couldn't be decompiled
   }

   private static int a(int var0, int var1) {
      int var2 = abba[var0 ^ 1357924990] ^ var1 ^ var0;
      var2 += 10301;
      var2 ^= 7109;
      var2 ^= 24769;
      var2 -= 24729;
      var2 += 35420;
      var2 ^= 1453;
      var2 += 42024;
      var2 ^= 19905;
      var2 += 58479;
      return var2;
   }

   public void abb(String var1) {
   }

   private static String b(byte var0, int var1, char var2, short var3, int var4, short var5) {
      int var10 = var4 ^ 1469655879;
      char[] var9 = abbb[var10].toCharArray();
      StackTraceElement[] var11 = (StackTraceElement[])baaa[var10];
      StackTraceElement[] var12;
      if (var11 != null) {
         var12 = var11;
      } else {
         var12 = (new Throwable()).getStackTrace();
         baaa[var10] = var12;
      }

      StackTraceElement var13 = var12[1];
      int var7 = (var13.getClassName().hashCode() ^ var13.getMethodName().hashCode()) >> 16 ^ '鞤';
      int var8 = 0;

      do {
         var9[var8] = (char)(var9[var8] ^ 18051 ^ var7 ^ var5 ^ var4 ^ var1 ^ var0 ^ var3 ^ var2);
         ++var8;
      } while(var8 < var9.length);

      return (new String(var9)).intern();
   }

   public void aabaa() {
      this.aabb = null;
      this.bba = false;
   }

   private static class_12079.class_12081 baa(q2997348aa27a422480aea29cbfd800b1aaaabaab var0) {
      return (class_12079.class_12081)abb.computeIfAbsent(var0, q2997348aa27a422480aea29cbfd800b1babbaaab::bbb);
   }

   private boolean bab(GameProfile param1) {
      // $FF: Couldn't be decompiled
   }

   public void bba() {
   }

   private static class_12079.class_12081 bbb(q2997348aa27a422480aea29cbfd800b1aaaabaab param0) {
      // $FF: Couldn't be decompiled
   }

   private static int aaaa(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ a(1357925079, -1836887062 ^ -2143031090);
      if (aaaa[var3] == null) {
         aaaa[var3] = (int)(aaba[var3] ^ var1);
      }

      return aaaa[var3];
   }

   public void baba() {
      this.aba();
   }

   static {
      // $FF: Couldn't be decompiled
   }

   private static long aaab(int param0, long param1) {
      // $FF: Couldn't be decompiled
   }

   private static long aaba(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ a(1357925074, 1068823913 ^ -1426260165)) & a(1357925075, 1068823913 ^ -1375689128);
      if (bab[var3] == null) {
         bab[var3] = aaab[var3] ^ var1;
      }

      return bab[var3];
   }

   private static String aabb(int param0, int param1) {
      // $FF: Couldn't be decompiled
   }
}
