
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.createautomatedblasecakes.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.mcreator.createautomatedblasecakes.fluid.LapisAndGunpowderCompoundFluidFluid;
import net.mcreator.createautomatedblasecakes.CreateAutomatedBlaseCakesMod;

public class CreateAutomatedBlaseCakesModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(ForgeRegistries.FLUIDS, CreateAutomatedBlaseCakesMod.MODID);
	public static final RegistryObject<FlowingFluid> LAPIS_AND_GUNPOWDER_COMPOUND_FLUID = REGISTRY.register("lapis_and_gunpowder_compound_fluid", () -> new LapisAndGunpowderCompoundFluidFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_LAPIS_AND_GUNPOWDER_COMPOUND_FLUID = REGISTRY.register("flowing_lapis_and_gunpowder_compound_fluid", () -> new LapisAndGunpowderCompoundFluidFluid.Flowing());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class FluidsClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(LAPIS_AND_GUNPOWDER_COMPOUND_FLUID.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_LAPIS_AND_GUNPOWDER_COMPOUND_FLUID.get(), RenderType.translucent());
		}
	}
}
