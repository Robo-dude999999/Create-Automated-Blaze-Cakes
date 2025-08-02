
package net.mcreator.createautomatedblasecakes.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import net.mcreator.createautomatedblasecakes.init.CreateAutomatedBlaseCakesModFluids;

public class LapisAndGunpowderCompoundFluidItem extends BucketItem {
	public LapisAndGunpowderCompoundFluidItem() {
		super(CreateAutomatedBlaseCakesModFluids.LAPIS_AND_GUNPOWDER_COMPOUND_FLUID, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON));
	}
}
