package net.sanberdir.wizardry_delight.procedures;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraftforge.common.capabilities.ForgeCapabilities;
import net.minecraftforge.items.IItemHandlerModifiable;

import java.util.function.Supplier;
import java.util.Map;

public class CraftingSoulStoneCharged {
    public static void execute(Entity entity) {
        if (entity == null)
            return;
        double fromZ = 0;
        double fromX = 0;
        double fromY = 0;
        {
            final int _slotid = 0;
            final ItemStack _setstack = new ItemStack(Items.SPIDER_EYE);
            _setstack.setCount(1);
            entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
                if (capability instanceof IItemHandlerModifiable _modHandler)
                    _modHandler.setStackInSlot(_slotid, _setstack);
            });
        }
    }
}
