package bridge;

/**
 * Part 2 — new payment type added WITHOUT touching any channel class.
 */
public class BitcoinPayment extends PaymentNotification {

    public BitcoinPayment(NotificationChannel channel) {
        super(channel);
    }

    @Override
    public void notifyCustomer(String customerName, double amount) {
        String message = "Hi " + customerName + ", your Bitcoin payment of $"
                + String.format("%.2f", amount) + " has been confirmed.";
        channel.send(message);
    }
}
