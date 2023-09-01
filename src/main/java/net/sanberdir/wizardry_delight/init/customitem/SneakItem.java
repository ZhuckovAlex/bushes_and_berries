package net.sanberdir.wizardry_delight.init.customitem;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;
import net.sanberdir.wizardry_delight.procedures.ChestPillagerProcedure;


public class SneakItem extends Item{


    public SneakItem(Properties p_41383_) {
        super(p_41383_);
    }

//    @Override
//    public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
//        InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
//        ItemStack itemstack = ar.getObject();
//        double x = entity.getX();
//        double y = entity.getY();
//        double z = entity.getZ();
//
//        ChestPillagerProcedure.execute(entity);
//        return ar;
//    }

}
