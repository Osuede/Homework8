package bridge;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class OnlinePaymentNotificationTest {

    private final RecordingChannel channel = new RecordingChannel();

    // notifyCustomer

    @Test
    void notifyCustomerSendsExactlyOneMessage() {
        new OnlinePaymentNotification(channel, "PayPal").notifyCustomer("Alice", 49.99);
        assertEquals(1, channel.messages.size(), "one notification should be sent through the channel");
    }

    @Test
    void messageIncludesCustomerName() {
        new OnlinePaymentNotification(channel, "PayPal").notifyCustomer("Alice", 49.99);
        assertTrue(channel.lastMessage().contains("Alice"), "message should name the customer");
    }

    @Test
    void messageIncludesAmount() {
        new OnlinePaymentNotification(channel, "PayPal").notifyCustomer("Alice", 49.99);
        assertTrue(channel.lastMessage().contains("49.99"), "message should include the amount");
    }

    @Test
    void messageIncludesPayPal() {
        new OnlinePaymentNotification(channel, "PayPal").notifyCustomer("Alice", 49.99);
        assertTrue(channel.lastMessage().contains("PayPal"), "message should say it was paid with PayPal");
    }

    @Test
    void messageIncludesCreditCard() {
        new OnlinePaymentNotification(channel, "Credit Card").notifyCustomer("Bob", 120.00);
        assertTrue(channel.lastMessage().contains("Credit Card"), "message should say it was paid by credit card");
    }
}
