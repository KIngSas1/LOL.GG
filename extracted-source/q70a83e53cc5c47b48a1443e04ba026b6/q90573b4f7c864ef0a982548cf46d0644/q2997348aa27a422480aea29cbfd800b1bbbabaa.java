package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import com.sun.jna.platform.win32.BaseTSD;
import com.sun.jna.platform.win32.WinDef;
import com.sun.jna.platform.win32.WinUser;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_310;
import net.minecraft.class_3675;

@Environment(EnvType.CLIENT)
public final class q2997348aa27a422480aea29cbfd800b1bbbabaa {
   private static final Long[] aa;
   private static final boolean ab;
   private static final int ba;
   private static final int bb;
   private static final Object[] abba;
   private static final long[] aaa;
   private static final String[] abab;
   private static final int aab;
   private static final Integer[] b;
   private static final int aba = 1;
   private static final int abb;
   private static final int baa;
   private static final Integer[] bab;
   private static final int bba;
   private static final long[] bbb;
   private static final int a = 0;
   private static final int aaaa;
   private static final long[] aaab;
   private static final int aaba;
   private static final int[] abaa;
   private static final int aabb;

   private static void aa(WinUser.INPUT var0, int var1, int var2) {
      var0.type = new WinDef.DWORD(0L);
      var0.input.setType(WinUser.MOUSEINPUT.class);
      var0.input.mi = new WinUser.MOUSEINPUT();
      var0.input.mi.dx = new WinDef.LONG(0L);
      var0.input.mi.dy = new WinDef.LONG(0L);
      var0.input.mi.mouseData = new WinDef.DWORD((long)var2);
      var0.input.mi.dwFlags = new WinDef.DWORD((long)var1);
      var0.input.mi.time = new WinDef.DWORD(0L);
      var0.input.mi.dwExtraInfo = new BaseTSD.ULONG_PTR(0L);
      var0.write();
   }

   private q2997348aa27a422480aea29cbfd800b1bbbabaa() {
   }

   public static boolean ab(class_310 param0, class_3675.class_306 param1, boolean param2, boolean param3) {
      // $FF: Couldn't be decompiled
   }

   private static void ba(WinUser.INPUT param0, q2997348aa27a422480aea29cbfd800b1aaabbaba param1, boolean param2) {
      // $FF: Couldn't be decompiled
   }

   private static int bb(int param0) {
      // $FF: Couldn't be decompiled
   }

   private static boolean aaa(class_310 param0) {
      // $FF: Couldn't be decompiled
   }

   private static boolean aab(int var0) {
      int var1 = q2997348aa27a422480aea29cbfd800b1aabaabaaa.bb;

      int var10000;
      label39: {
         try {
            try {
               var10000 = var0;
               if (var1 != 0) {
                  return (boolean)var10000;
               }

               switch (var0) {
                  case 260:
                  case 261:
                  case 262:
                  case 263:
                  case 264:
                  case 265:
                  case 266:
                  case 267:
                  case 268:
                  case 269:
                  case 282:
                  case 283:
                  case 331:
                  case 335:
                  case 343:
                  case 345:
                  case 346:
                  case 347:
                  case 348:
                     break label39;
               }
            } catch (IllegalStateException var2) {
               throw var2;
            }
         } catch (MatchException var3) {
            throw var3;
         }

         var10000 = 0;
         return (boolean)var10000;
      }

      var10000 = 1;
      return (boolean)var10000;
   }

   private static int a(int var0, int var1) {
      int var2 = abaa[var0 ^ -1973079704] ^ var1 ^ var0;
      var2 ^= 8371;
      var2 ^= 23948;
      var2 ^= 10635;
      var2 -= 31880;
      var2 -= 61600;
      var2 += 64037;
      var2 -= 51827;
      return var2;
   }

   private static int aba(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ a(-1973079792, 1257564435 ^ 1153294943);
      if (bab[var3] == null) {
         bab[var3] = (int)(bbb[var3] ^ var1);
      }

      return bab[var3];
   }

   private static boolean abb(int param0, int param1) {
      // $FF: Couldn't be decompiled
   }

   private static q2997348aa27a422480aea29cbfd800b1aaabbaba baa(class_3675.class_306 param0) {
      // $FF: Couldn't be decompiled
   }

   private static int bab(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & b(a(-1973079678, 781164295 ^ -1803419795), 2341898633652716108L)) ^ aba(a(-1973079677, 781164295 ^ -964133986), 851413146963004466L);

      try {
         if (b[var3] == null) {
            b[var3] = (int)(aaa[var3] ^ var1);
         }
      } catch (MatchException var4) {
         throw var4;
      }

      return b[var3];
   }

   private static String aaab(char var0, int var1, int var2) {
      int var3 = var2 ^ 5434;
      char[] var4 = abab[var3].toCharArray();
      StackTraceElement[] var5 = (StackTraceElement[])abba[var3];
      StackTraceElement[] var6;
      if (var5 != null) {
         var6 = var5;
      } else {
         var6 = (new Throwable()).getStackTrace();
         abba[var3] = var6;
      }

      StackTraceElement var7 = var6[1];
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 29204;
      int var9 = 0;

      do {
         int var10 = var4[var9] - 'ꎛ';
         var10 -= 4463;
         var10 += 11212;
         var10 -= 44576;
         var4[var9] = (char)(var10 ^ var8 ^ var0 ^ var1 >> 16);
         ++var9;
      } while(var9 < var4.length);

      return (new String(var4)).intern();
   }

   public static boolean bba() {
      return ab;
   }

   static {
      // $FF: Couldn't be decompiled
   }

   private static boolean bbb(q2997348aa27a422480aea29cbfd800b1aaabbaba param0, boolean param1) {
      // $FF: Couldn't be decompiled
   }

   private static q2997348aa27a422480aea29cbfd800b1aaaaba aaaa(int var0) {
      int var1 = -470934636;

      q2997348aa27a422480aea29cbfd800b1aaaaba var10000;
      label61: {
         label62: {
            label63: {
               label64: {
                  try {
                     try {
                        switch (var0) {
                           case 0:
                              var10000 = new q2997348aa27a422480aea29cbfd800b1aaaaba(2, 4, 0);
                              return var10000;
                           case 1:
                              break label61;
                           case 2:
                              break label62;
                           case 3:
                              break label63;
                           case 4:
                              break label64;
                        }
                     } catch (IllegalStateException var2) {
                        throw var2;
                     }
                  } catch (MatchException var3) {
                     throw var3;
                  }

                  var10000 = null;
                  return var10000;
               }

               var10000 = new q2997348aa27a422480aea29cbfd800b1aaaaba(bab(aba(a(-1973079664, var1 ^ 1588757058), 3464802391524745516L), b(a(-1973079663, var1 ^ -765433474), 6810418041301114939L)), bab(aba(a(-1973079662, var1 ^ -978239661), 6352143282166428414L), b(a(-1973079661, var1 ^ -1976133976), 9180649175245686041L)), 2);
               return var10000;
            }

            var10000 = new q2997348aa27a422480aea29cbfd800b1aaaaba(bab(aba(a(-1973079652, var1 ^ 1404137257), 1749523412909434885L), b(a(-1973079651, var1 ^ 1405049191), 7609446154783477528L)), bab(aba(a(-1973079650, var1 ^ -2006258985), 9079249266427855612L), b(a(-1973079649, var1 ^ -1104451006), 3592356810117014518L)), 1);
            return var10000;
         }

         var10000 = new q2997348aa27a422480aea29cbfd800b1aaaaba(bab(aba(a(-1973079656, var1 ^ 391498378), 6287892518807374866L), b(a(-1973079655, var1 ^ -1284687908), 8484751164386531017L)), bab(aba(a(-1973079654, var1 ^ -570804338), 6737390610455715922L), b(a(-1973079653, var1 ^ 1251436512), 5382191000127176767L)), 0);
         return var10000;
      }

      var10000 = new q2997348aa27a422480aea29cbfd800b1aaaaba(bab(aba(a(-1973079676, var1 ^ 45500383), 8469562343259595060L), b(a(-1973079675, var1 ^ -1868406977), 8256720214793732581L)), bab(aba(a(-1973079674, var1 ^ 523258561), 8672231186653594584L), b(a(-1973079673, var1 ^ -799125337), 796871922919265169L)), 0);
      return var10000;
   }

   private static long b(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ a(-1973079660, 1409018406 ^ 369193255)) & a(-1973079659, 1409018406 ^ -1590834227);
      if (aa[var3] == null) {
         aa[var3] = aaab[var3] ^ var1;
      }

      return aa[var3];
   }
}
