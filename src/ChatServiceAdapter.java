class LegacyChatService {
    public void sendLegacyMessage(String message) {
        System.out.println("Legacy Chat: " + message);
    }

    public void sendNotification(String user, String message) {
        System.out.println("Notification to " + user + ": " + message);
    }

    public void logMessage(String message) {
        System.out.println("Logging message: " + message);
    }
}


interface ChatService {
    void sendMessage(String message);
    void sendUserNotification(String user, String message);
    void logChatMessage(String message);
}


class ChatServiceAdapter implements ChatService {
    private LegacyChatService legacyChatService;

    public ChatServiceAdapter(LegacyChatService legacyChatService) {
        this.legacyChatService = legacyChatService;
    }

    @Override
    public void sendMessage(String message) {
        legacyChatService.sendLegacyMessage(message);
    }

    @Override
    public void sendUserNotification(String user, String message) {
        legacyChatService.sendNotification(user, message);
    }

    @Override
    public void logChatMessage(String message) {
        legacyChatService.logMessage(message);
    }
}
