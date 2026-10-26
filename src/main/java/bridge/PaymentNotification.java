package bridge;

/**
 * ABSTRACTION side of the bridge.
 * Holds a reference to a NotificationChannel — this reference IS the "bridge".
 * Subclasses decide WHAT the message says; the channel decides HOW it is sent.
 */
public abstract class PaymentNotification {
    protected NotificationChannel channel;

    public PaymentNotification(NotificationChannel channel) {
        this.channel = channel;
    }

    /** Build the payment-specific message and hand it to the channel. */
    public abstract void notifyCustomer(String customerName, double amount);
}
