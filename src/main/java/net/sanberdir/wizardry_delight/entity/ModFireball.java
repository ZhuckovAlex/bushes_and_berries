package net.sanberdir.wizardry_delight.entity;

import net.minecraft.core.BlockPos;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.projectile.Fireball;
import net.minecraft.world.entity.projectile.SmallFireball;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.BaseFireBlock;
import net.minecraft.world.phys.*;
import net.sanberdir.wizardry_delight.procedures.HitByBlock;
import net.sanberdir.wizardry_delight.procedures.HitByEntity;

public class ModFireball extends Fireball {
    public ModFireball(EntityType<? extends SmallFireball> p_37364_, Level p_37365_) {
        super(p_37364_, p_37365_);
    }

    public ModFireball(Level p_37375_, LivingEntity p_37376_, double p_37377_, double p_37378_, double p_37379_) {
        super(EntityType.SMALL_FIREBALL, p_37376_, p_37377_, p_37378_, p_37379_, p_37375_);
    }

    public ModFireball(Level p_37367_, double p_37368_, double p_37369_, double p_37370_, double p_37371_, double p_37372_, double p_37373_) {
        super(EntityType.SMALL_FIREBALL, p_37368_, p_37369_, p_37370_, p_37371_, p_37372_, p_37373_, p_37367_);
    }

    protected void onHitEntity(EntityHitResult p_37386_) {
        super.onHitEntity(p_37386_);

        Entity entity = p_37386_.getEntity();
        if (!this.level.isClientSide) {
            HitByEntity.execute(level,getX(),getY(),getZ(),entity);
        }
    }

    protected void onHitBlock(BlockHitResult p_37384_) {
        super.onHitBlock(p_37384_);
        if (!this.level.isClientSide) {
            HitByBlock.execute(level,getX(),getY(),getZ());

        }
    }
    protected void onHit(HitResult p_37388_) {
        super.onHit(p_37388_);
        if (!this.level.isClientSide) {
            this.discard();
        }

    }

    public boolean isPickable() {
        return false;
    }

    public boolean hurt(DamageSource p_37381_, float p_37382_) {
        return false;
    }
}