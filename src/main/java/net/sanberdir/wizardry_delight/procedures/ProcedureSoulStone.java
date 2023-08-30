package net.sanberdir.wizardry_delight.procedures;
import net.minecraft.commands.CommandSource;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.animal.*;
import net.minecraft.world.entity.animal.horse.Llama;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.Vec3;
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
import java.util.List;

@Mod.EventBusSubscriber

public class ProcedureSoulStone {


    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        if (entity == null)
            return;
        double particleRadius = 0;
        double particleAmount = 0;

        if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == InitItems.SOUL_STONE_CHARGED.get()) {
            if (world instanceof ServerLevel _level)
                _level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
                        ("summon " + ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getString("entity"))));

            if (entity instanceof LivingEntity _entity) {
                ItemStack _setstack = new ItemStack(WizardryDelight.SOUL_STONE_DISCHARGED.get());
                _setstack.setCount(1);
                _entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
                if (_entity instanceof Player _player)
                    _player.getInventory().setChanged();
            }



        }
        }
    }
