package net.sanberdir.wizardry_delight.procedures;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.animal.*;
import net.minecraft.world.entity.animal.horse.Llama;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.monster.warden.Warden;
import net.minecraft.world.entity.monster.Stray;
import net.minecraft.world.entity.monster.Ravager;
import net.minecraft.world.entity.monster.Creeper;
import net.minecraft.world.entity.animal.horse.Horse;
import net.minecraft.world.entity.animal.goat.Goat;
import net.minecraft.world.entity.animal.frog.Frog;
import net.minecraft.world.entity.animal.axolotl.Axolotl;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.sanberdir.wizardry_delight.WizardryDelight;
import net.sanberdir.wizardry_delight.init.InitItems;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber

public class ProcedureSoulStone {
    @SubscribeEvent
    public static void onRightClickItem(PlayerInteractEvent.RightClickItem event) {
        if (event.getHand() != event.getEntity().getUsedItemHand())
            return;
        execute(event, event.getLevel(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), event.getEntity());
    }

    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        execute(null, world, x, y, z, entity);
    }

    private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
        if (entity == null)
            return;
        if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == InitItems.SOUL_STONE_CHARGED.get()) {
            if (entity instanceof LivingEntity _entity) {
                ItemStack _setstack = new ItemStack(WizardryDelight.SOUL_STONE_DISCHARGED.get());
                _setstack.setCount(1);
                _entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
                if (_entity instanceof Player _player)
                    _player.getInventory().setChanged();
            }
            if (Math.random() < 0.30) {
                if (world instanceof ServerLevel _level) {
                    Entity entityToSpawn = new Sheep(EntityType.SHEEP, _level);
                    entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360F, 0);
                    if (entityToSpawn instanceof Mob _mobToSpawn)
                        _mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
                    world.addFreshEntity(entityToSpawn);
                }
            }
            else if (Math.random() < 0.15) {
                if (world instanceof ServerLevel _level) {
                    Entity entityToSpawn = new Fox(EntityType.FOX, _level);
                    entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360F, 0);
                    if (entityToSpawn instanceof Mob _mobToSpawn)
                        _mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
                    world.addFreshEntity(entityToSpawn);
                }
            }
            else if (Math.random() < 0.30) {
                if (world instanceof ServerLevel _level) {
                    Entity entityToSpawn = new Horse(EntityType.HORSE, _level);
                    entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360F, 0);
                    if (entityToSpawn instanceof Mob _mobToSpawn)
                        _mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
                    world.addFreshEntity(entityToSpawn);
                }
            }
            else if (Math.random() < 0.15) {
                if (world instanceof ServerLevel _level) {
                    Entity entityToSpawn = new Cat(EntityType.CAT, _level);
                    entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360F, 0);
                    if (entityToSpawn instanceof Mob _mobToSpawn)
                        _mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
                    world.addFreshEntity(entityToSpawn);
                }
            }
            else if (Math.random() < 0.30) {
                if (world instanceof ServerLevel _level) {
                    Entity entityToSpawn = new Cow(EntityType.COW, _level);
                    entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360F, 0);
                    if (entityToSpawn instanceof Mob _mobToSpawn)
                        _mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
                    world.addFreshEntity(entityToSpawn);
                }
            }
            else if (Math.random() < 0.30) {
                if (world instanceof ServerLevel _level) {
                    Entity entityToSpawn = new Chicken(EntityType.CHICKEN, _level);
                    entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360F, 0);
                    if (entityToSpawn instanceof Mob _mobToSpawn)
                        _mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
                    world.addFreshEntity(entityToSpawn);
                }
            }
            else if (Math.random() < 0.30) {
                if (world instanceof ServerLevel _level) {
                    Entity entityToSpawn = new Pig(EntityType.PIG, _level);
                    entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360F, 0);
                    if (entityToSpawn instanceof Mob _mobToSpawn)
                        _mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
                    world.addFreshEntity(entityToSpawn);
                }
            }
            else if (Math.random() < 0.15) {
                if (world instanceof ServerLevel _level) {
                    Entity entityToSpawn = new Goat(EntityType.GOAT, _level);
                    entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360F, 0);
                    if (entityToSpawn instanceof Mob _mobToSpawn)
                        _mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
                    world.addFreshEntity(entityToSpawn);
                }
            }
            else if (Math.random() < 0.15) {
                if (world instanceof ServerLevel _level) {
                    Entity entityToSpawn = new Frog(EntityType.FROG, _level);
                    entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360F, 0);
                    if (entityToSpawn instanceof Mob _mobToSpawn)
                        _mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
                    world.addFreshEntity(entityToSpawn);
                }
            }
            else if (Math.random() < 0.10) {
                if (world instanceof ServerLevel _level) {
                    Entity entityToSpawn = new IronGolem(EntityType.IRON_GOLEM, _level);
                    entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360F, 0);
                    if (entityToSpawn instanceof Mob _mobToSpawn)
                        _mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
                    world.addFreshEntity(entityToSpawn);
                }
            }
            else if (Math.random() < 0.30) {
                if (world instanceof ServerLevel _level) {
                    Entity entityToSpawn = new Wolf(EntityType.WOLF, _level);
                    entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360F, 0);
                    if (entityToSpawn instanceof Mob _mobToSpawn)
                        _mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
                    world.addFreshEntity(entityToSpawn);
                }
            }
            else if (Math.random() < 0.30) {
                if (world instanceof ServerLevel _level) {
                    Entity entityToSpawn = new Bee(EntityType.BEE, _level);
                    entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360F, 0);
                    if (entityToSpawn instanceof Mob _mobToSpawn)
                        _mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
                    world.addFreshEntity(entityToSpawn);
                }
            }
            else if (Math.random() < 0.09) {
                if (world instanceof ServerLevel _level) {
                    Entity entityToSpawn = new Stray(EntityType.STRAY, _level);
                    entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360F, 0);
                    if (entityToSpawn instanceof Mob _mobToSpawn)
                        _mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
                    world.addFreshEntity(entityToSpawn);
                }
            }
            else if (Math.random() < 0.09) {
                if (world instanceof ServerLevel _level) {
                    Entity entityToSpawn = new Creeper(EntityType.CREEPER, _level);
                    entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360F, 0);
                    if (entityToSpawn instanceof Mob _mobToSpawn)
                        _mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
                    world.addFreshEntity(entityToSpawn);
                }
            }
            else if (Math.random() < 0.09) {
                if (world instanceof ServerLevel _level) {
                    Entity entityToSpawn = new Ravager(EntityType.RAVAGER, _level);
                    entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360F, 0);
                    if (entityToSpawn instanceof Mob _mobToSpawn)
                        _mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
                    world.addFreshEntity(entityToSpawn);
                }
            }
            else if (Math.random() < 0.04) {
                if (world instanceof ServerLevel _level) {
                    Entity entityToSpawn = new Warden(EntityType.WARDEN, _level);
                    entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360F, 0);
                    if (entityToSpawn instanceof Mob _mobToSpawn)
                        _mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
                    world.addFreshEntity(entityToSpawn);
                }
            }
            else {
                if (world instanceof ServerLevel _level) {
                Entity entityToSpawn = new Llama(EntityType.LLAMA, _level);
                entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360F, 0);
                if (entityToSpawn instanceof Mob _mobToSpawn)
                    _mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
                world.addFreshEntity(entityToSpawn);
            }

            }
        }
    }
}
