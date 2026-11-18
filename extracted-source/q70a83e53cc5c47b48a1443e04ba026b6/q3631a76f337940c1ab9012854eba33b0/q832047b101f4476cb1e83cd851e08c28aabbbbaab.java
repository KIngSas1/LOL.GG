package q70a83e53cc5c47b48a1443e04ba026b6.q3631a76f337940c1ab9012854eba33b0;

import com.google.common.hash.HashCode;
import com.google.common.hash.HashFunction;
import java.net.Proxy;
import java.net.URL;
import java.nio.file.Path;
import java.util.Map;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.class_3521;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import q70a83e53cc5c47b48a1443e04ba026b6.q90573b4f7c864ef0a982548cf46d0644.q2997348aa27a422480aea29cbfd800b1bbbbbbbb;

@Environment(EnvType.CLIENT)
@Mixin({class_3521.class})
public abstract class q832047b101f4476cb1e83cd851e08c28aabbbbaab {
   @Inject(
      method = {"method_55496"},
      at = {@At("HEAD")}
   )
   private static void a(Path var0, URL var1, Map var2, HashFunction var3, HashCode var4, int var5, Proxy var6, class_3521.class_9034 var7, CallbackInfoReturnable var8) {
      if (q2997348aa27a422480aea29cbfd800b1bbbbbbbb.b()) {
         if (!q2997348aa27a422480aea29cbfd800b1bbbbbbbb.abb(var1.toString())) {
            q2997348aa27a422480aea29cbfd800b1bbbbbbbb.aaaa(var1.toString());
            throw new IllegalArgumentException();
         }
      }
   }

   @ModifyArg(
      method = {"method_55496"},
      at = @At(
   value = "INVOKE",
   target = "Ljava/net/HttpURLConnection;setInstanceFollowRedirects(Z)V"
),
      index = 0
   )
   private static boolean b(boolean var0) {
      return q2997348aa27a422480aea29cbfd800b1bbbbbbbb.b() ? false : var0;
   }
}
