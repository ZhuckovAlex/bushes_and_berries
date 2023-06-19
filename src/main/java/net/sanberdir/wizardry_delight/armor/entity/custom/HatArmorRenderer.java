package net.sanberdir.wizardry_delight.armor.entity.custom;

import net.sanberdir.wizardry_delight.init.customitem.HatArmorItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class HatArmorRenderer extends GeoArmorRenderer<HatArmorItem> {
    public HatArmorRenderer() {
        super(new HatArmorModel());

        this.headBone = "armorHead";
        this.bodyBone = "armorBody";
        this.rightArmBone = "armorRightArm";
        this.leftArmBone = "armorLeftArm";
        this.rightLegBone = "armorLeftLeg";
        this.leftLegBone = "armorRightLeg";
        this.rightBootBone = "armorLeftBoot";
        this.leftBootBone = "armorRightBoot";
    }
}
