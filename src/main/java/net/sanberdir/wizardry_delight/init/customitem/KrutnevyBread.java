package net.sanberdir.wizardry_delight.init.customitem;

import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.stats.Stats;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;

public class KrutnevyBread extends Item {
    public KrutnevyBread(Properties p_41383_) {
        super(p_41383_);
    }
    public static void execute(Entity entity) {
        if (entity == null)
            return;
        if (entity instanceof LivingEntity _entity)
            _entity.removeEffect(MobEffects.BAD_OMEN);
        if (entity instanceof LivingEntity _entity)
            _entity.removeEffect(MobEffects.DARKNESS);
        if (entity instanceof LivingEntity _entity)
            _entity.removeEffect(MobEffects.HUNGER);
        if (entity instanceof LivingEntity _entity)
            _entity.removeEffect(MobEffects.WITHER);
        if (entity instanceof LivingEntity _entity)
            _entity.removeEffect(MobEffects.POISON);
        if (entity instanceof LivingEntity _entity)
            _entity.removeEffect(MobEffects.MOVEMENT_SLOWDOWN);
        if (entity instanceof LivingEntity _entity)
            _entity.removeEffect(MobEffects.UNLUCK);
        if (entity instanceof LivingEntity _entity)
            _entity.removeEffect(MobEffects.WEAKNESS);
    }

    public ItemStack finishUsingItem(ItemStack itemStack, Level level, LivingEntity livingEntity) {
        if (!level.isClientSide) {
            // FORGE - move up so stack.shrink does not turn stack into air

            execute(livingEntity);

            if (livingEntity instanceof ServerPlayer serverplayer) {
                CriteriaTriggers.CONSUME_ITEM.trigger(serverplayer, itemStack);
                serverplayer.awardStat(Stats.ITEM_USED.get(this));
            }
        }

        if (livingEntity instanceof Player && !((Player)livingEntity).getAbilities().instabuild) {
            itemStack.shrink(1);
        }

        return itemStack;
    }
}
