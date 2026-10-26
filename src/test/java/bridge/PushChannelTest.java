package bridge;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/** Part 3 */
class PushChannelTest {

    private final PushChannel channel = new PushChannel();
    private final ByteArrayOutputStream output = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    void captureOutput() {
        System.setOut(new PrintStream(output));
    }

    @AfterEach
    void restoreOutput() {
        System.setOut(originalOut);
    }

    // send

    @Test
    void sendPrintsTheMessage() {
        channel.send("Payment received");
        assertTrue(output.toString().contains("Payment received"), "the message should be printed");
    }

    @Test
    void sendLabelsTheMessageAsPush() {
        channel.send("Payment received");
        assertTrue(output.toString().contains("[PUSH]"), "push output should contain [PUSH]");
    }

    @Test
    void pushWorksWithAnExistingPaymentType() {
        new CashOnDeliveryPayment(channel).notifyCustomer("Alice", 49.99);
        assertTrue(output.toString().contains("[PUSH]"), "an old payment type should work with the new channel");
    }
}
