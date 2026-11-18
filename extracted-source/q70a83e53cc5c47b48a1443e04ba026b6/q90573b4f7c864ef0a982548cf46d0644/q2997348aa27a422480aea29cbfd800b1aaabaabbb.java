package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum q2997348aa27a422480aea29cbfd800b1aaabaabbb {
   private static final String[] bb;
   private static final Object[] aaa;
   private static final int[] ba;
   private final q2997348aa27a422480aea29cbfd800b1babba a;
   public static final q2997348aa27a422480aea29cbfd800b1aaabaabbb b;
   private static final q2997348aa27a422480aea29cbfd800b1aaabaabbb[] aa;
   public static final q2997348aa27a422480aea29cbfd800b1aaabaabbb ab;

   private static int b(int var0, int var1) {
      int var2 = ba[var0 ^ -684534626] ^ var1 ^ var0;
      var2 += 15711;
      var2 -= 32614;
      var2 += 5808;
      var2 += 32674;
      var2 += 5801;
      var2 ^= 26628;
      var2 -= 6537;
      var2 -= 18406;
      var2 ^= 43106;
      var2 -= 39596;
      return var2;
   }

   private q2997348aa27a422480aea29cbfd800b1aaabaabbb(q2997348aa27a422480aea29cbfd800b1babba var3) {
      this.a = var3;
   }

   private static q2997348aa27a422480aea29cbfd800b1aaabaabbb[] a() {
      return new q2997348aa27a422480aea29cbfd800b1aaabaabbb[]{ab, b};
   }

   static {
      // $FF: Couldn't be decompiled
   }

   private static String aa(int var0, byte var1, int var2, short var3, int var4) {
      int var9 = var4 ^ 2128074193;
      char[] var8 = bb[var9].toCharArray();
      StackTraceElement[] var10 = (StackTraceElement[])aaa[var9];
      StackTraceElement[] var11;
      if (var10 != null) {
         var11 = var10;
      } else {
         var11 = (new Throwable()).getStackTrace();
         aaa[var9] = var11;
      }

      StackTraceElement var12 = var11[1];
      int var6 = (var12.getClassName().hashCode() ^ var12.getMethodName().hashCode()) >> 16 ^ '\ue76a';

      for(int var7 = 0; var7 < var8.length; ++var7) {
         char var10002 = var8[var7];
         short var10003;
         switch (var7 % 27) {
            case 0:
            default:
               var10003 = 27;
               break;
            case 1:
               var10003 = 251;
               break;
            case 2:
               var10003 = 157;
               break;
            case 3:
               var10003 = 227;
               break;
            case 4:
               var10003 = 70;
               break;
            case 5:
               var10003 = 224;
               break;
            case 6:
               var10003 = 33;
               break;
            case 7:
               var10003 = 50;
               break;
            case 8:
               var10003 = 168;
               break;
            case 9:
               var10003 = 105;
               break;
            case 10:
               var10003 = 105;
               break;
            case 11:
               var10003 = 131;
               break;
            case 12:
               var10003 = 17;
               break;
            case 13:
               var10003 = 172;
               break;
            case 14:
               var10003 = 235;
               break;
            case 15:
               var10003 = 7;
               break;
            case 16:
               var10003 = 116;
               break;
            case 17:
               var10003 = 208;
               break;
            case 18:
               var10003 = 52;
               break;
            case 19:
               var10003 = 172;
               break;
            case 20:
               var10003 = 193;
               break;
            case 21:
               var10003 = 99;
               break;
            case 22:
               var10003 = 218;
               break;
            case 23:
               var10003 = 50;
               break;
            case 24:
               var10003 = 215;
               break;
            case 25:
               var10003 = 39;
               break;
            case 26:
               var10003 = 23;
         }

         var8[var7] = (char)(var10002 ^ var10003 ^ var1 ^ var3 ^ var4 ^ var2 ^ var6 ^ var0);
      }

      return (new String(var8)).intern();
   }

   public String toString() {
      return this.a.bba();
   }
}
