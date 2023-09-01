package net.sanberdir.wizardry_delight.init.customitem;

import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.contents.TranslatableContents;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.sanberdir.wizardry_delight.init.InitItems;
import net.sanberdir.wizardry_delight.procedures.ProcedureSoulStone;

import java.util.List;

public class SoulStoneActive extends Item {
    public SoulStoneActive(Properties p_41383_) {
        super(p_41383_);
    }

    public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
        super.appendHoverText(itemstack, world, list, flag);

        list.add(Component.translatable("wizardry_delight.tag_entity_soul"));
        list.add(Component.literal("§d" + itemstack.getOrCreateTag().getString("name_entity")));
    }

    @Override
    public InteractionResult useOn(UseOnContext context) {
        super.useOn(context);

        ProcedureSoulStone.execute(context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(), context.getClickedPos().getZ(), context.getPlayer());
        return InteractionResult.SUCCESS;
    }





}
