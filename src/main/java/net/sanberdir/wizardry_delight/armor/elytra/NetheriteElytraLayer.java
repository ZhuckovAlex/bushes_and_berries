package net.sanberdir.wizardry_delight.armor.elytra;

import net.minecraft.client.model.PlayerModel;
import net.minecraft.client.model.geom.EntityModelSet;
import net.minecraft.client.player.AbstractClientPlayer;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.layers.ElytraLayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.sanberdir.wizardry_delight.WizardryDelight;

@OnlyIn(Dist.CLIENT)
public class NetheriteElytraLayer
        extends ElytraLayer<AbstractClientPlayer, PlayerModel<AbstractClientPlayer>> {

    private static final ResourceLocation TEXTURE_ELYTRA = new ResourceLocation(WizardryDelight.MODID,
            "textures/entity/nezydra.png");

    public NetheriteElytraLayer(
            RenderLayerParent<AbstractClientPlayer, PlayerModel<AbstractClientPlayer>> rendererIn,
            EntityModelSet modelSet) {
        super(rendererIn, modelSet);
    }

    @Override
    public boolean shouldRender(ItemStack stack, AbstractClientPlayer entity) {
        return stack.getItem() == WizardryDelight.MAG_ELITRA.get();
    }

    @Override
    public ResourceLocation getElytraTexture(ItemStack stack, AbstractClientPlayer entity) {
        return TEXTURE_ELYTRA;
    }

}
