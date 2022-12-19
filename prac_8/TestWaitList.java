package prac_8;

public class TestWaitList {
    public static void main(String[] args) {
        WaitList<Integer> waitList = new WaitList<Integer>();
        waitList.add(1);
        waitList.add(2);
        waitList.add(3);
        waitList.add(9);
        System.out.println(waitList);
        System.out.println(waitList.remove());
        System.out.println(waitList);
        System.out.println("contains 2? "+waitList.contains(2));
        System.out.println("contains 4? "+waitList.contains(4));
        System.out.println("is empty? "+waitList.isEmpty());
        waitList.remove();
        waitList.remove();
        waitList.remove();
        System.out.println("is empty? "+waitList.isEmpty());

        BoundedWaitList<Integer> bounded = new BoundedWaitList<Integer>(5);
        bounded.add(1);
        bounded.add(2);
        bounded.add(3);
        bounded.add(4);
        bounded.add(5);
        System.out.println(bounded);
        System.out.println("capacity: " + bounded.getCapacity());
        bounded.remove();
        System.out.println(bounded);

        UnfairWaitList<Integer> unfair = new UnfairWaitList<Integer>();
        unfair.add(1);
        unfair.add(2);
        unfair.add(3);
        unfair.add(4);
        System.out.println(unfair);
        unfair.moveToBack(2);
        System.out.println(unfair);
    }
}
