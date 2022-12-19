package prac_11;

public class ArrayQueue {
    private int size = 0;
    private int max_size = 10;
    private int ptr = 0;
    private Object[] queue = new Object[max_size];

    public void enqueue(Object object)
    {
        if (object != null)
        {
            if (size != max_size)
            {
                queue[(ptr+size)%max_size] = object;
                size++;
            }
            else System.out.println("Error, queue is full");
        }
        else System.out.println("Error, added element can't be null");
    }

    public Object element()
    {
        if (size > 0)
            return queue[ptr];
        System.out.println("Queue is empty!");
        return null;
    }

    public Object dequeue()
    {
        if (size <= 0)
        {
            System.out.println("Queue is empty!");
            return null;
        }
        Object ans = queue[ptr];
        size--;
        ptr = (ptr+1)%max_size;
        return ans;
    }

    public int size()
    {
        return size;
    }

    public boolean isEmpty()
    {
        return size == 0;
    }

    public void clear()
    {
        size = 0;
        ptr = 0;
        queue = new Object[max_size];
    }
}
