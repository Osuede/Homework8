package bridge;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class CashOnDeliveryPaymentTest {

    private final RecordingChannel channel = new RecordingChannel();
    private final CashOnDeliveryPayment payment = new CashOnDeliveryPayment(channel);

    // notifyCustomer

    @Test
    void notifyCustomerSendsExactlyOneMessage() {
        payment.notifyCustomer("Alice", 49.99);
        assertEquals(1, channel.messages.size(), "one notification should be sent through the channel");
    }

    @Test
    void messageIncludesCustomerName() {
        payment.notifyCustomer("Alice", 49.99);
        assertTrue(channel.lastMessage().contains("Alice"), "message should name the customer");
    }

    @Test
    void messageIncludesAmount() {
        payment.notifyCustomer("Alice", 49.99);
        assertTrue(channel.lastMessage().contains("49.99"), "message should include the amount");
    }

    @Test
    void messageMentionsCash() {
        payment.notifyCustomer("Alice", 49.99);
        assertTrue(channel.lastMessage().toLowerCase().contains("cash"), "message should mention cash");
    }
}
