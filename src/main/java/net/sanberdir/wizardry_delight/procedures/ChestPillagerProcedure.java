package net.sanberdir.wizardry_delight.procedures;

import com.mojang.blaze3d.shaders.Effect;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.PotionItem;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.item.alchemy.PotionBrewing;
import net.minecraft.world.item.alchemy.PotionUtils;
import net.minecraft.world.item.alchemy.Potions;
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
import java.util.Random;

@Mod.EventBusSubscriber

public class ChestPillagerProcedure {
    @SubscribeEvent
    public static void onRightClickItem(PlayerInteractEvent.RightClickItem event) {
        if (event.getHand() != event.getEntity().getUsedItemHand())
            return;
        execute(event, event.getEntity());
    }
    private static void execute(@Nullable Event event, Entity entity) {
        if (entity == null)
            return;
        if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == InitItems.THE_PILLAGERS_CHEST.get()) {
            if (entity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(InitItems.THE_PILLAGERS_CHEST.get());
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
            if (new Random().nextGaussian() <= 0.4) {
                if (entity instanceof Player _player) {
                    ItemStack _setstack = new ItemStack(Items.COBWEB);
                    _setstack.setCount(Mth.nextInt(RandomSource.create(), 1, 4));
                    ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
                }
            }
            if (new Random().nextGaussian() <= 0.35) {
                if (entity instanceof Player _player) {
                    ItemStack _setstack = new ItemStack(Items.FEATHER);
                    _setstack.setCount(Mth.nextInt(RandomSource.create(), 1, 5));
                    ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
                }
            }
            if (new Random().nextGaussian() <= 0.25) {
                if (entity instanceof Player _player) {
                    ItemStack _setstack = new ItemStack(Items.GOLD_NUGGET);
                    _setstack.setCount(Mth.nextInt(RandomSource.create(), 1, 7));
                    ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
                }
            }
            if (new Random().nextGaussian() <= 0.2) {
                if (entity instanceof Player _player) {
                    ItemStack _setstack = new ItemStack(Items.RAW_IRON);
                    _setstack.setCount(Mth.nextInt(RandomSource.create(), 1, 3));
                    ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
                }
            }
            if (new Random().nextGaussian() <= 0.15) {
                if (entity instanceof Player _player) {
                    ItemStack _setstack = new ItemStack(Items.RABBIT_HIDE);
                    _setstack.setCount(Mth.nextInt(RandomSource.create(), 2, 5));
                    ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
                }
            }
            if (new Random().nextGaussian() <= 0.09) {
                if (entity instanceof Player _player) {
                    ItemStack _setstack = new ItemStack(Items.EXPERIENCE_BOTTLE);
                    _setstack.setCount(Mth.nextInt(RandomSource.create(), 1, 3));
                    ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
                }
            }
            if (new Random().nextGaussian() <= 0.11) {
                if (entity instanceof Player _player) {
                    ItemStack _setstack = new ItemStack(Items.ARROW);
                    _setstack.setCount(Mth.nextInt(RandomSource.create(), 5, 15));
                    ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
                }
            }
            if (new Random().nextGaussian() <= 0.12) {
                if (entity instanceof Player _player) {
                    ItemStack _setstack = new ItemStack(Items.COAL);
                    _setstack.setCount(Mth.nextInt(RandomSource.create(), 1, 5));
                    ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
                }
            }
            if (new Random().nextGaussian() <= 0.05) {
                if (entity instanceof Player _player) {
                    ItemStack _setstack = new ItemStack(Items.EMERALD);
                    _setstack.setCount(Mth.nextInt(RandomSource.create(), 1, 3));
                    ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
                }
            }
            if (new Random().nextGaussian() <= 0.17) {
                if (entity instanceof Player _player) {
                    ItemStack _setstack = new ItemStack(InitItems.CHEESE.get());
                    _setstack.setCount(Mth.nextInt(RandomSource.create(), 1, 1));
                    ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
                }
            }
            if (new Random().nextGaussian() <= 0.50) {
                if (entity instanceof Player _player) {
                    ItemStack _setstack = new ItemStack(Items.ARROW);
                    _setstack.setCount(Mth.nextInt(RandomSource.create(), 20, 40));
                    ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
                }
            }
        }
    }
}
