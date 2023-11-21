package pie.ilikepiefoo.moddingtemplate.fabric;

import pie.ilikepiefoo.moddingtemplate.ModdingTemplate;
import net.fabricmc.api.ModInitializer;

public class ModdingTemplateFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        ModdingTemplate.init();
    }
}