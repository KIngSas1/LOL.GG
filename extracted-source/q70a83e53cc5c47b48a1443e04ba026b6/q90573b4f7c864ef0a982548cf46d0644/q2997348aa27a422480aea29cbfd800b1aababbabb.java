package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum q2997348aa27a422480aea29cbfd800b1aababbabb {
   public static final q2997348aa27a422480aea29cbfd800b1aababbabb a;
   private static final int[] aba;
   private static final q2997348aa27a422480aea29cbfd800b1aababbabb[] aa;
   private static final Object[] baa;
   private final q2997348aa27a422480aea29cbfd800b1babba ab;
   public static final q2997348aa27a422480aea29cbfd800b1aababbabb b;
   private static final String[] abb;
   private final double ba;
   public static final q2997348aa27a422480aea29cbfd800b1aababbabb bb;
   private final double aaa;
   private final double aab;

   static {
      // $FF: Couldn't be decompiled
   }

   double a() {
      return this.aab;
   }

   private static String aaa(short var0, int var1, short var2, char var3) {
      int var8 = var1 ^ -850755368;
      char[] var7 = abb[var8].toCharArray();
      StackTraceElement[] var9 = (StackTraceElement[])baa[var8];
      StackTraceElement[] var10;
      if (var9 != null) {
         var10 = var9;
      } else {
         var10 = (new Throwable()).getStackTrace();
         baa[var8] = var10;
      }

      StackTraceElement var11 = var10[1];
      int var5 = (var11.getClassName().hashCode() ^ var11.getMethodName().hashCode()) >> 16 ^ 11307;
      int var6 = 0;

      do {
         char var10002 = var7[var6];
         short var10003;
         switch (var6 % 9) {
            case 0:
            default:
               var10003 = 28;
               break;
            case 1:
               var10003 = 99;
               break;
            case 2:
               var10003 = 107;
               break;
            case 3:
               var10003 = 151;
               break;
            case 4:
               var10003 = 201;
               break;
            case 5:
               var10003 = 134;
               break;
            case 6:
               var10003 = 90;
               break;
            case 7:
               var10003 = 239;
               break;
            case 8:
               var10003 = 243;
         }

         var7[var6] = (char)(var10002 ^ var10003 ^ var5 ^ var1 ^ var2 ^ var3 ^ var0);
         ++var6;
      } while(var6 < var7.length);

      return (new String(var7)).intern();
   }

   public static q2997348aa27a422480aea29cbfd800b1aababbabb aa(String var0) {
      return (q2997348aa27a422480aea29cbfd800b1aababbabb)Enum.valueOf(q2997348aa27a422480aea29cbfd800b1aababbabb.class, var0);
   }

   private q2997348aa27a422480aea29cbfd800b1aababbabb(q2997348aa27a422480aea29cbfd800b1babba var3, double var4, double var6, double var8) {
      this.ab = var3;
      this.aaa = var4;
      this.aab = var6;
      this.ba = var8;
   }

   double ab() {
      return this.ba;
   }

   private static int bb(int var0, int var1) {
      int var2 = aba[var0 ^ -720307460] ^ var1 ^ var0;
      var2 += 26282;
      var2 += 30452;
      var2 ^= 50375;
      var2 ^= 40899;
      var2 -= 7198;
      var2 -= 62177;
      var2 += 31552;
      var2 ^= 24819;
      return var2;
   }

   public String toString() {
      return this.ab.bba();
   }

   double ba() {
      return this.aaa;
   }

   private static q2997348aa27a422480aea29cbfd800b1aababbabb[] b() {
      return new q2997348aa27a422480aea29cbfd800b1aababbabb[]{a, b, bb};
   }
}
