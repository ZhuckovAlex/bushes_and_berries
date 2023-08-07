package net.sanberdir.wizardry_delight.event;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.client.event.RegisterColorHandlersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.sanberdir.wizardry_delight.WizardryDelight;
import net.sanberdir.wizardry_delight.armor.entity.custom.HatArmorRenderer;
import net.sanberdir.wizardry_delight.init.customblock.FlameLeavesApple;
import net.sanberdir.wizardry_delight.init.customblock.GoldenRose;
import net.sanberdir.wizardry_delight.init.customitem.HatArmorItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

@Mod.EventBusSubscriber(modid = WizardryDelight.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModEventClientBusEvents {
    @SubscribeEvent
    public static void registerArmorRenderers(final EntityRenderersEvent.AddLayers event) {
        GeoArmorRenderer.registerArmorRenderer(HatArmorItem.class, new HatArmorRenderer());
    }
    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientSideHandler {
        @SubscribeEvent
        public static void blockColorLoad(RegisterColorHandlersEvent.Block event) {
            FlameLeavesApple.blockColorLoad(event);
        }
    }

}
