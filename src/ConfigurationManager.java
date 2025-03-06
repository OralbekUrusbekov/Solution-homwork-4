public class ConfigurationManager {
    private static ConfigurationManager instance;
    private String maxPlayers = "100";
    private String defaultLanguage = "en";
    private String gameDifficulty = "medium";

    private ConfigurationManager() {}

    public static ConfigurationManager getInstance() {
        if (instance == null) {
            instance = new ConfigurationManager();
        }
        return instance;
    }

    public String getConfig(String key) {
        switch (key) {
            case "maxPlayers": return maxPlayers;
            case "defaultLanguage": return defaultLanguage;
            case "gameDifficulty": return gameDifficulty;
            default: return "Unknown Key";
        }
    }

    public void printConfig() {
        System.out.println("📌 Current Configurations:");
        System.out.println("maxPlayers → " + maxPlayers);
        System.out.println("defaultLanguage → " + defaultLanguage);
        System.out.println("gameDifficulty → " + gameDifficulty);
    }
}
