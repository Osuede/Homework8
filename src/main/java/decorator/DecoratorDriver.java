package decorator;

public class DecoratorDriver {
    public static void main(String[] args) {
        // 1) Create food items and add toppings by wrapping them
        FoodItem burger = new Cheese(new Ketchup(new Burger()));
        FoodItem fries = new Ketchup(new Fries());
        FoodItem hotDog = new Onions(new Cheese(new HotDog()));

        // 2) Put them in an order
        Order order = new Order();
        order.addItem(burger);
        order.addItem(fries);
        order.addItem(hotDog);

        // 3) Print the order and its total
        System.out.println("===== Customer Order =====");
        order.printOrder();

        // 4) Apply a loyalty discount based on the customer's status
        double total = order.getTotalCost();
        LoyaltyStatus[] statuses = {
            new LoyaltyStatus("None", 0.00),
            new LoyaltyStatus("Silver", 0.05),
            new LoyaltyStatus("Gold", 0.10)
        };

        System.out.println();
        System.out.println("===== Total After Loyalty Discount =====");
        for (LoyaltyStatus status : statuses) {
            System.out.println(status.getLevel() + " member pays: $"
                    + String.format("%.2f", status.applyDiscount(total)));
        }
    }
}
