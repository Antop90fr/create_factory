
package net.mcreator.createfactory.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

import net.mcreator.createfactory.init.CreateFactoryModTabs;

public class ChocolateRollItem extends Item {
	public ChocolateRollItem() {
		super(new Item.Properties().tab(CreateFactoryModTabs.TAB_CREATE_FACTORY_TAB).stacksTo(64).rarity(Rarity.COMMON)
				.food((new FoodProperties.Builder()).nutrition(8).saturationMod(0.5f)

						.build()));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 32;
	}
}
