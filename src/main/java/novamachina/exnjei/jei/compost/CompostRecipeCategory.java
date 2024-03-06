package novamachina.exnjei.jei.compost;

import com.google.common.collect.Lists;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import mezz.jei.api.gui.builder.IRecipeLayoutBuilder;
import mezz.jei.api.gui.builder.IRecipeSlotBuilder;
import mezz.jei.api.gui.drawable.IDrawable;
import mezz.jei.api.gui.drawable.IDrawableStatic;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.recipe.IFocusGroup;
import mezz.jei.api.recipe.RecipeIngredientRole;
import mezz.jei.api.recipe.RecipeType;
import mezz.jei.api.recipe.category.IRecipeCategory;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Blocks;
import novamachina.exnihilosequentia.common.utility.ExNihiloConstants;
import novamachina.exnihilosequentia.world.item.crafting.CompostRecipe;

public class CompostRecipeCategory implements IRecipeCategory<CompostRecipe> {

  @Nonnull
  public static final ResourceLocation UID =
      new ResourceLocation(ExNihiloConstants.ModIds.EX_NIHILO_SEQUENTIA, "compost");

  @Nonnull
  private static final ResourceLocation texture =
      new ResourceLocation(
          ExNihiloConstants.ModIds.EX_NIHILO_SEQUENTIA, "textures/gui/jei_mid.png");

  @Nonnull private final IDrawableStatic background;

  public CompostRecipeCategory(@Nonnull final IGuiHelper guiHelper) {
    this.background = guiHelper.createDrawable(texture, 0, 168, 166, 58);
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

  @Nonnull
  @Override
  public RecipeType<CompostRecipe> getRecipeType() {
    return new RecipeType<>(UID, CompostRecipe.class);
  }

  @Nonnull
  @Override
  public Component getTitle() {
    return Component.translatable("jei.category.compost");
  }

  @Override
  public void setRecipe(IRecipeLayoutBuilder builder, CompostRecipe recipe, IFocusGroup focuses) {
    IRecipeSlotBuilder output = builder.addSlot(RecipeIngredientRole.OUTPUT, 3, 21);
    output.addItemStack(new ItemStack(Blocks.DIRT));

    ItemStack[] inputArray = recipe.getInput().getItems();

    if (inputArray.length > 21) {
      IRecipeSlotBuilder inputs = builder.addSlot(RecipeIngredientRole.INPUT, 39, 3);
      inputs.addItemStacks(Lists.newArrayList(inputArray));
    } else {
      for (int i = 0; i < inputArray.length; i++) {
        final int slotX = 39 + (i % 7 * 18);
        final int slotY = 3 + i / 7 * 18;

        @Nonnull final ItemStack stack = inputArray[i];

        IRecipeSlotBuilder input = builder.addSlot(RecipeIngredientRole.INPUT, slotX, slotY);
        input.addItemStack(stack);
        input.addTooltipCallback(new CompostTooltipCallback());
      }
    }
  }
}