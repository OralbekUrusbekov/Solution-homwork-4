public class Main {
    public static void main(String[] args) {
        ConfigurationManager configManager = ConfigurationManager.getInstance();
        System.out.println("🔹 Max Players: " + configManager.getConfig("maxPlayers"));
        System.out.println("🔹 Default Language: " + configManager.getConfig("defaultLanguage"));
        configManager.printConfig();

        System.out.println("\n====================\n");

        LegacyChatService legacyChatService = new LegacyChatService();
        ChatService chatService = new ChatServiceAdapter(legacyChatService);


        chatService.sendMessage("Hello world!");
        chatService.sendUserNotification("Alice", "You have a new message!");
        chatService.logChatMessage("This is a logged message.");
    }
}
