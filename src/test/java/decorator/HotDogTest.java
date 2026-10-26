package decorator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class HotDogTest {

    private static final double DELTA = 0.001;
    private final HotDog hotDog = new HotDog();

    // getDescription

    @Test
    void descriptionIsHotDog() {
        assertEquals("Hot Dog", hotDog.getDescription());
    }

    // getCost

    @Test
    void costIsBasePrice() {
        assertEquals(3.49, hotDog.getCost(), DELTA);
    }
}
