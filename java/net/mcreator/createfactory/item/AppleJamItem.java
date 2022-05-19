
package net.mcreator.createfactory.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import net.mcreator.createfactory.init.CreateFactoryModTabs;
import net.mcreator.createfactory.init.CreateFactoryModFluids;

public class AppleJamItem extends BucketItem {
	public AppleJamItem() {
		super(CreateFactoryModFluids.APPLE_JAM, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON)
				.tab(CreateFactoryModTabs.TAB_CREATE_FACTORY_TAB));
	}
}
