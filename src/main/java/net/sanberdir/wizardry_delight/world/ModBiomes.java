package net.sanberdir.wizardry_delight.world;

import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.data.worldgen.biome.EndBiomes;
import net.minecraft.data.worldgen.biome.NetherBiomes;
import net.minecraft.data.worldgen.biome.OverworldBiomes;
import net.minecraft.world.level.biome.Biome;

public class ModBiomes {
    public static Holder<Biome> bootstrap(Registry<Biome> p_236653_) {
        BuiltinRegistries.register(p_236653_, net.sanberdir.wizardry_delight.world.biome.ModBiomes.LAVA_LAND, OverworldBiomes.taiga(false));
        return BuiltinRegistries.register(p_236653_, net.minecraft.world.level.biome.Biomes.END_BARRENS, EndBiomes.endBarrens());
    }
}
