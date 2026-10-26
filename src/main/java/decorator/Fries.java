package decorator;

/** CONCRETE COMPONENT — plain fries with a base price. */
public class Fries implements FoodItem {
    @Override
    public String getDescription() {
        return "Fries";
    }

    @Override
    public double getCost() {
        return 2.49;
    }
}
