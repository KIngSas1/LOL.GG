package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public enum q2997348aa27a422480aea29cbfd800b1aba {
   private static final q2997348aa27a422480aea29cbfd800b1aba[] a;
   private static final String[] aba;
   public static final q2997348aa27a422480aea29cbfd800b1aba aa;
   public static final q2997348aa27a422480aea29cbfd800b1aba ab;
   private final q2997348aa27a422480aea29cbfd800b1babba ba;
   public static final q2997348aa27a422480aea29cbfd800b1aba b;
   private static final Object[] abb;
   private static final int[] aab;
   public static final q2997348aa27a422480aea29cbfd800b1aba bb;
   public static final q2997348aa27a422480aea29cbfd800b1aba aaa;

   public q2997348aa27a422480aea29cbfd800b1babba a() {
      return this.ba;
   }

   private static int ab(int var0, int var1) {
      int var2 = aab[var0 ^ -22391301] ^ var1 ^ var0;
      var2 ^= 42887;
      var2 += 48113;
      var2 -= 35709;
      var2 -= 45665;
      var2 += 55207;
      var2 ^= 41653;
      var2 -= 32630;
      var2 += 43739;
      return var2;
   }

   public String toString() {
      return this.ba.bba();
   }

   static {
      // $FF: Couldn't be decompiled
   }

   private q2997348aa27a422480aea29cbfd800b1aba(q2997348aa27a422480aea29cbfd800b1babba var3) {
      this.ba = var3;
   }

   public q2997348aa27a422480aea29cbfd800b1aababbabb b() {
      q2997348aa27a422480aea29cbfd800b1aababbabb var10000;
      label47: {
         label48: {
            label49: {
               try {
                  try {
                     switch (this.ordinal()) {
                        case 0:
                        case 1:
                           break;
                        case 2:
                           break label47;
                        case 3:
                           break label48;
                        case 4:
                           break label49;
                        default:
                           throw new MatchException((String)null, (Throwable)null);
                     }
                  } catch (IllegalStateException var1) {
                     throw var1;
                  }
               } catch (MatchException var2) {
                  throw var2;
               }

               var10000 = null;
               return var10000;
            }

            var10000 = q2997348aa27a422480aea29cbfd800b1aababbabb.bb;
            return var10000;
         }

         var10000 = q2997348aa27a422480aea29cbfd800b1aababbabb.b;
         return var10000;
      }

      var10000 = q2997348aa27a422480aea29cbfd800b1aababbabb.a;
      return var10000;
   }

   private static String ba(int var0, char var1, char var2) {
      int var3 = var1 ^ 6136;
      char[] var4 = aba[var3].toCharArray();
      StackTraceElement[] var5 = (StackTraceElement[])abb[var3];
      StackTraceElement[] var6;
      if (var5 != null) {
         var6 = var5;
      } else {
         var6 = (new Throwable()).getStackTrace();
         abb[var3] = var6;
      }

      StackTraceElement var7 = var6[1];
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 27258;
      int var9 = 0;

      do {
         int var10 = var4[var9] - '홄';
         var10 -= 29916;
         var10 ^= 3965;
         var10 -= 43726;
         var10 += 56761;
         var10 -= 60792;
         var10 += 1665;
         var10 -= 28338;
         var10 -= 9326;
         var10 ^= 28685;
         var4[var9] = (char)(var10 ^ var8 ^ var2 ^ var0 >> 16);
         ++var9;
      } while(var9 < var4.length);

      return (new String(var4)).intern();
   }

   private static q2997348aa27a422480aea29cbfd800b1aba[] aa() {
      return new q2997348aa27a422480aea29cbfd800b1aba[]{b, aaa, ab, bb, aa};
   }
}
