package decorator;

/** CONCRETE COMPONENT — a plain burger with a base price. */
public class Burger implements FoodItem {
    @Override
    public String getDescription() {
        return "Burger";
    }

    @Override
    public double getCost() {
        return 5.99;
    }
}
