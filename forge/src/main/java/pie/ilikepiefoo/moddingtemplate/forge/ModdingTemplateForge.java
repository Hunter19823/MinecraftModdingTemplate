package pie.ilikepiefoo.moddingtemplate.forge;

import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.common.NeoForge;
import pie.ilikepiefoo.moddingtemplate.ModdingTemplate;

@Mod(ModdingTemplate.MOD_ID)
public class ModdingTemplateForge {
    public ModdingTemplateForge() {
        // Register this mod instance with Neoforge's event bus.
        NeoForge.EVENT_BUS.register(this);
        ModdingTemplate.init();
    }
}