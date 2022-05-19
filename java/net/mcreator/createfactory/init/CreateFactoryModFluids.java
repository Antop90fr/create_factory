
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.createfactory.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.mcreator.createfactory.fluid.SweetWhippedCreamFluid;
import net.mcreator.createfactory.fluid.SweetBerriesJamFluid;
import net.mcreator.createfactory.fluid.SpreadFluid;
import net.mcreator.createfactory.fluid.NectarFluid;
import net.mcreator.createfactory.fluid.CreamFluid;
import net.mcreator.createfactory.fluid.AppleJamFluid;
import net.mcreator.createfactory.CreateFactoryMod;

public class CreateFactoryModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(ForgeRegistries.FLUIDS, CreateFactoryMod.MODID);
	public static final RegistryObject<Fluid> SWEET_BERRIES_JAM = REGISTRY.register("sweet_berries_jam", () -> new SweetBerriesJamFluid.Source());
	public static final RegistryObject<Fluid> FLOWING_SWEET_BERRIES_JAM = REGISTRY.register("flowing_sweet_berries_jam",
			() -> new SweetBerriesJamFluid.Flowing());
	public static final RegistryObject<Fluid> SPREAD = REGISTRY.register("spread", () -> new SpreadFluid.Source());
	public static final RegistryObject<Fluid> FLOWING_SPREAD = REGISTRY.register("flowing_spread", () -> new SpreadFluid.Flowing());
	public static final RegistryObject<Fluid> CREAM = REGISTRY.register("cream", () -> new CreamFluid.Source());
	public static final RegistryObject<Fluid> FLOWING_CREAM = REGISTRY.register("flowing_cream", () -> new CreamFluid.Flowing());
	public static final RegistryObject<Fluid> NECTAR = REGISTRY.register("nectar", () -> new NectarFluid.Source());
	public static final RegistryObject<Fluid> FLOWING_NECTAR = REGISTRY.register("flowing_nectar", () -> new NectarFluid.Flowing());
	public static final RegistryObject<Fluid> APPLE_JAM = REGISTRY.register("apple_jam", () -> new AppleJamFluid.Source());
	public static final RegistryObject<Fluid> FLOWING_APPLE_JAM = REGISTRY.register("flowing_apple_jam", () -> new AppleJamFluid.Flowing());
	public static final RegistryObject<Fluid> SWEET_WHIPPED_CREAM = REGISTRY.register("sweet_whipped_cream",
			() -> new SweetWhippedCreamFluid.Source());
	public static final RegistryObject<Fluid> FLOWING_SWEET_WHIPPED_CREAM = REGISTRY.register("flowing_sweet_whipped_cream",
			() -> new SweetWhippedCreamFluid.Flowing());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(SWEET_BERRIES_JAM.get(), renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_SWEET_BERRIES_JAM.get(), renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(SPREAD.get(), renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_SPREAD.get(), renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(CREAM.get(), renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_CREAM.get(), renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(NECTAR.get(), renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_NECTAR.get(), renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(APPLE_JAM.get(), renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_APPLE_JAM.get(), renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(SWEET_WHIPPED_CREAM.get(), renderType -> renderType == RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_SWEET_WHIPPED_CREAM.get(), renderType -> renderType == RenderType.translucent());
		}
	}
}
