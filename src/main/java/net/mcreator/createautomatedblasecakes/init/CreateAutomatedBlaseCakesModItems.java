
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.createautomatedblasecakes.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.createautomatedblasecakes.item.LapisMoldItem;
import net.mcreator.createautomatedblasecakes.item.LapisAndGunpowderCompoundItem;
import net.mcreator.createautomatedblasecakes.item.LapisAndGunpowderCompoundFluidItem;
import net.mcreator.createautomatedblasecakes.item.ClayPowderItem;
import net.mcreator.createautomatedblasecakes.CreateAutomatedBlaseCakesMod;

public class CreateAutomatedBlaseCakesModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, CreateAutomatedBlaseCakesMod.MODID);
	public static final RegistryObject<Item> LAPIS_MOLD = REGISTRY.register("lapis_mold", () -> new LapisMoldItem());
	public static final RegistryObject<Item> LAPIS_AND_GUNPOWDER_COMPOUND = REGISTRY.register("lapis_and_gunpowder_compound", () -> new LapisAndGunpowderCompoundItem());
	public static final RegistryObject<Item> LAPIS_AND_GUNPOWDER_COMPOUND_FLUID_BUCKET = REGISTRY.register("lapis_and_gunpowder_compound_fluid_bucket", () -> new LapisAndGunpowderCompoundFluidItem());
	public static final RegistryObject<Item> CLAY_POWDER = REGISTRY.register("clay_powder", () -> new ClayPowderItem());
	// Start of user code block custom items
	// End of user code block custom items
}
