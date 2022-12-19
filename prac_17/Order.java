package prac_17;

public interface Order {
    boolean add(Item item);
    boolean removeLast(String name);
    int removeAll(String name);

    int getQuantity();
    Item[] getOrder();
    double getFullCost();

    int getSpecAmount(String name);
    String[] getUniqueOrder();
    Item[] getSortedByCostOrder();


}
