package net.sanberdir.wizardry_delight.world.feature;

import com.google.common.base.Suppliers;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.WeightedPlacedFeature;
import net.minecraft.world.level.levelgen.feature.configurations.*;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.sanberdir.wizardry_delight.WizardryDelight;
import net.sanberdir.wizardry_delight.init.InitBlocks;

import java.util.List;
import java.util.function.Supplier;

public class ModConfiguredFeatures {

    public static final DeferredRegister<ConfiguredFeature<?, ?>> CONFIGURED_FEATURES =
            DeferredRegister.create(Registry.CONFIGURED_FEATURE_REGISTRY, WizardryDelight.MODID);


    // Цветы
    public static final RegistryObject<ConfiguredFeature<?, ?>> CHARNIKA = CONFIGURED_FEATURES.register("charnika",
            () -> new ConfiguredFeature<>(Feature.FLOWER,
                    new RandomPatchConfiguration(10, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                            new SimpleBlockConfiguration(BlockStateProvider.simple(InitBlocks.CHARNIKA.get()))))));

    public static final RegistryObject<ConfiguredFeature<?, ?>> SPATIAL_ORCHID = CONFIGURED_FEATURES.register("spatial_orchid",
            () -> new ConfiguredFeature<>(Feature.FLOWER,
                    new RandomPatchConfiguration(2, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                            new SimpleBlockConfiguration(BlockStateProvider.simple(InitBlocks.SPATIAL_ORCHID.get()))))));

    public static final RegistryObject<ConfiguredFeature<?, ?>> YADOGA = CONFIGURED_FEATURES.register("yadoga",
            () -> new ConfiguredFeature<>(Feature.FLOWER,
                    new RandomPatchConfiguration(10, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                            new SimpleBlockConfiguration(BlockStateProvider.simple(InitBlocks.YADOGA.get()))))));

    public static final RegistryObject<ConfiguredFeature<?, ?>> MEADOW_GOLDEN_FLOWER = CONFIGURED_FEATURES.register("meadow_golden_flower",
            () -> new ConfiguredFeature<>(Feature.FLOWER,
                    new RandomPatchConfiguration(1, 20, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                            new SimpleBlockConfiguration(BlockStateProvider.simple(InitBlocks.MEADOW_GOLDEN_FLOWER.get()))))));

    public static final RegistryObject<ConfiguredFeature<?, ?>> FREEZE_BERRIES = CONFIGURED_FEATURES.register("freeze_berries",
            () -> new ConfiguredFeature<>(Feature.FLOWER,
                    new RandomPatchConfiguration(12, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                            new SimpleBlockConfiguration(BlockStateProvider.simple(InitBlocks.FREEZE_BERRIES.get()))))));


   public static final RegistryObject<ConfiguredFeature<?, ?>> FIRE_STEM = CONFIGURED_FEATURES.register("fire_stem",
            () -> new ConfiguredFeature<>(Feature.FLOWER,
                    new RandomPatchConfiguration(30, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                            new SimpleBlockConfiguration(BlockStateProvider.simple(InitBlocks.FIRE_STEM.get()))))));

    public static final RegistryObject<ConfiguredFeature<?, ?>> ROSE_OF_GHOSTY_TEARS = CONFIGURED_FEATURES.register("rose_of_ghosty_tears",
            () -> new ConfiguredFeature<>(Feature.FLOWER,
                    new RandomPatchConfiguration(8, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                            new SimpleBlockConfiguration(BlockStateProvider.simple(InitBlocks.ROSE_OF_GHOSTY_TEARS.get()))))));

    public static final RegistryObject<ConfiguredFeature<?, ?>> ROSE_OF_THE_MURDERER = CONFIGURED_FEATURES.register("stomble_rose",
            () -> new ConfiguredFeature<>(Feature.FLOWER,
                    new RandomPatchConfiguration(12, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                            new SimpleBlockConfiguration(BlockStateProvider.simple(InitBlocks.ROSE_OF_THE_MURDERER.get()))))));

    public static final RegistryObject<ConfiguredFeature<?, ?>> APPLE_TREE =
            CONFIGURED_FEATURES.register("apple_tree", () ->
                    new ConfiguredFeature<>(Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                            BlockStateProvider.simple(InitBlocks.APPLE_LOG.get()),
                            new StraightTrunkPlacer(5, 6, 3),
                            BlockStateProvider.simple(InitBlocks.APPLE_LEAVES.get()),
                            new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 4),
                            new TwoLayersFeatureSize(1, 0, 2)).build()));

    public static final RegistryObject<ConfiguredFeature<?, ?>> APPLE_SPAWN =
            CONFIGURED_FEATURES.register("apple_spawn", () -> new ConfiguredFeature<>(Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfiguration(List.of(new WeightedPlacedFeature(
                            ModPlacedFeatures.APPLE_CHECKED.getHolder().get(),
                            0.5F)), ModPlacedFeatures.APPLE_CHECKED.getHolder().get())));

   public static final Supplier<List<OreConfiguration.TargetBlockState>> STRANGE_SHIP_ORES = Suppliers.memoize(() -> List.of(
            OreConfiguration.target(new BlockMatchTest(Blocks.END_STONE), InitBlocks.STRANGE_SHIP.get().defaultBlockState())));
    public static final RegistryObject<ConfiguredFeature<?, ?>> STRANGE_SHIP_ORE = CONFIGURED_FEATURES.register("strange_chip_ore",
            () -> new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(STRANGE_SHIP_ORES.get(), 5)));

    public static void register(IEventBus eventBus) {
        CONFIGURED_FEATURES.register(eventBus);
    }
}
