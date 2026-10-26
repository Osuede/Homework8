package decorator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class BurgerTest {

    private static final double DELTA = 0.001;
    private final Burger burger = new Burger();

    // getDescription

    @Test
    void descriptionIsBurger() {
        assertEquals("Burger", burger.getDescription());
    }

    // getCost

    @Test
    void costIsBasePrice() {
        assertEquals(5.99, burger.getCost(), DELTA);
    }
}
