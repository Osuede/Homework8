package decorator;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import org.junit.jupiter.api.Test;

class DecoratorDriverTest {

    // main

    @Test
    void mainRunsWithoutErrors() {
        assertDoesNotThrow(() -> DecoratorDriver.main(new String[0]));
    }
}
