package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import java.util.List;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_332;

@Environment(EnvType.CLIENT)
public final class q2997348aa27a422480aea29cbfd800b1babbb {
   private double a;
   private List aa = List.of();
   private static final Object[] aab;
   private static final String[] aaa;
   private static final int[] bb;
   private q2997348aa27a422480aea29cbfd800b1aaabaabab ab;
   private static final long b;
   private double ba;

   public void a(class_332 param1) {
      // $FF: Couldn't be decompiled
   }

   public void aa() {
      // $FF: Couldn't be decompiled
   }

   static {
      int var27 = -1069564384;
      String var17 = "쳸첲찑챦찃차쳩첔첬쳮쳗찟찦찾쳇챋ၝტႀႶოၬဧႎშႠ";
      byte var23 = -1;
      short var16 = 20617;
      char[] var18 = "\u0010\n".toCharArray();
      String[] var19 = new String[var18.length];

      while(true) {
         int var20 = 0;
         int var21 = 0;
         char var22 = '\u0000';
         if (var23 == 0) {
            aaa = var19;
            aab = new Object[var19.length];
            int var12 = -67146915;
            byte[] var10 = "\u001e_ú\u0016\u001e«Q üPÐ\u0099|èroÂ\u0001í/jEæ!l4?=\u0097_\u009e*\tï\u0090\u0011".getBytes("ISO-8859-1");
            int var11 = var10.length / 4;
            bb = new int[var11];
            int var13 = 0;
            int var14 = 0;

            do {
               int var15 = (var10[var13] & 255) << 24 | (var10[var13 + 1] & 255) << 16 | (var10[var13 + 2] & 255) << 8 | var10[var13 + 3] & 255;
               var15 ^= var12;
               bb[var14] = var15;
               var13 += 4;
               ++var14;
            } while(var14 < var11);

            long var1 = 9143041460026271545L;
            long[] var0 = new long[2];
            int var4 = 0;
            String var5;
            int var6 = (var5 = ba((short)-1870, -1255869757, '죀', (byte)123, (short)9816, 928404112, (byte)-117)).length();
            int var3 = 0;

            do {
               int var10001 = var3;
               var3 += 8;
               byte[] var7 = var5.substring(var10001, var3).getBytes(ba((short)-10321, -1255869758, (char)'\ue89d', (byte)124, (short)25842, -717765870, (byte)-81));
               var10001 = var4++;
               long var10004 = (((long)var7[0] & 255L) << b(2130036443, var27 ^ 1533794849) | ((long)var7[1] & 255L) << b(2130036442, var27 ^ 1537175902) | ((long)var7[2] & 255L) << b(2130036441, var27 ^ -1184567204) | ((long)var7[3] & 255L) << b(2130036440, var27 ^ 970740387) | ((long)var7[4] & 255L) << b(2130036447, var27 ^ -2026516996) | ((long)var7[5] & 255L) << b(2130036446, var27 ^ 795985467) | ((long)var7[b(2130036445, var27 ^ 687873886)] & 255L) << b(2130036444, var27 ^ -764690870) | (long)var7[b(2130036435, var27 ^ 1289465983)] & 255L) ^ var1;
               boolean var10003 = true;
               var0[var10001] = var10004;
            } while(var3 < var6);

            long var8 = var0[1];
            long var10002 = var0[0] ^ var8;
            boolean var31 = true;
            b = var10002;
            return;
         }

         do {
            var22 = var18[var20];
            char[] var24 = var17.substring(var21, var21 + var22).toCharArray();
            int var25 = 0;

            do {
               short var10000;
               switch (var25 % 6) {
                  case 0:
                  default:
                     var10000 = 134;
                     break;
                  case 1:
                     var10000 = 34;
                     break;
                  case 2:
                     var10000 = 95;
                     break;
                  case 3:
                     var10000 = 10;
                     break;
                  case 4:
                     var10000 = 115;
                     break;
                  case 5:
                     var10000 = 195;
               }

               short var26 = var10000;
               var24[var25] = (char)(var24[var25] ^ var26 ^ var16);
               ++var25;
            } while(var25 < var24.length);

            var19[var20] = (new String(var24)).intern();
            var21 += var22;
            ++var20;
         } while(var20 < var18.length);

         var23 = 0;
      }
   }

   public boolean ab(double param1, double param3, int param5) {
      // $FF: Couldn't be decompiled
   }

   private static int b(int var0, int var1) {
      int var2 = bb[var0 ^ 2130036443] ^ var1 ^ var0;
      var2 -= 57172;
      var2 ^= 33158;
      var2 ^= 9564;
      var2 -= 26356;
      var2 -= 52463;
      var2 += 17204;
      return var2;
   }

   private static String ba(short var0, int var1, char var2, byte var3, short var4, int var5, byte var6) {
      int var11 = var1 ^ -1255869757;
      char[] var10 = aaa[var11].toCharArray();
      StackTraceElement[] var12 = (StackTraceElement[])aab[var11];
      StackTraceElement[] var13;
      if (var12 != null) {
         var13 = var12;
      } else {
         var13 = (new Throwable()).getStackTrace();
         aab[var11] = var13;
      }

      StackTraceElement var14 = var13[1];
      int var8 = (var14.getClassName().hashCode() ^ var14.getMethodName().hashCode()) >> 16 ^ '鯣';
      int var9 = 0;

      do {
         var10[var9] = (char)(var10[var9] ^ 27357 ^ var9 ^ var4 ^ var6 ^ var5 ^ var1 ^ var0 ^ var8 ^ var3 ^ var2);
         ++var9;
      } while(var9 < var10.length);

      return (new String(var10)).intern();
   }
}
