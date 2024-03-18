package novamachina.exnjei.data;

import javax.annotation.Nonnull;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.data.event.GatherDataEvent;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {
  private DataGenerators() {}

  @SubscribeEvent
  public static void gatherData(@Nonnull final GatherDataEvent event) {
    DataGenerator generator = event.getGenerator();
    PackOutput output = generator.getPackOutput();
    generator.addProvider(event.includeClient(), new LangProvider(output, "en_us"));
  }
}
