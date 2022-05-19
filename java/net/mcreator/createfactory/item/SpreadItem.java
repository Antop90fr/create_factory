
package net.mcreator.createfactory.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import net.mcreator.createfactory.init.CreateFactoryModTabs;
import net.mcreator.createfactory.init.CreateFactoryModFluids;

public class SpreadItem extends BucketItem {
	public SpreadItem() {
		super(CreateFactoryModFluids.SPREAD, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON)
				.tab(CreateFactoryModTabs.TAB_CREATE_FACTORY_TAB));
	}
}
