package net.sanberdir.wizardry_delight.procedures;
import net.minecraft.network.chat.Component;
import net.minecraft.world.level.block.entity.BlockEntity;
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

import java.util.List;
import java.util.Map;




public class SoulStoneCharged {

    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        if (entity == null)
            return;
        double fromZ = 0;
        double fromX = 0;
        double fromY = 0;
        if ((world.getBlockState(new BlockPos(x, y, z))) == InitBlocks.ROSE_OF_THE_MURDERER2.get().defaultBlockState() && (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == WizardryDelight.SOUL_STONE_DISCHARGED.get()) {

            if (entity instanceof LivingEntity _entity) {
                ItemStack _setstack = new ItemStack(InitItems.SOUL_STONE_CHARGED.get());
                _setstack.setCount(1);
                _entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
                if (_entity instanceof Player _player)
                    _player.getInventory().setChanged();
            }
            (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().putString("entity", (new Object() {
                public String getValue(LevelAccessor world, BlockPos pos, String tag) {
                    BlockEntity blockEntity = world.getBlockEntity(pos);
                    if (blockEntity != null)
                        return blockEntity.getPersistentData().getString(tag);
                    return "";
                }
            }.getValue(world, new BlockPos(x, y, z), "entity")));
            (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().putString("name_entity", (new Object() {
                public String getValue(LevelAccessor world, BlockPos pos, String tag) {
                    BlockEntity blockEntity = world.getBlockEntity(pos);
                    if (blockEntity != null)
                        return blockEntity.getPersistentData().getString(tag);
                    return "";
                }
            }.getValue(world, new BlockPos(x, y, z), "name_entity")));


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

        }
    }
}
