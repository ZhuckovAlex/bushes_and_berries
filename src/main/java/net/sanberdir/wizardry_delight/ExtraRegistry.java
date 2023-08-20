package net.sanberdir.wizardry_delight;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.sanberdir.wizardry_delight.entity.custom.CustomBoat;

public class ExtraRegistry {
    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, WizardryDelight.MODID);
    public static final RegistryObject<EntityType<CustomBoat>> BOAT = ENTITIES.register("boat", () -> EntityType.Builder.<CustomBoat>of(CustomBoat::new, MobCategory.MISC).sized(1.375F, 0.5625F).clientTrackingRange(10).build("boat"));
}
