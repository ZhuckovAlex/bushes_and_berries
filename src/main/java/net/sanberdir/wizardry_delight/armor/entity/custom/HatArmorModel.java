package net.sanberdir.wizardry_delight.armor.entity.custom;

import net.minecraft.resources.ResourceLocation;
import net.sanberdir.wizardry_delight.WizardryDelight;
import net.sanberdir.wizardry_delight.init.customitem.HatArmorItem;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class HatArmorModel extends AnimatedGeoModel<HatArmorItem> {

    public ResourceLocation getModelResource(HatArmorItem object) {
        return new ResourceLocation(WizardryDelight.MODID, "geo/hat.geo.json");
    }

    public ResourceLocation getTextureResource(HatArmorItem object) {
        return new ResourceLocation(WizardryDelight.MODID, "textures/models/armor/hat.png");
    }

    public ResourceLocation getAnimationResource(HatArmorItem animatable) {
        return new ResourceLocation(WizardryDelight.MODID, "animations/armor_animation.json");
    }
}
