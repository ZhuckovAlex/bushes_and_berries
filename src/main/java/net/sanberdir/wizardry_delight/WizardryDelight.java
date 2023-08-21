package net.sanberdir.wizardry_delight;

import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.EntityModelSet;
import net.minecraft.client.renderer.entity.ArmorStandRenderer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.player.PlayerRenderer;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.decoration.ArmorStand;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.alchemy.Potions;
import net.minecraft.world.level.block.ComposterBlock;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.brewing.BrewingRecipeRegistry;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import net.minecraftforge.fml.loading.FMLEnvironment;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.sanberdir.wizardry_delight.armor.elytra.DragoliteElytraArmorStandLayer;
import net.sanberdir.wizardry_delight.armor.elytra.DragoliteElytraLayer;
import net.sanberdir.wizardry_delight.entity.ModEntities;
import net.sanberdir.wizardry_delight.init.*;

import net.sanberdir.wizardry_delight.init.customeffect.ModWDEffects;

import net.sanberdir.wizardry_delight.init.customitem.ModElytra;
import net.sanberdir.wizardry_delight.particle.ModParticles;
import net.sanberdir.wizardry_delight.sounds.CustomSoundEvents;
import net.sanberdir.wizardry_delight.world.biome.ModBiomes;
import net.sanberdir.wizardry_delight.world.feature.ModConfiguredFeatures;
import net.sanberdir.wizardry_delight.world.feature.ModPlacedFeatures;
import software.bernie.geckolib3.GeckoLib;
import top.theillusivec4.curios.api.SlotTypeMessage;
import top.theillusivec4.curios.api.SlotTypePreset;
import vectorwing.farmersdelight.common.registry.ModItems;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
@Mod(WizardryDelight.MODID)
public class WizardryDelight
{
    // Define mod id in a common place for everything to reference
    public static final String MODID = "wizardry_delight";

    // Create a Deferred Register to hold Items which will all be registered under the "examplemod" namespace
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);

    // Creates a new Block with the id "examplemod:example_block", combining the namespace and path
    public static final Logger LOGGER = LogManager.getLogger();
    // Creates a new BlockItem with the id "examplemod:example_block", combining the namespace and path
    public static final RegistryObject<Item> SOUL_STONE_DISCHARGED = ITEMS.register("soul_stone_discharged", () -> new Item(new Item.Properties().stacksTo(1).tab(ModCreativeModeTab.BUSHES)));
    public static final RegistryObject<Item> MAG_ELITRA =  ITEMS.register("mag_elitra", () ->new ModElytra(ModArmorMaterials.ELITRA, EquipmentSlot.CHEST, new Item.Properties().durability(1200).tab(ModCreativeModeTab.BUSHES).fireResistant()));

    // Directly reference a slf4j logger

    @OnlyIn(Dist.CLIENT)
    private void registerElytraLayer(EntityRenderersEvent event) {
        if(event instanceof EntityRenderersEvent.AddLayers addLayersEvent){
            EntityModelSet entityModels = addLayersEvent.getEntityModels();
            addLayersEvent.getSkins().forEach(s -> {
                LivingEntityRenderer<? extends Player, ? extends EntityModel<? extends Player>> livingEntityRenderer = addLayersEvent.getSkin(s);
                if(livingEntityRenderer instanceof PlayerRenderer playerRenderer){
                    playerRenderer.addLayer(new DragoliteElytraLayer(playerRenderer, entityModels));
                }
            });
            LivingEntityRenderer<ArmorStand, ? extends EntityModel<ArmorStand>> livingEntityRenderer = addLayersEvent.getRenderer(EntityType.ARMOR_STAND);
            if(livingEntityRenderer instanceof ArmorStandRenderer armorStandRenderer){
                armorStandRenderer.addLayer(new DragoliteElytraArmorStandLayer(armorStandRenderer, entityModels));
            }

        }
    }

    public WizardryDelight()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(this::commonSetup);
        modEventBus.addListener(this::onClientSetup);
        if(FMLEnvironment.dist.isClient()) modEventBus.addListener(this::registerElytraLayer);
        // Register the commonSetup method for modloading
        // Register the Deferred Register to the mod event bus so items get registered
        ITEMS.register(modEventBus);
        InitItems.register(modEventBus);
        InitBlocks.register(modEventBus);
        InitPaintings.register(modEventBus);
        ModEntities.register(modEventBus);
        ModBiomes.register(modEventBus);
        ModWDEffects.register(modEventBus);
        CustomSoundEvents.register(modEventBus);
        ModParticles.register(modEventBus);
        GeckoLib.initialize();
        ModConfiguredFeatures.register(modEventBus);
        ModPlacedFeatures.register(modEventBus);
        MinecraftForge.EVENT_BUS.register(this);

    }
    private void commonSetup(final FMLCommonSetupEvent event)
    {
        InterModComms.sendTo("curios", SlotTypeMessage.REGISTER_TYPE,
                () ->  SlotTypePreset.RING.getMessageBuilder().build());
    }


    private static final Collection<AbstractMap.SimpleEntry<Runnable, Integer>> workQueue = new ConcurrentLinkedQueue<>();
    public static void queueServerWork(int tick, Runnable action) {
        workQueue.add(new AbstractMap.SimpleEntry(action, tick));
    }
    @SubscribeEvent
    public void tick(TickEvent.ServerTickEvent event) {
        if (event.phase == TickEvent.Phase.END) {
            List<AbstractMap.SimpleEntry<Runnable, Integer>> actions = new ArrayList<>();
            workQueue.forEach(work -> {
                work.setValue(work.getValue() - 1);
                if (work.getValue() == 0)
                    actions.add(work);
            });
            actions.forEach(e -> e.getKey().run());
            workQueue.removeAll(actions);
        }
    }
    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {

    }
    private void onClientSetup(FMLClientSetupEvent event) {
        // broken Property
        ItemProperties.register(MAG_ELITRA.get(), new ResourceLocation(MODID, "broken"),
                (stack, arg1, arg2, arg3) -> ModElytra.isUseable(stack) ? 0 : 1);
    }
    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {
            ItemProperties.register(WizardryDelight.MAG_ELITRA.get(), new ResourceLocation(MODID, "broken"),
                    (stack, arg1, arg2, arg3) -> ModElytra.isUseable(stack) ? 0 : 1);
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

                BrewingRecipeRegistry.addRecipe(new BetterBrewingRecipe2(Potions.WATER,
                        Items.COCOA_BEANS, ModItems.HOT_COCOA.get()));

            });
        }

    }
}