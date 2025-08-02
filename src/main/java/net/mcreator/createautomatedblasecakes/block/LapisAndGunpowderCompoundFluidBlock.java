
package net.mcreator.createautomatedblasecakes.block;

import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.LiquidBlock;

import net.mcreator.createautomatedblasecakes.init.CreateAutomatedBlaseCakesModFluids;

public class LapisAndGunpowderCompoundFluidBlock extends LiquidBlock {
	public LapisAndGunpowderCompoundFluidBlock() {
		super(() -> CreateAutomatedBlaseCakesModFluids.LAPIS_AND_GUNPOWDER_COMPOUND_FLUID.get(),
				BlockBehaviour.Properties.of().mapColor(MapColor.LAPIS).strength(100f).noCollission().noLootTable().liquid().pushReaction(PushReaction.DESTROY).sound(SoundType.EMPTY).replaceable());
	}
}
