package net.sanberdir.wizardry_delight.entity.boat;

import net.minecraft.world.entity.EntityType;
import net.minecraftforge.registries.ObjectHolder;
import net.sanberdir.wizardry_delight.entity.chest_boat.ModChestBoatEntity;
import net.sanberdir.wizardry_delight.init.customblock.WDSpawnerEntity;

import static net.sanberdir.wizardry_delight.WizardryDelight.MOD_ID;

public class ModEntityData {
    @ObjectHolder(registryName = "minecraft:entity_type", value = MOD_ID + ":mod_boat_entity")
    public static EntityType<ModBoatEntity> MOD_BOAT_DATA;

    @ObjectHolder(registryName = "minecraft:entity_type", value = MOD_ID + ":mod_chest_boat_entity")
    public static EntityType<ModChestBoatEntity> MOD_CHEST_BOAT_DATA;
}
