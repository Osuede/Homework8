package bridge;

public class BridgeDriver {
    public static void main(String[] args) {
        // ---------- Part 1 ----------
        System.out.println("===== Part 1 =====");

        System.out.println("-- Online + Email --");
        PaymentNotification onlineEmail = new OnlinePaymentNotification(new EmailChannel(), "Credit Card");
        onlineEmail.notifyCustomer("Alice", 49.99);

        System.out.println("-- Online + SMS --");
        PaymentNotification onlineSms = new OnlinePaymentNotification(new SmsChannel(), "PayPal");
        onlineSms.notifyCustomer("Bob", 120.00);

        System.out.println("-- Cash on delivery + Email --");
        PaymentNotification cashEmail = new CashOnDeliveryPayment(new EmailChannel());
        cashEmail.notifyCustomer("Carol", 35.50);

        System.out.println("-- Cash on delivery + SMS --");
        PaymentNotification cashSms = new CashOnDeliveryPayment(new SmsChannel());
        cashSms.notifyCustomer("Dave", 18.75);

    }
}
