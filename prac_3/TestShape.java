package prac_3;

public class TestShape {
    public static void main(String[] args) {
        Shape shape1 = new Rectangle(10, 5, "blue", true);
        System.out.println(shape1);
        Shape shape2 = new Square(10, "red", true);
        System.out.println(shape2);
        Shape shape3 = new Circle(10, "green", false);
        System.out.println(shape3);
    }
}