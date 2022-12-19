package prac_27;

public class TestArray {
    public static void main(String[] args) {

        Array<Integer> intArray = new Array <Integer>(new Integer[]{1,2,3,4,5,6,7,8,9,0});
        intArray.print();

        Array<Double> doubleArray = new Array<Double>(new Double[]{1.2, 3.4, 5.6, 7.8, 9.0});
        doubleArray.print();

        Array<String> stringArray = new Array<String>(new String[]{"one", "two", "three", "four", "five"});
        stringArray.print();
    }
}
