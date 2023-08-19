package net.sanberdir.wizardry_delight.intigration;

import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.recipe.RecipeType;
import mezz.jei.api.registration.IRecipeCategoryRegistration;
import mezz.jei.api.registration.IRecipeRegistration;

import net.minecraft.client.Minecraft;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.RecipeManager;
import net.sanberdir.wizardry_delight.BetterBrewingRecipe;
import net.sanberdir.wizardry_delight.WizardryDelight;

import java.util.List;
import java.util.Objects;
@JeiPlugin
public class BrewingJei1 implements IModPlugin {
    public static RecipeType<BetterBrewingRecipe> INFUSION_TYPE =
            new RecipeType<>(BetterBrewingRecipeJei.UID, BetterBrewingRecipe.class);

    @Override
    public ResourceLocation getPluginUid() {
        return new ResourceLocation(WizardryDelight.MODID, "jei_plugin");
    }

    @Override
    public void registerCategories(IRecipeCategoryRegistration registration) {
        registration.addRecipeCategories(new
                BetterBrewingRecipeJei(registration.getJeiHelpers().getGuiHelper()));
    }

    @Override
    public void registerRecipes(IRecipeRegistration registration) {
        RecipeManager rm = Objects.requireNonNull(Minecraft.getInstance().level).getRecipeManager();


            }
}
