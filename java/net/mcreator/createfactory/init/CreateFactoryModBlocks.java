
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.createfactory.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.createfactory.block.SweetWhippedCreamBlock;
import net.mcreator.createfactory.block.SweetBerriesJamBlock;
import net.mcreator.createfactory.block.SpreadBlock;
import net.mcreator.createfactory.block.NectarBlock;
import net.mcreator.createfactory.block.CreamBlock;
import net.mcreator.createfactory.block.AppleJamBlock;
import net.mcreator.createfactory.CreateFactoryMod;

public class CreateFactoryModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, CreateFactoryMod.MODID);
	public static final RegistryObject<Block> SWEET_BERRIES_JAM = REGISTRY.register("sweet_berries_jam", () -> new SweetBerriesJamBlock());
	public static final RegistryObject<Block> SPREAD = REGISTRY.register("spread", () -> new SpreadBlock());
	public static final RegistryObject<Block> CREAM = REGISTRY.register("cream", () -> new CreamBlock());
	public static final RegistryObject<Block> NECTAR = REGISTRY.register("nectar", () -> new NectarBlock());
	public static final RegistryObject<Block> APPLE_JAM = REGISTRY.register("apple_jam", () -> new AppleJamBlock());
	public static final RegistryObject<Block> SWEET_WHIPPED_CREAM = REGISTRY.register("sweet_whipped_cream", () -> new SweetWhippedCreamBlock());
}
