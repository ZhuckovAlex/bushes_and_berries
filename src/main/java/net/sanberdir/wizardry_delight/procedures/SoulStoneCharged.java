package net.sanberdir.wizardry_delight.procedures;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.core.BlockPos;
import net.sanberdir.wizardry_delight.WizardryDelight;
import net.sanberdir.wizardry_delight.init.InitBlocks;
import net.sanberdir.wizardry_delight.init.InitItems;

import javax.annotation.Nullable;

import java.util.Map;

@Mod.EventBusSubscriber


public class SoulStoneCharged {
    @SubscribeEvent
    public static void onRightClickBlock(PlayerInteractEvent.RightClickBlock event) {
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
        double fromZ = 0;
        double fromX = 0;
        double fromY = 0;
        if ((world.getBlockState(new BlockPos(x, y, z))) == InitBlocks.ROSE_OF_THE_MURDERER2.get().defaultBlockState() && (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == WizardryDelight.SOUL_STONE_DISCHARGED.get()) {
            {
                BlockPos _bp = new BlockPos(x, y, z);
                BlockState _bs = InitBlocks.ROSE_OF_THE_MURDERER.get().defaultBlockState();
                BlockState _bso = world.getBlockState(_bp);
                for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
                    Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
                    if (_property != null && _bs.getValue(_property) != null)
                        try {
                            _bs = _bs.setValue(_property, (Comparable) entry.getValue());
                        } catch (Exception e) {
                        }
                }
                world.setBlock(_bp, _bs, 3);
            }
            if (entity instanceof LivingEntity _entity) {
                WizardryDelight.queueServerWork(2, () -> {
                    ItemStack _setstack = new ItemStack(InitItems.SOUL_STONE_CHARGED.get());
                    _setstack.setCount(1);
                    _entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
                });
                if (_entity instanceof Player _player)
                    _player.getInventory().setChanged();
            }
        }
    }
}
