package prac_11;

public class ArrayQueueADT {
    private int size = 0;
    private int max_size = 10;
    private int ptr = 0;
    private Object[] queue = new Object[max_size];
    public static void enqueue(Object object, ArrayQueueADT arrayQueueADT)
    {
        if (object != null)
        {
            if (arrayQueueADT.size != arrayQueueADT.max_size)
            {
                arrayQueueADT.queue[(arrayQueueADT.ptr + arrayQueueADT.size) % arrayQueueADT.max_size] = object;
                arrayQueueADT.size++;
            }
            else System.out.println("Error, queue is full");
        }
        else System.out.println("Error, added element can't be null");
    }

    public static Object element(ArrayQueueADT arrayQueueADT)
    {
        if (arrayQueueADT.size > 0)
            return arrayQueueADT.queue[arrayQueueADT.ptr];
        System.out.println("Queue is empty!");
        return null;
    }

    public static Object dequeue(ArrayQueueADT arrayQueueADT)
    {
        if (arrayQueueADT.size <= 0)
        {
            System.out.println("Queue is empty!");
            return null;
        }
        Object ans = arrayQueueADT.queue[arrayQueueADT.ptr];
        arrayQueueADT.size--;
        arrayQueueADT.ptr = (arrayQueueADT.ptr + 1) % arrayQueueADT.max_size;
        return ans;
    }

    public static int size(ArrayQueueADT arrayQueueADT)
    {
        return arrayQueueADT.size;
    }

    public static boolean isEmpty(ArrayQueueADT arrayQueueADT)
    {
        return arrayQueueADT.size == 0;
    }

    public static void clear(ArrayQueueADT arrayQueueADT)
    {
        arrayQueueADT.size = 0;
        arrayQueueADT.ptr = 0;
        arrayQueueADT.queue = new Object[arrayQueueADT.max_size];
    }
}
