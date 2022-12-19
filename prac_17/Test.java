package prac_17;

public class Test {
    public static void main(String[] args) {
        RestaurantOrder order1 = new RestaurantOrder();
        order1.add(new Dish("Pepperoni Pizza", "Delicious pizza", 650));
        order1.add(new Dish( "Beef Burger", "Juicy medium-well burger", 500));
        order1.add(new Dish( "Chicken wings", "KFC style", 360));
        order1.add(new Dish("BBQ burger", "bbq.", 360));
        System.out.println(order1.getFullCost());
        for (Item i: order1.getOrder())
            System.out.println(i.getName() + " " + i.getDesc() + " " + i.getCost());
    }
}
