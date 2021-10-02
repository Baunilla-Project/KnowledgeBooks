package baunilla.knowledgebooks;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;

public class KnowledgeBooks {
	public static final String MOD_ID = "knowledgebooks";
	public static final String MOD_NAME = "Knowledge Books";

	public static void init() {
		log(Level.INFO, "Initialized");
	}

	public static void log(Level level, String message) {
		LogManager.getLogger().log(level, message);
	}
}
