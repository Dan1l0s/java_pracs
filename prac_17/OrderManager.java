package prac_17;

public class OrderManager {
    private RestaurantOrder[] orders;
    final private int max_size = 100;
    private int curr_size = 0;

    OrderManager()
    {
        orders = new RestaurantOrder[max_size];
    }

    OrderManager(RestaurantOrder[] orders)
    {
        orders = new RestaurantOrder[max_size];
        for (int i = 0; i < orders.length; ++i)
        {
            this.orders[i] = orders[i];
            curr_size++;
        }
    }

    public boolean add(RestaurantOrder order) {
        if (curr_size == max_size) return false;
        orders[curr_size] = order;
        curr_size++;
        return true;
    }

    public boolean remove(int id)
    {
        if (id >= curr_size)
            return false;
        for (int i = id; i < curr_size - 1; ++i)
        {
            orders[i] = orders[i+1];
        }
        curr_size--;
        return true;
    }

    public void removeAll()
    {
        orders = new RestaurantOrder[max_size];
        curr_size = 0;
    }

    public int getSize()
    {
        return curr_size;
    }
}
