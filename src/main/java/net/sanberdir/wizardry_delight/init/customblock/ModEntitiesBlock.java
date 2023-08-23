package net.sanberdir.wizardry_delight.init.customblock;

import net.minecraftforge.registries.ObjectHolder;
import net.sanberdir.wizardry_delight.WizardryDelight;

public class ModEntitiesBlock {
    @ObjectHolder(registryName = "minecraft:block", value = WizardryDelight.MOD_ID + ":apple_sign")
    public static AppleSign APPLE_SIGN;

    @ObjectHolder(registryName = "minecraft:block", value = WizardryDelight.MOD_ID + ":apple_wall_sign")
    public static AppleWallSign APPLE_WALL_SIGN;

}
