package q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644;

import java.util.function.BooleanSupplier;

public final class q2997348aa27a422480aea29cbfd800b1aaabbabbb {
   public static final double a = (double)0.25F;
   private static final String[] bb;
   public static final float aa = 0.12F;
   public static final double ab = 0.02;
   private static final int[] ba;
   private static final Object[] aaa;
   private static final long b;

   public static double a(double var0) {
      return Math.max((double)0.0F, var0 - 0.02);
   }

   public static double aa(double var0, double var2, double var4) {
      double var6 = Math.min(var0, var2);
      double var8 = Math.max(var0, var2);
      return var6 + (var8 - var6) * bba(var4, (double)0.0F, (double)1.0F);
   }

   static {
      int var27 = -198821971;
      String var17 = "ﴓ\ufde8ﴎﶀ﵈ﵵﴵﴳﵜﶰﶶﴭﵢﵮﷱﴃ둉듈뒀듼둵뒽뒘뒈듫뒆";
      char[] var18 = "\u0010\n".toCharArray();
      short var16 = 32292;
      String[] var19 = new String[var18.length];
      byte var23 = -1;

      while(true) {
         int var20 = 0;
         int var21 = 0;
         char var22 = '\u0000';
         if (var23 == 0) {
            bb = var19;
            aaa = new Object[var19.length];
            int var12 = 352332195;
            byte[] var10 = "EÙJ\u0010¸@^ðª*+ Dhê3ÓòWÊÏÿ\rÈ\u0088K³t`ï;U\u001fÚZ\u0083".getBytes("ISO-8859-1");
            int var11 = var10.length / 4;
            ba = new int[var11];
            int var13 = 0;
            int var14 = 0;

            do {
               int var15 = (var10[var13] & 255) << 24 | (var10[var13 + 1] & 255) << 16 | (var10[var13 + 2] & 255) << 8 | var10[var13 + 3] & 255;
               var15 ^= var12;
               ba[var14] = var15;
               var13 += 4;
               ++var14;
            } while(var14 < var11);

            long var1 = 8286505593975301304L;
            long[] var0 = new long[2];
            int var4 = 0;
            String var5;
            int var6 = (var5 = abaa(-1247925592, var27 ^ -1780330399)).length();
            int var3 = 0;

            do {
               int var10001 = var3;
               var3 += 8;
               byte[] var7 = var5.substring(var10001, var3).getBytes(abaa(-1247925591, var27 ^ -601345929));
               var10001 = var4++;
               long var10004 = (((long)var7[0] & 255L) << b(-1708110540, var27 ^ -1053781456) | ((long)var7[1] & 255L) << b(-1708110539, var27 ^ 1017743049) | ((long)var7[2] & 255L) << b(-1708110538, var27 ^ 784593874) | ((long)var7[3] & 255L) << b(-1708110537, var27 ^ -1065274696) | ((long)var7[4] & 255L) << b(-1708110544, var27 ^ 1461423950) | ((long)var7[5] & 255L) << b(-1708110543, var27 ^ 1259787605) | ((long)var7[b(-1708110542, var27 ^ 211970852)] & 255L) << b(-1708110541, var27 ^ -469310718) | (long)var7[b(-1708110532, var27 ^ -1691122984)] & 255L) ^ var1;
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
               switch (var25 % 5) {
                  case 0:
                  default:
                     var10000 = 107;
                     break;
                  case 1:
                     var10000 = 130;
                     break;
                  case 2:
                     var10000 = 115;
                     break;
                  case 3:
                     var10000 = 17;
                     break;
                  case 4:
                     var10000 = 136;
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

   public static boolean ab(double param0, double param2, double param4, double param6, double param8, double param10, double param12, double param14, double param16, double param18, double param20, double param22, double param24) {
      // $FF: Couldn't be decompiled
   }

   public static boolean ba(double var0, double var2) {
      // $FF: Couldn't be decompiled
   }

   private static double bb(double var0, double var2, double var4, double var6, double var8, double var10, double var12, double var14, double var16, double var18, double var20, double var22, double var24) {
      return aba(var2 - var8 * var0, var4 - var10 * var0, var6 - var12 * var0, var14, var16, var18, var20, var22, var24);
   }

   private static String abaa(int var0, int var1) {
      int var3 = var0 ^ -1247925592;
      char[] var4 = bb[var3].toCharArray();
      StackTraceElement[] var2 = (StackTraceElement[])aaa[var3];
      StackTraceElement[] var5;
      if (var2 != null) {
         var5 = var2;
      } else {
         var5 = (new Throwable()).getStackTrace();
         aaa[var3] = var5;
      }

      StackTraceElement var6 = var5[1];
      int var7 = (var6.getClassName().hashCode() ^ var6.getMethodName().hashCode()) >> 16 ^ -796754688;
      int var8 = 0;

      do {
         short var9;
         switch (var8 & 31) {
            case 0:
            default:
               var9 = 83;
               break;
            case 1:
               var9 = 33;
               break;
            case 2:
               var9 = 132;
               break;
            case 3:
               var9 = 248;
               break;
            case 4:
               var9 = 253;
               break;
            case 5:
               var9 = 214;
               break;
            case 6:
               var9 = 23;
               break;
            case 7:
               var9 = 250;
               break;
            case 8:
               var9 = 239;
               break;
            case 9:
               var9 = 7;
               break;
            case 10:
               var9 = 200;
               break;
            case 11:
               var9 = 66;
               break;
            case 12:
               var9 = 44;
               break;
            case 13:
               var9 = 183;
               break;
            case 14:
               var9 = 217;
               break;
            case 15:
               var9 = 206;
               break;
            case 16:
               var9 = 177;
               break;
            case 17:
               var9 = 5;
               break;
            case 18:
               var9 = 119;
               break;
            case 19:
               var9 = 108;
               break;
            case 20:
               var9 = 166;
               break;
            case 21:
               var9 = 200;
               break;
            case 22:
               var9 = 55;
               break;
            case 23:
               var9 = 154;
               break;
            case 24:
               var9 = 246;
               break;
            case 25:
               var9 = 39;
               break;
            case 26:
               var9 = 217;
               break;
            case 27:
               var9 = 172;
               break;
            case 28:
               var9 = 68;
               break;
            case 29:
               var9 = 55;
               break;
            case 30:
               var9 = 238;
               break;
            case 31:
               var9 = 144;
         }

         var4[var8] = (char)(var4[var8] ^ var9 ^ var1 >> 16 ^ var7);
         ++var8;
      } while(var8 < var4.length);

      return (new String(var4)).intern();
   }

   public static boolean aaa(q2997348aa27a422480aea29cbfd800b1aaababbb param0, q2997348aa27a422480aea29cbfd800b1aaababbb param1) {
      // $FF: Couldn't be decompiled
   }

   public static boolean aab(boolean var0, boolean var1) {
      int var2 = q2997348aa27a422480aea29cbfd800b1bbabab.b;
      int var3 = q2997348aa27a422480aea29cbfd800b1bbabab.aaab;

      boolean var10000;
      label65: {
         label66: {
            int var10001;
            label48: {
               label47: {
                  try {
                     try {
                        var10000 = var0;
                        var10001 = var3;
                        if (var2 != 0) {
                           break label48;
                        }

                        if (var3 != 0) {
                           break label47;
                        }
                     } catch (MatchException var6) {
                        throw var6;
                     }

                     if (!var10000) {
                        break label66;
                     }
                  } catch (MatchException var7) {
                     throw var7;
                  }

                  var10000 = var1;
               }

               try {
                  var10001 = var3;
               } catch (MatchException var5) {
                  var8 = var5;
                  var10001 = 0;
                  throw var8;
               }
            }

            try {
               if (var10001 != 0) {
                  return var10000;
               }

               if (!var10000) {
                  break label65;
               }
            } catch (MatchException var4) {
               var8 = var4;
               var10001 = 0;
               throw var8;
            }
         }

         var10000 = false;
         return var10000;
      }

      var10000 = true;
      return var10000;
   }

   public static double aba(double var0, double var2, double var4, double var6, double var8, double var10, double var12, double var14, double var16) {
      double var18 = Math.max(var6 - var0, Math.max((double)0.0F, var0 - var12));
      double var20 = Math.max(var8 - var2, Math.max((double)0.0F, var2 - var14));
      double var22 = Math.max(var10 - var4, Math.max((double)0.0F, var4 - var16));
      return var18 * var18 + var20 * var20 + var22 * var22;
   }

   public static double abb(double param0, double param2) {
      // $FF: Couldn't be decompiled
   }

   public static float baa(double var0, boolean var2) {
      float var3 = (float)bba(var0 / (double)100.0F, (double)0.0F, (double)1.0F);

      float var10000;
      try {
         try {
            if (var2) {
               var10000 = Math.min(var3, 0.12F);
               return var10000;
            }
         } catch (IllegalStateException var4) {
            throw var4;
         }
      } catch (MatchException var5) {
         throw var5;
      }

      var10000 = var3;
      return var10000;
   }

   private static int b(int var0, int var1) {
      int var2 = ba[var0 ^ -1708110540] ^ var1 ^ var0;
      var2 += 31551;
      var2 ^= 48688;
      var2 -= 14935;
      var2 -= 45439;
      var2 ^= 52403;
      var2 ^= 5660;
      var2 ^= 42956;
      var2 ^= 51005;
      var2 += 65084;
      var2 -= 29905;
      return var2;
   }

   private q2997348aa27a422480aea29cbfd800b1aaabbabbb() {
   }

   public static double bab(double param0) {
      // $FF: Couldn't be decompiled
   }

   private static double bba(double var0, double var2, double var4) {
      return Math.max(var2, Math.min(var4, var0));
   }

   public static double bbb(double var0, int var2, int var3, double var4, double var6) {
      double var8 = Math.max((double)0.0F, var0);
      double var10 = (double)5.0F + bab(var8) + var8 * (double)0.5F * (double)Math.max(0, var3);
      double var12 = Math.max((double)0.0F, var4);
      double var14 = (double)2.0F + Math.max((double)0.0F, var6) / (double)4.0F;
      double var16 = bba(var12 - var10 / var14, var12 * 0.2, (double)20.0F) / (double)25.0F;
      var16 = bba(var16 - 0.15 * (double)Math.max(0, var2), (double)0.0F, (double)1.0F);
      return var10 * ((double)1.0F - var16);
   }

   public static double aaaa(double param0, double param2, double param4) {
      // $FF: Couldn't be decompiled
   }

   public static boolean aaab(q2997348aa27a422480aea29cbfd800b1aaababbb param0, q2997348aa27a422480aea29cbfd800b1aaababbb param1, double param2) {
      // $FF: Couldn't be decompiled
   }

   public static q2997348aa27a422480aea29cbfd800b1aaaaabaab aaba(boolean param0, boolean param1, boolean param2) {
      // $FF: Couldn't be decompiled
   }

   public static boolean aabb(boolean var0, BooleanSupplier var1) {
      int var2 = q2997348aa27a422480aea29cbfd800b1bbabab.aaab;

      label81: {
         boolean var10000;
         try {
            try {
               var10000 = var0;
               if (var2 != 0) {
                  return var10000;
               }

               if (!var0) {
                  break label81;
               }
            } catch (IllegalStateException var7) {
               throw var7;
            }
         } catch (MatchException var8) {
            throw var8;
         }

         var10000 = true;
         return var10000;
      }

      boolean var10;
      label82: {
         label52: {
            label51: {
               try {
                  try {
                     var9 = var1;
                     if (var2 != 0) {
                        break label51;
                     }

                     if (var1 == null) {
                        break label52;
                     }
                  } catch (IllegalStateException var5) {
                     throw var5;
                  }
               } catch (MatchException var6) {
                  throw var6;
               }

               var9 = var1;
            }

            try {
               try {
                  var10 = var9.getAsBoolean();
                  if (var2 != 0) {
                     return var10;
                  }

                  if (var10) {
                     break label82;
                  }
               } catch (IllegalStateException var3) {
                  throw var3;
               }
            } catch (MatchException var4) {
               throw var4;
            }
         }

         var10 = false;
         return var10;
      }

      var10 = true;
      return var10;
   }
}
