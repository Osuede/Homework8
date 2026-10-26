package decorator;

/** CONCRETE DECORATOR. */
public class Onions extends ToppingDecorator {

    public Onions(FoodItem item) {
        super(item);
    }

    @Override
    public String getDescription() {
        // TODO: wrapped item's description + ", Onions"
        return "";
    }

    @Override
    public double getCost() {
        // TODO: wrapped item's cost + onions price (0.50)
        return 0;
    }
}
