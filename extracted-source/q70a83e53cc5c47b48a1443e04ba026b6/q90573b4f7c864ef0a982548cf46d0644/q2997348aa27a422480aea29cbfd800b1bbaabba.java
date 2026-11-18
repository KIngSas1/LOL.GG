package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import java.util.Random;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public final class q2997348aa27a422480aea29cbfd800b1bbaabba implements q2997348aa27a422480aea29cbfd800b1abaaaabb {
   private static final String[] bbba;
   private static final long a;
   private float aa;
   private float ab;
   private boolean ba;
   private static final float bb = 0.6F;
   private float aaa = 0.4F;
   private q2997348aa27a422480aea29cbfd800b1abbaaabab aab;
   private static final float aba = 0.2F;
   private float abb;
   private static final Object[] bbbb;
   private static final int[] bbab;
   private static final float baa = 1.7320508F;
   private static final float bab = 0.06666667F;
   private boolean bba;
   private q2997348aa27a422480aea29cbfd800b1abbaaabab bbb;
   private q2997348aa27a422480aea29cbfd800b1abbaaabab aaaa;
   private static final float aaab = 0.2F;
   private static final float aaba = 2.236068F;
   private static final float aabb = 14.0F;
   private float b;
   private static final float abaa = 60.0F;
   private static final float abab = 0.4F;
   private static final float abba = 0.15F;
   private float abbb;
   private static final float baaa = 0.8F;
   private static final float baab = 1.0F;
   private float baba;
   private Random babb;
   private static final float bbaa = 1.0001F;

   public q2997348aa27a422480aea29cbfd800b1abbaaabab aa(q2997348aa27a422480aea29cbfd800b1abbaaabab var1, q2997348aa27a422480aea29cbfd800b1abbaaabab var2, float var3, float var4) {
      return this.aab(var1, var2, var3, 10.0F, var4);
   }

   public void ab(q2997348aa27a422480aea29cbfd800b1bbaabba var1) {
      this.aab = var1.aab;
      this.aaaa = var1.aaaa;
      this.bbb = var1.bbb;
      this.baba = var1.baba;
      this.abbb = var1.abbb;
      this.b = var1.b;
      this.aa = var1.aa;
      this.ab = var1.ab;
      this.abb = var1.abb;
      this.aaa = var1.aaa;
      this.bba = var1.bba;
      this.ba = var1.ba;
   }

   static {
      int var26 = 323076838;
      short var21 = 25572;
      int var20 = 0;
      int var17 = "\u0010⊰壨‟顋⃨\uf8ad◨㣽‷硉◀㢡↰磯₧塞\n작\udf74쇆뿉슁鼣육뽻앎\udfcd".length();
      String var16 = "\u0010⊰壨‟顋⃨\uf8ad◨㣽‷硉◀㢡↰磯₧塞\n작\udf74쇆뿉슁鼣육뽻앎\udfcd";
      int var19 = 0;
      String[] var18 = new String[2];

      do {
         char var22 = var16.charAt(var20);
         int var24 = 0;
         char[] var23 = var16.substring(var20 + 1, var20 + 1 + var22).toCharArray();

         do {
            int var25 = var23[var24];
            short var10000;
            switch (var24 % 6) {
               case 0:
               default:
                  var10000 = 6;
                  break;
               case 1:
                  var10000 = 124;
                  break;
               case 2:
                  var10000 = 233;
                  break;
               case 3:
                  var10000 = 216;
                  break;
               case 4:
                  var10000 = 38;
                  break;
               case 5:
                  var10000 = 46;
            }

            var25 = (char)var10000 ^ var25;
            if (var24 % 2 == 0) {
               var23[var24] = (char)((var25 >>> 3 | var25 << 13) & '\uffff' ^ var21);
            } else {
               var23[var24] = (char)((var25 << 3 | var25 >>> 13) & '\uffff' ^ var21);
            }

            ++var24;
         } while(var24 < var23.length);

         var18[var19] = new String(var23);
         ++var19;
         var20 = var20 + var22 + 1;
      } while(var20 < var17);

      bbba = var18;
      bbbb = new Object[var18.length];
      int var12 = 1777392099;
      byte[] var10 = "ýë\u0082Æ'ñp\u0091äç\u0011þN3ÿðö°¨\u009a~Ûi¹t\u001bT¶åe\u001eý\u0015wv\u001d".getBytes("ISO-8859-1");
      int var11 = var10.length / 4;
      bbab = new int[var11];
      int var13 = 0;
      int var14 = 0;

      do {
         int var15 = (var10[var13] & 255) << 24 | (var10[var13 + 1] & 255) << 16 | (var10[var13 + 2] & 255) << 8 | var10[var13 + 3] & 255;
         var15 ^= var12;
         bbab[var14] = var15;
         var13 += 4;
         ++var14;
      } while(var14 < var11);

      long var1 = 8650508956495939125L;
      long[] var0 = new long[2];
      int var4 = 0;
      String var5;
      int var6 = (var5 = bab(1679302540, var26 ^ -2092381821)).length();
      int var3 = 0;

      do {
         int var10001 = var3;
         var3 += 8;
         byte[] var7 = var5.substring(var10001, var3).getBytes(bab(1679302541, var26 ^ -1080767462));
         var10001 = var4++;
         long var10004 = (((long)var7[0] & 255L) << a(-939699792, var26 ^ 1084733720) | ((long)var7[1] & 255L) << a(-939699791, var26 ^ -1698870442) | ((long)var7[2] & 255L) << a(-939699790, var26 ^ 1504389650) | ((long)var7[3] & 255L) << a(-939699789, var26 ^ -209730523) | ((long)var7[4] & 255L) << a(-939699788, var26 ^ 1274843936) | ((long)var7[5] & 255L) << a(-939699787, var26 ^ -1013493222) | ((long)var7[a(-939699786, var26 ^ -917016840)] & 255L) << a(-939699785, var26 ^ 1479091380) | (long)var7[a(-939699784, var26 ^ -1472508834)] & 255L) ^ var1;
         boolean var10003 = true;
         var0[var10001] = var10004;
      } while(var3 < var6);

      long var8 = var0[1];
      long var10002 = var0[0] ^ var8;
      boolean var30 = true;
      a = var10002;
   }

   private static q2997348aa27a422480aea29cbfd800b1abbaaabab ba(q2997348aa27a422480aea29cbfd800b1abbaaabab param0, q2997348aa27a422480aea29cbfd800b1abbaaabab param1, float param2) {
      // $FF: Couldn't be decompiled
   }

   public static int bb(float param0, float param1) {
      // $FF: Couldn't be decompiled
   }

   public void aaa(Random var1) {
      this.babb = var1;
   }

   public q2997348aa27a422480aea29cbfd800b1abbaaabab aab(q2997348aa27a422480aea29cbfd800b1abbaaabab param1, q2997348aa27a422480aea29cbfd800b1abbaaabab param2, float param3, float param4, float param5) {
      // $FF: Couldn't be decompiled
   }

   private q2997348aa27a422480aea29cbfd800b1abbaaabab aba(q2997348aa27a422480aea29cbfd800b1abbaaabab var1, q2997348aa27a422480aea29cbfd800b1abbaaabab var2, float var3) {
      return this.abb(var1, var2, var3, 1.0F);
   }

   private q2997348aa27a422480aea29cbfd800b1abbaaabab abb(q2997348aa27a422480aea29cbfd800b1abbaaabab param1, q2997348aa27a422480aea29cbfd800b1abbaaabab param2, float param3, float param4) {
      // $FF: Couldn't be decompiled
   }

   private static String bab(int var0, int var1) {
      int var3 = var0 ^ 1679302540;
      char[] var4 = bbba[var3].toCharArray();
      StackTraceElement[] var2 = (StackTraceElement[])bbbb[var3];
      StackTraceElement[] var5;
      if (var2 != null) {
         var5 = var2;
      } else {
         var5 = (new Throwable()).getStackTrace();
         bbbb[var3] = var5;
      }

      StackTraceElement var6 = var5[1];
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ 1630442506;
      int var8 = 0;

      do {
         short var9;
         switch (var8 & 31) {
            case 0:
            default:
               var9 = 36;
               break;
            case 1:
               var9 = 138;
               break;
            case 2:
               var9 = 245;
               break;
            case 3:
               var9 = 63;
               break;
            case 4:
               var9 = 243;
               break;
            case 5:
               var9 = 203;
               break;
            case 6:
               var9 = 78;
               break;
            case 7:
               var9 = 155;
               break;
            case 8:
               var9 = 6;
               break;
            case 9:
               var9 = 0;
               break;
            case 10:
               var9 = 214;
               break;
            case 11:
               var9 = 170;
               break;
            case 12:
               var9 = 220;
               break;
            case 13:
               var9 = 79;
               break;
            case 14:
               var9 = 250;
               break;
            case 15:
               var9 = 136;
               break;
            case 16:
               var9 = 106;
               break;
            case 17:
               var9 = 247;
               break;
            case 18:
               var9 = 0;
               break;
            case 19:
               var9 = 16;
               break;
            case 20:
               var9 = 241;
               break;
            case 21:
               var9 = 101;
               break;
            case 22:
               var9 = 200;
               break;
            case 23:
               var9 = 204;
               break;
            case 24:
               var9 = 138;
               break;
            case 25:
               var9 = 243;
               break;
            case 26:
               var9 = 198;
               break;
            case 27:
               var9 = 252;
               break;
            case 28:
               var9 = 104;
               break;
            case 29:
               var9 = 218;
               break;
            case 30:
               var9 = 158;
               break;
            case 31:
               var9 = 73;
         }

         var4[var8] = (char)(var4[var8] ^ var9 ^ var1 >> 16 ^ var7);
         ++var8;
      } while(var8 < var4.length);

      return (new String(var4)).intern();
   }

   public void baa() {
      this.aa = 0.0F;
      this.ab = 0.0F;
      this.abbb = 0.0F;
      this.b = 0.0F;
      this.bba = false;
      this.ba = false;
   }

   public void b() {
      this.baa();
      this.aaaa = null;
      this.aab = null;
      this.bbb = null;
      this.baba = 0.0F;
   }

   private static int a(int var0, int var1) {
      int var2 = bbab[var0 ^ -939699792] ^ var1 ^ var0;
      var2 -= 16887;
      var2 ^= 50094;
      var2 -= 25144;
      var2 -= 45342;
      var2 += 12022;
      var2 -= 24084;
      var2 += 21970;
      return var2;
   }
}
