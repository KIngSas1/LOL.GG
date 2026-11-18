package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public final class q2997348aa27a422480aea29cbfd800b1aabbabbbb extends q2997348aa27a422480aea29cbfd800b1bbabab {
   private static final q2997348aa27a422480aea29cbfd800b1babba aa;
   private static final int[] aba;
   private static final Object[] baa;
   private final double ab;
   private final double ba;
   private q2997348aa27a422480aea29cbfd800b1babba bb;
   private static final String[] abb;
   private static final q2997348aa27a422480aea29cbfd800b1babba aaa;
   private static final long a;
   private final double aab;

   private double aa(double param1) {
      // $FF: Couldn't be decompiled
   }

   private int ba() {
      // $FF: Couldn't be decompiled
   }

   public q2997348aa27a422480aea29cbfd800b1aabbabbbb aaa(String var1) {
      return this.bbb(var1);
   }

   private static int b(int var0, int var1) {
      int var2 = aba[var0 ^ -1947080891] ^ var1 ^ var0;
      var2 += 39053;
      var2 -= 23039;
      var2 -= 37591;
      var2 += 35633;
      var2 += 49770;
      var2 ^= 34360;
      var2 -= 17413;
      var2 += 46816;
      var2 ^= 6636;
      return var2;
   }

   public double aab() {
      return this.ba;
   }

   public q2997348aa27a422480aea29cbfd800b1aabbabbbb(String var1, double var2, double var4, double var6, double var8, double var10) {
      this((Object)var1, var2, var4, var6, var8, var10);
   }

   public double aba() {
      return ((double[])this.abbb())[0];
   }

   public void bab(JsonElement param1) {
      // $FF: Couldn't be decompiled
   }

   private static String abaa(char var0, int var1, short var2) {
      int var3 = var0 ^ 'ﰅ';
      char[] var4 = abb[var3].toCharArray();
      StackTraceElement[] var5 = (StackTraceElement[])baa[var3];
      StackTraceElement[] var6;
      if (var5 != null) {
         var6 = var5;
      } else {
         var6 = (new Throwable()).getStackTrace();
         baa[var3] = var6;
      }

      StackTraceElement var7 = var6[1];
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 28952;
      int var9 = 0;

      do {
         int var10 = var4[var9] - 9269;
         var10 -= 20647;
         var10 += 56768;
         var10 -= 34215;
         var10 ^= 23917;
         var4[var9] = (char)(var10 ^ var8 ^ var2 ^ var1 >> 16);
         ++var9;
      } while(var9 < var4.length);

      return (new String(var4)).intern();
   }

   public long bbaa() {
      return this.aabb().aaabb();
   }

   public String babb() {
      return this.aabb().bba();
   }

   static {
      // $FF: Couldn't be decompiled
   }

   public double abb() {
      return ((double[])this.abbb())[1];
   }

   public void baa(double[] param1) {
      // $FF: Couldn't be decompiled
   }

   public double bba() {
      return this.aab;
   }

   public JsonElement bb() {
      JsonArray var1 = new JsonArray();
      var1.add(new JsonPrimitive(((double[])this.abbb())[0]));
      var1.add(new JsonPrimitive(((double[])this.abbb())[1]));
      return var1;
   }

   public q2997348aa27a422480aea29cbfd800b1aabbabbbb bbb(Object var1) {
      this.bb = q2997348aa27a422480aea29cbfd800b1abaaaaabb.baa(var1);
      return this;
   }

   public q2997348aa27a422480aea29cbfd800b1babba aaaa() {
      return this.bb;
   }

   public String aaab() {
      return this.bb.bba();
   }

   public double aaba() {
      return this.ab;
   }

   public q2997348aa27a422480aea29cbfd800b1aabbabbbb(Object var1, double var2, double var4, double var6, double var8, double var10) {
      super((Object)var1, new double[]{var2, var4});
      this.bb = q2997348aa27a422480aea29cbfd800b1bbbbbbab.ab("");
      this.aab = var6;
      this.ab = var8;
      this.ba = var10;
   }

   public void ab(Object var1) {
      this.baa((double[])var1);
   }

   private q2997348aa27a422480aea29cbfd800b1babba aabb() {
      // $FF: Couldn't be decompiled
   }

   public void a(double var1, double var3) {
      this.baa(new double[]{var1, var3});
   }
}
