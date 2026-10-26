package decorator;

/**
 * COMPONENT — the common interface for both plain food items and toppings.
 */
public interface FoodItem {
    String getDescription();
    double getCost();
}
