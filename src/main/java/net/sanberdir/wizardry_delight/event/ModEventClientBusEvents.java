package net.sanberdir.wizardry_delight.event;

import net.minecraft.client.Minecraft;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.client.event.RegisterColorHandlersEvent;
import net.minecraftforge.client.event.RegisterParticleProvidersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.sanberdir.wizardry_delight.WizardryDelight;
import net.sanberdir.wizardry_delight.armor.entity.custom.armor.ClearHatArmorRenderer;
import net.sanberdir.wizardry_delight.armor.entity.custom.armor.HatArmorRenderer;
import net.sanberdir.wizardry_delight.init.customblock.FlameLeavesApple;
import net.sanberdir.wizardry_delight.init.customitem.ClearHatArmorItem;
import net.sanberdir.wizardry_delight.init.customitem.HatArmorItem;
import net.sanberdir.wizardry_delight.particle.ModParticles;
import net.sanberdir.wizardry_delight.particle.custom.RobinStarsParticles;
import net.sanberdir.wizardry_delight.particle.custom.StombleRoseParticles;
import software.bernie.geckolib3.item.GeoArmorItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

@Mod.EventBusSubscriber(modid = WizardryDelight.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModEventClientBusEvents {
    @SubscribeEvent
    public static void registerArmorRenderers(final EntityRenderersEvent.AddLayers event) {
        GeoArmorRenderer.registerArmorRenderer(HatArmorItem.class, new HatArmorRenderer());
        GeoArmorRenderer.registerArmorRenderer(ClearHatArmorItem.class, new ClearHatArmorRenderer());
    }
    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientSideHandler {
        @SubscribeEvent
        public static void blockColorLoad(RegisterColorHandlersEvent.Block event) {
            FlameLeavesApple.blockColorLoad(event);
        }
        @SubscribeEvent
        public static void registerParticleFactories(final RegisterParticleProvidersEvent event) {
            Minecraft.getInstance().particleEngine.register(ModParticles.ROBIN_STAR_PARTICLES.get(),
                    RobinStarsParticles.Provider::new);

            Minecraft.getInstance().particleEngine.register(ModParticles.STOMBLE_ROSE.get(),
                    StombleRoseParticles.Provider::new);
        }
    }

}
