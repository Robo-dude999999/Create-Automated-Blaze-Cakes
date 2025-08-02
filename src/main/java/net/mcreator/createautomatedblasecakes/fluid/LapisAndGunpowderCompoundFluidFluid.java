
package net.mcreator.createautomatedblasecakes.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;

import net.mcreator.createautomatedblasecakes.init.CreateAutomatedBlaseCakesModItems;
import net.mcreator.createautomatedblasecakes.init.CreateAutomatedBlaseCakesModFluids;
import net.mcreator.createautomatedblasecakes.init.CreateAutomatedBlaseCakesModFluidTypes;
import net.mcreator.createautomatedblasecakes.init.CreateAutomatedBlaseCakesModBlocks;

public abstract class LapisAndGunpowderCompoundFluidFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> CreateAutomatedBlaseCakesModFluidTypes.LAPIS_AND_GUNPOWDER_COMPOUND_FLUID_TYPE.get(),
			() -> CreateAutomatedBlaseCakesModFluids.LAPIS_AND_GUNPOWDER_COMPOUND_FLUID.get(), () -> CreateAutomatedBlaseCakesModFluids.FLOWING_LAPIS_AND_GUNPOWDER_COMPOUND_FLUID.get()).explosionResistance(100f)
			.bucket(() -> CreateAutomatedBlaseCakesModItems.LAPIS_AND_GUNPOWDER_COMPOUND_FLUID_BUCKET.get()).block(() -> (LiquidBlock) CreateAutomatedBlaseCakesModBlocks.LAPIS_AND_GUNPOWDER_COMPOUND_FLUID.get());

	private LapisAndGunpowderCompoundFluidFluid() {
		super(PROPERTIES);
	}

	public static class Source extends LapisAndGunpowderCompoundFluidFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends LapisAndGunpowderCompoundFluidFluid {
		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
