package decorator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class OnionsTest {

    private static final double DELTA = 0.001;
    private final FoodItem plain = new FakeFoodItem("Plain", 1.00);

    // getDescription

    @Test
    void descriptionAddsOnionsToWrappedItem() {
        assertEquals("Plain, Onions", new Onions(plain).getDescription());
    }

    // getCost

    @Test
    void costAddsOnionsPriceToWrappedItem() {
        assertEquals(1.50, new Onions(plain).getCost(), DELTA);
    }
}
