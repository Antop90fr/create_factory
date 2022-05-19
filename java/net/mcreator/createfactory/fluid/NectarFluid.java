
package net.mcreator.createfactory.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.fluids.FluidAttributes;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.createfactory.init.CreateFactoryModItems;
import net.mcreator.createfactory.init.CreateFactoryModFluids;
import net.mcreator.createfactory.init.CreateFactoryModBlocks;

public abstract class NectarFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(CreateFactoryModFluids.NECTAR,
			CreateFactoryModFluids.FLOWING_NECTAR, FluidAttributes.builder(new ResourceLocation("create_factory:blocks/nectar_still"),
					new ResourceLocation("create_factory:blocks/nectar_flow"))

	).explosionResistance(100f)

			.tickRate(8)

			.bucket(CreateFactoryModItems.NECTAR_BUCKET).block(() -> (LiquidBlock) CreateFactoryModBlocks.NECTAR.get());

	private NectarFluid() {
		super(PROPERTIES);
	}

	@Override
	public Vec3 getFlow(BlockGetter world, BlockPos pos, FluidState fluidstate) {
		return super.getFlow(world, pos, fluidstate).scale(4.699999999999999);
	}

	public static class Source extends NectarFluid {
		public Source() {
			super();
		}

		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends NectarFluid {
		public Flowing() {
			super();
		}

		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
