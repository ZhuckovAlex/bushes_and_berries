package net.sanberdir.wizardry_delight;

import net.minecraft.client.Minecraft;
import net.minecraft.client.color.block.BlockColors;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.EntityModelSet;
import net.minecraft.client.renderer.Sheets;
import net.minecraft.client.renderer.blockentity.SignRenderer;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.player.PlayerRenderer;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.sanberdir.wizardry_delight.entity.boat.ModBoatRenderer;
import net.sanberdir.wizardry_delight.entity.boat.ModEntityData;
import net.sanberdir.wizardry_delight.entity.chest_boat.ModChestBoatRenderer;
import net.sanberdir.wizardry_delight.entity.sign.ModBlockEntities;
import net.sanberdir.wizardry_delight.init.customblock.ModWoodType;

import java.util.Map;

public class ClientOnlyRegistrar {
    private IEventBus eventBus;

    public ClientOnlyRegistrar(IEventBus eventBus) {
        this.eventBus = eventBus;
    }

    /**
     * Registers any events that must ONLY be registered on a client.
     * This may include things like graphics rendering, user input processing, etc.
     */
    public void registerClientOnlyEvents() {
        // Register the doClientStuff method for modloading
        eventBus.addListener(this::doClientStuff);
    }

    /**
     * Sets up client specific logic, such as rendering types.
     *
     * In this case we are performing the following:
     * - adding the cut-out render type to our custom grass block so that overlays display properly on that block.
     * - Rendering some textures as cutout mipmaps so that opacity is adhered to
     * - Binding the sign renderer to our custom sign tile entity.
     * - Adding our custom wood types to the atlas, which enables them to be valid sign materials.
     *
     * @param event The client setup event
     */
    private void doClientStuff(final FMLClientSetupEvent event) {
        event.enqueueWork(() -> {
            Sheets.addWoodType(ModWoodType.APPLE_WOOD);
        });
    }

    @Mod.EventBusSubscriber(modid = WizardryDelight.MOD_ID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ClientRegistryEvents {
        @SubscribeEvent
        public static <T extends LivingEntity, M extends HumanoidModel<T>> void onEntityRendererRegistry(final EntityRenderersEvent.AddLayers registerAddedLayerEvent) {
            PlayerRenderer playerSkinRenderer = registerAddedLayerEvent.getSkin("default");

            addLayerToEntityRenderer(playerSkinRenderer, registerAddedLayerEvent.getEntityModels());

            for (Map.Entry<EntityType<?>, EntityRenderer<?>> entry : Minecraft.getInstance().getEntityRenderDispatcher().renderers.entrySet()) {
                EntityRenderer<?> renderer = entry.getValue();
                if (renderer instanceof LivingEntityRenderer) {
                    LivingEntityRenderer<LivingEntity, HumanoidModel<LivingEntity>> livingEntityRenderer = (LivingEntityRenderer<LivingEntity, HumanoidModel<LivingEntity>>) renderer;

                    addLayerToEntityRenderer(livingEntityRenderer, registerAddedLayerEvent.getEntityModels());
                }
            }
        }
        private static <T extends LivingEntity, M extends HumanoidModel<T>> void addLayerToEntityRenderer(LivingEntityRenderer<T, M> renderer, EntityModelSet modelSet) {
            RenderLayer<T, M> bipedArmorLayer = null;
            for (RenderLayer<T, M> layerRenderer : renderer.layers) {
                if (layerRenderer != null) {
                    if (layerRenderer.getClass() == HumanoidArmorLayer.class) {
                        bipedArmorLayer = layerRenderer;
                        break;
                    }
                }
            }

            if (bipedArmorLayer != null) {

            }
        }

        @SubscribeEvent
        public static void onEntityRendererRegistry(final EntityRenderersEvent.RegisterRenderers registerEntityEvent) {
            registerEntityEvent.registerEntityRenderer(ModEntityData.MOD_BOAT_DATA, ModBoatRenderer::new);


            registerEntityEvent.registerEntityRenderer(ModEntityData.MOD_CHEST_BOAT_DATA, ModChestBoatRenderer::new);
            registerEntityEvent.registerBlockEntityRenderer(ModBlockEntities.SIGN_ENTITY_TYPE, SignRenderer::new);

        }
        /**
         * Used to register new layers to existing entity renderers into the game using the mod event bus
         * The will loop through all skin layers to get player layer renderers and find the biped armour layer to add custom armour layers
         * NOTE: Layers cannot be added to a renderer while looping through skin layers, else it will cause a concurrency exception. Hence adding them outside of the loop
         *
         * @param registerAddedLayerEvent The registry event with which entity layer definitions will have new layers registered
         */


        /**
         * Adds all modded layers to the model set of the given entity
         *
         * @param renderer The renderer used to render this entity's layers
         * @param modelSet The model set for the entity we want to add modded layers to
         * @param <T>      Generic representing the entity we are adding modded layers to
         * @param <M>      Generic representing the model of the entity we are adding modded layers to
         */


        /**
         * Used to register entity renderers into the game using the mod event bus
         *
         * @param registerEntityEvent The registry event with which entity renderers will be registered
         */

        /**
         * Used to register entity layer definitions into the game using the mod event bus
         * All new entity layers need to be defined here to be loaded into the game, including those rendering for vanilla entities
         *
         * @param registerLayerDefinitionEvent The registry event with which entity layer definitions will be registered
         */
        @SubscribeEvent
        public static void onEntityRendererRegistry(final EntityRenderersEvent.RegisterLayerDefinitions registerLayerDefinitionEvent) {

        }

        /**
         * Used to register block color handlers into the game using the mod event bus
         *
         * @param event The registry event with which block color handlers will be registered
         */
        @SubscribeEvent
        public static void onBlockColorHandlerRegistration(RegisterColorHandlersEvent.Block event) {
            BlockColors blockColors = event.getBlockColors();
            //blockColors.register(GrassBlockColor.instance, ModBlocks.GRASS);
        }

        /**
         * Used to register particle factories into the game using the mod event bus
         *
         * @param particleFactoryRegistryEvent The registry event with which particle factories will be registered
         */
        @SubscribeEvent
        public static void onParticleFactoryRegistry(final RegisterParticleProvidersEvent particleFactoryRegistryEvent) {

        }

        @Mod.EventBusSubscriber(value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.FORGE)
        public static class ClientEventHandler {
            @SubscribeEvent
            public static void onRenderPlayerEvent(RenderPlayerEvent.Pre event) {
                // TODO: Try manipulating the player arm in here (or in the POST event) to perform an action
                event.getRenderer().getModel().rightArm.visible = true;
            }

            @SubscribeEvent
            public static void onRenderPlayerEvent(RenderPlayerEvent.Post event) {
                event.getRenderer().getModel().rightArm.visible = true;
            }

            @SubscribeEvent
            public static void onRenderPlayerEvent(RenderHandEvent event) {

            }
        }
    }
}
