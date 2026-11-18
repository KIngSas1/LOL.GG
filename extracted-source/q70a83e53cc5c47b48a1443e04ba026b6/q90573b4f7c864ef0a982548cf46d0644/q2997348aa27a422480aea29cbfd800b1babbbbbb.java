package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientLifecycleEvents;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;
import net.minecraft.class_310;
import net.minecraft.class_332;
import net.minecraft.class_9779;

@Environment(EnvType.CLIENT)
public final class q2997348aa27a422480aea29cbfd800b1babbbbbb implements ClientModInitializer {
   private Thread a;
   private boolean aa;
   private q2997348aa27a422480aea29cbfd800b1aabaabaab ab;
   private BooleanSupplier ba = this::aa;
   private q2997348aa27a422480aea29cbfd800b1bbabaaa bb;
   private q2997348aa27a422480aea29cbfd800b1ababbabab aaa;
   private static volatile q2997348aa27a422480aea29cbfd800b1babbbbbb aab;
   private List b;
   private q2997348aa27a422480aea29cbfd800b1aabababba aba;
   public static boolean abb;
   private Runnable baa = this::a;
   public static boolean bab;
   private boolean bba;
   private volatile boolean bbb;
   private q2997348aa27a422480aea29cbfd800b1abbabbb aaaa;
   private q2997348aa27a422480aea29cbfd800b1aababaabb aaab;
   private boolean aaba;
   private static final ExecutorService aabb = Executors.newSingleThreadExecutor(q2997348aa27a422480aea29cbfd800b1babbbbbb::aaabb);

   private void a() {
   }

   private boolean aa() {
      return true;
   }

   private void ab(q2997348aa27a422480aea29cbfd800b1aaaaab param1) {
      // $FF: Couldn't be decompiled
   }

   private static void ba(class_310 var0) {
      q2997348aa27a422480aea29cbfd800b1abbaaaba.abbbb();
   }

   private void bb() {
      boolean var10000 = abb;
      this.bbb = true;
      aab = this;
      q2997348aa27a422480aea29cbfd800b1abbbaaa.abb();
      boolean var1 = var10000;
      List var2 = this.b;

      label51: {
         try {
            if (var1) {
               return;
            }

            if (var2 != null) {
               break label51;
            }
         } catch (Throwable var7) {
            throw var7;
         }

         this.aaa.abbbba(this.aaaa);
         return;
      }

      this.b = null;

      for(q2997348aa27a422480aea29cbfd800b1bbaababb var4 : var2) {
         try {
            var4.aaaabbaa(true);
         } catch (Throwable var6) {
         }

         if (var1) {
            break;
         }
      }

   }

   private void aaa() {
      // $FF: Couldn't be decompiled
   }

   public q2997348aa27a422480aea29cbfd800b1abbabbb aab() {
      return this.aaaa;
   }

   public void aba() {
      // $FF: Couldn't be decompiled
   }

   public void abb() {
      this.ab(q2997348aa27a422480aea29cbfd800b1aaaaab.bb);
   }

   private void baa(class_332 param1, class_9779 param2) {
      // $FF: Couldn't be decompiled
   }

   private static void bab(String var0) {
   }

   public void bba() {
      this.ab(q2997348aa27a422480aea29cbfd800b1aaaaab.aa);
   }

   public void bbb() {
   }

   public q2997348aa27a422480aea29cbfd800b1aabaabaab aaaa() {
      return this.ab;
   }

   public void aaab() {
      this.bbaa();
   }

   public static q2997348aa27a422480aea29cbfd800b1babbbbbb aaba() {
      // $FF: Couldn't be decompiled
   }

   private void aabb(class_310 param1) {
      // $FF: Couldn't be decompiled
   }

   public q2997348aa27a422480aea29cbfd800b1aabababba abaa() {
      return this.aba;
   }

   public void abab() {
      // $FF: Couldn't be decompiled
   }

   public void abba(Consumer param1) {
      // $FF: Couldn't be decompiled
   }

   private void abbb() {
      try {
         if (!q2997348aa27a422480aea29cbfd800b1abbbaab.ab()) {
            this.aaaba();
         }

      } catch (IllegalStateException var1) {
         throw var1;
      } catch (MatchException var2) {
         throw var2;
      }
   }

   public static void baaa() {
      aabb.shutdownNow();
   }

   private void baab(q2997348aa27a422480aea29cbfd800b1aaabbbbba param1) {
      // $FF: Couldn't be decompiled
   }

   public q2997348aa27a422480aea29cbfd800b1ababbabab baba() {
      return this.aaa;
   }

   private void babb(Consumer var1) {
      boolean var2 = bab;
      boolean var4 = false;
      boolean var3 = abb;

      try {
         this.aaa.abba(this.aaaa);
         var4 = true;
      } catch (Throwable var6) {
      }

      Consumer var10000;
      boolean var10001;
      label36: {
         label35: {
            try {
               try {
                  var10000 = var1;
                  var10001 = var3;
                  if (var2) {
                     break label36;
                  }

                  if (var3) {
                     break label35;
                  }
               } catch (Throwable var7) {
                  throw var7;
               }

               if (var10000 == null) {
                  return;
               }
            } catch (Throwable var8) {
               throw var8;
            }

            var10000 = var1;
         }

         var10001 = var4;
      }

      var10000.accept(var10001);
   }

   public void bbaa() {
      this.aa = true;
   }

   public void bbab() {
      this.ab(q2997348aa27a422480aea29cbfd800b1aaaaab.aab);
   }

   private void bbba(class_310 param1) {
      // $FF: Couldn't be decompiled
   }

   private void b() {
      try {
         this.aaa.abba(this.aaaa);
      } catch (Throwable var2) {
      }

   }

   public void bbbb() {
      this.ab(q2997348aa27a422480aea29cbfd800b1aaaaab.aba);
   }

   public void onInitializeClient() {
      boolean var1 = abb;

      q2997348aa27a422480aea29cbfd800b1babbbbbb var8;
      label51: {
         label46: {
            try {
               try {
                  var10000 = q2997348aa27a422480aea29cbfd800b1aabba.aab(class_310.method_1551());
                  if (var1) {
                     break label46;
                  }

                  if (!var10000) {
                     return;
                  }
               } catch (MatchException var6) {
                  throw var6;
               }
            } catch (IllegalStateException var7) {
               throw var7;
            }

            try {
               var8 = this;
               if (var1) {
                  break label51;
               }

               var10000 = this.bba;
            } catch (IllegalStateException var4) {
               throw var4;
            } catch (MatchException var5) {
               throw var5;
            }
         }

         try {
            if (!var10000) {
               this.aaa();
               this.bb();
               this.aaaba();
            }
         } catch (IllegalStateException var2) {
            throw var2;
         } catch (MatchException var3) {
            throw var3;
         }

         ClientTickEvents.START_CLIENT_TICK.register(this::bbba);
         ClientTickEvents.END_CLIENT_TICK.register(q2997348aa27a422480aea29cbfd800b1babbbbbb::ba);
         HudRenderCallback.EVENT.register(this::baa);
         q2997348aa27a422480aea29cbfd800b1aabbbbbaa.a.a(this::baab);
         var8 = this;
      }

      var8.a = new Thread(this::abbb);
      Runtime.getRuntime().addShutdownHook(this.a);
      ClientLifecycleEvents.CLIENT_STOPPING.register(this::aabb);
   }

   public q2997348aa27a422480aea29cbfd800b1aababaabb aaaaa() {
      return this.aaab;
   }

   public boolean aaaab() {
      // $FF: Couldn't be decompiled
   }

   public void aaaba() {
      // $FF: Couldn't be decompiled
   }

   private static Thread aaabb(Runnable var0) {
      Thread var1 = new Thread(var0);
      var1.setDaemon(true);
      return var1;
   }

   public q2997348aa27a422480aea29cbfd800b1bbabaaa aabaa() {
      return this.bb;
   }
}
