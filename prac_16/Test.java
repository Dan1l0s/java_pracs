package prac_16;

public class Test {
    public static void main(String[] args) {
        Order order = new Order();
        order.add(new Drink(100, "dish1", "desc1"));
        order.add(new Dish(500, "dish2", "desc2"));
        Item[] items = new Item[10];
        items = order.getArrayOrder();
        for (int i = 0; i < items.length; ++i)
        {
            System.out.println(items[i].getName() + " " + items[i].getCost());
        }
    }
}
