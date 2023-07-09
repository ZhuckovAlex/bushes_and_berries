package net.sanberdir.wizardry_delight.init.customitem;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.level.Level;
import net.sanberdir.wizardry_delight.procedures.EatingCheese1;
import net.sanberdir.wizardry_delight.sounds.CustomSoundEvents;

public class Cheese extends Item {
    public Cheese(Properties p_41383_) {
        super(p_41383_);
    }

    @Override
    public UseAnim getUseAnimation(ItemStack p_41452_) {
        return UseAnim.DRINK;
    }

    @Override
    public SoundEvent getDrinkingSound() {
        return CustomSoundEvents.NYAMNYAM.get();
    }
    @Override
    public SoundEvent getEatingSound() {
        return CustomSoundEvents.NYAMNYAM_END.get();
    }
    @Override
    public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
        ItemStack retval = super.finishUsingItem(itemstack, world, entity);
        double x = entity.getX();
        double y = entity.getY();
        double z = entity.getZ();

        EatingCheese1.execute(entity);
        return retval;
    }

}
