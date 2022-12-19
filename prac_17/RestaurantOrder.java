package prac_17;

import java.util.HashMap;

public class RestaurantOrder implements Order{

    final private int max_size = 100;
    private int curr_size = 0;
    private Item[] dishes = new Item[100];


    @Override
    public boolean add(Item item)
    {
        if (curr_size == max_size) return false;
        dishes[curr_size] = item;
        curr_size++;
        return true;
    }

    @Override
    public boolean removeLast(String name)
    {
        for (int i = curr_size; i >= 0; --i)
        {
            if (dishes[i].getName() == name)
            {
                for (int j = i; j < curr_size - 1; ++j)
                {
                    dishes[j] = dishes[j+1];
                }
                curr_size--;
                return true;
            }
        }
        return false;
    }
    @Override
    public int removeAll(String name)
    {
        int cnt = 0;
        for (int i = curr_size; i >= 0; --i)
        {
            if (dishes[i].getName() == name)
            {
                for (int j = i; j < curr_size - 1; ++j)
                {
                    dishes[j] = dishes[j+1];
                }
                curr_size--;
                cnt++;
            }
        }
        return cnt;
    }

    @Override
    public int getQuantity()
    {
        return curr_size;
    }

    @Override
    public Item[] getOrder() {

        Item[] tmp = new Item[curr_size];
        for (int i = 0; i < curr_size; ++i)
        {
            tmp[i] = dishes[i];
        }
        return tmp;
    }

    public double getFullCost()
    {
        double sum = 0;
        for (int i = 0; i < curr_size; ++i)
        {
            sum+=dishes[i].getCost();
        }
        return sum;
    }
    public int getSpecAmount(String name)
    {
        int cnt = 0;
        for (int i = 0; i < curr_size; ++i)
        {
            if (dishes[i].getName() == name) cnt++;
        }
        return cnt;
    }

    public String[] getUniqueOrder() {
        HashMap<Integer, Item> map = new HashMap<>();
        int cnt = 0;

        for (int i = 0; i < curr_size; ++i)
        {
            if (!map.containsValue(dishes[i]))
            {
                map.put(cnt, dishes[i]);
            }
        }

        String[] tmp = new String[cnt];
        for (int i = 0; i < map.size(); ++i)
        {
            tmp[i] = map.get(i).getName();
        }
        return tmp;

    }

    public Item[] getSortedByCostOrder()
    {
        Item[] tmp = new Item[curr_size];
        Item tmp1;
        for (int i = 0; i < curr_size; ++i)
        {
            tmp[i] = dishes[i];
        }

        for (int i = 0; i < curr_size; ++i)
        {
            for (int j = 0; j < curr_size - 1; ++j)
            {
                if (tmp[j].getCost() > tmp[j + 1].getCost())
                {
                    tmp1 = tmp[j];
                    tmp[j] = tmp[j+1];
                    tmp[j+1] = tmp1;
                }
            }
        }

        return tmp;
    }
}
