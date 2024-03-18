package novamachina.exnjei.jei.solidifying;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import mezz.jei.api.gui.builder.IRecipeLayoutBuilder;
import mezz.jei.api.gui.drawable.IDrawable;
import mezz.jei.api.gui.drawable.IDrawableStatic;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.neoforge.NeoForgeTypes;
import mezz.jei.api.recipe.IFocusGroup;
import mezz.jei.api.recipe.RecipeIngredientRole;
import mezz.jei.api.recipe.RecipeType;
import mezz.jei.api.recipe.category.IRecipeCategory;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import novamachina.exnihilosequentia.common.utility.ExNihiloConstants;
import novamachina.exnihilosequentia.world.item.crafting.SolidifyingRecipe;

public class SolidifyingRecipeCategory implements IRecipeCategory<SolidifyingRecipe> {

  @Nonnull
  public static final ResourceLocation UID =
      new ResourceLocation(ExNihiloConstants.ModIds.EX_NIHILO_SEQUENTIA, "solidifying");

  @Nonnull
  private static final ResourceLocation texture =
      new ResourceLocation(
          ExNihiloConstants.ModIds.EX_NIHILO_SEQUENTIA, "textures/gui/jei_fluid_on_top.png");

  @Nonnull private final IDrawableStatic background;

  public SolidifyingRecipeCategory(@Nonnull final IGuiHelper guiHelper) {
    this.background = guiHelper.createDrawable(texture, 0, 0, 166, 63);
  }

  @Nonnull
  @Override
  public IDrawable getBackground() {
    return background;
  }

  @Nullable
  @Override
  public IDrawable getIcon() {
    return null;
  }

  @Override
  public RecipeType<SolidifyingRecipe> getRecipeType() {
    return new RecipeType<>(UID, SolidifyingRecipe.class);
  }

  @Nonnull
  @Override
  public Component getTitle() {
    return Component.translatable("jei.category.solidifying");
  }

  @Override
  public void setRecipe(
      IRecipeLayoutBuilder builder, SolidifyingRecipe recipe, IFocusGroup focuses) {
    builder
        .addSlot(RecipeIngredientRole.INPUT, 48, 37)
        .addIngredient(NeoForgeTypes.FLUID_STACK, recipe.getFluidInTank());
    builder
        .addSlot(RecipeIngredientRole.INPUT, 75, 10)
        .addIngredient(NeoForgeTypes.FLUID_STACK, recipe.getFluidOnTop());
    builder.addSlot(RecipeIngredientRole.OUTPUT, 102, 37).addItemStack(recipe.getResult());
  }
}