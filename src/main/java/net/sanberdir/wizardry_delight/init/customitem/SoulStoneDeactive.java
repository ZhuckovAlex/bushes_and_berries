package net.sanberdir.wizardry_delight.init.customitem;

import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.context.UseOnContext;
import net.sanberdir.wizardry_delight.procedures.SoulStoneCharged;

import java.util.ArrayList;
import java.util.List;

public class SoulStoneDeactive extends Item {
    public SoulStoneDeactive(Properties p_41383_) {
        super(p_41383_);
    }

    @Override
    public InteractionResult useOn(UseOnContext context) {
        super.useOn(context);
        SoulStoneCharged.execute(context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(), context.getClickedPos().getZ(), context.getPlayer());
        return InteractionResult.SUCCESS;
    }

}
