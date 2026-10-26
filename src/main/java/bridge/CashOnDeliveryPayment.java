package bridge;

/** Part 1 — refined abstraction for cash on delivery. */
public class CashOnDeliveryPayment extends PaymentNotification {

    public CashOnDeliveryPayment(NotificationChannel channel) {
        super(channel);
    }

    @Override
    public void notifyCustomer(String customerName, double amount) {
        // TODO: build a message that includes customerName, the word "cash" and the amount
        //       (e.g. "please have $49.99 in cash ready")
        //       and send it through channel.send(...)
    }
}
