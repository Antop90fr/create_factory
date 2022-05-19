
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.createfactory.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class CreateFactoryModTabs {
	public static CreativeModeTab TAB_CREATE_FACTORY_TAB;

	public static void load() {
		TAB_CREATE_FACTORY_TAB = new CreativeModeTab("tabcreate_factory_tab") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(CreateFactoryModItems.SWEET_BERRIES_JAM_ROLL.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
