package bridge;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SmsChannelTest {

    private final SmsChannel channel = new SmsChannel();
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
    void sendLabelsTheMessageAsSms() {
        channel.send("Payment received");
        assertTrue(output.toString().contains("[SMS]"), "SMS output should contain [SMS]");
    }
}
