package net.cloud.legendarium.mixin;

import net.cloud.legendarium.Legendarium;
import net.minecraft.client.gui.screen.TitleScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TitleScreen.class)
public class LegendariumMixin {
	@Inject(at = @At("HEAD"), method = "init()V")
	private void init(CallbackInfo info) {
		Legendarium.LOGGER.info("This line is printed by an example mod mixin!");
	}
}
//This file gave me so much trouble fml