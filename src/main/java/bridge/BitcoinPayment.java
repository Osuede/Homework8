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
        // TODO: build a message that includes customerName, the word "Bitcoin" and the amount
        //       and send it through channel.send(...)
    }
}
