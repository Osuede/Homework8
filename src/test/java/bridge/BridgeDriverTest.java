package bridge;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import org.junit.jupiter.api.Test;

class BridgeDriverTest {

    // main

    @Test
    void mainRunsWithoutErrors() {
        assertDoesNotThrow(() -> BridgeDriver.main(new String[0]));
    }
}
