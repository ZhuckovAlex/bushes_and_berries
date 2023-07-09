package net.sanberdir.wizardry_delight.procedures;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingEntityUseItemEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.sanberdir.wizardry_delight.init.InitItems;

import javax.annotation.Nullable;


public class EatingCheese2 {


    public static void execute(Entity entity) {
        if (entity == null)
            return;
        if (entity instanceof LivingEntity _entity) {
            ItemStack _setstack = new ItemStack(InitItems.CHEESE_2.get());
            _setstack.setCount(1);
            _entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
            if (_entity instanceof Player _player)
                _player.getInventory().setChanged();
        }
    }
}
