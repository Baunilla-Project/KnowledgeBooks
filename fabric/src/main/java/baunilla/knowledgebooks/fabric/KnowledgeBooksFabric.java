package baunilla.knowledgebooks.fabric;

import baunilla.knowledgebooks.KnowledgeBooks;
import net.fabricmc.api.ModInitializer;

public class KnowledgeBooksFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        KnowledgeBooks.init();
    }
}
