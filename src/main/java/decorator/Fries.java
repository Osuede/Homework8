package decorator;

/** CONCRETE COMPONENT — plain fries with a base price. */
public class Fries implements FoodItem {
    @Override
    public String getDescription() {
        // TODO: return "Fries"
        return "";
    }

    @Override
    public double getCost() {
        // TODO: return the base price, 2.49
        return 0;
    }
}
