
package net.mcreator.createfactory.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import net.mcreator.createfactory.init.CreateFactoryModTabs;
import net.mcreator.createfactory.init.CreateFactoryModFluids;

public class SweetWhippedCreamItem extends BucketItem {
	public SweetWhippedCreamItem() {
		super(CreateFactoryModFluids.SWEET_WHIPPED_CREAM, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON)
				.tab(CreateFactoryModTabs.TAB_CREATE_FACTORY_TAB));
	}
}
