package decorator;

/**
 * Test helper: a plain food item with a fixed name and price.
 * Lets topping tests check the topping alone, without depending on Burger/Fries/HotDog.
 */
class FakeFoodItem implements FoodItem {
    private final String description;
    private final double cost;

    FakeFoodItem(String description, double cost) {
        this.description = description;
        this.cost = cost;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double getCost() {
        return cost;
    }
}
