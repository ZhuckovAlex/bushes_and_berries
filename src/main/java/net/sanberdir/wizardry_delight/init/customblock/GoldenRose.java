package net.sanberdir.wizardry_delight.init.customblock;

import net.minecraft.client.renderer.BiomeColors;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.RandomSource;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.GrassColor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.event.RegisterColorHandlersEvent;
import net.minecraftforge.common.PlantType;
import net.sanberdir.wizardry_delight.init.InitBlocks;

public class GoldenRose extends Block implements net.minecraftforge.common.IPlantable {


    public GoldenRose(Properties p_49795_) {
        super(p_49795_);
    }


    public boolean canSurvive(BlockState p_57175_, LevelReader p_57176_, BlockPos p_57177_) {
        BlockState soil = p_57176_.getBlockState(p_57177_.below());

        BlockState blockstate = p_57176_.getBlockState(p_57177_.below());
        if (blockstate.is(this)) {
            return false;
        } else {
            if (blockstate.is(Blocks.SOUL_SOIL)||blockstate.is(Blocks.SOUL_SAND)|| blockstate.is(BlockTags.NYLIUM)|| blockstate.is(BlockTags.SAND)||blockstate.is(Blocks.DIRT)||blockstate.is(Blocks.GRASS_BLOCK)) {
                BlockPos blockpos = p_57177_.below();

                return true;
            }
            return false;
        }
    }
    @Override
    public net.minecraftforge.common.PlantType getPlantType(BlockGetter world, BlockPos pos) {
        return PlantType.PLAINS;
    }

    public void animateTick(BlockState p_222687_, Level p_222688_, BlockPos p_222689_, RandomSource p_222690_) {
        VoxelShape voxelshape = this.getShape(p_222687_, p_222688_, p_222689_, CollisionContext.empty());
        Vec3 vec3 = voxelshape.bounds().getCenter();
        double d0 = (double)p_222689_.getX() + vec3.x;
        double d1 = (double)p_222689_.getZ() + vec3.z;

        for(int i = 0; i < 3; ++i) {
            if (p_222690_.nextBoolean()) {
                p_222688_.addParticle(ParticleTypes.HAPPY_VILLAGER, d0 + p_222690_.nextDouble() / 5.0D, (double)p_222689_.getY() + (0.5D - p_222690_.nextDouble()), d1 + p_222690_.nextDouble() / 5.0D, 0.0D, 0.0D, 0.0D);
            }
        }

    }

    public void entityInside(BlockState p_58238_, Level p_58239_, BlockPos p_58240_, Entity p_58241_) {
        if (!p_58239_.isClientSide ) {
            if (p_58241_ instanceof LivingEntity) {
                LivingEntity livingentity = (LivingEntity)p_58241_;
                    livingentity.addEffect(new MobEffectInstance(MobEffects.HEAL, 10));
            }
        }
    }


    @Override
    public BlockState getPlant(BlockGetter world, BlockPos pos) {
        return defaultBlockState();
    }
}
