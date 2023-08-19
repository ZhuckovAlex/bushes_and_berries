package net.sanberdir.wizardry_delight.world.biome;

import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.Biome;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.sanberdir.wizardry_delight.WizardryDelight;

public class ModBiomes {
    public static final DeferredRegister<Biome> BIOMES =
            DeferredRegister.create(ForgeRegistries.BIOMES, WizardryDelight.MODID);
    public static final ResourceKey<Biome> LAVA_LAND = register("lava_land");


    private static ResourceKey<Biome> register(String p_48229_) {
        return ResourceKey.create(Registry.BIOME_REGISTRY, new ResourceLocation(p_48229_));
    }
    public static void register(IEventBus eventBus) {
        BIOMES.register(eventBus);
    }
}