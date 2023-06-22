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
import net.sanberdir.wizardry_delight.armor.ModArmorMaterials;
import net.sanberdir.wizardry_delight.init.customeffect.ModWDEffects;
import net.sanberdir.wizardry_delight.init.customitem.*;

public class InitItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, WizardryDelight.MODID);

    public static final RegistryObject<Item> BLACK_BERRIES = ITEMS.register("black_berries",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BUSHES).food(new FoodProperties.Builder().nutrition(1).saturationMod(0.5f).alwaysEat().fast()
                    .effect(new MobEffectInstance(MobEffects.HARM, 10, 0), 1F)
                    .build())));
    public static final RegistryObject<Item> YADOGA = ITEMS.register("yadoga",
            () -> new ItemNameBlockItem(InitBlocks.YADOGA.get(),(new Item.Properties().tab(ModCreativeModeTab.BUSHES).food(new FoodProperties.Builder().nutrition(1).saturationMod(0.5f).alwaysEat().fast()
                    .effect(new MobEffectInstance(MobEffects.POISON, 80, 0), 1F)
                    .effect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 200, 0), 1F)
                    .build()))));
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

    public static final RegistryObject<Item> APPLE_SAPLING = ITEMS.register("apple_sapling",
            () -> new ItemNameBlockItem(InitBlocks.APPLE_SAPLING.get(),(new Item.Properties().tab(ModCreativeModeTab.BUSHES))));

    public static final RegistryObject<Item> WARPED_WART = ITEMS.register("warped_wart",
            () -> new ItemNameBlockItem(InitBlocks.WARPED_WART.get(),(new Item.Properties().tab(ModCreativeModeTab.BUSHES))));


    public static final RegistryObject<Item> APPLE_JAM = ITEMS.register("apple_jam",
            () -> new JamMod(new Item.Properties().tab(ModCreativeModeTab.BUSHES).food(new FoodProperties.Builder().nutrition(4).saturationMod(0.2f)
                    .effect(new MobEffectInstance(ModWDEffects.TASTY_FOOD.get(), 2400, 0), 1F)
                    .build())));

    public static final RegistryObject<Item> GLOWING_JAM = ITEMS.register("glowing_jam",
            () -> new JamMod(new Item.Properties().tab(ModCreativeModeTab.BUSHES).food(new FoodProperties.Builder().nutrition(4).saturationMod(0.2f)
                    .effect(new MobEffectInstance(MobEffects.GLOWING, 800, 0), 1F)
                    .build())));


    public static final RegistryObject<Item>  CHARNIKA_JAM = ITEMS.register("charnika_jam",
            () -> new JamMod(new Item.Properties().tab(ModCreativeModeTab.BUSHES).food(new FoodProperties.Builder().nutrition(5).saturationMod(0.2f)
                    .effect(new MobEffectInstance(MobEffects.LUCK, 6000, 1), 0.05f)
                    .effect(new MobEffectInstance(MobEffects.DIG_SPEED, 3600, 0), 0.7f)
                    .effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 3600, 0), 0.4f)
                    .effect(new MobEffectInstance(MobEffects.BLINDNESS, 3600, 0), 0.2f)

                    .build())));


    public static final RegistryObject<Item>  YADOGA_JAM = ITEMS.register("yadoga_jam",
            () -> new JamMod(new Item.Properties().tab(ModCreativeModeTab.BUSHES).food(new FoodProperties.Builder().nutrition(3).saturationMod(0.2f)
                    .effect(new MobEffectInstance(MobEffects.POISON, 100, 0), 1F)
                    .effect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 600, 0), 1F)
                    .effect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 200, 0), 1F)
                    .build())));




    public static final RegistryObject<Item>  FREEZE_JAM = ITEMS.register("freeze_jam",
            () -> new JamMod(new Item.Properties().tab(ModCreativeModeTab.BUSHES).food(new FoodProperties.Builder().nutrition(2).saturationMod(0.2f)
                    .effect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 80, 0), 1F)
                    .effect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 3600, 0), 1F)
                    .build())));

    public static final RegistryObject<Item>  RAW_BEAR_MEET = ITEMS.register("raw_bear_meat",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BUSHES).food(new FoodProperties.Builder().nutrition(4).saturationMod(0.1f)
                    .effect(new MobEffectInstance(MobEffects.CONFUSION, 80, 0), 0.2F)
                    .effect(new MobEffectInstance(MobEffects.HUNGER, 800, 0), 0.16F)
                    .effect(new MobEffectInstance(MobEffects.POISON, 80, 0), 0.02F)
                    .build())));

    public static final RegistryObject<Item>  COCKED_BEAR_MEET = ITEMS.register("cocked_bear_meat",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BUSHES).food(new FoodProperties.Builder().nutrition(12).saturationMod(0.8f)
                    .build())));

    public static final RegistryObject<Item> SWEET_JAM = ITEMS.register("sweet_jam",
            () -> new JamMod(new Item.Properties().tab(ModCreativeModeTab.BUSHES).food(new FoodProperties.Builder().nutrition(4).saturationMod(0.2f)
                    .effect(new MobEffectInstance(ModWDEffects.TASTY_FOOD.get(), 2400, 0), 1F)
                    .build())));
    public static final RegistryObject<Item> JAR = ITEMS.register("jar",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BUSHES)));

    public static final RegistryObject<Item> SUGAR_REFINED = ITEMS.register("sugar_refined",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BUSHES).food(new FoodProperties.Builder().nutrition(2).saturationMod(1).alwaysEat().fast().build())));

    public static final RegistryObject<Item> SOUL_STONE = ITEMS.register("soul_stone",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BUSHES)));


    public static final RegistryObject<Item> CRIMSON_BONE_MEAL = ITEMS.register("crimson_bone_meal",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BUSHES)));
    public static final RegistryObject<Item> WARPED_BONE_MEAL = ITEMS.register("warped_bone_meal",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BUSHES)));

  /*  public static final RegistryObject<Item> STRANGE_SCRAP = ITEMS.register("strange_scrap",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BUSHES)));
    public static final RegistryObject<Item> CLEAR_DRAGOLIT_NUGGET = ITEMS.register("clear_dragolit_nugget",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BUSHES)));
    public static final RegistryObject<Item> DRAGOLIT_INGOT = ITEMS.register("dragolit_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BUSHES)));*/

    public static final RegistryObject<Item> SILVERAN = ITEMS.register("silveran",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BUSHES)));
    public static final RegistryObject<Item> CHEESE = ITEMS.register("cheese",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BUSHES)
                    .food(new FoodProperties.Builder().nutrition(20).saturationMod(1).alwaysEat().fast()
                            .effect(new MobEffectInstance(MobEffects.REGENERATION, 200, 1), 1F)
                            .build())));

    public static final RegistryObject<Item> SWEET_ROLL = ITEMS.register("sweet_roll",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BUSHES).food(new FoodProperties.Builder().nutrition(12).saturationMod(1).alwaysEat().fast()
                    .effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 2400, 2), 1F)
                    .effect(new MobEffectInstance(ModWDEffects.TASTY_FOOD.get(), 2400, 0), 1F)
                    .build())));

    public static final RegistryObject<Item> HEALING_DEW = ITEMS.register("healing_dew",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BUSHES)));
    public static final RegistryObject<Item> A_DROP_OF_LOVE = ITEMS.register("a_drop_of_love",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BUSHES)));

    public static final RegistryObject<Item> THE_PILLAGERS_CHEST = ITEMS.register("the_pillagers_chest",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BUSHES)));

    public static final RegistryObject<Item> GOLDEN_CHEST_KING_PILLAGER = ITEMS.register("golden_chest_king_pillager",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BUSHES)));

    public static final RegistryObject<Item> HAT_HELMET = ITEMS.register("hat_helmet",
            () -> new HatArmorItem(ModArmorMaterials.HAT, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModeTab.BUSHES)));
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
