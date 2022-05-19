
package net.mcreator.createfactory.item;

import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.createfactory.init.CreateFactoryModTabs;

public class CrushedSugarItem extends Item {
	public CrushedSugarItem() {
		super(new Item.Properties().tab(CreateFactoryModTabs.TAB_CREATE_FACTORY_TAB).stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.EAT;
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
