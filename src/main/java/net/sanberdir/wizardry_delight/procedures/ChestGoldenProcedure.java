package net.sanberdir.wizardry_delight.procedures;

import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.EnchantedBookItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.items.ItemHandlerHelper;
import net.sanberdir.wizardry_delight.init.InitItems;

import javax.annotation.Nullable;
import java.util.Random;

@Mod.EventBusSubscriber

public class ChestGoldenProcedure {
    @SubscribeEvent
    public static void onRightClickItem(PlayerInteractEvent.RightClickItem event) {
        if (event.getHand() != event.getEntity().getUsedItemHand())
            return;
        execute(event, event.getEntity());
    }
    private static void execute(@Nullable Event event, Entity entity) {
        if (entity == null)
            return;
        if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == InitItems.GOLDEN_CHEST_KING_PILLAGER.get()) {
            if (entity instanceof Player _player) {
                ItemStack _stktoremove = new ItemStack(InitItems.GOLDEN_CHEST_KING_PILLAGER.get());
                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
            }
            if (new Random().nextGaussian() <= 0.01) {
                if (entity instanceof Player _player) {
                    ItemStack _setstack = new ItemStack(Items.ENCHANTED_GOLDEN_APPLE);
                    _setstack.setCount(Mth.nextInt(RandomSource.create(), 1, 1));
                    ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
                }
            }
            if (new Random().nextGaussian() <= 0.03) {
                if (entity instanceof Player _player) {
                    ItemStack _setstack = new ItemStack(Items.DIAMOND);
                    _setstack.setCount(Mth.nextInt(RandomSource.create(), 1, 3));
                    ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
                }
            }
            if (new Random().nextGaussian() <= 0.07) {
                if (entity instanceof Player _player) {
                    ItemStack _setstack = new ItemStack(InitItems.A_DROP_OF_LOVE.get());
                    _setstack.setCount(Mth.nextInt(RandomSource.create(), 1, 1));
                    ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
                }
            }
            if (new Random().nextGaussian() <= 0.15) {
                if (entity instanceof Player _player) {
                    ItemStack _setstack = new ItemStack(InitItems.SILVERAN.get());
                    _setstack.setCount(Mth.nextInt(RandomSource.create(), 1, 1));
                    ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
                }
            }
            if (new Random().nextGaussian() <= 0.20) {
                if (entity instanceof Player _player) {
                    ItemStack _setstack = new ItemStack(Items.EMERALD);
                    _setstack.setCount(Mth.nextInt(RandomSource.create(), 1, 10));
                    ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
                }
            }
            if (new Random().nextGaussian() <= 0.50) {
                if (entity instanceof Player _player) {
                    ItemStack _setstack = new ItemStack(InitItems.CHEESE.get());
                    _setstack.setCount(Mth.nextInt(RandomSource.create(), 2, 3));
                    ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
                }
            }
            if (new Random().nextGaussian() <= 0.2) {
                if (entity instanceof Player _player) {
                    ItemStack _setstack = new ItemStack(Items.IRON_AXE);
                    _setstack.setCount(Mth.nextInt(RandomSource.create(), 1, 1));
                    ItemHandlerHelper.giveItemToPlayer(_player, _setstack);

                }
            }
            if (new Random().nextGaussian() <= 0.3) {
                if (entity instanceof Player _player) {
                    ItemStack _setstack = new ItemStack(Items.EXPERIENCE_BOTTLE);
                    _setstack.setCount(Mth.nextInt(RandomSource.create(), 4, 7));
                    ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
                }
            }
        }
    }
}
