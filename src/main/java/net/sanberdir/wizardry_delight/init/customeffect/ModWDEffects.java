package net.sanberdir.wizardry_delight.init.customeffect;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.sanberdir.wizardry_delight.WizardryDelight;

public class ModWDEffects {
    public static final DeferredRegister<MobEffect> MOB_EFFECTS
            = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, WizardryDelight.MODID);

    public static final RegistryObject<MobEffect> TASTY_FOOD = MOB_EFFECTS.register("tasty_food",
            () -> new EffectTastyFood(MobEffectCategory.HARMFUL, 550077));

    public static void register(IEventBus eventBus) {
        MOB_EFFECTS.register(eventBus);
    }
}
