package net.sanberdir.wizardry_delight.procedures;

import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraftforge.items.ItemHandlerHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.sanberdir.wizardry_delight.init.InitItems;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class ChestPillagerProcedure {
    @SubscribeEvent
    public static void onRightClickItem(PlayerInteractEvent.RightClickItem event) {
        if (event.getHand() != event.getEntity().getUsedItemHand())
            return;
        execute(event, event.getLevel(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), event.getEntity());
    }

    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        execute(null, world, x, y, z, entity);
    }

    private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {

        if (entity == null)
            return;
        if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == InitItems.THE_PILLAGERS_CHEST.get()) {
            ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)).shrink(1);
            if (Math.random() < 0.20) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.COBWEB, 3));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
            } else if (Math.random() < 0.25) {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.BONE,4));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.ARROW, 5));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
                if ((world instanceof Level _level && !_level.isClientSide())&&(Math.random() < 0.5)) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.IRON_INGOT,2));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
                if ((world instanceof Level _level && !_level.isClientSide())&&(Math.random() < 0.5)) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.IRON_INGOT,3));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
                if ((world instanceof Level _level && !_level.isClientSide())&&(Math.random() < 0.30)) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.COAL,4));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
                if ((world instanceof Level _level && !_level.isClientSide())&&(Math.random() < 0.1)) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItems.CHEESE.get(),3));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
            } else if (Math.random() < 0.30) {
                if ((world instanceof Level _level && !_level.isClientSide())&&(Math.random() < 0.45)) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.IRON_INGOT,4));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.IRON_INGOT));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.COAL,5));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
                if ((world instanceof Level _level && !_level.isClientSide())&&(Math.random() < 0.05)) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItems.CHEESE.get(),3));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
            } else if (Math.random() < 0.15) {
                if ((world instanceof Level _level && !_level.isClientSide())&&(Math.random() < 0.30)) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItems.CHEESE.get(),3));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(InitItems.CHEESE.get()));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
            } else {
                if (world instanceof Level _level && !_level.isClientSide()) {
                    ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Items.ARROW, 5));
                    entityToSpawn.setPickUpDelay(10);
                    _level.addFreshEntity(entityToSpawn);
                }
            }
        }


    }
}
