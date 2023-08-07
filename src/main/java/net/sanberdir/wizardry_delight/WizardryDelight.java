package net.sanberdir.wizardry_delight;

import net.minecraft.world.item.alchemy.Potions;
import net.minecraft.world.level.block.ComposterBlock;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.brewing.BrewingRecipeRegistry;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import net.sanberdir.wizardry_delight.init.InitBlocks;
import net.sanberdir.wizardry_delight.init.InitItems;

import net.sanberdir.wizardry_delight.init.customeffect.ModWDEffects;

import net.sanberdir.wizardry_delight.sounds.CustomSoundEvents;
import net.sanberdir.wizardry_delight.world.feature.ModConfiguredFeatures;
import net.sanberdir.wizardry_delight.world.feature.ModPlacedFeatures;
import software.bernie.geckolib3.GeckoLib;

@Mod(WizardryDelight.MODID)
public class WizardryDelight
{
    // Define mod id in a common place for everything to reference
    public static final String MODID = "wizardry_delight";
    // Directly reference a slf4j logger


    public WizardryDelight()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(this::commonSetup);
        // Register the commonSetup method for modloading
        InitItems.register(modEventBus);
        InitBlocks.register(modEventBus);
        ModWDEffects.register(modEventBus);
        CustomSoundEvents.register(modEventBus);
        GeckoLib.initialize();
        ModConfiguredFeatures.register(modEventBus);
        ModPlacedFeatures.register(modEventBus);
        MinecraftForge.EVENT_BUS.register(this);

    }
    private void commonSetup(final FMLCommonSetupEvent event)
    {

    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {

    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {
            event.enqueueWork(() -> {
                ComposterBlock.COMPOSTABLES.put(InitItems.MEADOW_GOLDEN_FLOWER.get(), 0.2f);
                ComposterBlock.COMPOSTABLES.put(InitItems.ROSE_OF_GHOSTY_TEARS.get(), 0.2f);
                ComposterBlock.COMPOSTABLES.put(InitItems.ROSE_OF_THE_MURDERER.get(), 0.2f);
                ComposterBlock.COMPOSTABLES.put(InitItems.YADOGA.get(), 0.2f);
                ComposterBlock.COMPOSTABLES.put(InitItems.BLACK_BERRIES.get(), 0.2f);
                ComposterBlock.COMPOSTABLES.put(InitItems.FREEZE_BERRIES.get(), 0.2f);
                ComposterBlock.COMPOSTABLES.put(InitItems.FIRE_STEM.get(), 0.2f);
                ComposterBlock.COMPOSTABLES.put(InitItems.APPLE_LEAVES.get(), 0.2f);
                ComposterBlock.COMPOSTABLES.put(InitItems.APPLE_SAPLING.get(), 0.2f);
                ComposterBlock.COMPOSTABLES.put(InitItems.SPATIAL_ORCHID.get(), 0.2f);
                ComposterBlock.COMPOSTABLES.put(InitItems.WARPED_WART.get(), 0.2f);

                BrewingRecipeRegistry.addRecipe(new BetterBrewingRecipe(Potions.WATER,
                        InitItems.WARPED_WART.get(), Potions.AWKWARD));
            });
        }
    }
}