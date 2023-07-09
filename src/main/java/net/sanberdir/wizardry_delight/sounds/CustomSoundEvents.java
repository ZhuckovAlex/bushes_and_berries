package net.sanberdir.wizardry_delight.sounds;

import com.google.common.collect.ImmutableList;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraftforge.common.util.ForgeSoundType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.sanberdir.wizardry_delight.WizardryDelight;

public class CustomSoundEvents {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, WizardryDelight.MODID);

    public static final RegistryObject<SoundEvent> NYAMNYAM =
            registerSoundEvent("nyamnyam");
    public static final RegistryObject<SoundEvent> NYAMNYAM_END =
            registerSoundEvent("nyamnyam_end");
    public static final RegistryObject<SoundEvent> WIZARDRY_DELIGHT_JAM =
            registerSoundEvent("wizardry_delight_jam");




    private static RegistryObject<SoundEvent> registerSoundEvent(String name) {
        return SOUND_EVENTS.register(name, () -> new SoundEvent(new ResourceLocation(WizardryDelight.MODID, name)));
    }

    public static void register(IEventBus eventBus) {
        SOUND_EVENTS.register(eventBus);
    }
}
