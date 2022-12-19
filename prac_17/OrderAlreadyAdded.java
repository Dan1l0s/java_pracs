package prac_17;

public class OrderAlreadyAdded extends Exception{
    public OrderAlreadyAdded() {
        super("This order has already been added!");
    }
}
