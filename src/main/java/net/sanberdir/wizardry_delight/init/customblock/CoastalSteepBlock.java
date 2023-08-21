package net.sanberdir.wizardry_delight.init.customblock;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.FluidTags;
import net.minecraft.util.RandomSource;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.grower.MangroveTreeGrower;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.*;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.level.pathfinder.PathComputationType;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraftforge.common.IPlantable;
import net.minecraftforge.common.PlantType;

import javax.annotation.Nullable;

public class CoastalSteepBlock extends MangrovePropaguleBlock  {
    public CoastalSteepBlock(Properties p_57318_) {
        super(p_57318_);
    }
    @Override
    public VoxelShape getVisualShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
        return Shapes.empty();
    }

    @Override
    public boolean isBonemealSuccess(Level p_221463_, RandomSource p_221464_, BlockPos p_221465_, BlockState p_221466_) {
        return false;
    }

    @Override
    public boolean isValidBonemealTarget(BlockGetter p_221458_, BlockPos p_221459_, BlockState p_221460_, boolean p_221461_) {
        return false;
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
        return Shapes.or(box(0, 0, 0, 16, 16, 16), box(0, 0, 0, 16, 16, 16), box(0, 0, 0, 16, 16, 16), box(0, 0, 0, 16, 16, 16));
    }

    protected boolean mayPlaceOn(BlockState p_51042_, BlockGetter p_51043_, BlockPos p_51044_) {
        return p_51042_.is(BlockTags.SAND) || p_51042_.is(Blocks.RED_SAND);
    }
    @Override
    public PlantType getPlantType(BlockGetter level, BlockPos pos) {
        return PlantType.DESERT;
    }
}
