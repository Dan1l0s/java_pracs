package prac_20;

public class TestDish {
    public static void main(String[] args) {
        Cup cup = new Cup("black", 5);
        cup.use();
        cup.become_broken();
        cup.use();

        Pan pan = new Pan("grey", 15 ,true);
        pan.use();
        pan.wash();

        Plate plate = new Plate("white", 10, false);
        plate.use();
        plate.become_broken();
        plate.wash();
    }
}