package net.sanberdir.wizardry_delight.procedures;

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

//@Mod.EventBusSubscriber

public class ChestPillagerProcedure {
//    @SubscribeEvent
//    public static void onRightClickItem(PlayerInteractEvent.RightClickItem event) {
//        if (event.getHand() != event.getEntity().getUsedItemHand())
//            return;
//        execute(event, event.getEntity());
//    }

    public static void execute(Entity entity) {
        execute(null, entity);
    }

    private static void execute(@Nullable Event event, Entity entity) {
        if (entity == null)
            return;
        if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == InitItems.THE_PILLAGERS_CHEST.get()
                && !((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == InitItems.THE_PILLAGERS_CHEST.get())) {
            if (entity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(InitItems.THE_PILLAGERS_CHEST.get());
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
            if (entity instanceof Player _player)
                _player.giveExperiencePoints(50);
            if (Math.random() < 0.3) {
                if (entity instanceof Player _player) {
                    ItemStack _setstack = new ItemStack(Blocks.COBWEB);
                    _setstack.setCount((int) Mth.nextDouble(RandomSource.create(), 1, 4));
                    ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
                }
            }
            if (Math.random() < 0.2) {
                if (entity instanceof Player _player) {
                    ItemStack _setstack = new ItemStack(Items.RAW_IRON);
                    _setstack.setCount((int) Mth.nextDouble(RandomSource.create(), 1, 5));
                    ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
                }
            }
            if (Math.random() < 0.4) {
                if (entity instanceof Player _player) {
                    ItemStack _setstack = new ItemStack(Items.ARROW);
                    _setstack.setCount((int) Mth.nextDouble(RandomSource.create(), 5, 25));
                    ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
                }
            }
            if (Math.random() < 0.15) {
                if (entity instanceof Player _player) {
                    ItemStack _setstack = new ItemStack(Items.EMERALD);
                    _setstack.setCount((int) Mth.nextDouble(RandomSource.create(), 1, 3));
                    ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
                }
            }
            if (Math.random() < 0.15) {
                if (entity instanceof Player _player) {
                    ItemStack _setstack = new ItemStack(Items.EXPERIENCE_BOTTLE);
                    _setstack.setCount((int) Mth.nextDouble(RandomSource.create(), 1, 10));
                    ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
                }
            }
            if (Math.random() < 0.05) {
                if (entity instanceof Player _player) {
                    ItemStack _setstack = new ItemStack(InitItems.CHEESE.get());
                    _setstack.setCount((int) Mth.nextDouble(RandomSource.create(), 1, 1));
                    ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
                }
            }
            if (Math.random() < 0.08) {
                if (entity instanceof Player _player) {
                    ItemStack _setstack = new ItemStack(InitItems.WIZARDRY_DELIGHT_JAM.get());
                    _setstack.setCount((int) Mth.nextDouble(RandomSource.create(), 1, 1));
                    ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
                }
            }
        }
    }
}
