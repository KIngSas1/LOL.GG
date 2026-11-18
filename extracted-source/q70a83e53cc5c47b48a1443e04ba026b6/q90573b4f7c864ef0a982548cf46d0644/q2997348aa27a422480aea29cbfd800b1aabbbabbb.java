package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public final class q2997348aa27a422480aea29cbfd800b1aabbbabbb extends q2997348aa27a422480aea29cbfd800b1bbaababb {
   private static final String[] aaa;
   private static final long[] aa;
   private static final int[] bb;
   private static final Object[] aab;
   private static final String[] ab;
   private static final String[] a;
   private static final Integer[] ba;

   private static String ab(int var0, int var1) {
      int var3 = var0 ^ -569220261;
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
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ 1805477164;
      int var8 = 0;

      do {
         short var9;
         switch (var8 & 31) {
            case 0:
            default:
               var9 = 108;
               break;
            case 1:
               var9 = 144;
               break;
            case 2:
               var9 = 228;
               break;
            case 3:
               var9 = 47;
               break;
            case 4:
               var9 = 149;
               break;
            case 5:
               var9 = 241;
               break;
            case 6:
               var9 = 13;
               break;
            case 7:
               var9 = 246;
               break;
            case 8:
               var9 = 83;
               break;
            case 9:
               var9 = 40;
               break;
            case 10:
               var9 = 203;
               break;
            case 11:
               var9 = 246;
               break;
            case 12:
               var9 = 22;
               break;
            case 13:
               var9 = 3;
               break;
            case 14:
               var9 = 64;
               break;
            case 15:
               var9 = 59;
               break;
            case 16:
               var9 = 179;
               break;
            case 17:
               var9 = 107;
               break;
            case 18:
               var9 = 10;
               break;
            case 19:
               var9 = 23;
               break;
            case 20:
               var9 = 211;
               break;
            case 21:
               var9 = 40;
               break;
            case 22:
               var9 = 253;
               break;
            case 23:
               var9 = 108;
               break;
            case 24:
               var9 = 174;
               break;
            case 25:
               var9 = 72;
               break;
            case 26:
               var9 = 3;
               break;
            case 27:
               var9 = 190;
               break;
            case 28:
               var9 = 46;
               break;
            case 29:
               var9 = 229;
               break;
            case 30:
               var9 = 38;
               break;
            case 31:
               var9 = 201;
         }

         var4[var8] = (char)(var4[var8] ^ var9 ^ var1 >> 16 ^ var7);
         ++var8;
      } while(var8 < var4.length);

      return (new String(var4)).intern();
   }

   static {
      // $FF: Couldn't be decompiled
   }

   public q2997348aa27a422480aea29cbfd800b1aabbbabbb() {
      super((Object)q2997348aa27a422480aea29cbfd800b1bbbbbbab.abbb(a(aa(b(357638459, -582986343 ^ 704335140), 9203135893292984956L), aa(b(357638458, -582986343 ^ -229377324), 7577119305256717124L))), q2997348aa27a422480aea29cbfd800b1aabbaaaaa.bab, (Object)q2997348aa27a422480aea29cbfd800b1bbbbbbab.abbb(a(aa(b(357638457, -582986343 ^ -1532568534), 7844964345683750312L), aa(b(357638456, -582986343 ^ 1139322180), 6102643265120942665L))));
   }

   private static int aa(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ b(357638463, 1215055140 ^ 1320769050);
      if (ba[var3] == null) {
         ba[var3] = (int)(aa[var3] ^ var1);
      }

      return ba[var3];
   }

   private static int b(int var0, int var1) {
      int var2 = bb[var0 ^ 357638459] ^ var1 ^ var0;
      var2 -= 23;
      var2 -= 44953;
      var2 ^= 55031;
      var2 += 28319;
      var2 -= 44658;
      var2 -= 25725;
      return var2;
   }

   private static String a(int param0, int param1) {
      // $FF: Couldn't be decompiled
   }
}
