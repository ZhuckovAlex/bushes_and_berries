package net.sanberdir.wizardry_delight.init.customitem;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.sanberdir.wizardry_delight.procedures.CraftingSoulStoneCharged;
import net.sanberdir.wizardry_delight.procedures.HitByEntity;

public class SoulStoneCharged extends Item {
    public SoulStoneCharged(Properties p_41383_) {
        super(p_41383_);
    }



    @Override
    public void onCraftedBy(ItemStack p_41447_, Level level, Player p_41449_) {
        final ItemStack _setstack = new ItemStack(Items.SPIDER_EYE);

    }
}
