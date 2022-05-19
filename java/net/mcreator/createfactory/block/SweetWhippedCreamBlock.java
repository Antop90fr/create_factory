
package net.mcreator.createfactory.block;

import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.BlockPos;

import net.mcreator.createfactory.init.CreateFactoryModFluids;

public class SweetWhippedCreamBlock extends LiquidBlock {
	public SweetWhippedCreamBlock() {
		super(() -> (FlowingFluid) CreateFactoryModFluids.SWEET_WHIPPED_CREAM.get(), BlockBehaviour.Properties.of(Material.WATER).strength(100f)

		);
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
		return true;
	}
}
