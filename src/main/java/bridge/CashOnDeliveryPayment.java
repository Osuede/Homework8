package bridge;

/** Part 1 — refined abstraction for cash on delivery. */
public class CashOnDeliveryPayment extends PaymentNotification {

    public CashOnDeliveryPayment(NotificationChannel channel) {
        super(channel);
    }

    @Override
    public void notifyCustomer(String customerName, double amount) {
        String message = "Hi " + customerName + ", your order is on its way. Please have $"
                + String.format("%.2f", amount) + " in cash ready for the driver.";
        channel.send(message);
    }
}
