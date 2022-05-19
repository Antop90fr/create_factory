
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

public abstract class SweetWhippedCreamFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(CreateFactoryModFluids.SWEET_WHIPPED_CREAM,
			CreateFactoryModFluids.FLOWING_SWEET_WHIPPED_CREAM,
			FluidAttributes
					.builder(new ResourceLocation("create_factory:blocks/sweet_whipped_cream_still"),
							new ResourceLocation("create_factory:blocks/sweet_whipped_cream_flow"))

					.viscosity(2500)

	).explosionResistance(100f)

			.tickRate(40)

			.bucket(CreateFactoryModItems.SWEET_WHIPPED_CREAM_BUCKET).block(() -> (LiquidBlock) CreateFactoryModBlocks.SWEET_WHIPPED_CREAM.get());

	private SweetWhippedCreamFluid() {
		super(PROPERTIES);
	}

	@Override
	public Vec3 getFlow(BlockGetter world, BlockPos pos, FluidState fluidstate) {
		return super.getFlow(world, pos, fluidstate).scale(1.1);
	}

	public static class Source extends SweetWhippedCreamFluid {
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

	public static class Flowing extends SweetWhippedCreamFluid {
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
