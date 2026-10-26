package decorator;

/**
 * The customer's loyalty status and the discount it gives.
 * Example tiers: "None" = 0%, "Silver" = 5%, "Gold" = 10%.
 */
public class LoyaltyStatus {
    private String level;
    private double discountRate; // 0.10 means 10% off

    public LoyaltyStatus(String level, double discountRate) {
        this.level = level;
        this.discountRate = discountRate;
    }

    public double applyDiscount(double total) {
        return total * (1 - discountRate);
    }

    public String getLevel() {
        return level;
    }
}
