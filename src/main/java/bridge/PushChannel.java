package bridge;

/**
 * Part 3 — new channel added WITHOUT touching any payment class.
 */
public class PushChannel implements NotificationChannel {
    @Override
    public void send(String message) {
        System.out.println("[PUSH] " + message);
    }
}
