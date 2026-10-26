package decorator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class OrderTest {

    private static final double DELTA = 0.001;
    private final Order order = new Order();
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

    // getTotalCost

    @Test
    void emptyOrderCostsZero() {
        assertEquals(0.0, order.getTotalCost(), DELTA);
    }

    @Test
    void totalIsSumOfItemCosts() {
        order.addItem(new FakeFoodItem("Plain", 1.00));
        order.addItem(new FakeFoodItem("Fancy", 2.50));
        assertEquals(3.50, order.getTotalCost(), DELTA);
    }

    // addItem

    @Test
    void addingAnItemIncreasesTheTotal() {
        order.addItem(new FakeFoodItem("Plain", 1.00));
        assertEquals(1.00, order.getTotalCost(), DELTA);
    }

    @Test
    void addedItemsKeepTheirToppingCosts() {
        order.addItem(new Cheese(new FakeFoodItem("Plain", 1.00)));
        assertEquals(1.75, order.getTotalCost(), DELTA);
    }

    // printOrder

    @Test
    void printOrderListsEachItem() {
        order.addItem(new FakeFoodItem("Plain", 1.00));
        order.addItem(new FakeFoodItem("Fancy", 2.50));
        order.printOrder();
        assertTrue(output.toString().contains("Plain"), "printed order should list Plain");
        assertTrue(output.toString().contains("Fancy"), "printed order should list Fancy");
    }

    @Test
    void printOrderShowsTheTotal() {
        order.addItem(new FakeFoodItem("Plain", 1.00));
        order.addItem(new FakeFoodItem("Fancy", 2.50));
        order.printOrder();
        assertTrue(output.toString().contains("3.50"), "printed order should show the total 3.50");
    }
}
