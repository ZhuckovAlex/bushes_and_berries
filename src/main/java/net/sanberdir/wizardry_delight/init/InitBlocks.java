package net.sanberdir.wizardry_delight.init;

import net.minecraft.core.BlockPos;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.sanberdir.wizardry_delight.WizardryDelight;
import net.sanberdir.wizardry_delight.init.customblock.*;
import net.sanberdir.wizardry_delight.init.trees.AppleTree;

import java.util.function.Supplier;

public class InitBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, WizardryDelight.MOD_ID);

// Растения
    public static final RegistryObject<Block> DRYER = registerBlockWithoutBlockItem("dryer",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD).sound(SoundType.WOOD).noOcclusion()));

    public static final RegistryObject<Block> DRAGOLIT_GRID = registerBlock("dragolit_grid",
            () -> new IronBarsBlock(BlockBehaviour.Properties.of(Material.METAL).sound(SoundType.METAL).strength(2.5F).noOcclusion()),ModCreativeModeTab.BUSHES);
    public static final RegistryObject<Block> DRAGOLIT_BLOCK = registerBlock("dragolit_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL).sound(SoundType.METAL).strength(5).noOcclusion()),ModCreativeModeTab.BUSHES);
    public static final RegistryObject<Block> WD_SPAWNER = registerBlock("wd_spawner",
            () -> new WDSpawner(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE)
                    .noOcclusion().strength(4F).explosionResistance(20F).randomTicks()), ModCreativeModeTab.BUSHES);
    public static final RegistryObject<Block> SUGAR_SACK = registerBlock("sugar_sack",
            () -> new FacingBlock(BlockBehaviour.Properties.of(Material.DIRT).sound(SoundType.WOOL).noOcclusion()), ModCreativeModeTab.BUSHES);

    public static final RegistryObject<Block> COASTAL_STEEP = registerBlockWithoutBlockItem("coastal_steep",
            () -> new CoastalSteepBlock(BlockBehaviour.Properties.of(Material.PLANT).sound(SoundType.GRASS).noCollission()));

    public static final RegistryObject<Block> CHARNIKA = registerBlockWithoutBlockItem("charnika",
            () -> new BlackBerries(BlockBehaviour.Properties.of(Material.PLANT).randomTicks().noCollission().sound(SoundType.SWEET_BERRY_BUSH)));
    public static final RegistryObject<Block> YADOGA = registerBlockWithoutBlockItem("yadoga",
            () -> new BlueBerries(BlockBehaviour.Properties.of(Material.PLANT).randomTicks().noCollission().sound(SoundType.SWEET_BERRY_BUSH)));

    public static final RegistryObject<Block> FREEZE_BERRIES = registerBlockWithoutBlockItem("freeze_berries",
            () -> new FreezeBerries(BlockBehaviour.Properties.of(Material.PLANT).randomTicks().noCollission().sound(SoundType.SWEET_BERRY_BUSH)));

    public static final RegistryObject<Block> FIRE_STEM = registerBlockWithoutBlockItem("fire_stem",
            () -> new FireRod(BlockBehaviour.Properties.of(Material.PLANT).noCollission().randomTicks().instabreak().sound(SoundType.GRASS).emissiveRendering(InitBlocks::always)));

    public static final RegistryObject<Block> ROSE_OF_GHOSTY_TEARS = registerBlockWithoutBlockItem("rose_of_ghosty_tears",
            () -> new SoulRose(BlockBehaviour.Properties.of(Material.PLANT).noCollission().randomTicks().instabreak().sound(SoundType.GRASS)));

    public static final RegistryObject<Block> ROSE_OF_THE_MURDERER = registerBlockWithoutBlockItem("rose_of_the_murderer",
            () -> new StombleRose(BlockBehaviour.Properties.of(Material.PLANT).noCollission().randomTicks().instabreak().sound(SoundType.GRASS)));

    public static final RegistryObject<Block> ROSE_OF_THE_MURDERER2 = registerBlockWithoutBlockItem("rose_of_the_murderer2",
            () -> new StombleRose2(BlockBehaviour.Properties.of(Material.PLANT).noCollission().randomTicks().instabreak().sound(SoundType.GRASS)));

    public static final RegistryObject<Block> SPATIAL_ORCHID = registerBlockWithoutBlockItem("spatial_orchid",
            () -> new Orhidea(BlockBehaviour.Properties.of(Material.PLANT).noCollission().randomTicks().instabreak().sound(SoundType.GRASS)));

    public static final RegistryObject<Block> MEADOW_GOLDEN_FLOWER = registerBlockWithoutBlockItem("meadow_golden_flower",
            () -> new GoldenRose(BlockBehaviour.Properties.of(Material.PLANT).noCollission().randomTicks().instabreak().sound(SoundType.GRASS)));
    // Деревья
    // Яблоня
    public static final RegistryObject<Block> APPLE_LOG = registerBlock("apple_log",
            () -> new FlameBlockRotate(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)), ModCreativeModeTab.BUSHES);

    public static final RegistryObject<Block> WIZARD_PIE = registerBlock("wizard_pie",
            () -> new WizardPie(BlockBehaviour.Properties.of(Material.CAKE).strength(0.5F).sound(SoundType.WOOL).randomTicks()), ModCreativeModeTab.BUSHES);
    public static final RegistryObject<Block> APPLE_WOOD = registerBlock("apple_wood",
            () -> new FlameBlockRotate(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)), ModCreativeModeTab.BUSHES);
    public static final RegistryObject<Block> APPLE_LEAVES_NOAPPLE = registerBlockWithoutBlockItem("apple_leaves_noapple",
            () -> new FlameLeavesNoapple(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));
    public static final RegistryObject<Block> STRIPPED_APPLE_LOG = registerBlock("stripped_apple_log",
            () -> new FlameBlockRotate(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)), ModCreativeModeTab.BUSHES);
    public static final RegistryObject<Block> STRIPPED_APPLE_WOOD = registerBlock("stripped_apple_wood",
            () -> new FlameBlockRotate(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)), ModCreativeModeTab.BUSHES);
    public static final RegistryObject<Block> APPLE_LEAVES = registerAppleLeaves("apple_leaves",
            () -> Items.APPLE);
    private static RegistryObject<Block> registerAppleLeaves(String name, Supplier<Item> fruit) {
        final RegistryObject<Block> BLOCK = BLOCKS.register(name, () -> new FlameLeavesApple(BlockBehaviour.Properties.of(Material.LEAVES)
                .strength(0.2F)
                .randomTicks()
                .sound(SoundType.GRASS)
                .noOcclusion()
                .isSuffocating((p1, p2, p3) -> false)
                .isViewBlocking((p1, p2, p3) -> false),
                fruit
        ));
        return BLOCK;
    }
    public static final RegistryObject<Block> APPLE_SAPLING = registerBlockWithoutBlockItem("apple_sapling",
            () -> new FlameSaplings(new AppleTree(), BlockBehaviour.Properties.of(Material.PLANT).noCollission()
                    .randomTicks().instabreak().sound(SoundType.GRASS)));

    public static final RegistryObject<Block> APPLE_BLOCK = registerBlockWithoutBlockItem("apple_block",
            () -> new AppleBlock(BlockBehaviour.Properties.of(Material.PLANT).noCollission()
                    .randomTicks().instabreak().sound(SoundType.GRASS)));
    public static final RegistryObject<Block> GREEN_APPLE_BLOCK = registerBlockWithoutBlockItem("green_apple_block",
            () -> new AppleBlock(BlockBehaviour.Properties.of(Material.PLANT).noCollission()
                    .randomTicks().instabreak().sound(SoundType.GRASS)));
    public static final RegistryObject<Block> SMALL_GREEN_APPLE_BLOCK = registerBlockWithoutBlockItem("small_green_apple_block",
            () -> new AppleBlock(BlockBehaviour.Properties.of(Material.PLANT).noCollission()
                    .randomTicks().instabreak().sound(SoundType.GRASS)));
    public static final RegistryObject<Block> APPLE_PLANKS = registerBlock("apple_planks",
            () -> new FlameBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(2.0F, 3.0F)
                    .sound(SoundType.WOOD)), ModCreativeModeTab.BUSHES);

    public static final RegistryObject<Block> A_BLOCK_OF_SPARKING_POLLEN = registerBlock("a_block_of_sparkling_pollen",
            () -> new FallingBlock(BlockBehaviour.Properties.of(Material.SAND).strength(0.2F, 30)
                    .sound(SoundType.SAND)), ModCreativeModeTab.BUSHES);


    public static final RegistryObject<Block> STRANGE_SHIP = registerBlock("strange_chip",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_BLACK).requiresCorrectToolForDrops()
                    .strength(30.0F, 1200.0F).sound(SoundType.ANCIENT_DEBRIS)), ModCreativeModeTab.BUSHES);

    public static final RegistryObject<Block> APPLE_STAIRS = registerBlock("apple_stairs",
            () -> new FlameStairsBlock(() -> InitBlocks.APPLE_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of(Material.WOOD).strength(2).sound(SoundType.WOOD)),
            ModCreativeModeTab.BUSHES);
    public static final RegistryObject<Block> APPLE_FENCE = registerBlockWithoutBlockItem("apple_fence",
            () -> new FlameFenceBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> APPLE_FENCE_GATE = registerBlockWithoutBlockItem("apple_fence_gate",
            () -> new FlameGateFenceBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> APPLE_SLAB = registerBlock("apple_slab",
            () -> new FlameSlabBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2).sound(SoundType.WOOD)), ModCreativeModeTab.BUSHES);

    public static final RegistryObject<Block> APPLE_BUTTON = registerBlock("apple_button",
            () -> new FlameButton(BlockBehaviour.Properties.of(Material.DECORATION)
                    .strength(2).sound(SoundType.WOOD)), ModCreativeModeTab.BUSHES);

    public static final RegistryObject<Block> APPLE_PRESSURE_PLATE = registerBlockWithoutBlockItem("apple_pressure_plate",
            () -> new FlamePressurePlate(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> APPLE_DOOR = registerBlock("apple_door",
            () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2).sound(SoundType.WOOD).noOcclusion()), ModCreativeModeTab.BUSHES);
    public static final RegistryObject<Block> APPLE_TRAPDOOR = registerBlock("apple_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2).sound(SoundType.WOOD).noOcclusion()), ModCreativeModeTab.BUSHES);
    public static final RegistryObject<Block> WARPED_WART = registerBlockWithoutBlockItem("warped_wart",
            () -> new WarpedWartBlock(BlockBehaviour.Properties.of(Material.PLANT, MaterialColor.COLOR_RED)
                    .noCollission().randomTicks().sound(SoundType.NETHER_WART)));

    // Ниже идёт код регистрации не трогать!!!
    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }


    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                            CreativeModeTab tab) {
        return InitItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }
    private static <T extends Block> RegistryObject<T> registerBlockWithoutBlockItem(String name, Supplier<T> block) {
        return BLOCKS.register(name, block);
    }
    private static boolean always(BlockState p_50775_, BlockGetter p_50776_, BlockPos p_50777_) {
        return true;
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}