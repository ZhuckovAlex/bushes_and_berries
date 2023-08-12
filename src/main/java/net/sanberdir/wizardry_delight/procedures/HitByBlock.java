package net.sanberdir.wizardry_delight.procedures;


import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.level.BlockEvent;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;
import net.sanberdir.wizardry_delight.particle.ModParticles;

import javax.annotation.Nullable;

public class HitByBlock {

    public static void execute(LevelAccessor world, double x, double y, double z) {
        if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.GRASS) {
            world.setBlock(new BlockPos(x, y, z), Blocks.WHEAT.defaultBlockState(), 3);
            {
                int _value = 7;
                BlockPos _pos = new BlockPos(x, y, z);
                BlockState _bs = world.getBlockState(_pos);
                if (_bs.getBlock().getStateDefinition().getProperty("age") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
                    world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
            }
            if (world instanceof ServerLevel _level)
                _level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 10, 1, 1, 1, 0.2f);
        }
        if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.DANDELION) {
            world.setBlock(new BlockPos(x, y, z), Blocks.POTATOES.defaultBlockState(), 3);
            {
                int _value = 7;
                BlockPos _pos = new BlockPos(x, y, z);
                BlockState _bs = world.getBlockState(_pos);
                if (_bs.getBlock().getStateDefinition().getProperty("age") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
                    world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
            }
            if (world instanceof ServerLevel _level)
                _level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 10, 1, 1, 1, 0.2f);
        }
        if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.ORANGE_TULIP) {
            world.setBlock(new BlockPos(x, y, z), Blocks.CARROTS.defaultBlockState(), 3);
            {
                int _value = 7;
                BlockPos _pos = new BlockPos(x, y, z);
                BlockState _bs = world.getBlockState(_pos);
                if (_bs.getBlock().getStateDefinition().getProperty("age") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
                    world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
            }
            if (world instanceof ServerLevel _level)
                _level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 10, 1, 1, 1, 0.2f);
        }

        if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.RED_TULIP) {
            world.setBlock(new BlockPos(x, y, z), Blocks.BEETROOTS.defaultBlockState(), 3);
            {
                int _value = 3;
                BlockPos _pos = new BlockPos(x, y, z);
                BlockState _bs = world.getBlockState(_pos);
                if (_bs.getBlock().getStateDefinition().getProperty("age") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
                    world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
            }
            if (world instanceof ServerLevel _level)
                _level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 10, 1, 1, 1, 0.2f);
        }
        if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.POPPY) {
            world.setBlock(new BlockPos(x, y, z), Blocks.BEETROOTS.defaultBlockState(), 3);
            {
                int _value = 3;
                BlockPos _pos = new BlockPos(x, y, z);
                BlockState _bs = world.getBlockState(_pos);
                if (_bs.getBlock().getStateDefinition().getProperty("age") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
                    world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
            }
            if (world instanceof ServerLevel _level)
                _level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 10, 1, 1, 1, 0.2f);
        }

    }
}