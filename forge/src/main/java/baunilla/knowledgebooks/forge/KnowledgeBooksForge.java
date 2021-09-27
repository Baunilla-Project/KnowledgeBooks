package baunilla.knowledgebooks.forge;

import baunilla.knowledgebooks.KnowledgeBooks;
import me.shedaniel.architectury.platform.forge.EventBuses;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(KnowledgeBooks.MOD_ID)
public class KnowledgeBooksForge {
    public KnowledgeBooksForge() {
        // Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(KnowledgeBooks.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        
        KnowledgeBooks.init();
    }
}
