package decorator;

/** CONCRETE COMPONENT — a plain burger with a base price. */
public class Burger implements FoodItem {
    @Override
    public String getDescription() {
        // TODO: return "Burger"
        return "";
    }

    @Override
    public double getCost() {
        // TODO: return the base price, 5.99
        return 0;
    }
}
