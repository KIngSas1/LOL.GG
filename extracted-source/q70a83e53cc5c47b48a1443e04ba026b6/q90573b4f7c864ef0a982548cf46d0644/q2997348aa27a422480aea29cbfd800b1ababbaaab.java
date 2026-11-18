package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public final class q2997348aa27a422480aea29cbfd800b1ababbaaab extends q2997348aa27a422480aea29cbfd800b1bbaababb {
   private static final String[] aa;
   private static final String[] a;
   private static final int[] bb;
   private static final Integer[] ab;
   private static final long[] ba;
   private static final Object[] aab;
   private static final String[] aaa;

   private static int aa(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ b(-1603068573, -391979847 ^ -516649012);
      if (ab[var3] == null) {
         ab[var3] = (int)(ba[var3] ^ var1);
      }

      return ab[var3];
   }

   private static int b(int var0, int var1) {
      int var2 = bb[var0 ^ -1603068573] ^ var1 ^ var0;
      var2 -= 51826;
      var2 ^= 53478;
      var2 += 6110;
      var2 ^= 34352;
      var2 ^= 9819;
      var2 ^= 52444;
      var2 ^= 23739;
      var2 += 34247;
      return var2;
   }

   static {
      // $FF: Couldn't be decompiled
   }

   private static String ab(int var0, int var1) {
      int var3 = var0 ^ -1780765825;
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
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ -2046850907;
      int var8 = 0;

      do {
         short var9;
         switch (var8 & 31) {
            case 0:
            default:
               var9 = 76;
               break;
            case 1:
               var9 = 89;
               break;
            case 2:
               var9 = 111;
               break;
            case 3:
               var9 = 21;
               break;
            case 4:
               var9 = 222;
               break;
            case 5:
               var9 = 151;
               break;
            case 6:
               var9 = 204;
               break;
            case 7:
               var9 = 95;
               break;
            case 8:
               var9 = 159;
               break;
            case 9:
               var9 = 204;
               break;
            case 10:
               var9 = 124;
               break;
            case 11:
               var9 = 239;
               break;
            case 12:
               var9 = 211;
               break;
            case 13:
               var9 = 118;
               break;
            case 14:
               var9 = 204;
               break;
            case 15:
               var9 = 79;
               break;
            case 16:
               var9 = 79;
               break;
            case 17:
               var9 = 70;
               break;
            case 18:
               var9 = 177;
               break;
            case 19:
               var9 = 109;
               break;
            case 20:
               var9 = 100;
               break;
            case 21:
               var9 = 104;
               break;
            case 22:
               var9 = 184;
               break;
            case 23:
               var9 = 72;
               break;
            case 24:
               var9 = 37;
               break;
            case 25:
               var9 = 67;
               break;
            case 26:
               var9 = 83;
               break;
            case 27:
               var9 = 121;
               break;
            case 28:
               var9 = 47;
               break;
            case 29:
               var9 = 39;
               break;
            case 30:
               var9 = 125;
               break;
            case 31:
               var9 = 47;
         }

         var4[var8] = (char)(var4[var8] ^ var9 ^ var1 >> 16 ^ var7);
         ++var8;
      } while(var8 < var4.length);

      return (new String(var4)).intern();
   }

   public q2997348aa27a422480aea29cbfd800b1ababbaaab() {
      super((Object)q2997348aa27a422480aea29cbfd800b1bbbbbbab.abbb(a(aa(b(-1603068574, -208299280 ^ -2025273781), 3282718101042650760L), aa(b(-1603068575, -208299280 ^ 1389843619), 5677668297845670093L))), q2997348aa27a422480aea29cbfd800b1aabbaaaaa.abb, (Object)q2997348aa27a422480aea29cbfd800b1bbbbbbab.abbb(a(aa(b(-1603068576, -208299280 ^ 1708774171), 3921036026500850679L), aa(b(-1603068569, -208299280 ^ -334161575), 3897256242908843405L))));
   }

   private static String a(int param0, int param1) {
      // $FF: Couldn't be decompiled
   }
}
