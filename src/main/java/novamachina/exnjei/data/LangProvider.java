package novamachina.exnjei.data;

import net.minecraft.data.PackOutput;
import novamachina.exnjei.EXNJEI;
import novamachina.novacore.data.AbstractLangGenerator;

public class LangProvider extends AbstractLangGenerator {
  protected LangProvider(PackOutput output, String locale) {
    super(output, EXNJEI.MOD_ID, locale);
  }

  @Override
  protected void addTranslations() {
    add("jei.sieve.dropChance", "Drop Chance");
    add("jei.category.compost", "Composting");
    add("jei.category.crushing", "Crushing");
    add("jei.category.harvest", "Harvesting");
    add("jei.category.heat", "Crucible Heat Sources");
    add("jei.category.melting", "Crucible Melting");
    add("jei.category.fired_melting", "Fired Crucible Melting");
    add("jei.category.precipitate", "Precipitate");
    add("jei.category.dry_sifting", "Sifting");
    add("jei.category.wet_sifting", "Waterlogged Sifting");
    add("jei.category.solidifying", "Solidifying");
    add("jei.category.transition", "Transition");
  }
}
