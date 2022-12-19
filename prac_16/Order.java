package prac_16;

import java.util.HashMap;

public class Order {

    final private int max_size = 100;
    private int curr_size = 0;
    private Item[] dishes = new Item[max_size];


    public boolean add(Item item)
    {
        if (curr_size == max_size) return false;
        dishes[curr_size] = item;
        curr_size++;
        return true;
    }

    boolean removeLast(String name)
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
    int removeAll(String name)
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

    int getQuantity()
    {
        return curr_size;
    }
    Item[] getArrayOrder()
    {
        Item[] tmp = new Item[curr_size];
        for (int i = 0; i < curr_size; ++i)
        {
            tmp[i] = dishes[i];
        }
        return tmp;
    }

    double getFullCost()
    {
        double sum = 0;
        for (int i = 0; i < curr_size; ++i)
        {
            sum+=dishes[i].getCost();
        }
        return sum;
    }
    int getSpecAmount(String name)
    {
        int cnt = 0;
        for (int i = 0; i < curr_size; ++i)
        {
            if (dishes[i].getName() == name) cnt++;
        }
        return cnt;
    }

    Item[] getUniqueArrayOrder() {
        HashMap<Integer, Item> map = new HashMap<>();
        int cnt = 0;

        for (int i = 0; i < curr_size; ++i)
        {
            if (!map.containsValue(dishes[i]))
            {
                map.put(cnt, dishes[i]);
            }
        }

        Item[] tmp = new Item[cnt];
        for (int i = 0; i < map.size(); ++i)
        {
            tmp[i] = map.get(i);
        }
        return tmp;

    }

    Item[] getSortedByCostArrayOrder()
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
