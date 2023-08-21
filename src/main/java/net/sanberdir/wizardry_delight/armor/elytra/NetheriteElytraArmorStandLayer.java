package net.sanberdir.wizardry_delight.armor.elytra;

import net.minecraft.client.model.ArmorStandArmorModel;
import net.minecraft.client.model.geom.EntityModelSet;
import net.minecraft.client.renderer.entity.ArmorStandRenderer;
import net.minecraft.client.renderer.entity.layers.ElytraLayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.decoration.ArmorStand;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.sanberdir.wizardry_delight.WizardryDelight;

@OnlyIn(Dist.CLIENT)
public class NetheriteElytraArmorStandLayer extends ElytraLayer<ArmorStand, ArmorStandArmorModel> {
    private static final ResourceLocation TEXTURE_ELYTRA = new ResourceLocation(WizardryDelight.MODID,
            "textures/entity/nezydra.png");

    public NetheriteElytraArmorStandLayer(ArmorStandRenderer armorStandRenderer,
                                          EntityModelSet entityModelSet) {
        super(armorStandRenderer, entityModelSet);
    }

    @Override
    public boolean shouldRender(ItemStack stack, ArmorStand entity) {
        return stack.getItem() == WizardryDelight.MAG_ELITRA.get();
    }

    @Override
    public ResourceLocation getElytraTexture(ItemStack stack, ArmorStand entity) {
        return TEXTURE_ELYTRA;
    }
}
