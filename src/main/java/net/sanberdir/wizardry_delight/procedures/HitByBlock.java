package net.sanberdir.wizardry_delight.procedures;


import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.animal.Cow;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
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
import net.sanberdir.wizardry_delight.entity.custom.StarBall;
import net.sanberdir.wizardry_delight.init.InitBlocks;
import net.sanberdir.wizardry_delight.init.InitItems;
import net.sanberdir.wizardry_delight.particle.ModParticles;
import vectorwing.farmersdelight.common.registry.ModBlocks;
import vectorwing.farmersdelight.common.registry.ModItems;

import javax.annotation.Nullable;

public class HitByBlock {

    public static void execute(LevelAccessor world, double x, double y, double z, BlockState blockstate) {

        if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == InitBlocks.COASTAL_STEEP.get()) {
            world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
            if (Math.random() < 0.15) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.STRING));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
            }
            if (world instanceof Level _level && !_level.isClientSide()) {
                ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItems.KRUTNEVY_BREAD.get(),3));
                entityToSpawn.setPickUpDelay(10);
                _level.addFreshEntity(entityToSpawn);

            }
            {
                int _value = 7;
                BlockPos _pos = new BlockPos(x, y, z);
                BlockState _bs = world.getBlockState(_pos);
                if (_bs.getBlock().getStateDefinition().getProperty("age") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
                    world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
            }
            if (world instanceof ServerLevel _level)
                _level.sendParticles(ModParticles.ROBIN_STAR_PARTICLES_PROJECTILE.get(), x, y, z, 36, 0.5, 0.5, 0.5, 0.05f);
            if (Math.random() < 0.15) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItems.SPARKLING_POLLEN.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
            }
        }

        if (((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.COCOA)
                &&((blockstate.getBlock().getStateDefinition().getProperty("age") instanceof IntegerProperty _getip1 ? blockstate.getValue(_getip1) : -1) >= 2)) {
            world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);

                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(ModItems.HOT_COCOA.get(),2));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
            {
                int _value = 7;
                BlockPos _pos = new BlockPos(x, y, z);
                BlockState _bs = world.getBlockState(_pos);
                if (_bs.getBlock().getStateDefinition().getProperty("age") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
                    world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
            }
            if (world instanceof ServerLevel _level)
                _level.sendParticles(ModParticles.ROBIN_STAR_PARTICLES_PROJECTILE.get(), x, y, z, 36, 0.5, 0.5, 0.5, 0.05f);
            if (Math.random() < 0.15) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItems.SPARKLING_POLLEN.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
            }
        }

        if (((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.BEE_NEST)) {
            world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);

            if (world instanceof Level _level && !_level.isClientSide()) {
                ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.HONEY_BOTTLE,5));
                entityToSpawn.setPickUpDelay(10);
                _level.addFreshEntity(entityToSpawn);
            }
            {
                int _value = 7;
                BlockPos _pos = new BlockPos(x, y, z);
                BlockState _bs = world.getBlockState(_pos);
                if (_bs.getBlock().getStateDefinition().getProperty("age") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
                    world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
            }
            if (world instanceof ServerLevel _level)
                _level.sendParticles(ModParticles.ROBIN_STAR_PARTICLES_PROJECTILE.get(), x, y, z, 36, 0.5, 0.5, 0.5, 0.05f);
            if (Math.random() < 0.15) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItems.SPARKLING_POLLEN.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
            }
        }

        if (((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.HONEYCOMB_BLOCK)) {
            world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);

            if (world instanceof Level _level && !_level.isClientSide()) {
                ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.HONEY_BOTTLE,5));
                entityToSpawn.setPickUpDelay(10);
                _level.addFreshEntity(entityToSpawn);
            }
            {
                int _value = 7;
                BlockPos _pos = new BlockPos(x, y, z);
                BlockState _bs = world.getBlockState(_pos);
                if (_bs.getBlock().getStateDefinition().getProperty("age") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
                    world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
            }
            if (world instanceof ServerLevel _level)
                _level.sendParticles(ModParticles.ROBIN_STAR_PARTICLES_PROJECTILE.get(), x, y, z, 36, 0.5, 0.5, 0.5, 0.05f);
            if (Math.random() < 0.15) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItems.SPARKLING_POLLEN.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
            }
        }

        if (((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.OXEYE_DAISY)) {
            world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);

            if (world instanceof Level _level && !_level.isClientSide()) {

                ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.HONEY_BOTTLE));

                entityToSpawn.setPickUpDelay(10);
                _level.addFreshEntity(entityToSpawn);
            }
            if (Math.random() < 0.15) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.SUGAR));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
            }
            {
                int _value = 7;
                BlockPos _pos = new BlockPos(x, y, z);
                BlockState _bs = world.getBlockState(_pos);
                if (_bs.getBlock().getStateDefinition().getProperty("age") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
                    world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
            }
            if (world instanceof ServerLevel _level)
                _level.sendParticles(ModParticles.ROBIN_STAR_PARTICLES_PROJECTILE.get(), x, y, z, 36, 0.5, 0.5, 0.5, 0.05f);
            if (Math.random() < 0.15) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItems.SPARKLING_POLLEN.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
            }
        }

        if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.GRASS) {
            world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
            if (world instanceof Level _level && !_level.isClientSide()) {
                ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.WHEAT));
                entityToSpawn.setPickUpDelay(10);
                _level.addFreshEntity(entityToSpawn);
            }
            {
                int _value = 7;
                BlockPos _pos = new BlockPos(x, y, z);
                BlockState _bs = world.getBlockState(_pos);
                if (_bs.getBlock().getStateDefinition().getProperty("age") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
                    world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
            }
            if (world instanceof ServerLevel _level)
                _level.sendParticles(ModParticles.ROBIN_STAR_PARTICLES_PROJECTILE.get(), x, y, z, 36, 0.5, 0.5, 0.5, 0.05f);
            if (Math.random() < 0.15) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItems.SPARKLING_POLLEN.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
            }
        }
        if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.DANDELION) {
            world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
            if (world instanceof Level _level && !_level.isClientSide()) {
                ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.POTATO, 3));
                entityToSpawn.setPickUpDelay(10);
                _level.addFreshEntity(entityToSpawn);
            }

            {
                int _value = 7;
                BlockPos _pos = new BlockPos(x, y, z);
                BlockState _bs = world.getBlockState(_pos);
                if (_bs.getBlock().getStateDefinition().getProperty("age") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
                    world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
            }
            if (world instanceof ServerLevel _level)
                _level.sendParticles(ModParticles.ROBIN_STAR_PARTICLES_PROJECTILE.get(), x, y, z, 36, 0.5, 0.5, 0.5, 0.05f);
            if (Math.random() < 0.15) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItems.SPARKLING_POLLEN.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
            }
            return;
        }

        if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.ORANGE_TULIP) {
            world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
            if (world instanceof Level _level && !_level.isClientSide()) {
                ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.CARROT,3));
                entityToSpawn.setPickUpDelay(10);
                _level.addFreshEntity(entityToSpawn);
            }
            {
                int _value = 7;
                BlockPos _pos = new BlockPos(x, y, z);
                BlockState _bs = world.getBlockState(_pos);
                if (_bs.getBlock().getStateDefinition().getProperty("age") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
                    world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
            }
            if (world instanceof ServerLevel _level)
                _level.sendParticles(ModParticles.ROBIN_STAR_PARTICLES_PROJECTILE.get(), x, y, z, 36, 0.5, 0.5, 0.5, 0.05f);
            if (Math.random() < 0.15) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItems.SPARKLING_POLLEN.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
            }

        }

        if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.RED_TULIP) {
            world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
            if (world instanceof Level _level && !_level.isClientSide()) {
                ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.BEETROOT,3));
                entityToSpawn.setPickUpDelay(10);
                _level.addFreshEntity(entityToSpawn);
            }
            {
                int _value = 3;
                BlockPos _pos = new BlockPos(x, y, z);
                BlockState _bs = world.getBlockState(_pos);
                if (_bs.getBlock().getStateDefinition().getProperty("age") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
                    world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
            }
            if (world instanceof ServerLevel _level)
                _level.sendParticles(ModParticles.ROBIN_STAR_PARTICLES_PROJECTILE.get(), x, y, z, 36, 0.5, 0.5, 0.5, 0.05f);
            if (Math.random() < 0.15) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItems.SPARKLING_POLLEN.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
            }
        }
        if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.POPPY) {
            world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
            if (world instanceof Level _level && !_level.isClientSide()) {
                ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.BEETROOT, 3));
                entityToSpawn.setPickUpDelay(10);
                _level.addFreshEntity(entityToSpawn);
            }
            {
                int _value = 3;
                BlockPos _pos = new BlockPos(x, y, z);
                BlockState _bs = world.getBlockState(_pos);
                if (_bs.getBlock().getStateDefinition().getProperty("age") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
                    world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
            }
            if (world instanceof ServerLevel _level)
                _level.sendParticles(ModParticles.ROBIN_STAR_PARTICLES_PROJECTILE.get(), x, y, z, 36, 0.5, 0.5, 0.5, 0.05f);
            if (Math.random() < 0.15) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItems.SPARKLING_POLLEN.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
            }
        }

        if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.PUMPKIN)
            {
                world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);

                if (world instanceof Level _level && !_level.isClientSide()) {
                ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.PUMPKIN_PIE,3));
                entityToSpawn.setPickUpDelay(10);
                _level.addFreshEntity(entityToSpawn);
            }
                if (Math.random() < 0.50) {
                    if (world instanceof Level _level && !_level.isClientSide()) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(ModItems.PUMPKIN_SLICE.get(),2));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                    }
                    if (Math.random() < 0.50) {
                        if (world instanceof Level _level && !_level.isClientSide()) {
                            ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(ModItems.PUMPKIN_SOUP.get()));
                            entityToSpawn.setPickUpDelay(10);
                            _level.addFreshEntity(entityToSpawn);
                        }
                        if (Math.random() < 0.50) {
                            if (world instanceof Level _level && !_level.isClientSide()) {
                                ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(ModItems.PUMPKIN_SLICE.get()));
                                entityToSpawn.setPickUpDelay(10);
                                _level.addFreshEntity(entityToSpawn);
                            }
                        }
                    }
                }
            {
                int _value = 3;
                BlockPos _pos = new BlockPos(x, y, z);
                BlockState _bs = world.getBlockState(_pos);
                if (_bs.getBlock().getStateDefinition().getProperty("age") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
                    world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
            }
            if (world instanceof ServerLevel _level)
                _level.sendParticles(ModParticles.ROBIN_STAR_PARTICLES_PROJECTILE.get(), x, y, z, 36, 0.5, 0.5, 0.5, 0.05f);
            if (Math.random() < 0.15) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItems.SPARKLING_POLLEN.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
            }
        }

        if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == InitBlocks.APPLE_BLOCK.get())
        {
            world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);

            if (world instanceof Level _level && !_level.isClientSide()) {
                ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(ModItems.APPLE_PIE.get()));
                entityToSpawn.setPickUpDelay(10);
                _level.addFreshEntity(entityToSpawn);
            }
            if (Math.random() < 0.75) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(ModItems.APPLE_PIE.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
            }
            {
                int _value = 3;
                BlockPos _pos = new BlockPos(x, y, z);
                BlockState _bs = world.getBlockState(_pos);
                if (_bs.getBlock().getStateDefinition().getProperty("age") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
                    world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
            }
            if (world instanceof ServerLevel _level)
                _level.sendParticles(ModParticles.ROBIN_STAR_PARTICLES_PROJECTILE.get(), x, y, z, 36, 0.5, 0.5, 0.5, 0.05f);
            if (Math.random() < 0.15) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItems.SPARKLING_POLLEN.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
            }
        }

        if (((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.SWEET_BERRY_BUSH)
                &&((blockstate.getBlock().getStateDefinition().getProperty("age") instanceof IntegerProperty _getip1 ? blockstate.getValue(_getip1) : -1) >= 3))
        {
            world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);

            if (world instanceof Level _level && !_level.isClientSide()) {
                ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(ModItems.SWEET_BERRY_CHEESECAKE.get()));
                entityToSpawn.setPickUpDelay(10);
                _level.addFreshEntity(entityToSpawn);
            }
            if (Math.random() < 0.75) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(ModItems.SWEET_BERRY_CHEESECAKE.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
            }
            {
                int _value = 3;
                BlockPos _pos = new BlockPos(x, y, z);
                BlockState _bs = world.getBlockState(_pos);
                if (_bs.getBlock().getStateDefinition().getProperty("age") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
                    world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
            }
            if (world instanceof ServerLevel _level)
                _level.sendParticles(ModParticles.ROBIN_STAR_PARTICLES_PROJECTILE.get(), x, y, z, 36, 0.5, 0.5, 0.5, 0.05f);
            if (Math.random() < 0.15) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItems.SPARKLING_POLLEN.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
            }
        }

        if (((world.getBlockState(new BlockPos(x, y, z))).getBlock() == InitBlocks.CHARNIKA.get())
                &&((blockstate.getBlock().getStateDefinition().getProperty("age") instanceof IntegerProperty _getip1 ? blockstate.getValue(_getip1) : -1) >= 3))
        {
            world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);

            if (world instanceof Level _level && !_level.isClientSide()) {
                ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItems.CHARNIKA_JAM.get(),2));
                entityToSpawn.setPickUpDelay(10);
                _level.addFreshEntity(entityToSpawn);
            }
            if (Math.random() < 0.75) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItems.CHARNIKA_JAM.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
            }
            {
                int _value = 3;
                BlockPos _pos = new BlockPos(x, y, z);
                BlockState _bs = world.getBlockState(_pos);
                if (_bs.getBlock().getStateDefinition().getProperty("age") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
                    world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
            }
            if (world instanceof ServerLevel _level)
                _level.sendParticles(ModParticles.ROBIN_STAR_PARTICLES_PROJECTILE.get(), x, y, z, 36, 0.5, 0.5, 0.5, 0.05f);
            if (Math.random() < 0.15) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItems.SPARKLING_POLLEN.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
            }
        }

        if (((world.getBlockState(new BlockPos(x, y, z))).getBlock() == InitBlocks.YADOGA.get())
                &&((blockstate.getBlock().getStateDefinition().getProperty("age") instanceof IntegerProperty _getip1 ? blockstate.getValue(_getip1) : -1) >= 3))
        {
            world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);

            if (world instanceof Level _level && !_level.isClientSide()) {
                ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItems.YADOGA_JAM.get(),2));
                entityToSpawn.setPickUpDelay(10);
                _level.addFreshEntity(entityToSpawn);
            }
            if (Math.random() < 0.75) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItems.YADOGA_JAM.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
            }
            {
                int _value = 3;
                BlockPos _pos = new BlockPos(x, y, z);
                BlockState _bs = world.getBlockState(_pos);
                if (_bs.getBlock().getStateDefinition().getProperty("age") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
                    world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
            }
            if (world instanceof ServerLevel _level)
                _level.sendParticles(ModParticles.ROBIN_STAR_PARTICLES_PROJECTILE.get(), x, y, z, 36, 0.5, 0.5, 0.5, 0.05f);
            if (Math.random() < 0.15) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItems.SPARKLING_POLLEN.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
            }
        }

        if (((world.getBlockState(new BlockPos(x, y, z))).getBlock() == InitBlocks.FREEZE_BERRIES.get())
                &&((blockstate.getBlock().getStateDefinition().getProperty("age") instanceof IntegerProperty _getip1 ? blockstate.getValue(_getip1) : -1) >= 3))
        {
            world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);

            if (world instanceof Level _level && !_level.isClientSide()) {
                ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItems.FREEZE_JAM.get(),2));
                entityToSpawn.setPickUpDelay(10);
                _level.addFreshEntity(entityToSpawn);
            }
            if (Math.random() < 0.75) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItems.FREEZE_JAM.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
            }
            {
                int _value = 3;
                BlockPos _pos = new BlockPos(x, y, z);
                BlockState _bs = world.getBlockState(_pos);
                if (_bs.getBlock().getStateDefinition().getProperty("age") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
                    world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
            }
            if (world instanceof ServerLevel _level)
                _level.sendParticles(ModParticles.ROBIN_STAR_PARTICLES_PROJECTILE.get(), x, y, z, 36, 0.5, 0.5, 0.5, 0.05f);
            if (Math.random() < 0.15) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItems.SPARKLING_POLLEN.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
            }
        }

        if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.KELP)
        {
            world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);

            if (world instanceof Level _level && !_level.isClientSide()) {
                ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(ModItems.KELP_ROLL.get(),2));
                entityToSpawn.setPickUpDelay(10);
                _level.addFreshEntity(entityToSpawn);
            }
            if (Math.random() < 0.75) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(ModItems.KELP_ROLL.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
            }
            {
                int _value = 3;
                BlockPos _pos = new BlockPos(x, y, z);
                BlockState _bs = world.getBlockState(_pos);
                if (_bs.getBlock().getStateDefinition().getProperty("age") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
                    world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
            }
            if (world instanceof ServerLevel _level)
                _level.sendParticles(ModParticles.ROBIN_STAR_PARTICLES_PROJECTILE.get(), x, y, z, 36, 0.5, 0.5, 0.5, 0.05f);
            if (Math.random() < 0.15) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItems.SPARKLING_POLLEN.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
            }
        }

        if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.CAVE_VINES)
        {
            world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);

            if (world instanceof Level _level && !_level.isClientSide()) {
                ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(ModItems.GLOW_BERRY_CUSTARD.get(),2));
                entityToSpawn.setPickUpDelay(10);
                _level.addFreshEntity(entityToSpawn);
            }
            if (Math.random() < 0.75) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(ModItems.GLOW_BERRY_CUSTARD.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
            }
            {
                int _value = 3;
                BlockPos _pos = new BlockPos(x, y, z);
                BlockState _bs = world.getBlockState(_pos);
                if (_bs.getBlock().getStateDefinition().getProperty("age") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
                    world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
            }
            if (world instanceof ServerLevel _level)
                _level.sendParticles(ModParticles.ROBIN_STAR_PARTICLES_PROJECTILE.get(), x, y, z, 36, 0.5, 0.5, 0.5, 0.05f);
            if (Math.random() < 0.15) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItems.SPARKLING_POLLEN.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
            }
        }

        if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.CARVED_PUMPKIN)
        {
            world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);

            if (world instanceof Level _level && !_level.isClientSide()) {
                ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(ModItems.PUMPKIN_SLICE.get()));
                entityToSpawn.setPickUpDelay(10);
                _level.addFreshEntity(entityToSpawn);
            }
            if (Math.random() < 0.15) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(ModItems.STUFFED_PUMPKIN_BLOCK.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
            }
            {
                int _value = 3;
                BlockPos _pos = new BlockPos(x, y, z);
                BlockState _bs = world.getBlockState(_pos);
                if (_bs.getBlock().getStateDefinition().getProperty("age") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
                    world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
            }
            if (world instanceof ServerLevel _level)
                _level.sendParticles(ModParticles.ROBIN_STAR_PARTICLES_PROJECTILE.get(), x, y, z, 36, 0.5, 0.5, 0.5, 0.05f);
            if (Math.random() < 0.15) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItems.SPARKLING_POLLEN.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
            }
        }

        if (((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.WHEAT)
                &&((blockstate.getBlock().getStateDefinition().getProperty("age") instanceof IntegerProperty _getip1 ? blockstate.getValue(_getip1) : -1) == 7))
        {
            world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);

            if (world instanceof Level _level && !_level.isClientSide()) {
                ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.BREAD,2));
                entityToSpawn.setPickUpDelay(10);
                _level.addFreshEntity(entityToSpawn);
            }
            {
                int _value = 3;
                BlockPos _pos = new BlockPos(x, y, z);
                BlockState _bs = world.getBlockState(_pos);
                if (_bs.getBlock().getStateDefinition().getProperty("age") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
                    world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
            }
            if (world instanceof ServerLevel _level)
                _level.sendParticles(ModParticles.ROBIN_STAR_PARTICLES_PROJECTILE.get(), x, y, z, 36, 0.5, 0.5, 0.5, 0.05f);
            if (Math.random() < 0.15) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItems.SPARKLING_POLLEN.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
            }
        }

        if (((world.getBlockState(new BlockPos(x, y, z))).getBlock() == ModBlocks.WILD_TOMATOES.get())
               ||((world.getBlockState(new BlockPos(x, y, z))).getBlock() == ModBlocks.TOMATO_CROP.get())
                &&((blockstate.getBlock().getStateDefinition().getProperty("age") instanceof IntegerProperty _getip1 ? blockstate.getValue(_getip1) : -1) == 3))
        {
            world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);

            if (world instanceof Level _level && !_level.isClientSide()) {
                ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(ModItems.TOMATO_SAUCE.get(),2));
                entityToSpawn.setPickUpDelay(10);
                _level.addFreshEntity(entityToSpawn);
            }
            if (Math.random() < 0.15) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(ModItems.TOMATO_SAUCE.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
            }
            {
                int _value = 3;
                BlockPos _pos = new BlockPos(x, y, z);
                BlockState _bs = world.getBlockState(_pos);
                if (_bs.getBlock().getStateDefinition().getProperty("age") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
                    world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
            }
            if (world instanceof ServerLevel _level)
                _level.sendParticles(ModParticles.ROBIN_STAR_PARTICLES_PROJECTILE.get(), x, y, z, 36, 0.5, 0.5, 0.5, 0.05f);
            if (Math.random() < 0.15) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItems.SPARKLING_POLLEN.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
            }
        }

        if (((world.getBlockState(new BlockPos(x, y, z))).getBlock() == ModBlocks.WILD_ONIONS.get())
                ||((world.getBlockState(new BlockPos(x, y, z))).getBlock() == ModBlocks.ONION_CROP.get())
                &&((blockstate.getBlock().getStateDefinition().getProperty("age") instanceof IntegerProperty _getip1 ? blockstate.getValue(_getip1) : -1) == 7))
        {
            world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);

            if (world instanceof Level _level && !_level.isClientSide()) {
                ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(ModItems.MIXED_SALAD.get(),2));
                entityToSpawn.setPickUpDelay(10);
                _level.addFreshEntity(entityToSpawn);
            }
            if (Math.random() < 0.15) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(ModItems.MIXED_SALAD.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
            }
            {
                int _value = 3;
                BlockPos _pos = new BlockPos(x, y, z);
                BlockState _bs = world.getBlockState(_pos);
                if (_bs.getBlock().getStateDefinition().getProperty("age") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
                    world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
            }
            if (world instanceof ServerLevel _level)
                _level.sendParticles(ModParticles.ROBIN_STAR_PARTICLES_PROJECTILE.get(), x, y, z, 36, 0.5, 0.5, 0.5, 0.05f);
            if (Math.random() < 0.15) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItems.SPARKLING_POLLEN.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
            }
        }

        if (((world.getBlockState(new BlockPos(x, y, z))).getBlock() == ModBlocks.WILD_CABBAGES.get())
                ||((world.getBlockState(new BlockPos(x, y, z))).getBlock() == ModBlocks.CABBAGE_CROP.get())
                &&((blockstate.getBlock().getStateDefinition().getProperty("age") instanceof IntegerProperty _getip1 ? blockstate.getValue(_getip1) : -1) == 7))
        {
            world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);

            if (world instanceof Level _level && !_level.isClientSide()) {
                ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(ModItems.CABBAGE_ROLLS.get(),2));
                entityToSpawn.setPickUpDelay(10);
                _level.addFreshEntity(entityToSpawn);
            }
            if (Math.random() < 0.15) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(ModItems.CABBAGE_ROLLS.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
            }
            {
                int _value = 3;
                BlockPos _pos = new BlockPos(x, y, z);
                BlockState _bs = world.getBlockState(_pos);
                if (_bs.getBlock().getStateDefinition().getProperty("age") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
                    world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
            }
            if (world instanceof ServerLevel _level)
                _level.sendParticles(ModParticles.ROBIN_STAR_PARTICLES_PROJECTILE.get(), x, y, z, 36, 0.5, 0.5, 0.5, 0.05f);
            if (Math.random() < 0.15) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItems.SPARKLING_POLLEN.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
            }
        }

        if (((world.getBlockState(new BlockPos(x, y, z))).getBlock() == ModBlocks.WILD_BEETROOTS.get())
                ||((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.BEETROOTS)
                &&((blockstate.getBlock().getStateDefinition().getProperty("age") instanceof IntegerProperty _getip1 ? blockstate.getValue(_getip1) : -1) == 3))
        {
            world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);

            if (world instanceof Level _level && !_level.isClientSide()) {
                ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.BEETROOT_SOUP));
                entityToSpawn.setPickUpDelay(10);
                _level.addFreshEntity(entityToSpawn);
            }
            if (Math.random() < 0.15) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.BEETROOT_SOUP));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
            }
            {
                int _value = 3;
                BlockPos _pos = new BlockPos(x, y, z);
                BlockState _bs = world.getBlockState(_pos);
                if (_bs.getBlock().getStateDefinition().getProperty("age") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
                    world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
            }
            if (world instanceof ServerLevel _level)
                _level.sendParticles(ModParticles.ROBIN_STAR_PARTICLES_PROJECTILE.get(), x, y, z, 36, 0.5, 0.5, 0.5, 0.05f);
            if (Math.random() < 0.15) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItems.SPARKLING_POLLEN.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
            }
        }

        if (((world.getBlockState(new BlockPos(x, y, z))).getBlock() == ModBlocks.WILD_POTATOES.get())
                ||((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.POTATOES)
                &&((blockstate.getBlock().getStateDefinition().getProperty("age") instanceof IntegerProperty _getip1 ? blockstate.getValue(_getip1) : -1) == 7))
        {
            world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);

            if (world instanceof Level _level && !_level.isClientSide()) {
                ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(ModItems.STUFFED_POTATO.get(),2));
                entityToSpawn.setPickUpDelay(10);
                _level.addFreshEntity(entityToSpawn);
            }
            if (Math.random() < 0.15) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(ModItems.STUFFED_POTATO.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
            }
            {
                int _value = 3;
                BlockPos _pos = new BlockPos(x, y, z);
                BlockState _bs = world.getBlockState(_pos);
                if (_bs.getBlock().getStateDefinition().getProperty("age") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
                    world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
            }
            if (world instanceof ServerLevel _level)
                _level.sendParticles(ModParticles.ROBIN_STAR_PARTICLES_PROJECTILE.get(), x, y, z, 36, 0.5, 0.5, 0.5, 0.05f);
            if (Math.random() < 0.15) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItems.SPARKLING_POLLEN.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
            }
        }

        if (((world.getBlockState(new BlockPos(x, y, z))).getBlock() == ModBlocks.WILD_CARROTS.get())
                ||((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.CARROTS)
                &&((blockstate.getBlock().getStateDefinition().getProperty("age") instanceof IntegerProperty _getip1 ? blockstate.getValue(_getip1) : -1) == 7))
        {
            world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);

            if (world instanceof Level _level && !_level.isClientSide()) {
                ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.GOLDEN_CARROT,2));
                entityToSpawn.setPickUpDelay(10);
                _level.addFreshEntity(entityToSpawn);
            }
            if (Math.random() < 0.45) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.GOLDEN_CARROT));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
            }
            {
                int _value = 3;
                BlockPos _pos = new BlockPos(x, y, z);
                BlockState _bs = world.getBlockState(_pos);
                if (_bs.getBlock().getStateDefinition().getProperty("age") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
                    world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
            }
            if (world instanceof ServerLevel _level)
                _level.sendParticles(ModParticles.ROBIN_STAR_PARTICLES_PROJECTILE.get(), x, y, z, 36, 0.5, 0.5, 0.5, 0.05f);
            if (Math.random() < 0.15) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItems.SPARKLING_POLLEN.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
            }
        }


        if (((world.getBlockState(new BlockPos(x, y, z))).getBlock() == ModBlocks.WILD_RICE.get())
                ||((world.getBlockState(new BlockPos(x, y, z))).getBlock() == ModBlocks.RICE_CROP.get())
                &&((blockstate.getBlock().getStateDefinition().getProperty("age") instanceof IntegerProperty _getip1 ? blockstate.getValue(_getip1) : -1) == 3))
        {
            world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);

            if (world instanceof Level _level && !_level.isClientSide()) {
                ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(ModItems.FRIED_RICE.get(),2));
                entityToSpawn.setPickUpDelay(10);
                _level.addFreshEntity(entityToSpawn);
            }
            if (Math.random() < 0.15) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(ModItems.FRIED_RICE.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
            }
            {
                int _value = 3;
                BlockPos _pos = new BlockPos(x, y, z);
                BlockState _bs = world.getBlockState(_pos);
                if (_bs.getBlock().getStateDefinition().getProperty("age") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
                    world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
            }
            if (world instanceof ServerLevel _level)
                _level.sendParticles(ModParticles.ROBIN_STAR_PARTICLES_PROJECTILE.get(), x, y, z, 36, 0.5, 0.5, 0.5, 0.05f);
            if (Math.random() < 0.15) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItems.SPARKLING_POLLEN.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
            }
        }

        if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.MELON)
        {
            world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);

            if (world instanceof Level _level && !_level.isClientSide()) {
                ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.MELON_SLICE));
                entityToSpawn.setPickUpDelay(10);
                _level.addFreshEntity(entityToSpawn);
            }
            if (Math.random() < 0.75) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(ModItems.MELON_JUICE.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
                if (Math.random() < 0.75) {
                    if (world instanceof Level _level && !_level.isClientSide()) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(ModItems.MELON_POPSICLE.get()));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                    }
                }
            }
            {
                int _value = 3;
                BlockPos _pos = new BlockPos(x, y, z);
                BlockState _bs = world.getBlockState(_pos);
                if (_bs.getBlock().getStateDefinition().getProperty("age") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
                    world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
            }
            if (world instanceof ServerLevel _level)
                _level.sendParticles(ModParticles.ROBIN_STAR_PARTICLES_PROJECTILE.get(), x, y, z, 36, 0.5, 0.5, 0.5, 0.05f);
            if (Math.random() < 0.15) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItems.SPARKLING_POLLEN.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
            }
        }


        if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.HAY_BLOCK)
        {
            world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);

            if (world instanceof Level _level && !_level.isClientSide()) {
                ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.BREAD,3));
                entityToSpawn.setPickUpDelay(10);
                _level.addFreshEntity(entityToSpawn);
            }
            if (Math.random() < 0.75) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(ModItems.WHEAT_DOUGH.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
                if (Math.random() < 0.75) {
                    if (world instanceof Level _level && !_level.isClientSide()) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.BREAD));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                    }
                }
            }
            {
                int _value = 3;
                BlockPos _pos = new BlockPos(x, y, z);
                BlockState _bs = world.getBlockState(_pos);
                if (_bs.getBlock().getStateDefinition().getProperty("age") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
                    world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
            }
            if (world instanceof ServerLevel _level)
                _level.sendParticles(ModParticles.ROBIN_STAR_PARTICLES_PROJECTILE.get(), x, y, z, 36, 0.5, 0.5, 0.5, 0.05f);
            if (Math.random() < 0.15) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItems.SPARKLING_POLLEN.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
            }
        }


        if (((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.BROWN_MUSHROOM)||(((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.RED_MUSHROOM)))
        {
            world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);

            if (world instanceof Level _level && !_level.isClientSide()) {
                ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.MUSHROOM_STEW));
                entityToSpawn.setPickUpDelay(10);
                _level.addFreshEntity(entityToSpawn);
            }

            {
                int _value = 3;
                BlockPos _pos = new BlockPos(x, y, z);
                BlockState _bs = world.getBlockState(_pos);
                if (_bs.getBlock().getStateDefinition().getProperty("age") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
                    world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
            }
            if (world instanceof ServerLevel _level)
                _level.sendParticles(ModParticles.ROBIN_STAR_PARTICLES_PROJECTILE.get(), x, y, z, 36, 0.5, 0.5, 0.5, 0.05f);
            if (Math.random() < 0.15) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItems.SPARKLING_POLLEN.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
            }
        }


    }
}
