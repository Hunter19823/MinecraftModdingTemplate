package pie.ilikepiefoo.moddingtemplate.fabric;

import net.fabricmc.api.ModInitializer;
import pie.ilikepiefoo.moddingtemplate.ModdingTemplate;

public class ModdingTemplateFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        ModdingTemplate.init();
    }
}