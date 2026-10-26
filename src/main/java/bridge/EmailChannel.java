package bridge;

/** Part 1 — concrete implementor. */
public class EmailChannel implements NotificationChannel {
    @Override
    public void send(String message) {
        System.out.println("[EMAIL] " + message);
    }
}
