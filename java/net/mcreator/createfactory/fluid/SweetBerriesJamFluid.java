
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

public abstract class SweetBerriesJamFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(CreateFactoryModFluids.SWEET_BERRIES_JAM,
			CreateFactoryModFluids.FLOWING_SWEET_BERRIES_JAM,
			FluidAttributes
					.builder(new ResourceLocation("create_factory:blocks/sweet_berries_jam_still"),
							new ResourceLocation("create_factory:blocks/sweet_berries_jam_flow"))

					.viscosity(1014)

	).explosionResistance(150f)

			.tickRate(12)

			.bucket(CreateFactoryModItems.SWEET_BERRIES_JAM_BUCKET).block(() -> (LiquidBlock) CreateFactoryModBlocks.SWEET_BERRIES_JAM.get());

	private SweetBerriesJamFluid() {
		super(PROPERTIES);
	}

	@Override
	public Vec3 getFlow(BlockGetter world, BlockPos pos, FluidState fluidstate) {
		return super.getFlow(world, pos, fluidstate).scale(1.5);
	}

	public static class Source extends SweetBerriesJamFluid {
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

	public static class Flowing extends SweetBerriesJamFluid {
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
