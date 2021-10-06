package baunilla.knowledgebooks;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;

public class KnowledgeBooks {
	public static final String MOD_ID = "knowledgebooks";
	public static final String MOD_NAME = "Knowledge Books";

	public static void init() {
		log("Initialized");
	}

	public static void log(String message, Level level) {
		LogManager.getLogger(MOD_NAME).log(level, message);
	}
	public static void log(String message) {
		LogManager.getLogger(MOD_NAME).log(Level.INFO, message);
	}
}
