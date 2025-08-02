
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.createautomatedblasecakes.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.createautomatedblasecakes.block.LapisAndGunpowderCompoundFluidBlock;
import net.mcreator.createautomatedblasecakes.CreateAutomatedBlaseCakesMod;

public class CreateAutomatedBlaseCakesModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, CreateAutomatedBlaseCakesMod.MODID);
	public static final RegistryObject<Block> LAPIS_AND_GUNPOWDER_COMPOUND_FLUID = REGISTRY.register("lapis_and_gunpowder_compound_fluid", () -> new LapisAndGunpowderCompoundFluidBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
