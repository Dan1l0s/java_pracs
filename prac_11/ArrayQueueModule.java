package prac_11;

public class ArrayQueueModule {
    private static int size = 0;
    private static int max_size = 10;
    private static int ptr = 0;
    private static Object[] queue = new Object[max_size];

    public static void enqueue(Object object)
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

    public static Object element()
    {
        if (size > 0)
            return queue[ptr];
        System.out.println("Queue is empty!");
        return null;
    }

    public static Object dequeue()
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

    public static int size()
    {
        return size;
    }

    public static boolean isEmpty()
    {
        return size == 0;
    }

    public static void clear()
    {
        size = 0;
        ptr = 0;
        queue = new Object[max_size];
    }
}