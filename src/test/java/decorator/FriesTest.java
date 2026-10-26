package decorator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class FriesTest {

    private static final double DELTA = 0.001;
    private final Fries fries = new Fries();

    // getDescription

    @Test
    void descriptionIsFries() {
        assertEquals("Fries", fries.getDescription());
    }

    // getCost

    @Test
    void costIsBasePrice() {
        assertEquals(2.49, fries.getCost(), DELTA);
    }
}
