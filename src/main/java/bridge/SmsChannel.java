package bridge;

/** Part 1 — concrete implementor. */
public class SmsChannel implements NotificationChannel {
    @Override
    public void send(String message) {
        System.out.println("[SMS] " + message);
    }
}
