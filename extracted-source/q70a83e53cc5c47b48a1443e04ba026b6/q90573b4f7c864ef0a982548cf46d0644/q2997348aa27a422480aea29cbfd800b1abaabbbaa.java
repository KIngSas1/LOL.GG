package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
enum q2997348aa27a422480aea29cbfd800b1abaabbbaa {
   public static final q2997348aa27a422480aea29cbfd800b1abaabbbaa aa;
   public static final q2997348aa27a422480aea29cbfd800b1abaabbbaa ab;
   private static final q2997348aa27a422480aea29cbfd800b1abaabbbaa[] ba;
   private static final String[] aaba;
   public static final q2997348aa27a422480aea29cbfd800b1abaabbbaa b;
   private static final long[] bb;
   private static final int[] aaab;
   private static final long[] aaa;
   public static final q2997348aa27a422480aea29cbfd800b1abaabbbaa aab;
   private static final Integer[] aba;
   public static final q2997348aa27a422480aea29cbfd800b1abaabbbaa abb;
   private static final Integer[] baa;
   public static final q2997348aa27a422480aea29cbfd800b1abaabbbaa bab;
   private static final long[] bba;
   private static final Long[] a;
   private static final Object[] aabb;
   public static final q2997348aa27a422480aea29cbfd800b1abaabbbaa bbb;
   public static final q2997348aa27a422480aea29cbfd800b1abaabbbaa aaaa;

   private static long aa(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ b(592450249, 2076167251 ^ -977653110)) & b(592450248, 2076167251 ^ 610968341);
      if (a[var3] == null) {
         a[var3] = aaa[var3] ^ var1;
      }

      return a[var3];
   }

   private static String aaa(char var0, int var1, short var2) {
      int var3 = var0 ^ 9243;
      char[] var4 = aaba[var3].toCharArray();
      StackTraceElement[] var5 = (StackTraceElement[])aabb[var3];
      StackTraceElement[] var6;
      if (var5 != null) {
         var6 = var5;
      } else {
         var6 = (new Throwable()).getStackTrace();
         aabb[var3] = var6;
      }

      StackTraceElement var7 = var6[1];
      int var8 = (var7.getClassName().hashCode() ^ var7.getMethodName().hashCode()) >> 16 ^ 10293;
      int var9 = 0;

      do {
         int var10 = var4[var9] ^ '\udf08';
         var10 -= 53897;
         var10 += 36318;
         var10 += 61983;
         var4[var9] = (char)(var10 ^ var8 ^ var2 ^ var1 >> 16);
         ++var9;
      } while(var9 < var4.length);

      return (new String(var4)).intern();
   }

   private static int b(int var0, int var1) {
      int var2 = aaab[var0 ^ 592450249] ^ var1 ^ var0;
      var2 -= 8299;
      var2 -= 4615;
      var2 -= 22022;
      var2 -= 36173;
      var2 ^= 25927;
      var2 -= 54806;
      var2 ^= 32654;
      return var2;
   }

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & aa(b(592450209, -1306481219 ^ -1209668618), 4769389263061288488L)) ^ ba(b(592450208, -1306481219 ^ -744623270), 4973747298410252838L);

      try {
         if (aba[var3] == null) {
            aba[var3] = (int)(bb[var3] ^ var1);
         }
      } catch (MatchException var4) {
         throw var4;
      }

      return aba[var3];
   }

   static {
      // $FF: Couldn't be decompiled
   }

   public static q2997348aa27a422480aea29cbfd800b1abaabbbaa ab(String var0) {
      return (q2997348aa27a422480aea29cbfd800b1abaabbbaa)Enum.valueOf(q2997348aa27a422480aea29cbfd800b1abaabbbaa.class, var0);
   }

   private static int ba(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ b(592450211, -724484063 ^ 1734547079);
      if (baa[var3] == null) {
         baa[var3] = (int)(bba[var3] ^ var1);
      }

      return baa[var3];
   }

   private static q2997348aa27a422480aea29cbfd800b1abaabbbaa[] bb() {
      int var0 = -12918480;
      q2997348aa27a422480aea29cbfd800b1abaabbbaa[] var10000 = new q2997348aa27a422480aea29cbfd800b1abaabbbaa[a(ba(b(592450210, var0 ^ 1414717064), 8987127503878263984L), aa(b(592450213, var0 ^ -313182984), 8994356626817319240L))];
      var10000[0] = bbb;
      var10000[1] = aaaa;
      var10000[2] = b;
      var10000[3] = ab;
      var10000[4] = aa;
      var10000[5] = aab;
      var10000[a(ba(b(592450212, var0 ^ -1905439965), 4816868984534818177L), aa(b(592450215, var0 ^ 2066096783), 5325231492469826414L))] = abb;
      var10000[a(ba(b(592450214, var0 ^ -824646116), 2490457604921666875L), aa(b(592450233, var0 ^ -69615663), 324626709687859710L))] = bab;
      return var10000;
   }
}
