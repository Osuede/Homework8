package bridge;

/**
 * IMPLEMENTOR side of the bridge.
 * Every channel (Email, SMS, Push) knows HOW to deliver a message,
 * but knows nothing about payment types.
 */
public interface NotificationChannel {
    void send(String message);
}
