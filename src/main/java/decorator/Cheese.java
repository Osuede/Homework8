package decorator;

/** CONCRETE DECORATOR. */
public class Cheese extends ToppingDecorator {

    public Cheese(FoodItem item) {
        super(item);
    }

    @Override
    public String getDescription() {
        // TODO: wrapped item's description + ", Cheese"
        return "";
    }

    @Override
    public double getCost() {
        // TODO: wrapped item's cost + cheese price (0.75)
        return 0;
    }
}
