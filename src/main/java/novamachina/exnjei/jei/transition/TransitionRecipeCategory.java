package novamachina.exnjei.jei.transition;

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
import novamachina.exnihilosequentia.world.item.crafting.TransitionRecipe;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class TransitionRecipeCategory implements IRecipeCategory<TransitionRecipe> {

  @Nonnull
  public static final ResourceLocation UID =
      new ResourceLocation(ExNihiloConstants.ModIds.EX_NIHILO_SEQUENTIA, "transition");

  @Nonnull
  private static final ResourceLocation texture =
      new ResourceLocation(
          ExNihiloConstants.ModIds.EX_NIHILO_SEQUENTIA, "textures/gui/jei_fluid_transform.png");

  @Nonnull private final IDrawableStatic background;

  public TransitionRecipeCategory(@Nonnull final IGuiHelper guiHelper) {
    this.background = guiHelper.createDrawable(texture, 0, 0, 166, 63);
  }

  @Nonnull
  @Override
  public IDrawable getBackground() {
    return background;
  }

  @Override
  @Nullable
  public IDrawable getIcon() {
    return null;
  }

  @Override
  public RecipeType<TransitionRecipe> getRecipeType() {
    return new RecipeType<>(UID, TransitionRecipe.class);
  }

  @Nonnull
  @Override
  public Component getTitle() {
    return Component.translatable("jei.category.transition");
  }

  @Override
  public void setRecipe(
      IRecipeLayoutBuilder builder, TransitionRecipe recipe, IFocusGroup focuses) {
    builder
        .addSlot(RecipeIngredientRole.INPUT, 48, 10)
        .addIngredient(NeoForgeTypes.FLUID_STACK, recipe.getFluidInTank());
    builder.addSlot(RecipeIngredientRole.INPUT, 75, 37).addIngredients(recipe.getCatalyst());
    builder
        .addSlot(RecipeIngredientRole.OUTPUT, 102, 10)
        .addIngredient(NeoForgeTypes.FLUID_STACK, recipe.getResult());
  }
}
