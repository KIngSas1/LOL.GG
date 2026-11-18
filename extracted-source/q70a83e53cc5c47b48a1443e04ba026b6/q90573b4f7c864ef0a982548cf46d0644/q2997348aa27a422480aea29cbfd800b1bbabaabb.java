package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_746;

@Environment(EnvType.CLIENT)
public final class q2997348aa27a422480aea29cbfd800b1bbabaabb extends q2997348aa27a422480aea29cbfd800b1bbaababb {
   private static final Object[] aab;
   private static final int[] a;
   private static final long[] aa;
   private static final Integer[] ab;
   private static final String[] aaa;
   private static final String[] ba;
   private static final String[] bb;

   static {
      // $FF: Couldn't be decompiled
   }

   private static int a(int var0, int var1) {
      int var2 = a[var0 ^ -693724634] ^ var1 ^ var0;
      var2 -= 45889;
      var2 ^= 64799;
      var2 -= 23202;
      var2 -= 17809;
      var2 += 55283;
      var2 ^= 25436;
      var2 += 36146;
      return var2;
   }

   public q2997348aa27a422480aea29cbfd800b1bbabaabb() {
      super((Object)q2997348aa27a422480aea29cbfd800b1bbbbbbab.abbb(aa(ba(a(-693724670, -854838031 ^ 60227543), 5028368012504138561L), ba(a(-693724669, -854838031 ^ 1362969105), 5075426944145692277L))), q2997348aa27a422480aea29cbfd800b1aabbaaaaa.aba, (Object)q2997348aa27a422480aea29cbfd800b1bbbbbbab.abbb(aa(ba(a(-693724672, -854838031 ^ 293224166), 5228933690739861079L), ba(a(-693724671, -854838031 ^ -47244139), 1812793072845516634L))));
   }

   private static String aa(int param0, int param1) {
      // $FF: Couldn't be decompiled
   }

   private static String b(int var0, int var1) {
      int var3 = var0 ^ -1337477434;
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
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ -1808617106;
      int var8 = 0;

      do {
         short var9;
         switch (var8 & 31) {
            case 0:
            default:
               var9 = 3;
               break;
            case 1:
               var9 = 176;
               break;
            case 2:
               var9 = 216;
               break;
            case 3:
               var9 = 125;
               break;
            case 4:
               var9 = 4;
               break;
            case 5:
               var9 = 67;
               break;
            case 6:
               var9 = 59;
               break;
            case 7:
               var9 = 183;
               break;
            case 8:
               var9 = 142;
               break;
            case 9:
               var9 = 104;
               break;
            case 10:
               var9 = 159;
               break;
            case 11:
               var9 = 24;
               break;
            case 12:
               var9 = 105;
               break;
            case 13:
               var9 = 238;
               break;
            case 14:
               var9 = 186;
               break;
            case 15:
               var9 = 82;
               break;
            case 16:
               var9 = 124;
               break;
            case 17:
               var9 = 45;
               break;
            case 18:
               var9 = 61;
               break;
            case 19:
               var9 = 159;
               break;
            case 20:
               var9 = 232;
               break;
            case 21:
               var9 = 251;
               break;
            case 22:
               var9 = 87;
               break;
            case 23:
               var9 = 231;
               break;
            case 24:
               var9 = 55;
               break;
            case 25:
               var9 = 235;
               break;
            case 26:
               var9 = 188;
               break;
            case 27:
               var9 = 11;
               break;
            case 28:
               var9 = 19;
               break;
            case 29:
               var9 = 129;
               break;
            case 30:
               var9 = 194;
               break;
            case 31:
               var9 = 75;
         }

         var4[var8] = (char)(var4[var8] ^ var9 ^ var1 >> 16 ^ var7);
         ++var8;
      } while(var8 < var4.length);

      return (new String(var4)).intern();
   }

   static boolean ab(class_746 param0) {
      // $FF: Couldn't be decompiled
   }

   private static int ba(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ a(-693724404, 1621026222 ^ -950232103);
      if (ab[var3] == null) {
         ab[var3] = (int)(aa[var3] ^ var1);
      }

      return ab[var3];
   }

   public void baba() {
      // $FF: Couldn't be decompiled
   }
}
