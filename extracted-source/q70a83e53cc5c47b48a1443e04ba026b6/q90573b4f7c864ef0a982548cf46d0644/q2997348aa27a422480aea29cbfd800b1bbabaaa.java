package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import java.net.http.HttpClient;
import java.net.http.HttpClient.Redirect;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Duration;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_310;

@Environment(EnvType.CLIENT)
public final class q2997348aa27a422480aea29cbfd800b1bbabaaa {
   private static final long[] aa;
   private volatile boolean ab;
   private final HttpClient ba;
   private static final String[] bb;
   private volatile String aaa;
   private static final String[] aab;
   private static final Long[] aba;
   private static final long[] abb;
   private static final Object[] aaabb;
   private static final String[] aaaba;
   private volatile q2997348aa27a422480aea29cbfd800b1aaaaa a;
   private static final long[] baa;
   private volatile String bab;
   private static final Gson bba;
   private volatile boolean b;
   private static final int bbb;
   private volatile String aaaa;
   private static final Integer[] aaab;
   private volatile q2997348aa27a422480aea29cbfd800b1aabaaaaa aaba;
   private static final Integer[] aabb;
   private static final int abaa;
   private static final Duration abab;
   private static final long abba;
   private static final Long[] abbb;
   private volatile long baaa;
   private static final int baab;
   private boolean baba;
   private static final long[] babb;
   private static final int[] aaaab;
   private static final long bbaa;
   private volatile long bbab;
   private volatile String bbba;
   private volatile Supplier bbbb;
   private static final int aaaaa;

   public String aa() {
      return this.aaaa;
   }

   private static long ab(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ aabba(639610779, 832741561 ^ -1222363147)) & aabba(639610778, 832741561 ^ 649536149);
      if (abbb[var3] == null) {
         abbb[var3] = baa[var3] ^ var1;
      }

      return abbb[var3];
   }

   private static Path a() {
      // $FF: Couldn't be decompiled
   }

   private static String ba() {
      return null;
   }

   private static JsonObject bb(String var0) {
      int var1 = q2997348aa27a422480aea29cbfd800b1aabaabaaa.bb;

      label42: {
         RuntimeException var6;
         label33: {
            label32: {
               try {
                  var10000 = var0;
                  if (var1 != 0) {
                     break label32;
                  }

                  if (var0 == null) {
                     break label33;
                  }
               } catch (RuntimeException var5) {
                  throw var5;
               }

               var10000 = var0;
            }

            try {
               if (!var10000.isBlank()) {
                  break label42;
               }
            } catch (RuntimeException var4) {
               var6 = var4;
               boolean var10001 = false;
               throw var6;
            }
         }

         try {
            return null;
         } catch (RuntimeException var3) {
            var6 = var3;
            boolean var7 = false;
            throw var6;
         }
      }

      JsonObject var2 = new JsonObject();
      var2.addProperty(q2997348aa27a422480aea29cbfd800b1bbbbbbab.bbb(aab(bab(aabba(639610783, 528315041 ^ -1979587164), 6350950114194581423L), bab(aabba(639610782, 528315041 ^ -1711258507), 4712280987118309922L))), var0);
      return var2;
   }

   private static boolean aaa(String param0) {
      // $FF: Couldn't be decompiled
   }

   private static String aab(int param0, int param1) {
      // $FF: Couldn't be decompiled
   }

   private static String aba() {
      return null;
   }

   private q2997348aa27a422480aea29cbfd800b1aaabaabba abb(String param1, String param2, String param3, String param4) {
      // $FF: Couldn't be decompiled
   }

   private void baa() {
      // $FF: Couldn't be decompiled
   }

   private static int bab(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ aabba(639610547, -1883871090 ^ 463156378);
      if (aaab[var3] == null) {
         aaab[var3] = (int)(abb[var3] ^ var1);
      }

      return aaab[var3];
   }

   public String bba() {
      // $FF: Couldn't be decompiled
   }

   private static int bbb(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & ab(aabba(639610546, 1423757891 ^ -239261812), 8693717088846776917L)) ^ bab(aabba(639610545, 1423757891 ^ 303569586), 9153742001418358256L);

      try {
         if (aabb[var3] == null) {
            aabb[var3] = (int)(babb[var3] ^ var1);
         }
      } catch (RuntimeException var4) {
         throw var4;
      }

      return aabb[var3];
   }

   public void aaaa() {
      // $FF: Couldn't be decompiled
   }

   static {
      // $FF: Couldn't be decompiled
   }

   private static int aabba(int var0, int var1) {
      int var2 = aaaab[var0 ^ 639610779] ^ var1 ^ var0;
      var2 += 59475;
      var2 -= 46062;
      var2 -= 49808;
      var2 ^= 24960;
      var2 += 23426;
      var2 ^= 29036;
      var2 -= 34968;
      var2 += 56723;
      return var2;
   }

   private void aaab(String var1) {
      int var10000 = q2997348aa27a422480aea29cbfd800b1aabaabaaa.bb;
      this.aaba = q2997348aa27a422480aea29cbfd800b1aabaaaaa.ab;
      this.bab = null;
      int var2 = var10000;

      String var10001;
      label22: {
         label21: {
            try {
               this.aaa = null;
               this.b = false;
               var4 = this;
               var10001 = var1;
               if (var2 != 0) {
                  break label22;
               }

               if (var1 == null) {
                  break label21;
               }
            } catch (RuntimeException var3) {
               throw var3;
            }

            var10001 = var1;
            break label22;
         }

         var10001 = "";
      }

      var4.aaaa = var10001;
   }

   static boolean aaba(String param0) {
      // $FF: Couldn't be decompiled
   }

   private JsonObject aabb(String param1, String param2, String param3, String param4) {
      // $FF: Couldn't be decompiled
   }

   private static String aabbb(int var0, int var1) {
      int var3 = var0 ^ -1504267902;
      char[] var4 = aaaba[var3].toCharArray();
      StackTraceElement[] var2 = (StackTraceElement[])aaabb[var3];
      StackTraceElement[] var5;
      if (var2 != null) {
         var5 = var2;
      } else {
         var5 = (new Throwable()).getStackTrace();
         aaabb[var3] = var5;
      }

      StackTraceElement var6 = var5[1];
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ -1159003693;
      int var8 = 0;

      do {
         short var9;
         switch (var8 & 31) {
            case 0:
            default:
               var9 = 227;
               break;
            case 1:
               var9 = 147;
               break;
            case 2:
               var9 = 115;
               break;
            case 3:
               var9 = 36;
               break;
            case 4:
               var9 = 124;
               break;
            case 5:
               var9 = 9;
               break;
            case 6:
               var9 = 150;
               break;
            case 7:
               var9 = 236;
               break;
            case 8:
               var9 = 58;
               break;
            case 9:
               var9 = 21;
               break;
            case 10:
               var9 = 145;
               break;
            case 11:
               var9 = 132;
               break;
            case 12:
               var9 = 160;
               break;
            case 13:
               var9 = 125;
               break;
            case 14:
               var9 = 115;
               break;
            case 15:
               var9 = 7;
               break;
            case 16:
               var9 = 207;
               break;
            case 17:
               var9 = 180;
               break;
            case 18:
               var9 = 89;
               break;
            case 19:
               var9 = 33;
               break;
            case 20:
               var9 = 231;
               break;
            case 21:
               var9 = 213;
               break;
            case 22:
               var9 = 125;
               break;
            case 23:
               var9 = 140;
               break;
            case 24:
               var9 = 87;
               break;
            case 25:
               var9 = 213;
               break;
            case 26:
               var9 = 39;
               break;
            case 27:
               var9 = 81;
               break;
            case 28:
               var9 = 17;
               break;
            case 29:
               var9 = 195;
               break;
            case 30:
               var9 = 138;
               break;
            case 31:
               var9 = 52;
         }

         var4[var8] = (char)(var4[var8] ^ var9 ^ var1 >> 16 ^ var7);
         ++var8;
      } while(var8 < var4.length);

      return (new String(var4)).intern();
   }

   private void abaa(String param1) {
      // $FF: Couldn't be decompiled
   }

   public String abab() {
      // $FF: Couldn't be decompiled
   }

   static boolean abba(String param0) {
      // $FF: Couldn't be decompiled
   }

   public void abbb() {
      this.aabab((String)null);
   }

   public void baaa(q2997348aa27a422480aea29cbfd800b1aaaaa var1, Supplier var2) {
      int var3 = q2997348aa27a422480aea29cbfd800b1aabaabaaa.bb;

      q2997348aa27a422480aea29cbfd800b1bbabaaa var10000;
      Supplier var10001;
      label22: {
         label21: {
            try {
               var10000 = this;
               var10001 = var2;
               if (var3 != 0) {
                  break label22;
               }

               if (var2 == null) {
                  break label21;
               }
            } catch (RuntimeException var4) {
               throw var4;
            }

            var10001 = var2;
            break label22;
         }

         var10001 = q2997348aa27a422480aea29cbfd800b1bbabaaa::ba;
      }

      var10000.bbbb = var10001;
      this.a = var1;
   }

   private static String baab() {
      return q2997348aa27a422480aea29cbfd800b1bbbbbbab.bbb(aab(bab(aabba(639610528, 191495592 ^ 1499450506), 573520705792361939L), bab(aabba(639610535, 191495592 ^ -510693254), 1202841454082595899L)));
   }

   public void baba() {
      // $FF: Couldn't be decompiled
   }

   public q2997348aa27a422480aea29cbfd800b1aabaaaaa babb() {
      // $FF: Couldn't be decompiled
   }

   private static String bbaa(JsonObject param0, String param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   public boolean bbab() {
      boolean var10000;
      try {
         if (this.a == null) {
            var10000 = true;
            return var10000;
         }
      } catch (RuntimeException var1) {
         throw var1;
      }

      var10000 = false;
      return var10000;
   }

   private void bbba(String param1, String param2) {
      // $FF: Couldn't be decompiled
   }

   public boolean bbbb() {
      boolean var10000;
      try {
         if (this.a == null) {
            var10000 = true;
            return var10000;
         }
      } catch (RuntimeException var1) {
         throw var1;
      }

      var10000 = false;
      return var10000;
   }

   private void aaaaa(String param1) {
      // $FF: Couldn't be decompiled
   }

   public CompletableFuture aaaab(String param1, String param2, JsonObject param3) {
      // $FF: Couldn't be decompiled
   }

   public boolean aaaba() {
      // $FF: Couldn't be decompiled
   }

   public q2997348aa27a422480aea29cbfd800b1bbabaaa() {
      this.ba = HttpClient.newBuilder().connectTimeout(Duration.ofSeconds(b(bab(aabba(639610566, 532538442 ^ 1665071111), 4795289009190235817L), ab(aabba(639610565, 532538442 ^ 1573915053), 7258027343991905658L)))).followRedirects(Redirect.NEVER).build();
      this.bbbb = q2997348aa27a422480aea29cbfd800b1bbabaaa::aba;
      this.aaba = q2997348aa27a422480aea29cbfd800b1aabaaaaa.ab;
      this.aaaa = "";
   }

   private static JsonObject aaabb(String param0) {
      // $FF: Couldn't be decompiled
   }

   public void aabaa(class_310 param1) {
      // $FF: Couldn't be decompiled
   }

   private static long b(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ bab(aabba(639610471, -1056235717 ^ -1189038949), 606268408183288227L)) & bab(aabba(639610470, -1056235717 ^ 1185351440), 5389535629020870808L);

      try {
         if (aba[var3] == null) {
            aba[var3] = aa[var3] ^ var1;
         }
      } catch (RuntimeException var4) {
         throw var4;
      }

      return aba[var3];
   }

   private void aabab(String var1) {
      int var10000 = q2997348aa27a422480aea29cbfd800b1aabaabaaa.bb;
      this.bbba = null;
      this.aaab(var1);
      int var2 = var10000;
      Path var3 = a();

      try {
         if (var2 != 0 || var3 == null) {
            return;
         }
      } catch (Exception var6) {
         throw var6;
      }

      try {
         Files.deleteIfExists(var3);
      } catch (Exception var5) {
      }

   }
}
