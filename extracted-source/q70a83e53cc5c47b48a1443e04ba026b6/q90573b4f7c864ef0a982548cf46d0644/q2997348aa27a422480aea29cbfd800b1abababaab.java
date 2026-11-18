package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import io.netty.channel.ChannelDuplexHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelPromise;
import io.netty.util.concurrent.Future;
import java.nio.channels.ClosedChannelException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.Consumer;
import java.util.function.Predicate;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_2596;
import net.minecraft.class_2828;
import net.minecraft.class_2868;
import net.minecraft.class_2886;
import net.minecraft.class_310;

@Environment(EnvType.CLIENT)
public final class q2997348aa27a422480aea29cbfd800b1abababaab extends ChannelDuplexHandler {
   private float ba;
   private static final Set aaa;
   private final ConcurrentLinkedQueue aab = new ConcurrentLinkedQueue();
   private static final Set aba;
   private static final int abb;
   private static final long[] baa;
   private static final int[] abbbba;
   private final ConcurrentLinkedQueue a = new ConcurrentLinkedQueue();
   private volatile long bab;
   private volatile boolean bba;
   private static final int bbb;
   private static final long aaaa;
   private float aaab;
   private volatile int aaba = -1;
   private static volatile boolean aabb;
   private static volatile boolean abaa;
   private static final String[] abbbbb;
   private static volatile int abab;
   private volatile long abba;
   private float abbb;
   private static final long[] baaa;
   private volatile boolean baab;
   private static volatile boolean baba;
   private final AtomicBoolean babb = new AtomicBoolean();
   private static volatile q2997348aa27a422480aea29cbfd800b1ababbbaab aa;
   private static long bbaa;
   private volatile boolean bbab;
   private volatile boolean bbba;
   private static final String[] bbbb;
   private final Set aaaaa = ConcurrentHashMap.newKeySet();
   private static volatile boolean aaaab;
   private static final int aaaba;
   private static final Long[] aaabb;
   private static volatile q2997348aa27a422480aea29cbfd800b1aabbbabb aabaa;
   private static final Object aabab;
   private static volatile int aabba;
   private static final ConcurrentHashMap aabbb;
   private final AtomicBoolean abaaa = new AtomicBoolean();
   private final ConcurrentLinkedQueue abaab = new ConcurrentLinkedQueue();
   private boolean ababa;
   private static volatile boolean ababb;
   private static volatile long abbaa;
   private static final Long[] abbab;
   private static volatile q2997348aa27a422480aea29cbfd800b1ababaa abbba;
   private static final int abbbb;
   private final AtomicBoolean baaaa = new AtomicBoolean();
   private static volatile boolean baaab;
   private final AtomicBoolean baaba = new AtomicBoolean();
   private static final int baabb;
   private static final String[] babaa;
   private static final ConcurrentHashMap babab;
   private float babba;
   private boolean babbb;
   private final ConcurrentLinkedQueue bbaaa = new ConcurrentLinkedQueue();
   private static final long bbaab;
   private float[] bbaba;
   private final AtomicLong bbabb = new AtomicLong();
   private static volatile q2997348aa27a422480aea29cbfd800b1babbabb ab;
   private boolean bbbaa;
   private static final long bbbab;
   private volatile int bbbba;
   private static volatile q2997348aa27a422480aea29cbfd800b1babbabb bbbbb;
   private static final ConcurrentHashMap aaaaaa;
   private final ConcurrentLinkedQueue aaaaab = new ConcurrentLinkedQueue();
   private volatile boolean aaaaba;
   private final ConcurrentLinkedQueue aaaabb = new ConcurrentLinkedQueue();
   private static final long[] aaabaa;
   private boolean aaabab;
   private static final long aaabba;
   private static final long[] aaabbb;
   private final AtomicBoolean aabaaa = new AtomicBoolean();
   private static volatile long aabaab;
   private static final Integer[] aababa;
   private static volatile q2997348aa27a422480aea29cbfd800b1ababaa aababb;
   private static final Integer[] aabbaa;
   private static final int bb;
   private float aabbab;
   private static final long aabbba;
   private volatile ChannelHandlerContext b;
   private float aabbbb;
   private static final int abaaaa;
   private volatile long abaaab;
   private boolean abaaba;
   private boolean abaabb;
   private static volatile long ababaa;
   private boolean ababab;
   private static final int ababba;
   private final ConcurrentLinkedQueue ababbb = new ConcurrentLinkedQueue();
   private static final Object[] baaaaa;
   private volatile boolean abbaaa;
   private static final int abbaab;
   private static final int abbaba;
   private static final int abbabb;
   private static final int abbbaa;
   private volatile long abbbab;

   private void aa(ChannelHandlerContext param1, long param2) {
      // $FF: Couldn't be decompiled
   }

   private boolean ab(ChannelHandlerContext param1) {
      // $FF: Couldn't be decompiled
   }

   static boolean ba(class_2596 param0, boolean param1, boolean param2) {
      // $FF: Couldn't be decompiled
   }

   private static boolean bb(Object param0) {
      // $FF: Couldn't be decompiled
   }

   public static void aaa(long var0) {
      int var10000 = q2997348aa27a422480aea29cbfd800b1bbabab.aaab;
      long var3 = System.currentTimeMillis() - Math.max(0L, var0);
      int var2 = var10000;

      for(q2997348aa27a422480aea29cbfd800b1abababaab var6 : aaa) {
         var6.abbbbaa(var3);
         if (var2 != 0) {
            break;
         }
      }

   }

   private void aab(class_2828 var1) {
      this.babbb = true;
      this.ababab = var1.method_12273();
      this.bbbaa = var1.method_61225();
      this.abaabb = true;
   }

   private void aba(ConcurrentLinkedQueue var1, Throwable var2) {
      int var3 = q2997348aa27a422480aea29cbfd800b1bbabab.b;
      int var4 = q2997348aa27a422480aea29cbfd800b1bbabab.aaab;

      label23:
      while(true) {
         q2997348aa27a422480aea29cbfd800b1ababbaaa var5;
         if ((var5 = (q2997348aa27a422480aea29cbfd800b1ababbaaa)var1.poll()) != null) {
            var5.aa.tryFailure(var2);
            if (var4 == 0) {
               continue;
            }
         }

         while(var3 != 0) {
            if (var4 == 0) {
               continue label23;
            }
         }

         return;
      }
   }

   private static void abb() {
      synchronized(aabab) {
         abaa = false;
         abbba = null;
         aababb = null;
         bbbbb = null;
         ab = q2997348aa27a422480aea29cbfd800b1babbabb.b;
         baaab = false;
      }
   }

   private static boolean baa(class_2596 var0) {
      return false;
   }

   private static boolean bab(class_2596 param0) {
      // $FF: Couldn't be decompiled
   }

   private ChannelPromise bba(ChannelHandlerContext param1, Object param2, ChannelPromise param3) {
      // $FF: Couldn't be decompiled
   }

   private q2997348aa27a422480aea29cbfd800b1babbbbaa bbb(Object var1, ChannelPromise var2) {
      return new q2997348aa27a422480aea29cbfd800b1babbbbaa(var1, var2, System.nanoTime(), this.bbabb.incrementAndGet());
   }

   public static boolean aaaa(q2997348aa27a422480aea29cbfd800b1ababaa param0) {
      // $FF: Couldn't be decompiled
   }

   private void aaab(Throwable var1) {
      this.bbbbbb(this.aaaaab, var1);
      this.bbbbbb(this.aab, var1);
      this.abababa(var1);
      this.aba(this.a, var1);
      this.aba(this.ababbb, var1);
   }

   private static boolean aaba(Object param0, q2997348aa27a422480aea29cbfd800b1babbabb param1) {
      // $FF: Couldn't be decompiled
   }

   public static boolean aabb() {
      return abaa;
   }

   private void abaa(ChannelHandlerContext param1) {
      // $FF: Couldn't be decompiled
   }

   public static void abab() {
      int var10000 = q2997348aa27a422480aea29cbfd800b1bbabab.aaab;
      Iterator var1 = aaa.iterator();
      int var0 = var10000;

      while(var1.hasNext()) {
         q2997348aa27a422480aea29cbfd800b1abababaab var2 = (q2997348aa27a422480aea29cbfd800b1abababaab)var1.next();
         var2.aaabaab();
         if (var0 != 0) {
            break;
         }
      }

   }

   public void handlerRemoved(ChannelHandlerContext param1) {
      // $FF: Couldn't be decompiled
   }

   public static void abba(ChannelHandlerContext var0, Object var1) {
      aaaabab(var1);
      aaaabb(var0, var1);
      var0.fireChannelRead(var1);
      abbaaba(var1);
   }

   public static int abbb() {
      return abab;
   }

   private void baaa(ChannelHandlerContext var1) {
      this.bbbab(var1, 0L);
   }

   public static void baab() {
      int var10000 = q2997348aa27a422480aea29cbfd800b1bbabab.aaab;
      Iterator var1 = aaa.iterator();
      int var0 = var10000;

      while(var1.hasNext()) {
         q2997348aa27a422480aea29cbfd800b1abababaab var2 = (q2997348aa27a422480aea29cbfd800b1abababaab)var1.next();
         var2.aabaa();
         if (var0 != 0) {
            break;
         }
      }

   }

   private static boolean baba(class_2596 var0) {
      return false;
   }

   private static boolean babb(Object param0) {
      // $FF: Couldn't be decompiled
   }

   private boolean bbaa(ChannelHandlerContext param1, Object param2, ChannelPromise param3) {
      // $FF: Couldn't be decompiled
   }

   public static int bbab() {
      // $FF: Couldn't be decompiled
   }

   public static void bbba(long var0, long var2) {
      abaabba();
   }

   private void bbbb(ChannelHandlerContext param1) {
      // $FF: Couldn't be decompiled
   }

   private void aaaaa(ChannelHandlerContext param1, long param2, q2997348aa27a422480aea29cbfd800b1babbabb param4) {
      // $FF: Couldn't be decompiled
   }

   private static void aaaab(q2997348aa27a422480aea29cbfd800b1abababaab var0, ChannelHandlerContext var1) {
      var0.aaaba(var1);
   }

   private void aaaba(ChannelHandlerContext param1) {
      // $FF: Couldn't be decompiled
   }

   private void aaabb(ChannelHandlerContext param1, Object param2, ChannelPromise param3) {
      // $FF: Couldn't be decompiled
   }

   private void aabaa() {
      // $FF: Couldn't be decompiled
   }

   private void aabab(ChannelHandlerContext var1) {
      this.bbaaa(var1);
   }

   private void aabba(ChannelHandlerContext param1) {
      // $FF: Couldn't be decompiled
   }

   private void aabbb(q2997348aa27a422480aea29cbfd800b1aababbb param1) {
      // $FF: Couldn't be decompiled
   }

   private void abaaa(q2997348aa27a422480aea29cbfd800b1aabbab param1, ChannelHandlerContext param2) {
      // $FF: Couldn't be decompiled
   }

   private void abaab(ChannelHandlerContext param1) throws Exception {
      // $FF: Couldn't be decompiled
   }

   private void ababa(ChannelHandlerContext param1, Throwable param2) {
      // $FF: Couldn't be decompiled
   }

   public static long ababb() {
      return ababaa;
   }

   private static void abbaa(class_2868 param0, Future param1) throws Exception {
      // $FF: Couldn't be decompiled
   }

   private void abbab(q2997348aa27a422480aea29cbfd800b1aabbab param1) {
      // $FF: Couldn't be decompiled
   }

   private void abbba() {
      // $FF: Couldn't be decompiled
   }

   private void abbbb(class_2828 param1, Future param2) throws Exception {
      // $FF: Couldn't be decompiled
   }

   private static long baaaa(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ abaabaa(b(-1515529729, 1376734302 ^ 2125121895), 2010256156331860815L)) & abaabaa(b(-1515529732, 1376734302 ^ 462158098), 6804171489953477076L);

      try {
         if (abbab[var3] == null) {
            abbab[var3] = aaabbb[var3] ^ var1;
         }
      } catch (RuntimeException var4) {
         throw var4;
      }

      return abbab[var3];
   }

   private static boolean baaab(class_2596 var0) {
      return false;
   }

   public static void baaba() {
      baaab = true;
   }

   public static void baabb(class_2596 param0) {
      // $FF: Couldn't be decompiled
   }

   private long babaa(long param1, long param3) {
      // $FF: Couldn't be decompiled
   }

   private boolean babab(q2997348aa27a422480aea29cbfd800b1ababaabab param1) {
      // $FF: Couldn't be decompiled
   }

   private boolean babba(Object param1) {
      // $FF: Couldn't be decompiled
   }

   private static String baaabba(int var0, int var1) {
      int var3 = var0 ^ 1711534634;
      char[] var4 = abbbbb[var3].toCharArray();
      StackTraceElement[] var2 = (StackTraceElement[])baaaaa[var3];
      StackTraceElement[] var5;
      if (var2 != null) {
         var5 = var2;
      } else {
         var5 = (new Throwable()).getStackTrace();
         baaaaa[var3] = var5;
      }

      StackTraceElement var6 = var5[1];
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ -917517453;
      int var8 = 0;

      do {
         short var9;
         switch (var8 & 31) {
            case 0:
            default:
               var9 = 213;
               break;
            case 1:
               var9 = 112;
               break;
            case 2:
               var9 = 167;
               break;
            case 3:
               var9 = 121;
               break;
            case 4:
               var9 = 167;
               break;
            case 5:
               var9 = 78;
               break;
            case 6:
               var9 = 30;
               break;
            case 7:
               var9 = 7;
               break;
            case 8:
               var9 = 35;
               break;
            case 9:
               var9 = 13;
               break;
            case 10:
               var9 = 187;
               break;
            case 11:
               var9 = 18;
               break;
            case 12:
               var9 = 98;
               break;
            case 13:
               var9 = 140;
               break;
            case 14:
               var9 = 123;
               break;
            case 15:
               var9 = 135;
               break;
            case 16:
               var9 = 233;
               break;
            case 17:
               var9 = 131;
               break;
            case 18:
               var9 = 56;
               break;
            case 19:
               var9 = 75;
               break;
            case 20:
               var9 = 37;
               break;
            case 21:
               var9 = 182;
               break;
            case 22:
               var9 = 155;
               break;
            case 23:
               var9 = 50;
               break;
            case 24:
               var9 = 6;
               break;
            case 25:
               var9 = 186;
               break;
            case 26:
               var9 = 35;
               break;
            case 27:
               var9 = 138;
               break;
            case 28:
               var9 = 172;
               break;
            case 29:
               var9 = 34;
               break;
            case 30:
               var9 = 245;
               break;
            case 31:
               var9 = 116;
         }

         var4[var8] = (char)(var4[var8] ^ var9 ^ var1 >> 16 ^ var7);
         ++var8;
      } while(var8 < var4.length);

      return (new String(var4)).intern();
   }

   public static void babbb() {
      ababb = false;
      int var10000 = q2997348aa27a422480aea29cbfd800b1bbabab.aaab;
      aaaab = false;
      int var0 = var10000;

      for(q2997348aa27a422480aea29cbfd800b1abababaab var2 : aaa) {
         var2.bbbaaa();
         if (var0 != 0) {
            break;
         }
      }

   }

   private void bbaaa(ChannelHandlerContext param1) {
      // $FF: Couldn't be decompiled
   }

   static void bbaab(boolean var0) {
      baba = var0;
   }

   private class_2828 bbaba(class_2828 param1) {
      // $FF: Couldn't be decompiled
   }

   public void handlerAdded(ChannelHandlerContext var1) {
      int var2 = q2997348aa27a422480aea29cbfd800b1bbabab.b;
      int var3 = q2997348aa27a422480aea29cbfd800b1bbabab.aaab;
      if (var2 == 0) {
         label45: {
            try {
               boolean var10000 = q2997348aa27a422480aea29cbfd800b1abbbaab.ab();
               if (var3 != 0) {
                  return;
               }

               if (var10000) {
                  break label45;
               }
            } catch (Throwable var6) {
               throw var6;
            }

            this.b = var1;
            aaa.add(this);
            return;
         }

         try {
            var1.pipeline().remove(this);
         } catch (Throwable var5) {
         }

      }
   }

   private void bbabb(Throwable param1) {
      // $FF: Couldn't be decompiled
   }

   static void bbbaa() {
      babab.clear();
   }

   private void bbbab(ChannelHandlerContext param1, long param2) {
      // $FF: Couldn't be decompiled
   }

   private static void bbbba(class_2828 var0, Future var1) throws Exception {
      q2997348aa27a422480aea29cbfd800b1bbb.bb(var0, var1.isSuccess());
   }

   public static long bbbbb() {
      return bbaa;
   }

   public static void aaaaaa() {
      // $FF: Couldn't be decompiled
   }

   private static boolean aaaaab(class_2596 param0) {
      // $FF: Couldn't be decompiled
   }

   private void aaaaba(ChannelHandlerContext var1, long var2) {
      this.baabba(var1, var2);
   }

   private static void aaaabb(ChannelHandlerContext param0, Object param1) {
      // $FF: Couldn't be decompiled
   }

   private static void aaabaa(Object param0) {
      // $FF: Couldn't be decompiled
   }

   public static boolean aaabab(q2997348aa27a422480aea29cbfd800b1ababaa param0, q2997348aa27a422480aea29cbfd800b1babbabb param1) {
      // $FF: Couldn't be decompiled
   }

   private boolean aaabba(Object param1) {
      // $FF: Couldn't be decompiled
   }

   private void aaabbb() {
      this.bbaba = null;
      this.abaaba = false;
      this.aaabab = false;
      this.ababa = false;
      this.bbbba = 0;
      this.babbb = false;
      this.abaabb = false;
   }

   private void aabaaa(ChannelHandlerContext param1) {
      // $FF: Couldn't be decompiled
   }

   private void aabaab() {
      // $FF: Couldn't be decompiled
   }

   private void aababa(ChannelHandlerContext var1) {
      this.aaabbba(var1, 0L);
   }

   private void aababb(ChannelHandlerContext param1, long param2, q2997348aa27a422480aea29cbfd800b1babbabb param4, long param5) {
      // $FF: Couldn't be decompiled
   }

   private static void aabbaa() {
      aabbb.clear();
      aabb = false;
      aba.clear();
   }

   private static int aabbab(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & abbbabb(b(-1515529737, 173440308 ^ -2003176211), 5142746153032604472L)) ^ abaabaa(b(-1515529740, 173440308 ^ -2066326638), 1558336499228212479L);

      try {
         if (aababa[var3] == null) {
            aababa[var3] = (int)(baaa[var3] ^ var1);
         }
      } catch (RuntimeException var4) {
         throw var4;
      }

      return aababa[var3];
   }

   public static long aabbba() {
      return abbaa;
   }

   private boolean aabbbb(q2997348aa27a422480aea29cbfd800b1ababbaaa param1) {
      // $FF: Couldn't be decompiled
   }

   private void abaaaa(ChannelHandlerContext param1) {
      // $FF: Couldn't be decompiled
   }

   private long abaaab(Object param1) {
      // $FF: Couldn't be decompiled
   }

   private static boolean abaaba(Object param0) {
      // $FF: Couldn't be decompiled
   }

   private void abaabb(ChannelHandlerContext var1) {
      this.abaa(var1);
   }

   private static boolean ababaa(Object param0) {
      // $FF: Couldn't be decompiled
   }

   private static void ababab(q2997348aa27a422480aea29cbfd800b1abababaab var0, ChannelHandlerContext var1) {
      var0.bbaaba(var1);
   }

   private long ababba(long param1, long param3, long param5) {
      // $FF: Couldn't be decompiled
   }

   public static q2997348aa27a422480aea29cbfd800b1aabbbabb ababbb() {
      return aabaa;
   }

   private static void abbaaa(class_2596 param0) {
      // $FF: Couldn't be decompiled
   }

   private void abbaab(ChannelHandlerContext param1, long param2) {
      // $FF: Couldn't be decompiled
   }

   private void abbaba(ChannelHandlerContext var1, long var2, q2997348aa27a422480aea29cbfd800b1babbabb var4) {
      this.aaaaa(var1, var2, var4);
   }

   private long abbabb(Object param1) {
      // $FF: Couldn't be decompiled
   }

   public static boolean abbbaa() {
      // $FF: Couldn't be decompiled
   }

   public static void abbbab() {
      // $FF: Couldn't be decompiled
   }

   public static void abbbba() {
      aa = null;
   }

   public static boolean abbbbb() {
      // $FF: Couldn't be decompiled
   }

   private static boolean baaaaa(class_2596 param0) {
      // $FF: Couldn't be decompiled
   }

   static {
      // $FF: Couldn't be decompiled
   }

   private static int b(int var0, int var1) {
      int var2 = abbbba[var0 ^ -1515529926] ^ var1 ^ var0;
      var2 ^= 1234;
      var2 ^= 58437;
      var2 ^= 65396;
      var2 += 501;
      var2 -= 22425;
      var2 -= 3475;
      var2 += 16162;
      var2 ^= 23138;
      var2 ^= 41577;
      return var2;
   }

   private static boolean baaaab(class_2596 param0) {
      // $FF: Couldn't be decompiled
   }

   private void baaaba(ChannelHandlerContext param1) {
      // $FF: Couldn't be decompiled
   }

   private void baaabb(ChannelHandlerContext param1) {
      // $FF: Couldn't be decompiled
   }

   public static void baabaa(class_2596 param0) {
      // $FF: Couldn't be decompiled
   }

   private static void baabab() {
      // $FF: Couldn't be decompiled
   }

   private void baabba(ChannelHandlerContext param1, long param2) {
      // $FF: Couldn't be decompiled
   }

   private long baabbb(Object var1) {
      return 0L;
   }

   private void babaaa(long param1, q2997348aa27a422480aea29cbfd800b1babbabb param3) {
      // $FF: Couldn't be decompiled
   }

   private static boolean babaab(String param0) {
      // $FF: Couldn't be decompiled
   }

   private void bababa(ChannelHandlerContext var1) {
      this.aabba(var1);
   }

   private void bababb(ChannelHandlerContext param1) {
      // $FF: Couldn't be decompiled
   }

   public static int babbaa() {
      return aabba;
   }

   private void babbab(ChannelHandlerContext var1) {
      this.bbabba(var1);
   }

   private void babbba(int param1) {
      // $FF: Couldn't be decompiled
   }

   private static boolean babbbb(Object param0) {
      // $FF: Couldn't be decompiled
   }

   private void bbaaaa(ChannelHandlerContext var1) {
      this.abaabbb(var1);
   }

   private void bbaaab(ChannelHandlerContext param1, Object param2, ChannelPromise param3) {
      // $FF: Couldn't be decompiled
   }

   private void bbaaba(ChannelHandlerContext param1) {
      // $FF: Couldn't be decompiled
   }

   private Integer bbaabb(Object param1) {
      // $FF: Couldn't be decompiled
   }

   private void bbabaa(class_2596 param1) {
      // $FF: Couldn't be decompiled
   }

   private void bbabab() {
      // $FF: Couldn't be decompiled
   }

   private void bbabba(ChannelHandlerContext param1) {
      // $FF: Couldn't be decompiled
   }

   public static long bbabbb() {
      return aabaab;
   }

   private void bbbaaa() {
      // $FF: Couldn't be decompiled
   }

   private static boolean bbbaab(class_2596 var0) {
      return false;
   }

   private long bbbaba(q2997348aa27a422480aea29cbfd800b1ababbaaa var1) {
      int var2 = q2997348aa27a422480aea29cbfd800b1bbabab.aaab;

      long var7;
      label35: {
         label34: {
            try {
               try {
                  var10000 = var1;
                  if (var2 != 0) {
                     break label34;
                  }

                  if (var1 == null) {
                     break label35;
                  }
               } catch (MatchException var5) {
                  throw var5;
               }
            } catch (CancellationException var6) {
               throw var6;
            }

            var10000 = var1;
         }

         try {
            try {
               if (var10000.ab == q2997348aa27a422480aea29cbfd800b1babbabb.ab) {
                  var7 = aaaa;
                  return var7;
               }
            } catch (MatchException var3) {
               throw var3;
            }
         } catch (CancellationException var4) {
            throw var4;
         }
      }

      var7 = aaabba;
      return var7;
   }

   private static class_2828 bbbabb(class_2828 var0) {
      try {
         try {
            if (var0.method_36171()) {
               return new class_2828.class_2829(var0.method_12269((double)0.0F), var0.method_12268((double)0.0F), var0.method_12274((double)0.0F), var0.method_12273(), var0.method_61225());
            }
         } catch (MatchException var1) {
            throw var1;
         }
      } catch (CancellationException var2) {
         throw var2;
      }

      return new class_2828.class_5911(var0.method_12273(), var0.method_61225());
   }

   public static void bbbbaa() {
      int var0 = q2997348aa27a422480aea29cbfd800b1bbabab.b;
      int var10000 = q2997348aa27a422480aea29cbfd800b1bbabab.aaab;
      q2997348aa27a422480aea29cbfd800b1aabbab var2 = q2997348aa27a422480aea29cbfd800b1baba.aaaab().aabab();
      int var1 = var10000;
      boolean var10 = false;

      try {
         var10 = true;
         Iterator var3 = aaa.iterator();

         label110:
         while(true) {
            if (!var3.hasNext()) {
               var10 = false;
               break;
            }

            q2997348aa27a422480aea29cbfd800b1abababaab var4 = (q2997348aa27a422480aea29cbfd800b1abababaab)var3.next();
            CancellationException var20;
            if (var0 != 0) {
               try {
                  if (var1 == 0) {
                     continue;
                  }
               } catch (CancellationException var13) {
                  var20 = var13;
                  boolean var10001 = false;
                  throw var20;
               }

               if (var0 == 0) {
                  var10 = false;
                  break;
               }
            }

            while(true) {
               try {
                  if (var1 != 0) {
                     var10 = false;
                     return;
                  }

                  var4.abbaaab(var2);
               } catch (CancellationException var11) {
                  var20 = var11;
                  boolean var21 = false;
                  break;
               }

               try {
                  if (var1 == 0) {
                     continue label110;
                  }
               } catch (CancellationException var12) {
                  var20 = var12;
                  boolean var22 = false;
                  break;
               }

               if (var0 == 0) {
                  var10 = false;
                  break label110;
               }
            }

            throw var20;
         }
      } finally {
         if (var10) {
            baaab = false;
         }
      }

      baaab = false;
   }

   private void bbbbab(ChannelHandlerContext var1) {
      this.bbbb(var1);
   }

   private static q2997348aa27a422480aea29cbfd800b1babbabb bbbbba(Object param0) {
      // $FF: Couldn't be decompiled
   }

   private void bbbbbb(ConcurrentLinkedQueue var1, Throwable var2) {
      int var3 = q2997348aa27a422480aea29cbfd800b1bbabab.b;
      int var4 = q2997348aa27a422480aea29cbfd800b1bbabab.aaab;

      label24:
      while(true) {
         q2997348aa27a422480aea29cbfd800b1babbbbaa var5;
         if ((var5 = (q2997348aa27a422480aea29cbfd800b1babbbbaa)var1.poll()) != null) {
            var5.b.tryFailure(var2);
            if (var4 == 0) {
               continue;
            }
         }

         while(var3 != 0) {
            if (var4 == 0) {
               continue label24;
            }
         }

         return;
      }
   }

   private void aaaaaaa() {
      this.bba = false;
      this.bbba = false;
      this.baab = false;
      this.bbab = false;
   }

   private long aaaaaab(q2997348aa27a422480aea29cbfd800b1babbbbaa param1) {
      // $FF: Couldn't be decompiled
   }

   private boolean aaaaaba(long param1, q2997348aa27a422480aea29cbfd800b1babbabb param3) {
      // $FF: Couldn't be decompiled
   }

   public static void aaaaabb(Predicate var0, Consumer var1) {
      abbbbab(var0, var1, q2997348aa27a422480aea29cbfd800b1abababaab::aaabaaa, q2997348aa27a422480aea29cbfd800b1abababaab::bbbaab);
   }

   private q2997348aa27a422480aea29cbfd800b1ababaabbb aaaabaa() {
      // $FF: Couldn't be decompiled
   }

   private static void aaaabab(Object param0) {
      // $FF: Couldn't be decompiled
   }

   public static void aaaabba(q2997348aa27a422480aea29cbfd800b1ababaa param0, long param1) {
      // $FF: Couldn't be decompiled
   }

   private static void aaaabbb(ChannelHandlerContext param0, Object param1, Future param2) throws Exception {
      // $FF: Couldn't be decompiled
   }

   private static boolean aaabaaa(class_2596 var0) {
      return false;
   }

   private void aaabaab() {
      // $FF: Couldn't be decompiled
   }

   private boolean aaababa(ChannelHandlerContext var1) {
      int var2 = q2997348aa27a422480aea29cbfd800b1bbabab.b;
      int var10000 = q2997348aa27a422480aea29cbfd800b1bbabab.aaab;
      ArrayList var4 = new ArrayList(aabbab(abaabaa(b(-1515529767, -2091055144 ^ -1029314161), 9150179217341797355L), abbbabb(b(-1515529762, -2091055144 ^ -338525824), 8480176126103523800L)));
      int var3 = var10000;

      while(var4.size() < aabbab(abaabaa(b(-1515529761, -2091055144 ^ 952595345), 5334298310583310634L), abbbabb(b(-1515529764, -2091055144 ^ 1207502552), 3164914171044232207L))) {
         q2997348aa27a422480aea29cbfd800b1ababbaaa var5;
         q2997348aa27a422480aea29cbfd800b1ababbaaa var13 = var5 = (q2997348aa27a422480aea29cbfd800b1ababbaaa)this.a.poll();

         try {
            try {
               if (var13 == null) {
                  break;
               }

               var4.add(var5);
               if (var3 == 0) {
                  continue;
               }
            } catch (MatchException var11) {
               throw var11;
            }
         } catch (CancellationException var12) {
            throw var12;
         }

         try {
            if (var2 == 0) {
            }
            break;
         } catch (CancellationException var9) {
            throw var9;
         }
      }

      boolean var6 = false;
      Iterator var7 = var4.iterator();

      while(true) {
         if (var7.hasNext()) {
            q2997348aa27a422480aea29cbfd800b1ababbaaa var8 = (q2997348aa27a422480aea29cbfd800b1ababbaaa)var7.next();

            label40: {
               try {
                  if (var2 != 0) {
                     break label40;
                  }

                  var10000 = var6;
                  if (var3 != 0) {
                     break;
                  }
               } catch (CancellationException var10) {
                  throw var10;
               }

               var6 = (boolean)(var10000 | this.bbaa(var1, var8.a, var8.aa));
            }

            if (var3 == 0) {
               continue;
            }
         }

         var10000 = var6;
         break;
      }

      return (boolean)var10000;
   }

   public static void aaababb(Predicate var0, Consumer var1, Predicate var2) {
      abbbbab(var0, var1, var2, q2997348aa27a422480aea29cbfd800b1abababaab::baaab);
   }

   private void aaabbaa(ChannelHandlerContext param1, Object param2, ChannelPromise param3) throws Exception {
      // $FF: Couldn't be decompiled
   }

   private q2997348aa27a422480aea29cbfd800b1ababbaaa aaabbab(Object var1, ChannelPromise var2, q2997348aa27a422480aea29cbfd800b1babbabb var3) {
      return new q2997348aa27a422480aea29cbfd800b1ababbaaa(var1, var2, var3, System.nanoTime(), this.bbabb.incrementAndGet());
   }

   private void aaabbba(ChannelHandlerContext param1, long param2) {
      // $FF: Couldn't be decompiled
   }

   private static Integer aaabbbb(class_2596 param0) {
      // $FF: Couldn't be decompiled
   }

   private boolean aabaaaa(q2997348aa27a422480aea29cbfd800b1ababbaaa param1) {
      // $FF: Couldn't be decompiled
   }

   private void aabaaab(ChannelHandlerContext var1) {
      this.abbbbbb(var1);
   }

   public static boolean aabaaba() {
      return aaaab;
   }

   public static void aabaabb(q2997348aa27a422480aea29cbfd800b1aabbbabb param0) {
      // $FF: Couldn't be decompiled
   }

   private boolean aababaa(q2997348aa27a422480aea29cbfd800b1babbbbaa param1) {
      // $FF: Couldn't be decompiled
   }

   private static class_2886 aababab(class_2886 param0) {
      // $FF: Couldn't be decompiled
   }

   private static boolean aababba(Object param0) {
      // $FF: Couldn't be decompiled
   }

   public static void aababbb() {
      abaabba();
   }

   private static void aabbaaa(ChannelHandlerContext param0, Object param1) {
      // $FF: Couldn't be decompiled
   }

   private boolean aabbaab(q2997348aa27a422480aea29cbfd800b1aaababaa param1) {
      // $FF: Couldn't be decompiled
   }

   private void aabbaba(ChannelHandlerContext param1) {
      // $FF: Couldn't be decompiled
   }

   private boolean aabbabb(Object param1) {
      // $FF: Couldn't be decompiled
   }

   private void aabbbaa(ChannelHandlerContext param1, Object param2, ChannelPromise param3) throws Exception {
      // $FF: Couldn't be decompiled
   }

   private static void aabbbab(q2997348aa27a422480aea29cbfd800b1ababbbaab param0, class_2596 param1) {
      // $FF: Couldn't be decompiled
   }

   public static void aabbbba() {
      int var10000 = q2997348aa27a422480aea29cbfd800b1bbabab.aaab;
      q2997348aa27a422480aea29cbfd800b1aabbab var1 = q2997348aa27a422480aea29cbfd800b1baba.aaaab().aabab();
      int var0 = var10000;

      try {
         try {
            if (var1.a()) {
               return;
            }
         } catch (MatchException var4) {
            throw var4;
         }
      } catch (CancellationException var5) {
         throw var5;
      }

      for(q2997348aa27a422480aea29cbfd800b1abababaab var3 : aaa) {
         var3.abbab(var1);
         if (var0 != 0) {
            break;
         }
      }

   }

   private static boolean aabbbbb() {
      int var10000 = q2997348aa27a422480aea29cbfd800b1bbabab.aaab;
      class_310 var1 = class_310.method_1551();
      int var0 = var10000;

      label35: {
         label34: {
            try {
               try {
                  var6 = var1;
                  if (var0 != 0) {
                     break label34;
                  }

                  if (var1 == null) {
                     break label35;
                  }
               } catch (MatchException var4) {
                  throw var4;
               }
            } catch (CancellationException var5) {
               throw var5;
            }

            var6 = var1;
         }

         try {
            try {
               if (var6.field_1755 != null) {
                  var10000 = 1;
                  return (boolean)var10000;
               }
            } catch (MatchException var2) {
               throw var2;
            }
         } catch (CancellationException var3) {
            throw var3;
         }
      }

      var10000 = 0;
      return (boolean)var10000;
   }

   private static boolean abaaaaa(class_2596 var0) {
      boolean var10000;
      try {
         try {
            if (aaabbbb(var0) != null) {
               var10000 = true;
               return var10000;
            }
         } catch (MatchException var1) {
            throw var1;
         }
      } catch (CancellationException var2) {
         throw var2;
      }

      var10000 = false;
      return var10000;
   }

   private void abaaaab(boolean param1, class_2596 param2, boolean param3, Future param4) throws Exception {
      // $FF: Couldn't be decompiled
   }

   static void abaaaba(class_2886 param0, float param1, float param2) {
      // $FF: Couldn't be decompiled
   }

   public static void abaaabb(class_2596 param0) {
      // $FF: Couldn't be decompiled
   }

   private static int abaabaa(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ b(-1515529785, 1101427216 ^ -790260651);
      if (aabbaa[var3] == null) {
         aabbaa[var3] = (int)(baa[var3] ^ var1);
      }

      return aabbaa[var3];
   }

   public static void abaabab(long param0) {
      // $FF: Couldn't be decompiled
   }

   public static void abaabba() {
      int var10000 = q2997348aa27a422480aea29cbfd800b1bbabab.aaab;
      Iterator var1 = aaa.iterator();
      int var0 = var10000;

      while(var1.hasNext()) {
         q2997348aa27a422480aea29cbfd800b1abababaab var2 = (q2997348aa27a422480aea29cbfd800b1abababaab)var1.next();
         var2.bbabab();
         if (var0 != 0) {
            break;
         }
      }

   }

   private void abaabbb(ChannelHandlerContext param1) {
      // $FF: Couldn't be decompiled
   }

   private boolean ababaaa(Object param1) {
      // $FF: Couldn't be decompiled
   }

   private static boolean ababaab() {
      // $FF: Couldn't be decompiled
   }

   private void abababa(Throwable var1) {
      int var2 = q2997348aa27a422480aea29cbfd800b1bbabab.b;
      int var3 = q2997348aa27a422480aea29cbfd800b1bbabab.aaab;

      label22:
      while(true) {
         q2997348aa27a422480aea29cbfd800b1aababbb var4;
         if ((var4 = (q2997348aa27a422480aea29cbfd800b1aababbb)this.bbaaa.poll()) != null) {
            this.aaaaa.remove(var4);
         } else if (var2 == 0) {
            return;
         }

         do {
            var4.ba.tryFailure(var1);
            if (var3 == 0) {
               continue label22;
            }
         } while(var2 != 0);

         return;
      }
   }

   private static boolean abababb(class_2596 param0) {
      // $FF: Couldn't be decompiled
   }

   private long ababbaa(q2997348aa27a422480aea29cbfd800b1aababbb param1) {
      // $FF: Couldn't be decompiled
   }

   private void ababbab(ChannelHandlerContext param1) {
      // $FF: Couldn't be decompiled
   }

   public static void ababbba() {
      aaaab = true;
      ababb = true;
   }

   private static boolean ababbbb(Object param0) {
      // $FF: Couldn't be decompiled
   }

   private void abbaaaa(ChannelHandlerContext param1) {
      // $FF: Couldn't be decompiled
   }

   public void channelRead(ChannelHandlerContext param1, Object param2) throws Exception {
      // $FF: Couldn't be decompiled
   }

   private void abbaaab(q2997348aa27a422480aea29cbfd800b1aabbab param1) {
      // $FF: Couldn't be decompiled
   }

   private static void abbaaba(Object param0) {
      // $FF: Couldn't be decompiled
   }

   public void abbaabb() {
      abbbba();
      this.aaab(new ClosedChannelException());
      this.abaab.clear();
      this.aaaabb.clear();
      this.aaaaa.clear();
      this.bba = false;
      this.bbba = false;
      this.baab = false;
      this.bbab = false;
      this.abaaa.set(false);
      this.baaaa.set(false);
      this.baaba.set(false);
      this.aabaaa.set(false);
      this.babb.set(false);
      this.abbaaa = false;
      this.abaaab = 0L;
      this.abba = 0L;
      this.abbbab = 0L;
      this.bab = 0L;
   }

   private static void abbabaa(Runnable param0) {
      // $FF: Couldn't be decompiled
   }

   private static Integer abbabab(class_2596 param0, String[] param1) {
      // $FF: Couldn't be decompiled
   }

   private void abbabba(ChannelHandlerContext param1, long param2) {
      // $FF: Couldn't be decompiled
   }

   private boolean abbabbb() {
      // $FF: Couldn't be decompiled
   }

   public void write(ChannelHandlerContext param1, Object param2, ChannelPromise param3) throws Exception {
      // $FF: Couldn't be decompiled
   }

   private static boolean abbbaaa(class_2596 param0) {
      // $FF: Couldn't be decompiled
   }

   private void abbbaab(ChannelHandlerContext param1) {
      // $FF: Couldn't be decompiled
   }

   private void abbbaba(ChannelHandlerContext param1, Object param2, ChannelPromise param3) throws Exception {
      // $FF: Couldn't be decompiled
   }

   private static long abbbabb(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ b(-1515530200, -1832363110 ^ -812097069)) & b(-1515530199, -1832363110 ^ -1333305614);
      if (aaabb[var3] == null) {
         aaabb[var3] = aaabaa[var3] ^ var1;
      }

      return aaabb[var3];
   }

   private void a(Object param1) {
      // $FF: Couldn't be decompiled
   }

   private void abbbbaa(long param1) {
      // $FF: Couldn't be decompiled
   }

   public static void abbbbab(Predicate param0, Consumer param1, Predicate param2, Predicate param3) {
      // $FF: Couldn't be decompiled
   }

   static void abbbbba() {
      abb();
   }

   private void abbbbbb(ChannelHandlerContext param1) {
      // $FF: Couldn't be decompiled
   }

   private void baaaaaa(ChannelHandlerContext param1, Object param2, ChannelPromise param3) throws Exception {
      // $FF: Couldn't be decompiled
   }

   private void baaaaab(ChannelHandlerContext var1) {
      this.abbaab(var1, 0L);
   }

   private class_2828 baaaaba(class_2828 param1) {
      // $FF: Couldn't be decompiled
   }

   private void baaaabb(ChannelHandlerContext param1, ConcurrentLinkedQueue param2) {
      // $FF: Couldn't be decompiled
   }

   public static boolean baaabaa(q2997348aa27a422480aea29cbfd800b1ababaa param0, boolean param1) {
      // $FF: Couldn't be decompiled
   }

   private static String baaabab(int param0, int param1) {
      // $FF: Couldn't be decompiled
   }
}
