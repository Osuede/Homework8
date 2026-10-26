package decorator;

/** CONCRETE DECORATOR. */
public class Ketchup extends ToppingDecorator {

    public Ketchup(FoodItem item) {
        super(item);
    }

    @Override
    public String getDescription() {
        // TODO: wrapped item's description + ", Ketchup"
        return "";
    }

    @Override
    public double getCost() {
        // TODO: wrapped item's cost + ketchup price (0.25)
        return 0;
    }
}
