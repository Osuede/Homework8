package decorator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class LoyaltyStatusTest {

    private static final double DELTA = 0.001;

    // applyDiscount

    @Test
    void tenPercentDiscount() {
        LoyaltyStatus gold = new LoyaltyStatus("Gold", 0.10);
        assertEquals(90.00, gold.applyDiscount(100.00), DELTA);
    }

    @Test
    void twentyPercentDiscountOnOddTotal() {
        LoyaltyStatus platinum = new LoyaltyStatus("Platinum", 0.20);
        assertEquals(19.60, platinum.applyDiscount(24.50), DELTA);
    }

    @Test
    void noDiscountLeavesTotalUnchanged() {
        LoyaltyStatus none = new LoyaltyStatus("None", 0.0);
        assertEquals(100.00, none.applyDiscount(100.00), DELTA);
    }

    // getLevel

    @Test
    void getLevelReturnsTheLevel() {
        assertEquals("Gold", new LoyaltyStatus("Gold", 0.10).getLevel());
    }
}
