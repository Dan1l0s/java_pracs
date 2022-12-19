package prac_11;

public class ArrayQueueTest {
    public static void main(String[] args) {
        System.out.println("ArrayQueue test:");
        ArrayQueue arrayQueue = new ArrayQueue();
        System.out.println("is queue empty? " + arrayQueue.isEmpty());
        arrayQueue.enqueue(1);
        arrayQueue.enqueue(2);
        arrayQueue.enqueue(3);
        arrayQueue.enqueue(4);
        arrayQueue.enqueue(5);
        System.out.println("is queue empty? " + arrayQueue.isEmpty());
        System.out.println("queue size: " + arrayQueue.size());
        System.out.println("queue next: "+ arrayQueue.element());
        System.out.println("dequeue element: " + arrayQueue.dequeue());
        System.out.println("queue size: " + arrayQueue.size());
        System.out.println("dequeue element: " + arrayQueue.dequeue());
        System.out.println("queue size: " + arrayQueue.size());
        arrayQueue.clear();
        System.out.println("cleared queue");
        System.out.println("queue size: " + arrayQueue.size());

        System.out.println("\n");

        System.out.println("ArrayQueueADT test:");
        ArrayQueueADT arrayQueueADT = new ArrayQueueADT();
        System.out.println("is queue empty? " + arrayQueueADT.isEmpty(arrayQueueADT));
        arrayQueueADT.enqueue(1, arrayQueueADT);
        arrayQueueADT.enqueue(2, arrayQueueADT);
        arrayQueueADT.enqueue(3, arrayQueueADT);
        arrayQueueADT.enqueue(4, arrayQueueADT);
        arrayQueueADT.enqueue(5, arrayQueueADT);
        System.out.println("is queue empty? " + arrayQueueADT.isEmpty(arrayQueueADT));
        System.out.println("queue size: " + arrayQueueADT.size(arrayQueueADT));
        System.out.println("queue next: "+ arrayQueueADT.element(arrayQueueADT));
        System.out.println("dequeue element: " + arrayQueueADT.dequeue(arrayQueueADT));
        System.out.println("queue size: " + arrayQueueADT.size(arrayQueueADT));
        System.out.println("dequeue element: " + arrayQueueADT.dequeue(arrayQueueADT));
        System.out.println("queue size: " + arrayQueueADT.size(arrayQueueADT));
        arrayQueueADT.clear(arrayQueueADT);
        System.out.println("cleared queue");
        System.out.println("queue size: " + arrayQueueADT.size(arrayQueueADT));

        System.out.println("\n");

        System.out.println("ArrayQueueModule test:");
        ArrayQueueModule arrayQueueModule = new ArrayQueueModule();
        System.out.println("is queue empty? " + arrayQueueModule.isEmpty());
        arrayQueueModule.enqueue(1);
        arrayQueueModule.enqueue(2);
        arrayQueueModule.enqueue(3);
        arrayQueueModule.enqueue(4);
        arrayQueueModule.enqueue(5);
        System.out.println("is queue empty? " + arrayQueueModule.isEmpty());
        System.out.println("queue size: " + arrayQueueModule.size());
        System.out.println("queue next: "+ arrayQueueModule.element());
        System.out.println("dequeue element: " + arrayQueueModule.dequeue());
        System.out.println("queue size: " + arrayQueueModule.size());
        System.out.println("dequeue element: " + arrayQueueModule.dequeue());
        System.out.println("queue size: " + arrayQueueModule.size());
        arrayQueueModule.clear();
        System.out.println("cleared queue");
        System.out.println("queue size: " + arrayQueueModule.size());
    }
}
