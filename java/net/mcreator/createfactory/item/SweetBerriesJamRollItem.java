
package net.mcreator.createfactory.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

import net.mcreator.createfactory.init.CreateFactoryModTabs;

public class SweetBerriesJamRollItem extends Item {
	public SweetBerriesJamRollItem() {
		super(new Item.Properties().tab(CreateFactoryModTabs.TAB_CREATE_FACTORY_TAB).stacksTo(64).rarity(Rarity.COMMON)
				.food((new FoodProperties.Builder()).nutrition(8).saturationMod(0.7000000000000001f)

						.build()));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 32;
	}
}
