package net.sanberdir.wizardry_delight.init;

import net.minecraftforge.registries.ObjectHolder;
import net.sanberdir.wizardry_delight.WizardryDelight;
import net.sanberdir.wizardry_delight.init.customitem.AppleBoat;
import net.sanberdir.wizardry_delight.init.customitem.AppleChestBoat;

public class ModEntitiesItem {
    @ObjectHolder(registryName = "minecraft:item", value = WizardryDelight.MOD_ID + ":apple_boat")
    public static AppleBoat APPLE_BOAT;
    @ObjectHolder(registryName = "minecraft:item", value = WizardryDelight.MOD_ID + ":apple_chest_boat")
    public static AppleChestBoat APPLE_CHEST_BOAT;
}
