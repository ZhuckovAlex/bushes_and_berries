package net.sanberdir.wizardry_delight.init.customblock;

import net.minecraft.core.BlockPos;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.NetherWartBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.PlantType;
import net.sanberdir.wizardry_delight.init.InitItems;

public class WarpedWartBlock extends NetherWartBlock {
    public WarpedWartBlock(Properties p_54971_) {
        super(p_54971_);
    }
@Override
    public ItemStack getCloneItemStack(BlockGetter p_54973_, BlockPos p_54974_, BlockState p_54975_) {
        return new ItemStack(InitItems.WARPED_WART.get());
    }

    @Override
    public net.minecraftforge.common.PlantType getPlantType(BlockGetter world, BlockPos pos) {
        return PlantType.NETHER;
    }
}
