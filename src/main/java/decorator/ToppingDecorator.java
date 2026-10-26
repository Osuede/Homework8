package decorator;

/**
 * DECORATOR — a topping IS a FoodItem and also WRAPS a FoodItem.
 * That lets you stack toppings: new Cheese(new Ketchup(new Burger())).
 */
public abstract class ToppingDecorator implements FoodItem {
    protected FoodItem item;

    public ToppingDecorator(FoodItem item) {
        this.item = item;
    }
}
