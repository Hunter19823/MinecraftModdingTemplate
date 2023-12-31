package pie.ilikepiefoo.moddingtemplate.forge;

import me.shedaniel.architectury.platform.forge.EventBuses;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import pie.ilikepiefoo.moddingtemplate.ModdingTemplate;

@Mod(ModdingTemplate.MOD_ID)
public class ModdingTemplateForge {
    public ModdingTemplateForge() {
        // Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(ModdingTemplate.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        ModdingTemplate.init();
    }
}