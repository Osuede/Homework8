package decorator;

/** CONCRETE COMPONENT — a plain hot dog with a base price. */
public class HotDog implements FoodItem {
    @Override
    public String getDescription() {
        // TODO: return "Hot Dog"
        return "";
    }

    @Override
    public double getCost() {
        // TODO: return the base price, 3.49
        return 0;
    }
}
