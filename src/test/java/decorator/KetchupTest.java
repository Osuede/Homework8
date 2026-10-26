package decorator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class KetchupTest {

    private static final double DELTA = 0.001;
    private final FoodItem plain = new FakeFoodItem("Plain", 1.00);

    // getDescription

    @Test
    void descriptionAddsKetchupToWrappedItem() {
        assertEquals("Plain, Ketchup", new Ketchup(plain).getDescription());
    }

    // getCost

    @Test
    void costAddsKetchupPriceToWrappedItem() {
        assertEquals(1.25, new Ketchup(plain).getCost(), DELTA);
    }
}
