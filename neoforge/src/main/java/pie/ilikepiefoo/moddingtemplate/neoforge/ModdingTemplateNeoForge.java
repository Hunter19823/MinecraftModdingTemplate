package pie.ilikepiefoo.moddingtemplate.neoforge;

import net.neoforged.fml.common.Mod;
import pie.ilikepiefoo.moddingtemplate.ModdingTemplate;

@Mod(ModdingTemplate.MOD_ID)
public class ModdingTemplateNeoForge {
    public ModdingTemplateNeoForge() {
        // Register this mod instance with Neoforge's event bus.
        //NeoForge.EVENT_BUS.register(this);
        ModdingTemplate.init();
    }
}