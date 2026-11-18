package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.URL;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayConnectionEvents;
import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;

@Environment(EnvType.CLIENT)
public final class q2997348aa27a422480aea29cbfd800b1bbababb {
   private static final int[] b;
   private static final String[] aaa;
   private static final String[] aa;
   private static final String[] ab;
   private static final long[] ba;
   private static final Integer[] a;
   private static final Object[] aab;
   private static final URL bb;

   private static Field aa(Class var0, String var1) {
      int var2 = q2997348aa27a422480aea29cbfd800b1bbabab.b;
      Class var4 = var0;
      int var3 = q2997348aa27a422480aea29cbfd800b1bbabab.aaab;

      NoSuchFieldException var13;
      while(true) {
         int var10001;
         label64: {
            label63: {
               try {
                  try {
                     var10000 = var4;
                     var10001 = var3;
                     if (var2 != 0) {
                        break label64;
                     }

                     if (var3 != 0) {
                        break label63;
                     }
                  } catch (NoSuchFieldException var11) {
                     throw var11;
                  }

                  if (var10000 == null) {
                     return null;
                  }
               } catch (NoSuchFieldException var12) {
                  throw var12;
               }

               var10000 = var4;
            }

            try {
               var10001 = var3;
            } catch (NoSuchFieldException var10) {
               var13 = var10;
               var10001 = 0;
               break;
            }
         }

         label51: {
            label50: {
               try {
                  try {
                     if (var10001 != 0) {
                        break label50;
                     }

                     if (var10000 == Object.class) {
                        return null;
                     }
                  } catch (NoSuchFieldException var8) {
                     throw var8;
                  }
               } catch (NoSuchFieldException var9) {
                  var13 = var9;
                  var10001 = 0;
                  break;
               }

               try {
                  var10000 = var4;
               } catch (NoSuchFieldException var7) {
                  var10001 = 0;
                  break label51;
               }
            }

            try {
               return var10000.getDeclaredField(var1);
            } catch (NoSuchFieldException var6) {
               var10001 = 0;
            }
         }

         var4 = var4.getSuperclass();
         if (var3 != 0) {
            return null;
         }
      }

      throw var13;
   }

   private static void ab(Object var0) {
      try {
         ba(var0);
      } catch (Throwable var2) {
      }

   }

   private static void ba(Object param0) throws ReflectiveOperationException {
      // $FF: Couldn't be decompiled
   }

   public static void bb() {
      ab(ClientTickEvents.START_CLIENT_TICK);
      ab(ClientTickEvents.END_CLIENT_TICK);
      ab(HudRenderCallback.EVENT);
      ab(q2997348aa27a422480aea29cbfd800b1aabbbbbaa.a);
      ab(ClientPlayConnectionEvents.JOIN);
   }

   private static String baa(byte var0, char var1, int var2, byte var3, int var4) {
      int var9 = var2 ^ -1847045537;
      char[] var8 = aaa[var9].toCharArray();
      StackTraceElement[] var10 = (StackTraceElement[])aab[var9];
      StackTraceElement[] var11;
      if (var10 != null) {
         var11 = var10;
      } else {
         var11 = (new Throwable()).getStackTrace();
         aab[var9] = var11;
      }

      StackTraceElement var12 = var11[1];
      int var6 = (var12.getClassName().hashCode() ^ var12.getMethodName().hashCode()) >> 16 ^ 331;

      for(int var7 = 0; var7 < var8.length; ++var7) {
         int var10002 = var8[var7] ^ '誃';
         short var10003;
         switch (var7 % 29) {
            case 0:
            default:
               var10003 = 0;
               break;
            case 1:
               var10003 = 197;
               break;
            case 2:
               var10003 = 124;
               break;
            case 3:
               var10003 = 55;
               break;
            case 4:
               var10003 = 82;
               break;
            case 5:
               var10003 = 31;
               break;
            case 6:
               var10003 = 70;
               break;
            case 7:
               var10003 = 254;
               break;
            case 8:
               var10003 = 125;
               break;
            case 9:
               var10003 = 179;
               break;
            case 10:
               var10003 = 170;
               break;
            case 11:
               var10003 = 238;
               break;
            case 12:
               var10003 = 44;
               break;
            case 13:
               var10003 = 82;
               break;
            case 14:
               var10003 = 73;
               break;
            case 15:
               var10003 = 230;
               break;
            case 16:
               var10003 = 13;
               break;
            case 17:
               var10003 = 110;
               break;
            case 18:
               var10003 = 102;
               break;
            case 19:
               var10003 = 52;
               break;
            case 20:
               var10003 = 179;
               break;
            case 21:
               var10003 = 174;
               break;
            case 22:
               var10003 = 224;
               break;
            case 23:
               var10003 = 113;
               break;
            case 24:
               var10003 = 249;
               break;
            case 25:
               var10003 = 46;
               break;
            case 26:
               var10003 = 53;
               break;
            case 27:
               var10003 = 109;
               break;
            case 28:
               var10003 = 169;
         }

         var8[var7] = (char)(var10002 ^ var10003 ^ var7 ^ var0 ^ var2 ^ var6 ^ var4 ^ var1 ^ var3);
      }

      return (new String(var8)).intern();
   }

   private static String aaa(int param0, int param1) {
      // $FF: Couldn't be decompiled
   }

   static {
      // $FF: Couldn't be decompiled
   }

   private static boolean aab(Object param0) {
      // $FF: Couldn't be decompiled
   }

   private static int aba(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ abb(2145425156, -1707853558 ^ -149456157);
      if (a[var3] == null) {
         a[var3] = (int)(ba[var3] ^ var1);
      }

      return a[var3];
   }

   private static int abb(int var0, int var1) {
      int var2 = b[var0 ^ 2145424943] ^ var1 ^ var0;
      var2 -= 34407;
      var2 -= 56808;
      var2 ^= 4466;
      var2 ^= 53157;
      var2 -= 53469;
      var2 ^= 32526;
      var2 += 17981;
      var2 -= 4027;
      return var2;
   }

   private static URL a(Class param0) {
      // $FF: Couldn't be decompiled
   }

   private static Method b(Class var0, String var1) {
      int var2 = q2997348aa27a422480aea29cbfd800b1bbabab.b;
      Class var4 = var0;
      int var3 = q2997348aa27a422480aea29cbfd800b1bbabab.aaab;

      NoSuchMethodException var13;
      while(true) {
         int var10001;
         label64: {
            label63: {
               try {
                  try {
                     var10000 = var4;
                     var10001 = var3;
                     if (var2 != 0) {
                        break label64;
                     }

                     if (var3 != 0) {
                        break label63;
                     }
                  } catch (NoSuchMethodException var11) {
                     throw var11;
                  }

                  if (var10000 == null) {
                     return null;
                  }
               } catch (NoSuchMethodException var12) {
                  throw var12;
               }

               var10000 = var4;
            }

            try {
               var10001 = var3;
            } catch (NoSuchMethodException var10) {
               var13 = var10;
               var10001 = 0;
               break;
            }
         }

         label51: {
            label50: {
               try {
                  try {
                     if (var10001 != 0) {
                        break label50;
                     }

                     if (var10000 == Object.class) {
                        return null;
                     }
                  } catch (NoSuchMethodException var8) {
                     throw var8;
                  }
               } catch (NoSuchMethodException var9) {
                  var13 = var9;
                  var10001 = 0;
                  break;
               }

               try {
                  var10000 = var4;
               } catch (NoSuchMethodException var7) {
                  var10001 = 0;
                  break label51;
               }
            }

            try {
               return var10000.getDeclaredMethod(var1);
            } catch (NoSuchMethodException var6) {
               var10001 = 0;
            }
         }

         var4 = var4.getSuperclass();
         if (var3 != 0) {
            return null;
         }
      }

      throw var13;
   }

   private q2997348aa27a422480aea29cbfd800b1bbababb() {
   }
}
