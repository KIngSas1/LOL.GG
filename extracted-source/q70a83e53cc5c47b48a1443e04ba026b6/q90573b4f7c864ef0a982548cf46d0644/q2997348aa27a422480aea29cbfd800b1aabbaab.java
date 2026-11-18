package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public final class q2997348aa27a422480aea29cbfd800b1aabbaab extends q2997348aa27a422480aea29cbfd800b1bbaababb {
   private static final Object[] aaba;
   private static final long[] aa;
   private static final int[] aaaa;
   private static final Integer[] ab;
   private static final Long[] ba;
   private static final Integer[] bb;
   private static final String[] aaa;
   private static final long[] aab;
   private static final long[] aba;
   private static final String[] abb;
   private static final String[] aaab;
   private int baa = -1;
   private int a = -1;
   private static final long[] bab;
   private static final Long[] bba;
   private long bbb = 0L;

   public void aabaa() {
      this.ab();
   }

   public void aa(int param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   private static int bab(int var0, int var1) {
      int var2 = aaaa[var0 ^ 1716991769] ^ var1 ^ var0;
      var2 += 800;
      var2 ^= 21018;
      var2 += 4662;
      var2 -= 62591;
      var2 ^= 40166;
      var2 -= 23712;
      var2 += 31904;
      return var2;
   }

   private static String bba(int var0, int var1, int var2) {
      int var7 = var1 ^ -1064411255;
      char[] var6 = aaab[var7].toCharArray();
      StackTraceElement[] var8 = (StackTraceElement[])aaba[var7];
      StackTraceElement[] var9;
      if (var8 != null) {
         var9 = var8;
      } else {
         var9 = (new Throwable()).getStackTrace();
         aaba[var7] = var9;
      }

      StackTraceElement var10 = var9[1];
      int var4 = (var10.getClassName().hashCode() ^ var10.getMethodName().hashCode()) >> 16 ^ '캧';

      for(int var5 = 0; var5 < var6.length; ++var5) {
         char var10002 = var6[var5];
         short var10003;
         switch (var5 % 5) {
            case 0:
            default:
               var10003 = 163;
               break;
            case 1:
               var10003 = 117;
               break;
            case 2:
               var10003 = 161;
               break;
            case 3:
               var10003 = 136;
               break;
            case 4:
               var10003 = 98;
         }

         var6[var5] = (char)(var10002 ^ var10003 ^ var5 ^ '\uf14b' ^ var2 ^ var0 ^ var4 ^ var1);
      }

      return (new String(var6)).intern();
   }

   public void ab() {
      this.baa = -1;
      this.a = -1;
      this.bbb = 0L;
   }

   private static int ba(int param0, long param1) {
      // $FF: Couldn't be decompiled
   }

   public void ababb() {
      this.ab();
   }

   public boolean a() {
      return this.aaa();
   }

   private static long bb(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ bab(1716991868, -921304198 ^ -81581845)) & bab(1716991871, -921304198 ^ 2003175580);
      if (bba[var3] == null) {
         bba[var3] = bab[var3] ^ var1;
      }

      return bba[var3];
   }

   public boolean aaa() {
      int var1 = q2997348aa27a422480aea29cbfd800b1bbabab.aaab;

      boolean var10000;
      label36: {
         try {
            try {
               var10000 = this.bbaabbb();
               if (var1 != 0) {
                  return var10000;
               }

               if (!var10000) {
                  break label36;
               }
            } catch (IllegalStateException var2) {
               throw var2;
            }
         } catch (MatchException var3) {
            throw var3;
         }

         var10000 = false;
         return var10000;
      }

      var10000 = true;
      return var10000;
   }

   public boolean bbababa() {
      return true;
   }

   private static long aab(int param0, long param1) {
      // $FF: Couldn't be decompiled
   }

   public int aba(int param1) {
      // $FF: Couldn't be decompiled
   }

   private static String abb(int param0, int param1) {
      // $FF: Couldn't be decompiled
   }

   public void baa(int var1) {
      this.aa(var1, 1);
   }

   public void baba() {
      // $FF: Couldn't be decompiled
   }

   public q2997348aa27a422480aea29cbfd800b1aabbaab() {
      super((Object)q2997348aa27a422480aea29cbfd800b1bbbbbbab.abbb(abb(b(bab(1716991604, -2060819663 ^ -891812321), 4459547149307963322L), b(bab(1716991607, -2060819663 ^ 549228305), 1931131119641532254L))), q2997348aa27a422480aea29cbfd800b1aabbaaaaa.bbb, (Object)q2997348aa27a422480aea29cbfd800b1bbbbbbab.abbb(abb(b(bab(1716991606, -2060819663 ^ 1991331025), 7705879963660601886L), b(bab(1716991593, -2060819663 ^ -855130201), 6468737561705953323L))));
      this.aaaabbaa(false);
   }

   static {
      // $FF: Couldn't be decompiled
   }

   private static int b(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ bab(1716991592, -487145342 ^ 6700179);
      if (bb[var3] == null) {
         bb[var3] = (int)(aa[var3] ^ var1);
      }

      return bb[var3];
   }
}
