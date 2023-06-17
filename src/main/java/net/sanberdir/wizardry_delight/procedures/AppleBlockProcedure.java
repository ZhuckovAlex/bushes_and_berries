package net.sanberdir.wizardry_delight.procedures;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;
import net.sanberdir.wizardry_delight.init.InitBlocks;

public class AppleBlockProcedure {

    public static void execute(LevelAccessor world, double x, double y, double z) {
            if (Math.random() <= 0.4) {
                    if ((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.AIR) {
                        world.setBlock(new BlockPos(x, y - 1, z), InitBlocks.APPLE_BLOCK.get().defaultBlockState(), 3);
            }
        }
    }
}
