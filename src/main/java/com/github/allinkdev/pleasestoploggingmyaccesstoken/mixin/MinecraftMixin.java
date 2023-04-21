package com.github.allinkdev.pleasestoploggingmyaccesstoken.mixin;

import net.minecraft.client.Minecraft;
import net.minecraft.client.Session;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(Minecraft.class)
public final class MinecraftMixin {
	@Redirect(method = "<init>", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/Session;getId()Ljava/lang/String;"))
	private String init$getId(final Session session) {
		return "not being logged to console, you muffin";
	}
}
