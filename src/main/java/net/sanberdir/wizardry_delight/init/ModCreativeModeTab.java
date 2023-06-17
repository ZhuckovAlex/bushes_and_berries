package net.sanberdir.wizardry_delight.init;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {


    // Добавление таба

    public static final CreativeModeTab BUSHES = new CreativeModeTab("wizardry_delight") {
            @Override
            public ItemStack makeIcon() {
                return new ItemStack(InitItems.BLACK_BERRIES.get());
            }
        };
}