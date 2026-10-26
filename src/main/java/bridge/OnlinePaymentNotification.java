package bridge;

/** Part 1 — refined abstraction for online payments (credit card or PayPal). */
public class OnlinePaymentNotification extends PaymentNotification {
    private String method; // "Credit Card" or "PayPal"

    public OnlinePaymentNotification(NotificationChannel channel, String method) {
        super(channel);
        this.method = method;
    }

    @Override
    public void notifyCustomer(String customerName, double amount) {
        String message = "Hi " + customerName + ", we received your " + method
                + " payment of $" + String.format("%.2f", amount) + ". Thank you for your order!";
        channel.send(message);
    }
}
