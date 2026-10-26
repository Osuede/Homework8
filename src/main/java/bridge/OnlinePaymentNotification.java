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
        // TODO: build a message that includes customerName, method and the amount
        //       (format money as String.format("%.2f", amount))
        //       and send it through channel.send(...)
    }
}
