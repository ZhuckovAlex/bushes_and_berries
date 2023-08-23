package net.sanberdir.wizardry_delight.init;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.sanberdir.wizardry_delight.WizardryDelight;
import net.sanberdir.wizardry_delight.init.customeffect.ModWDEffects;
import net.sanberdir.wizardry_delight.init.customitem.*;
import net.sanberdir.wizardry_delight.sounds.CustomSoundEvents;

public class InitItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, WizardryDelight.MOD_ID);

    public static final RegistryObject<Item> BLACK_BERRIES = ITEMS.register("black_berries",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BUSHES).food(new FoodProperties.Builder().nutrition(1).saturationMod(0.5f).alwaysEat().fast()
                    .effect(new MobEffectInstance(MobEffects.HARM, 10, 0), 1F)
                    .build())));

    public static final RegistryObject<Item> YADOGA = ITEMS.register("yadoga",
            () -> new ItemNameBlockItem(InitBlocks.YADOGA.get(),(new Item.Properties().tab(ModCreativeModeTab.BUSHES).food(new FoodProperties.Builder().nutrition(1).saturationMod(0.5f).alwaysEat().fast()
                    .effect(new MobEffectInstance(MobEffects.POISON, 80, 0), 1F)
                    .effect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 200, 0), 1F)
                    .build()))));
    public static final RegistryObject<Item> COASTAL_STEEP = ITEMS.register("coastal_steep",
            () -> new ItemNameBlockItem(InitBlocks.COASTAL_STEEP.get(),(new Item.Properties().tab(ModCreativeModeTab.BUSHES))));
    public static final RegistryObject<Item> FREEZE_BERRIES = ITEMS.register("freeze_berries",
            () -> new ItemNameBlockItem(InitBlocks.FREEZE_BERRIES.get(),(new Item.Properties().tab(ModCreativeModeTab.BUSHES).food(new FoodProperties.Builder().nutrition(1).saturationMod(1).alwaysEat().fast()
                    .effect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 80, 0), 1F)
                    .effect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 300, 0), 1F)
                    .build()))));
    public static final RegistryObject<Item> FIRE_STEM = ITEMS.register("fire_stem",
            () -> new ItemNameBlockItem(InitBlocks.FIRE_STEM.get(),(new Item.Properties().tab(ModCreativeModeTab.BUSHES))));

    public static final RegistryObject<Item> ROSE_OF_GHOSTY_TEARS = ITEMS.register("rose_of_ghosty_tears",
            () -> new ItemNameBlockItem(InitBlocks.ROSE_OF_GHOSTY_TEARS.get(),(new Item.Properties().tab(ModCreativeModeTab.BUSHES))));

    public static final RegistryObject<Item> SPATIAL_ORCHID = ITEMS.register("spatial_orchid",
            () -> new ItemNameBlockItem(InitBlocks.SPATIAL_ORCHID.get(),(new Item.Properties().tab(ModCreativeModeTab.BUSHES))));

    public static final RegistryObject<Item> ROSE_OF_THE_MURDERER = ITEMS.register("rose_of_the_murderer",
            () -> new ItemNameBlockItem(InitBlocks.ROSE_OF_THE_MURDERER.get(),(new Item.Properties().tab(ModCreativeModeTab.BUSHES))));

    public static final RegistryObject<Item> APPLE_FENCE_GATE = ITEMS.register("apple_fence_gate",
            () -> new BurnFences(InitBlocks.APPLE_FENCE_GATE.get(),(new Item.Properties().tab(ModCreativeModeTab.BUSHES))));


    public static final RegistryObject<Item> APPLE_PRESSURE_PLATE = ITEMS.register("apple_pressure_plate",
            () -> new BurnFences(InitBlocks.APPLE_PRESSURE_PLATE.get(),(new Item.Properties().tab(ModCreativeModeTab.BUSHES))));

    public static final RegistryObject<Item> APPLE_FENCE = ITEMS.register("apple_fence",
            () -> new BurnFences(InitBlocks.APPLE_FENCE.get(),(new Item.Properties().tab(ModCreativeModeTab.BUSHES))));

    public static final RegistryObject<Item> MEADOW_GOLDEN_FLOWER = ITEMS.register("meadow_golden_flower",
            () -> new ItemNameBlockItem(InitBlocks.MEADOW_GOLDEN_FLOWER.get(),(new Item.Properties().tab(ModCreativeModeTab.BUSHES))));

    public static final RegistryObject<Item> APPLE_LEAVES = ITEMS.register("apple_leaves",
            () -> new ItemNameBlockItem(InitBlocks.APPLE_LEAVES.get(),(new Item.Properties().tab(ModCreativeModeTab.BUSHES))));

    public static final RegistryObject<Item> APPLE_LEAVES_NOAPPLE = ITEMS.register("apple_leaves_noapple",
            () -> new ItemNameBlockItem(InitBlocks.APPLE_LEAVES_NOAPPLE.get(),(new Item.Properties())));


    public static final RegistryObject<Item> APPLE_SAPLING = ITEMS.register("apple_sapling",
            () -> new ItemNameBlockItem(InitBlocks.APPLE_SAPLING.get(),(new Item.Properties().tab(ModCreativeModeTab.BUSHES))));

    public static final RegistryObject<Item> WARPED_WART = ITEMS.register("warped_wart",
            () -> new ItemNameBlockItem(InitBlocks.WARPED_WART.get(),(new Item.Properties().tab(ModCreativeModeTab.BUSHES))));


    public static final RegistryObject<Item> APPLE_JAM = ITEMS.register("apple_jam",
            () -> new JamMod(new Item.Properties().tab(ModCreativeModeTab.BUSHES).food(new FoodProperties.Builder().nutrition(9).saturationMod(0.7f)
                    .effect(new MobEffectInstance(ModWDEffects.TASTY_FOOD.get(), 2400, 0), 1F)
                    .build())));

    public static final RegistryObject<Item> GLOWING_JAM = ITEMS.register("glowing_jam",
            () -> new JamMod(new Item.Properties().tab(ModCreativeModeTab.BUSHES).food(new FoodProperties.Builder().nutrition(12).saturationMod(0.167f)
                    .effect(new MobEffectInstance(MobEffects.GLOWING, 800, 0), 1F)
                    .build())));


    public static final RegistryObject<Item>  CHARNIKA_JAM = ITEMS.register("charnika_jam",
            () -> new JamMod(new Item.Properties().tab(ModCreativeModeTab.BUSHES).food(new FoodProperties.Builder().nutrition(5).saturationMod(4f)
                    .effect(new MobEffectInstance(MobEffects.LUCK, 6000, 1), 0.05f)
                    .effect(new MobEffectInstance(MobEffects.DIG_SPEED, 3600, 0), 0.7f)
                    .effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 3600, 0), 0.4f)
                    .effect(new MobEffectInstance(MobEffects.BLINDNESS, 800, 0), 0.2f)

                    .build())));


    public static final RegistryObject<Item>  YADOGA_JAM = ITEMS.register("yadoga_jam",
            () -> new JamMod(new Item.Properties().tab(ModCreativeModeTab.BUSHES).food(new FoodProperties.Builder().nutrition(6).saturationMod(0.8f)
                    .effect(new MobEffectInstance(MobEffects.POISON, 100, 0), 1F)
                    .effect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 800, 0), 1F)
                    .effect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 200, 0), 1F)
                    .build())));




    public static final RegistryObject<Item>  FREEZE_JAM = ITEMS.register("freeze_jam",
            () -> new JamMod(new Item.Properties().tab(ModCreativeModeTab.BUSHES).food(new FoodProperties.Builder().nutrition(6).saturationMod(0.5f)
                    .effect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 80, 0), 1F)
                    .effect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 3600, 0), 1F)
                    .build())));

    public static final RegistryObject<Item>  RAW_BEAR_MEET = ITEMS.register("raw_bear_meat",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BUSHES).food(new FoodProperties.Builder().nutrition(3).saturationMod(0.5f)
                    .effect(new MobEffectInstance(MobEffects.CONFUSION, 80, 0), 0.2F)
                    .effect(new MobEffectInstance(MobEffects.POISON, 80, 0), 0.02F)
                    .build())));

    public static final RegistryObject<Item>  RAW_HORSE = ITEMS.register("raw_horse",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BUSHES).food(new FoodProperties.Builder().nutrition(3).saturationMod(0.5f)
                    .effect(new MobEffectInstance(MobEffects.CONFUSION, 80, 0), 0.2F)
                    .build())));

    public static final RegistryObject<Item>  COCKED_HORSE = ITEMS.register("cocked_horse",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BUSHES)
                    .food(new FoodProperties.Builder().nutrition(8).saturationMod(0.81f)
                            .build())));

    public static final RegistryObject<Item>  COCKED_BEAR_MEET = ITEMS.register("cocked_bear_meat",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BUSHES)
                    .food(new FoodProperties.Builder().nutrition(8).saturationMod(0.81f)
                    .build())));

    public static final RegistryObject<Item>  RAW_GOATS_MEET = ITEMS.register("raw_goats_meat",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BUSHES).food(new FoodProperties.Builder().nutrition(3).saturationMod(0.5f)
                    .effect(new MobEffectInstance(MobEffects.CONFUSION, 80, 0), 0.2F)
                    .effect(new MobEffectInstance(MobEffects.POISON, 80, 0), 0.02F)
                    .build())));

    public static final RegistryObject<Item>  COCKED_GOATS_MEET = ITEMS.register("cocked_goats_meat",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BUSHES)
                    .food(new FoodProperties.Builder().nutrition(8).saturationMod(0.81f)
                            .build())));
//    public static final RegistryObject<Item>  SLICING_FROM_RAW_BEAR_MEET = ITEMS.register("slicing_from_raw_bear_meat",
//            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BUSHES).food(new FoodProperties.Builder().nutrition(1).saturationMod(0.5f)
//                    .effect(new MobEffectInstance(MobEffects.CONFUSION, 80, 0), 0.2F)
//                    .effect(new MobEffectInstance(MobEffects.POISON, 80, 0), 0.02F)
//                    .build())));
//
//    public static final RegistryObject<Item> SLICING_FROM_COCKED_BEAR_MEET = ITEMS.register("slicing_from_cocked_bear_meat",
//            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BUSHES)
//                    .food(new FoodProperties.Builder().nutrition(4).saturationMod(0.81f)
//                            .build())));

    public static final RegistryObject<Item> SWEET_JAM = ITEMS.register("sweet_jam",
            () -> new JamMod(new Item.Properties().tab(ModCreativeModeTab.BUSHES).food(new FoodProperties.Builder().nutrition(7).saturationMod(0.7f)
                    .effect(new MobEffectInstance(ModWDEffects.TASTY_FOOD.get(), 1200, 0), 1F)
                    .build())));
    public static final RegistryObject<Item> JAR = ITEMS.register("jar",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BUSHES)));

    public static final RegistryObject<Item> COASTAL_STEEP_FIBERS = ITEMS.register("coastal_steep_fibers",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BUSHES)));
    public static final RegistryObject<Item> COASTAL_STEEP_FLOWER = ITEMS.register("coastal_steep_flower",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BUSHES)));



    public static final RegistryObject<Item> KRUTNEVY_BREAD = ITEMS.register("krutnevy_bread",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BUSHES).food(new FoodProperties.Builder().nutrition(8).saturationMod(0.5F).build())));


    public static final RegistryObject<Item> SUGAR_REFINED = ITEMS.register("sugar_refined",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BUSHES).food(new FoodProperties.Builder().nutrition(2).saturationMod(1).alwaysEat().fast().build())));

    public static final RegistryObject<Item> SOUL_STONE_CHARGED = ITEMS.register("soul_stone_charged",
            () -> new Item(new Item.Properties().craftRemainder(WizardryDelight.SOUL_STONE_DISCHARGED.get()).stacksTo(1).tab(ModCreativeModeTab.BUSHES)));


    public static final RegistryObject<Item> SPARKLING_POLLEN = ITEMS.register("sparkling_pollen",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BUSHES)));

    public static final RegistryObject<Item> RING_SUPPLY = ITEMS.register("ring_supply",
            () -> new RingSupply(new Item.Properties().stacksTo(1).durability(40).tab(ModCreativeModeTab.BUSHES)));

    public static final RegistryObject<Item> CRIMSON_BONE_MEAL = ITEMS.register("crimson_bone_meal",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BUSHES)));
    public static final RegistryObject<Item> WARPED_BONE_MEAL = ITEMS.register("warped_bone_meal",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BUSHES)));

    public static final RegistryObject<Item> MEDICAL_POTATO = ITEMS.register("medical_potato",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BUSHES).food(new FoodProperties.Builder().nutrition(5).saturationMod(0.6f).alwaysEat()
                    .effect(new MobEffectInstance(MobEffects.HEAL, 1, 0), 1F)
                    .build())));

    public static final RegistryObject<Item> MUSHROOM_ON_STICK = ITEMS.register("mushroom_on_stick",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BUSHES).food(new FoodProperties.Builder().nutrition(2).saturationMod(0.3f).alwaysEat()
                    .build())));
    public static final RegistryObject<Item> COCKED_MEDICAL_POTATO = ITEMS.register("cocked_mushroom_on_stick",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BUSHES).food(new FoodProperties.Builder().nutrition(5).saturationMod(0.6f).alwaysEat()
                    .build())));


    public static final RegistryObject<Item> STRANGE_SCRAP = ITEMS.register("strange_scrap",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BUSHES)));

    public static final RegistryObject<Item> ROBIN_STICK = ITEMS.register("robin_stick",
            () -> new StarBallItem(new Item.Properties().durability(70).tab(ModCreativeModeTab.BUSHES)));

    public static final RegistryObject<Item> RAPIER = ITEMS.register("rapier",
            () -> new SwordItem(Tiers.NETHERITE, -2,-1.8f,new Item.Properties().tab(ModCreativeModeTab.BUSHES)));
    public static final RegistryObject<Item> CLEAR_DRAGOLIT_NUGGET = ITEMS.register("clear_dragolit_nugget",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BUSHES)));
    public static final RegistryObject<Item> DRAGOLIT_INGOT = ITEMS.register("dragolit_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BUSHES)));

    public static final RegistryObject<Item> SILVERAN = ITEMS.register("silveran",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BUSHES)));


    public static final RegistryObject<Item> WIZARDRY_DELIGHT_JAM = ITEMS.register("wizardry_delight_jam",
            () -> new RecordItem(8, CustomSoundEvents.WIZARDRY_DELIGHT_JAM.get() ,new Item.Properties().stacksTo(1).tab(ModCreativeModeTab.BUSHES),16));
    public static final RegistryObject<Item> CHEESE = ITEMS.register("cheese",
            () -> new Cheese(new Item.Properties().tab(ModCreativeModeTab.BUSHES)
                    .food(new FoodProperties.Builder().nutrition(20).saturationMod(1).alwaysEat()
                            .effect(new MobEffectInstance(MobEffects.REGENERATION, 200, 1), 1F)
                            .build())));
    public static final RegistryObject<Item> CHEESE_1 = ITEMS.register("cheese_1",
            () -> new Cheese1(new Item.Properties()
                    .food(new FoodProperties.Builder().nutrition(20).saturationMod(1).alwaysEat()
                            .effect(new MobEffectInstance(MobEffects.REGENERATION, 200, 1), 1F)
                            .build())));
    public static final RegistryObject<Item> CHEESE_2 = ITEMS.register("cheese_2",
            () -> new Cheese2(new Item.Properties()
                    .food(new FoodProperties.Builder().nutrition(20).saturationMod(1).alwaysEat()
                            .effect(new MobEffectInstance(MobEffects.REGENERATION, 200, 1), 1F)
                            .build())));

    public static final RegistryObject<Item> SWEET_ROLL = ITEMS.register("sweet_roll",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BUSHES)
                    .food(new FoodProperties.Builder().nutrition(12).saturationMod(1).alwaysEat()
                    .effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 2400, 2), 1F)
                    .effect(new MobEffectInstance(ModWDEffects.TASTY_FOOD.get(), 2400, 0), 1F)
                    .effect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 1200, 0), 1F)
                    .build())));

    public static final RegistryObject<Item> JAM_TONIC = ITEMS.register("jam_tonic",
            () -> new JamMod(new Item.Properties().tab(ModCreativeModeTab.BUSHES)
                    .food(new FoodProperties.Builder().nutrition(8).saturationMod(2f).alwaysEat().fast()
                    .effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 4800, 3), 1F)
                    .effect(new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 4800, 3), 1F)
                    .effect(new MobEffectInstance(MobEffects.DIG_SPEED, 1200, 8), 1F)
                    .build())));

    public static final RegistryObject<Item> JAM_INVISIBILITY = ITEMS.register("jam_invisibility",
            () -> new JamMod(new Item.Properties().tab(ModCreativeModeTab.BUSHES)
                    .food(new FoodProperties.Builder().nutrition(10).saturationMod(0.2f).alwaysEat().fast()
                            .effect(new MobEffectInstance(MobEffects.INVISIBILITY, 9600, 0), 1F)
                            .effect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 600, 0), 1F)
                            .build())));

    public static final RegistryObject<Item> LEVITAN_JAM = ITEMS.register("levitan_jam",
            () -> new JamMod(new Item.Properties().tab(ModCreativeModeTab.BUSHES)
                    .food(new FoodProperties.Builder().nutrition(20).saturationMod(0.5f).alwaysEat().fast()
                            .effect(new MobEffectInstance(MobEffects.SLOW_FALLING, 2400, 0), 1F)
                            .effect(new MobEffectInstance(MobEffects.JUMP, 2000, 1), 1F)
                            .effect(new MobEffectInstance(MobEffects.LEVITATION, 800, 5), 1F)
                            .build())));
    public static final RegistryObject<Item> HEALING_DEW = ITEMS.register("healing_dew",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BUSHES)));
    public static final RegistryObject<Item> A_DROP_OF_LOVE = ITEMS.register("a_drop_of_love",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BUSHES)));

    public static final RegistryObject<Item> STAR_BALL = ITEMS.register("star_ball",
            () -> new StarBallItem(new Item.Properties()));

    public static final RegistryObject<Item> THE_PILLAGERS_CHEST = ITEMS.register("the_pillagers_chest",
            () -> new SneakItem(new Item.Properties().tab(ModCreativeModeTab.BUSHES)));

    public static final RegistryObject<Item> GOLDEN_CHEST_KING_PILLAGER = ITEMS.register("golden_chest_king_pillager",
            () -> new SneakItemGold(new Item.Properties().tab(ModCreativeModeTab.BUSHES)));

    public static final RegistryObject<Item> HAT_HELMET = ITEMS.register("hat_helmet",
            () -> new HatArmorItem(ModArmorMaterials.HAT, EquipmentSlot.HEAD,
                    new Item.Properties().durability(105).tab(ModCreativeModeTab.BUSHES)));



    public static final RegistryObject<Item> HAT_HELMET_CLEAR = ITEMS.register("hat_helmet_clear",
            () -> new ClearHatArmorItem(ModArmorMaterials.HAT_CLEAR, EquipmentSlot.HEAD,
                    new Item.Properties().durability(105).tab(ModCreativeModeTab.BUSHES)));
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
