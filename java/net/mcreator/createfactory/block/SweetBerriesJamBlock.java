
package net.mcreator.createfactory.block;

import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.BlockPos;

import net.mcreator.createfactory.init.CreateFactoryModFluids;

public class SweetBerriesJamBlock extends LiquidBlock {
	public SweetBerriesJamBlock() {
		super(() -> (FlowingFluid) CreateFactoryModFluids.SWEET_BERRIES_JAM.get(), BlockBehaviour.Properties.of(Material.WATER).strength(150f)

		);
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
		return true;
	}
}
