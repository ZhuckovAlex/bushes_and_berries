package net.sanberdir.wizardry_delight.init;

import net.minecraftforge.registries.ObjectHolder;
import net.sanberdir.wizardry_delight.WizardryDelight;
import net.sanberdir.wizardry_delight.init.customitem.AppleBoat;

public class ModEntitiesItem {
    @ObjectHolder(registryName = "minecraft:item", value = WizardryDelight.MOD_ID + ":apple_boat")
    public static AppleBoat APPLE_BOAT;
}
