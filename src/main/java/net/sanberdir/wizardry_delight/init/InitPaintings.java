package net.sanberdir.wizardry_delight.init;

import net.minecraft.world.entity.decoration.PaintingVariant;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.sanberdir.wizardry_delight.WizardryDelight;

public class InitPaintings {
    public static final DeferredRegister<PaintingVariant> PAINTING_VARIANTS =
            DeferredRegister.create(ForgeRegistries.PAINTING_VARIANTS, WizardryDelight.MODID);

    public static final RegistryObject<PaintingVariant> LANDSCAPE_LAKE = PAINTING_VARIANTS.register("landscape_lake",
            () -> new PaintingVariant(64, 64));
    public static final RegistryObject<PaintingVariant> WATERFALL_TOWER = PAINTING_VARIANTS.register("waterfall_tower",
            () -> new PaintingVariant(64, 64));
    public static final RegistryObject<PaintingVariant> WHITE_CITY = PAINTING_VARIANTS.register("white_city",
            () -> new PaintingVariant(64, 64));
    public static final RegistryObject<PaintingVariant> RED_TOWER = PAINTING_VARIANTS.register("red_tower",
            () -> new PaintingVariant(32, 32));
    public static final RegistryObject<PaintingVariant> WIZARD_TOWER = PAINTING_VARIANTS.register("wizard_tower",
            () -> new PaintingVariant(16, 32));
    public static final RegistryObject<PaintingVariant> TOWER = PAINTING_VARIANTS.register("tower",
            () -> new PaintingVariant(16, 16));
    public static final RegistryObject<PaintingVariant> HOUSE = PAINTING_VARIANTS.register("house",
            () -> new PaintingVariant(16, 16));
    public static final RegistryObject<PaintingVariant> DARKGREEN_CASTLE = PAINTING_VARIANTS.register("darkgreen_castle",
            () -> new PaintingVariant(32, 32));
    public static final RegistryObject<PaintingVariant> POTION_GREEN = PAINTING_VARIANTS.register("potion_green",
            () -> new PaintingVariant(32, 32));

    public static void register(IEventBus eventBus) {
        PAINTING_VARIANTS.register(eventBus);
    }
}
