package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import com.google.gson.JsonObject;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public final class q2997348aa27a422480aea29cbfd800b1bbaaa extends q2997348aa27a422480aea29cbfd800b1bbaababb {
   private static final int[] a;
   private static final Integer[] aa;
   private static final long[] ab;
   private static final Object[] aab;
   private static final String[] ba;
   private static final String[] aaa;
   private static final String[] bb;

   private static int aa(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ b(268640553, -875058435 ^ -1547266204);
      if (aa[var3] == null) {
         aa[var3] = (int)(ab[var3] ^ var1);
      }

      return aa[var3];
   }

   private static String ab(int var0, int var1) {
      int var3 = var0 ^ 781567303;
      char[] var4 = aaa[var3].toCharArray();
      StackTraceElement[] var2 = (StackTraceElement[])aab[var3];
      StackTraceElement[] var5;
      if (var2 != null) {
         var5 = var2;
      } else {
         var5 = (new Throwable()).getStackTrace();
         aab[var3] = var5;
      }

      StackTraceElement var6 = var5[1];
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ 824796461;
      int var8 = 0;

      do {
         short var9;
         switch (var8 & 31) {
            case 0:
            default:
               var9 = 248;
               break;
            case 1:
               var9 = 226;
               break;
            case 2:
               var9 = 229;
               break;
            case 3:
               var9 = 153;
               break;
            case 4:
               var9 = 6;
               break;
            case 5:
               var9 = 2;
               break;
            case 6:
               var9 = 37;
               break;
            case 7:
               var9 = 252;
               break;
            case 8:
               var9 = 60;
               break;
            case 9:
               var9 = 242;
               break;
            case 10:
               var9 = 162;
               break;
            case 11:
               var9 = 233;
               break;
            case 12:
               var9 = 214;
               break;
            case 13:
               var9 = 33;
               break;
            case 14:
               var9 = 33;
               break;
            case 15:
               var9 = 1;
               break;
            case 16:
               var9 = 134;
               break;
            case 17:
               var9 = 103;
               break;
            case 18:
               var9 = 111;
               break;
            case 19:
               var9 = 39;
               break;
            case 20:
               var9 = 145;
               break;
            case 21:
               var9 = 236;
               break;
            case 22:
               var9 = 33;
               break;
            case 23:
               var9 = 123;
               break;
            case 24:
               var9 = 121;
               break;
            case 25:
               var9 = 4;
               break;
            case 26:
               var9 = 213;
               break;
            case 27:
               var9 = 223;
               break;
            case 28:
               var9 = 109;
               break;
            case 29:
               var9 = 87;
               break;
            case 30:
               var9 = 58;
               break;
            case 31:
               var9 = 10;
         }

         var4[var8] = (char)(var4[var8] ^ var9 ^ var1 >> 16 ^ var7);
         ++var8;
      } while(var8 < var4.length);

      return (new String(var4)).intern();
   }

   public void aaaaabaa(JsonObject var1) {
   }

   private static String a(int param0, int param1) {
      // $FF: Couldn't be decompiled
   }

   private static int b(int var0, int var1) {
      int var2 = a[var0 ^ 268640525] ^ var1 ^ var0;
      var2 -= 18221;
      var2 ^= 33671;
      var2 ^= 6409;
      var2 ^= 62903;
      var2 ^= 47472;
      var2 += 6254;
      return var2;
   }

   static {
      // $FF: Couldn't be decompiled
   }

   public q2997348aa27a422480aea29cbfd800b1bbaaa(q2997348aa27a422480aea29cbfd800b1abbabbb var1) {
      super((Object)q2997348aa27a422480aea29cbfd800b1bbbbbbab.abbb(a(aa(b(268640298, -1431251415 ^ -564792479), 682328725236540824L), aa(b(268640293, -1431251415 ^ -58444352), 773554317699578656L))), q2997348aa27a422480aea29cbfd800b1aabbaaaaa.bbb, (Object)q2997348aa27a422480aea29cbfd800b1bbbbbbab.abbb(a(aa(b(268640292, -1431251415 ^ 350869035), 2578110524879388503L), aa(b(268640295, -1431251415 ^ 2059936680), 2501879262758668952L))));
   }

   public void ababb() {
      // $FF: Couldn't be decompiled
   }

   public q2997348aa27a422480aea29cbfd800b1bbaaa() {
      this((q2997348aa27a422480aea29cbfd800b1abbabbb)null);
   }
}
