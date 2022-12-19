package prac_13;

public class TestComplex {
    public static void main(String[] args) {
        ComplexAbstractFactory factory=new ConcreteFactory();
        Complex complex0=factory.createComplex();
        System.out.println(complex0);
        Complex complex1=factory.createComplex(10,2);
        System.out.println(complex1);
        Complex complex2=factory.createComplex(3,5);
        System.out.println(complex2);

        System.out.println("("+ complex1 + ") + (" + complex2 + ") = " + complex1.sum(complex2));
        System.out.println("("+ complex1 + ") * (" + complex2 + ") = " + complex1.multiply(complex2));
        System.out.println("("+ complex1 + ") / (" + complex2 + ") = " + complex1.divide(complex2));
    }
}
