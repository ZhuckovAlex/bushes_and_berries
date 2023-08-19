package net.sanberdir.wizardry_delight.intigration;

import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.gui.builder.IRecipeLayoutBuilder;
import mezz.jei.api.gui.drawable.IDrawable;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.recipe.IFocusGroup;
import mezz.jei.api.recipe.RecipeIngredientRole;
import mezz.jei.api.recipe.RecipeType;
import mezz.jei.api.recipe.category.IRecipeCategory;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.sanberdir.wizardry_delight.BetterBrewingRecipe;
import net.sanberdir.wizardry_delight.WizardryDelight;

public class BetterBrewingRecipeJei implements IRecipeCategory<BetterBrewingRecipe> {

    public static final ResourceLocation UID = new ResourceLocation(WizardryDelight.MODID, "better_brewing");
    public static final ResourceLocation TEXTURE = new ResourceLocation(WizardryDelight.MODID, "minecraft:textures/gui/container/brewing_stand.png");

    private final IDrawable background;
    private final IDrawable icon;

    public BetterBrewingRecipeJei(IGuiHelper helper){
        this.background = helper.createDrawable(TEXTURE, 0,0,256,256);
        this.icon = helper.createDrawableIngredient(VanillaTypes.ITEM_STACK, new ItemStack(Items.BREWING_STAND));
    }

    @Override
    public RecipeType<BetterBrewingRecipe> getRecipeType() {
        return BrewingJei1.INFUSION_TYPE;
    }

    @Override
    public Component getTitle() {
        return Component.literal("Brewing better recipe");
    }

    @Override
    public IDrawable getBackground() {
        return this.background;
    }

    @Override
    public IDrawable getIcon() {
        return this.icon;
    }

    @Override
    public void setRecipe(IRecipeLayoutBuilder builder, BetterBrewingRecipe recipe, IFocusGroup focuses) {

    }
}
