
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.createfactory.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.createfactory.item.WhiteChocolateRollItem;
import net.mcreator.createfactory.item.WalnutBrownieItem;
import net.mcreator.createfactory.item.SweetWhippedCreamItem;
import net.mcreator.createfactory.item.SweetBerriesJamRollItem;
import net.mcreator.createfactory.item.SweetBerriesJamItem;
import net.mcreator.createfactory.item.SpreadRollItem;
import net.mcreator.createfactory.item.SpreadItem;
import net.mcreator.createfactory.item.SpreadAppleItem;
import net.mcreator.createfactory.item.RubyChocolateRollItem;
import net.mcreator.createfactory.item.PressedSugarItem;
import net.mcreator.createfactory.item.PreparationItem;
import net.mcreator.createfactory.item.NectarItem;
import net.mcreator.createfactory.item.HoneyRollItem;
import net.mcreator.createfactory.item.DarkChocolateRollItem;
import net.mcreator.createfactory.item.CrushedSugarItem;
import net.mcreator.createfactory.item.CreamItem;
import net.mcreator.createfactory.item.ChocolatedAppleItem;
import net.mcreator.createfactory.item.ChocolateRollItem;
import net.mcreator.createfactory.item.CaramelRollItem;
import net.mcreator.createfactory.item.ButterItem;
import net.mcreator.createfactory.item.ButterCakeItem;
import net.mcreator.createfactory.item.BrownieItem;
import net.mcreator.createfactory.item.AppleJamRollItem;
import net.mcreator.createfactory.item.AppleJamItem;
import net.mcreator.createfactory.item.AppleJamButterCakeItem;
import net.mcreator.createfactory.CreateFactoryMod;

public class CreateFactoryModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, CreateFactoryMod.MODID);
	public static final RegistryObject<Item> HONEY_ROLL = REGISTRY.register("honey_roll", () -> new HoneyRollItem());
	public static final RegistryObject<Item> CHOCOLATE_ROLL = REGISTRY.register("chocolate_roll", () -> new ChocolateRollItem());
	public static final RegistryObject<Item> CHOCOLATED_APPLE = REGISTRY.register("chocolated_apple", () -> new ChocolatedAppleItem());
	public static final RegistryObject<Item> BROWNIE = REGISTRY.register("brownie", () -> new BrownieItem());
	public static final RegistryObject<Item> CAKE_PREPARATION = REGISTRY.register("cake_preparation", () -> new PreparationItem());
	public static final RegistryObject<Item> CRUSHED_SUGAR = REGISTRY.register("crushed_sugar", () -> new CrushedSugarItem());
	public static final RegistryObject<Item> WALNUT_BROWNIE = REGISTRY.register("walnut_brownie", () -> new WalnutBrownieItem());
	public static final RegistryObject<Item> SWEET_BERRIES_JAM_BUCKET = REGISTRY.register("sweet_berries_jam_bucket",
			() -> new SweetBerriesJamItem());
	public static final RegistryObject<Item> SPREAD_BUCKET = REGISTRY.register("spread_bucket", () -> new SpreadItem());
	public static final RegistryObject<Item> SPREAD_ROLL = REGISTRY.register("spread_roll", () -> new SpreadRollItem());
	public static final RegistryObject<Item> SWEET_BERRIES_JAM_ROLL = REGISTRY.register("sweet_berries_jam_roll",
			() -> new SweetBerriesJamRollItem());
	public static final RegistryObject<Item> SPREADED_APPLE = REGISTRY.register("spreaded_apple", () -> new SpreadAppleItem());
	public static final RegistryObject<Item> DARK_CHOCOLATE_ROLL = REGISTRY.register("dark_chocolate_roll", () -> new DarkChocolateRollItem());
	public static final RegistryObject<Item> WHITE_CHOCOLATE_ROLL = REGISTRY.register("white_chocolate_roll", () -> new WhiteChocolateRollItem());
	public static final RegistryObject<Item> RUBY_CHOCOLATE_ROLL = REGISTRY.register("ruby_chocolate_roll", () -> new RubyChocolateRollItem());
	public static final RegistryObject<Item> CARAMEL_ROLL = REGISTRY.register("caramel_roll", () -> new CaramelRollItem());
	public static final RegistryObject<Item> CREAM_BUCKET = REGISTRY.register("cream_bucket", () -> new CreamItem());
	public static final RegistryObject<Item> BUTTER = REGISTRY.register("butter", () -> new ButterItem());
	public static final RegistryObject<Item> NECTAR_BUCKET = REGISTRY.register("nectar_bucket", () -> new NectarItem());
	public static final RegistryObject<Item> PRESSED_SUGAR = REGISTRY.register("pressed_sugar", () -> new PressedSugarItem());
	public static final RegistryObject<Item> BUTTER_CAKE = REGISTRY.register("butter_cake", () -> new ButterCakeItem());
	public static final RegistryObject<Item> APPLE_JAM_BUCKET = REGISTRY.register("apple_jam_bucket", () -> new AppleJamItem());
	public static final RegistryObject<Item> APPLE_JAM_ROLL = REGISTRY.register("apple_jam_roll", () -> new AppleJamRollItem());
	public static final RegistryObject<Item> APPLE_JAM_BUTTER_CAKE = REGISTRY.register("apple_jam_butter_cake", () -> new AppleJamButterCakeItem());
	public static final RegistryObject<Item> SWEET_WHIPPED_CREAM_BUCKET = REGISTRY.register("sweet_whipped_cream_bucket",
			() -> new SweetWhippedCreamItem());
}
