package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum q2997348aa27a422480aea29cbfd800b1aaaababb {
   private static final q2997348aa27a422480aea29cbfd800b1aaaababb[] a;
   private static final int[] ba;
   private static final Object[] aaa;
   private final q2997348aa27a422480aea29cbfd800b1babba aa;
   private static final String[] bb;
   public static final q2997348aa27a422480aea29cbfd800b1aaaababb b;
   public static final q2997348aa27a422480aea29cbfd800b1aaaababb ab;

   public String toString() {
      return this.aa.bba();
   }

   private q2997348aa27a422480aea29cbfd800b1aaaababb(q2997348aa27a422480aea29cbfd800b1babba var3) {
      this.aa = var3;
   }

   private static int b(int var0, int var1) {
      int var2 = ba[var0 ^ 1752384939] ^ var1 ^ var0;
      var2 -= 22431;
      var2 -= 34578;
      var2 -= 24606;
      var2 ^= 51467;
      var2 ^= 40768;
      var2 += 10603;
      var2 -= 36390;
      var2 += 38115;
      var2 += 23880;
      var2 += 11687;
      return var2;
   }

   static {
      // $FF: Couldn't be decompiled
   }

   private static String ab(short var0, char var1, int var2, short var3, byte var4, int var5) {
      int var10 = var2 ^ 501892244;
      char[] var9 = bb[var10].toCharArray();
      StackTraceElement[] var11 = (StackTraceElement[])aaa[var10];
      StackTraceElement[] var12;
      if (var11 != null) {
         var12 = var11;
      } else {
         var12 = (new Throwable()).getStackTrace();
         aaa[var10] = var12;
      }

      StackTraceElement var13 = var12[1];
      int var7 = (var13.getClassName().hashCode() ^ var13.getMethodName().hashCode()) >> 16 ^ 25551;
      int var8 = 0;

      do {
         char var10002 = var9[var8];
         short var10003;
         switch (var8 % 25) {
            case 0:
            default:
               var10003 = 62;
               break;
            case 1:
               var10003 = 129;
               break;
            case 2:
               var10003 = 20;
               break;
            case 3:
               var10003 = 194;
               break;
            case 4:
               var10003 = 236;
               break;
            case 5:
               var10003 = 69;
               break;
            case 6:
               var10003 = 246;
               break;
            case 7:
               var10003 = 86;
               break;
            case 8:
               var10003 = 41;
               break;
            case 9:
               var10003 = 94;
               break;
            case 10:
               var10003 = 40;
               break;
            case 11:
               var10003 = 41;
               break;
            case 12:
               var10003 = 22;
               break;
            case 13:
               var10003 = 123;
               break;
            case 14:
               var10003 = 132;
               break;
            case 15:
               var10003 = 89;
               break;
            case 16:
               var10003 = 190;
               break;
            case 17:
               var10003 = 205;
               break;
            case 18:
               var10003 = 174;
               break;
            case 19:
               var10003 = 189;
               break;
            case 20:
               var10003 = 148;
               break;
            case 21:
               var10003 = 60;
               break;
            case 22:
               var10003 = 50;
               break;
            case 23:
               var10003 = 202;
               break;
            case 24:
               var10003 = 242;
         }

         var9[var8] = (char)(var10002 ^ var10003 ^ var5 ^ var1 ^ var3 ^ var4 ^ var0 ^ var7 ^ var2);
         ++var8;
      } while(var8 < var9.length);

      return (new String(var9)).intern();
   }

   private static q2997348aa27a422480aea29cbfd800b1aaaababb[] a() {
      return new q2997348aa27a422480aea29cbfd800b1aaaababb[]{b, ab};
   }

   public static q2997348aa27a422480aea29cbfd800b1aaaababb aa(String var0) {
      return (q2997348aa27a422480aea29cbfd800b1aaaababb)Enum.valueOf(q2997348aa27a422480aea29cbfd800b1aaaababb.class, var0);
   }
}
