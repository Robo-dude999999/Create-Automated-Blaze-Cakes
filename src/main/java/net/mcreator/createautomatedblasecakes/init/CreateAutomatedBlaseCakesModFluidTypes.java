
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.createautomatedblasecakes.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fluids.FluidType;

import net.mcreator.createautomatedblasecakes.fluid.types.LapisAndGunpowderCompoundFluidFluidType;
import net.mcreator.createautomatedblasecakes.CreateAutomatedBlaseCakesMod;

public class CreateAutomatedBlaseCakesModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, CreateAutomatedBlaseCakesMod.MODID);
	public static final RegistryObject<FluidType> LAPIS_AND_GUNPOWDER_COMPOUND_FLUID_TYPE = REGISTRY.register("lapis_and_gunpowder_compound_fluid", () -> new LapisAndGunpowderCompoundFluidFluidType());
}
