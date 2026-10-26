package decorator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CheeseTest {

    private static final double DELTA = 0.001;
    private final FoodItem plain = new FakeFoodItem("Plain", 1.00);

    // getDescription

    @Test
    void descriptionAddsCheeseToWrappedItem() {
        assertEquals("Plain, Cheese", new Cheese(plain).getDescription());
    }

    // getCost

    @Test
    void costAddsCheesePriceToWrappedItem() {
        assertEquals(1.75, new Cheese(plain).getCost(), DELTA);
    }

    // stacking toppings

    @Test
    void toppingsStackDescriptions() {
        FoodItem item = new Cheese(new Ketchup(plain));
        assertEquals("Plain, Ketchup, Cheese", item.getDescription());
    }

    @Test
    void toppingsStackCosts() {
        FoodItem item = new Cheese(new Ketchup(plain));
        assertEquals(2.00, item.getCost(), DELTA);
    }
}
