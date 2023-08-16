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
import net.sanberdir.wizardry_delight.init.InitItems;
import net.sanberdir.wizardry_delight.particle.ModParticles;
import vectorwing.farmersdelight.common.registry.ModBlocks;
import vectorwing.farmersdelight.common.registry.ModItems;

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
            if (Math.random() < 0.15) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItems.SPARKLING_POLLEN.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
            }
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
            if (Math.random() < 0.15) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItems.SPARKLING_POLLEN.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
            }
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
            if (Math.random() < 0.15) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItems.SPARKLING_POLLEN.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
            }
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
            if (Math.random() < 0.15) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItems.SPARKLING_POLLEN.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
            }
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
                ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.PUMPKIN_PIE));
                entityToSpawn.setPickUpDelay(10);
                _level.addFreshEntity(entityToSpawn);
            }
                if (Math.random() < 0.75) {
                    if (world instanceof Level _level && !_level.isClientSide()) {
                        ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(ModItems.PUMPKIN_SLICE.get()));
                        entityToSpawn.setPickUpDelay(10);
                        _level.addFreshEntity(entityToSpawn);
                    }
                    if (Math.random() < 0.75) {
                        if (world instanceof Level _level && !_level.isClientSide()) {
                            ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(ModItems.PUMPKIN_SOUP.get()));
                            entityToSpawn.setPickUpDelay(10);
                            _level.addFreshEntity(entityToSpawn);
                        }
                        if (Math.random() < 0.75) {
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
                _level.sendParticles(ModParticles.ROBIN_STAR_PARTICLES.get(), x, y, z, 10, 1, 1, 1, 0.2f);
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
            if (Math.random() < 0.25) {
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
                _level.sendParticles(ModParticles.ROBIN_STAR_PARTICLES.get(), x, y, z, 10, 1, 1, 1, 0.2f);
            if (Math.random() < 0.15) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItems.SPARKLING_POLLEN.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
            }
        }

        if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == ModBlocks.WILD_TOMATOES.get())
        {
            world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);

            if (world instanceof Level _level && !_level.isClientSide()) {
                ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(ModItems.TOMATO_SAUCE.get()));
                entityToSpawn.setPickUpDelay(10);
                _level.addFreshEntity(entityToSpawn);
            }
            if (Math.random() < 0.25) {
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
                _level.sendParticles(ModParticles.ROBIN_STAR_PARTICLES.get(), x, y, z, 10, 1, 1, 1, 0.2f);
            if (Math.random() < 0.15) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItems.SPARKLING_POLLEN.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
            }
        }

        if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == ModBlocks.WILD_POTATOES.get())
        {
            world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);

            if (world instanceof Level _level && !_level.isClientSide()) {
                ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(ModItems.STUFFED_POTATO.get()));
                entityToSpawn.setPickUpDelay(10);
                _level.addFreshEntity(entityToSpawn);
            }
            if (Math.random() < 0.25) {
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
                _level.sendParticles(ModParticles.ROBIN_STAR_PARTICLES.get(), x, y, z, 10, 1, 1, 1, 0.2f);
            if (Math.random() < 0.15) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItems.SPARKLING_POLLEN.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
            }
        }


        if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == ModBlocks.WILD_RICE.get())
        {
            world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);

            if (world instanceof Level _level && !_level.isClientSide()) {
                ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(ModItems.FRIED_RICE.get()));
                entityToSpawn.setPickUpDelay(10);
                _level.addFreshEntity(entityToSpawn);
            }
            if (Math.random() < 0.25) {
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
                _level.sendParticles(ModParticles.ROBIN_STAR_PARTICLES.get(), x, y, z, 10, 1, 1, 1, 0.2f);
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
                _level.sendParticles(ModParticles.ROBIN_STAR_PARTICLES.get(), x, y, z, 10, 1, 1, 1, 0.2f);
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
                ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.BREAD));
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
                _level.sendParticles(ModParticles.ROBIN_STAR_PARTICLES.get(), x, y, z, 10, 1, 1, 1, 0.2f);
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
                _level.sendParticles(ModParticles.ROBIN_STAR_PARTICLES.get(), x, y, z, 10, 1, 1, 1, 0.2f);
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
