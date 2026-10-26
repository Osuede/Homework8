package decorator;

import java.util.ArrayList;
import java.util.List;

/** A customer's order: a list of (possibly decorated) food items. */
public class Order {
    private List<FoodItem> items = new ArrayList<>();

    public void addItem(FoodItem item) {
        // TODO: add the item to the items list
    }

    public double getTotalCost() {
        // TODO: loop over items and sum getCost()
        return 0;
    }

    public void printOrder() {
        // TODO: print each item's description and cost, then the total
        //       (format money as String.format("%.2f", ...), e.g. "Total: $3.50")
    }
}
