package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public final class q2997348aa27a422480aea29cbfd800b1abaaaaabb extends q2997348aa27a422480aea29cbfd800b1bbabab {
   private static final String[] aab;
   private final double aa;
   private static final int[] aaa;
   private double ab;
   private q2997348aa27a422480aea29cbfd800b1babba ba;
   private double bb;
   private static final Object[] aba;
   private static final long a;

   public q2997348aa27a422480aea29cbfd800b1abaaaaabb aa(double var1, double var3) {
      this.bb = var1;
      this.ab = var3;
      this.abb((Double)this.abbb());
      return this;
   }

   public double ba() {
      return this.aa;
   }

   public String aaa() {
      return this.ba.bba();
   }

   public JsonElement bb() {
      return new JsonPrimitive((Number)this.abbb());
   }

   public q2997348aa27a422480aea29cbfd800b1abaaaaabb(Object var1, double var2, double var4, double var6, double var8) {
      super((Object)var1, var2);
      this.ba = q2997348aa27a422480aea29cbfd800b1bbbbbbab.ab("");
      this.bb = var4;
      this.ab = var6;
      this.aa = var8;
   }

   public q2997348aa27a422480aea29cbfd800b1abaaaaabb aab(double var1) {
      this.ab = var1;
      this.abb((Double)this.abbb());
      return this;
   }

   public void bab(JsonElement var1) {
      int var2 = q2997348aa27a422480aea29cbfd800b1bbabab.aaab;

      JsonElement var10000;
      label32: {
         try {
            try {
               var10000 = var1;
               if (var2 != 0) {
                  break label32;
               }

               if (var1 == null) {
                  return;
               }
            } catch (MatchException var5) {
               throw var5;
            }
         } catch (IllegalArgumentException var6) {
            throw var6;
         }

         var10000 = var1;
      }

      try {
         if (var10000.isJsonPrimitive()) {
            this.abb(var1.getAsDouble());
         }
      } catch (IllegalArgumentException var3) {
         throw var3;
      } catch (MatchException var4) {
         throw var4;
      }

   }

   public q2997348aa27a422480aea29cbfd800b1abaaaaabb(String var1, double var2, double var4, double var6, double var8) {
      this((Object)var1, var2, var4, var6, var8);
   }

   public q2997348aa27a422480aea29cbfd800b1abaaaaabb aba(Object var1) {
      this.ba = baa(var1);
      return this;
   }

   private static int b(int var0, int var1) {
      int var2 = aaa[var0 ^ -1077107006] ^ var1 ^ var0;
      var2 += 1648;
      var2 += 61479;
      var2 += 19857;
      var2 += 60144;
      var2 ^= 53865;
      var2 -= 30488;
      return var2;
   }

   public void abb(Double var1) {
      double var2 = Math.max(this.bb, Math.min(this.ab, var1));
      super.ab(this.aaba(var2));
   }

   static q2997348aa27a422480aea29cbfd800b1babba baa(Object param0) {
      // $FF: Couldn't be decompiled
   }

   public q2997348aa27a422480aea29cbfd800b1babba bba() {
      return this.ba;
   }

   private int a() {
      // $FF: Couldn't be decompiled
   }

   public double bbb() {
      return this.ab;
   }

   private static String abaa(int var0, int var1) {
      int var3 = var0 ^ 1149887512;
      char[] var4 = aab[var3].toCharArray();
      StackTraceElement[] var2 = (StackTraceElement[])aba[var3];
      StackTraceElement[] var5;
      if (var2 != null) {
         var5 = var2;
      } else {
         var5 = (new Throwable()).getStackTrace();
         aba[var3] = var5;
      }

      StackTraceElement var6 = var5[1];
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ 827333944;
      int var8 = 0;

      do {
         short var9;
         switch (var8 & 31) {
            case 0:
            default:
               var9 = 34;
               break;
            case 1:
               var9 = 176;
               break;
            case 2:
               var9 = 137;
               break;
            case 3:
               var9 = 103;
               break;
            case 4:
               var9 = 169;
               break;
            case 5:
               var9 = 88;
               break;
            case 6:
               var9 = 102;
               break;
            case 7:
               var9 = 137;
               break;
            case 8:
               var9 = 189;
               break;
            case 9:
               var9 = 209;
               break;
            case 10:
               var9 = 116;
               break;
            case 11:
               var9 = 165;
               break;
            case 12:
               var9 = 107;
               break;
            case 13:
               var9 = 254;
               break;
            case 14:
               var9 = 80;
               break;
            case 15:
               var9 = 99;
               break;
            case 16:
               var9 = 38;
               break;
            case 17:
               var9 = 224;
               break;
            case 18:
               var9 = 187;
               break;
            case 19:
               var9 = 158;
               break;
            case 20:
               var9 = 195;
               break;
            case 21:
               var9 = 229;
               break;
            case 22:
               var9 = 119;
               break;
            case 23:
               var9 = 63;
               break;
            case 24:
               var9 = 193;
               break;
            case 25:
               var9 = 188;
               break;
            case 26:
               var9 = 142;
               break;
            case 27:
               var9 = 217;
               break;
            case 28:
               var9 = 230;
               break;
            case 29:
               var9 = 249;
               break;
            case 30:
               var9 = 21;
               break;
            case 31:
               var9 = 111;
         }

         var4[var8] = (char)(var4[var8] ^ var9 ^ var1 >> 16 ^ var7);
         ++var8;
      } while(var8 < var4.length);

      return (new String(var4)).intern();
   }

   static {
      int var20 = 1203203681;
      short var15 = 11036;
      int var14 = 0;
      String[] var10002 = new String[2];
      int var13 = 0;
      String[] var12 = var10002;
      int var11 = "\u0010\udf9a䀹툺䫖\udbca쫙폊嫔폺䫘툊⫟ퟪ\uaad3킪髚\n秆䙱猖홻癦癹穆癴癶癱".length();
      String var10 = "\u0010\udf9a䀹툺䫖\udbca쫙폊嫔폺䫘툊⫟ퟪ\uaad3킪髚\n秆䙱猖홻癦癹穆癴癶癱";

      do {
         int var18 = 0;
         char var16 = var10.charAt(var14);
         char[] var17 = var10.substring(var14 + 1, var14 + 1 + var16).toCharArray();

         do {
            char var19 = var17[var18];
            if (var18 % 2 == 0) {
               var17[var18] = (char)((var19 >>> 4 | var19 << 12) & '\uffff' ^ var15);
            } else {
               var17[var18] = (char)((var19 << 4 | var19 >>> 12) & '\uffff' ^ var15);
            }

            ++var18;
         } while(var18 < var17.length);

         var12[var13] = new String(var17);
         ++var13;
         var14 = var14 + var16 + 1;
      } while(var14 < var11);

      aab = var12;
      aba = new Object[var12.length];
      int var10000 = 0;
      int var10001 = 0;
      byte[] var26 = "z\u0012iÓÐH±Àø\u0090Laè\u0097 \u0015¦\u0000YLø\b*\u0086}jO´«)\u009e§\tr@Ï".getBytes("ISO-8859-1");
      aaa = new int[9];

      int var40;
      do {
         aaa[var10000] = ((var26[var10001] & 255) << 24 | (var26[var10001 + 1] & 255) << 16 | (var26[var10001 + 2] & 255) << 8 | var26[var10001 + 3] & 255) ^ 1214119280;
         ++var10000;
         var40 = var10001 + 4;
         var10001 += 4;
      } while(var40 < var26.length);

      long var1 = 832878864675809255L;
      long[] var0 = new long[2];
      int var4 = 0;
      String var5;
      int var6 = (var5 = abaa(1149887512, var20 ^ 696213313)).length();
      int var3 = 0;

      do {
         var10001 = var3;
         var3 += 8;
         byte[] var7 = var5.substring(var10001, var3).getBytes(abaa(1149887513, var20 ^ -481275966));
         var10001 = var4++;
         long var48 = (((long)var7[0] & 255L) << b(-1077107006, var20 ^ 902441505) | ((long)var7[1] & 255L) << b(-1077107005, var20 ^ -1617890789) | ((long)var7[2] & 255L) << b(-1077107008, var20 ^ -1220014175) | ((long)var7[3] & 255L) << b(-1077107007, var20 ^ -1487969284) | ((long)var7[4] & 255L) << b(-1077107002, var20 ^ -371713318) | ((long)var7[5] & 255L) << b(-1077107001, var20 ^ -1211078279) | ((long)var7[b(-1077107004, var20 ^ 850529342)] & 255L) << b(-1077107003, var20 ^ -453911230) | (long)var7[b(-1077106998, var20 ^ 1185547082)] & 255L) ^ var1;
         var40 = -1;
         var0[var10001] = var48;
      } while(var3 < var6);

      long var8 = var0[1];
      long var32 = var0[0] ^ var8;
      var10001 = -1;
      a = var32;
   }

   public double aaaa() {
      return this.bb;
   }

   public q2997348aa27a422480aea29cbfd800b1abaaaaabb aaab(double var1) {
      this.bb = var1;
      this.abb((Double)this.abbb());
      return this;
   }

   private double aaba(double param1) {
      // $FF: Couldn't be decompiled
   }

   public void ab(Object var1) {
      this.abb((Double)var1);
   }

   public q2997348aa27a422480aea29cbfd800b1abaaaaabb aabb(String var1) {
      return this.aba(var1);
   }
}
