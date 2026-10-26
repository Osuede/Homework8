package bridge;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmailChannelTest {

    private final EmailChannel channel = new EmailChannel();
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
    void sendLabelsTheMessageAsEmail() {
        channel.send("Payment received");
        assertTrue(output.toString().contains("[EMAIL]"), "email output should contain [EMAIL]");
    }
}
