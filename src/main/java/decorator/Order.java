package decorator;

import java.util.ArrayList;
import java.util.List;

/** A customer's order: a list of (possibly decorated) food items. */
public class Order {
    private List<FoodItem> items = new ArrayList<>();

    public void addItem(FoodItem item) {
        items.add(item);
    }

    public double getTotalCost() {
        double total = 0;
        for (FoodItem item : items) {
            total += item.getCost();
        }
        return total;
    }

    public void printOrder() {
        for (FoodItem item : items) {
            System.out.println(item.getDescription() + " - $" + String.format("%.2f", item.getCost()));
        }
        System.out.println("Total: $" + String.format("%.2f", getTotalCost()));
    }
}
