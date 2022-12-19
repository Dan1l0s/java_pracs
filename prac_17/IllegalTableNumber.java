package prac_17;

public class IllegalTableNumber extends Exception{
    public IllegalTableNumber() {
        super("There is no free table with such a number!");
    }
}
