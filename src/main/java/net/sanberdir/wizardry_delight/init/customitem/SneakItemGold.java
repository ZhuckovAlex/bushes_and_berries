package net.sanberdir.wizardry_delight.init.customitem;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.sanberdir.wizardry_delight.procedures.ChestGoldenProcedure;
import net.sanberdir.wizardry_delight.procedures.ChestPillagerProcedure;


public class SneakItemGold extends Item{


    public SneakItemGold(Properties p_41383_) {
        super(p_41383_);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
        InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
        ItemStack itemstack = ar.getObject();
        double x = entity.getX();
        double y = entity.getY();
        double z = entity.getZ();

        ChestGoldenProcedure.execute(entity);
        return ar;
    }

}
